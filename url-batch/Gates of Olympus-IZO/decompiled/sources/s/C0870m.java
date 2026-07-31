package s;

import java.util.List;

/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870m extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0870m f7415f = new C0870m(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0870m f7416g = new C0870m(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0870m(int i3, int i4) {
        super(i3);
        this.f7417e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f7417e) {
            case 0:
                return L1.z.f2729a;
            default:
                List list = (List) obj;
                return new C0880w(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
