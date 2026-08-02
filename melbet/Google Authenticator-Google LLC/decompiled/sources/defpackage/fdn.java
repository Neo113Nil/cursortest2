package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdn extends fdo implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public fdn(fde fdeVar) {
        super(fdeVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.fdo
    protected final void d(fde fdeVar) {
        try {
            CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            Object obj = fdeVar.c;
            ((fdf) obj).d.o();
            try {
                Cursor rawQueryWithFactory = ((fdf) obj).a.rawQueryWithFactory(new fdr((Object[]) fdeVar.a), (String) fdeVar.b, null, null, cancellationSignal);
                try {
                    if (!isCancelled() && rawQueryWithFactory != null) {
                        rawQueryWithFactory.getCount();
                    }
                    if (o(rawQueryWithFactory)) {
                        return;
                    }
                    a.r(rawQueryWithFactory);
                } catch (Throwable th) {
                    try {
                        p(th);
                        if (o(rawQueryWithFactory)) {
                            return;
                        }
                        a.r(rawQueryWithFactory);
                    } finally {
                    }
                }
            } finally {
                ((fdf) fdeVar.c).d.n();
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
