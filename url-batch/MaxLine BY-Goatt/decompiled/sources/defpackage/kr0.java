package defpackage;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class kr0 extends xx {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final or0 mFragments = new or0(new jr0(this));
    final kd1 mFragmentLifecycleRegistry = new kd1(this, true);
    boolean mStopped = true;

    public kr0() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new gr0(this, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new a20(this) { // from class: hr0
            public final /* synthetic */ kr0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i2 = i;
                kr0 kr0Var = this.b;
                switch (i2) {
                    case 0:
                        kr0Var.mFragments.a();
                        break;
                    default:
                        kr0Var.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new a20(this) { // from class: hr0
            public final /* synthetic */ kr0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i22 = i2;
                kr0 kr0Var = this.b;
                switch (i22) {
                    case 0:
                        kr0Var.mFragments.a();
                        break;
                    default:
                        kr0Var.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new ir0(this, 0));
    }

    public static boolean g(as0 as0Var) {
        zc1 zc1Var = zc1.o;
        boolean z = false;
        for (fr0 fr0Var : as0Var.c.u()) {
            if (fr0Var != null) {
                if (fr0Var.getHost() != null) {
                    z |= g(fr0Var.getChildFragmentManager());
                }
                xs0 xs0Var = fr0Var.mViewLifecycleOwner;
                if (xs0Var != null) {
                    xs0Var.b();
                    if (xs0Var.p.c.compareTo(zc1.p) >= 0) {
                        fr0Var.mViewLifecycleOwner.p.h(zc1Var);
                        z = true;
                    }
                }
                if (fr0Var.mLifecycleRegistry.c.compareTo(zc1.p) >= 0) {
                    fr0Var.mLifecycleRegistry.h(zc1Var);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.p.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                ff1.a(this).b(str2, printWriter);
            }
            this.mFragments.a.p.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public as0 getSupportFragmentManager() {
        return this.mFragments.a.p;
    }

    @Deprecated
    public ff1 getSupportLoaderManager() {
        return ff1.a(this);
    }

    public void markFragmentsCreated() {
        as0 supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            zc1 zc1Var = zc1.m;
        } while (g(supportFragmentManager));
    }

    @Override // defpackage.xx, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.xx, defpackage.wx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(yc1.ON_CREATE);
        bs0 bs0Var = this.mFragments.a.p;
        bs0Var.E = false;
        bs0Var.F = false;
        bs0Var.L.g = false;
        bs0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.p.k();
        this.mFragmentLifecycleRegistry.f(yc1.ON_DESTROY);
    }

    @Override // defpackage.xx, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.p.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.p.t(5);
        this.mFragmentLifecycleRegistry.f(yc1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.xx, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.p.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(yc1.ON_RESUME);
        bs0 bs0Var = this.mFragments.a.p;
        bs0Var.E = false;
        bs0Var.F = false;
        bs0Var.L.g = false;
        bs0Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            bs0 bs0Var = this.mFragments.a.p;
            bs0Var.E = false;
            bs0Var.F = false;
            bs0Var.L.g = false;
            bs0Var.t(4);
        }
        this.mFragments.a.p.x(true);
        this.mFragmentLifecycleRegistry.f(yc1.ON_START);
        bs0 bs0Var2 = this.mFragments.a.p;
        bs0Var2.E = false;
        bs0Var2.F = false;
        bs0Var2.L.g = false;
        bs0Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        bs0 bs0Var = this.mFragments.a.p;
        bs0Var.F = true;
        bs0Var.L.g = true;
        bs0Var.t(4);
        this.mFragmentLifecycleRegistry.f(yc1.ON_STOP);
    }

    public void setEnterSharedElementCallback(ok2 ok2Var) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(ok2 ok2Var) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(fr0 fr0Var, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fr0Var.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(fr0 fr0Var, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fr0Var.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(fr0 fr0Var, Intent intent, int i) {
        startActivityFromFragment(fr0Var, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(fr0 fr0Var) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
