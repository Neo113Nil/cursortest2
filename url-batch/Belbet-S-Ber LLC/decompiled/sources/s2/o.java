package s2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f3270a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final p f3271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3272c;
    public final int d;

    public o(p pVar, androidx.emoji2.text.t tVar) {
        this.f3271b = pVar;
        TypedArray typedArray = (TypedArray) tVar.f473b;
        this.f3272c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}
