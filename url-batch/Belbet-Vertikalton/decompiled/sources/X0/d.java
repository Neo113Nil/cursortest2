package X0;

import G1.AbstractC0001b;
import a.AbstractC0058a;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final e f1373a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1375c;

    public d(e eVar, int i, int i2) {
        j1.h.e(eVar, "list");
        this.f1373a = eVar;
        this.f1374b = i;
        AbstractC0058a.j(i, i2, eVar.a());
        this.f1375c = i2 - i;
    }

    @Override // X0.e
    public final int a() {
        return this.f1375c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1375c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1373a.get(this.f1374b + i);
    }
}
