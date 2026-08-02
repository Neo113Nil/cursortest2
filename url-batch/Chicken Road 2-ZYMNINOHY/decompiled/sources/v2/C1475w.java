package v2;

import java.io.Serializable;

/* renamed from: v2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475w extends Z implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final B.c f15689a;

    public C1475w(B.c cVar) {
        this.f15689a = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15689a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1475w) {
            return this.f15689a.equals(((C1475w) obj).f15689a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15689a.hashCode();
    }

    public final String toString() {
        return this.f15689a.toString();
    }
}
