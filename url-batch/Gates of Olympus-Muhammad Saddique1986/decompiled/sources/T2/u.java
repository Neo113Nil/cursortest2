package T2;

import S1.AbstractC0225d;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class u extends AbstractC0225d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final C0234i[] f4444d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4445e;

    public u(C0234i[] c0234iArr, int[] iArr) {
        this.f4444d = c0234iArr;
        this.f4445e = iArr;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f4444d.length;
    }

    @Override // S1.AbstractC0222a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0234i) {
            return super.contains((C0234i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return this.f4444d[i3];
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0234i) {
            return super.indexOf((C0234i) obj);
        }
        return -1;
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0234i) {
            return super.lastIndexOf((C0234i) obj);
        }
        return -1;
    }
}
