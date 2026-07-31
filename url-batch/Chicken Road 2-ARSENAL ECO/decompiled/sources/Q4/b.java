package Q4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b extends HashMap implements V3.c {

    /* renamed from: f, reason: collision with root package name */
    public final long f2010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2011g;

    /* renamed from: h, reason: collision with root package name */
    public int f2012h = 0;

    public b(long j4, int i7) {
        this.f2010f = j4;
        this.f2011g = i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(a4.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f2012h++;
        if (size() < this.f2010f || containsKey(eVar)) {
            return super.put(eVar, i6.g.b(this.f2011g, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return "AttributesMap{data=" + super.toString() + ", capacity=" + this.f2010f + ", totalAddedValues=" + this.f2012h + '}';
    }
}
