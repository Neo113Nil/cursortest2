package p2;

import a.j;
import android.view.View;
import androidx.fragment.app.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3085a;

    /* renamed from: b, reason: collision with root package name */
    public int f3086b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3087c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.c f3088e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f3085a = 0;
        this.f3088e = sideSheetBehavior;
        this.d = new j(7, this);
    }

    public final void a(int i) {
        switch (this.f3085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3088e;
                WeakReference weakReference = sideSheetBehavior.f1189p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f3086b = i;
                    if (!this.f3087c) {
                        ((View) sideSheetBehavior.f1189p.get()).postOnAnimation((j) this.d);
                        this.f3087c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3088e;
                WeakReference weakReference2 = bottomSheetBehavior.Y;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f3086b = i;
                    if (!this.f3087c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((g) this.d);
                        this.f3087c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f3085a = 1;
        this.f3088e = bottomSheetBehavior;
        this.d = new g(11, this);
    }
}
