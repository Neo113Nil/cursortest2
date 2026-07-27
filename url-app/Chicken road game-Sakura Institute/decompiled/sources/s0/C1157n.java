package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: s0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157n extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1157n f10267e = new C1157n(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1157n f10268i = new C1157n(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1157n f10269j = new C1157n(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1157n f10270k = new C1157n(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C1157n f10271l = new C1157n(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C1157n f10272m = new C1157n(1, 5);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1157n(int i2, int i4) {
        super(i2);
        this.f10273d = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r3.f11576d.containsKey(y0.q.f11635x) != false) goto L19;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z4;
        switch (this.f10273d) {
            case 0:
                return Unit.f7487a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                y0.i o4 = ((r0.E) obj).o();
                if (o4 != null) {
                    z4 = true;
                    if (o4.f11577e) {
                        break;
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 4:
                return Boolean.valueOf(AbstractC1125K.c(obj));
            default:
                if (obj == null) {
                    return Unit.f7487a;
                }
                throw new ClassCastException();
        }
    }
}
