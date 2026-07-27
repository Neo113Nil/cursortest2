package z3;

import java.util.RandomAccess;
import z2.AbstractC1420d;

/* loaded from: classes.dex */
public final class u extends AbstractC1420d implements RandomAccess {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12034j = 0;

    /* renamed from: e, reason: collision with root package name */
    public final C1451i[] f12035e;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f12036i;

    public u(C1451i[] c1451iArr, int[] iArr) {
        this.f12035e = c1451iArr;
        this.f12036i = iArr;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1451i) {
            return super.contains((C1451i) obj);
        }
        return false;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f12035e.length;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f12035e[i2];
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1451i) {
            return super.indexOf((C1451i) obj);
        }
        return -1;
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1451i) {
            return super.lastIndexOf((C1451i) obj);
        }
        return -1;
    }
}
