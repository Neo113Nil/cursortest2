package z3;

import android.graphics.Typeface;
import com.bumptech.glide.e;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5275b extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f42159h;
    public final /* synthetic */ C5277d i;

    public C5275b(C5277d c5277d, e eVar) {
        this.i = c5277d;
        this.f42159h = eVar;
    }

    @Override // F.b
    public final void g(int i) {
        this.i.f42174m = true;
        this.f42159h.u(i);
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        C5277d c5277d = this.i;
        c5277d.f42175n = Typeface.create(typeface, c5277d.f42165c);
        c5277d.f42174m = true;
        this.f42159h.v(c5277d.f42175n, false);
    }
}
