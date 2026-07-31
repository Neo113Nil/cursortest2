package Q4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends HashMap implements W3.b {

    /* renamed from: f, reason: collision with root package name */
    public final long f2020f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2021g;

    /* renamed from: h, reason: collision with root package name */
    public int f2022h = 0;

    public g(long j4, int i7) {
        this.f2020f = j4;
        this.f2021g = i7;
    }

    public final W3.a a() {
        j jVar = new j(1);
        super.forEach(new I4.a(2, jVar));
        return jVar.b();
    }

    @Override // W3.b
    public final V3.c b() {
        j jVar = new j(1);
        super.forEach(new I4.a(2, jVar));
        return jVar.b().b();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(X3.a aVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f2022h++;
        if (size() < this.f2020f || containsKey(aVar)) {
            return super.put(aVar, i6.g.b(this.f2021g, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return "ExtendedAttributesMap{data=" + super.toString() + ", capacity=" + this.f2020f + ", totalAddedValues=" + this.f2022h + '}';
    }
}
