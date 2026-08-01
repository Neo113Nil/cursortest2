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
import com.playgen.securelock.R;
import g.AbstractActivityC0133i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0044m extends AbstractComponentCallbacksC0048q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0041j f999T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0042k f1000U;

    /* renamed from: V, reason: collision with root package name */
    public int f1001V;

    /* renamed from: W, reason: collision with root package name */
    public int f1002W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1003X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1004Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1005Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1006a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C.g f1007b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1008c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1009d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1010e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1011f0;

    public DialogInterfaceOnCancelListenerC0044m() {
        new L0.B(4, this);
        this.f999T = new DialogInterfaceOnCancelListenerC0041j(this);
        this.f1000U = new DialogInterfaceOnDismissListenerC0042k(this);
        this.f1001V = 0;
        this.f1002W = 0;
        this.f1003X = true;
        this.f1004Y = true;
        this.f1005Z = -1;
        this.f1007b0 = new C.g(17, this);
        this.f1011f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1025C = true;
        if (this.f1008c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1008c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1027E != null || this.f1008c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1008c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1002W);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final u1.l e() {
        return new C0043l(this, new C0046o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1009d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1010e0) {
            return;
        }
        this.f1010e0 = true;
        Dialog dialog = this.f1008c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1008c0.dismiss();
        }
        this.f1009d0 = true;
        if (this.f1005Z >= 0) {
            I j2 = j();
            int i = this.f1005Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.d("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1005Z = -1;
            return;
        }
        C0032a c0032a = new C0032a(j());
        c0032a.f963o = true;
        I i2 = this.f1054r;
        if (i2 != null && i2 != c0032a.f964p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0032a.b(new P(3, this));
        if (c0032a.f965q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0032a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0032a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0032a.f965q = true;
        boolean z2 = c0032a.f957g;
        I i3 = c0032a.f964p;
        if (z2) {
            c0032a.f966r = i3.i.getAndIncrement();
        } else {
            c0032a.f966r = -1;
        }
        i3.w(c0032a, true);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void p() {
        this.f1025C = true;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void r(AbstractActivityC0133i abstractActivityC0133i) {
        Object obj;
        super.r(abstractActivityC0133i);
        androidx.lifecycle.w wVar = this.f1036O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        C.g gVar = this.f1007b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        n.f fVar = wVar.f1442b;
        n.c a2 = fVar.a(gVar);
        if (a2 != null) {
            obj = a2.f3276b;
        } else {
            n.c cVar = new n.c(gVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3282b;
            if (cVar2 == null) {
                fVar.f3281a = cVar;
                fVar.f3282b = cVar;
            } else {
                cVar2.f3277c = cVar;
                cVar.d = cVar2;
                fVar.f3282b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f1010e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1004Y = this.f1059w == 0;
        if (bundle != null) {
            this.f1001V = bundle.getInt("android:style", 0);
            this.f1002W = bundle.getInt("android:theme", 0);
            this.f1003X = bundle.getBoolean("android:cancelable", true);
            this.f1004Y = bundle.getBoolean("android:showsDialog", this.f1004Y);
            this.f1005Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void u() {
        this.f1025C = true;
        Dialog dialog = this.f1008c0;
        if (dialog != null) {
            this.f1009d0 = true;
            dialog.setOnDismissListener(null);
            this.f1008c0.dismiss();
            if (!this.f1010e0) {
                onDismiss(this.f1008c0);
            }
            this.f1008c0 = null;
            this.f1011f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void v() {
        this.f1025C = true;
        if (!this.f1010e0) {
            this.f1010e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1036O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1442b.b(this.f1007b0);
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
        boolean z2 = this.f1004Y;
        if (!z2 || this.f1006a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1004Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1011f0) {
            try {
                this.f1006a0 = true;
                Dialog G2 = G();
                this.f1008c0 = G2;
                if (this.f1004Y) {
                    int i = this.f1001V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1008c0.setOwnerActivity((Activity) h);
                            }
                            this.f1008c0.setCancelable(this.f1003X);
                            this.f1008c0.setOnCancelListener(this.f999T);
                            this.f1008c0.setOnDismissListener(this.f1000U);
                            this.f1011f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1008c0.setCancelable(this.f1003X);
                    this.f1008c0.setOnCancelListener(this.f999T);
                    this.f1008c0.setOnDismissListener(this.f1000U);
                    this.f1011f0 = true;
                } else {
                    this.f1008c0 = null;
                }
                this.f1006a0 = false;
            } catch (Throwable th) {
                this.f1006a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1008c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1008c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1001V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1002W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1003X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1004Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1005Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void y() {
        this.f1025C = true;
        Dialog dialog = this.f1008c0;
        if (dialog != null) {
            this.f1009d0 = false;
            dialog.show();
            View decorView = this.f1008c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            u1.l.X(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void z() {
        this.f1025C = true;
        Dialog dialog = this.f1008c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
