package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class up implements h60 {
    public final lm f;
    public boolean g;
    public final /* synthetic */ yp h;

    public up(yp ypVar) {
        this.h = ypVar;
        f90 a = ypVar.c.a();
        a.getClass();
        lm lmVar = new lm();
        lmVar.e = a;
        this.f = lmVar;
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.f;
    }

    @Override // defpackage.h60
    public long b(long j, h9 h9Var) {
        yp ypVar = this.h;
        h9Var.getClass();
        try {
            return ypVar.c.b(j, h9Var);
        } catch (IOException e) {
            ypVar.b.k();
            this.f();
            throw e;
        }
    }

    public final void f() {
        yp ypVar = this.h;
        int i = ypVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + ypVar.e);
        }
        lm lmVar = this.f;
        f90 f90Var = lmVar.e;
        lmVar.e = f90.d;
        f90Var.a();
        f90Var.b();
        ypVar.e = 6;
    }
}
