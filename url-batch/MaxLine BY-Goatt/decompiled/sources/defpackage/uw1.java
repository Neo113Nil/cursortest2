package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uw1 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final pl2 d;
    public final me2 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final mx0 j;
    public final ns2 k;
    public final gz1 l;
    public final kr m;
    public final kr n;
    public final kr o;

    public uw1(Context context, Bitmap.Config config, ColorSpace colorSpace, pl2 pl2Var, me2 me2Var, boolean z, boolean z2, boolean z3, String str, mx0 mx0Var, ns2 ns2Var, gz1 gz1Var, kr krVar, kr krVar2, kr krVar3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = pl2Var;
        this.e = me2Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = mx0Var;
        this.k = ns2Var;
        this.l = gz1Var;
        this.m = krVar;
        this.n = krVar2;
        this.o = krVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw1)) {
            return false;
        }
        uw1 uw1Var = (uw1) obj;
        if (Intrinsics.b(this.a, uw1Var.a) && this.b == uw1Var.b) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.b(this.c, uw1Var.c)) && Intrinsics.b(this.d, uw1Var.d) && this.e == uw1Var.e && this.f == uw1Var.f && this.g == uw1Var.g && this.h == uw1Var.h && Intrinsics.b(this.i, uw1Var.i) && Intrinsics.b(this.j, uw1Var.j) && Intrinsics.b(this.k, uw1Var.k) && Intrinsics.b(this.l, uw1Var.l) && this.m == uw1Var.m && this.n == uw1Var.n && this.o == uw1Var.o;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int i = in1.i(in1.i(in1.i((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.m.hashCode() + ((this.k.a.hashCode() + ((((i + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.m)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
