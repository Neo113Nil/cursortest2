package K0;

import D0.p;
import K.T;
import M0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0313a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f527a;

    /* renamed from: b, reason: collision with root package name */
    public int f528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f529c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0313a f530e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f527a = 0;
        this.f530e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0313a abstractC0313a = this.f530e;
        switch (this.f527a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0313a;
                WeakReference weakReference = sideSheetBehavior.f1869p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f528b = i;
                    if (!this.f529c) {
                        WeakHashMap weakHashMap = T.f423a;
                        ((View) sideSheetBehavior.f1869p.get()).postOnAnimation((p) runnable);
                        this.f529c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0313a;
                WeakReference weakReference2 = bottomSheetBehavior.f1684U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f528b = i;
                    if (!this.f529c) {
                        WeakHashMap weakHashMap2 = T.f423a;
                        ((View) bottomSheetBehavior.f1684U.get()).postOnAnimation((B) runnable);
                        this.f529c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f527a = 1;
        this.f530e = bottomSheetBehavior;
        this.d = new B(12, this);
    }
}
