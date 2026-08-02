package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arj implements la {
    @Override // defpackage.la
    public final void a(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        if (kzVar.width != -1 || kzVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // defpackage.la
    public final void d(View view) {
    }
}
