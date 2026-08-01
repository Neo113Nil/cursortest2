package U0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.f1145e = i;
    }

    @Override // U0.q
    public void r() {
        switch (this.f1145e) {
            case 0:
                p pVar = this.f1190b;
                pVar.f1181o = null;
                CheckableImageButton checkableImageButton = pVar.f1175g;
                checkableImageButton.setOnLongClickListener(null);
                H1.d.l0(checkableImageButton, null);
                break;
        }
    }
}
