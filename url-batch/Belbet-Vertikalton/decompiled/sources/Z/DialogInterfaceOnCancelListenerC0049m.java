package Z;

import G1.AbstractC0001b;
import a.AbstractC0058a;
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
import com.winpower.neonfit.R;
import h.AbstractActivityC0132i;
import java.io.PrintWriter;

/* renamed from: Z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0049m extends AbstractComponentCallbacksC0053q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0046j f1567T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0047k f1568U;

    /* renamed from: V, reason: collision with root package name */
    public int f1569V;

    /* renamed from: W, reason: collision with root package name */
    public int f1570W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1571X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1572Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1573Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1574a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C1.d f1575b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1576c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1577d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1578e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1579f0;

    public DialogInterfaceOnCancelListenerC0049m() {
        new C1.e(5, this);
        this.f1567T = new DialogInterfaceOnCancelListenerC0046j(this);
        this.f1568U = new DialogInterfaceOnDismissListenerC0047k(this);
        this.f1569V = 0;
        this.f1570W = 0;
        this.f1571X = true;
        this.f1572Y = true;
        this.f1573Z = -1;
        this.f1575b0 = new C1.d(17, this);
        this.f1579f0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1593C = true;
        if (this.f1576c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1576c0.onRestoreInstanceState(bundle2);
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1595E != null || this.f1576c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1576c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.m(C(), this.f1570W);
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final H1.d d() {
        return new C0048l(this, new C0051o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1577d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1578e0) {
            return;
        }
        this.f1578e0 = true;
        Dialog dialog = this.f1576c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1576c0.dismiss();
        }
        this.f1577d0 = true;
        if (this.f1573Z >= 0) {
            I j = j();
            int i = this.f1573Z;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0001b.e("Bad id: ", i));
            }
            j.w(new H(j, i), true);
            this.f1573Z = -1;
            return;
        }
        C0037a c0037a = new C0037a(j());
        c0037a.f1530o = true;
        I i2 = this.f1622r;
        if (i2 != null && i2 != c0037a.f1531p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0037a.b(new P(3, this));
        if (c0037a.f1532q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0037a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0037a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0037a.f1532q = true;
        boolean z2 = c0037a.f1524g;
        I i3 = c0037a.f1531p;
        if (z2) {
            c0037a.f1533r = i3.i.getAndIncrement();
        } else {
            c0037a.f1533r = -1;
        }
        i3.w(c0037a, true);
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void p() {
        this.f1593C = true;
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void r(AbstractActivityC0132i abstractActivityC0132i) {
        Object obj;
        super.r(abstractActivityC0132i);
        androidx.lifecycle.y yVar = this.f1604O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        C1.d dVar = this.f1575b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, dVar);
        p.f fVar = yVar.f1960b;
        p.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3779b;
        } else {
            p.c cVar = new p.c(dVar, xVar);
            fVar.f3788d++;
            p.c cVar2 = fVar.f3786b;
            if (cVar2 == null) {
                fVar.f3785a = cVar;
                fVar.f3786b = cVar;
            } else {
                cVar2.f3780c = cVar;
                cVar.f3781d = cVar2;
                fVar.f3786b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1578e0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1572Y = this.f1627w == 0;
        if (bundle != null) {
            this.f1569V = bundle.getInt("android:style", 0);
            this.f1570W = bundle.getInt("android:theme", 0);
            this.f1571X = bundle.getBoolean("android:cancelable", true);
            this.f1572Y = bundle.getBoolean("android:showsDialog", this.f1572Y);
            this.f1573Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void u() {
        this.f1593C = true;
        Dialog dialog = this.f1576c0;
        if (dialog != null) {
            this.f1577d0 = true;
            dialog.setOnDismissListener(null);
            this.f1576c0.dismiss();
            if (!this.f1578e0) {
                onDismiss(this.f1576c0);
            }
            this.f1576c0 = null;
            this.f1579f0 = false;
        }
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public final void v() {
        this.f1593C = true;
        if (!this.f1578e0) {
            this.f1578e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1604O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1960b.b(this.f1575b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Z.AbstractComponentCallbacksC0053q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h2;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1572Y;
        if (!z2 || this.f1574a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1572Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1579f0) {
            try {
                this.f1574a0 = true;
                Dialog G2 = G();
                this.f1576c0 = G2;
                if (this.f1572Y) {
                    int i = this.f1569V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h2 = h();
                            if (h2 instanceof Activity) {
                                this.f1576c0.setOwnerActivity((Activity) h2);
                            }
                            this.f1576c0.setCancelable(this.f1571X);
                            this.f1576c0.setOnCancelListener(this.f1567T);
                            this.f1576c0.setOnDismissListener(this.f1568U);
                            this.f1579f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h2 = h();
                    if (h2 instanceof Activity) {
                    }
                    this.f1576c0.setCancelable(this.f1571X);
                    this.f1576c0.setOnCancelListener(this.f1567T);
                    this.f1576c0.setOnDismissListener(this.f1568U);
                    this.f1579f0 = true;
                } else {
                    this.f1576c0 = null;
                }
                this.f1574a0 = false;
            } catch (Throwable th) {
                this.f1574a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1576c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1576c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1569V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1570W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1571X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1572Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1573Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public void y() {
        this.f1593C = true;
        Dialog dialog = this.f1576c0;
        if (dialog != null) {
            this.f1577d0 = false;
            dialog.show();
            View decorView = this.f1576c0.getWindow().getDecorView();
            androidx.lifecycle.J.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0058a.Y(decorView, this);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0053q
    public void z() {
        this.f1593C = true;
        Dialog dialog = this.f1576c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
