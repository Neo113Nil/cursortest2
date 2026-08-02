package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ar extends bd implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler aj;
    private boolean ao;
    private boolean aq;
    private boolean ar;
    private boolean as;
    public Dialog e;
    private final Runnable ak = new as(this, 1);
    private final DialogInterface.OnCancelListener al = new bsx(this, 1);
    public final DialogInterface.OnDismissListener a = new ap(this);
    public int b = 0;
    public int c = 0;
    private boolean am = true;
    public boolean d = true;
    private int an = -1;
    private final afd ap = new pr(this, 1);
    public boolean f = false;

    public Dialog a(Bundle bundle) {
        if (by.U(3)) {
            toString();
        }
        return new nh(y(), this.c);
    }

    @Override // defpackage.bd
    public final bi bu() {
        return new aq(this, new ay(this));
    }

    @Override // defpackage.bd
    public LayoutInflater bv(Bundle bundle) {
        LayoutInflater at = at();
        if (this.d && !this.ao) {
            if (!this.f) {
                try {
                    this.ao = true;
                    Dialog a = a(bundle);
                    this.e = a;
                    if (this.d) {
                        n(a, this.b);
                        Context x = x();
                        if (x instanceof Activity) {
                            this.e.setOwnerActivity((Activity) x);
                        }
                        this.e.setCancelable(this.am);
                        this.e.setOnCancelListener(this.al);
                        this.e.setOnDismissListener(this.a);
                        this.f = true;
                    } else {
                        this.e = null;
                    }
                } finally {
                    this.ao = false;
                }
            }
            if (by.U(2)) {
                toString();
            }
            Dialog dialog = this.e;
            if (dialog != null) {
                return at.cloneInContext(dialog.getContext());
            }
        } else if (by.U(2)) {
            toString();
        }
        return at;
    }

    public void d() {
        q(false, false);
    }

    @Override // defpackage.bd
    public void e(Context context) {
        super.e(context);
        this.ac.e(this.ap);
        if (this.as) {
            return;
        }
        this.ar = false;
    }

    @Override // defpackage.bd
    public void f(Bundle bundle) {
        super.f(bundle);
        this.aj = new Handler();
        this.d = this.H == 0;
        if (bundle != null) {
            this.b = bundle.getInt("android:style", 0);
            this.c = bundle.getInt("android:theme", 0);
            this.am = bundle.getBoolean("android:cancelable", true);
            this.d = bundle.getBoolean("android:showsDialog", this.d);
            this.an = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.bd
    public void g() {
        super.g();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.aq = true;
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!this.ar) {
                onDismiss(this.e);
            }
            this.e = null;
            this.f = false;
        }
    }

    @Override // defpackage.bd
    public void h() {
        super.h();
        if (!this.as && !this.ar) {
            this.ar = true;
        }
        this.ac.h(this.ap);
    }

    @Override // defpackage.bd
    public void i(Bundle bundle) {
        Dialog dialog = this.e;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.b;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.am) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.d) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.an;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.bd
    public void j() {
        super.j();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.aq = false;
            dialog.show();
            View decorView = this.e.getWindow().getDecorView();
            yl.d(decorView, this);
            ym.j(decorView, this);
            yi.i(decorView, this);
        }
    }

    @Override // defpackage.bd
    public void k() {
        super.k();
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.bd
    public void l(Bundle bundle) {
        Bundle bundle2;
        super.l(bundle);
        if (this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.bd
    public final void m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m(layoutInflater, viewGroup, bundle);
        if (this.R != null || this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    public void n(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void o(by byVar, String str) {
        this.ar = false;
        this.as = true;
        ae aeVar = new ae(byVar);
        aeVar.n();
        aeVar.d(0, this, str, 1);
        aeVar.h(false, true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.aq) {
            return;
        }
        if (by.U(3)) {
            toString();
        }
        q(true, true);
    }

    public final void p(by byVar, String str) {
        this.ar = false;
        this.as = true;
        ae aeVar = new ae(byVar);
        aeVar.n();
        aeVar.d(0, this, str, 1);
        aeVar.c();
    }

    public final void q(boolean z, boolean z2) {
        if (this.ar) {
            return;
        }
        this.ar = true;
        this.as = false;
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.aj.getLooper()) {
                    onDismiss(this.e);
                } else {
                    this.aj.post(this.ak);
                }
            }
        }
        this.aq = true;
        if (this.an >= 0) {
            by G = G();
            int i = this.an;
            if (i < 0) {
                throw new IllegalArgumentException(a.Y(i, "Bad id: "));
            }
            G.F(new bw(G, i), z);
            this.an = -1;
            return;
        }
        ae aeVar = new ae(G());
        aeVar.n();
        aeVar.i(this);
        if (z) {
            aeVar.h(true, true);
        } else {
            aeVar.h(false, true);
        }
    }

    public final void r() {
        this.am = true;
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
