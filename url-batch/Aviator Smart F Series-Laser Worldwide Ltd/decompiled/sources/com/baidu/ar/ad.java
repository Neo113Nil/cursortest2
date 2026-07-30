package com.baidu.ar;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ad extends d0 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<y6> f1638a;

    /* renamed from: b, reason: collision with root package name */
    public z6 f1639b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<y6> weakReference = this.f1638a;
        if (weakReference != null) {
            weakReference.clear();
            this.f1638a = null;
        }
        this.f1639b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof y6) {
            y6 y6Var = (y6) c0Var;
            this.f1638a = new WeakReference<>(y6Var);
            z6 z6Var = this.f1639b;
            if (z6Var != null) {
                y6Var.a(z6Var);
            }
        }
    }

    @Override // com.baidu.ar.y6
    public void a(z6 z6Var) {
        WeakReference<y6> weakReference;
        this.f1639b = z6Var;
        if (z6Var == null || (weakReference = this.f1638a) == null || weakReference.get() == null) {
            return;
        }
        this.f1638a.get().a(this.f1639b);
    }
}
