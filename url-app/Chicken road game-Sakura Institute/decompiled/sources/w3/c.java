package w3;

import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final int f9507f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9508g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9509h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9510i;

    public c(int i7, int i8, String str, String str2) {
        this.f9507f = i7;
        this.f9508g = i8;
        this.f9509h = str;
        this.f9510i = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        k.f(cVar, "other");
        int i7 = this.f9507f - cVar.f9507f;
        return i7 == 0 ? this.f9508g - cVar.f9508g : i7;
    }
}
