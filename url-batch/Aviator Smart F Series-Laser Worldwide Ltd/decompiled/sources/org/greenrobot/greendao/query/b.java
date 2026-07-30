package org.greenrobot.greendao.query;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class b {
    final org.greenrobot.greendao.a dao;
    final String[] initialValues;
    final Map<Long, WeakReference<a>> queriesForThreads = new HashMap();
    final String sql;

    b(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        this.dao = aVar;
        this.sql = str;
        this.initialValues = strArr;
    }

    protected abstract a createQuery();

    a forCurrentThread(a aVar) {
        if (Thread.currentThread() != aVar.ownerThread) {
            return forCurrentThread();
        }
        String[] strArr = this.initialValues;
        System.arraycopy(strArr, 0, aVar.parameters, 0, strArr.length);
        return aVar;
    }

    void gc() {
        synchronized (this.queriesForThreads) {
            try {
                Iterator<Map.Entry<Long, WeakReference<a>>> it = this.queriesForThreads.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().get() == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    a forCurrentThread() {
        a aVar;
        long id = Thread.currentThread().getId();
        synchronized (this.queriesForThreads) {
            try {
                WeakReference<a> weakReference = this.queriesForThreads.get(Long.valueOf(id));
                aVar = weakReference != null ? weakReference.get() : null;
                if (aVar == null) {
                    gc();
                    aVar = createQuery();
                    this.queriesForThreads.put(Long.valueOf(id), new WeakReference<>(aVar));
                } else {
                    String[] strArr = this.initialValues;
                    System.arraycopy(strArr, 0, aVar.parameters, 0, strArr.length);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
