package com.baidu.platform.comjni.engine;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MessageProxy {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<Handler>> f10563a = new SparseArray<>();

    public static void destroy() {
        int size = f10563a.size();
        for (int i8 = 0; i8 < size; i8++) {
            SparseArray<List<Handler>> sparseArray = f10563a;
            List<Handler> list = sparseArray.get(sparseArray.keyAt(i8));
            if (list != null) {
                list.clear();
            }
        }
        f10563a.clear();
    }

    public static void dispatchMessage(int i8, int i9, int i10, long j8) {
        SparseArray<List<Handler>> sparseArray = f10563a;
        synchronized (sparseArray) {
            try {
                List<Handler> list = sparseArray.get(i8);
                if (list != null && !list.isEmpty()) {
                    for (Handler handler : list) {
                        Message obtain = Message.obtain(handler, i8, i9, i10, Long.valueOf(j8));
                        if (i8 == 39 && (i9 == 0 || i9 == 1)) {
                            handler.handleMessage(obtain);
                        } else {
                            obtain.sendToTarget();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void registerMessageHandler(int i8, Handler handler) {
        if (handler == null) {
            return;
        }
        SparseArray<List<Handler>> sparseArray = f10563a;
        synchronized (sparseArray) {
            try {
                List<Handler> list = sparseArray.get(i8);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(handler);
                    sparseArray.put(i8, arrayList);
                } else if (!list.contains(handler)) {
                    list.add(handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void unRegisterMessageHandler(int i8, Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            SparseArray<List<Handler>> sparseArray = f10563a;
            synchronized (sparseArray) {
                try {
                    List<Handler> list = sparseArray.get(i8);
                    if (list != null) {
                        list.remove(handler);
                    }
                } finally {
                }
            }
        }
    }
}
