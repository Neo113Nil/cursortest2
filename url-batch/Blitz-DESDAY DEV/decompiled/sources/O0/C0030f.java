package O0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: O0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030f(q qVar, int i) {
        super(qVar);
        this.f665e = i;
    }

    @Override // O0.r
    public void r() {
        switch (this.f665e) {
            case 0:
                q qVar = this.f711b;
                qVar.f702o = null;
                CheckableImageButton checkableImageButton = qVar.f696g;
                checkableImageButton.setOnLongClickListener(null);
                z1.d.a0(checkableImageButton, null);
                break;
        }
    }
}
