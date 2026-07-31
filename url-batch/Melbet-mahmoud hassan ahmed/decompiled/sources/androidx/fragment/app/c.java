package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: d0, reason: collision with root package name */
    private Handler f657d0;

    /* renamed from: e0, reason: collision with root package name */
    private Runnable f658e0 = new a();

    /* renamed from: f0, reason: collision with root package name */
    int f659f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    int f660g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f661h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    boolean f662i0 = true;

    /* renamed from: j0, reason: collision with root package name */
    int f663j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    Dialog f664k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f665l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f666m0;

    /* renamed from: n0, reason: collision with root package name */
    boolean f667n0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f664k0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R(Bundle bundle) {
        Bundle bundle2;
        super.R(bundle);
        if (this.f662i0) {
            View I = I();
            if (I != null) {
                if (I.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f664k0.setContentView(I);
            }
            d g7 = g();
            if (g7 != null) {
                this.f664k0.setOwnerActivity(g7);
            }
            this.f664k0.setCancelable(this.f661h0);
            this.f664k0.setOnCancelListener(this);
            this.f664k0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f664k0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Context context) {
        super.U(context);
        if (this.f667n0) {
            return;
        }
        this.f666m0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void X(Bundle bundle) {
        super.X(bundle);
        this.f657d0 = new Handler();
        this.f662i0 = this.B == 0;
        if (bundle != null) {
            this.f659f0 = bundle.getInt("android:style", 0);
            this.f660g0 = bundle.getInt("android:theme", 0);
            this.f661h0 = bundle.getBoolean("android:cancelable", true);
            this.f662i0 = bundle.getBoolean("android:showsDialog", this.f662i0);
            this.f663j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        super.e0();
        Dialog dialog = this.f664k0;
        if (dialog != null) {
            this.f665l0 = true;
            dialog.setOnDismissListener(null);
            this.f664k0.dismiss();
            if (!this.f666m0) {
                onDismiss(this.f664k0);
            }
            this.f664k0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void f0() {
        super.f0();
        if (this.f667n0 || this.f666m0) {
            return;
        }
        this.f666m0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater g0(Bundle bundle) {
        Context g7;
        if (!this.f662i0) {
            return super.g0(bundle);
        }
        Dialog l12 = l1(bundle);
        this.f664k0 = l12;
        if (l12 != null) {
            n1(l12, this.f659f0);
            g7 = this.f664k0.getContext();
        } else {
            g7 = this.f613x.g();
        }
        return (LayoutInflater) g7.getSystemService("layout_inflater");
    }

    void k1(boolean z6, boolean z7) {
        if (this.f666m0) {
            return;
        }
        this.f666m0 = true;
        this.f667n0 = false;
        Dialog dialog = this.f664k0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f664k0.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f657d0.getLooper()) {
                    onDismiss(this.f664k0);
                } else {
                    this.f657d0.post(this.f658e0);
                }
            }
        }
        this.f665l0 = true;
        if (this.f663j0 >= 0) {
            X0().e(this.f663j0, 1);
            this.f663j0 = -1;
            return;
        }
        n a7 = X0().a();
        a7.g(this);
        if (z6) {
            a7.e();
        } else {
            a7.d();
        }
    }

    public Dialog l1(Bundle bundle) {
        throw null;
    }

    public void m1(boolean z6) {
        this.f662i0 = z6;
    }

    public void n1(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void o1(i iVar, String str) {
        this.f666m0 = false;
        this.f667n0 = true;
        n a7 = iVar.a();
        a7.b(this, str);
        a7.d();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f665l0) {
            return;
        }
        k1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.t0(bundle);
        Dialog dialog = this.f664k0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f659f0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f660g0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z6 = this.f661h0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f662i0;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i9 = this.f663j0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void u0() {
        super.u0();
        Dialog dialog = this.f664k0;
        if (dialog != null) {
            this.f665l0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void v0() {
        super.v0();
        Dialog dialog = this.f664k0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
