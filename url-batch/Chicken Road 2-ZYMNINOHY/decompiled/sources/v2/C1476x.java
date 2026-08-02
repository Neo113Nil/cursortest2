package v2;

import java.util.Comparator;

/* renamed from: v2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476x extends AbstractC1478z {
    public static AbstractC1478z f(int i4) {
        return i4 < 0 ? AbstractC1478z.f15692b : i4 > 0 ? AbstractC1478z.f15693c : AbstractC1478z.f15691a;
    }

    @Override // v2.AbstractC1478z
    public final AbstractC1478z a(int i4, int i5) {
        return f(Integer.compare(i4, i5));
    }

    @Override // v2.AbstractC1478z
    public final AbstractC1478z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // v2.AbstractC1478z
    public final AbstractC1478z c(boolean z, boolean z4) {
        return f(Boolean.compare(z, z4));
    }

    @Override // v2.AbstractC1478z
    public final AbstractC1478z d(boolean z, boolean z4) {
        return f(Boolean.compare(z4, z));
    }

    @Override // v2.AbstractC1478z
    public final int e() {
        return 0;
    }
}
