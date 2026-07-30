package androidx.fragment.app;

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
import com.icefishing.icefish.ice.fishing.s294s.R;
import i.AbstractActivityC0525l;
import kotlin.jvm.internal.Intrinsics;
import p.C0813c;
import p.C0816f;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0226q extends ComponentCallbacksC0228t implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0223n f3750a0;

    /* renamed from: b0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0224o f3751b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3752c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3753d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3754e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3755f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3756g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3757h0;

    /* renamed from: i0, reason: collision with root package name */
    public final l2.c f3758i0;

    /* renamed from: j0, reason: collision with root package name */
    public Dialog f3759j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f3760k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f3761l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3762m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f3763n0;

    public DialogInterfaceOnCancelListenerC0226q() {
        new F.b(8, this);
        this.f3750a0 = new DialogInterfaceOnCancelListenerC0223n(this);
        this.f3751b0 = new DialogInterfaceOnDismissListenerC0224o(this);
        this.f3752c0 = 0;
        this.f3753d0 = 0;
        this.f3754e0 = true;
        this.f3755f0 = true;
        this.f3756g0 = -1;
        this.f3758i0 = new l2.c(this);
        this.f3763n0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final A a() {
        return new C0225p(this, new C0225p(this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void k() {
        this.f3786L = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void m(Context context) {
        Object obj;
        super.m(context);
        androidx.lifecycle.C c7 = this.f3795V;
        c7.getClass();
        androidx.lifecycle.C.a("observeForever");
        l2.c cVar = this.f3758i0;
        androidx.lifecycle.B b7 = new androidx.lifecycle.B(c7, cVar);
        C0816f c0816f = c7.f3839b;
        C0813c a7 = c0816f.a(cVar);
        if (a7 != null) {
            obj = a7.f7141e;
        } else {
            C0813c c0813c = new C0813c(cVar, b7);
            c0816f.f7150l++;
            C0813c c0813c2 = c0816f.f7148e;
            if (c0813c2 == null) {
                c0816f.f7147d = c0813c;
                c0816f.f7148e = c0813c;
            } else {
                c0813c2.f7142i = c0813c;
                c0813c.f7143l = c0813c2;
                c0816f.f7148e = c0813c;
            }
            obj = null;
        }
        if (((androidx.lifecycle.B) obj) == null) {
            b7.a(true);
        }
        if (this.f3762m0) {
            return;
        }
        this.f3761l0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void n(Bundle bundle) {
        super.n(bundle);
        new Handler();
        this.f3755f0 = this.f3780F == 0;
        if (bundle != null) {
            this.f3752c0 = bundle.getInt("android:style", 0);
            this.f3753d0 = bundle.getInt("android:theme", 0);
            this.f3754e0 = bundle.getBoolean("android:cancelable", true);
            this.f3755f0 = bundle.getBoolean("android:showsDialog", this.f3755f0);
            this.f3756g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void o() {
        this.f3786L = true;
        Dialog dialog = this.f3759j0;
        if (dialog != null) {
            this.f3760k0 = true;
            dialog.setOnDismissListener(null);
            this.f3759j0.dismiss();
            if (!this.f3761l0) {
                onDismiss(this.f3759j0);
            }
            this.f3759j0 = null;
            this.f3763n0 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f3760k0) {
            return;
        }
        if (Q.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f3761l0) {
            return;
        }
        this.f3761l0 = true;
        this.f3762m0 = false;
        Dialog dialog = this.f3759j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3759j0.dismiss();
        }
        this.f3760k0 = true;
        if (this.f3756g0 >= 0) {
            Q e7 = e();
            int i2 = this.f3756g0;
            if (i2 < 0) {
                throw new IllegalArgumentException(C4.p.g(i2, "Bad id: "));
            }
            e7.y(new O(e7, i2), true);
            this.f3756g0 = -1;
            return;
        }
        C0210a c0210a = new C0210a(e());
        c0210a.f3695o = true;
        Q q4 = this.f3775A;
        if (q4 == null || q4 == c0210a.f3696p) {
            c0210a.b(new Z(3, this));
            c0210a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void p() {
        this.f3786L = true;
        if (!this.f3762m0 && !this.f3761l0) {
            this.f3761l0 = true;
        }
        androidx.lifecycle.C c7 = this.f3795V;
        c7.getClass();
        androidx.lifecycle.C.a("removeObserver");
        androidx.lifecycle.B b7 = (androidx.lifecycle.B) c7.f3839b.b(this.f3758i0);
        if (b7 == null) {
            return;
        }
        b7.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater q(Bundle bundle) {
        C0232x c0232x;
        LayoutInflater q4 = super.q(bundle);
        boolean z7 = this.f3755f0;
        if (z7 && !this.f3757h0) {
            if (z7 && !this.f3763n0) {
                try {
                    this.f3757h0 = true;
                    Dialog x7 = x();
                    this.f3759j0 = x7;
                    AbstractActivityC0525l abstractActivityC0525l = null;
                    if (this.f3755f0) {
                        int i2 = this.f3752c0;
                        if (i2 != 1 && i2 != 2) {
                            if (i2 == 3) {
                                Window window = x7.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                c0232x = this.f3776B;
                                if (c0232x == null) {
                                    abstractActivityC0525l = c0232x.f3823e;
                                }
                                if (abstractActivityC0525l != null) {
                                    this.f3759j0.setOwnerActivity(abstractActivityC0525l);
                                }
                                this.f3759j0.setCancelable(this.f3754e0);
                                this.f3759j0.setOnCancelListener(this.f3750a0);
                                this.f3759j0.setOnDismissListener(this.f3751b0);
                                this.f3763n0 = true;
                            }
                        }
                        x7.requestWindowFeature(1);
                        c0232x = this.f3776B;
                        if (c0232x == null) {
                        }
                        if (abstractActivityC0525l != null) {
                        }
                        this.f3759j0.setCancelable(this.f3754e0);
                        this.f3759j0.setOnCancelListener(this.f3750a0);
                        this.f3759j0.setOnDismissListener(this.f3751b0);
                        this.f3763n0 = true;
                    } else {
                        this.f3759j0 = null;
                    }
                    this.f3757h0 = false;
                } catch (Throwable th) {
                    this.f3757h0 = false;
                    throw th;
                }
            }
            if (Q.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f3759j0;
            if (dialog != null) {
                return q4.cloneInContext(dialog.getContext());
            }
        } else if (Q.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f3755f0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return q4;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return q4;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void r(Bundle bundle) {
        Dialog dialog = this.f3759j0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f3752c0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i5 = this.f3753d0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z7 = this.f3754e0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f3755f0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i7 = this.f3756g0;
        if (i7 != -1) {
            bundle.putInt("android:backStackId", i7);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void s() {
        this.f3786L = true;
        Dialog dialog = this.f3759j0;
        if (dialog != null) {
            this.f3760k0 = false;
            dialog.show();
            View decorView = this.f3759j0.getWindow().getDecorView();
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void t() {
        this.f3786L = true;
        Dialog dialog = this.f3759j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0228t
    public final void u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.u(layoutInflater, viewGroup, bundle);
        if (this.f3759j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3759j0.onRestoreInstanceState(bundle2);
    }

    public Dialog x() {
        if (Q.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.p(v(), this.f3753d0);
    }
}
