package w2;

import h2.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import o2.InterfaceC3343n;
import t2.G;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final n f46661a = a.f46667i;

    /* renamed from: b, reason: collision with root package name */
    private static final G f46662b = new G("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    private static final G f46663c = new G("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    private static final G f46664d = new G("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    private static final G f46665e = new G("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    private static final G f46666f = new G("PARAM_CLAUSE_0");

    static final class a extends s implements n {

        /* renamed from: i, reason: collision with root package name */
        public static final a f46667i = new a();

        a() {
            super(3);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i a(int i4) {
        if (i4 == 0) {
            return i.f46668b;
        }
        if (i4 == 1) {
            return i.f46669c;
        }
        if (i4 == 2) {
            return i.f46670d;
        }
        if (i4 == 3) {
            return i.f46671e;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i4).toString());
    }

    public static final G i() {
        return f46666f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(InterfaceC3343n interfaceC3343n, Function1 function1) {
        Object h4 = interfaceC3343n.h(Unit.f41027a, null, function1);
        if (h4 == null) {
            return false;
        }
        interfaceC3343n.u(h4);
        return true;
    }
}
