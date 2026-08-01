package L0;

import K.C0011l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f538a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f540c;
    public final int d;

    public p(q qVar, C0011l c0011l) {
        this.f539b = qVar;
        TypedArray typedArray = (TypedArray) c0011l.f423c;
        this.f540c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
