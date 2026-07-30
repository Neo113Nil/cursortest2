package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tw1 extends h0 implements RandomAccess {
    public static final /* synthetic */ int n = 0;

    @Override // defpackage.b0
    public final int a() {
        throw null;
    }

    @Override // defpackage.b0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof dr) {
            return super.contains((dr) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // defpackage.h0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof dr) {
            return super.indexOf((dr) obj);
        }
        return -1;
    }

    @Override // defpackage.h0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof dr) {
            return super.lastIndexOf((dr) obj);
        }
        return -1;
    }
}
