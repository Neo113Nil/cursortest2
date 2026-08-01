package N0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: N0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033f(q qVar, int i) {
        super(qVar);
        this.f651e = i;
    }

    @Override // N0.r
    public void r() {
        switch (this.f651e) {
            case 0:
                q qVar = this.f699b;
                qVar.f690o = null;
                CheckableImageButton checkableImageButton = qVar.f683g;
                checkableImageButton.setOnLongClickListener(null);
                A1.d.h0(checkableImageButton, null);
                break;
        }
    }
}
