package t0;

import T.X;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436k extends X {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f15318A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f15319B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f15320C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f15321D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f15322E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15323w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15324x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15325y;
    public final boolean z;

    public C1436k(l lVar) {
        a(lVar);
        this.f15323w = lVar.f15332w;
        this.f15324x = lVar.f15333x;
        this.f15325y = lVar.f15334y;
        this.z = lVar.z;
        this.f15318A = lVar.f15327A;
        this.f15319B = lVar.f15328B;
        this.f15320C = lVar.f15329C;
        SparseArray sparseArray = lVar.f15330D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            sparseArray2.put(sparseArray.keyAt(i4), new HashMap((Map) sparseArray.valueAt(i4)));
        }
        this.f15321D = sparseArray2;
        this.f15322E = lVar.f15331E.clone();
    }

    public C1436k() {
        this.f15321D = new SparseArray();
        this.f15322E = new SparseBooleanArray();
        this.f15323w = true;
        this.f15324x = true;
        this.f15325y = true;
        this.z = true;
        this.f15318A = true;
        this.f15319B = true;
        this.f15320C = true;
    }
}
