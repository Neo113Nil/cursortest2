package I0;

import B0.q;
import K.X;
import K0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0363a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f374a;

    /* renamed from: b, reason: collision with root package name */
    public int f375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f376c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0363a f378e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f374a = 0;
        this.f378e = sideSheetBehavior;
        this.f377d = new q(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.f377d;
        AbstractC0363a abstractC0363a = this.f378e;
        switch (this.f374a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0363a;
                WeakReference weakReference = sideSheetBehavior.f1945p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f375b = i;
                    if (!this.f376c) {
                        WeakHashMap weakHashMap = X.f419a;
                        ((View) sideSheetBehavior.f1945p.get()).postOnAnimation((q) runnable);
                        this.f376c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0363a;
                WeakReference weakReference2 = bottomSheetBehavior.f1751U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f375b = i;
                    if (!this.f376c) {
                        WeakHashMap weakHashMap2 = X.f419a;
                        ((View) bottomSheetBehavior.f1751U.get()).postOnAnimation((B) runnable);
                        this.f376c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f374a = 1;
        this.f378e = bottomSheetBehavior;
        this.f377d = new B(14, this);
    }
}
