package defpackage;

import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fyp extends dja {
    final /* synthetic */ fyq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyp(fyq fyqVar) {
        super(null);
        this.a = fyqVar;
    }

    @Override // defpackage.dja
    public final void i() {
        OpenSearchBar openSearchBar;
        fyq fyqVar = this.a;
        bd bdVar = fyqVar.a;
        if (bdVar.L().c.a(aek.d)) {
            bd bdVar2 = bdVar.F;
            if (bdVar2 == null) {
                if (bdVar.x() == null) {
                    throw new IllegalStateException(a.ab(bdVar, "Fragment ", " is not attached to any Fragment or host"));
                }
                throw new IllegalStateException("Fragment " + bdVar + " is not a child Fragment, it is directly attached to " + bdVar.x());
            }
            View view = bdVar2.R;
            if (view == null) {
                openSearchBar = null;
            } else {
                openSearchBar = (OpenSearchBar) view.findViewById(fyqVar.c);
                openSearchBar.getClass();
            }
            fyqVar.a(openSearchBar);
        }
    }
}
