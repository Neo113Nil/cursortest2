package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.EnumC0081n;
import b.InterfaceC0090b;
import b0.AbstractC0091a;
import c.C0104k;
import g.AbstractActivityC0159k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z.AbstractC0369a;
import z.InterfaceC0371c;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0064v extends a.p implements InterfaceC0371c {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0066x mFragments;
    boolean mResumed;
    final C0088v mFragmentLifecycleRegistry = new C0088v(this);
    boolean mStopped = true;

    public AbstractActivityC0064v() {
        final AbstractActivityC0159k abstractActivityC0159k = (AbstractActivityC0159k) this;
        this.mFragments = new C0066x(new C0063u(abstractActivityC0159k));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new r(0, abstractActivityC0159k));
        final int i = 0;
        addOnConfigurationChangedListener(new J.a() { // from class: androidx.fragment.app.s
            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC0159k.mFragments.a();
                        break;
                    default:
                        abstractActivityC0159k.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new J.a() { // from class: androidx.fragment.app.s
            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        abstractActivityC0159k.mFragments.a();
                        break;
                    default:
                        abstractActivityC0159k.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0090b() { // from class: androidx.fragment.app.t
            @Override // b.InterfaceC0090b
            public final void a(a.p pVar) {
                C0063u c0063u = AbstractActivityC0159k.this.mFragments.f1432a;
                c0063u.f1425j.b(c0063u, c0063u, null);
            }
        });
    }

    public static boolean d(K k2) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : k2.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                C0063u c0063u = abstractComponentCallbacksC0060q.f1411s;
                if ((c0063u == null ? null : c0063u.f1426k) != null) {
                    z2 |= d(abstractComponentCallbacksC0060q.c());
                }
                U u2 = abstractComponentCallbacksC0060q.f1390N;
                EnumC0081n enumC0081n = EnumC0081n.f1492d;
                if (u2 != null) {
                    u2.b();
                    if (u2.f1287c.f1500c.compareTo(enumC0081n) >= 0) {
                        abstractComponentCallbacksC0060q.f1390N.f1287c.g();
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0060q.f1389M.f1500c.compareTo(enumC0081n) >= 0) {
                    abstractComponentCallbacksC0060q.f1389M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f1432a.f1425j.f1229f.onCreateView(view, str, context, attributeSet);
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
                AbstractC0091a.a(this).b(str2, printWriter);
            }
            this.mFragments.f1432a.f1425j.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public K getSupportFragmentManager() {
        return this.mFragments.f1432a.f1425j;
    }

    @Deprecated
    public AbstractC0091a getSupportLoaderManager() {
        return AbstractC0091a.a(this);
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // a.p, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
    }

    @Override // a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_CREATE);
        L l2 = this.mFragments.f1432a.f1425j;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1432a.f1425j.k();
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_DESTROY);
    }

    @Override // a.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f1432a.f1425j.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1432a.f1425j.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // a.p, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1432a.f1425j.y(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_RESUME);
        L l2 = this.mFragments.f1432a.f1425j;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            L l2 = this.mFragments.f1432a.f1425j;
            l2.f1216E = false;
            l2.F = false;
            l2.f1222L.f1261g = false;
            l2.t(4);
        }
        this.mFragments.f1432a.f1425j.y(true);
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_START);
        L l3 = this.mFragments.f1432a.f1425j;
        l3.f1216E = false;
        l3.F = false;
        l3.f1222L.f1261g = false;
        l3.t(5);
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
        L l2 = this.mFragments.f1432a.f1425j;
        l2.F = true;
        l2.f1222L.f1261g = true;
        l2.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC0080m.ON_STOP);
    }

    public void setEnterSharedElementCallback(z.o oVar) {
        AbstractC0369a.c(this, null);
    }

    public void setExitSharedElementCallback(z.o oVar) {
        AbstractC0369a.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC0060q.f1411s == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0060q + " not attached to Activity");
        }
        K f2 = abstractComponentCallbacksC0060q.f();
        if (f2.f1247z == null) {
            C0063u c0063u = f2.f1241t;
            if (i == -1) {
                c0063u.h.startActivity(intent, bundle);
                return;
            } else {
                c0063u.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        f2.f1214C.addLast(new H(abstractComponentCallbacksC0060q.f1399e, i));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        f2.f1247z.a(intent);
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2 = intent;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (abstractComponentCallbacksC0060q.f1411s == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0060q + " not attached to Activity");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0060q + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        K f2 = abstractComponentCallbacksC0060q.f();
        if (f2.f1212A == null) {
            C0063u c0063u = f2.f1241t;
            if (i == -1) {
                c0063u.f1424g.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                c0063u.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0060q);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        X0.f.e(intentSender, "intentSender");
        C0104k c0104k = new C0104k(intentSender, intent2, i2, i3);
        f2.f1214C.addLast(new H(abstractComponentCallbacksC0060q.f1399e, i));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0060q + "is launching an IntentSender for result ");
        }
        f2.f1212A.a(c0104k);
    }

    public void supportFinishAfterTransition() {
        AbstractC0369a.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0369a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0369a.e(this);
    }

    @Override // z.InterfaceC0371c
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0060q, intent, i, (Bundle) null);
    }
}
