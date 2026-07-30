package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class i {
    private static final List<i> pendingPostPool = new ArrayList();
    Object event;
    i next;
    p subscription;

    private i(Object obj, p pVar) {
        this.event = obj;
        this.subscription = pVar;
    }

    static i obtainPendingPost(p pVar, Object obj) {
        List<i> list = pendingPostPool;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new i(obj, pVar);
                }
                i remove = list.remove(size - 1);
                remove.event = obj;
                remove.subscription = pVar;
                remove.next = null;
                return remove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void releasePendingPost(i iVar) {
        iVar.event = null;
        iVar.subscription = null;
        iVar.next = null;
        List<i> list = pendingPostPool;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
