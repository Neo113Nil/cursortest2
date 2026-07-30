package com.baidu.platform.comapi.walknavi.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comjni.bikenavi.JNIEngineManager;
import com.baidu.platform.comjni.jninative.EngineCommonConfig;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.platform.comapi.h.j.a f9930f;

    /* renamed from: a, reason: collision with root package name */
    private JNIEngineManager f9925a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f9926b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f9927c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f9928d = 0;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.e.a f9929e = null;

    /* renamed from: g, reason: collision with root package name */
    private int f9931g = 0;

    /* renamed from: h, reason: collision with root package name */
    private Handler f9932h = new a();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                if (b.this.f9929e != null) {
                    b.this.f9929e.engineInitFail();
                    b.this.f9929e = null;
                    return;
                }
                return;
            }
            if (i8 == 16 || i8 == 32) {
                b bVar = b.this;
                bVar.f9931g = message.what | bVar.f9931g;
                if (b.this.f9929e == null || b.this.f9931g != 48) {
                    return;
                }
                b.this.f9929e.engineInitSuccess();
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.e.b$b, reason: collision with other inner class name */
    private class C0121b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private EngineCommonConfig f9934a;

        /* renamed from: b, reason: collision with root package name */
        private long f9935b;

        public C0121b(long j8, EngineCommonConfig engineCommonConfig) {
            this.f9935b = j8;
            this.f9934a = engineCommonConfig;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long[] jArr = {0};
            int initBaseManager = b.this.f9925a.initBaseManager(this.f9934a, this.f9935b, jArr);
            Log.d("ret====", "ret：" + initBaseManager);
            if (initBaseManager != 0) {
                Message.obtain(b.this.f9932h, 1).sendToTarget();
            } else {
                b.this.f9926b = jArr[0];
                Message.obtain(b.this.f9932h, 16).sendToTarget();
            }
        }
    }

    private class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Context f9937a;

        public c(Context context) {
            this.f9937a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (!com.baidu.platform.comapi.h.t.p.a.c(this.f9937a)) {
                Message.obtain(b.this.f9932h, 32).sendToTarget();
                return;
            }
            com.baidu.platform.comapi.h.g.a.a("InitResourceThread  error");
            Log.d("InitResourceThread", "InitResourceThread  error");
            Message.obtain(b.this.f9932h, 1).sendToTarget();
        }
    }

    private synchronized void g() {
        JNIEngineManager jNIEngineManager = this.f9925a;
        if (jNIEngineManager != null) {
            this.f9930f = null;
            jNIEngineManager.uninitBaseManager(this.f9926b);
            this.f9927c = 0L;
        }
    }

    public com.baidu.platform.comapi.h.j.a b() {
        return this.f9930f;
    }

    public int e() {
        return this.f9931g;
    }

    public void f() {
        JNIEngineManager jNIEngineManager = this.f9925a;
        if (jNIEngineManager != null) {
            jNIEngineManager.unInitBaseAr(this.f9926b);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public synchronized void release() {
        g();
        this.f9925a = null;
        this.f9927c = 0L;
        this.f9928d = 0L;
        this.f9931g = 0;
        this.f9926b = 0L;
        this.f9929e = null;
        this.f9930f = null;
    }

    public long c() {
        if (this.f9928d == 0) {
            this.f9928d = c(1);
        }
        return this.f9928d;
    }

    public long d() {
        if (this.f9927c == 0) {
            this.f9927c = c(0);
        }
        return this.f9927c;
    }

    private long c(int i8) {
        JNIEngineManager jNIEngineManager = this.f9925a;
        if (jNIEngineManager != null) {
            long j8 = this.f9926b;
            if (j8 != 0) {
                long[] jArr = {0};
                try {
                    jNIEngineManager.getSubSysHandle(j8, i8, jArr);
                } catch (Exception e8) {
                    com.baidu.platform.comapi.h.g.a.b(e8.getMessage());
                }
                return jArr[0];
            }
        }
        return 0L;
    }

    public void a(Context context, long j8, com.baidu.platform.comapi.h.j.a aVar, com.baidu.platform.comapi.walknavi.e.a aVar2) {
        this.f9929e = aVar2;
        this.f9930f = aVar;
        if (this.f9931g == 48) {
            if (aVar2 != null) {
                aVar2.engineInitSuccess();
                return;
            }
            return;
        }
        EngineCommonConfig engineCommonConfig = new EngineCommonConfig();
        int min = Math.min(com.baidu.platform.comapi.h.t.q.b.b().d(), 800);
        engineCommonConfig.mStreetPicWidth = min;
        engineCommonConfig.mStreetPicHeight = (min * 3) / 5;
        engineCommonConfig.mStreetPicQuality = 80;
        engineCommonConfig.mNoExistSensor = false;
        if (aVar != null) {
            MapLanguage e8 = aVar.e();
            if (e8 != null) {
                engineCommonConfig.enLanguageType = e8.ordinal();
            }
            engineCommonConfig.routeCustomWidth = aVar.i();
            Bundle a8 = a(aVar.a());
            engineCommonConfig.compassCustomRes = a8;
            if (a8 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.compassCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_compass_en));
            }
            Bundle a9 = a(aVar.b());
            engineCommonConfig.endPointCustomRes = a9;
            if (a9 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.endPointCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_arrive_en));
            }
            engineCommonConfig.routeNormalCustomRes = a(aVar.j());
            engineCommonConfig.routePassedCustomRes = a(aVar.k());
            Bundle a10 = a(aVar.c());
            engineCommonConfig.facilityForbiddenCustomRes = a10;
            if (a10 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.facilityForbiddenCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_route_walk_type_forbidden_en));
            }
            Bundle a11 = a(aVar.d());
            engineCommonConfig.facilityRetrogradeCustomRes = a11;
            if (a11 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.facilityRetrogradeCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_route_walk_type_retrograde_en));
            }
            Bundle a12 = a(aVar.h());
            engineCommonConfig.lightWaitCustomRes = a12;
            if (a12 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.lightWaitCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_wait_en));
            }
            Bundle a13 = a(aVar.f());
            engineCommonConfig.lightAttentionCustomRes = a13;
            if (a13 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.lightAttentionCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_notice_en));
            }
            Bundle a14 = a(aVar.g());
            engineCommonConfig.lightPassCustomBitmap = a14;
            if (a14 == null && MapLanguage.ENGLISH == e8) {
                engineCommonConfig.lightPassCustomBitmap = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_pass_en));
            }
        }
        this.f9925a = new JNIEngineManager();
        new C0121b(j8, engineCommonConfig).start();
        new c(context).start();
    }

    public boolean a(long j8) {
        return this.f9925a.initBaseAr(this.f9926b, j8) == 0;
    }

    private Bundle a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bundle bundle = new Bundle();
        bundle.putInt("image_width", width);
        bundle.putInt("image_height", height);
        ByteBuffer allocate = ByteBuffer.allocate(width * height * 4);
        bitmap.copyPixelsToBuffer(allocate);
        bundle.putByteArray("image_data", allocate.array());
        return bundle;
    }
}
