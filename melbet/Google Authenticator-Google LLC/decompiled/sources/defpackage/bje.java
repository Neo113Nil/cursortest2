package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bje extends bjd {
    static bdv g(Drawable drawable) {
        if (drawable != null) {
            return new bje(drawable);
        }
        return null;
    }

    @Override // defpackage.bdv
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.bdv
    public final void e() {
    }
}
