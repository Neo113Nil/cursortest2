package p0;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: p0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989y extends r0.C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0941B f9080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f9081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989y(C0941B c0941b, Function2 function2, String str) {
        super(str);
        this.f9080b = c0941b;
        this.f9081c = function2;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        C0941B c0941b = this.f9080b;
        M0.k layoutDirection = interfaceC0947H.getLayoutDirection();
        C0987w c0987w = c0941b.f8985n;
        c0987w.f9071d = layoutDirection;
        c0987w.f9072e = interfaceC0947H.e();
        c0987w.f9073i = interfaceC0947H.q();
        boolean A4 = interfaceC0947H.A();
        Function2 function2 = this.f9081c;
        if (A4 || c0941b.f8978d.f9596i == null) {
            c0941b.f8981j = 0;
            InterfaceC0946G interfaceC0946G = (InterfaceC0946G) function2.h(c0987w, new M0.a(j4));
            return new C0988x(interfaceC0946G, c0941b, c0941b.f8981j, interfaceC0946G, 1);
        }
        c0941b.f8982k = 0;
        InterfaceC0946G interfaceC0946G2 = (InterfaceC0946G) function2.h(c0941b.f8986o, new M0.a(j4));
        return new C0988x(interfaceC0946G2, c0941b, c0941b.f8982k, interfaceC0946G2, 0);
    }
}
