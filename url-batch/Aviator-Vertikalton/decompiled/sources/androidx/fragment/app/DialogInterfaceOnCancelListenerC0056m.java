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
import com.fortuneink.neonpad.R;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0056m extends AbstractComponentCallbacksC0060q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0053j f1352T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0054k f1353U;

    /* renamed from: V, reason: collision with root package name */
    public int f1354V;

    /* renamed from: W, reason: collision with root package name */
    public int f1355W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1356X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1357Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1358Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1359a0;

    /* renamed from: b0, reason: collision with root package name */
    public final B0.d f1360b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1361c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1362d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1363e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1364f0;

    public DialogInterfaceOnCancelListenerC0056m() {
        new K0.B(4, this);
        this.f1352T = new DialogInterfaceOnCancelListenerC0053j(this);
        this.f1353U = new DialogInterfaceOnDismissListenerC0054k(this);
        this.f1354V = 0;
        this.f1355W = 0;
        this.f1356X = true;
        this.f1357Y = true;
        this.f1358Z = -1;
        this.f1360b0 = new B0.d(16, this);
        this.f1364f0 = false;
    }

    public Dialog C() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.q(y(), this.f1355W);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final q1.l a() {
        return new C0055l(this, new C0058o(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void l() {
        this.f1379C = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void n(AbstractActivityC0064v abstractActivityC0064v) {
        Object obj;
        super.n(abstractActivityC0064v);
        androidx.lifecycle.y yVar = this.f1390O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        B0.d dVar = this.f1360b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, dVar);
        n.f fVar = yVar.f1512b;
        n.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3618b;
        } else {
            n.c cVar = new n.c(dVar, xVar);
            fVar.f3627d++;
            n.c cVar2 = fVar.f3625b;
            if (cVar2 == null) {
                fVar.f3624a = cVar;
                fVar.f3625b = cVar;
            } else {
                cVar2.f3619c = cVar;
                cVar.f3620d = cVar2;
                fVar.f3625b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1363e0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public void o(Bundle bundle) {
        super.o(bundle);
        new Handler();
        this.f1357Y = this.f1414w == 0;
        if (bundle != null) {
            this.f1354V = bundle.getInt("android:style", 0);
            this.f1355W = bundle.getInt("android:theme", 0);
            this.f1356X = bundle.getBoolean("android:cancelable", true);
            this.f1357Y = bundle.getBoolean("android:showsDialog", this.f1357Y);
            this.f1358Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1362d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1363e0) {
            return;
        }
        this.f1363e0 = true;
        Dialog dialog = this.f1361c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1361c0.dismiss();
        }
        this.f1362d0 = true;
        if (this.f1358Z >= 0) {
            K f2 = f();
            int i = this.f1358Z;
            if (i < 0) {
                throw new IllegalArgumentException(X0.e.d("Bad id: ", i));
            }
            f2.w(new J(f2, i), true);
            this.f1358Z = -1;
            return;
        }
        C0044a c0044a = new C0044a(f());
        c0044a.f1312o = true;
        K k2 = this.f1409r;
        if (k2 != null && k2 != c0044a.f1313p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0044a.b(new T(3, this));
        if (c0044a.f1314q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0044a);
            PrintWriter printWriter = new PrintWriter(new V());
            c0044a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0044a.f1314q = true;
        boolean z2 = c0044a.f1306g;
        K k3 = c0044a.f1313p;
        if (z2) {
            c0044a.f1315r = k3.i.getAndIncrement();
        } else {
            c0044a.f1315r = -1;
        }
        k3.w(c0044a, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void q() {
        this.f1379C = true;
        Dialog dialog = this.f1361c0;
        if (dialog != null) {
            this.f1362d0 = true;
            dialog.setOnDismissListener(null);
            this.f1361c0.dismiss();
            if (!this.f1363e0) {
                onDismiss(this.f1361c0);
            }
            this.f1361c0 = null;
            this.f1364f0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void r() {
        this.f1379C = true;
        if (!this.f1363e0) {
            this.f1363e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1390O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1512b.b(this.f1360b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater s(Bundle bundle) {
        Context d2;
        LayoutInflater s2 = super.s(bundle);
        boolean z2 = this.f1357Y;
        if (!z2 || this.f1359a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1357Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return s2;
        }
        if (z2 && !this.f1364f0) {
            try {
                this.f1359a0 = true;
                Dialog C2 = C();
                this.f1361c0 = C2;
                if (this.f1357Y) {
                    int i = this.f1354V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = C2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            d2 = d();
                            if (d2 instanceof Activity) {
                                this.f1361c0.setOwnerActivity((Activity) d2);
                            }
                            this.f1361c0.setCancelable(this.f1356X);
                            this.f1361c0.setOnCancelListener(this.f1352T);
                            this.f1361c0.setOnDismissListener(this.f1353U);
                            this.f1364f0 = true;
                        }
                    }
                    C2.requestWindowFeature(1);
                    d2 = d();
                    if (d2 instanceof Activity) {
                    }
                    this.f1361c0.setCancelable(this.f1356X);
                    this.f1361c0.setOnCancelListener(this.f1352T);
                    this.f1361c0.setOnDismissListener(this.f1353U);
                    this.f1364f0 = true;
                } else {
                    this.f1361c0 = null;
                }
                this.f1359a0 = false;
            } catch (Throwable th) {
                this.f1359a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1361c0;
        return dialog != null ? s2.cloneInContext(dialog.getContext()) : s2;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public void t(Bundle bundle) {
        Dialog dialog = this.f1361c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1354V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1355W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1356X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1357Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1358Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public void u() {
        this.f1379C = true;
        Dialog dialog = this.f1361c0;
        if (dialog != null) {
            this.f1362d0 = false;
            dialog.show();
            View decorView = this.f1361c0.getWindow().getDecorView();
            androidx.lifecycle.J.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            q1.l.j0(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public void v() {
        this.f1379C = true;
        Dialog dialog = this.f1361c0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void w(Bundle bundle) {
        Bundle bundle2;
        this.f1379C = true;
        if (this.f1361c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1361c0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.f1381E != null || this.f1361c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1361c0.onRestoreInstanceState(bundle2);
    }
}
