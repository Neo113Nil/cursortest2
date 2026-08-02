package androidx.fragment.app;

import E.AbstractC0005f;
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
import b.DialogC0254o;
import com.rockchicken.pump.up.road.R;
import m.C1275c;
import m.C1278f;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0215t extends F implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0213q f4966a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4967b;

    /* renamed from: c, reason: collision with root package name */
    public int f4968c;

    /* renamed from: d, reason: collision with root package name */
    public int f4969d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4970e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4971f;

    /* renamed from: g, reason: collision with root package name */
    public int f4972g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4973h;

    /* renamed from: i, reason: collision with root package name */
    public final A f4974i;

    /* renamed from: j, reason: collision with root package name */
    public Dialog f4975j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4977l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4978m;
    public boolean n;

    public DialogInterfaceOnCancelListenerC0215t() {
        new RunnableC0212p(0, this);
        this.f4966a = new DialogInterfaceOnCancelListenerC0213q(this);
        this.f4967b = new r(this);
        this.f4968c = 0;
        this.f4969d = 0;
        this.f4970e = true;
        this.f4971f = true;
        this.f4972g = -1;
        this.f4974i = new A(1, this);
        this.n = false;
    }

    @Override // androidx.fragment.app.F
    public final N createFragmentContainer() {
        return new C0214s(this, super.createFragmentContainer());
    }

    public Dialog f() {
        if (f0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0254o(requireContext(), this.f4969d);
    }

    @Override // androidx.fragment.app.F
    public final void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.s viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.s.a("observeForever");
        A a3 = this.f4974i;
        androidx.lifecycle.r rVar = new androidx.lifecycle.r(viewLifecycleOwnerLiveData, a3);
        C1278f c1278f = viewLifecycleOwnerLiveData.f5066b;
        C1275c b4 = c1278f.b(a3);
        if (b4 != null) {
            obj = b4.f14282b;
        } else {
            C1275c c1275c = new C1275c(a3, rVar);
            c1278f.f14291d++;
            C1275c c1275c2 = c1278f.f14289b;
            if (c1275c2 == null) {
                c1278f.f14288a = c1275c;
                c1278f.f14289b = c1275c;
            } else {
                c1275c2.f14283c = c1275c;
                c1275c.f14284d = c1275c2;
                c1278f.f14289b = c1275c;
            }
            obj = null;
        }
        if (((androidx.lifecycle.r) obj) == null) {
            rVar.a(true);
        }
        if (this.f4978m) {
            return;
        }
        this.f4977l = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.F
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f4971f = this.mContainerId == 0;
        if (bundle != null) {
            this.f4968c = bundle.getInt("android:style", 0);
            this.f4969d = bundle.getInt("android:theme", 0);
            this.f4970e = bundle.getBoolean("android:cancelable", true);
            this.f4971f = bundle.getBoolean("android:showsDialog", this.f4971f);
            this.f4972g = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4975j;
        if (dialog != null) {
            this.f4976k = true;
            dialog.setOnDismissListener(null);
            this.f4975j.dismiss();
            if (!this.f4977l) {
                onDismiss(this.f4975j);
            }
            this.f4975j = null;
            this.n = false;
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDetach() {
        super.onDetach();
        if (!this.f4978m && !this.f4977l) {
            this.f4977l = true;
        }
        androidx.lifecycle.s viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.s.a("removeObserver");
        androidx.lifecycle.r rVar = (androidx.lifecycle.r) viewLifecycleOwnerLiveData.f5066b.c(this.f4974i);
        if (rVar == null) {
            return;
        }
        rVar.a(false);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f4976k) {
            return;
        }
        if (f0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4977l) {
            return;
        }
        this.f4977l = true;
        this.f4978m = false;
        Dialog dialog = this.f4975j;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4975j.dismiss();
        }
        this.f4976k = true;
        if (this.f4972g >= 0) {
            f0 parentFragmentManager = getParentFragmentManager();
            int i4 = this.f4972g;
            parentFragmentManager.getClass();
            if (i4 < 0) {
                throw new IllegalArgumentException(AbstractC0005f.j(i4, "Bad id: "));
            }
            parentFragmentManager.x(new C0200d0(parentFragmentManager, i4), true);
            this.f4972g = -1;
            return;
        }
        f0 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C0193a c0193a = new C0193a(parentFragmentManager2);
        c0193a.o = true;
        f0 f0Var = this.mFragmentManager;
        if (f0Var == null || f0Var == c0193a.f4801p) {
            c0193a.b(new o0(this, 3));
            c0193a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        Context context;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.f4971f;
        if (z && !this.f4973h) {
            if (z && !this.n) {
                try {
                    this.f4973h = true;
                    Dialog f4 = f();
                    this.f4975j = f4;
                    if (this.f4971f) {
                        int i4 = this.f4968c;
                        if (i4 != 1 && i4 != 2) {
                            if (i4 == 3) {
                                Window window = f4.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                context = getContext();
                                if (context instanceof Activity) {
                                    this.f4975j.setOwnerActivity((Activity) context);
                                }
                                this.f4975j.setCancelable(this.f4970e);
                                this.f4975j.setOnCancelListener(this.f4966a);
                                this.f4975j.setOnDismissListener(this.f4967b);
                                this.n = true;
                            }
                        }
                        f4.requestWindowFeature(1);
                        context = getContext();
                        if (context instanceof Activity) {
                        }
                        this.f4975j.setCancelable(this.f4970e);
                        this.f4975j.setOnCancelListener(this.f4966a);
                        this.f4975j.setOnDismissListener(this.f4967b);
                        this.n = true;
                    } else {
                        this.f4975j = null;
                    }
                    this.f4973h = false;
                } catch (Throwable th) {
                    this.f4973h = false;
                    throw th;
                }
            }
            if (f0.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4975j;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (f0.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4971f) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.f4975j;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.f4968c;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.f4969d;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z = this.f4970e;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z4 = this.f4971f;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i6 = this.f4972g;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f4975j;
        if (dialog != null) {
            this.f4976k = false;
            dialog.show();
            View decorView = this.f4975j.getWindow().getDecorView();
            kotlin.jvm.internal.i.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f4975j;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4975j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4975j.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.F
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f4975j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4975j.onRestoreInstanceState(bundle2);
    }
}
