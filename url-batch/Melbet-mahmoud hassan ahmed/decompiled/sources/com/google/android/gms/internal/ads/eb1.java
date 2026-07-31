package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class eb1 implements he1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4550a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<vt1> f4551b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f4552c;

    /* renamed from: d, reason: collision with root package name */
    private li1 f4553d;

    protected eb1(boolean z6) {
        this.f4550a = z6;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void j(vt1 vt1Var) {
        Objects.requireNonNull(vt1Var);
        if (this.f4551b.contains(vt1Var)) {
            return;
        }
        this.f4551b.add(vt1Var);
        this.f4552c++;
    }

    protected final void o(int i7) {
        li1 li1Var = this.f4553d;
        int i8 = n13.f8865a;
        for (int i9 = 0; i9 < this.f4552c; i9++) {
            this.f4551b.get(i9).e(this, li1Var, this.f4550a, i7);
        }
    }

    protected final void p() {
        li1 li1Var = this.f4553d;
        int i7 = n13.f8865a;
        for (int i8 = 0; i8 < this.f4552c; i8++) {
            this.f4551b.get(i8).i(this, li1Var, this.f4550a);
        }
        this.f4553d = null;
    }

    protected final void q(li1 li1Var) {
        for (int i7 = 0; i7 < this.f4552c; i7++) {
            this.f4551b.get(i7).a(this, li1Var, this.f4550a);
        }
    }

    protected final void r(li1 li1Var) {
        this.f4553d = li1Var;
        for (int i7 = 0; i7 < this.f4552c; i7++) {
            this.f4551b.get(i7).v(this, li1Var, this.f4550a);
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public /* synthetic */ Map zza() {
        return Collections.emptyMap();
    }
}
