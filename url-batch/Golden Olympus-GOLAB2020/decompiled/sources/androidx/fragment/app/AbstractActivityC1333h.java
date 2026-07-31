package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.AbstractC1278b;
import androidx.core.view.InterfaceC1323x;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.C1356w;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b.InterfaceC1366b;
import h0.C2435d;
import h0.InterfaceC2437f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1333h extends androidx.activity.j implements AbstractC1278b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final k mFragments = k.b(new a());
    final C1356w mFragmentLifecycleRegistry = new C1356w(this);
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.h$a */
    class a extends m implements androidx.core.content.b, androidx.core.content.c, androidx.core.app.w, androidx.core.app.x, c0, androidx.activity.y, c.d, InterfaceC2437f, w, InterfaceC1323x {
        public a() {
            super(AbstractActivityC1333h.this);
        }

        @Override // androidx.fragment.app.w
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            AbstractActivityC1333h.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.InterfaceC1323x
        public void addMenuProvider(androidx.core.view.C c4) {
            AbstractActivityC1333h.this.addMenuProvider(c4);
        }

        @Override // androidx.core.content.b
        public void addOnConfigurationChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.w
        public void addOnMultiWindowModeChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.x
        public void addOnPictureInPictureModeChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.c
        public void addOnTrimMemoryListener(A.a aVar) {
            AbstractActivityC1333h.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.j
        public View c(int i4) {
            return AbstractActivityC1333h.this.findViewById(i4);
        }

        @Override // androidx.fragment.app.j
        public boolean d() {
            Window window = AbstractActivityC1333h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // c.d
        public c.c getActivityResultRegistry() {
            return AbstractActivityC1333h.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1354u
        public AbstractC1346l getLifecycle() {
            return AbstractActivityC1333h.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.y
        public androidx.activity.w getOnBackPressedDispatcher() {
            return AbstractActivityC1333h.this.getOnBackPressedDispatcher();
        }

        @Override // h0.InterfaceC2437f
        public C2435d getSavedStateRegistry() {
            return AbstractActivityC1333h.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.c0
        public b0 getViewModelStore() {
            return AbstractActivityC1333h.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.m
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1333h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.m
        public LayoutInflater j() {
            return AbstractActivityC1333h.this.getLayoutInflater().cloneInContext(AbstractActivityC1333h.this);
        }

        @Override // androidx.fragment.app.m
        public boolean l(String str) {
            return AbstractC1278b.z(AbstractActivityC1333h.this, str);
        }

        @Override // androidx.fragment.app.m
        public void o() {
            p();
        }

        public void p() {
            AbstractActivityC1333h.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.m
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1333h i() {
            return AbstractActivityC1333h.this;
        }

        @Override // androidx.core.view.InterfaceC1323x
        public void removeMenuProvider(androidx.core.view.C c4) {
            AbstractActivityC1333h.this.removeMenuProvider(c4);
        }

        @Override // androidx.core.content.b
        public void removeOnConfigurationChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.w
        public void removeOnMultiWindowModeChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.x
        public void removeOnPictureInPictureModeChangedListener(A.a aVar) {
            AbstractActivityC1333h.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.c
        public void removeOnTrimMemoryListener(A.a aVar) {
            AbstractActivityC1333h.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public AbstractActivityC1333h() {
        u();
    }

    public static /* synthetic */ Bundle s(AbstractActivityC1333h abstractActivityC1333h) {
        abstractActivityC1333h.markFragmentsCreated();
        abstractActivityC1333h.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_STOP);
        return new Bundle();
    }

    private void u() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new C2435d.c() { // from class: androidx.fragment.app.d
            @Override // h0.C2435d.c
            public final Bundle a() {
                return AbstractActivityC1333h.s(AbstractActivityC1333h.this);
            }
        });
        addOnConfigurationChangedListener(new A.a() { // from class: androidx.fragment.app.e
            @Override // A.a
            public final void accept(Object obj) {
                AbstractActivityC1333h.this.mFragments.m();
            }
        });
        addOnNewIntentListener(new A.a() { // from class: androidx.fragment.app.f
            @Override // A.a
            public final void accept(Object obj) {
                AbstractActivityC1333h.this.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC1366b() { // from class: androidx.fragment.app.g
            @Override // b.InterfaceC1366b
            public final void a(Context context) {
                AbstractActivityC1333h.this.mFragments.a(null);
            }
        });
    }

    private static boolean v(FragmentManager fragmentManager, AbstractC1346l.b bVar) {
        boolean z4 = false;
        for (Fragment fragment : fragmentManager.s0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z4 |= v(fragment.getChildFragmentManager(), bVar);
                }
                D d4 = fragment.mViewLifecycleOwner;
                if (d4 != null && d4.getLifecycle().getCurrentState().d(AbstractC1346l.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z4 = true;
                }
                if (fragment.mLifecycleRegistry.getCurrentState().d(AbstractC1346l.b.STARTED)) {
                    fragment.mLifecycleRegistry.l(bVar);
                    z4 = true;
                }
            }
        }
        return z4;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
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
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (v(getSupportFragmentManager(), AbstractC1346l.b.CREATED)) {
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i4, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.j, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_DESTROY);
    }

    @Override // androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.g(AbstractC1346l.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.B b4) {
        AbstractC1278b.x(this, b4);
    }

    public void setExitSharedElementCallback(androidx.core.app.B b4) {
        AbstractC1278b.y(this, b4);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i4) {
        startActivityFromFragment(fragment, intent, i4, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (i4 == -1) {
            AbstractC1278b.B(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC1278b.t(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC1278b.u(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC1278b.C(this);
    }

    @Override // androidx.core.app.AbstractC1278b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i4) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (i4 == -1) {
            AbstractC1278b.A(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i4, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
