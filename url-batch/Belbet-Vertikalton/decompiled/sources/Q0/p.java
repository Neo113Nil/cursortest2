package Q0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1039a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f1040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1042d;

    public p(q qVar, I0.h hVar) {
        this.f1040b = qVar;
        TypedArray typedArray = (TypedArray) hVar.f592c;
        this.f1041c = typedArray.getResourceId(28, 0);
        this.f1042d = typedArray.getResourceId(52, 0);
    }
}
