package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffz implements aas {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public ffz(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.aas
    public final boolean a(View view) {
        this.b.R(this.a);
        return true;
    }
}
