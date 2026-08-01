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
import com.winfour.neondrop.R;
import g.AbstractActivityC0110i;
import java.io.PrintWriter;
import m.C0227a;
import n.C0242c;
import n.C0245f;

/* renamed from: Z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0043m extends AbstractComponentCallbacksC0047q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0040j f1148T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0041k f1149U;

    /* renamed from: V, reason: collision with root package name */
    public int f1150V;

    /* renamed from: W, reason: collision with root package name */
    public int f1151W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1152X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1153Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1154Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1155a0;

    /* renamed from: b0, reason: collision with root package name */
    public final E.g f1156b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1157c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1158d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1159e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1160f0;

    public DialogInterfaceOnCancelListenerC0043m() {
        new O0.B(4, this);
        this.f1148T = new DialogInterfaceOnCancelListenerC0040j(this);
        this.f1149U = new DialogInterfaceOnDismissListenerC0041k(this);
        this.f1150V = 0;
        this.f1151W = 0;
        this.f1152X = true;
        this.f1153Y = true;
        this.f1154Z = -1;
        this.f1156b0 = new E.g(17, this);
        this.f1160f0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1174C = true;
        if (this.f1157c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1157c0.onRestoreInstanceState(bundle2);
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1176E != null || this.f1157c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1157c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1151W);
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final z1.l b() {
        return new C0042l(this, new C0045o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1158d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1159e0) {
            return;
        }
        this.f1159e0 = true;
        Dialog dialog = this.f1157c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1157c0.dismiss();
        }
        this.f1158d0 = true;
        if (this.f1154Z >= 0) {
            I j2 = j();
            int i = this.f1154Z;
            if (i < 0) {
                throw new IllegalArgumentException(X0.a.e("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1154Z = -1;
            return;
        }
        C0031a c0031a = new C0031a(j());
        c0031a.f1112o = true;
        I i2 = this.f1203r;
        if (i2 != null && i2 != c0031a.f1113p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0031a.b(new P(3, this));
        if (c0031a.f1114q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0031a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0031a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0031a.f1114q = true;
        boolean z2 = c0031a.f1106g;
        I i3 = c0031a.f1113p;
        if (z2) {
            c0031a.f1115r = i3.i.getAndIncrement();
        } else {
            c0031a.f1115r = -1;
        }
        i3.w(c0031a, true);
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void p() {
        this.f1174C = true;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void r(AbstractActivityC0110i abstractActivityC0110i) {
        Object obj;
        super.r(abstractActivityC0110i);
        androidx.lifecycle.w wVar = this.f1185O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        E.g gVar = this.f1156b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        C0245f c0245f = wVar.f1589b;
        C0242c a2 = c0245f.a(gVar);
        if (a2 != null) {
            obj = a2.f3218b;
        } else {
            C0242c c0242c = new C0242c(gVar, vVar);
            c0245f.d++;
            C0242c c0242c2 = c0245f.f3224b;
            if (c0242c2 == null) {
                c0245f.f3223a = c0242c;
                c0245f.f3224b = c0242c;
            } else {
                c0242c2.f3219c = c0242c;
                c0242c.d = c0242c2;
                c0245f.f3224b = c0242c;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f1159e0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1153Y = this.f1208w == 0;
        if (bundle != null) {
            this.f1150V = bundle.getInt("android:style", 0);
            this.f1151W = bundle.getInt("android:theme", 0);
            this.f1152X = bundle.getBoolean("android:cancelable", true);
            this.f1153Y = bundle.getBoolean("android:showsDialog", this.f1153Y);
            this.f1154Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void u() {
        this.f1174C = true;
        Dialog dialog = this.f1157c0;
        if (dialog != null) {
            this.f1158d0 = true;
            dialog.setOnDismissListener(null);
            this.f1157c0.dismiss();
            if (!this.f1159e0) {
                onDismiss(this.f1157c0);
            }
            this.f1157c0 = null;
            this.f1160f0 = false;
        }
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final void v() {
        this.f1174C = true;
        if (!this.f1159e0) {
            this.f1159e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1185O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1589b.b(this.f1156b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Z.AbstractComponentCallbacksC0047q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1153Y;
        if (!z2 || this.f1155a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1153Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1160f0) {
            try {
                this.f1155a0 = true;
                Dialog G2 = G();
                this.f1157c0 = G2;
                if (this.f1153Y) {
                    int i = this.f1150V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1157c0.setOwnerActivity((Activity) h);
                            }
                            this.f1157c0.setCancelable(this.f1152X);
                            this.f1157c0.setOnCancelListener(this.f1148T);
                            this.f1157c0.setOnDismissListener(this.f1149U);
                            this.f1160f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1157c0.setCancelable(this.f1152X);
                    this.f1157c0.setOnCancelListener(this.f1148T);
                    this.f1157c0.setOnDismissListener(this.f1149U);
                    this.f1160f0 = true;
                } else {
                    this.f1157c0 = null;
                }
                this.f1155a0 = false;
            } catch (Throwable th) {
                this.f1155a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1157c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1157c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1150V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1151W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1152X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1153Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1154Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public void y() {
        this.f1174C = true;
        Dialog dialog = this.f1157c0;
        if (dialog != null) {
            this.f1158d0 = false;
            dialog.show();
            View decorView = this.f1157c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            C0227a.p(decorView, this);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public void z() {
        this.f1174C = true;
        Dialog dialog = this.f1157c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
