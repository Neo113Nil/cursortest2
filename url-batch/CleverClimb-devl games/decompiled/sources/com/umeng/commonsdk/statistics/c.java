package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.aa;
import com.umeng.commonsdk.proguard.l;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* compiled from: NetWorkManager.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f9131b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9132c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9133d = 3;
    private static final String p = "thtstart";
    private static final String q = "gkvc";
    private static final String r = "ekvc";

    /* renamed from: a, reason: collision with root package name */
    String f9134a;
    private com.umeng.commonsdk.statistics.internal.c f;
    private ImprintHandler g;
    private d h;
    private ImprintHandler.a i;
    private ABTest j;
    private ImLatent k;
    private Defcon l;
    private long m;
    private int n;
    private int o;
    private Context s;
    private final int e = 1;
    private ReportPolicy.ReportStrategy t = null;

    public c(Context context) {
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = 0L;
        this.n = 0;
        this.o = 0;
        this.f9134a = null;
        this.s = context;
        this.i = ImprintHandler.getImprintService(this.s).b();
        this.j = ABTest.getService(this.s);
        this.l = Defcon.getService(this.s);
        this.k = ImLatent.getService(this.s, StatTracer.getInstance(this.s));
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.s);
        this.m = sharedPreferences.getLong(p, 0L);
        this.n = sharedPreferences.getInt(q, 0);
        this.o = sharedPreferences.getInt(r, 0);
        this.f9134a = UMEnvelopeBuild.imprintProperty(this.s, "track_list", null);
        this.g = ImprintHandler.getImprintService(this.s);
        this.g.a(new com.umeng.commonsdk.statistics.internal.d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.d
            public void onImprintChanged(ImprintHandler.a aVar) {
                Class<?> cls;
                c.this.j.onImprintChanged(aVar);
                c.this.l.onImprintChanged(aVar);
                c.this.k.onImprintChanged(aVar);
                c.this.f9134a = UMEnvelopeBuild.imprintProperty(c.this.s, "track_list", null);
                try {
                    String a2 = com.umeng.commonsdk.framework.a.a(c.this.s, com.umeng.commonsdk.proguard.d.e, (String) null);
                    if (TextUtils.isEmpty(a2) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                        return;
                    }
                    cls.getMethod("updateUMTT", Context.class, String.class).invoke(cls, c.this.s, a2);
                } catch (Throwable unused) {
                }
            }
        });
        this.h = d.a(this.s);
        this.f = new com.umeng.commonsdk.statistics.internal.c(this.s);
        this.f.a(StatTracer.getInstance(this.s));
    }

    public boolean a(File file) {
        if (file == null) {
            return false;
        }
        try {
            byte[] a2 = com.umeng.commonsdk.framework.b.a(file.getPath());
            if (a2 == null) {
                return false;
            }
            com.umeng.commonsdk.statistics.internal.a.a(this.s).b(file.getName());
            byte[] a3 = this.f.a(a2, com.umeng.commonsdk.statistics.internal.a.a(this.s).a(file.getName()));
            int a4 = a3 == null ? 1 : a(a3);
            switch (a4) {
                case 2:
                    this.h.d();
                    StatTracer.getInstance(this.s).saveSate();
                    break;
                case 3:
                    StatTracer.getInstance(this.s).saveSate();
                    break;
            }
            return a4 == 2;
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(this.s, th);
            return false;
        }
    }

    private int a(byte[] bArr) {
        Response response = new Response();
        try {
            new l(new aa.a()).a(response, bArr);
            if (response.resp_code == 1) {
                this.g.b(response.getImprint());
                this.g.c();
            }
            MLog.i("send log:" + response.getMsg());
            UMRTLog.i(UMRTLog.RTLOG_TAG, "send log: " + response.getMsg());
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(this.s, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }

    public boolean a() {
        if (!this.l.isOpen()) {
            if (!((this.t instanceof ReportPolicy.LatentPolicy) && this.t.isValid()) && this.k.shouldStartLatency()) {
                this.t = new ReportPolicy.LatentPolicy((int) this.k.getDelayTime());
                return true;
            }
        }
        return false;
    }

    public int b() {
        this.k.getDelayTime();
        return (int) (System.currentTimeMillis() - StatTracer.getInstance(this.s).getLastReqTime());
    }
}
