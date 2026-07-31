package O0;

import android.content.Context;

/* renamed from: O0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0407g {

    /* renamed from: a, reason: collision with root package name */
    c0 f1216a;

    /* renamed from: b, reason: collision with root package name */
    c0 f1217b;

    /* renamed from: c, reason: collision with root package name */
    Context f1218c;

    /* renamed from: d, reason: collision with root package name */
    String f1219d;

    public C0407g(Context context) {
        if (context != null) {
            this.f1218c = context.getApplicationContext();
        }
        this.f1216a = new c0();
        this.f1217b = new c0();
    }

    public C0407g a(int i4, String str) {
        j0.b("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i4);
        if (!W.d(str)) {
            str = "";
        }
        if (i4 == 0) {
            this.f1216a.i(str);
            return this;
        }
        if (i4 != 1) {
            j0.m("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        }
        this.f1217b.i(str);
        return this;
    }

    public C0407g b(String str) {
        j0.b("hmsSdk", "Builder.setAppID is execute");
        this.f1219d = str;
        return this;
    }

    public C0407g c(boolean z4) {
        j0.b("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f1216a.z().b(z4);
        this.f1217b.z().b(z4);
        return this;
    }

    public void d() {
        if (this.f1218c == null) {
            j0.e("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        j0.b("hmsSdk", "Builder.create() is execute.");
        q0 q0Var = new q0("_hms_config_tag");
        q0Var.g(new c0(this.f1216a));
        q0Var.c(new c0(this.f1217b));
        N.a().b(this.f1218c);
        C0419t.a().c(this.f1218c);
        a0.d().a(q0Var);
        N.a().c(this.f1219d);
    }

    public C0407g e(boolean z4) {
        j0.b("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f1216a.z().d(z4);
        this.f1217b.z().d(z4);
        return this;
    }

    public C0407g f(boolean z4) {
        j0.b("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f1216a.z().f(z4);
        this.f1217b.z().f(z4);
        return this;
    }
}
