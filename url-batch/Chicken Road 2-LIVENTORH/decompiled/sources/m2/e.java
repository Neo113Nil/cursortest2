package m2;

import a.j;
import android.view.View;
import androidx.fragment.app.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2692a;

    /* renamed from: b, reason: collision with root package name */
    public int f2693b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2694c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.b f2695e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f2692a = 0;
        this.f2695e = sideSheetBehavior;
        this.d = new j(6, this);
    }

    public final void a(int i) {
        switch (this.f2692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2695e;
                WeakReference weakReference = sideSheetBehavior.f997p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2693b = i;
                    if (!this.f2694c) {
                        ((View) sideSheetBehavior.f997p.get()).postOnAnimation((j) this.d);
                        this.f2694c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2695e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2693b = i;
                    if (!this.f2694c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((g) this.d);
                        this.f2694c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f2692a = 1;
        this.f2695e = bottomSheetBehavior;
        this.d = new g(11, this);
    }
}
