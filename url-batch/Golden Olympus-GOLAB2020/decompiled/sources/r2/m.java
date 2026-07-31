package r2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f43561a = b.f43564i;

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f43562b = a.f43563i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f43563i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    }

    public static final InterfaceC3396f a(InterfaceC3396f interfaceC3396f) {
        return interfaceC3396f instanceof G ? interfaceC3396f : c(interfaceC3396f, f43561a, f43562b);
    }

    public static final InterfaceC3396f b(InterfaceC3396f interfaceC3396f, Function1 function1) {
        return c(interfaceC3396f, function1, f43562b);
    }

    private static final InterfaceC3396f c(InterfaceC3396f interfaceC3396f, Function1 function1, Function2 function2) {
        if (interfaceC3396f instanceof C3395e) {
            C3395e c3395e = (C3395e) interfaceC3396f;
            if (c3395e.f43546c == function1 && c3395e.f43547d == function2) {
                return interfaceC3396f;
            }
        }
        return new C3395e(interfaceC3396f, function1, function2);
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f43564i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
