package C0;

import K.Q;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0392a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* renamed from: b, reason: collision with root package name */
    public int f105b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0392a f107e;

    public j(SideSheetBehavior sideSheetBehavior) {
        this.f104a = 1;
        this.f107e = sideSheetBehavior;
        this.d = new E0.b(2, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0392a abstractC0392a = this.f107e;
        switch (this.f104a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0392a;
                WeakReference weakReference = bottomSheetBehavior.f2164U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f105b = i;
                    if (!this.f106c) {
                        WeakHashMap weakHashMap = Q.f578a;
                        ((View) bottomSheetBehavior.f2164U.get()).postOnAnimation((i) runnable);
                        this.f106c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0392a;
                WeakReference weakReference2 = sideSheetBehavior.f2350p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f105b = i;
                    if (!this.f106c) {
                        WeakHashMap weakHashMap2 = Q.f578a;
                        ((View) sideSheetBehavior.f2350p.get()).postOnAnimation((E0.b) runnable);
                        this.f106c = true;
                        break;
                    }
                }
                break;
        }
    }

    public j(BottomSheetBehavior bottomSheetBehavior) {
        this.f104a = 0;
        this.f107e = bottomSheetBehavior;
        this.d = new i(0, this);
    }
}
