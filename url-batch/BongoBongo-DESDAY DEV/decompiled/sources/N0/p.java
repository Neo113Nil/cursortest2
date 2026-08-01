package N0;

import L.C0014l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f675a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f677c;
    public final int d;

    public p(q qVar, C0014l c0014l) {
        this.f676b = qVar;
        TypedArray typedArray = (TypedArray) c0014l.f543b;
        this.f677c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
