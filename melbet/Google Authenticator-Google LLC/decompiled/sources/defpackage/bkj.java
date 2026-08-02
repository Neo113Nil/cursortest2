package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkj implements Handler.Callback {
    private static final bki c = new bkh(0);
    public final bkb a;
    public final afr b;
    private volatile bah d;
    private final bki e;

    public bkj(bki bkiVar) {
        new qi();
        bkiVar = bkiVar == null ? c : bkiVar;
        this.e = bkiVar;
        this.b = new afr(bkiVar);
        boolean z = big.a;
        this.a = !big.a ? new bjy() : new bka();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final bah a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (bmi.i() && !(context instanceof Application)) {
            if (context instanceof bg) {
                return b((bg) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = this.e.a(azj.b(context.getApplicationContext()), new bju(), new bkf(), context.getApplicationContext());
                }
            }
        }
        return this.d;
    }

    public final bah b(bg bgVar) {
        if (bmi.h()) {
            return a(bgVar.getApplicationContext());
        }
        if (bgVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.a.a(bgVar);
        Activity c2 = c(bgVar);
        boolean z = true;
        if (c2 != null && c2.isFinishing()) {
            z = false;
        }
        azj b = azj.b(bgVar.getApplicationContext());
        afr afrVar = this.b;
        ael L = bgVar.L();
        bgVar.a();
        return afrVar.x(bgVar, b, L, z);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
