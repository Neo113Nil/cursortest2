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
import com.gglhk.bofio.fortunetiger.R;
import java.io.PrintWriter;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class p extends u implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final m Y;
    public final n Z;
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f487b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f488c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f489d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f490e0;
    public boolean f0;

    /* renamed from: g0, reason: collision with root package name */
    public final a2.e f491g0;

    /* renamed from: h0, reason: collision with root package name */
    public Dialog f492h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f493i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f494j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f495k0;

    public p() {
        new g(1, this);
        this.Y = new m(this);
        this.Z = new n(this);
        this.a0 = 0;
        this.f487b0 = 0;
        this.f488c0 = true;
        this.f489d0 = true;
        this.f490e0 = -1;
        this.f491g0 = new a2.e(3, this);
        this.f495k0 = false;
    }

    @Override // androidx.fragment.app.u
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.f492h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f492h0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.u
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.f492h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f492h0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (k0.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.q(C(), this.f487b0);
    }

    @Override // androidx.fragment.app.u
    public final k3.m b() {
        return new o(this, new r(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f493i0) {
            return;
        }
        if (k0.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f494j0) {
            return;
        }
        this.f494j0 = true;
        Dialog dialog = this.f492h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f492h0.dismiss();
        }
        this.f493i0 = true;
        if (this.f490e0 >= 0) {
            k0 j4 = j();
            int i4 = this.f490e0;
            if (i4 < 0) {
                throw new IllegalArgumentException(w0.e("Bad id: ", i4));
            }
            j4.w(new j0(j4, i4), true);
            this.f490e0 = -1;
            return;
        }
        a aVar = new a(j());
        aVar.f389o = true;
        k0 k0Var = this.f535w;
        if (k0Var != null && k0Var != aVar.f390p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new r0(3, this));
        if (aVar.f391q) {
            throw new IllegalStateException("commit already called");
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "Commit: " + aVar);
            PrintWriter printWriter = new PrintWriter(new t0());
            aVar.d("  ", printWriter, true);
            printWriter.close();
        }
        aVar.f391q = true;
        boolean z3 = aVar.g;
        k0 k0Var2 = aVar.f390p;
        if (z3) {
            aVar.f392r = k0Var2.f440i.getAndIncrement();
        } else {
            aVar.f392r = -1;
        }
        k0Var2.w(aVar, true);
    }

    @Override // androidx.fragment.app.u
    public final void p() {
        this.H = true;
    }

    @Override // androidx.fragment.app.u
    public final void r(Context context) {
        super.r(context);
        this.T.d(this.f491g0);
        this.f494j0 = false;
    }

    @Override // androidx.fragment.app.u
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f489d0 = this.B == 0;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.f487b0 = bundle.getInt("android:theme", 0);
            this.f488c0 = bundle.getBoolean("android:cancelable", true);
            this.f489d0 = bundle.getBoolean("android:showsDialog", this.f489d0);
            this.f490e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.u
    public final void u() {
        this.H = true;
        Dialog dialog = this.f492h0;
        if (dialog != null) {
            this.f493i0 = true;
            dialog.setOnDismissListener(null);
            this.f492h0.dismiss();
            if (!this.f494j0) {
                onDismiss(this.f492h0);
            }
            this.f492h0 = null;
            this.f495k0 = false;
        }
    }

    @Override // androidx.fragment.app.u
    public final void v() {
        this.H = true;
        if (!this.f494j0) {
            this.f494j0 = true;
        }
        androidx.lifecycle.x xVar = this.T;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f612b.b(this.f491g0);
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
        LayoutInflater w3 = super.w(bundle);
        boolean z3 = this.f489d0;
        if (z3 && !this.f0) {
            if (z3 && !this.f495k0) {
                try {
                    this.f0 = true;
                    Dialog G = G();
                    this.f492h0 = G;
                    if (this.f489d0) {
                        int i4 = this.a0;
                        if (i4 != 1 && i4 != 2) {
                            if (i4 == 3) {
                                Window window = G.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                h = h();
                                if (h != null) {
                                    this.f492h0.setOwnerActivity((Activity) h);
                                }
                                this.f492h0.setCancelable(this.f488c0);
                                this.f492h0.setOnCancelListener(this.Y);
                                this.f492h0.setOnDismissListener(this.Z);
                                this.f495k0 = true;
                            }
                        }
                        G.requestWindowFeature(1);
                        h = h();
                        if (h != null) {
                        }
                        this.f492h0.setCancelable(this.f488c0);
                        this.f492h0.setOnCancelListener(this.Y);
                        this.f492h0.setOnDismissListener(this.Z);
                        this.f495k0 = true;
                    } else {
                        this.f492h0 = null;
                    }
                    this.f0 = false;
                } catch (Throwable th) {
                    this.f0 = false;
                    throw th;
                }
            }
            if (k0.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f492h0;
            if (dialog != null) {
                return w3.cloneInContext(dialog.getContext());
            }
        } else if (k0.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f489d0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return w3;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return w3;
    }

    @Override // androidx.fragment.app.u
    public void x(Bundle bundle) {
        Dialog dialog = this.f492h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.a0;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.f487b0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z3 = this.f488c0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f489d0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i6 = this.f490e0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // androidx.fragment.app.u
    public void y() {
        this.H = true;
        Dialog dialog = this.f492h0;
        if (dialog != null) {
            this.f493i0 = false;
            dialog.show();
            View decorView = this.f492h0.getWindow().getDecorView();
            u2.c.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.u
    public void z() {
        this.H = true;
        Dialog dialog = this.f492h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
