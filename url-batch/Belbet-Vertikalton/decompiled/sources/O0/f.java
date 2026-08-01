package O0;

import M.P;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z.AbstractC0427a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f982a;

    /* renamed from: b, reason: collision with root package name */
    public int f983b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f984c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f985d;
    public final /* synthetic */ AbstractC0427a e;

    public f(SideSheetBehavior sideSheetBehavior) {
        this.f982a = 0;
        this.e = sideSheetBehavior;
        this.f985d = new A0.b(3, this);
    }

    public final void a(int i) {
        Runnable runnable = this.f985d;
        AbstractC0427a abstractC0427a = this.e;
        switch (this.f982a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0427a;
                WeakReference weakReference = sideSheetBehavior.f2464p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f983b = i;
                    if (!this.f984c) {
                        WeakHashMap weakHashMap = P.f711a;
                        ((View) sideSheetBehavior.f2464p.get()).postOnAnimation((A0.b) runnable);
                        this.f984c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0427a;
                WeakReference weakReference2 = bottomSheetBehavior.f2276U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f983b = i;
                    if (!this.f984c) {
                        WeakHashMap weakHashMap2 = P.f711a;
                        ((View) bottomSheetBehavior.f2276U.get()).postOnAnimation((C1.e) runnable);
                        this.f984c = true;
                        break;
                    }
                }
                break;
        }
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        this.f982a = 1;
        this.e = bottomSheetBehavior;
        this.f985d = new C1.e(14, this);
    }
}
