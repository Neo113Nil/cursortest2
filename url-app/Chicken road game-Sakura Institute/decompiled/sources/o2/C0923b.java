package o2;

import A.AbstractC0017m;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923b extends C0924c {

    /* renamed from: k, reason: collision with root package name */
    public final int f8916k;

    public C0923b(String str, int i2) {
        super(str);
        this.f8916k = i2;
    }

    @Override // o2.C0924c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((C0924c) obj);
    }

    @Override // o2.C0924c
    public final int e() {
        return this.f8916k;
    }

    @Override // o2.C0924c
    public final String toString() {
        return AbstractC0017m.n(new StringBuilder("IntegerChildName(\""), this.f8920d, "\")");
    }
}
