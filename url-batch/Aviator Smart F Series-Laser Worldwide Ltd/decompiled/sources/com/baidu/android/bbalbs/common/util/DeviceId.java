package com.baidu.android.bbalbs.common.util;

import android.content.Context;
import com.baidu.bbalbscesium.d;
import com.baidu.bbalbscesium.f;
import com.baidu.bbalbscesium.g;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.o.c;
import java.io.File;

/* loaded from: classes.dex */
public final class DeviceId {

    /* renamed from: h, reason: collision with root package name */
    private static final String f1416h = "DeviceId";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f1417i = false;

    /* renamed from: j, reason: collision with root package name */
    private static h.a f1418j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile DeviceId f1419k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final long f1420l = 3600000;
    public static boolean sDataCuidInfoShable = true;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1421a;

    /* renamed from: b, reason: collision with root package name */
    private h f1422b;

    /* renamed from: c, reason: collision with root package name */
    private g f1423c;

    /* renamed from: d, reason: collision with root package name */
    private d f1424d;

    /* renamed from: e, reason: collision with root package name */
    private h.a f1425e;

    /* renamed from: f, reason: collision with root package name */
    private h.a f1426f;

    /* renamed from: g, reason: collision with root package name */
    private long f1427g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.a f1428a;

        a(h.a aVar) {
            this.f1428a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DeviceId.this.b(this.f1428a);
            } finally {
                DeviceId.this.f1422b.c();
            }
        }
    }

    private DeviceId(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1421a = applicationContext;
        this.f1424d = new d();
        this.f1422b = new h(applicationContext, new com.baidu.bbalbscesium.n.a(applicationContext), this.f1424d);
        this.f1423c = new g(applicationContext, this.f1424d);
    }

    static DeviceId a(Context context) {
        DeviceId deviceId;
        synchronized (f.class) {
            try {
                if (f1419k == null) {
                    f1419k = new DeviceId(context);
                }
                deviceId = f1419k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceId;
    }

    private h.a b(String str) {
        f b8 = this.f1423c.b(str);
        if (b8 != null) {
            return this.f1422b.a(b8);
        }
        return null;
    }

    private h.a c() {
        return c((String) null);
    }

    private h.a d() {
        h.a f8 = f();
        return f8 == null ? e() : f8;
    }

    private h.a e() {
        f a8;
        File file = new File(this.f1421a.getFilesDir(), f.f3879g);
        if (!file.exists() || (a8 = f.a(c.a(file))) == null) {
            return null;
        }
        return this.f1422b.a(a8);
    }

    private h.a f() {
        return this.f1422b.b();
    }

    public static String getCUID(Context context) {
        String d8;
        synchronized (DeviceId.class) {
            d8 = a(context).a().d();
        }
        return d8;
    }

    public static String getDeviceID(Context context) {
        return a(context).a().b();
    }

    public static boolean isMySelfTrusted(Context context) {
        return a(context).f1424d.a(context.getApplicationContext());
    }

    public static void setAndroidId(String str) {
        h.d(str);
    }

    @Deprecated
    public static void setCuidDataShable(Context context, boolean z7) {
    }

    private h.a a() {
        h.a aVar = this.f1426f;
        if (aVar != null) {
            return aVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.f1427g) > f1420l) {
            this.f1426f = c();
            this.f1427g = currentTimeMillis;
        }
        h.a aVar2 = this.f1426f;
        if (aVar2 != null) {
            return aVar2;
        }
        if (this.f1425e == null) {
            this.f1426f = a((String) null);
        }
        return this.f1426f;
    }

    private h.a c(String str) {
        h.a d8 = this.f1422b.d();
        return d8 == null ? b(str) : d8;
    }

    h b() {
        return this.f1422b;
    }

    private h.a a(String str) {
        return this.f1422b.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("cuidV270Info should not be null");
        }
        f g8 = aVar.g();
        this.f1422b.a(aVar, true, false);
        this.f1423c.a(g8);
        this.f1422b.a(aVar);
    }

    private synchronized void c(h.a aVar) {
        new Thread(a(aVar)).start();
    }

    private Runnable a(h.a aVar) {
        return new a(aVar);
    }
}
