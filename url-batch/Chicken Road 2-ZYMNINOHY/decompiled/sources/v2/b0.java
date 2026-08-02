package v2;

import a.AbstractC0124a;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 extends I {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f15609c;

    public b0(c0 c0Var) {
        this.f15609c = c0Var;
    }

    @Override // v2.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        c0 c0Var = this.f15609c;
        AbstractC0124a.m(i4, c0Var.f15616f);
        Object[] objArr = c0Var.f15615e;
        int i5 = i4 * 2;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15609c.f15616f;
    }
}
