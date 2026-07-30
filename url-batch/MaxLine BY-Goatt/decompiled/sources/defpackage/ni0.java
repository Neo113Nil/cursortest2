package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ni0 extends s01 {
    public final Drawable a;
    public final r01 b;
    public final Throwable c;

    public ni0(Drawable drawable, r01 r01Var, Throwable th) {
        this.a = drawable;
        this.b = r01Var;
        this.c = th;
    }

    @Override // defpackage.s01
    public final r01 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni0)) {
            return false;
        }
        ni0 ni0Var = (ni0) obj;
        return Intrinsics.b(this.a, ni0Var.a) && Intrinsics.b(this.b, ni0Var.b) && this.c.equals(ni0Var.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }
}
