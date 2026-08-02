package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmk extends fmp {
    private final Typeface a;
    private boolean b;
    private final kee c;

    public fmk(kee keeVar, Typeface typeface) {
        this.a = typeface;
        this.c = keeVar;
    }

    private final void d(Typeface typeface) {
        if (this.b) {
            return;
        }
        fip fipVar = (fip) this.c.a;
        if (fipVar.s(typeface)) {
            fipVar.i(false);
        }
    }

    @Override // defpackage.fmp
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.fmp
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.b = true;
    }
}
