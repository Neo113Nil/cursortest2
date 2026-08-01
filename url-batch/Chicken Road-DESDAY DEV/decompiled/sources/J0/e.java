package J0;

import C0.p;
import K.S;
import L0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0332a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public int f354b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0332a f356e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f353a = 0;
        this.f356e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0332a abstractC0332a = this.f356e;
        switch (this.f353a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0332a;
                WeakReference weakReference = sideSheetBehavior.f1808p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f354b = i;
                    if (!this.f355c) {
                        WeakHashMap weakHashMap = S.f369a;
                        ((View) sideSheetBehavior.f1808p.get()).postOnAnimation((p) runnable);
                        this.f355c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0332a;
                WeakReference weakReference2 = bottomSheetBehavior.f1622U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f354b = i;
                    if (!this.f355c) {
                        WeakHashMap weakHashMap2 = S.f369a;
                        ((View) bottomSheetBehavior.f1622U.get()).postOnAnimation((B) runnable);
                        this.f355c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f353a = 1;
        this.f356e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
