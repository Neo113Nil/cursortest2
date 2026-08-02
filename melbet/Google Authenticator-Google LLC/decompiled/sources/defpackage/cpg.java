package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cpg extends cpi {
    public final int a;
    public final Bundle b;
    final /* synthetic */ cpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpg(cpo cpoVar, int i, Bundle bundle) {
        super(cpoVar, true);
        this.c = cpoVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(clg clgVar);

    protected abstract boolean b();

    @Override // defpackage.cpi
    protected final /* bridge */ /* synthetic */ void c() {
        cpo cpoVar = this.c;
        int i = this.a;
        if (i != 0) {
            cpoVar.H(1, null);
            Bundle bundle = this.b;
            a(new clg(1, i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null, null));
        } else {
            if (b()) {
                return;
            }
            cpoVar.H(1, null);
            a(new clg(1, 8, null, null, null));
        }
    }
}
