package s2;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i) {
        super(pVar);
        this.f3249e = i;
    }

    @Override // s2.q
    public void q() {
        switch (this.f3249e) {
            case 0:
                p pVar = this.f3293b;
                pVar.f3285t = null;
                CheckableImageButton checkableImageButton = pVar.f3277l;
                checkableImageButton.setOnLongClickListener(null);
                r1.b.A(checkableImageButton, null);
                break;
        }
    }
}
