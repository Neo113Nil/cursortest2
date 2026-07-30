package x5;

import java.util.HashMap;
import z1.AbstractC1053a;

/* renamed from: x5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012b extends HashMap implements C4.f {

    /* renamed from: d, reason: collision with root package name */
    public final long f8374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8375e;

    /* renamed from: i, reason: collision with root package name */
    public int f8376i = 0;

    public C1012b(long j, int i2) {
        this.f8374d = j;
        this.f8375e = i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(H4.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f8376i++;
        if (size() < this.f8374d || containsKey(eVar)) {
            return super.put(eVar, AbstractC1053a.d(this.f8375e, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return "AttributesMap{data=" + super.toString() + ", capacity=" + this.f8374d + ", totalAddedValues=" + this.f8376i + '}';
    }
}
