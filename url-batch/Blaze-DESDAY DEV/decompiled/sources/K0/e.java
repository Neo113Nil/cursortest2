package K0;

import D0.p;
import K.T;
import M0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0315a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a;

    /* renamed from: b, reason: collision with root package name */
    public int f545b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f546c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0315a f547e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f544a = 0;
        this.f547e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0315a abstractC0315a = this.f547e;
        switch (this.f544a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0315a;
                WeakReference weakReference = sideSheetBehavior.f1901p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f545b = i;
                    if (!this.f546c) {
                        WeakHashMap weakHashMap = T.f440a;
                        ((View) sideSheetBehavior.f1901p.get()).postOnAnimation((p) runnable);
                        this.f546c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0315a;
                WeakReference weakReference2 = bottomSheetBehavior.f1715U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f545b = i;
                    if (!this.f546c) {
                        WeakHashMap weakHashMap2 = T.f440a;
                        ((View) bottomSheetBehavior.f1715U.get()).postOnAnimation((B) runnable);
                        this.f546c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f544a = 1;
        this.f547e = bottomSheetBehavior;
        this.d = new B(12, this);
    }
}
