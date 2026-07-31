package r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class a3 extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f20488k;

    /* renamed from: l, reason: collision with root package name */
    private final int f20489l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f20490m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f20491n;

    /* renamed from: o, reason: collision with root package name */
    private final r3[] f20492o;

    /* renamed from: p, reason: collision with root package name */
    private final Object[] f20493p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap<Object, Integer> f20494q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Collection<? extends k2> collection, t1.s0 s0Var) {
        super(false, s0Var);
        int i7 = 0;
        int size = collection.size();
        this.f20490m = new int[size];
        this.f20491n = new int[size];
        this.f20492o = new r3[size];
        this.f20493p = new Object[size];
        this.f20494q = new HashMap<>();
        int i8 = 0;
        int i9 = 0;
        for (k2 k2Var : collection) {
            this.f20492o[i9] = k2Var.b();
            this.f20491n[i9] = i7;
            this.f20490m[i9] = i8;
            i7 += this.f20492o[i9].t();
            i8 += this.f20492o[i9].m();
            this.f20493p[i9] = k2Var.a();
            this.f20494q.put(this.f20493p[i9], Integer.valueOf(i9));
            i9++;
        }
        this.f20488k = i7;
        this.f20489l = i8;
    }

    @Override // r0.a
    protected Object C(int i7) {
        return this.f20493p[i7];
    }

    @Override // r0.a
    protected int E(int i7) {
        return this.f20490m[i7];
    }

    @Override // r0.a
    protected int F(int i7) {
        return this.f20491n[i7];
    }

    @Override // r0.a
    protected r3 I(int i7) {
        return this.f20492o[i7];
    }

    List<r3> J() {
        return Arrays.asList(this.f20492o);
    }

    @Override // r0.r3
    public int m() {
        return this.f20489l;
    }

    @Override // r0.r3
    public int t() {
        return this.f20488k;
    }

    @Override // r0.a
    protected int x(Object obj) {
        Integer num = this.f20494q.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // r0.a
    protected int y(int i7) {
        return o2.m0.h(this.f20490m, i7 + 1, false, false);
    }

    @Override // r0.a
    protected int z(int i7) {
        return o2.m0.h(this.f20491n, i7 + 1, false, false);
    }
}
