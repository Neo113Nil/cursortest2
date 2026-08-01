package L0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: L0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030f(q qVar, int i) {
        super(qVar);
        this.f503e = i;
    }

    @Override // L0.r
    public void r() {
        switch (this.f503e) {
            case 0:
                q qVar = this.f549b;
                qVar.f540o = null;
                CheckableImageButton checkableImageButton = qVar.f534g;
                checkableImageButton.setOnLongClickListener(null);
                s1.d.g0(checkableImageButton, null);
                break;
        }
    }
}
