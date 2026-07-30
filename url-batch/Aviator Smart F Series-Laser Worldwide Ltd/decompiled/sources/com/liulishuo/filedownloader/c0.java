package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.c;
import java.util.List;

/* loaded from: classes4.dex */
public class c0 implements c.b {
    private boolean transmitMessage(List<a.b> list, MessageSnapshot messageSnapshot) {
        boolean updateKeepAhead;
        if (list.size() > 1 && messageSnapshot.getStatus() == -3) {
            for (a.b bVar : list) {
                synchronized (bVar.getPauseLock()) {
                    try {
                        if (bVar.getMessageHandler().updateMoreLikelyCompleted(messageSnapshot)) {
                            com.liulishuo.filedownloader.util.d.d(this, "updateMoreLikelyCompleted", new Object[0]);
                            return true;
                        }
                    } finally {
                    }
                }
            }
        }
        for (a.b bVar2 : list) {
            synchronized (bVar2.getPauseLock()) {
                try {
                    if (bVar2.getMessageHandler().updateKeepFlow(messageSnapshot)) {
                        com.liulishuo.filedownloader.util.d.d(this, "updateKeepFlow", new Object[0]);
                        return true;
                    }
                } finally {
                }
            }
        }
        if (-4 == messageSnapshot.getStatus()) {
            for (a.b bVar3 : list) {
                synchronized (bVar3.getPauseLock()) {
                    try {
                        if (bVar3.getMessageHandler().updateSameFilePathTaskRunning(messageSnapshot)) {
                            com.liulishuo.filedownloader.util.d.d(this, "updateSampleFilePathTaskRunning", new Object[0]);
                            return true;
                        }
                    } finally {
                    }
                }
            }
        }
        if (list.size() != 1) {
            return false;
        }
        a.b bVar4 = list.get(0);
        synchronized (bVar4.getPauseLock()) {
            com.liulishuo.filedownloader.util.d.d(this, "updateKeepAhead", new Object[0]);
            updateKeepAhead = bVar4.getMessageHandler().updateKeepAhead(messageSnapshot);
        }
        return updateKeepAhead;
    }

    @Override // com.liulishuo.filedownloader.message.c.b
    public void receive(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.getId()).intern()) {
            try {
                List<a.b> receiveServiceTaskList = j.getImpl().getReceiveServiceTaskList(messageSnapshot.getId());
                if (receiveServiceTaskList.size() > 0) {
                    a origin = receiveServiceTaskList.get(0).getOrigin();
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                        com.liulishuo.filedownloader.util.d.d(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(origin.getStatus()), Byte.valueOf(messageSnapshot.getStatus()), Integer.valueOf(receiveServiceTaskList.size()));
                    }
                    if (!transmitMessage(receiveServiceTaskList, messageSnapshot)) {
                        StringBuilder sb = new StringBuilder("The event isn't consumed, id:" + messageSnapshot.getId() + " status:" + ((int) messageSnapshot.getStatus()) + " task-count:" + receiveServiceTaskList.size());
                        for (a.b bVar : receiveServiceTaskList) {
                            sb.append(" | ");
                            sb.append((int) bVar.getOrigin().getStatus());
                        }
                        com.liulishuo.filedownloader.util.d.i(this, sb.toString(), new Object[0]);
                    }
                } else {
                    com.liulishuo.filedownloader.util.d.i(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.getStatus()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
