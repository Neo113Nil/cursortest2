package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f5 {
    public final g5 a;
    public xh b;
    public Function0 c;

    public f5(g5 compositeCloseChipView) {
        Intrinsics.checkNotNullParameter(compositeCloseChipView, "compositeCloseChipView");
        this.a = compositeCloseChipView;
    }

    public final xh b() {
        return this.b;
    }

    public final void e() {
        xh xhVar = this.b;
        if (xhVar != null) {
            xhVar.g();
        }
    }

    public final void c() {
        xh xhVar = this.b;
        if (xhVar != null) {
            xhVar.e();
        }
    }

    public final void d() {
        xh xhVar = this.b;
        if (xhVar != null) {
            xhVar.f();
        }
    }

    public final void a() {
        xh xhVar = this.b;
        if (xhVar != null) {
            xhVar.a();
        }
    }

    public final void a(long j, ai mode, String str, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c = function0;
        xh xhVar = this.b;
        if (xhVar != null) {
            xhVar.a();
        }
        xh xhVar2 = new xh(j, this.c);
        xhVar2.a(this.a.getTimerChipView());
        xhVar2.a(mode, str, str2);
        this.b = xhVar2;
    }

    public static /* synthetic */ void a(f5 f5Var, long j, ai aiVar, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            aiVar = ai.c;
        }
        f5Var.a(j, aiVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : function0);
    }
}
