package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mh extends en {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh(dn dnVar, int i) {
        super(dnVar);
        this.e = i;
    }

    @Override // defpackage.en
    public void q() {
        switch (this.e) {
            case 0:
                dn dnVar = this.b;
                dnVar.t = null;
                CheckableImageButton checkableImageButton = dnVar.l;
                checkableImageButton.setOnLongClickListener(null);
                gk0.O(checkableImageButton, null);
                break;
        }
    }
}
