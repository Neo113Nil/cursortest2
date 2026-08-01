package J0;

import C0.p;
import K.S;
import L0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0328a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public int f347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f348c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0328a f349e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f346a = 0;
        this.f349e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0328a abstractC0328a = this.f349e;
        switch (this.f346a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0328a;
                WeakReference weakReference = sideSheetBehavior.f1777p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f347b = i;
                    if (!this.f348c) {
                        WeakHashMap weakHashMap = S.f362a;
                        ((View) sideSheetBehavior.f1777p.get()).postOnAnimation((p) runnable);
                        this.f348c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0328a;
                WeakReference weakReference2 = bottomSheetBehavior.f1592U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f347b = i;
                    if (!this.f348c) {
                        WeakHashMap weakHashMap2 = S.f362a;
                        ((View) bottomSheetBehavior.f1592U.get()).postOnAnimation((B) runnable);
                        this.f348c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f346a = 1;
        this.f349e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
