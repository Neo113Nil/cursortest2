package S5;

import f6.InterfaceC0406a;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements Map.Entry, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final i f2524d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2525e;

    /* renamed from: i, reason: collision with root package name */
    public final int f2526i;

    public h(i map, int i2) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f2524d = map;
        this.f2525e = i2;
        this.f2526i = map.f2536p;
    }

    public final void a() {
        if (this.f2524d.f2536p != this.f2526i) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f2524d.f2529d[this.f2525e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f2524d.f2530e;
        Intrinsics.b(objArr);
        return objArr[this.f2525e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        i iVar = this.f2524d;
        iVar.c();
        Object[] objArr = iVar.f2530e;
        if (objArr == null) {
            int length = iVar.f2529d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            iVar.f2530e = objArr;
        }
        int i2 = this.f2525e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
