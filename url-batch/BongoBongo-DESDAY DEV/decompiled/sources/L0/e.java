package L0;

import L.T;
import N0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import y.AbstractC0317a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;

    /* renamed from: b, reason: collision with root package name */
    public int f598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f599c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317a f600e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f597a = 0;
        this.f600e = sideSheetBehavior;
        this.d = new A.a(2, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0317a abstractC0317a = this.f600e;
        switch (this.f597a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0317a;
                WeakReference weakReference = sideSheetBehavior.f1970p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f598b = i;
                    if (!this.f599c) {
                        WeakHashMap weakHashMap = T.f490a;
                        ((View) sideSheetBehavior.f1970p.get()).postOnAnimation((A.a) runnable);
                        this.f599c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0317a;
                WeakReference weakReference2 = bottomSheetBehavior.f1779U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f598b = i;
                    if (!this.f599c) {
                        WeakHashMap weakHashMap2 = T.f490a;
                        ((View) bottomSheetBehavior.f1779U.get()).postOnAnimation((B) runnable);
                        this.f599c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f597a = 1;
        this.f600e = bottomSheetBehavior;
        this.d = new B(12, this);
    }
}
