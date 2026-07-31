package a3;

import com.google.android.gms.internal.ads.e6;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.k6;

/* loaded from: classes.dex */
final class n0 implements e6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r0 f114b;

    n0(u0 u0Var, String str, r0 r0Var) {
        this.f113a = str;
        this.f114b = r0Var;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final void a(k6 k6Var) {
        String str = this.f113a;
        String exc = k6Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        io0.g(sb.toString());
        this.f114b.c(null);
    }
}
