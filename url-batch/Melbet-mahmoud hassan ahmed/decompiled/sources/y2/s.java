package y2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.by;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.mh0;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.r20;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.sj0;
import com.google.android.gms.internal.ads.ux;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.ww;
import com.google.android.gms.internal.ads.wy;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.ads.zw;
import com.google.android.gms.internal.ads.zy;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class s extends mx {

    /* renamed from: f, reason: collision with root package name */
    private final po0 f23432f;

    /* renamed from: g, reason: collision with root package name */
    private final pv f23433g;

    /* renamed from: h, reason: collision with root package name */
    private final Future<gb> f23434h = wo0.f13894a.E(new o(this));

    /* renamed from: i, reason: collision with root package name */
    private final Context f23435i;

    /* renamed from: j, reason: collision with root package name */
    private final r f23436j;

    /* renamed from: k, reason: collision with root package name */
    private WebView f23437k;

    /* renamed from: l, reason: collision with root package name */
    private zw f23438l;

    /* renamed from: m, reason: collision with root package name */
    private gb f23439m;

    /* renamed from: n, reason: collision with root package name */
    private AsyncTask<Void, Void, String> f23440n;

    public s(Context context, pv pvVar, String str, po0 po0Var) {
        this.f23435i = context;
        this.f23432f = po0Var;
        this.f23433g = pvVar;
        this.f23437k = new WebView(context);
        this.f23436j = new r(context, str);
        s6(0);
        this.f23437k.setVerticalScrollBarEnabled(false);
        this.f23437k.getSettings().setJavaScriptEnabled(true);
        this.f23437k.setWebViewClient(new m(this));
        this.f23437k.setOnTouchListener(new n(this));
    }

    static /* bridge */ /* synthetic */ void B6(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f23435i.startActivity(intent);
    }

    static /* bridge */ /* synthetic */ String y6(s sVar, String str) {
        if (sVar.f23439m == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.f23439m.a(parse, sVar.f23435i, null, null);
        } catch (hb e7) {
            io0.h("Unable to process ad data", e7);
        }
        return parse.toString();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean B4() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void E4(yx yxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean F4(kv kvVar) {
        r3.o.j(this.f23437k, "This Search Ad has already been torn down");
        this.f23436j.f(kvVar, this.f23432f);
        this.f23440n = new q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void H() {
        r3.o.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean K0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void K3(boolean z6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L2(sj0 sj0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L4(vv vvVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        this.f23440n.cancel(true);
        this.f23434h.cancel(true);
        this.f23437k.destroy();
        this.f23437k = null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void O1(mh0 mh0Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void R3(pv pvVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void V() {
        r3.o.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b6(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c5(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c6(s00 s00Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final pv e() {
        return this.f23433g;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final Bundle g() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zw h() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final ux i() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zy j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void j4(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final cz k() {
        return null;
    }

    final String l() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(r20.f10995d.e());
        builder.appendQueryParameter("query", this.f23436j.d());
        builder.appendQueryParameter("pubId", this.f23436j.c());
        builder.appendQueryParameter("mappver", this.f23436j.a());
        Map<String, String> e7 = this.f23436j.e();
        for (String str : e7.keySet()) {
            builder.appendQueryParameter(str, e7.get(str));
        }
        Uri build = builder.build();
        gb gbVar = this.f23439m;
        if (gbVar != null) {
            try {
                build = gbVar.b(build, this.f23435i);
            } catch (hb e8) {
                io0.h("Unable to process ad data", e8);
            }
        }
        String r7 = r();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(r7.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(r7);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        r3.o.e("getAdFrame must be called on the main UI thread.");
        return x3.b.B3(this.f23437k);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
        throw new IllegalStateException("Unused method");
    }

    final String r() {
        String b7 = this.f23436j.b();
        if (true == TextUtils.isEmpty(b7)) {
            b7 = "www.google.com";
        }
        String e7 = r20.f10995d.e();
        StringBuilder sb = new StringBuilder(String.valueOf(b7).length() + 8 + String.valueOf(e7).length());
        sb.append("https://");
        sb.append(b7);
        sb.append(e7);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r4(i20 i20Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
    }

    final int s(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            qw.b();
            return bo0.s(this.f23435i, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    final void s6(int i7) {
        if (this.f23437k == null) {
            return;
        }
        this.f23437k.setLayoutParams(new ViewGroup.LayoutParams(-1, i7));
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String t() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
        this.f23438l = zwVar;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x4(hz hzVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x5(jh0 jh0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void z5(rx rxVar) {
        throw new IllegalStateException("Unused method");
    }
}
