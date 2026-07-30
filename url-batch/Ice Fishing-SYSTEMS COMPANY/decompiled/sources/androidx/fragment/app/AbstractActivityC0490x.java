package androidx.fragment.app;

import D.AbstractC0282b;
import D.InterfaceC0286f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.EnumC0507o;
import d.InterfaceC4445b;
import h.AbstractActivityC4553l;
import i0.AbstractC4571a;
import i0.C4572b;
import i0.C4573c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0490x extends androidx.activity.p implements InterfaceC0286f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0492z mFragments;
    boolean mResumed;
    final C0515x mFragmentLifecycleRegistry = new C0515x(this);
    boolean mStopped = true;

    public AbstractActivityC0490x() {
        final AbstractActivityC4553l abstractActivityC4553l = (AbstractActivityC4553l) this;
        this.mFragments = new C0492z(new C0489w(abstractActivityC4553l));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0486t(0, abstractActivityC4553l));
        final int i = 0;
        addOnConfigurationChangedListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC4553l.mFragments.a();
                        break;
                    default:
                        abstractActivityC4553l.mFragments.a();
                        break;
                }
            }
        });
        final int i4 = 1;
        addOnNewIntentListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        abstractActivityC4553l.mFragments.a();
                        break;
                    default:
                        abstractActivityC4553l.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC4445b() { // from class: androidx.fragment.app.v
            @Override // d.InterfaceC4445b
            public final void a(androidx.activity.p pVar) {
                C0489w c0489w = AbstractActivityC4553l.this.mFragments.f5197a;
                c0489w.f5190w.b(c0489w, c0489w, null);
            }
        });
    }

    public static boolean d(N n9) {
        boolean z8 = false;
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : n9.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null) {
                C0489w c0489w = abstractComponentCallbacksC0485s.f5150L;
                if ((c0489w == null ? null : c0489w.f5191x) != null) {
                    z8 |= d(abstractComponentCallbacksC0485s.c());
                }
                X x3 = abstractComponentCallbacksC0485s.f5171t0;
                EnumC0507o enumC0507o = EnumC0507o.f5279w;
                if (x3 != null) {
                    x3.b();
                    if (x3.f5033w.f5290d.compareTo(enumC0507o) >= 0) {
                        abstractComponentCallbacksC0485s.f5171t0.f5033w.g();
                        z8 = true;
                    }
                }
                if (abstractComponentCallbacksC0485s.f5170s0.f5290d.compareTo(enumC0507o) >= 0) {
                    abstractComponentCallbacksC0485s.f5170s0.g();
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f5197a.f5190w.f4967f.onCreateView(view, str, context, attributeSet);
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
                s.l lVar = ((C4572b) new Y2.e(getViewModelStore(), C4572b.f38273b).t(C4572b.class)).f38274a;
                if (lVar.f40413v > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (lVar.f40413v > 0) {
                        if (lVar.f40412u[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(lVar.f40411n[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f5197a.f5190w.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public N getSupportFragmentManager() {
        return this.mFragments.f5197a.f5190w;
    }

    @Deprecated
    public AbstractC4571a getSupportLoaderManager() {
        return new C4573c(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i4, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
    }

    @Override // androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_CREATE);
        O o9 = this.mFragments.f5197a.f5190w;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f5197a.f5190w.k();
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_DESTROY);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f5197a.f5190w.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f5197a.f5190w.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f5197a.f5190w.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_RESUME);
        O o9 = this.mFragments.f5197a.f5190w;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            O o9 = this.mFragments.f5197a.f5190w;
            o9.f4954E = false;
            o9.f4955F = false;
            o9.f4960L.f5002f = false;
            o9.t(4);
        }
        this.mFragments.f5197a.f5190w.x(true);
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_START);
        O o10 = this.mFragments.f5197a.f5190w;
        o10.f4954E = false;
        o10.f4955F = false;
        o10.f4960L.f5002f = false;
        o10.t(5);
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
        O o9 = this.mFragments.f5197a.f5190w;
        o9.f4955F = true;
        o9.f4960L.f5002f = true;
        o9.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC0506n.ON_STOP);
    }

    public void setEnterSharedElementCallback(D.P p6) {
        AbstractC0282b.c(this, null);
    }

    public void setExitSharedElementCallback(D.P p6) {
        AbstractC0282b.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC0485s.f5150L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0485s + " not attached to Activity");
        }
        N f6 = abstractComponentCallbacksC0485s.f();
        if (f6.f4986z != null) {
            f6.f4952C.addLast(new K(abstractComponentCallbacksC0485s.f5178x, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            f6.f4986z.a(intent);
            return;
        }
        C0489w c0489w = f6.f4980t;
        if (i == -1) {
            c0489w.f5188u.startActivity(intent, bundle);
        } else {
            c0489w.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, IntentSender intentSender, int i, Intent intent, int i4, int i9, int i10, Bundle bundle) {
        Intent intent2;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i4, i9, i10, bundle);
            return;
        }
        if (abstractComponentCallbacksC0485s.f5150L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0485s + " not attached to Activity");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0485s + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        N f6 = abstractComponentCallbacksC0485s.f();
        if (f6.f4950A == null) {
            C0489w c0489w = f6.f4980t;
            if (i == -1) {
                c0489w.f5187n.startIntentSenderForResult(intentSender, i, intent, i4, i9, i10, bundle);
                return;
            } else {
                c0489w.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (N.E(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0485s);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        kotlin.jvm.internal.h.e(intentSender, "intentSender");
        e.j jVar = new e.j(intentSender, intent2, i4, i9);
        f6.f4952C.addLast(new K(abstractComponentCallbacksC0485s.f5178x, i));
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0485s + "is launching an IntentSender for result ");
        }
        f6.f4950A.a(jVar);
    }

    public void supportFinishAfterTransition() {
        AbstractC0282b.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0282b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0282b.e(this);
    }

    @Override // D.InterfaceC0286f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0485s, intent, i, (Bundle) null);
    }
}
