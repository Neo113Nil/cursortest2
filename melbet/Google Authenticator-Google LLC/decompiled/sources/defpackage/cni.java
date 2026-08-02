package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cni extends cnn {
    protected final cnq a;

    public cni(int i, cnq cnqVar) {
        super(i);
        this.a = cnqVar;
    }

    @Override // defpackage.cnn
    public final void f(Status status) {
        try {
            this.a.h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.cnn
    public final void g(Exception exc) {
        try {
            this.a.h(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.cnn
    public final void h(coc cocVar) {
        try {
            this.a.g(cocVar.b);
        } catch (RuntimeException e) {
            g(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cnn
    public final void i(fwm fwmVar, boolean z) {
        cnq cnqVar = this.a;
        fwmVar.a.put(cnqVar, Boolean.valueOf(z));
        cnqVar.c(new cqz(fwmVar, cnqVar, 1));
    }
}
