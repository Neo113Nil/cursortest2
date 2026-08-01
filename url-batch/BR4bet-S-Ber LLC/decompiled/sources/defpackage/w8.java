package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w8 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ oe e;

    public w8(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new n1(12, this);
    }

    public final void a(int i) {
        int i2 = this.a;
        Runnable runnable = this.d;
        oe oeVar = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oeVar;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((j7) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oeVar;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((n1) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public w8(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new j7(1, this);
    }
}
