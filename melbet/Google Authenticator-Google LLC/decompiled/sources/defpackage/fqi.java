package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fqi extends fob {
    public static final /* synthetic */ int b = 0;
    public fqg a;

    public fqi(fqg fqgVar) {
        super(fqgVar);
        this.a = fqgVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.w.left && f2 == this.a.w.top && f3 == this.a.w.right && f4 == this.a.w.bottom) {
            return;
        }
        this.a.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new fqg(this.a);
        return this;
    }
}
