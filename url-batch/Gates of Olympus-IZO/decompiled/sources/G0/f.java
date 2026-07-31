package G0;

import L1.z;
import Z1.j;

/* loaded from: classes.dex */
public final class f extends j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final f f1536f = new f(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f1537g = new f(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i4) {
        super(i3);
        this.f1538e = i4;
    }

    @Override // Y1.c
    public final /* synthetic */ Object j(Object obj) {
        switch (this.f1538e) {
            case 0:
                return z.f2729a;
            default:
                throw null;
        }
    }
}
