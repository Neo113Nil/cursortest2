package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.EnumC0249o;
import c0.AbstractC0285a;
import e.InterfaceC0369b;
import f.C0392k;
import i.AbstractActivityC0525l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import y.InterfaceC1021a;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0233y extends d.o implements InterfaceC1021a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C mFragments;
    boolean mResumed;
    final C0258y mFragmentLifecycleRegistry = new C0258y(this);
    boolean mStopped = true;

    public AbstractActivityC0233y() {
        final AbstractActivityC0525l abstractActivityC0525l = (AbstractActivityC0525l) this;
        this.mFragments = new C(new C0232x(abstractActivityC0525l));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0229u(0, abstractActivityC0525l));
        final int i2 = 0;
        addOnConfigurationChangedListener(new H.a() { // from class: androidx.fragment.app.v
            @Override // H.a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        abstractActivityC0525l.mFragments.a();
                        break;
                    default:
                        abstractActivityC0525l.mFragments.a();
                        break;
                }
            }
        });
        final int i5 = 1;
        addOnNewIntentListener(new H.a() { // from class: androidx.fragment.app.v
            @Override // H.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        abstractActivityC0525l.mFragments.a();
                        break;
                    default:
                        abstractActivityC0525l.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0369b() { // from class: androidx.fragment.app.w
            @Override // e.InterfaceC0369b
            public final void a(d.o oVar) {
                C0232x c0232x = AbstractActivityC0525l.this.mFragments.f3578a;
                c0232x.f3825l.b(c0232x, c0232x, null);
            }
        });
    }

    public static boolean d(Q q4) {
        boolean z7 = false;
        for (ComponentCallbacksC0228t componentCallbacksC0228t : q4.f3615c.g()) {
            if (componentCallbacksC0228t != null) {
                C0232x c0232x = componentCallbacksC0228t.f3776B;
                if ((c0232x == null ? null : c0232x.f3826m) != null) {
                    z7 |= d(componentCallbacksC0228t.c());
                }
                if (componentCallbacksC0228t.f3794U.f3922d.a(EnumC0249o.f3909l)) {
                    componentCallbacksC0228t.f3794U.g();
                    z7 = true;
                }
            }
        }
        return z7;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3578a.f3825l.f3618f.onCreateView(view, str, context, attributeSet);
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
                AbstractC0285a.a(this).b(str2, printWriter);
            }
            this.mFragments.f3578a.f3825l.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public Q getSupportFragmentManager() {
        return this.mFragments.f3578a.f3825l;
    }

    @Deprecated
    public AbstractC0285a getSupportLoaderManager() {
        return AbstractC0285a.a(this);
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // d.o, android.app.Activity
    public void onActivityResult(int i2, int i5, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i2, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC0228t componentCallbacksC0228t) {
    }

    @Override // d.o, y.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_CREATE);
        S s7 = this.mFragments.f3578a.f3825l;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3578a.f3825l.l();
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_DESTROY);
    }

    @Override // d.o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return this.mFragments.f3578a.f3825l.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3578a.f3825l.u(5);
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // d.o, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3578a.f3825l.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_RESUME);
        S s7 = this.mFragments.f3578a.f3825l;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            S s7 = this.mFragments.f3578a.f3825l;
            s7.f3604G = false;
            s7.f3605H = false;
            s7.f3611N.f3653f = false;
            s7.u(4);
        }
        this.mFragments.f3578a.f3825l.A(true);
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_START);
        S s8 = this.mFragments.f3578a.f3825l;
        s8.f3604G = false;
        s8.f3605H = false;
        s8.f3611N.f3653f = false;
        s8.u(5);
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
        S s7 = this.mFragments.f3578a.f3825l;
        s7.f3605H = true;
        s7.f3611N.f3653f = true;
        s7.u(4);
        this.mFragmentLifecycleRegistry.e(EnumC0248n.ON_STOP);
    }

    public void setEnterSharedElementCallback(y.v vVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(y.v vVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(ComponentCallbacksC0228t fragment, Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (fragment.f3776B == null) {
            throw new IllegalStateException("Fragment " + fragment + " not attached to Activity");
        }
        Q e7 = fragment.e();
        if (e7.f3599B != null) {
            e7.f3602E.addLast(new M(fragment.f3803m, i2));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            e7.f3599B.a(intent);
            return;
        }
        C0232x c0232x = e7.f3633v;
        c0232x.getClass();
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        c0232x.f3823e.startActivity(intent, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(ComponentCallbacksC0228t fragment, IntentSender intent, int i2, Intent intent2, int i5, int i7, int i8, Bundle bundle) {
        Intent intent3;
        if (i2 == -1) {
            startIntentSenderForResult(intent, i2, intent2, i5, i7, i8, bundle);
            return;
        }
        if (fragment.f3776B == null) {
            throw new IllegalStateException("Fragment " + fragment + " not attached to Activity");
        }
        if (Q.J(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        Q e7 = fragment.e();
        if (e7.f3600C == null) {
            C0232x c0232x = e7.f3633v;
            c0232x.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (i2 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            AbstractActivityC0525l abstractActivityC0525l = c0232x.f3822d;
            if (abstractActivityC0525l == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            abstractActivityC0525l.startIntentSenderForResult(intent, i2, intent2, i5, i7, i8, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent3 = new Intent();
                intent3.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent3 = intent2;
            }
            if (Q.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent3 + " for fragment " + fragment);
            }
            intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent3 = intent2;
        }
        Intrinsics.checkNotNullParameter(intent, "intentSender");
        C0392k c0392k = new C0392k(intent, intent3, i5, i7);
        e7.f3602E.addLast(new M(fragment.f3803m, i2));
        if (Q.J(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        e7.f3600C.a(c0392k);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // y.InterfaceC1021a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(ComponentCallbacksC0228t componentCallbacksC0228t, Intent intent, int i2) {
        startActivityFromFragment(componentCallbacksC0228t, intent, i2, (Bundle) null);
    }
}
