package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: classes.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<a> f14040a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f14041b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HuaweiApiClient f14042a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f14043b;

        public a(int i4, HuaweiApiClient huaweiApiClient) {
            this.f14042a = huaweiApiClient;
            this.f14043b = i4;
        }

        public void a() {
            this.f14042a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e4);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f14041b = true;
        for (int i4 = 0; i4 < this.f14040a.size(); i4++) {
            this.f14040a.valueAt(i4).f14042a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f14041b = false;
        for (int i4 = 0; i4 < this.f14040a.size(); i4++) {
            this.f14040a.valueAt(i4).f14042a.disconnect();
        }
    }

    public void startAutoMange(int i4, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f14040a.indexOfKey(i4) < 0, "Already managing a HuaweiApiClient with this clientId: " + i4);
        this.f14040a.put(i4, new a(i4, huaweiApiClient));
        if (this.f14041b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i4) {
        a aVar = this.f14040a.get(i4);
        this.f14040a.remove(i4);
        if (aVar != null) {
            aVar.a();
        }
    }
}
