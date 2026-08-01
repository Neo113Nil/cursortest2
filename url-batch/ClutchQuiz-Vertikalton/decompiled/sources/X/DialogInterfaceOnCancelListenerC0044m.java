package X;

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
import com.clutchquizarena.app.R;
import g.AbstractActivityC0136i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0044m extends AbstractComponentCallbacksC0048q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0041j f1065T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0042k f1066U;

    /* renamed from: V, reason: collision with root package name */
    public int f1067V;

    /* renamed from: W, reason: collision with root package name */
    public int f1068W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1069X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1070Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1071Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1072a0;

    /* renamed from: b0, reason: collision with root package name */
    public final A0.h f1073b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1074c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1075d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1076e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1077f0;

    public DialogInterfaceOnCancelListenerC0044m() {
        new Q.b(4, this);
        this.f1065T = new DialogInterfaceOnCancelListenerC0041j(this);
        this.f1066U = new DialogInterfaceOnDismissListenerC0042k(this);
        this.f1067V = 0;
        this.f1068W = 0;
        this.f1069X = true;
        this.f1070Y = true;
        this.f1071Z = -1;
        this.f1073b0 = new A0.h(14, this);
        this.f1077f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1091C = true;
        if (this.f1074c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1074c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1093E != null || this.f1074c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1074c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1068W);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final T.d e() {
        return new C0043l(this, new C0046o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1075d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1076e0) {
            return;
        }
        this.f1076e0 = true;
        Dialog dialog = this.f1074c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1074c0.dismiss();
        }
        this.f1075d0 = true;
        if (this.f1071Z >= 0) {
            I j2 = j();
            int i = this.f1071Z;
            if (i >= 0) {
                j2.w(new H(j2, i), true);
                this.f1071Z = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        }
        C0032a c0032a = new C0032a(j());
        c0032a.f1029o = true;
        I i2 = this.f1120r;
        if (i2 != null && i2 != c0032a.f1030p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0032a.b(new P(3, this));
        if (c0032a.f1031q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0032a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0032a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0032a.f1031q = true;
        boolean z2 = c0032a.f1023g;
        I i3 = c0032a.f1030p;
        if (z2) {
            c0032a.f1032r = i3.i.getAndIncrement();
        } else {
            c0032a.f1032r = -1;
        }
        i3.w(c0032a, true);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void p() {
        this.f1091C = true;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void r(AbstractActivityC0136i abstractActivityC0136i) {
        Object obj;
        super.r(abstractActivityC0136i);
        androidx.lifecycle.y yVar = this.f1102O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        A0.h hVar = this.f1073b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, hVar);
        n.f fVar = yVar.f1529b;
        n.c a2 = fVar.a(hVar);
        if (a2 != null) {
            obj = a2.f3107b;
        } else {
            n.c cVar = new n.c(hVar, xVar);
            fVar.d++;
            n.c cVar2 = fVar.f3113b;
            if (cVar2 == null) {
                fVar.f3112a = cVar;
                fVar.f3113b = cVar;
            } else {
                cVar2.f3108c = cVar;
                cVar.d = cVar2;
                fVar.f3113b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1076e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1070Y = this.f1125w == 0;
        if (bundle != null) {
            this.f1067V = bundle.getInt("android:style", 0);
            this.f1068W = bundle.getInt("android:theme", 0);
            this.f1069X = bundle.getBoolean("android:cancelable", true);
            this.f1070Y = bundle.getBoolean("android:showsDialog", this.f1070Y);
            this.f1071Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void u() {
        this.f1091C = true;
        Dialog dialog = this.f1074c0;
        if (dialog != null) {
            this.f1075d0 = true;
            dialog.setOnDismissListener(null);
            this.f1074c0.dismiss();
            if (!this.f1076e0) {
                onDismiss(this.f1074c0);
            }
            this.f1074c0 = null;
            this.f1077f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void v() {
        this.f1091C = true;
        if (!this.f1076e0) {
            this.f1076e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1102O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1529b.b(this.f1073b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // X.AbstractComponentCallbacksC0048q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1070Y;
        if (!z2 || this.f1072a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1070Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1077f0) {
            try {
                this.f1072a0 = true;
                Dialog G2 = G();
                this.f1074c0 = G2;
                if (this.f1070Y) {
                    int i = this.f1067V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1074c0.setOwnerActivity((Activity) h);
                            }
                            this.f1074c0.setCancelable(this.f1069X);
                            this.f1074c0.setOnCancelListener(this.f1065T);
                            this.f1074c0.setOnDismissListener(this.f1066U);
                            this.f1077f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1074c0.setCancelable(this.f1069X);
                    this.f1074c0.setOnCancelListener(this.f1065T);
                    this.f1074c0.setOnDismissListener(this.f1066U);
                    this.f1077f0 = true;
                } else {
                    this.f1074c0 = null;
                }
                this.f1072a0 = false;
            } catch (Throwable th) {
                this.f1072a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1074c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1074c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1067V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1068W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1069X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1070Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1071Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void y() {
        this.f1091C = true;
        Dialog dialog = this.f1074c0;
        if (dialog != null) {
            this.f1075d0 = false;
            dialog.show();
            View decorView = this.f1074c0.getWindow().getDecorView();
            androidx.lifecycle.J.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            h0.g.k(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void z() {
        this.f1091C = true;
        Dialog dialog = this.f1074c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
