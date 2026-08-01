package n2;

import java.util.RandomAccess;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final c f2948f;
    public final int g;
    public final int h;

    public b(c cVar, int i4, int i5) {
        this.f2948f = cVar;
        this.g = i4;
        m0.a.h(i4, i5, cVar.a());
        this.h = i5 - i4;
    }

    @Override // n2.c
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        int i5 = this.h;
        if (i4 >= 0 && i4 < i5) {
            return this.f2948f.get(this.g + i4);
        }
        throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
    }
}
