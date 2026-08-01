package j2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2333a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final r f2334b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2335d;

    public q(r rVar, androidx.emoji2.text.s sVar) {
        this.f2334b = rVar;
        TypedArray typedArray = (TypedArray) sVar.c;
        this.c = typedArray.getResourceId(28, 0);
        this.f2335d = typedArray.getResourceId(53, 0);
    }
}
