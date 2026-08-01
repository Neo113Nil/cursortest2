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
import com.visualfortune.eyerest.R;
import g.AbstractActivityC0131i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0044m extends AbstractComponentCallbacksC0048q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0041j f968T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0042k f969U;

    /* renamed from: V, reason: collision with root package name */
    public int f970V;

    /* renamed from: W, reason: collision with root package name */
    public int f971W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f972X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f973Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f974Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f975a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C.g f976b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f977c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f978d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f979e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f980f0;

    public DialogInterfaceOnCancelListenerC0044m() {
        new L0.B(4, this);
        this.f968T = new DialogInterfaceOnCancelListenerC0041j(this);
        this.f969U = new DialogInterfaceOnDismissListenerC0042k(this);
        this.f970V = 0;
        this.f971W = 0;
        this.f972X = true;
        this.f973Y = true;
        this.f974Z = -1;
        this.f976b0 = new C.g(16, this);
        this.f980f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f993C = true;
        if (this.f977c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f977c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f995E != null || this.f977c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f977c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f971W);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final s1.l e() {
        return new C0043l(this, new C0046o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f978d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f979e0) {
            return;
        }
        this.f979e0 = true;
        Dialog dialog = this.f977c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f977c0.dismiss();
        }
        this.f978d0 = true;
        if (this.f974Z >= 0) {
            I j2 = j();
            int i = this.f974Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.d("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f974Z = -1;
            return;
        }
        C0032a c0032a = new C0032a(j());
        c0032a.f934o = true;
        I i2 = this.f1022r;
        if (i2 != null && i2 != c0032a.f935p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0032a.b(new P(3, this));
        if (c0032a.f936q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0032a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0032a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0032a.f936q = true;
        boolean z2 = c0032a.f928g;
        I i3 = c0032a.f935p;
        if (z2) {
            c0032a.f937r = i3.i.getAndIncrement();
        } else {
            c0032a.f937r = -1;
        }
        i3.w(c0032a, true);
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void p() {
        this.f993C = true;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void r(AbstractActivityC0131i abstractActivityC0131i) {
        Object obj;
        super.r(abstractActivityC0131i);
        androidx.lifecycle.w wVar = this.f1004O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        C.g gVar = this.f976b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, gVar);
        n.f fVar = wVar.f1417b;
        n.c a2 = fVar.a(gVar);
        if (a2 != null) {
            obj = a2.f3273b;
        } else {
            n.c cVar = new n.c(gVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3279b;
            if (cVar2 == null) {
                fVar.f3278a = cVar;
                fVar.f3279b = cVar;
            } else {
                cVar2.f3274c = cVar;
                cVar.d = cVar2;
                fVar.f3279b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f979e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f973Y = this.f1027w == 0;
        if (bundle != null) {
            this.f970V = bundle.getInt("android:style", 0);
            this.f971W = bundle.getInt("android:theme", 0);
            this.f972X = bundle.getBoolean("android:cancelable", true);
            this.f973Y = bundle.getBoolean("android:showsDialog", this.f973Y);
            this.f974Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void u() {
        this.f993C = true;
        Dialog dialog = this.f977c0;
        if (dialog != null) {
            this.f978d0 = true;
            dialog.setOnDismissListener(null);
            this.f977c0.dismiss();
            if (!this.f979e0) {
                onDismiss(this.f977c0);
            }
            this.f977c0 = null;
            this.f980f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void v() {
        this.f993C = true;
        if (!this.f979e0) {
            this.f979e0 = true;
        }
        androidx.lifecycle.w wVar = this.f1004O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1417b.b(this.f976b0);
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
        boolean z2 = this.f973Y;
        if (!z2 || this.f975a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f973Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f980f0) {
            try {
                this.f975a0 = true;
                Dialog G2 = G();
                this.f977c0 = G2;
                if (this.f973Y) {
                    int i = this.f970V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f977c0.setOwnerActivity((Activity) h);
                            }
                            this.f977c0.setCancelable(this.f972X);
                            this.f977c0.setOnCancelListener(this.f968T);
                            this.f977c0.setOnDismissListener(this.f969U);
                            this.f980f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f977c0.setCancelable(this.f972X);
                    this.f977c0.setOnCancelListener(this.f968T);
                    this.f977c0.setOnDismissListener(this.f969U);
                    this.f980f0 = true;
                } else {
                    this.f977c0 = null;
                }
                this.f975a0 = false;
            } catch (Throwable th) {
                this.f975a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f977c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void x(Bundle bundle) {
        Dialog dialog = this.f977c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f970V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f971W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f972X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f973Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f974Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void y() {
        this.f993C = true;
        Dialog dialog = this.f977c0;
        if (dialog != null) {
            this.f978d0 = false;
            dialog.show();
            View decorView = this.f977c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            s1.d.d0(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public void z() {
        this.f993C = true;
        Dialog dialog = this.f977c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
