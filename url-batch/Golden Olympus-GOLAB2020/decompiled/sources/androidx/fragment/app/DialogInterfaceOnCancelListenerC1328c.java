package androidx.fragment.app;

import android.R;
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
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import h0.AbstractC2438g;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1328c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
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
    private Runnable mDismissRunnable = new a();
    private DialogInterface.OnCancelListener mOnCancelListener = new b();
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterfaceOnDismissListenerC0107c();
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.C mObserver = new d();
    private boolean mDialogCreated = false;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1328c.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC1328c.this.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1328c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1328c dialogInterfaceOnCancelListenerC1328c = DialogInterfaceOnCancelListenerC1328c.this;
                dialogInterfaceOnCancelListenerC1328c.onCancel(dialogInterfaceOnCancelListenerC1328c.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class DialogInterfaceOnDismissListenerC0107c implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC0107c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1328c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1328c dialogInterfaceOnCancelListenerC1328c = DialogInterfaceOnCancelListenerC1328c.this;
                dialogInterfaceOnCancelListenerC1328c.onDismiss(dialogInterfaceOnCancelListenerC1328c.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    class d implements androidx.lifecycle.C {
        d() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void d(InterfaceC1354u interfaceC1354u) {
            if (interfaceC1354u == null || !DialogInterfaceOnCancelListenerC1328c.this.mShowsDialog) {
                return;
            }
            View requireView = DialogInterfaceOnCancelListenerC1328c.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1328c.this.mDialog != null) {
                if (FragmentManager.G0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1328c.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC1328c.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    class e extends j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f12480a;

        e(j jVar) {
            this.f12480a = jVar;
        }

        @Override // androidx.fragment.app.j
        public View c(int i4) {
            return this.f12480a.d() ? this.f12480a.c(i4) : DialogInterfaceOnCancelListenerC1328c.this.onFindViewById(i4);
        }

        @Override // androidx.fragment.app.j
        public boolean d() {
            return this.f12480a.d() || DialogInterfaceOnCancelListenerC1328c.this.onHasView();
        }
    }

    private void i(boolean z4, boolean z5, boolean z6) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z6) {
                getParentFragmentManager().Z0(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().W0(this.mBackStackId, 1, z4);
            }
            this.mBackStackId = -1;
            return;
        }
        z o4 = getParentFragmentManager().o();
        o4.q(true);
        o4.m(this);
        if (z6) {
            o4.i();
        } else if (z4) {
            o4.h();
        } else {
            o4.g();
        }
    }

    private void j(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
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
    }

    @Override // androidx.fragment.app.Fragment
    j createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        i(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        i(true, false, false);
    }

    public void dismissNow() {
        i(false, false, true);
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

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().j(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
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
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.r(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().n(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        i(true, true, false);
    }

    View onFindViewById(int i4) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            j(bundle);
            if (FragmentManager.G0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.G0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i4 = this.mStyle;
        if (i4 != 0) {
            bundle.putInt(SAVED_STYLE, i4);
        }
        int i5 = this.mTheme;
        if (i5 != 0) {
            bundle.putInt(SAVED_THEME, i5);
        }
        boolean z4 = this.mCancelable;
        if (!z4) {
            bundle.putBoolean(SAVED_CANCELABLE, z4);
        }
        boolean z5 = this.mShowsDialog;
        if (!z5) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z5);
        }
        int i6 = this.mBackStackId;
        if (i6 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            d0.b(decorView, this);
            e0.a(decorView, this);
            AbstractC2438g.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
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

    public void setCancelable(boolean z4) {
        this.mCancelable = z4;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z4);
        }
    }

    public void setShowsDialog(boolean z4) {
        this.mShowsDialog = z4;
    }

    public void setStyle(int i4, int i5) {
        if (FragmentManager.G0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.mStyle = i4;
        if (i4 == 2 || i4 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.mTheme = i5;
        }
    }

    public void setupDialog(Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        z o4 = fragmentManager.o();
        o4.q(true);
        o4.d(this, str);
        o4.g();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        z o4 = fragmentManager.o();
        o4.q(true);
        o4.d(this, str);
        o4.i();
    }

    public int show(z zVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        zVar.d(this, str);
        this.mViewDestroyed = false;
        int g4 = zVar.g();
        this.mBackStackId = g4;
        return g4;
    }
}
