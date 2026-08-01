package M0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033f(q qVar, int i) {
        super(qVar);
        this.f578e = i;
    }

    @Override // M0.r
    public void r() {
        switch (this.f578e) {
            case 0:
                q qVar = this.f624b;
                qVar.f615o = null;
                CheckableImageButton checkableImageButton = qVar.f609g;
                checkableImageButton.setOnLongClickListener(null);
                w1.l.W(checkableImageButton, null);
                break;
        }
    }
}
