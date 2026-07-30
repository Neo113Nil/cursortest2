package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r80 {
    public final t40 a;
    public final t40 b;
    public final t40 c;
    public final t40 d;
    public final ts1 e;
    public final s32 f;
    public final Bitmap.Config g;
    public final boolean h;
    public final kr i;
    public final kr j;
    public final kr k;

    public r80() {
        t80 t80Var = vb0.a;
        bx0 bx0Var = qh1.a.r;
        j80 j80Var = j80.o;
        s32 s32Var = s32.o;
        Bitmap.Config config = l.b;
        kr krVar = kr.o;
        this.a = bx0Var;
        this.b = j80Var;
        this.c = j80Var;
        this.d = j80Var;
        this.e = ts1.a;
        this.f = s32Var;
        this.g = config;
        this.h = true;
        this.i = krVar;
        this.j = krVar;
        this.k = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return Intrinsics.b(this.a, r80Var.a) && Intrinsics.b(this.b, r80Var.b) && Intrinsics.b(this.c, r80Var.c) && Intrinsics.b(this.d, r80Var.d) && Intrinsics.b(this.e, r80Var.e) && this.f == r80Var.f && this.g == r80Var.g && this.h == r80Var.h && this.i == r80Var.i && this.j == r80Var.j && this.k == r80Var.k;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.e.getClass();
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + in1.i(in1.i((this.g.hashCode() + ((this.f.hashCode() + ((ts1.class.hashCode() + hashCode) * 31)) * 31)) * 31, 31, this.h), 923521, false)) * 31)) * 31);
    }
}
