package L0;

import K.C0011l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f526a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f528c;
    public final int d;

    public p(q qVar, C0011l c0011l) {
        this.f527b = qVar;
        TypedArray typedArray = (TypedArray) c0011l.f416c;
        this.f528c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
