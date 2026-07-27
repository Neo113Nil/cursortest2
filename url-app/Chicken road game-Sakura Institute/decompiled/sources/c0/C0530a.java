package c0;

import Z.C0323u;
import b0.C0499g;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530a extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0530a f5722e = new C0530a(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0530a f5723i = new C0530a(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0530a(int i2, int i4) {
        super(i2);
        this.f5724d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5724d) {
            case 0:
                break;
            default:
                r1.B(C0323u.f4546f, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(((InterfaceC0496d) obj).h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
                break;
        }
        return Unit.f7487a;
    }
}
