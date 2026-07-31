package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ld2 implements ij2<md2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f7935a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7936b;

    /* renamed from: c, reason: collision with root package name */
    private final ks2 f7937c;

    /* renamed from: d, reason: collision with root package name */
    private final View f7938d;

    public ld2(dc3 dc3Var, Context context, ks2 ks2Var, ViewGroup viewGroup) {
        this.f7935a = dc3Var;
        this.f7936b = context;
        this.f7937c = ks2Var;
        this.f7938d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<md2> a() {
        return this.f7935a.E(new Callable() { // from class: com.google.android.gms.internal.ads.kd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ld2.this.b();
            }
        });
    }

    final /* synthetic */ md2 b() {
        Context context = this.f7936b;
        pv pvVar = this.f7937c.f7619e;
        ArrayList arrayList = new ArrayList();
        View view = this.f7938d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new md2(context, pvVar, arrayList);
    }
}
