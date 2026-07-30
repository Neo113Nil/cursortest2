package z6;

import j6.C0588e;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081v implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8817a;

    /* renamed from: b, reason: collision with root package name */
    public final C1082w f8818b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f8819c;

    /* renamed from: d, reason: collision with root package name */
    public final List[] f8820d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f8821e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.collections.B f8822f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8823g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8824h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8825i;
    public final boolean j;

    public C1081v(String serialName, C1082w generatedSerializer) {
        Intrinsics.checkNotNullParameter(serialName, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f8817a = serialName;
        this.f8818b = generatedSerializer;
        this.f8819c = new String[]{"[UNINITIALIZED]"};
        this.f8820d = new List[1];
        this.f8821e = new boolean[1];
        this.f8822f = kotlin.collections.I.c();
        R5.j jVar = R5.j.f2417d;
        this.f8823g = R5.i.a(jVar, new K(this, 1));
        this.f8824h = R5.i.a(jVar, new K(this, 2));
        this.f8825i = R5.i.a(jVar, new K(this, 0));
        this.j = true;
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8822f.getClass();
        return -3;
    }

    @Override // x6.e
    public final String b() {
        return this.f8817a;
    }

    @Override // x6.e
    public final V6.b c() {
        return x6.i.f8442b;
    }

    @Override // x6.e
    public final int d() {
        return 1;
    }

    @Override // x6.e
    public final String e(int i2) {
        return this.f8819c[i2];
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [R5.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [R5.h, java.lang.Object] */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1081v) {
                x6.e eVar = (x6.e) obj;
                if (this.f8817a.equals(eVar.b())) {
                    C1081v c1081v = (C1081v) obj;
                    if (!c1081v.j || !Arrays.equals((x6.e[]) this.f8824h.getValue(), (x6.e[]) c1081v.f8824h.getValue()) || 1 != eVar.d() || !Intrinsics.a(i(0).b(), eVar.i(0).b()) || !Intrinsics.a(i(0).c(), eVar.i(0).c())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // x6.e
    public final boolean f() {
        return this.j;
    }

    @Override // x6.e
    public final List getAnnotations() {
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        List list = this.f8820d[i2];
        return list == null ? kotlin.collections.A.f6115d : list;
    }

    public final int hashCode() {
        return k() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.h, java.lang.Object] */
    @Override // x6.e
    public final x6.e i(int i2) {
        return ((w6.a[]) this.f8823g.getValue())[i2].c();
    }

    @Override // x6.e
    public final boolean j(int i2) {
        return this.f8821e[i2];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.h, java.lang.Object] */
    public final int k() {
        return ((Number) this.f8825i.getValue()).intValue();
    }

    public final String toString() {
        return CollectionsKt.s(C0588e.c(0, 1), ", ", this.f8817a.concat("("), ")", new G0.l(5, this), 24);
    }

    @Override // x6.e
    public final void g() {
    }
}
