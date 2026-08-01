package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class vj extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Y;
    public boolean h0;
    public Dialog j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final v7 Z = new v7(3, this);
    public final rj a0 = new rj(this);
    public final sj b0 = new sj(this);
    public int c0 = 0;
    public int d0 = 0;
    public boolean e0 = true;
    public boolean f0 = true;
    public int g0 = -1;
    public final tj i0 = new tj(this);
    public boolean n0 = false;

    @Override // androidx.fragment.app.a
    public final void B(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.j0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.a
    public final void C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.C(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.j0.onRestoreInstanceState(bundle2);
    }

    public final void I(boolean z, boolean z2) {
        if (this.l0) {
            return;
        }
        this.l0 = true;
        this.m0 = false;
        Dialog dialog = this.j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.j0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Y.getLooper()) {
                    onDismiss(this.j0);
                } else {
                    this.Y.post(this.Z);
                }
            }
        }
        this.k0 = true;
        if (this.g0 >= 0) {
            c j = j();
            int i = this.g0;
            if (i < 0) {
                s9.k(r7.b("Bad id: ", i));
                return;
            } else {
                j.w(new jq(j, i), z);
                this.g0 = -1;
                return;
            }
        }
        a8 a8Var = new a8(j());
        a8Var.o = true;
        c cVar = this.w;
        if (cVar != null && cVar != a8Var.p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        a8Var.b(new uq(3, this));
        if (z) {
            a8Var.d(true);
        } else {
            a8Var.d(false);
        }
    }

    public Dialog J() {
        if (c.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ae(E(), this.d0);
    }

    public void K(Dialog dialog, int i) {
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

    @Override // androidx.fragment.app.a
    public final bi b() {
        return new uj(this, new up(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.k0) {
            return;
        }
        if (c.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        I(true, true);
    }

    @Override // androidx.fragment.app.a
    public final void p() {
        this.H = true;
    }

    @Override // androidx.fragment.app.a
    public final void r(Context context) {
        super.r(context);
        this.T.d(this.i0);
        if (this.m0) {
            return;
        }
        this.l0 = false;
    }

    @Override // androidx.fragment.app.a
    public void s(Bundle bundle) {
        super.s(bundle);
        this.Y = new Handler();
        this.f0 = this.B == 0;
        if (bundle != null) {
            this.c0 = bundle.getInt("android:style", 0);
            this.d0 = bundle.getInt("android:theme", 0);
            this.e0 = bundle.getBoolean("android:cancelable", true);
            this.f0 = bundle.getBoolean("android:showsDialog", this.f0);
            this.g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.a
    public void u() {
        this.H = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            this.k0 = true;
            dialog.setOnDismissListener(null);
            this.j0.dismiss();
            if (!this.l0) {
                onDismiss(this.j0);
            }
            this.j0 = null;
            this.n0 = false;
        }
    }

    @Override // androidx.fragment.app.a
    public final void v() {
        this.H = true;
        if (!this.m0 && !this.l0) {
            this.l0 = true;
        }
        this.T.g(this.i0);
    }

    @Override // androidx.fragment.app.a
    public final LayoutInflater w(Bundle bundle) {
        LayoutInflater w = super.w(bundle);
        boolean z = this.f0;
        if (z && !this.h0) {
            if (z && !this.n0) {
                try {
                    this.h0 = true;
                    Dialog J = J();
                    this.j0 = J;
                    if (this.f0) {
                        K(J, this.c0);
                        Context h = h();
                        if (h != null) {
                            this.j0.setOwnerActivity((Activity) h);
                        }
                        this.j0.setCancelable(this.e0);
                        this.j0.setOnCancelListener(this.a0);
                        this.j0.setOnDismissListener(this.b0);
                        this.n0 = true;
                    } else {
                        this.j0 = null;
                    }
                    this.h0 = false;
                } catch (Throwable th) {
                    this.h0 = false;
                    throw th;
                }
            }
            if (c.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.j0;
            if (dialog != null) {
                return w.cloneInContext(dialog.getContext());
            }
        } else if (c.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return w;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return w;
    }

    @Override // androidx.fragment.app.a
    public void x(Bundle bundle) {
        Dialog dialog = this.j0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.c0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.d0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.e0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.g0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.a
    public void y() {
        this.H = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            this.k0 = false;
            dialog.show();
            View decorView = this.j0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.a
    public void z() {
        this.H = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
