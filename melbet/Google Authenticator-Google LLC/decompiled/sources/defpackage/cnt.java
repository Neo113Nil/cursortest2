package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cnt extends col implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final cll d;

    public cnt(com comVar, cll cllVar) {
        super(comVar);
        this.b = new AtomicReference(null);
        this.c = new gbg(Looper.getMainLooper(), (byte[]) null);
        this.d = cllVar;
    }

    private static final int k(bsh bshVar) {
        if (bshVar == null) {
            return -1;
        }
        return bshVar.a;
    }

    public final void a(clg clgVar, int i) {
        this.b.set(null);
        e(clgVar, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.col
    public final void c(int i, int i2, Intent intent) {
        bsh bshVar = (bsh) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int k = this.d.k(l());
                if (k == 0) {
                    b();
                    return;
                } else {
                    if (bshVar == null) {
                        return;
                    }
                    if (((clg) bshVar.b).c == 18 && k == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (bshVar != null) {
                a(new clg(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((clg) bshVar.b).toString(), null), k(bshVar));
                return;
            }
            return;
        }
        if (bshVar != null) {
            a((clg) bshVar.b, bshVar.a);
        }
    }

    @Override // defpackage.col
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new bsh(new clg(1, bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null, null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(clg clgVar, int i);

    protected abstract void f();

    @Override // defpackage.col
    public final void g(Bundle bundle) {
        bsh bshVar = (bsh) this.b.get();
        if (bshVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", bshVar.a);
        clg clgVar = (clg) bshVar.b;
        bundle.putInt("failed_status", clgVar.c);
        bundle.putParcelable("failed_resolution", clgVar.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new clg(1, 13, null, null, null), k((bsh) this.b.get()));
    }
}
