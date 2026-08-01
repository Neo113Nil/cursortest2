package Z;

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
import com.winfour.winrandom.R;
import g.AbstractActivityC0106i;
import h.AbstractC0112a;
import java.io.PrintWriter;

/* renamed from: Z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0046m extends AbstractComponentCallbacksC0050q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0043j f1137T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0044k f1138U;

    /* renamed from: V, reason: collision with root package name */
    public int f1139V;

    /* renamed from: W, reason: collision with root package name */
    public int f1140W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1141X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1142Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1143Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1144a0;

    /* renamed from: b0, reason: collision with root package name */
    public final D.g f1145b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1146c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1147d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1148e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1149f0;

    public DialogInterfaceOnCancelListenerC0046m() {
        new N0.B(4, this);
        this.f1137T = new DialogInterfaceOnCancelListenerC0043j(this);
        this.f1138U = new DialogInterfaceOnDismissListenerC0044k(this);
        this.f1139V = 0;
        this.f1140W = 0;
        this.f1141X = true;
        this.f1142Y = true;
        this.f1143Z = -1;
        this.f1145b0 = new D.g(17, this);
        this.f1149f0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1164C = true;
        if (this.f1146c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1146c0.onRestoreInstanceState(bundle2);
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1166E != null || this.f1146c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1146c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1140W);
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final A1.d e() {
        return new C0045l(this, new C0048o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1147d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1148e0) {
            return;
        }
        this.f1148e0 = true;
        Dialog dialog = this.f1146c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1146c0.dismiss();
        }
        this.f1147d0 = true;
        if (this.f1143Z >= 0) {
            I j2 = j();
            int i = this.f1143Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.e("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1143Z = -1;
            return;
        }
        C0034a c0034a = new C0034a(j());
        c0034a.f1100o = true;
        I i2 = this.f1194r;
        if (i2 != null && i2 != c0034a.f1101p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0034a.b(new P(3, this));
        if (c0034a.f1102q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0034a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0034a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0034a.f1102q = true;
        boolean z2 = c0034a.f1093g;
        I i3 = c0034a.f1101p;
        if (z2) {
            c0034a.f1103r = i3.i.getAndIncrement();
        } else {
            c0034a.f1103r = -1;
        }
        i3.w(c0034a, true);
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void p() {
        this.f1164C = true;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void r(AbstractActivityC0106i abstractActivityC0106i) {
        Object obj;
        super.r(abstractActivityC0106i);
        androidx.lifecycle.w wVar = this.f1175O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        D.g gVar = this.f1145b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        o.f fVar = wVar.f1594b;
        o.c a2 = fVar.a(gVar);
        if (a2 != null) {
            obj = a2.f3399b;
        } else {
            o.c cVar = new o.c(gVar, vVar);
            fVar.d++;
            o.c cVar2 = fVar.f3405b;
            if (cVar2 == null) {
                fVar.f3404a = cVar;
                fVar.f3405b = cVar;
            } else {
                cVar2.f3400c = cVar;
                cVar.d = cVar2;
                fVar.f3405b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f1148e0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1142Y = this.f1199w == 0;
        if (bundle != null) {
            this.f1139V = bundle.getInt("android:style", 0);
            this.f1140W = bundle.getInt("android:theme", 0);
            this.f1141X = bundle.getBoolean("android:cancelable", true);
            this.f1142Y = bundle.getBoolean("android:showsDialog", this.f1142Y);
            this.f1143Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void u() {
        this.f1164C = true;
        Dialog dialog = this.f1146c0;
        if (dialog != null) {
            this.f1147d0 = true;
            dialog.setOnDismissListener(null);
            this.f1146c0.dismiss();
            if (!this.f1148e0) {
                onDismiss(this.f1146c0);
            }
            this.f1146c0 = null;
            this.f1149f0 = false;
        }
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final void v() {
        this.f1164C = true;
        if (!this.f1148e0) {
            this.f1148e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1175O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1594b.b(this.f1145b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Z.AbstractComponentCallbacksC0050q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h2;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1142Y;
        if (!z2 || this.f1144a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1142Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1149f0) {
            try {
                this.f1144a0 = true;
                Dialog G = G();
                this.f1146c0 = G;
                if (this.f1142Y) {
                    int i = this.f1139V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h2 = h();
                            if (h2 instanceof Activity) {
                                this.f1146c0.setOwnerActivity((Activity) h2);
                            }
                            this.f1146c0.setCancelable(this.f1141X);
                            this.f1146c0.setOnCancelListener(this.f1137T);
                            this.f1146c0.setOnDismissListener(this.f1138U);
                            this.f1149f0 = true;
                        }
                    }
                    G.requestWindowFeature(1);
                    h2 = h();
                    if (h2 instanceof Activity) {
                    }
                    this.f1146c0.setCancelable(this.f1141X);
                    this.f1146c0.setOnCancelListener(this.f1137T);
                    this.f1146c0.setOnDismissListener(this.f1138U);
                    this.f1149f0 = true;
                } else {
                    this.f1146c0 = null;
                }
                this.f1144a0 = false;
            } catch (Throwable th) {
                this.f1144a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1146c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1146c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1139V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1140W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1141X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1142Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1143Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public void y() {
        this.f1164C = true;
        Dialog dialog = this.f1146c0;
        if (dialog != null) {
            this.f1147d0 = false;
            dialog.show();
            View decorView = this.f1146c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0112a.q(decorView, this);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public void z() {
        this.f1164C = true;
        Dialog dialog = this.f1146c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
