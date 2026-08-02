package v2;

import java.util.Map;

/* renamed from: v2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473u extends AbstractC1466m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15676a;

    /* renamed from: b, reason: collision with root package name */
    public int f15677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1474v f15678c;

    public C1473u(C1474v c1474v, int i4) {
        this.f15678c = c1474v;
        Object obj = C1474v.f15679j;
        this.f15676a = c1474v.j()[i4];
        this.f15677b = i4;
    }

    public final void a() {
        int i4 = this.f15677b;
        Object obj = this.f15676a;
        C1474v c1474v = this.f15678c;
        if (i4 != -1 && i4 < c1474v.size()) {
            if (V3.b.n(obj, c1474v.j()[this.f15677b])) {
                return;
            }
        }
        Object obj2 = C1474v.f15679j;
        this.f15677b = c1474v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15676a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1474v c1474v = this.f15678c;
        Map c4 = c1474v.c();
        if (c4 != null) {
            return c4.get(this.f15676a);
        }
        a();
        int i4 = this.f15677b;
        if (i4 == -1) {
            return null;
        }
        return c1474v.k()[i4];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1474v c1474v = this.f15678c;
        Map c4 = c1474v.c();
        Object obj2 = this.f15676a;
        if (c4 != null) {
            return c4.put(obj2, obj);
        }
        a();
        int i4 = this.f15677b;
        if (i4 == -1) {
            c1474v.put(obj2, obj);
            return null;
        }
        Object obj3 = c1474v.k()[i4];
        c1474v.k()[this.f15677b] = obj;
        return obj3;
    }
}
