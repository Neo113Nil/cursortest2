package J0;

import C0.p;
import K.S;
import L0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0334a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406a;

    /* renamed from: b, reason: collision with root package name */
    public int f407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f408c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0334a f409e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f406a = 0;
        this.f409e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0334a abstractC0334a = this.f409e;
        switch (this.f406a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0334a;
                WeakReference weakReference = sideSheetBehavior.f1845p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f407b = i;
                    if (!this.f408c) {
                        WeakHashMap weakHashMap = S.f422a;
                        ((View) sideSheetBehavior.f1845p.get()).postOnAnimation((p) runnable);
                        this.f408c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0334a;
                WeakReference weakReference2 = bottomSheetBehavior.f1659U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f407b = i;
                    if (!this.f408c) {
                        WeakHashMap weakHashMap2 = S.f422a;
                        ((View) bottomSheetBehavior.f1659U.get()).postOnAnimation((B) runnable);
                        this.f408c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f406a = 1;
        this.f409e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
