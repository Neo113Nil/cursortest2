package androidx.fragment.app;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3584a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3585b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.n f3586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f3587d;

    public H(Q q4) {
        this.f3587d = q4;
    }

    public final void a() {
        boolean J7 = Q.J(3);
        Q q4 = this.f3587d;
        if (J7) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + q4);
        }
        C0210a c0210a = q4.f3620h;
        if (c0210a != null) {
            c0210a.f3697q = false;
            c0210a.d(false);
            q4.A(true);
            q4.D();
            Iterator it = q4.f3624m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        q4.f3620h = null;
    }
}
