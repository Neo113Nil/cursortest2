package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgd {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new evp(this, 11, null);

    public fgd(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        WeakReference weakReference = bottomSheetBehavior.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) bottomSheetBehavior.B.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
