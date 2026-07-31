package g2;

import e.C0333e;

/* loaded from: classes.dex */
public final class k extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final k f4851f = new k(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i3, int i4) {
        super(i3);
        this.f4852e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f4852e) {
            case 0:
                return Boolean.valueOf(obj == null);
            default:
                Z1.i.f(obj, "it");
                return C0333e.f4464e.b();
        }
    }
}
