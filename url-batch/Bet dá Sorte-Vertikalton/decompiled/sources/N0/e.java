package N0;

import G0.o;
import K.S;
import P0.A;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0319a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f569a;

    /* renamed from: b, reason: collision with root package name */
    public int f570b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f571c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0319a f572e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f569a = 0;
        this.f572e = sideSheetBehavior;
        this.d = new o(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0319a abstractC0319a = this.f572e;
        switch (this.f569a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0319a;
                WeakReference weakReference = sideSheetBehavior.f1874p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f570b = i;
                    if (!this.f571c) {
                        WeakHashMap weakHashMap = S.f351a;
                        ((View) sideSheetBehavior.f1874p.get()).postOnAnimation((o) runnable);
                        this.f571c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0319a;
                WeakReference weakReference2 = bottomSheetBehavior.f1688U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f570b = i;
                    if (!this.f571c) {
                        WeakHashMap weakHashMap2 = S.f351a;
                        ((View) bottomSheetBehavior.f1688U.get()).postOnAnimation((A) runnable);
                        this.f571c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f569a = 1;
        this.f572e = bottomSheetBehavior;
        this.d = new A(13, this);
    }
}
