package t5;

import android.graphics.Typeface;
import q3.k;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f6898a;

    /* renamed from: b, reason: collision with root package name */
    public final k f6899b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6900c;

    public a(k kVar, Typeface typeface) {
        this.f6898a = typeface;
        this.f6899b = kVar;
    }

    @Override // r2.r
    public final void G(int i) {
        if (this.f6900c) {
            return;
        }
        r5.b bVar = (r5.b) this.f6899b.f6119e;
        if (bVar.l(this.f6898a)) {
            bVar.j(false);
        }
    }

    @Override // r2.r
    public final void H(Typeface typeface, boolean z3) {
        if (this.f6900c) {
            return;
        }
        r5.b bVar = (r5.b) this.f6899b.f6119e;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
