package s;

import R1.y;
import e2.InterfaceC0424c;
import java.util.List;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942k extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0942k f8265f = new C0942k(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0942k f8266g = new C0942k(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0942k(int i3, int i4) {
        super(i3);
        this.f8267e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8267e) {
            case 0:
                return y.f4171a;
            default:
                List list = (List) obj;
                return new C0951t(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
