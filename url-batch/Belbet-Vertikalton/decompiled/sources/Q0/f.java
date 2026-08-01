package Q0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends r {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(q qVar, int i) {
        super(qVar);
        this.e = i;
    }

    @Override // Q0.r
    public void r() {
        switch (this.e) {
            case 0:
                q qVar = this.f1063b;
                qVar.f1054o = null;
                CheckableImageButton checkableImageButton = qVar.f1048g;
                checkableImageButton.setOnLongClickListener(null);
                H1.l.Z(checkableImageButton, null);
                break;
        }
    }
}
