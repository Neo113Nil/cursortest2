package z5;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(o oVar, int i) {
        super(oVar);
        this.f9194e = i;
    }

    @Override // z5.p
    public void q() {
        switch (this.f9194e) {
            case 0:
                o oVar = this.f9239b;
                oVar.f9230r = null;
                CheckableImageButton checkableImageButton = oVar.f9222j;
                checkableImageButton.setOnLongClickListener(null);
                r2.r.W(checkableImageButton, null);
                break;
        }
    }
}
