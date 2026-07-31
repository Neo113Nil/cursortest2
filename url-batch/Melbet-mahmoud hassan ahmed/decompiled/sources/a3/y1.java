package a3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.j20;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.zv3;
import g.c;

/* loaded from: classes.dex */
final class y1 implements j20 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l20 f202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f203b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f204c;

    y1(g2 g2Var, l20 l20Var, Context context, Uri uri) {
        this.f202a = l20Var;
        this.f203b = context;
        this.f204c = uri;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final void zza() {
        g.c a7 = new c.a(this.f202a.a()).a();
        a7.f16206a.setPackage(zv3.a(this.f203b));
        a7.a(this.f203b, this.f204c);
        this.f202a.f((Activity) this.f203b);
    }
}
