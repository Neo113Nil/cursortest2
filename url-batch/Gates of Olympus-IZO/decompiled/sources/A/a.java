package A;

import Z1.j;

/* loaded from: classes.dex */
public final class a extends j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f0f = new a(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f1g = new a(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i4) {
        super(i3);
        this.f2e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f2e) {
            case 0:
                return null;
            default:
                return d.f7b;
        }
    }
}
