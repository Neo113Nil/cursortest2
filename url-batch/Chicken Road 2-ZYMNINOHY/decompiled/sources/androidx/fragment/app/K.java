package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.EnumC0230i;
import b.AbstractActivityC0253n;
import c.InterfaceC0266b;
import io.flutter.embedding.android.FlutterFragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t.AbstractC1425m;
import t.InterfaceC1413a;

/* loaded from: classes.dex */
public abstract class K extends AbstractActivityC0253n implements InterfaceC1413a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final P mFragments;
    boolean mResumed;
    final C0237p mFragmentLifecycleRegistry = new C0237p(this);
    boolean mStopped = true;

    public K() {
        final FlutterFragmentActivity flutterFragmentActivity = (FlutterFragmentActivity) this;
        this.mFragments = new P(new J(flutterFragmentActivity));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new G(0, flutterFragmentActivity));
        final int i4 = 0;
        addOnConfigurationChangedListener(new D.a() { // from class: androidx.fragment.app.H
            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        flutterFragmentActivity.mFragments.a();
                        break;
                    default:
                        flutterFragmentActivity.mFragments.a();
                        break;
                }
            }
        });
        final int i5 = 1;
        addOnNewIntentListener(new D.a() { // from class: androidx.fragment.app.H
            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        flutterFragmentActivity.mFragments.a();
                        break;
                    default:
                        flutterFragmentActivity.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0266b() { // from class: androidx.fragment.app.I
            @Override // c.InterfaceC0266b
            public final void a(AbstractActivityC0253n abstractActivityC0253n) {
                J j4 = FlutterFragmentActivity.this.mFragments.f4771a;
                j4.f4775d.b(j4, j4, null);
            }
        });
    }

    public static boolean d(f0 f0Var) {
        boolean z = false;
        for (F f4 : f0Var.f4849c.f()) {
            if (f4 != null) {
                if (f4.getHost() != null) {
                    z |= d(f4.getChildFragmentManager());
                }
                x0 x0Var = f4.mViewLifecycleOwner;
                EnumC0230i enumC0230i = EnumC0230i.f5044d;
                if (x0Var != null) {
                    x0Var.b();
                    if (x0Var.f4994d.f5052c.compareTo(enumC0230i) >= 0) {
                        f4.mViewLifecycleOwner.f4994d.g();
                        z = true;
                    }
                }
                if (f4.mLifecycleRegistry.f5052c.compareTo(enumC0230i) >= 0) {
                    f4.mLifecycleRegistry.g();
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f4771a.f4775d.f4852f.onCreateView(view, str, context, attributeSet);
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
                S.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f4771a.f4775d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public f0 getSupportFragmentManager() {
        return this.mFragments.f4771a.f4775d;
    }

    @Deprecated
    public S.a getSupportLoaderManager() {
        return S.a.a(this);
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i4, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(F f4) {
    }

    @Override // b.AbstractActivityC0253n, t.AbstractActivityC1415c, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_CREATE);
        g0 g0Var = this.mFragments.f4771a.f4775d;
        g0Var.f4839G = false;
        g0Var.f4840H = false;
        g0Var.f4845N.f4891i = false;
        g0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f4771a.f4775d.l();
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_DESTROY);
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return this.mFragments.f4771a.f4775d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f4771a.f4775d.u(5);
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f4771a.f4775d.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_RESUME);
        g0 g0Var = this.mFragments.f4771a.f4775d;
        g0Var.f4839G = false;
        g0Var.f4840H = false;
        g0Var.f4845N.f4891i = false;
        g0Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            g0 g0Var = this.mFragments.f4771a.f4775d;
            g0Var.f4839G = false;
            g0Var.f4840H = false;
            g0Var.f4845N.f4891i = false;
            g0Var.u(4);
        }
        this.mFragments.f4771a.f4775d.z(true);
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_START);
        g0 g0Var2 = this.mFragments.f4771a.f4775d;
        g0Var2.f4839G = false;
        g0Var2.f4840H = false;
        g0Var2.f4845N.f4891i = false;
        g0Var2.u(5);
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
        g0 g0Var = this.mFragments.f4771a.f4775d;
        g0Var.f4840H = true;
        g0Var.f4845N.f4891i = true;
        g0Var.u(4);
        this.mFragmentLifecycleRegistry.e(EnumC0229h.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC1425m abstractC1425m) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC1425m abstractC1425m) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(F f4, Intent intent, int i4, Bundle bundle) {
        if (i4 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            f4.startActivityForResult(intent, i4, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(F f4, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            f4.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // t.InterfaceC1413a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i4) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(F f4, Intent intent, int i4) {
        startActivityFromFragment(f4, intent, i4, (Bundle) null);
    }
}
