package y2;

import com.google.android.gms.internal.ads.u03;
import com.google.android.gms.internal.ads.y13;

/* loaded from: classes.dex */
final class h implements y13 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f23397a;

    h(i iVar) {
        this.f23397a = iVar;
    }

    @Override // com.google.android.gms.internal.ads.y13
    public final void a(int i7, long j7, String str) {
        u03 u03Var;
        u03Var = this.f23397a.f23405m;
        u03Var.e(i7, System.currentTimeMillis() - j7, str);
    }

    @Override // com.google.android.gms.internal.ads.y13
    public final void b(int i7, long j7) {
        u03 u03Var;
        u03Var = this.f23397a.f23405m;
        u03Var.d(i7, System.currentTimeMillis() - j7);
    }
}
