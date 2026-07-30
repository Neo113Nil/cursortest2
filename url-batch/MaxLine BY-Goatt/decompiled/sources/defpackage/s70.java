package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s70 {
    public final BitmapDrawable a;
    public final boolean b;

    public s70(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s70)) {
            return false;
        }
        s70 s70Var = (s70) obj;
        return this.a.equals(s70Var.a) && this.b == s70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
