package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ok implements kk {

    /* renamed from: f, reason: collision with root package name */
    private final kk[] f9691f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<kk> f9692g;

    /* renamed from: i, reason: collision with root package name */
    private jk f9694i;

    /* renamed from: j, reason: collision with root package name */
    private Cif f9695j;

    /* renamed from: l, reason: collision with root package name */
    private nk f9697l;

    /* renamed from: h, reason: collision with root package name */
    private final hf f9693h = new hf();

    /* renamed from: k, reason: collision with root package name */
    private int f9696k = -1;

    public ok(kk... kkVarArr) {
        this.f9691f = kkVarArr;
        this.f9692g = new ArrayList<>(Arrays.asList(kkVarArr));
    }

    static /* bridge */ /* synthetic */ void c(ok okVar, int i7, Cif cif, Object obj) {
        nk nkVar;
        if (okVar.f9697l == null) {
            for (int i8 = 0; i8 <= 0; i8++) {
                cif.g(i8, okVar.f9693h, false);
            }
            int i9 = okVar.f9696k;
            if (i9 == -1) {
                okVar.f9696k = 1;
            } else if (i9 != 1) {
                nkVar = new nk(1);
                okVar.f9697l = nkVar;
            }
            nkVar = null;
            okVar.f9697l = nkVar;
        }
        if (okVar.f9697l != null) {
            return;
        }
        okVar.f9692g.remove(okVar.f9691f[i7]);
        if (i7 == 0) {
            okVar.f9695j = cif;
        }
        if (okVar.f9692g.isEmpty()) {
            okVar.f9694i.c(okVar.f9695j, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void a(me meVar, boolean z6, jk jkVar) {
        this.f9694i = jkVar;
        int i7 = 0;
        while (true) {
            kk[] kkVarArr = this.f9691f;
            if (i7 >= kkVarArr.length) {
                return;
            }
            kkVarArr[i7].a(meVar, false, new mk(this, i7));
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void b(ik ikVar) {
        lk lkVar = (lk) ikVar;
        int i7 = 0;
        while (true) {
            kk[] kkVarArr = this.f9691f;
            if (i7 >= kkVarArr.length) {
                return;
            }
            kkVarArr[i7].b(lkVar.f7998f[i7]);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final ik d(int i7, wl wlVar) {
        int length = this.f9691f.length;
        ik[] ikVarArr = new ik[length];
        for (int i8 = 0; i8 < length; i8++) {
            ikVarArr[i8] = this.f9691f[i8].d(i7, wlVar);
        }
        return new lk(ikVarArr);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void g() {
        for (kk kkVar : this.f9691f) {
            kkVar.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void zza() {
        nk nkVar = this.f9697l;
        if (nkVar != null) {
            throw nkVar;
        }
        for (kk kkVar : this.f9691f) {
            kkVar.zza();
        }
    }
}
