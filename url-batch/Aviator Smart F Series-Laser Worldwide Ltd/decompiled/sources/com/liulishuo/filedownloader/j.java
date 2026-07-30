package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class j {
    private final ArrayList<a.b> mList;

    private static final class b {
        private static final j INSTANCE = new j();

        private b() {
        }
    }

    public static j getImpl() {
        return b.INSTANCE;
    }

    void add(a.b bVar) {
        if (!bVar.getOrigin().isAttached()) {
            bVar.setAttachKeyDefault();
        }
        if (bVar.getMessageHandler().getMessenger().notifyBegin()) {
            addUnchecked(bVar);
        }
    }

    void addUnchecked(a.b bVar) {
        if (bVar.isMarkedAdded2List()) {
            return;
        }
        synchronized (this.mList) {
            try {
                if (this.mList.contains(bVar)) {
                    com.liulishuo.filedownloader.util.d.w(this, "already has %s", bVar);
                } else {
                    bVar.markAdded2List();
                    this.mList.add(bVar);
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                        com.liulishuo.filedownloader.util.d.v(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.getOrigin().getStatus()), Integer.valueOf(this.mList.size()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    List<a.b> assembleTasksToStart(int i8, k kVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.getOrigin().getListener() == kVar && !next.getOrigin().isAttached()) {
                        next.setAttachKeyByQueue(i8);
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    List<a.b> copy(k kVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.is(kVar)) {
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    int count(int i8) {
        int i9;
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (it.next().is(i8)) {
                        i9++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    void divertAndIgnoreDuplicate(List<a.b> list) {
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (!list.contains(next)) {
                        list.add(next);
                    }
                }
                this.mList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a.b get(int i8) {
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.is(i8)) {
                        return next;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    List<a.b> getDownloadingList(int i8) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.is(i8) && !next.isOver()) {
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    List<a.b> getReceiveServiceTaskList(int i8) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            try {
                Iterator<a.b> it = this.mList.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.is(i8) && !next.isOver() && (status = next.getOrigin().getStatus()) != 0 && status != 10) {
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    boolean isEmpty() {
        return this.mList.isEmpty();
    }

    boolean isNotContains(a.b bVar) {
        return this.mList.isEmpty() || !this.mList.contains(bVar);
    }

    public boolean remove(a.b bVar, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte status = messageSnapshot.getStatus();
        synchronized (this.mList) {
            try {
                remove = this.mList.remove(bVar);
                if (remove && this.mList.size() == 0 && o.getImpl().isRunServiceForeground()) {
                    s.getImpl().stopForeground(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG && this.mList.size() == 0) {
            com.liulishuo.filedownloader.util.d.v(this, "remove %s left %d %d", bVar, Byte.valueOf(status), Integer.valueOf(this.mList.size()));
        }
        if (remove) {
            v messenger = bVar.getMessageHandler().getMessenger();
            if (status == -4) {
                messenger.notifyWarn(messageSnapshot);
            } else if (status == -3) {
                messenger.notifyBlockComplete(com.liulishuo.filedownloader.message.d.takeBlockCompleted(messageSnapshot));
            } else if (status == -2) {
                messenger.notifyPaused(messageSnapshot);
            } else if (status == -1) {
                messenger.notifyError(messageSnapshot);
            }
        } else {
            com.liulishuo.filedownloader.util.d.e(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(status));
        }
        return remove;
    }

    int size() {
        return this.mList.size();
    }

    private j() {
        this.mList = new ArrayList<>();
    }

    a.b[] copy() {
        a.b[] bVarArr;
        synchronized (this.mList) {
            bVarArr = (a.b[]) this.mList.toArray(new a.b[this.mList.size()]);
        }
        return bVarArr;
    }
}
