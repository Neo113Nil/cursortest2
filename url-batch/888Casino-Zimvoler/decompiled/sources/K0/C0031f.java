package K0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: K0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0031f(q qVar, int i) {
        super(qVar);
        this.f495e = i;
    }

    @Override // K0.r
    public void r() {
        switch (this.f495e) {
            case 0:
                q qVar = this.f541b;
                qVar.f532o = null;
                CheckableImageButton checkableImageButton = qVar.f526g;
                checkableImageButton.setOnLongClickListener(null);
                q1.d.n0(checkableImageButton, null);
                break;
        }
    }
}
