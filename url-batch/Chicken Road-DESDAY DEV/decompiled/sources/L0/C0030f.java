package L0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: L0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030f(q qVar, int i) {
        super(qVar);
        this.f514e = i;
    }

    @Override // L0.r
    public void r() {
        switch (this.f514e) {
            case 0:
                q qVar = this.f561b;
                qVar.f552o = null;
                CheckableImageButton checkableImageButton = qVar.f546g;
                checkableImageButton.setOnLongClickListener(null);
                u1.d.n0(checkableImageButton, null);
                break;
        }
    }
}
