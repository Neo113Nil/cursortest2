package androidx.fragment.app;

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
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class p extends u implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Y;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f612h0;

    /* renamed from: j0, reason: collision with root package name */
    public Dialog f613j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f614k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f615l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f616m0;
    public final g Z = new g(1, this);

    /* renamed from: a0, reason: collision with root package name */
    public final m f606a0 = new m(this);

    /* renamed from: b0, reason: collision with root package name */
    public final n f607b0 = new n(this);

    /* renamed from: c0, reason: collision with root package name */
    public int f608c0 = 0;
    public int d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f609e0 = true;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f610f0 = true;

    /* renamed from: g0, reason: collision with root package name */
    public int f611g0 = -1;
    public final a0.a i0 = new a0.a(3, this);

    /* renamed from: n0, reason: collision with root package name */
    public boolean f617n0 = false;

    @Override // androidx.fragment.app.u
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.f613j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f613j0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.u
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.f613j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f613j0.onRestoreInstanceState(bundle2);
    }

    public final void G(boolean z4, boolean z5) {
        if (this.f615l0) {
            return;
        }
        this.f615l0 = true;
        this.f616m0 = false;
        Dialog dialog = this.f613j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f613j0.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.Y.getLooper()) {
                    onDismiss(this.f613j0);
                } else {
                    this.Y.post(this.Z);
                }
            }
        }
        this.f614k0 = true;
        if (this.f611g0 >= 0) {
            k0 j2 = j();
            int i = this.f611g0;
            if (i < 0) {
                throw new IllegalArgumentException(a4.b.f("Bad id: ", i));
            }
            j2.w(new j0(j2, i), z4);
            this.f611g0 = -1;
            return;
        }
        a aVar = new a(j());
        aVar.f504o = true;
        k0 k0Var = this.f659w;
        if (k0Var != null && k0Var != aVar.f505p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new r0(3, this));
        if (z4) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog H() {
        if (k0.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.o(C(), this.d0);
    }

    @Override // androidx.fragment.app.u
    public final b4.d b() {
        return new o(this, new r(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f614k0) {
            return;
        }
        if (k0.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        G(true, true);
    }

    @Override // androidx.fragment.app.u
    public final void p() {
        this.H = true;
    }

    @Override // androidx.fragment.app.u
    public final void r(Context context) {
        super.r(context);
        this.T.d(this.i0);
        if (this.f616m0) {
            return;
        }
        this.f615l0 = false;
    }

    @Override // androidx.fragment.app.u
    public void s(Bundle bundle) {
        super.s(bundle);
        this.Y = new Handler();
        this.f610f0 = this.B == 0;
        if (bundle != null) {
            this.f608c0 = bundle.getInt("android:style", 0);
            this.d0 = bundle.getInt("android:theme", 0);
            this.f609e0 = bundle.getBoolean("android:cancelable", true);
            this.f610f0 = bundle.getBoolean("android:showsDialog", this.f610f0);
            this.f611g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.u
    public final void u() {
        this.H = true;
        Dialog dialog = this.f613j0;
        if (dialog != null) {
            this.f614k0 = true;
            dialog.setOnDismissListener(null);
            this.f613j0.dismiss();
            if (!this.f615l0) {
                onDismiss(this.f613j0);
            }
            this.f613j0 = null;
            this.f617n0 = false;
        }
    }

    @Override // androidx.fragment.app.u
    public final void v() {
        this.H = true;
        if (!this.f616m0 && !this.f615l0) {
            this.f615l0 = true;
        }
        androidx.lifecycle.x xVar = this.T;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f745b.b(this.i0);
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
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w4 = super.w(bundle);
        boolean z4 = this.f610f0;
        if (z4 && !this.f612h0) {
            if (z4 && !this.f617n0) {
                try {
                    this.f612h0 = true;
                    Dialog H = H();
                    this.f613j0 = H;
                    if (this.f610f0) {
                        int i = this.f608c0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = H.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                h = h();
                                if (h != null) {
                                    this.f613j0.setOwnerActivity((Activity) h);
                                }
                                this.f613j0.setCancelable(this.f609e0);
                                this.f613j0.setOnCancelListener(this.f606a0);
                                this.f613j0.setOnDismissListener(this.f607b0);
                                this.f617n0 = true;
                            }
                        }
                        H.requestWindowFeature(1);
                        h = h();
                        if (h != null) {
                        }
                        this.f613j0.setCancelable(this.f609e0);
                        this.f613j0.setOnCancelListener(this.f606a0);
                        this.f613j0.setOnDismissListener(this.f607b0);
                        this.f617n0 = true;
                    } else {
                        this.f613j0 = null;
                    }
                    this.f612h0 = false;
                } catch (Throwable th) {
                    this.f612h0 = false;
                    throw th;
                }
            }
            if (k0.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f613j0;
            if (dialog != null) {
                return w4.cloneInContext(dialog.getContext());
            }
        } else if (k0.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f610f0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return w4;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return w4;
    }

    @Override // androidx.fragment.app.u
    public void x(Bundle bundle) {
        Dialog dialog = this.f613j0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f608c0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i4 = this.d0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z4 = this.f609e0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f610f0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i5 = this.f611g0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.u
    public void y() {
        this.H = true;
        Dialog dialog = this.f613j0;
        if (dialog != null) {
            this.f614k0 = false;
            dialog.show();
            View decorView = this.f613j0.getWindow().getDecorView();
            i3.d.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.u
    public void z() {
        this.H = true;
        Dialog dialog = this.f613j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
