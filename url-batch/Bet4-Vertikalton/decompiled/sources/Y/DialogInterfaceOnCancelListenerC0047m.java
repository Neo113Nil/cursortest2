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
import com.playbag.tripgear.R;
import g.AbstractActivityC0106i;
import java.io.PrintWriter;
import m.C0260a;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0047m extends AbstractComponentCallbacksC0051q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0044j f1059T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0045k f1060U;

    /* renamed from: V, reason: collision with root package name */
    public int f1061V;

    /* renamed from: W, reason: collision with root package name */
    public int f1062W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1063X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1064Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1065Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1066a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C.g f1067b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1068c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1069d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1070e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1071f0;

    public DialogInterfaceOnCancelListenerC0047m() {
        new M0.B(4, this);
        this.f1059T = new DialogInterfaceOnCancelListenerC0044j(this);
        this.f1060U = new DialogInterfaceOnDismissListenerC0045k(this);
        this.f1061V = 0;
        this.f1062W = 0;
        this.f1063X = true;
        this.f1064Y = true;
        this.f1065Z = -1;
        this.f1067b0 = new C.g(17, this);
        this.f1071f0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1085C = true;
        if (this.f1068c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1068c0.onRestoreInstanceState(bundle2);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1087E != null || this.f1068c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1068c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1062W);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final w1.l e() {
        return new C0046l(this, new C0049o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1069d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1070e0) {
            return;
        }
        this.f1070e0 = true;
        Dialog dialog = this.f1068c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1068c0.dismiss();
        }
        this.f1069d0 = true;
        if (this.f1065Z >= 0) {
            I j2 = j();
            int i = this.f1065Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.e("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1065Z = -1;
            return;
        }
        C0035a c0035a = new C0035a(j());
        c0035a.f1023o = true;
        I i2 = this.f1114r;
        if (i2 != null && i2 != c0035a.f1024p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0035a.b(new P(3, this));
        if (c0035a.f1025q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0035a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0035a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0035a.f1025q = true;
        boolean z2 = c0035a.f1017g;
        I i3 = c0035a.f1024p;
        if (z2) {
            c0035a.f1026r = i3.i.getAndIncrement();
        } else {
            c0035a.f1026r = -1;
        }
        i3.w(c0035a, true);
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void p() {
        this.f1085C = true;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void r(AbstractActivityC0106i abstractActivityC0106i) {
        Object obj;
        super.r(abstractActivityC0106i);
        androidx.lifecycle.w wVar = this.f1096O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        C.g gVar = this.f1067b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        n.f fVar = wVar.f1501b;
        n.c a2 = fVar.a(gVar);
        if (a2 != null) {
            obj = a2.f3194b;
        } else {
            n.c cVar = new n.c(gVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3200b;
            if (cVar2 == null) {
                fVar.f3199a = cVar;
                fVar.f3200b = cVar;
            } else {
                cVar2.f3195c = cVar;
                cVar.d = cVar2;
                fVar.f3200b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f1070e0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1064Y = this.f1119w == 0;
        if (bundle != null) {
            this.f1061V = bundle.getInt("android:style", 0);
            this.f1062W = bundle.getInt("android:theme", 0);
            this.f1063X = bundle.getBoolean("android:cancelable", true);
            this.f1064Y = bundle.getBoolean("android:showsDialog", this.f1064Y);
            this.f1065Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void u() {
        this.f1085C = true;
        Dialog dialog = this.f1068c0;
        if (dialog != null) {
            this.f1069d0 = true;
            dialog.setOnDismissListener(null);
            this.f1068c0.dismiss();
            if (!this.f1070e0) {
                onDismiss(this.f1068c0);
            }
            this.f1068c0 = null;
            this.f1071f0 = false;
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final void v() {
        this.f1085C = true;
        if (!this.f1070e0) {
            this.f1070e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1096O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1501b.b(this.f1067b0);
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
        boolean z2 = this.f1064Y;
        if (!z2 || this.f1066a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1064Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1071f0) {
            try {
                this.f1066a0 = true;
                Dialog G2 = G();
                this.f1068c0 = G2;
                if (this.f1064Y) {
                    int i = this.f1061V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1068c0.setOwnerActivity((Activity) h);
                            }
                            this.f1068c0.setCancelable(this.f1063X);
                            this.f1068c0.setOnCancelListener(this.f1059T);
                            this.f1068c0.setOnDismissListener(this.f1060U);
                            this.f1071f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1068c0.setCancelable(this.f1063X);
                    this.f1068c0.setOnCancelListener(this.f1059T);
                    this.f1068c0.setOnDismissListener(this.f1060U);
                    this.f1071f0 = true;
                } else {
                    this.f1068c0 = null;
                }
                this.f1066a0 = false;
            } catch (Throwable th) {
                this.f1066a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1068c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1068c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1061V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1062W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1063X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1064Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1065Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void y() {
        this.f1085C = true;
        Dialog dialog = this.f1068c0;
        if (dialog != null) {
            this.f1069d0 = false;
            dialog.show();
            View decorView = this.f1068c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            C0260a.r(decorView, this);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public void z() {
        this.f1085C = true;
        Dialog dialog = this.f1068c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
