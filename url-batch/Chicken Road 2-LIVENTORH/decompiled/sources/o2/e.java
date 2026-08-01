package o2;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i) {
        super(oVar);
        this.f2888e = i;
    }

    @Override // o2.p
    public void q() {
        switch (this.f2888e) {
            case 0:
                o oVar = this.f2932b;
                oVar.f2924t = null;
                CheckableImageButton checkableImageButton = oVar.f2916l;
                checkableImageButton.setOnLongClickListener(null);
                h.a.h0(checkableImageButton, null);
                break;
        }
    }
}
