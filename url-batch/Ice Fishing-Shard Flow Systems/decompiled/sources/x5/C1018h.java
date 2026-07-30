package x5;

import java.util.HashMap;
import z1.AbstractC1053a;

/* renamed from: x5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018h extends HashMap implements D4.b {

    /* renamed from: d, reason: collision with root package name */
    public final long f8385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8386e;

    /* renamed from: i, reason: collision with root package name */
    public int f8387i = 0;

    public C1018h(long j, int i2) {
        this.f8385d = j;
        this.f8386e = i2;
    }

    public final D4.a a() {
        C4.d dVar = new C4.d(1);
        super.forEach(new C4.c(1, dVar));
        return dVar.c();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(E4.a aVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f8387i++;
        if (size() < this.f8385d || containsKey(aVar)) {
            return super.put(aVar, AbstractC1053a.d(this.f8386e, obj));
        }
        return null;
    }

    @Override // D4.b
    public final C4.f c() {
        C4.d dVar = new C4.d(1);
        super.forEach(new C4.c(1, dVar));
        return dVar.c().c();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return "ExtendedAttributesMap{data=" + super.toString() + ", capacity=" + this.f8385d + ", totalAddedValues=" + this.f8387i + '}';
    }
}
