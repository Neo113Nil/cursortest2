package com.yanzhenjie.kalle;

import android.util.Log;
import com.yanzhenjie.kalle.simple.g;
import com.yanzhenjie.kalle.simple.k;

/* loaded from: classes4.dex */
public final class k {
    private static l sConfig;

    private k() {
    }

    public static void cancel(Object obj) {
        com.yanzhenjie.kalle.simple.f.getInstance().cancel(obj);
    }

    public static g.b delete(String str) {
        return com.yanzhenjie.kalle.simple.g.newApi(t.newBuilder(str).build(), RequestMethod.DELETE);
    }

    public static k.b get(String str) {
        return com.yanzhenjie.kalle.simple.k.newApi(t.newBuilder(str).build(), RequestMethod.GET);
    }

    public static l getConfig() {
        setConfig(null);
        return sConfig;
    }

    public static k.b head(String str) {
        return com.yanzhenjie.kalle.simple.k.newApi(t.newBuilder(str).build(), RequestMethod.HEAD);
    }

    public static k.b options(String str) {
        return com.yanzhenjie.kalle.simple.k.newApi(t.newBuilder(str).build(), RequestMethod.OPTIONS);
    }

    public static g.b patch(String str) {
        return com.yanzhenjie.kalle.simple.g.newApi(t.newBuilder(str).build(), RequestMethod.PATCH);
    }

    public static g.b post(String str) {
        return com.yanzhenjie.kalle.simple.g.newApi(t.newBuilder(str).build(), RequestMethod.POST);
    }

    public static g.b put(String str) {
        return com.yanzhenjie.kalle.simple.g.newApi(t.newBuilder(str).build(), RequestMethod.PUT);
    }

    public static void setConfig(l lVar) {
        if (sConfig == null) {
            synchronized (l.class) {
                try {
                    if (sConfig == null) {
                        if (lVar == null) {
                            lVar = l.newBuilder().build();
                        }
                        sConfig = lVar;
                    } else {
                        Log.w("Kalle", new IllegalStateException("Only allowed to configure once."));
                    }
                } finally {
                }
            }
        }
    }

    public static k.b trace(String str) {
        return com.yanzhenjie.kalle.simple.k.newApi(t.newBuilder(str).build(), RequestMethod.TRACE);
    }

    public static g.b delete(t tVar) {
        return com.yanzhenjie.kalle.simple.g.newApi(tVar, RequestMethod.DELETE);
    }

    public static k.b get(t tVar) {
        return com.yanzhenjie.kalle.simple.k.newApi(tVar, RequestMethod.GET);
    }

    public static k.b head(t tVar) {
        return com.yanzhenjie.kalle.simple.k.newApi(tVar, RequestMethod.HEAD);
    }

    public static k.b options(t tVar) {
        return com.yanzhenjie.kalle.simple.k.newApi(tVar, RequestMethod.OPTIONS);
    }

    public static g.b patch(t tVar) {
        return com.yanzhenjie.kalle.simple.g.newApi(tVar, RequestMethod.PATCH);
    }

    public static g.b post(t tVar) {
        return com.yanzhenjie.kalle.simple.g.newApi(tVar, RequestMethod.POST);
    }

    public static g.b put(t tVar) {
        return com.yanzhenjie.kalle.simple.g.newApi(tVar, RequestMethod.PUT);
    }

    public static k.b trace(t tVar) {
        return com.yanzhenjie.kalle.simple.k.newApi(tVar, RequestMethod.TRACE);
    }
}
