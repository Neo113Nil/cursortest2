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
import com.lasercut.dash.R;
import g.AbstractActivityC0125i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0044m extends AbstractComponentCallbacksC0048q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0041j f928T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0042k f929U;

    /* renamed from: V, reason: collision with root package name */
    public int f930V;

    /* renamed from: W, reason: collision with root package name */
    public int f931W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f932X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f933Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f934Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f935a0;

    /* renamed from: b0, reason: collision with root package name */
    public final B0.d f936b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f937c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f938d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f939e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f940f0;

    public DialogInterfaceOnCancelListenerC0044m() {
        new K0.B(4, this);
        this.f928T = new DialogInterfaceOnCancelListenerC0041j(this);
        this.f929U = new DialogInterfaceOnDismissListenerC0042k(this);
        this.f930V = 0;
        this.f931W = 0;
        this.f932X = true;
        this.f933Y = true;
        this.f934Z = -1;
        this.f936b0 = new B0.d(17, this);
        this.f940f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f954C = true;
        if (this.f937c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f937c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f956E != null || this.f937c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f937c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f931W);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final q1.d e() {
        return new C0043l(this, new C0046o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f938d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f939e0) {
            return;
        }
        this.f939e0 = true;
        Dialog dialog = this.f937c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f937c0.dismiss();
        }
        this.f938d0 = true;
        if (this.f934Z >= 0) {
            I j2 = j();
            int i = this.f934Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.d("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f934Z = -1;
            return;
        }
        C0032a c0032a = new C0032a(j());
        c0032a.f892o = true;
        I i2 = this.f983r;
        if (i2 != null && i2 != c0032a.f893p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0032a.b(new P(3, this));
        if (c0032a.f894q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0032a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0032a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0032a.f894q = true;
        boolean z2 = c0032a.f886g;
        I i3 = c0032a.f893p;
        if (z2) {
            c0032a.f895r = i3.i.getAndIncrement();
        } else {
            c0032a.f895r = -1;
        }
        i3.w(c0032a, true);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void p() {
        this.f954C = true;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void r(AbstractActivityC0125i abstractActivityC0125i) {
        Object obj;
        super.r(abstractActivityC0125i);
        androidx.lifecycle.w wVar = this.f965O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        B0.d dVar = this.f936b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, dVar);
        n.f fVar = wVar.f1382b;
        n.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3272b;
        } else {
            n.c cVar = new n.c(dVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3278b;
            if (cVar2 == null) {
                fVar.f3277a = cVar;
                fVar.f3278b = cVar;
            } else {
                cVar2.f3273c = cVar;
                cVar.d = cVar2;
                fVar.f3278b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f939e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f933Y = this.f988w == 0;
        if (bundle != null) {
            this.f930V = bundle.getInt("android:style", 0);
            this.f931W = bundle.getInt("android:theme", 0);
            this.f932X = bundle.getBoolean("android:cancelable", true);
            this.f933Y = bundle.getBoolean("android:showsDialog", this.f933Y);
            this.f934Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void u() {
        this.f954C = true;
        Dialog dialog = this.f937c0;
        if (dialog != null) {
            this.f938d0 = true;
            dialog.setOnDismissListener(null);
            this.f937c0.dismiss();
            if (!this.f939e0) {
                onDismiss(this.f937c0);
            }
            this.f937c0 = null;
            this.f940f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void v() {
        this.f954C = true;
        if (!this.f939e0) {
            this.f939e0 = true;
        }
        androidx.lifecycle.w wVar = this.f965O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1382b.b(this.f936b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // X.AbstractComponentCallbacksC0048q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f933Y;
        if (!z2 || this.f935a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f933Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f940f0) {
            try {
                this.f935a0 = true;
                Dialog G2 = G();
                this.f937c0 = G2;
                if (this.f933Y) {
                    int i = this.f930V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f937c0.setOwnerActivity((Activity) h);
                            }
                            this.f937c0.setCancelable(this.f932X);
                            this.f937c0.setOnCancelListener(this.f928T);
                            this.f937c0.setOnDismissListener(this.f929U);
                            this.f940f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f937c0.setCancelable(this.f932X);
                    this.f937c0.setOnCancelListener(this.f928T);
                    this.f937c0.setOnDismissListener(this.f929U);
                    this.f940f0 = true;
                } else {
                    this.f937c0 = null;
                }
                this.f935a0 = false;
            } catch (Throwable th) {
                this.f935a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f937c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void x(Bundle bundle) {
        Dialog dialog = this.f937c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f930V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f931W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f932X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f933Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f934Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void y() {
        this.f954C = true;
        Dialog dialog = this.f937c0;
        if (dialog != null) {
            this.f938d0 = false;
            dialog.show();
            View decorView = this.f937c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            q1.d.k0(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void z() {
        this.f954C = true;
        Dialog dialog = this.f937c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
