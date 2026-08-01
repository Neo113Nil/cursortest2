package Y;

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
import com.winworm.neongrid.R;
import g.AbstractActivityC0108i;
import java.io.PrintWriter;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0047m extends AbstractComponentCallbacksC0051q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0044j f1086T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0045k f1087U;

    /* renamed from: V, reason: collision with root package name */
    public int f1088V;

    /* renamed from: W, reason: collision with root package name */
    public int f1089W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1090X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1091Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1092Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1093a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C.g f1094b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1095c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1096d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1097e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1098f0;

    public DialogInterfaceOnCancelListenerC0047m() {
        new M0.B(4, this);
        this.f1086T = new DialogInterfaceOnCancelListenerC0044j(this);
        this.f1087U = new DialogInterfaceOnDismissListenerC0045k(this);
        this.f1088V = 0;
        this.f1089W = 0;
        this.f1090X = true;
        this.f1091Y = true;
        this.f1092Z = -1;
        this.f1094b0 = new C.g(16, this);
        this.f1098f0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1112C = true;
        if (this.f1095c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1095c0.onRestoreInstanceState(bundle2);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1114E != null || this.f1095c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1095c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1089W);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final z1.d d() {
        return new C0046l(this, new C0049o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1096d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1097e0) {
            return;
        }
        this.f1097e0 = true;
        Dialog dialog = this.f1095c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1095c0.dismiss();
        }
        this.f1096d0 = true;
        if (this.f1092Z >= 0) {
            I j2 = j();
            int i = this.f1092Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.e("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1092Z = -1;
            return;
        }
        C0035a c0035a = new C0035a(j());
        c0035a.f1050o = true;
        I i2 = this.f1141r;
        if (i2 != null && i2 != c0035a.f1051p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0035a.b(new P(3, this));
        if (c0035a.f1052q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0035a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0035a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0035a.f1052q = true;
        boolean z2 = c0035a.f1044g;
        I i3 = c0035a.f1051p;
        if (z2) {
            c0035a.f1053r = i3.i.getAndIncrement();
        } else {
            c0035a.f1053r = -1;
        }
        i3.w(c0035a, true);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void p() {
        this.f1112C = true;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void r(AbstractActivityC0108i abstractActivityC0108i) {
        Object obj;
        super.r(abstractActivityC0108i);
        androidx.lifecycle.w wVar = this.f1123O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        C.g gVar = this.f1094b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        n.f fVar = wVar.f1532b;
        n.c a2 = fVar.a(gVar);
        if (a2 != null) {
            obj = a2.f3227b;
        } else {
            n.c cVar = new n.c(gVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3233b;
            if (cVar2 == null) {
                fVar.f3232a = cVar;
                fVar.f3233b = cVar;
            } else {
                cVar2.f3228c = cVar;
                cVar.d = cVar2;
                fVar.f3233b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f1097e0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1091Y = this.f1146w == 0;
        if (bundle != null) {
            this.f1088V = bundle.getInt("android:style", 0);
            this.f1089W = bundle.getInt("android:theme", 0);
            this.f1090X = bundle.getBoolean("android:cancelable", true);
            this.f1091Y = bundle.getBoolean("android:showsDialog", this.f1091Y);
            this.f1092Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void u() {
        this.f1112C = true;
        Dialog dialog = this.f1095c0;
        if (dialog != null) {
            this.f1096d0 = true;
            dialog.setOnDismissListener(null);
            this.f1095c0.dismiss();
            if (!this.f1097e0) {
                onDismiss(this.f1095c0);
            }
            this.f1095c0 = null;
            this.f1098f0 = false;
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void v() {
        this.f1112C = true;
        if (!this.f1097e0) {
            this.f1097e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1123O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1532b.b(this.f1094b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Y.AbstractComponentCallbacksC0051q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1091Y;
        if (!z2 || this.f1093a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1091Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1098f0) {
            try {
                this.f1093a0 = true;
                Dialog G2 = G();
                this.f1095c0 = G2;
                if (this.f1091Y) {
                    int i = this.f1088V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1095c0.setOwnerActivity((Activity) h);
                            }
                            this.f1095c0.setCancelable(this.f1090X);
                            this.f1095c0.setOnCancelListener(this.f1086T);
                            this.f1095c0.setOnDismissListener(this.f1087U);
                            this.f1098f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1095c0.setCancelable(this.f1090X);
                    this.f1095c0.setOnCancelListener(this.f1086T);
                    this.f1095c0.setOnDismissListener(this.f1087U);
                    this.f1098f0 = true;
                } else {
                    this.f1095c0 = null;
                }
                this.f1093a0 = false;
            } catch (Throwable th) {
                this.f1093a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1095c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1095c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1088V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1089W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1090X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1091Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1092Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void y() {
        this.f1112C = true;
        Dialog dialog = this.f1095c0;
        if (dialog != null) {
            this.f1096d0 = false;
            dialog.show();
            View decorView = this.f1095c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            i0.g.p(decorView, this);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void z() {
        this.f1112C = true;
        Dialog dialog = this.f1095c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
