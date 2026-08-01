package I0;

import B0.q;
import K.X;
import K0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0361a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* renamed from: b, reason: collision with root package name */
    public int f376b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f377c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0361a f379e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f375a = 0;
        this.f379e = sideSheetBehavior;
        this.f378d = new q(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.f378d;
        AbstractC0361a abstractC0361a = this.f379e;
        switch (this.f375a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0361a;
                WeakReference weakReference = sideSheetBehavior.f1967p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f376b = i;
                    if (!this.f377c) {
                        WeakHashMap weakHashMap = X.f418a;
                        ((View) sideSheetBehavior.f1967p.get()).postOnAnimation((q) runnable);
                        this.f377c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0361a;
                WeakReference weakReference2 = bottomSheetBehavior.f1773U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f376b = i;
                    if (!this.f377c) {
                        WeakHashMap weakHashMap2 = X.f418a;
                        ((View) bottomSheetBehavior.f1773U.get()).postOnAnimation((B) runnable);
                        this.f377c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f375a = 1;
        this.f379e = bottomSheetBehavior;
        this.f378d = new B(14, this);
    }
}
