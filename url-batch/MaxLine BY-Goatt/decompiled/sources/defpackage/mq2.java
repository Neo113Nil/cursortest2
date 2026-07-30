package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mq2 extends s01 {
    public final Drawable a;
    public final r01 b;
    public final m60 c;
    public final ak1 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public mq2(Drawable drawable, r01 r01Var, m60 m60Var, ak1 ak1Var, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = r01Var;
        this.c = m60Var;
        this.d = ak1Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.s01
    public final r01 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq2)) {
            return false;
        }
        mq2 mq2Var = (mq2) obj;
        return Intrinsics.b(this.a, mq2Var.a) && Intrinsics.b(this.b, mq2Var.b) && this.c == mq2Var.c && Intrinsics.b(this.d, mq2Var.d) && Intrinsics.b(this.e, mq2Var.e) && this.f == mq2Var.f && this.g == mq2Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ak1 ak1Var = this.d;
        int hashCode2 = (hashCode + (ak1Var != null ? ak1Var.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + in1.i((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
