package androidx.lifecycle;

import a.AbstractC0069a;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class s extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1539f = 0;

    /* renamed from: e, reason: collision with root package name */
    public A.j f1540e;

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            F0.i.d(activity, "activity");
            AbstractC0069a.k(activity, dVar);
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
        this.f1540e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A.j jVar = this.f1540e;
        if (jVar != null) {
            ((o) jVar.f30f).b();
        }
        a(d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A.j jVar = this.f1540e;
        if (jVar != null) {
            o oVar = (o) jVar.f30f;
            int i2 = oVar.f1531e + 1;
            oVar.f1531e = i2;
            if (i2 == 1 && oVar.f1534h) {
                oVar.f1536j.a(d.ON_START);
                oVar.f1534h = false;
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
