package com.drake.net;

import android.util.Log;
import com.drake.net.interfaces.c;
import com.drake.net.request.Method;
import f6.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.Request;
import r4.e;
import r4.f;
import y5.b;

/* loaded from: classes3.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public static final boolean addDownloadListener(Object id, c progressListener) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(progressListener, "progressListener");
        Request requestById = getRequestById(id);
        if (requestById == null) {
            return false;
        }
        e.downloadListeners(requestById).add(progressListener);
        return true;
    }

    public static final boolean addUploadListener(Object id, c progressListener) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(progressListener, "progressListener");
        Request requestById = getRequestById(id);
        if (requestById == null) {
            return false;
        }
        e.uploadListeners(requestById).add(progressListener);
        return true;
    }

    public static final void cancelAll() {
        NetConfig netConfig = NetConfig.INSTANCE;
        netConfig.getOkHttpClient().dispatcher().cancelAll();
        Iterator<WeakReference<Call>> it = netConfig.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call != null) {
                call.cancel();
            }
            it.remove();
        }
    }

    public static final boolean cancelGroup(Object obj) {
        boolean z7 = false;
        if (obj == null) {
            return false;
        }
        Iterator<WeakReference<Call>> it = NetConfig.INSTANCE.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call == null) {
                it.remove();
            } else if (s.areEqual(obj, e.getGroup(call.request()))) {
                call.cancel();
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static final boolean cancelId(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<WeakReference<Call>> it = NetConfig.INSTANCE.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call == null) {
                it.remove();
            } else if (s.areEqual(obj, e.getId(call.request()))) {
                call.cancel();
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void debug(Object message) {
        String str;
        String str2;
        s.checkNotNullParameter(message, "message");
        NetConfig netConfig = NetConfig.INSTANCE;
        if (netConfig.getDebug()) {
            if (message instanceof Throwable) {
                str2 = b.stackTraceToString((Throwable) message);
            } else {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                s.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.getOrNull(stackTrace, 1);
                if (stackTraceElement != null) {
                    str = " (" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
                }
                str = "";
                str2 = message + str;
            }
            Log.d(netConfig.getTAG(), str2);
        }
    }

    public static final r4.b delete(String path) {
        s.checkNotNullParameter(path, "path");
        return delete$default(path, null, null, 6, null);
    }

    public static /* synthetic */ r4.b delete$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return delete(str, obj, lVar);
    }

    public static final f get(String path) {
        s.checkNotNullParameter(path, "path");
        return get$default(path, null, null, 6, null);
    }

    public static /* synthetic */ f get$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return get(str, obj, lVar);
    }

    public static final List<Request> getRequestByGroup(Object group) {
        s.checkNotNullParameter(group, "group");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<Call>> it = NetConfig.INSTANCE.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call == null) {
                it.remove();
            } else {
                Request request = call.request();
                if (s.areEqual(group, e.getGroup(request))) {
                    arrayList.add(request);
                }
            }
        }
        return arrayList;
    }

    public static final Request getRequestById(Object id) {
        s.checkNotNullParameter(id, "id");
        Iterator<WeakReference<Call>> it = NetConfig.INSTANCE.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call == null) {
                it.remove();
            } else {
                Request request = call.request();
                if (s.areEqual(id, e.getId(request))) {
                    return request;
                }
            }
        }
        return null;
    }

    public static final f head(String path) {
        s.checkNotNullParameter(path, "path");
        return head$default(path, null, null, 6, null);
    }

    public static /* synthetic */ f head$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return head(str, obj, lVar);
    }

    public static final f options(String path) {
        s.checkNotNullParameter(path, "path");
        return options$default(path, null, null, 6, null);
    }

    public static /* synthetic */ f options$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return options(str, obj, lVar);
    }

    public static final r4.b patch(String path) {
        s.checkNotNullParameter(path, "path");
        return patch$default(path, null, null, 6, null);
    }

    public static /* synthetic */ r4.b patch$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return patch(str, obj, lVar);
    }

    public static final r4.b post(String path) {
        s.checkNotNullParameter(path, "path");
        return post$default(path, null, null, 6, null);
    }

    public static /* synthetic */ r4.b post$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return post(str, obj, lVar);
    }

    public static final r4.b put(String path) {
        s.checkNotNullParameter(path, "path");
        return put$default(path, null, null, 6, null);
    }

    public static /* synthetic */ r4.b put$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return put(str, obj, lVar);
    }

    public static final boolean removeDownloadListener(Object id, c progressListener) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(progressListener, "progressListener");
        Request requestById = getRequestById(id);
        if (requestById == null) {
            return false;
        }
        e.downloadListeners(requestById).remove(progressListener);
        return true;
    }

    public static final boolean removeUploadListener(Object id, c progressListener) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(progressListener, "progressListener");
        Request requestById = getRequestById(id);
        if (requestById == null) {
            return false;
        }
        e.uploadListeners(requestById).remove(progressListener);
        return true;
    }

    public static final f trace(String path) {
        s.checkNotNullParameter(path, "path");
        return trace$default(path, null, null, 6, null);
    }

    public static /* synthetic */ f trace$default(String str, Object obj, l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            obj = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return trace(str, obj, lVar);
    }

    public static final r4.b delete(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return delete$default(path, obj, null, 4, null);
    }

    public static final f get(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return get$default(path, obj, null, 4, null);
    }

    public static final f head(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return head$default(path, obj, null, 4, null);
    }

    public static final f options(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return options$default(path, obj, null, 4, null);
    }

    public static final r4.b patch(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return patch$default(path, obj, null, 4, null);
    }

    public static final r4.b post(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return post$default(path, obj, null, 4, null);
    }

    public static final r4.b put(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return put$default(path, obj, null, 4, null);
    }

    public static final f trace(String path, Object obj) {
        s.checkNotNullParameter(path, "path");
        return trace$default(path, obj, null, 4, null);
    }

    public static final r4.b delete(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        r4.b bVar = new r4.b();
        bVar.setPath(path);
        bVar.setMethod(Method.DELETE);
        bVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(bVar);
        }
        return bVar;
    }

    public static final f get(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        f fVar = new f();
        fVar.setPath(path);
        fVar.setMethod(Method.GET);
        fVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(fVar);
        }
        return fVar;
    }

    public static final f head(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        f fVar = new f();
        fVar.setPath(path);
        fVar.setMethod(Method.HEAD);
        fVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(fVar);
        }
        return fVar;
    }

    public static final f options(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        f fVar = new f();
        fVar.setPath(path);
        fVar.setMethod(Method.OPTIONS);
        fVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(fVar);
        }
        return fVar;
    }

    public static final r4.b patch(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        r4.b bVar = new r4.b();
        bVar.setPath(path);
        bVar.setMethod(Method.PATCH);
        bVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(bVar);
        }
        return bVar;
    }

    public static final r4.b post(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        r4.b bVar = new r4.b();
        bVar.setPath(path);
        bVar.setMethod(Method.POST);
        bVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(bVar);
        }
        return bVar;
    }

    public static final r4.b put(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        r4.b bVar = new r4.b();
        bVar.setPath(path);
        bVar.setMethod(Method.PUT);
        bVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(bVar);
        }
        return bVar;
    }

    public static final f trace(String path, Object obj, l lVar) {
        s.checkNotNullParameter(path, "path");
        f fVar = new f();
        fVar.setPath(path);
        fVar.setMethod(Method.TRACE);
        fVar.tag(obj);
        if (lVar != null) {
            lVar.invoke(fVar);
        }
        return fVar;
    }
}
