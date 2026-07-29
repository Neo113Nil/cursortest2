package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.RunnableC0317c;
import com.chartboost.sdk.impl.e.a;

/* loaded from: classes.dex */
class d implements com.chartboost.sdk.Model.d {

    /* renamed from: a, reason: collision with root package name */
    private final e f3814a;

    /* renamed from: b, reason: collision with root package name */
    private final f f3815b;

    d(e eVar, f fVar) {
        this.f3814a = eVar;
        this.f3815b = fVar;
    }

    @Override // com.chartboost.sdk.Model.d
    public void a(com.chartboost.sdk.Model.c cVar) {
        cVar.l = 1;
        if (this.f3814a.f.f(this.f3815b.f3831b)) {
            this.f3814a.e.a(cVar);
            if (this.f3814a.f.f3806a != 0 || cVar.n == 1 || cVar.p.f3611b == 1) {
                return;
            }
            c(cVar);
            return;
        }
        e eVar = this.f3814a;
        eVar.getClass();
        this.f3814a.f3816a.execute(eVar.new a(7, this.f3815b.f3831b, this.f3815b, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void b(com.chartboost.sdk.Model.c cVar) {
        e eVar = this.f3814a;
        eVar.getClass();
        this.f3814a.f3816a.execute(eVar.new a(7, this.f3815b.f3831b, this.f3815b, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void c(com.chartboost.sdk.Model.c cVar) {
        cVar.r = true;
        e eVar = this.f3814a;
        eVar.getClass();
        this.f3814a.f3816a.execute(eVar.new a(5, this.f3815b.f3831b, this.f3815b, null));
    }

    @Override // com.chartboost.sdk.Model.d
    public void a(com.chartboost.sdk.Model.c cVar, CBError.CBImpressionError cBImpressionError) {
        com.chartboost.sdk.c cVar2 = this.f3814a.e;
        cVar2.getClass();
        c.RunnableC0317c runnableC0317c = cVar2.new RunnableC0317c(11);
        runnableC0317c.f3642d = cVar;
        com.chartboost.sdk.h.b(runnableC0317c);
        e eVar = this.f3814a;
        eVar.getClass();
        this.f3814a.f3816a.execute(eVar.new a(6, this.f3815b.f3831b, this.f3815b, cBImpressionError));
    }
}
