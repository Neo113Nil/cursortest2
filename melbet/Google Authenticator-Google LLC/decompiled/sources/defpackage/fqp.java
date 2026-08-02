package defpackage;

import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fqp implements fin {
    public final /* synthetic */ LinearLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqp(LinearLayout linearLayout, int i) {
        this.b = i;
        this.a = linearLayout;
    }

    @Override // defpackage.fin
    public final void a() {
        int i = this.b;
        if (i == 0) {
            fqs fqsVar = (fqs) this.a;
            fhq.s(fqsVar.d, fqsVar.d());
            return;
        }
        LinearLayout linearLayout = this.a;
        if (i == 1) {
            CheckableImageButton checkableImageButton = ((fqs) linearLayout).b;
            fhq.s(checkableImageButton, checkableImageButton.getContentDescription());
        } else {
            frb frbVar = (frb) linearLayout;
            fhq.s(frbVar.c, frbVar.b());
        }
    }
}
