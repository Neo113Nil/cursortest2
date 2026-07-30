package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ta0 extends fr0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new r7(4, this);
    private DialogInterface.OnCancelListener mOnCancelListener = new qa0(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new ra0(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private wt1 mObserver = new ar0(23, this);
    private boolean mDialogCreated = false;

    @Override // defpackage.fr0
    public mr0 createFragmentContainer() {
        return new sa0(this, super.createFragmentContainer());
    }

    public void dismiss() {
        f(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        f(true, false, false);
    }

    public void dismissNow() {
        f(false, false, true);
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                as0 parentFragmentManager = getParentFragmentManager();
                int i = this.mBackStackId;
                if (i < 0) {
                    parentFragmentManager.getClass();
                    lh.e(in1.k(i, "Bad id: "));
                    return;
                }
                parentFragmentManager.N(i, 1);
            } else {
                as0 parentFragmentManager2 = getParentFragmentManager();
                int i2 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i2 < 0) {
                    lh.e(in1.k(i2, "Bad id: "));
                    return;
                }
                parentFragmentManager2.v(new zr0(parentFragmentManager2, i2), z);
            }
            this.mBackStackId = -1;
            return;
        }
        as0 parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        wm wmVar = new wm(parentFragmentManager3);
        wmVar.o = true;
        as0 as0Var = this.mFragmentManager;
        as0 as0Var2 = wmVar.p;
        if (as0Var != null && as0Var != as0Var2) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        wmVar.b(new os0(this, 3));
        if (z3) {
            if (wmVar.g) {
                lh.g("This transaction is already being added to the back stack");
                return;
            } else {
                as0Var2.y(wmVar, false);
                return;
            }
        }
        if (z) {
            wmVar.e(true);
        } else {
            wmVar.e(false);
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // defpackage.fr0
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // defpackage.fr0
    public void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        ef1 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        wt1 wt1Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        ef1.a("observeForever");
        df1 df1Var = new df1(viewLifecycleOwnerLiveData, wt1Var);
        dd2 dd2Var = viewLifecycleOwnerLiveData.b;
        ad2 a = dd2Var.a(wt1Var);
        if (a != null) {
            obj = a.n;
        } else {
            ad2 ad2Var = new ad2(wt1Var, df1Var);
            dd2Var.p++;
            ad2 ad2Var2 = dd2Var.n;
            if (ad2Var2 == null) {
                dd2Var.m = ad2Var;
                dd2Var.n = ad2Var;
            } else {
                ad2Var2.o = ad2Var;
                ad2Var.p = ad2Var2;
                dd2Var.n = ad2Var;
            }
            obj = null;
        }
        if (((df1) obj) == null) {
            df1Var.a(true);
        }
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // defpackage.fr0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (as0.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ay(requireContext(), getTheme());
    }

    @Override // defpackage.fr0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // defpackage.fr0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        ef1 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        wt1 wt1Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        ef1.a("removeObserver");
        df1 df1Var = (df1) viewLifecycleOwnerLiveData.b.b(wt1Var);
        if (df1Var == null) {
            return;
        }
        df1Var.a(false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (as0.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        f(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.fr0
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.mShowsDialog;
        if (z && !this.mCreatingDialog) {
            if (z && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog onCreateDialog = onCreateDialog(bundle);
                    this.mDialog = onCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(onCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (as0.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (as0.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // defpackage.fr0
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // defpackage.fr0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ij2.l(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.fr0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.fr0
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.fr0
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (as0.G(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(as0 as0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        as0Var.getClass();
        wm wmVar = new wm(as0Var);
        wmVar.o = true;
        wmVar.c(0, this, str);
        wmVar.e(false);
    }

    public void showNow(as0 as0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        as0Var.getClass();
        wm wmVar = new wm(as0Var);
        wmVar.o = true;
        wmVar.c(0, this, str);
        if (wmVar.g) {
            lh.g("This transaction is already being added to the back stack");
        } else {
            wmVar.p.y(wmVar, false);
        }
    }

    public int show(ps0 ps0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        ps0Var.c(0, this, str);
        this.mViewDestroyed = false;
        int e = ((wm) ps0Var).e(false);
        this.mBackStackId = e;
        return e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
