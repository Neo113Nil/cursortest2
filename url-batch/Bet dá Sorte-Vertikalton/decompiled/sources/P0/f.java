package P0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.f603e = i;
    }

    @Override // P0.q
    public void r() {
        switch (this.f603e) {
            case 0:
                p pVar = this.f648b;
                pVar.f639o = null;
                CheckableImageButton checkableImageButton = pVar.f633g;
                checkableImageButton.setOnLongClickListener(null);
                u1.d.b0(checkableImageButton, null);
                break;
        }
    }
}
