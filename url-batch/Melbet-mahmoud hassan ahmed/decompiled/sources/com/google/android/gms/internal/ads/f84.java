package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f84 extends kp0 {

    /* renamed from: k, reason: collision with root package name */
    private boolean f5037k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5038l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5039m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5040n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5041o;

    /* renamed from: p, reason: collision with root package name */
    private final SparseArray<Map<hm0, h84>> f5042p;

    /* renamed from: q, reason: collision with root package name */
    private final SparseBooleanArray f5043q;

    @Deprecated
    public f84() {
        this.f5042p = new SparseArray<>();
        this.f5043q = new SparseBooleanArray();
        u();
    }

    public f84(Context context) {
        super.d(context);
        Point d02 = n13.d0(context);
        e(d02.x, d02.y, true);
        this.f5042p = new SparseArray<>();
        this.f5043q = new SparseBooleanArray();
        u();
    }

    /* synthetic */ f84(d84 d84Var, e84 e84Var) {
        super(d84Var);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.f5037k = d84Var.C;
        this.f5038l = d84Var.E;
        this.f5039m = d84Var.F;
        this.f5040n = d84Var.J;
        this.f5041o = d84Var.L;
        sparseArray = d84Var.M;
        SparseArray<Map<hm0, h84>> sparseArray2 = new SparseArray<>();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
        }
        this.f5042p = sparseArray2;
        sparseBooleanArray = d84Var.N;
        this.f5043q = sparseBooleanArray.clone();
    }

    private final void u() {
        this.f5037k = true;
        this.f5038l = true;
        this.f5039m = true;
        this.f5040n = true;
        this.f5041o = true;
    }

    @Override // com.google.android.gms.internal.ads.kp0
    public final /* synthetic */ kp0 e(int i7, int i8, boolean z6) {
        super.e(i7, i8, true);
        return this;
    }

    public final f84 o(int i7, boolean z6) {
        if (this.f5043q.get(i7) == z6) {
            return this;
        }
        if (z6) {
            this.f5043q.put(i7, true);
        } else {
            this.f5043q.delete(i7);
        }
        return this;
    }
}
