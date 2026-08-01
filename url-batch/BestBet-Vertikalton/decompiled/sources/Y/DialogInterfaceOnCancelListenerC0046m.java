package Y;

import G1.AbstractC0001b;
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
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import g.AbstractActivityC0128i;
import java.io.PrintWriter;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0046m extends AbstractComponentCallbacksC0050q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0043j f1418T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0044k f1419U;

    /* renamed from: V, reason: collision with root package name */
    public int f1420V;

    /* renamed from: W, reason: collision with root package name */
    public int f1421W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1422X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1423Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1424Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1425a0;

    /* renamed from: b0, reason: collision with root package name */
    public final A0.c f1426b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1427c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1428d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1429e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1430f0;

    public DialogInterfaceOnCancelListenerC0046m() {
        new C0.i(6, this);
        this.f1418T = new DialogInterfaceOnCancelListenerC0043j(this);
        this.f1419U = new DialogInterfaceOnDismissListenerC0044k(this);
        this.f1420V = 0;
        this.f1421W = 0;
        this.f1422X = true;
        this.f1423Y = true;
        this.f1424Z = -1;
        this.f1426b0 = new A0.c(19, this);
        this.f1430f0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1444C = true;
        if (this.f1427c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1427c0.onRestoreInstanceState(bundle2);
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1446E != null || this.f1427c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1427c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1421W);
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final H1.l d() {
        return new C0045l(this, new C0048o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1428d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1429e0) {
            return;
        }
        this.f1429e0 = true;
        Dialog dialog = this.f1427c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1427c0.dismiss();
        }
        this.f1428d0 = true;
        if (this.f1424Z >= 0) {
            I j2 = j();
            int i = this.f1424Z;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0001b.f("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1424Z = -1;
            return;
        }
        C0034a c0034a = new C0034a(j());
        c0034a.f1382o = true;
        I i2 = this.f1473r;
        if (i2 != null && i2 != c0034a.f1383p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0034a.b(new P(3, this));
        if (c0034a.f1384q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0034a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0034a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0034a.f1384q = true;
        boolean z2 = c0034a.f1376g;
        I i3 = c0034a.f1383p;
        if (z2) {
            c0034a.f1385r = i3.i.getAndIncrement();
        } else {
            c0034a.f1385r = -1;
        }
        i3.w(c0034a, true);
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void p() {
        this.f1444C = true;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void r(AbstractActivityC0128i abstractActivityC0128i) {
        Object obj;
        super.r(abstractActivityC0128i);
        androidx.lifecycle.y yVar = this.f1455O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        A0.c cVar = this.f1426b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, cVar);
        n.f fVar = yVar.f1910b;
        n.c a2 = fVar.a(cVar);
        if (a2 != null) {
            obj = a2.f3546b;
        } else {
            n.c cVar2 = new n.c(cVar, xVar);
            fVar.d++;
            n.c cVar3 = fVar.f3552b;
            if (cVar3 == null) {
                fVar.f3551a = cVar2;
                fVar.f3552b = cVar2;
            } else {
                cVar3.f3547c = cVar2;
                cVar2.d = cVar3;
                fVar.f3552b = cVar2;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1429e0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1423Y = this.f1478w == 0;
        if (bundle != null) {
            this.f1420V = bundle.getInt("android:style", 0);
            this.f1421W = bundle.getInt("android:theme", 0);
            this.f1422X = bundle.getBoolean("android:cancelable", true);
            this.f1423Y = bundle.getBoolean("android:showsDialog", this.f1423Y);
            this.f1424Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void u() {
        this.f1444C = true;
        Dialog dialog = this.f1427c0;
        if (dialog != null) {
            this.f1428d0 = true;
            dialog.setOnDismissListener(null);
            this.f1427c0.dismiss();
            if (!this.f1429e0) {
                onDismiss(this.f1427c0);
            }
            this.f1427c0 = null;
            this.f1430f0 = false;
        }
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void v() {
        this.f1444C = true;
        if (!this.f1429e0) {
            this.f1429e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1455O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1910b.b(this.f1426b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Y.AbstractComponentCallbacksC0050q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1423Y;
        if (!z2 || this.f1425a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1423Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1430f0) {
            try {
                this.f1425a0 = true;
                Dialog G2 = G();
                this.f1427c0 = G2;
                if (this.f1423Y) {
                    int i = this.f1420V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1427c0.setOwnerActivity((Activity) h);
                            }
                            this.f1427c0.setCancelable(this.f1422X);
                            this.f1427c0.setOnCancelListener(this.f1418T);
                            this.f1427c0.setOnDismissListener(this.f1419U);
                            this.f1430f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1427c0.setCancelable(this.f1422X);
                    this.f1427c0.setOnCancelListener(this.f1418T);
                    this.f1427c0.setOnDismissListener(this.f1419U);
                    this.f1430f0 = true;
                } else {
                    this.f1427c0 = null;
                }
                this.f1425a0 = false;
            } catch (Throwable th) {
                this.f1425a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1427c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1427c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1420V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1421W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1422X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1423Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1424Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public void y() {
        this.f1444C = true;
        Dialog dialog = this.f1427c0;
        if (dialog != null) {
            this.f1428d0 = false;
            dialog.show();
            View decorView = this.f1427c0.getWindow().getDecorView();
            androidx.lifecycle.J.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0091d.t(decorView, this);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public void z() {
        this.f1444C = true;
        Dialog dialog = this.f1427c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
