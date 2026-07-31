package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import g.c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r62 implements a52<ij1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11037a;

    /* renamed from: b, reason: collision with root package name */
    private final gk1 f11038b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f11039c;

    /* renamed from: d, reason: collision with root package name */
    private final qr2 f11040d;

    public r62(Context context, Executor executor, gk1 gk1Var, qr2 qr2Var) {
        this.f11037a = context;
        this.f11038b = gk1Var;
        this.f11039c = executor;
        this.f11040d = qr2Var;
    }

    private static String d(rr2 rr2Var) {
        try {
            return rr2Var.f11400w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<ij1> a(final ds2 ds2Var, final rr2 rr2Var) {
        String d7 = d(rr2Var);
        final Uri parse = d7 != null ? Uri.parse(d7) : null;
        return rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.q62
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return r62.this.c(parse, ds2Var, rr2Var, obj);
            }
        }, this.f11039c);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        return (this.f11037a instanceof Activity) && v3.l.a() && l20.g(this.f11037a) && !TextUtils.isEmpty(d(rr2Var));
    }

    final /* synthetic */ cc3 c(Uri uri, ds2 ds2Var, rr2 rr2Var, Object obj) {
        try {
            g.c a7 = new c.a().a();
            a7.f16206a.setData(uri);
            z2.f fVar = new z2.f(a7.f16206a, null);
            final bp0 bp0Var = new bp0();
            jj1 c7 = this.f11038b.c(new l71(ds2Var, rr2Var, null), new nj1(new pk1() { // from class: com.google.android.gms.internal.ads.p62
                @Override // com.google.android.gms.internal.ads.pk1
                public final void a(boolean z6, Context context, jb1 jb1Var) {
                    bp0 bp0Var2 = bp0.this;
                    try {
                        y2.t.k();
                        z2.p.a(context, (AdOverlayInfoParcel) bp0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            bp0Var.e(new AdOverlayInfoParcel(fVar, null, c7.h(), null, new po0(0, 0, false, false, false), null, null));
            this.f11040d.a();
            return rb3.i(c7.i());
        } catch (Throwable th) {
            io0.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
