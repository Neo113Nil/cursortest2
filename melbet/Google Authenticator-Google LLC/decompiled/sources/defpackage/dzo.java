package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzo extends ehm {
    private final dzu a;
    private final cbp e;
    private final fwm f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dzo(fwm fwmVar, dzu dzuVar, cbp cbpVar, ExecutorService executorService) {
        super(r0.a());
        executorService.getClass();
        eq eqVar = new eq(new dzn());
        eqVar.a = executorService;
        this.f = fwmVar;
        this.a = dzuVar;
        this.e = cbpVar;
    }

    @Override // defpackage.kr
    public final int b(int i) {
        jib jibVar = (jib) u(i);
        if (jibVar instanceof jic) {
            return 0;
        }
        if (jibVar instanceof jid) {
            return 1;
        }
        throw new koj();
    }

    @Override // defpackage.kr
    public final lp d(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f.G(viewGroup);
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected card type");
        }
        cbp cbpVar = this.e;
        Context context = viewGroup.getContext();
        context.getClass();
        eaj eajVar = new eaj(context);
        fwm fwmVar = (fwm) cbpVar.a;
        eajVar.a(fwmVar.G(eajVar).t, fwmVar.G(eajVar).t);
        return new lp(eajVar);
    }

    @Override // defpackage.kr
    public final void k(lp lpVar, int i) {
        lpVar.getClass();
        jib jibVar = (jib) u(i);
        if (jibVar instanceof jic) {
            this.a.c((dzv) lpVar, ((jic) jibVar).a);
        } else {
            if (!(jibVar instanceof jid)) {
                throw new koj();
            }
            throw null;
        }
    }
}
