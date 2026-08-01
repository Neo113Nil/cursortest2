package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class of extends qk {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(pk pkVar, int i) {
        super(pkVar);
        this.e = i;
    }

    @Override // defpackage.qk
    public void q() {
        switch (this.e) {
            case 0:
                pk pkVar = this.b;
                pkVar.t = null;
                CheckableImageButton checkableImageButton = pkVar.l;
                checkableImageButton.setOnLongClickListener(null);
                kr.c0(checkableImageButton, null);
                break;
        }
    }
}
