package K0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f569a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f571c;

    /* renamed from: d, reason: collision with root package name */
    public final int f572d;

    public p(q qVar, T.r rVar) {
        this.f570b = qVar;
        TypedArray typedArray = (TypedArray) rVar.f812c;
        this.f571c = typedArray.getResourceId(28, 0);
        this.f572d = typedArray.getResourceId(52, 0);
    }
}
