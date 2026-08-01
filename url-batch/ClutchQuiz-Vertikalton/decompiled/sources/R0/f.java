package R0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.f665e = i;
    }

    @Override // R0.q
    public void r() {
        switch (this.f665e) {
            case 0:
                p pVar = this.f710b;
                pVar.f701o = null;
                CheckableImageButton checkableImageButton = pVar.f695g;
                checkableImageButton.setOnLongClickListener(null);
                A.c.C0(checkableImageButton, null);
                break;
        }
    }
}
