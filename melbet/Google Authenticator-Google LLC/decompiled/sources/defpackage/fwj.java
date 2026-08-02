package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwj extends bku implements bgf {
    private final koe a;

    public fwj(koe koeVar) {
        this.a = koeVar;
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        return ((fwi) this.a).b();
    }

    @Override // defpackage.bku, defpackage.bkw
    public final void c(Context context, azj azjVar, bac bacVar) {
        bacVar.f(fxz.class, Bitmap.class, this);
    }
}
