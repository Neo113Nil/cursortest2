package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class p extends u implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final m Y;
    public final n Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f497a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f498b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f499c0;
    public boolean d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f500e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f501f0;

    /* renamed from: g0, reason: collision with root package name */
    public final a0.a f502g0;

    /* renamed from: h0, reason: collision with root package name */
    public Dialog f503h0;
    public boolean i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f504j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f505k0;

    public p() {
        new g(1, this);
        this.Y = new m(this);
        this.Z = new n(this);
        this.f497a0 = 0;
        this.f498b0 = 0;
        this.f499c0 = true;
        this.d0 = true;
        this.f500e0 = -1;
        this.f502g0 = new a0.a(4, this);
        this.f505k0 = false;
    }

    @Override // androidx.fragment.app.u
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.f503h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f503h0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.u
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.f503h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f503h0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (k0.E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.o(C(), this.f498b0);
    }

    @Override // androidx.fragment.app.u
    public final a.y c() {
        return new o(this, new r(this));
    }

    @Override // androidx.fragment.app.u
    public final void o() {
        this.H = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.i0) {
            return;
        }
        if (k0.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f504j0) {
            return;
        }
        this.f504j0 = true;
        Dialog dialog = this.f503h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f503h0.dismiss();
        }
        this.i0 = true;
        if (this.f500e0 >= 0) {
            k0 j4 = j();
            int i = this.f500e0;
            if (i < 0) {
                throw new IllegalArgumentException(w0.d("Bad id: ", i));
            }
            j4.v(new j0(j4, i), true);
            this.f500e0 = -1;
            return;
        }
        a aVar = new a(j());
        aVar.f389o = true;
        k0 k0Var = this.f551w;
        if (k0Var == null || k0Var == aVar.f390p) {
            aVar.b(new r0(3, this));
            aVar.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.u
    public final void q(Context context) {
        super.q(context);
        this.T.d(this.f502g0);
        this.f504j0 = false;
    }

    @Override // androidx.fragment.app.u
    public void r(Bundle bundle) {
        super.r(bundle);
        new Handler();
        this.d0 = this.B == 0;
        if (bundle != null) {
            this.f497a0 = bundle.getInt("android:style", 0);
            this.f498b0 = bundle.getInt("android:theme", 0);
            this.f499c0 = bundle.getBoolean("android:cancelable", true);
            this.d0 = bundle.getBoolean("android:showsDialog", this.d0);
            this.f500e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        Dialog dialog = this.f503h0;
        if (dialog != null) {
            this.i0 = true;
            dialog.setOnDismissListener(null);
            this.f503h0.dismiss();
            if (!this.f504j0) {
                onDismiss(this.f503h0);
            }
            this.f503h0 = null;
            this.f505k0 = false;
        }
    }

    @Override // androidx.fragment.app.u
    public final void u() {
        this.H = true;
        if (!this.f504j0) {
            this.f504j0 = true;
        }
        androidx.lifecycle.x xVar = this.T;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f642b.b(this.f502g0);
        if (wVar == null) {
            return;
        }
        wVar.d();
        wVar.c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0044, B:21:0x004e, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0066), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater v(Bundle bundle) {
        Context h4;
        LayoutInflater v3 = super.v(bundle);
        boolean z3 = this.d0;
        if (z3 && !this.f501f0) {
            if (z3 && !this.f505k0) {
                try {
                    this.f501f0 = true;
                    Dialog G = G();
                    this.f503h0 = G;
                    if (this.d0) {
                        int i = this.f497a0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = G.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                h4 = h();
                                if (h4 != null) {
                                    this.f503h0.setOwnerActivity((Activity) h4);
                                }
                                this.f503h0.setCancelable(this.f499c0);
                                this.f503h0.setOnCancelListener(this.Y);
                                this.f503h0.setOnDismissListener(this.Z);
                                this.f505k0 = true;
                            }
                        }
                        G.requestWindowFeature(1);
                        h4 = h();
                        if (h4 != null) {
                        }
                        this.f503h0.setCancelable(this.f499c0);
                        this.f503h0.setOnCancelListener(this.Y);
                        this.f503h0.setOnDismissListener(this.Z);
                        this.f505k0 = true;
                    } else {
                        this.f503h0 = null;
                    }
                    this.f501f0 = false;
                } catch (Throwable th) {
                    this.f501f0 = false;
                    throw th;
                }
            }
            if (k0.E(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f503h0;
            if (dialog != null) {
                return v3.cloneInContext(dialog.getContext());
            }
        } else if (k0.E(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.d0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return v3;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return v3;
    }

    @Override // androidx.fragment.app.u
    public void w(Bundle bundle) {
        Dialog dialog = this.f503h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f497a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i4 = this.f498b0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f499c0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.d0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f500e0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.u
    public void x() {
        this.H = true;
        Dialog dialog = this.f503h0;
        if (dialog != null) {
            this.i0 = false;
            dialog.show();
            View decorView = this.f503h0.getWindow().getDecorView();
            f3.d.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.u
    public void y() {
        this.H = true;
        Dialog dialog = this.f503h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
