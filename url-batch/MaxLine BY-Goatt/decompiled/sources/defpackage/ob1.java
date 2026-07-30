package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ob1 implements qj1 {
    public final kb1 m;
    public final hq2 n;
    public final mb1 o;
    public final HashMap p = new HashMap();

    public ob1(kb1 kb1Var, hq2 hq2Var) {
        this.m = kb1Var;
        this.n = hq2Var;
        this.o = (mb1) kb1Var.b.invoke();
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.n.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.n.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.n.D(f);
    }

    @Override // defpackage.qj1
    public final pj1 G(int i, int i2, Map map, Function1 function1) {
        return this.n.G(i, i2, map, function1);
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.n.K(j);
    }

    @Override // defpackage.qj1
    public final pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.n.O(i, i2, map, function1, function12);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.n.R(f);
    }

    public final List a(long j, int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.p;
        List list = (List) hashMap.get(valueOf);
        if (list != null) {
            return list;
        }
        mb1 mb1Var = this.o;
        Object d = mb1Var.d(i);
        List s = this.n.s(d, this.m.a(i, d, mb1Var.e(i)));
        int size = s.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((jj1) s.get(i2)).c(j));
        }
        hashMap.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.n.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.n.d();
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.n.g0(j);
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.n.getLayoutDirection();
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.n.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.n.p();
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.n.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return this.n.r0(f);
    }

    @Override // defpackage.h41
    public final boolean w() {
        return this.n.w();
    }
}
