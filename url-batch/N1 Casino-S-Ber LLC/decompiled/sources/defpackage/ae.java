package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ae extends li {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(ki kiVar, int i) {
        super(kiVar);
        this.e = i;
    }

    @Override // defpackage.li
    public void q() {
        switch (this.e) {
            case 0:
                ki kiVar = this.b;
                kiVar.t = null;
                CheckableImageButton checkableImageButton = kiVar.l;
                checkableImageButton.setOnLongClickListener(null);
                jw.a0(checkableImageButton, null);
                break;
        }
    }
}
