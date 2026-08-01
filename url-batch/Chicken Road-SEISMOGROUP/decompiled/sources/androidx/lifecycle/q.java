package androidx.lifecycle;

import a.AbstractC0016a;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class q extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f506b = 0;

    /* renamed from: a, reason: collision with root package name */
    public B.k f507a;

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            e0.h.d(activity, "activity");
            AbstractC0016a.i(activity, dVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(d.ON_DESTROY);
        this.f507a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.k kVar = this.f507a;
        if (kVar != null) {
            ((n) kVar.f44c).b();
        }
        a(d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.k kVar = this.f507a;
        if (kVar != null) {
            n nVar = (n) kVar.f44c;
            int i2 = nVar.f498a + 1;
            nVar.f498a = i2;
            if (i2 == 1 && nVar.f501d) {
                nVar.f503f.a(d.ON_START);
                nVar.f501d = false;
            }
        }
        a(d.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(d.ON_STOP);
    }
}
