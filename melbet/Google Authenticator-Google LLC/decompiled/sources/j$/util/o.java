package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class o extends j implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new j(this.b);
    }

    @Override // j$.util.j, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new o(this.b.subList(i, i2));
    }
}
