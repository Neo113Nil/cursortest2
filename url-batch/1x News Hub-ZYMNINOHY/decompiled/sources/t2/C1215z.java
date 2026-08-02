package t2;

/* renamed from: t2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1215z extends AbstractC1191a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1215z(d2.h hVar, boolean z, int i3) {
        super(hVar, z);
        this.f10456d = i3;
    }

    @Override // t2.e0
    public boolean E(Throwable th) {
        switch (this.f10456d) {
            case 1:
                AbstractC1212w.e(this.f10396c, th);
                return true;
            default:
                return super.E(th);
        }
    }
}
