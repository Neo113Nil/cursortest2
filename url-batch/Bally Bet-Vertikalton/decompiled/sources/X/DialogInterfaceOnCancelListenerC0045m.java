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
import com.skydrop.fallring.R;
import g.AbstractActivityC0126i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0045m extends AbstractComponentCallbacksC0049q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0042j f930T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0043k f931U;

    /* renamed from: V, reason: collision with root package name */
    public int f932V;

    /* renamed from: W, reason: collision with root package name */
    public int f933W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f934X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f935Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f936Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f937a0;

    /* renamed from: b0, reason: collision with root package name */
    public final B0.d f938b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f939c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f940d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f941e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f942f0;

    public DialogInterfaceOnCancelListenerC0045m() {
        new K0.B(4, this);
        this.f930T = new DialogInterfaceOnCancelListenerC0042j(this);
        this.f931U = new DialogInterfaceOnDismissListenerC0043k(this);
        this.f932V = 0;
        this.f933W = 0;
        this.f934X = true;
        this.f935Y = true;
        this.f936Z = -1;
        this.f938b0 = new B0.d(16, this);
        this.f942f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f956C = true;
        if (this.f939c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f939c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f958E != null || this.f939c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f939c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f933W);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final q1.d e() {
        return new C0044l(this, new C0047o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f940d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f941e0) {
            return;
        }
        this.f941e0 = true;
        Dialog dialog = this.f939c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f939c0.dismiss();
        }
        this.f940d0 = true;
        if (this.f936Z >= 0) {
            I j2 = j();
            int i = this.f936Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.d("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f936Z = -1;
            return;
        }
        C0033a c0033a = new C0033a(j());
        c0033a.f894o = true;
        I i2 = this.f985r;
        if (i2 != null && i2 != c0033a.f895p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0033a.b(new P(3, this));
        if (c0033a.f896q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0033a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0033a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0033a.f896q = true;
        boolean z2 = c0033a.f888g;
        I i3 = c0033a.f895p;
        if (z2) {
            c0033a.f897r = i3.i.getAndIncrement();
        } else {
            c0033a.f897r = -1;
        }
        i3.w(c0033a, true);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void p() {
        this.f956C = true;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void r(AbstractActivityC0126i abstractActivityC0126i) {
        Object obj;
        super.r(abstractActivityC0126i);
        androidx.lifecycle.w wVar = this.f967O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        B0.d dVar = this.f938b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, dVar);
        n.f fVar = wVar.f1384b;
        n.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3256b;
        } else {
            n.c cVar = new n.c(dVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3262b;
            if (cVar2 == null) {
                fVar.f3261a = cVar;
                fVar.f3262b = cVar;
            } else {
                cVar2.f3257c = cVar;
                cVar.d = cVar2;
                fVar.f3262b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f941e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f935Y = this.f990w == 0;
        if (bundle != null) {
            this.f932V = bundle.getInt("android:style", 0);
            this.f933W = bundle.getInt("android:theme", 0);
            this.f934X = bundle.getBoolean("android:cancelable", true);
            this.f935Y = bundle.getBoolean("android:showsDialog", this.f935Y);
            this.f936Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void u() {
        this.f956C = true;
        Dialog dialog = this.f939c0;
        if (dialog != null) {
            this.f940d0 = true;
            dialog.setOnDismissListener(null);
            this.f939c0.dismiss();
            if (!this.f941e0) {
                onDismiss(this.f939c0);
            }
            this.f939c0 = null;
            this.f942f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void v() {
        this.f956C = true;
        if (!this.f941e0) {
            this.f941e0 = true;
        }
        androidx.lifecycle.w wVar = this.f967O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1384b.b(this.f938b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // X.AbstractComponentCallbacksC0049q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f935Y;
        if (!z2 || this.f937a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f935Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f942f0) {
            try {
                this.f937a0 = true;
                Dialog G2 = G();
                this.f939c0 = G2;
                if (this.f935Y) {
                    int i = this.f932V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f939c0.setOwnerActivity((Activity) h);
                            }
                            this.f939c0.setCancelable(this.f934X);
                            this.f939c0.setOnCancelListener(this.f930T);
                            this.f939c0.setOnDismissListener(this.f931U);
                            this.f942f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f939c0.setCancelable(this.f934X);
                    this.f939c0.setOnCancelListener(this.f930T);
                    this.f939c0.setOnDismissListener(this.f931U);
                    this.f942f0 = true;
                } else {
                    this.f939c0 = null;
                }
                this.f937a0 = false;
            } catch (Throwable th) {
                this.f937a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f939c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void x(Bundle bundle) {
        Dialog dialog = this.f939c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f932V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f933W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f934X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f935Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f936Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void y() {
        this.f956C = true;
        Dialog dialog = this.f939c0;
        if (dialog != null) {
            this.f940d0 = false;
            dialog.show();
            View decorView = this.f939c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            q1.d.k0(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void z() {
        this.f956C = true;
        Dialog dialog = this.f939c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
