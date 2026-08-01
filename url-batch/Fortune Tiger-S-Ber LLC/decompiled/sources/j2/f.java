package j2;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(r rVar, int i4) {
        super(rVar);
        this.f2311e = i4;
    }

    @Override // j2.s
    public void q() {
        switch (this.f2311e) {
            case 0:
                r rVar = this.f2356b;
                rVar.f2348t = null;
                CheckableImageButton checkableImageButton = rVar.f2340l;
                checkableImageButton.setOnLongClickListener(null);
                k3.d.e0(checkableImageButton, null);
                break;
        }
    }
}
