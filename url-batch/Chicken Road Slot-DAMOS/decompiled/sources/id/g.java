package id;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements Map.Entry, xd.d {

    /* renamed from: d, reason: collision with root package name */
    public final h f4691d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4692e;

    /* renamed from: i, reason: collision with root package name */
    public final int f4693i;

    public g(h hVar, int i3) {
        hVar.getClass();
        this.f4691d = hVar;
        this.f4692e = i3;
        this.f4693i = hVar.f4701v;
    }

    public final void a() {
        if (this.f4691d.f4701v != this.f4693i) {
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
        return this.f4691d.f4694d[this.f4692e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f4691d.f4695e;
        objArr.getClass();
        return objArr[this.f4692e];
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
        h hVar = this.f4691d;
        hVar.c();
        Object[] objArr = hVar.f4695e;
        if (objArr == null) {
            int length = hVar.f4694d.length;
            if (length < 0) {
                a1.e("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            hVar.f4695e = objArr;
        }
        int i3 = this.f4692e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
