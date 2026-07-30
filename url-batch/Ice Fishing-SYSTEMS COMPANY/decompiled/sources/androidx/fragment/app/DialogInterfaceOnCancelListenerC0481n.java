package androidx.fragment.app;

import a.AbstractC0415a;
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
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0481n extends AbstractComponentCallbacksC0485s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0479l f5113A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f5114B0;
    public int C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f5115D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5116E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f5117F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f5118G0;

    /* renamed from: H0, reason: collision with root package name */
    public final I0.j f5119H0;

    /* renamed from: I0, reason: collision with root package name */
    public Dialog f5120I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f5121J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f5122K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f5123L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5124M0;

    /* renamed from: z0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0478k f5125z0;

    public DialogInterfaceOnCancelListenerC0481n() {
        new F3.C(13, this);
        this.f5125z0 = new DialogInterfaceOnCancelListenerC0478k(0, this);
        this.f5113A0 = new DialogInterfaceOnDismissListenerC0479l(this);
        this.f5114B0 = 0;
        this.C0 = 0;
        this.f5115D0 = true;
        this.f5116E0 = true;
        this.f5117F0 = -1;
        this.f5119H0 = new I0.j(16, this);
        this.f5124M0 = false;
    }

    public Dialog C() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.q(y(), this.C0);
    }

    public final Dialog D() {
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final AbstractC0415a a() {
        return new C0480m(this, new C0484q(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void l() {
        this.f5160V = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void n(AbstractActivityC0490x abstractActivityC0490x) {
        super.n(abstractActivityC0490x);
        this.f5173u0.d(this.f5119H0);
        if (this.f5123L0) {
            return;
        }
        this.f5122K0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public void o(Bundle bundle) {
        super.o(bundle);
        new Handler();
        this.f5116E0 = this.f5154P == 0;
        if (bundle != null) {
            this.f5114B0 = bundle.getInt("android:style", 0);
            this.C0 = bundle.getInt("android:theme", 0);
            this.f5115D0 = bundle.getBoolean("android:cancelable", true);
            this.f5116E0 = bundle.getBoolean("android:showsDialog", this.f5116E0);
            this.f5117F0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5121J0) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f5122K0) {
            return;
        }
        this.f5122K0 = true;
        this.f5123L0 = false;
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f5120I0.dismiss();
        }
        this.f5121J0 = true;
        if (this.f5117F0 >= 0) {
            N f6 = f();
            int i = this.f5117F0;
            if (i < 0) {
                throw new IllegalArgumentException(CL.i(i, "Bad id: "));
            }
            f6.v(new M(f6, i), true);
            this.f5117F0 = -1;
            return;
        }
        C0468a c0468a = new C0468a(f());
        c0468a.f5054o = true;
        N n9 = this.f5149K;
        if (n9 == null || n9 == c0468a.f5055p) {
            c0468a.b(new W(3, this));
            c0468a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void q() {
        this.f5160V = true;
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            this.f5121J0 = true;
            dialog.setOnDismissListener(null);
            this.f5120I0.dismiss();
            if (!this.f5122K0) {
                onDismiss(this.f5120I0);
            }
            this.f5120I0 = null;
            this.f5124M0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void r() {
        this.f5160V = true;
        if (!this.f5123L0 && !this.f5122K0) {
            this.f5122K0 = true;
        }
        I0.j jVar = this.f5119H0;
        androidx.lifecycle.C c4 = this.f5173u0;
        c4.getClass();
        androidx.lifecycle.C.a("removeObserver");
        androidx.lifecycle.B b9 = (androidx.lifecycle.B) c4.f5204b.c(jVar);
        if (b9 == null) {
            return;
        }
        b9.c();
        b9.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater s(Bundle bundle) {
        Context d2;
        LayoutInflater s3 = super.s(bundle);
        boolean z8 = this.f5116E0;
        if (z8 && !this.f5118G0) {
            if (z8 && !this.f5124M0) {
                try {
                    this.f5118G0 = true;
                    Dialog C7 = C();
                    this.f5120I0 = C7;
                    if (this.f5116E0) {
                        int i = this.f5114B0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = C7.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                d2 = d();
                                if (d2 instanceof Activity) {
                                    this.f5120I0.setOwnerActivity((Activity) d2);
                                }
                                this.f5120I0.setCancelable(this.f5115D0);
                                this.f5120I0.setOnCancelListener(this.f5125z0);
                                this.f5120I0.setOnDismissListener(this.f5113A0);
                                this.f5124M0 = true;
                            }
                        }
                        C7.requestWindowFeature(1);
                        d2 = d();
                        if (d2 instanceof Activity) {
                        }
                        this.f5120I0.setCancelable(this.f5115D0);
                        this.f5120I0.setOnCancelListener(this.f5125z0);
                        this.f5120I0.setOnDismissListener(this.f5113A0);
                        this.f5124M0 = true;
                    } else {
                        this.f5120I0 = null;
                    }
                    this.f5118G0 = false;
                } catch (Throwable th) {
                    this.f5118G0 = false;
                    throw th;
                }
            }
            if (N.E(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f5120I0;
            if (dialog != null) {
                return s3.cloneInContext(dialog.getContext());
            }
        } else if (N.E(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f5116E0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return s3;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return s3;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public void t(Bundle bundle) {
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f5114B0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i4 = this.C0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z8 = this.f5115D0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z9 = this.f5116E0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i9 = this.f5117F0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public void u() {
        this.f5160V = true;
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            this.f5121J0 = false;
            dialog.show();
            View decorView = this.f5120I0.getWindow().getDecorView();
            kotlin.jvm.internal.h.e(decorView, "<this>");
            decorView.setTag(C5284R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C5284R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C5284R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public void v() {
        this.f5160V = true;
        Dialog dialog = this.f5120I0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void w(Bundle bundle) {
        Bundle bundle2;
        this.f5160V = true;
        if (this.f5120I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5120I0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.f5162X != null || this.f5120I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5120I0.onRestoreInstanceState(bundle2);
    }
}
