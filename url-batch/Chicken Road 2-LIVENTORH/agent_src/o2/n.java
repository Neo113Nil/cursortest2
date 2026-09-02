package o2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2908a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final o f2909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2910c;
    public final int d;

    public n(o oVar, androidx.emoji2.text.t tVar) {
        this.f2909b = oVar;
        TypedArray typedArray = (TypedArray) tVar.f356c;
        this.f2910c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}
