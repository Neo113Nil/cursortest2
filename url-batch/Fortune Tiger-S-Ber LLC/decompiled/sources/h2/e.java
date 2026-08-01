package h2;

import a2.r;
import android.view.View;
import androidx.fragment.app.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2013a;

    /* renamed from: b, reason: collision with root package name */
    public int f2014b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.a f2016e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f2013a = 0;
        this.f2016e = sideSheetBehavior;
        this.f2015d = new r(5, this);
    }

    public final void a(int i4) {
        switch (this.f2013a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2016e;
                WeakReference weakReference = sideSheetBehavior.f1382p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2014b = i4;
                    if (!this.c) {
                        ((View) sideSheetBehavior.f1382p.get()).postOnAnimation((r) this.f2015d);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2016e;
                WeakReference weakReference2 = bottomSheetBehavior.Y;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2014b = i4;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((g) this.f2015d);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f2013a = 1;
        this.f2016e = bottomSheetBehavior;
        this.f2015d = new g(12, this);
    }
}
