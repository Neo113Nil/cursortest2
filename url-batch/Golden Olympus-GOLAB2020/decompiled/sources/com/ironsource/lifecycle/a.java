package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private static final String f17065b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0151a f17066a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0151a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f17065b);
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f17065b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f17065b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0151a interfaceC0151a) {
        if (interfaceC0151a != null) {
            interfaceC0151a.a(getActivity());
        }
    }

    void d(InterfaceC0151a interfaceC0151a) {
        this.f17066a = interfaceC0151a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f17066a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17066a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f17066a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f17066a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0151a interfaceC0151a) {
        if (interfaceC0151a != null) {
            interfaceC0151a.b(getActivity());
        }
    }

    private void b(InterfaceC0151a interfaceC0151a) {
        if (interfaceC0151a != null) {
            interfaceC0151a.onResume(getActivity());
        }
    }
}
