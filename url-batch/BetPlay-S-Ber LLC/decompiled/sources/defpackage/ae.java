package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ae extends di {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(ci ciVar, int i) {
        super(ciVar);
        this.e = i;
    }

    @Override // defpackage.di
    public void q() {
        switch (this.e) {
            case 0:
                ci ciVar = this.b;
                ciVar.t = null;
                CheckableImageButton checkableImageButton = ciVar.l;
                checkableImageButton.setOnLongClickListener(null);
                j8.O(checkableImageButton, null);
                break;
        }
    }
}
