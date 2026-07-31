package E2;

import D2.C0349b;
import W1.AbstractC1232b;
import W1.C1231a;
import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0370a f543a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f544b;

    /* renamed from: c, reason: collision with root package name */
    private int f545c;

    static final class a extends kotlin.coroutines.jvm.internal.k implements h2.n {

        /* renamed from: m, reason: collision with root package name */
        int f546m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f547n;

        a(kotlin.coroutines.d dVar) {
            super(3, dVar);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1232b abstractC1232b, Unit unit, kotlin.coroutines.d dVar) {
            a aVar = P.this.new a(dVar);
            aVar.f547n = abstractC1232b;
            return aVar.invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f546m;
            if (i4 == 0) {
                ResultKt.a(obj);
                AbstractC1232b abstractC1232b = (AbstractC1232b) this.f547n;
                byte F4 = P.this.f543a.F();
                if (F4 == 1) {
                    return P.this.j(true);
                }
                if (F4 == 0) {
                    return P.this.j(false);
                }
                if (F4 != 6) {
                    if (F4 == 8) {
                        return P.this.f();
                    }
                    AbstractC0370a.y(P.this.f543a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new W1.f();
                }
                P p4 = P.this;
                this.f546m = 1;
                obj = p4.i(abstractC1232b, this);
                if (obj == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return (D2.i) obj;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f549l;

        /* renamed from: m, reason: collision with root package name */
        Object f550m;

        /* renamed from: n, reason: collision with root package name */
        Object f551n;

        /* renamed from: o, reason: collision with root package name */
        Object f552o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f553p;

        /* renamed from: r, reason: collision with root package name */
        int f555r;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f553p = obj;
            this.f555r |= Integer.MIN_VALUE;
            return P.this.i(null, this);
        }
    }

    public P(D2.g configuration, AbstractC0370a lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f543a = lexer;
        this.f544b = configuration.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D2.i f() {
        int i4;
        byte m4 = this.f543a.m();
        if (this.f543a.F() == 4) {
            AbstractC0370a.y(this.f543a, "Unexpected leading comma", 0, null, 6, null);
            throw new W1.f();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f543a.f()) {
            arrayList.add(e());
            m4 = this.f543a.m();
            if (m4 != 4) {
                AbstractC0370a abstractC0370a = this.f543a;
                boolean z4 = m4 == 9;
                i4 = abstractC0370a.f583a;
                if (!z4) {
                    AbstractC0370a.y(abstractC0370a, "Expected end of the array or comma", i4, null, 4, null);
                    throw new W1.f();
                }
            }
        }
        if (m4 == 8) {
            this.f543a.n((byte) 9);
        } else if (m4 == 4) {
            AbstractC0370a.y(this.f543a, "Unexpected trailing comma", 0, null, 6, null);
            throw new W1.f();
        }
        return new C0349b(arrayList);
    }

    private final D2.i g() {
        return (D2.i) kotlin.a.b(new C1231a(new a(null)), Unit.f41027a);
    }

    private final D2.i h() {
        byte n4 = this.f543a.n((byte) 6);
        if (this.f543a.F() == 4) {
            AbstractC0370a.y(this.f543a, "Unexpected leading comma", 0, null, 6, null);
            throw new W1.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f543a.f()) {
                break;
            }
            String s4 = this.f544b ? this.f543a.s() : this.f543a.q();
            this.f543a.n((byte) 5);
            linkedHashMap.put(s4, e());
            n4 = this.f543a.m();
            if (n4 != 4) {
                if (n4 != 7) {
                    AbstractC0370a.y(this.f543a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new W1.f();
                }
            }
        }
        if (n4 == 6) {
            this.f543a.n((byte) 7);
        } else if (n4 == 4) {
            AbstractC0370a.y(this.f543a, "Unexpected trailing comma", 0, null, 6, null);
            throw new W1.f();
        }
        return new D2.w(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0096 -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC1232b abstractC1232b, kotlin.coroutines.d dVar) {
        b bVar;
        int i4;
        P p4;
        LinkedHashMap linkedHashMap;
        b bVar2;
        byte b4;
        AbstractC1232b abstractC1232b2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f555r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f555r = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f553p;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f555r;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    byte n4 = this.f543a.n((byte) 6);
                    if (this.f543a.F() == 4) {
                        AbstractC0370a.y(this.f543a, "Unexpected leading comma", 0, null, 6, null);
                        throw new W1.f();
                    }
                    p4 = this;
                    linkedHashMap = new LinkedHashMap();
                    bVar2 = bVar;
                    b4 = n4;
                    abstractC1232b2 = abstractC1232b;
                    if (p4.f543a.f()) {
                    }
                    if (b4 == 6) {
                    }
                    return new D2.w(linkedHashMap);
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) bVar.f552o;
                linkedHashMap = (LinkedHashMap) bVar.f551n;
                p4 = (P) bVar.f550m;
                AbstractC1232b abstractC1232b3 = (AbstractC1232b) bVar.f549l;
                ResultKt.a(obj);
                linkedHashMap.put(str, (D2.i) obj);
                byte m4 = p4.f543a.m();
                if (m4 == 4) {
                    if (m4 != 7) {
                        AbstractC0370a.y(p4.f543a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new W1.f();
                    }
                    b4 = m4;
                    if (b4 == 6) {
                        p4.f543a.n((byte) 7);
                    } else if (b4 == 4) {
                        AbstractC0370a.y(p4.f543a, "Unexpected trailing comma", 0, null, 6, null);
                        throw new W1.f();
                    }
                    return new D2.w(linkedHashMap);
                }
                bVar2 = bVar;
                b4 = m4;
                abstractC1232b2 = abstractC1232b3;
                if (p4.f543a.f()) {
                    String s4 = p4.f544b ? p4.f543a.s() : p4.f543a.q();
                    p4.f543a.n((byte) 5);
                    Unit unit = Unit.f41027a;
                    bVar2.f549l = abstractC1232b2;
                    bVar2.f550m = p4;
                    bVar2.f551n = linkedHashMap;
                    bVar2.f552o = s4;
                    bVar2.f555r = 1;
                    Object a4 = abstractC1232b2.a(unit, bVar2);
                    if (a4 == f4) {
                        return f4;
                    }
                    abstractC1232b3 = abstractC1232b2;
                    obj = a4;
                    b bVar3 = bVar2;
                    str = s4;
                    bVar = bVar3;
                    linkedHashMap.put(str, (D2.i) obj);
                    byte m42 = p4.f543a.m();
                    if (m42 == 4) {
                    }
                }
                if (b4 == 6) {
                }
                return new D2.w(linkedHashMap);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f553p;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f555r;
        if (i4 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D2.z j(boolean z4) {
        String s4 = (this.f544b || !z4) ? this.f543a.s() : this.f543a.q();
        return (z4 || !Intrinsics.areEqual(s4, "null")) ? new D2.q(s4, z4, null, 4, null) : D2.u.INSTANCE;
    }

    public final D2.i e() {
        byte F4 = this.f543a.F();
        if (F4 == 1) {
            return j(true);
        }
        if (F4 == 0) {
            return j(false);
        }
        if (F4 == 6) {
            int i4 = this.f545c + 1;
            this.f545c = i4;
            this.f545c--;
            return i4 == 200 ? g() : h();
        }
        if (F4 == 8) {
            return f();
        }
        AbstractC0370a.y(this.f543a, "Cannot begin reading element, unexpected token: " + ((int) F4), 0, null, 6, null);
        throw new W1.f();
    }
}
