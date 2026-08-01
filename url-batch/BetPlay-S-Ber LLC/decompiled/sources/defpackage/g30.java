package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g30 {
    public int a;
    public boolean b;
    public final q1 c = new q1(12, this);
    public final /* synthetic */ SideSheetBehavior d;

    public g30(SideSheetBehavior sideSheetBehavior) {
        this.d = sideSheetBehavior;
    }

    public final void a(int i) {
        SideSheetBehavior sideSheetBehavior = this.d;
        WeakReference weakReference = sideSheetBehavior.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) sideSheetBehavior.p.get()).postOnAnimation(this.c);
        this.b = true;
    }
}
