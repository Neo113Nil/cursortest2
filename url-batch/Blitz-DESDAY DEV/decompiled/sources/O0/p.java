package O0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f688a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f690c;
    public final int d;

    public p(q qVar, A1.j jVar) {
        this.f689b = qVar;
        TypedArray typedArray = (TypedArray) jVar.f81c;
        this.f690c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
