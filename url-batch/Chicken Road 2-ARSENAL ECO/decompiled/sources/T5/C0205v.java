package T5;

import java.util.Arrays;
import java.util.List;
import k5.EnumC0476f;
import l5.AbstractC0506j;
import l5.C0512p;
import m1.AbstractC0521b;

/* renamed from: T5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205v implements R5.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final C0206w f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2467c = {"[UNINITIALIZED]"};

    /* renamed from: d, reason: collision with root package name */
    public final List[] f2468d = new List[1];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2469e = new boolean[1];

    /* renamed from: f, reason: collision with root package name */
    public final Object f2470f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2471g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2472h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2473i;

    public C0205v(String str, C0206w c0206w) {
        this.f2465a = str;
        this.f2466b = c0206w;
        EnumC0476f enumC0476f = EnumC0476f.f5195f;
        this.f2470f = AbstractC0521b.w(enumC0476f, new K(this, 1));
        this.f2471g = AbstractC0521b.w(enumC0476f, new K(this, 2));
        this.f2472h = AbstractC0521b.w(enumC0476f, new K(this, 0));
        this.f2473i = true;
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return -3;
    }

    @Override // R5.e
    public final String b() {
        return this.f2465a;
    }

    @Override // R5.e
    public final A3.c c() {
        return R5.i.f2172b;
    }

    @Override // R5.e
    public final int d() {
        return 1;
    }

    @Override // R5.e
    public final String e(int i7) {
        return this.f2467c[i7];
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k5.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, k5.e] */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0205v) {
                R5.e eVar = (R5.e) obj;
                if (this.f2465a.equals(eVar.b())) {
                    C0205v c0205v = (C0205v) obj;
                    if (!c0205v.f2473i || !Arrays.equals((R5.e[]) this.f2471g.getValue(), (R5.e[]) c0205v.f2471g.getValue()) || 1 != eVar.d() || !kotlin.jvm.internal.i.a(h(0).b(), eVar.h(0).b()) || !kotlin.jvm.internal.i.a(h(0).c(), eVar.h(0).c())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // R5.e
    public final List g(int i7) {
        List list = this.f2468d[i7];
        return list == null ? C0512p.f5303f : list;
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k5.e] */
    @Override // R5.e
    public final R5.e h(int i7) {
        return ((Q5.a[]) this.f2470f.getValue())[i7].c();
    }

    public final int hashCode() {
        return j() * 31;
    }

    @Override // R5.e
    public final boolean i(int i7) {
        return this.f2469e[i7];
    }

    @Override // R5.e
    public final boolean isInline() {
        return this.f2473i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k5.e] */
    public final int j() {
        return ((Number) this.f2472h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC0506j.I(i6.g.B(0, 1), ", ", this.f2465a.concat("("), ")", new J5.o(3, this), 24);
    }

    @Override // R5.e
    public final void f() {
    }
}
