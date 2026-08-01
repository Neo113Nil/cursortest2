package K0;

import K.C0012l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f518a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f520c;
    public final int d;

    public p(q qVar, C0012l c0012l) {
        this.f519b = qVar;
        TypedArray typedArray = (TypedArray) c0012l.f432c;
        this.f520c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
