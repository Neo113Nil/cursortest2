package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.c;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* loaded from: classes.dex */
public class ReportFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private a f1349a;

    interface a {
        void a();

        void b();

        void c();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f1349a);
        a(c.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        b(this.f1349a);
        a(c.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.f1349a);
        a(c.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(c.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(c.a.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(c.a.ON_DESTROY);
        this.f1349a = null;
    }

    private void a(c.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof g) {
            ((g) activity).a().a(aVar);
        } else if (activity instanceof e) {
            c lifecycle = ((e) activity).getLifecycle();
            if (lifecycle instanceof f) {
                ((f) lifecycle).a(aVar);
            }
        }
    }
}
