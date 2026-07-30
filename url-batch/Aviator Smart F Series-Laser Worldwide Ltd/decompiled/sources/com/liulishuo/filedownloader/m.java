package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.z;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
class m implements v {
    private boolean mIsDiscard = false;
    private a.d mLifeCycleCallback;
    private a.b mTask;
    private Queue<MessageSnapshot> parcelQueue;

    m(a.b bVar, a.d dVar) {
        init(bVar, dVar);
    }

    private void init(a.b bVar, a.d dVar) {
        this.mTask = bVar;
        this.mLifeCycleCallback = dVar;
        this.parcelQueue = new LinkedBlockingQueue();
    }

    private void inspectAndHandleOverStatus(int i8) {
        if (com.liulishuo.filedownloader.model.b.isOver(i8)) {
            if (!this.parcelQueue.isEmpty()) {
                MessageSnapshot peek = this.parcelQueue.peek();
                com.liulishuo.filedownloader.util.d.w(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(peek.getId()), Integer.valueOf(this.parcelQueue.size()), Byte.valueOf(peek.getStatus()));
            }
            this.mTask = null;
        }
    }

    private void process(MessageSnapshot messageSnapshot) {
        a.b bVar = this.mTask;
        if (bVar == null) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.getStatus()));
            }
        } else {
            if (!this.mIsDiscard && bVar.getOrigin().getListener() != null) {
                this.parcelQueue.offer(messageSnapshot);
                l.getImpl().requestEnqueue(this);
                return;
            }
            if ((n.isValid() || this.mTask.isContainFinishListener()) && messageSnapshot.getStatus() == 4) {
                this.mLifeCycleCallback.onOver();
            }
            inspectAndHandleOverStatus(messageSnapshot.getStatus());
        }
    }

    @Override // com.liulishuo.filedownloader.v
    public void discard() {
        this.mIsDiscard = true;
    }

    @Override // com.liulishuo.filedownloader.v
    public boolean handoverDirectly() {
        return this.mTask.getOrigin().isSyncCallback();
    }

    @Override // com.liulishuo.filedownloader.v
    public void handoverMessage() {
        if (this.mIsDiscard) {
            return;
        }
        com.liulishuo.filedownloader.message.b bVar = (MessageSnapshot) this.parcelQueue.poll();
        byte status = bVar.getStatus();
        a.b bVar2 = this.mTask;
        if (bVar2 == null) {
            throw new IllegalArgumentException(com.liulishuo.filedownloader.util.f.formatString("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(status), Integer.valueOf(this.parcelQueue.size())));
        }
        a origin = bVar2.getOrigin();
        k listener = origin.getListener();
        z.a messageHandler = bVar2.getMessageHandler();
        inspectAndHandleOverStatus(status);
        if (listener == null || listener.isInvalid()) {
            return;
        }
        if (status == 4) {
            try {
                listener.blockComplete(origin);
                notifyCompleted(((BlockCompleteMessage) bVar).transmitToCompleted());
                return;
            } catch (Throwable th) {
                notifyError(messageHandler.prepareErrorMessage(th));
                return;
            }
        }
        g gVar = listener instanceof g ? (g) listener : null;
        if (status == -4) {
            listener.warn(origin);
            return;
        }
        if (status == -3) {
            listener.completed(origin);
            return;
        }
        if (status == -2) {
            if (gVar != null) {
                gVar.paused(origin, bVar.getLargeSofarBytes(), bVar.getLargeTotalBytes());
                return;
            } else {
                listener.paused(origin, bVar.getSmallSofarBytes(), bVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == -1) {
            listener.error(origin, bVar.getThrowable());
            return;
        }
        if (status == 1) {
            if (gVar != null) {
                gVar.pending(origin, bVar.getLargeSofarBytes(), bVar.getLargeTotalBytes());
                return;
            } else {
                listener.pending(origin, bVar.getSmallSofarBytes(), bVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == 2) {
            if (gVar != null) {
                gVar.connected(origin, bVar.getEtag(), bVar.isResuming(), origin.getLargeFileSoFarBytes(), bVar.getLargeTotalBytes());
                return;
            } else {
                listener.connected(origin, bVar.getEtag(), bVar.isResuming(), origin.getSmallFileSoFarBytes(), bVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == 3) {
            if (gVar != null) {
                gVar.progress(origin, bVar.getLargeSofarBytes(), origin.getLargeFileTotalBytes());
                return;
            } else {
                listener.progress(origin, bVar.getSmallSofarBytes(), origin.getSmallFileTotalBytes());
                return;
            }
        }
        if (status != 5) {
            if (status != 6) {
                return;
            }
            listener.started(origin);
        } else if (gVar != null) {
            gVar.retry(origin, bVar.getThrowable(), bVar.getRetryingTimes(), bVar.getLargeSofarBytes());
        } else {
            listener.retry(origin, bVar.getThrowable(), bVar.getRetryingTimes(), bVar.getSmallSofarBytes());
        }
    }

    @Override // com.liulishuo.filedownloader.v
    public boolean isBlockingCompleted() {
        return this.parcelQueue.peek().getStatus() == 4;
    }

    @Override // com.liulishuo.filedownloader.v
    public boolean notifyBegin() {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify begin %s", this.mTask);
        }
        if (this.mTask == null) {
            com.liulishuo.filedownloader.util.d.w(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.parcelQueue.size()));
            return false;
        }
        this.mLifeCycleCallback.onBegin();
        return true;
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyBlockComplete(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify block completed %s %s", this.mTask, Thread.currentThread().getName());
        }
        this.mLifeCycleCallback.onIng();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyCompleted(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify completed %s", this.mTask);
        }
        this.mLifeCycleCallback.onOver();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyConnected(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify connected %s", this.mTask);
        }
        this.mLifeCycleCallback.onIng();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyError(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            a.b bVar = this.mTask;
            com.liulishuo.filedownloader.util.d.d(this, "notify error %s %s", bVar, bVar.getOrigin().getErrorCause());
        }
        this.mLifeCycleCallback.onOver();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyPaused(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify paused %s", this.mTask);
        }
        this.mLifeCycleCallback.onOver();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyPending(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify pending %s", this.mTask);
        }
        this.mLifeCycleCallback.onIng();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyProgress(MessageSnapshot messageSnapshot) {
        a origin = this.mTask.getOrigin();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify progress %s %d %d", origin, Long.valueOf(origin.getLargeFileSoFarBytes()), Long.valueOf(origin.getLargeFileTotalBytes()));
        }
        if (origin.getCallbackProgressTimes() > 0) {
            this.mLifeCycleCallback.onIng();
            process(messageSnapshot);
        } else if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify progress but client not request notify %s", this.mTask);
        }
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyRetry(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            a origin = this.mTask.getOrigin();
            com.liulishuo.filedownloader.util.d.d(this, "notify retry %s %d %d %s", this.mTask, Integer.valueOf(origin.getAutoRetryTimes()), Integer.valueOf(origin.getRetryingTimes()), origin.getErrorCause());
        }
        this.mLifeCycleCallback.onIng();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyStarted(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify started %s", this.mTask);
        }
        this.mLifeCycleCallback.onIng();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void notifyWarn(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "notify warn %s", this.mTask);
        }
        this.mLifeCycleCallback.onOver();
        process(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.v
    public void reAppointment(a.b bVar, a.d dVar) {
        if (this.mTask != null) {
            throw new IllegalStateException(com.liulishuo.filedownloader.util.f.formatString("the messenger is working, can't re-appointment for %s", bVar));
        }
        init(bVar, dVar);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        a.b bVar = this.mTask;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.getOrigin().getId());
        objArr[1] = super.toString();
        return com.liulishuo.filedownloader.util.f.formatString("%d:%s", objArr);
    }
}
