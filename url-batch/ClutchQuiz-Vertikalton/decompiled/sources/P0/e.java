package P0;

import K.S;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0378b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f604a;

    /* renamed from: b, reason: collision with root package name */
    public int f605b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f606c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0378b f607e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f604a = 0;
        this.f607e = sideSheetBehavior;
        this.d = new B0.b(2, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0378b abstractC0378b = this.f607e;
        switch (this.f604a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0378b;
                WeakReference weakReference = sideSheetBehavior.f1953p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f605b = i;
                    if (!this.f606c) {
                        WeakHashMap weakHashMap = S.f365a;
                        ((View) sideSheetBehavior.f1953p.get()).postOnAnimation((B0.b) runnable);
                        this.f606c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0378b;
                WeakReference weakReference2 = bottomSheetBehavior.f1766U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f605b = i;
                    if (!this.f606c) {
                        WeakHashMap weakHashMap2 = S.f365a;
                        ((View) bottomSheetBehavior.f1766U.get()).postOnAnimation((Q.b) runnable);
                        this.f606c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f604a = 1;
        this.f607e = bottomSheetBehavior;
        this.d = new Q.b(13, this);
    }
}
