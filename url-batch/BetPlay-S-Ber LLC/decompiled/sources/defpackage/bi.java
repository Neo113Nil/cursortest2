package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bi {
    public final SparseArray a = new SparseArray();
    public final ci b;
    public final int c;
    public final int d;

    public bi(ci ciVar, r6 r6Var) {
        this.b = ciVar;
        TypedArray typedArray = (TypedArray) r6Var.b;
        this.c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}
