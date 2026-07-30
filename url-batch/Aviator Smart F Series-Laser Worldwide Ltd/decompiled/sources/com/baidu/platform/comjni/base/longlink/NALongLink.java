package com.baidu.platform.comjni.base.longlink;

import android.util.Log;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.longlink.ELongLinkStatus;
import com.baidu.platform.comapi.longlink.LongLinkDataCallback;
import com.baidu.platform.comapi.longlink.LongLinkFileData;
import com.baidu.platform.comjni.JNIBaseApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class NALongLink extends JNIBaseApi {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Integer, LinkedList<Object>> f10557a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ELongLinkStatus[] f10558b = {ELongLinkStatus.OK, ELongLinkStatus.SendFormatError, ELongLinkStatus.SendUnRegistered, ELongLinkStatus.SendLimited, ELongLinkStatus.SendDataLenLimited, ELongLinkStatus.SendInvalidReqID, ELongLinkStatus.ResultConnectError, ELongLinkStatus.ResultSendError, ELongLinkStatus.ResultTimeout, ELongLinkStatus.ResultServerError, ELongLinkStatus.CloudStop, ELongLinkStatus.CloudRestart};

    public static long create() {
        return nativeCreate();
    }

    public static boolean init(long j8, String str, String str2) {
        return nativeInit(j8, str, str2);
    }

    private static native long nativeCreate();

    private static native boolean nativeInit(long j8, String str, String str2);

    private static native boolean nativeRegister(long j8, int i8);

    private static native int nativeRelease(long j8);

    private static native int nativeSendData(long j8, int i8, int i9, byte[] bArr);

    private static native int nativeSendFileData(long j8, int i8, int i9, String str, ArrayList<LongLinkFileData> arrayList);

    private static native boolean nativeStart(long j8);

    private static native boolean nativeStop(long j8);

    private static native boolean nativeUnRegister(long j8, int i8);

    public static boolean onJNILongLinkDataCallback(int i8, int i9, int i10, byte[] bArr, boolean z7) {
        LinkedList linkedList;
        Log.e("JNILongLink", "onJNILongLinkDataCallback:" + i8 + " status:" + i9 + " reqId:" + i10 + " isPush:" + z7);
        if (i9 < 0 || i9 >= f10558b.length) {
            Log.e("JNILongLink", "invalid status = " + i9);
            if (JNIInitializer.isDebug()) {
                throw new IndexOutOfBoundsException();
            }
            return false;
        }
        if (bArr == null || bArr.length <= 0) {
            bArr = new byte[0];
        }
        synchronized (NALongLink.class) {
            try {
                LinkedList<Object> linkedList2 = f10557a.get(Integer.valueOf(i8));
                linkedList = linkedList2 != null ? new LinkedList(linkedList2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            return true;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                try {
                    if (next instanceof LongLinkDataCallback) {
                        ELongLinkStatus eLongLinkStatus = f10558b[i9];
                        eLongLinkStatus.setRequestId(i10);
                        String name = next.getClass().getName();
                        Log.d("JNILongLink", "className = " + name);
                        ((LongLinkDataCallback) next).onReceiveData(eLongLinkStatus, i10, bArr, z7);
                        Log.d("JNILongLink", "className = " + name + "done");
                    }
                } catch (Exception e8) {
                    Log.e("JNILongLink", "className = " + next.getClass().getName() + ",exception = " + e8.toString());
                    if (JNIInitializer.isDebug()) {
                        throw e8;
                    }
                }
            }
        }
        return true;
    }

    public static boolean register(long j8, int i8, Object obj) {
        boolean z7;
        if (obj != null) {
            Log.e("JNILongLink", "register moduleId = " + i8 + ", callback = " + obj.getClass().getName());
        } else {
            Log.e("JNILongLink", "register moduleId = " + i8 + ", callback = " + obj);
        }
        synchronized (NALongLink.class) {
            try {
                LinkedList<Object> linkedList = f10557a.get(Integer.valueOf(i8));
                if (linkedList == null) {
                    LinkedList<Object> linkedList2 = new LinkedList<>();
                    linkedList2.add(obj);
                    f10557a.put(Integer.valueOf(i8), linkedList2);
                    z7 = true;
                } else {
                    z7 = false;
                    if (!linkedList.contains(obj)) {
                        linkedList.add(obj);
                        f10557a.put(Integer.valueOf(i8), linkedList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            return nativeRegister(j8, i8);
        }
        return true;
    }

    public static int release(long j8) {
        return nativeRelease(j8);
    }

    public static int sendData(long j8, int i8, int i9, byte[] bArr) {
        return nativeSendData(j8, i8, i9, bArr);
    }

    public static int sendFileData(long j8, int i8, int i9, String str, ArrayList<LongLinkFileData> arrayList) {
        return nativeSendFileData(j8, i8, i9, str, arrayList);
    }

    public static boolean start(long j8) {
        return nativeStart(j8);
    }

    public static boolean stop(long j8) {
        return nativeStop(j8);
    }

    public static boolean unRegister(long j8, int i8, Object obj) {
        LinkedList<Object> linkedList;
        if (obj != null) {
            Log.e("JNILongLink", "unegister moduleId = " + i8 + ", callback = " + obj.getClass().getName());
        } else {
            Log.e("JNILongLink", "unregister moduleId = " + i8 + ", callback = " + obj);
        }
        synchronized (NALongLink.class) {
            try {
                linkedList = f10557a.get(Integer.valueOf(i8));
                if (linkedList != null) {
                    if (obj != null) {
                        linkedList.remove(obj);
                    }
                    if (linkedList.isEmpty()) {
                        f10557a.remove(Integer.valueOf(i8));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (linkedList == null) {
            return false;
        }
        if (linkedList.isEmpty()) {
            return nativeUnRegister(j8, i8);
        }
        return true;
    }
}
