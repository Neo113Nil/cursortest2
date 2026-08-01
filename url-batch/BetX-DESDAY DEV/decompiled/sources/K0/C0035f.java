package K0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: K0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0035f(q qVar, int i) {
        super(qVar);
        this.f546e = i;
    }

    @Override // K0.r
    public void r() {
        switch (this.f546e) {
            case 0:
                q qVar = this.f594b;
                qVar.f585o = null;
                CheckableImageButton checkableImageButton = qVar.f579g;
                checkableImageButton.setOnLongClickListener(null);
                q1.l.p0(checkableImageButton, null);
                break;
        }
    }
}
