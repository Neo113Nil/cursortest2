package K0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f568a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f571d;

    public p(q qVar, T.r rVar) {
        this.f569b = qVar;
        TypedArray typedArray = (TypedArray) rVar.f811c;
        this.f570c = typedArray.getResourceId(28, 0);
        this.f571d = typedArray.getResourceId(52, 0);
    }
}
