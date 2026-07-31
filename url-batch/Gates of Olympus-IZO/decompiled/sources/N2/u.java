package N2;

import M1.AbstractC0143d;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class u extends AbstractC0143d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final C0153i[] f2964d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2965e;

    public u(C0153i[] c0153iArr, int[] iArr) {
        this.f2964d = c0153iArr;
        this.f2965e = iArr;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2964d.length;
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0153i) {
            return super.contains((C0153i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return this.f2964d[i3];
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0153i) {
            return super.indexOf((C0153i) obj);
        }
        return -1;
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0153i) {
            return super.lastIndexOf((C0153i) obj);
        }
        return -1;
    }
}
