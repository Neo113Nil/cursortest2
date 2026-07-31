package A0;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import z0.InterfaceC3542c;

/* loaded from: classes.dex */
public class e extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f31b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final List f32a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, InterfaceC3542c interfaceC3542c) {
        e eVar;
        e eVar2;
        WeakReference weakReference = (WeakReference) f31b.get(activity);
        if (weakReference == null || weakReference.get() == null) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            e eVar3 = null;
            try {
                e eVar4 = (e) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
                if (eVar4 == null) {
                    try {
                        eVar2 = new e();
                    } catch (Exception e4) {
                        e = e4;
                    }
                    try {
                        fragmentManager.beginTransaction().add(eVar2, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
                        eVar3 = eVar2;
                    } catch (Exception e5) {
                        e = e5;
                        eVar3 = eVar2;
                        try {
                            Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
                            f31b.put(activity, new WeakReference(eVar3));
                        } catch (ClassCastException e6) {
                            e = e6;
                            eVar3 = eVar4;
                            Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                            eVar = eVar3;
                            if (eVar != null) {
                            }
                        }
                        eVar = eVar3;
                        if (eVar != null) {
                        }
                    }
                } else {
                    eVar3 = eVar4;
                }
                f31b.put(activity, new WeakReference(eVar3));
            } catch (ClassCastException e7) {
                e = e7;
            }
            eVar = eVar3;
        } else {
            eVar = (e) weakReference.get();
        }
        if (eVar != null) {
            eVar.b(interfaceC3542c);
        }
    }

    public final void b(InterfaceC3542c interfaceC3542c) {
        synchronized (this.f32a) {
            this.f32a.add(new WeakReference(interfaceC3542c));
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        synchronized (this.f32a) {
            try {
                Iterator it = this.f32a.iterator();
                while (it.hasNext()) {
                    InterfaceC3542c interfaceC3542c = (InterfaceC3542c) ((WeakReference) it.next()).get();
                    if (interfaceC3542c != null) {
                        interfaceC3542c.cancel();
                    }
                }
                this.f32a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
