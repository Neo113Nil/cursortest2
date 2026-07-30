package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s41 implements qj1, h41 {
    public final /* synthetic */ h41 m;
    public final u81 n;

    public s41(h41 h41Var, u81 u81Var) {
        this.m = h41Var;
        this.n = u81Var;
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.m.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.m.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.m.D(f);
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.m.K(j);
    }

    @Override // defpackage.qj1
    public final pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            h21.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new r41(i, i2, map, function1);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.m.R(f);
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.m.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.d();
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.m.g0(j);
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.n;
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.m.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.p();
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.m.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return this.m.r0(f);
    }

    @Override // defpackage.h41
    public final boolean w() {
        return this.m.w();
    }
}
