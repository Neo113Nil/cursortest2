package m0;

import T.Q;
import T.S;
import T.T;

/* loaded from: classes.dex */
public final class s extends q0.r {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(T t4, int i4) {
        super(t4);
        this.f14453c = i4;
    }

    @Override // q0.r, T.T
    public final Q f(int i4, Q q4, boolean z) {
        switch (this.f14453c) {
            case 0:
                super.f(i4, q4, z);
                q4.f2686f = true;
                break;
            default:
                super.f(i4, q4, z);
                q4.f2686f = true;
                break;
        }
        return q4;
    }

    @Override // q0.r, T.T
    public final S m(int i4, S s4, long j4) {
        switch (this.f14453c) {
            case 0:
                super.m(i4, s4, j4);
                s4.f2700k = true;
                break;
            default:
                super.m(i4, s4, j4);
                s4.f2700k = true;
                break;
        }
        return s4;
    }
}
