package P0;

import K.C0011l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f625a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final p f626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f627c;
    public final int d;

    public o(p pVar, C0011l c0011l) {
        this.f626b = pVar;
        TypedArray typedArray = (TypedArray) c0011l.f405c;
        this.f627c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
