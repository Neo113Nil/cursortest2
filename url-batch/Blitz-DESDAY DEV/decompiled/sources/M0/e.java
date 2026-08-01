package M0;

import M.Q;
import O0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z.AbstractC0318a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f613a;

    /* renamed from: b, reason: collision with root package name */
    public int f614b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f615c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0318a f616e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f613a = 0;
        this.f616e = sideSheetBehavior;
        this.d = new B.a(2, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0318a abstractC0318a = this.f616e;
        switch (this.f613a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0318a;
                WeakReference weakReference = sideSheetBehavior.f1957p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f614b = i;
                    if (!this.f615c) {
                        WeakHashMap weakHashMap = Q.f513a;
                        ((View) sideSheetBehavior.f1957p.get()).postOnAnimation((B.a) runnable);
                        this.f615c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0318a;
                WeakReference weakReference2 = bottomSheetBehavior.f1763U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f614b = i;
                    if (!this.f615c) {
                        WeakHashMap weakHashMap2 = Q.f513a;
                        ((View) bottomSheetBehavior.f1763U.get()).postOnAnimation((B) runnable);
                        this.f615c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f613a = 1;
        this.f616e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
