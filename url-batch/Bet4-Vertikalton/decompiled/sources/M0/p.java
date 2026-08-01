package M0;

import K.C0014l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f601a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f603c;
    public final int d;

    public p(q qVar, C0014l c0014l) {
        this.f602b = qVar;
        TypedArray typedArray = (TypedArray) c0014l.f475b;
        this.f603c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
