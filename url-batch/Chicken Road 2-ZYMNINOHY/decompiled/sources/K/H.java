package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import o3.InterfaceC1339l;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class H extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public Object f1250a;

    /* renamed from: b, reason: collision with root package name */
    public int f1251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0430h f1253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h3.g f1254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(M m4, InterfaceC0430h interfaceC0430h, o3.p pVar, InterfaceC0425c interfaceC0425c) {
        super(1, interfaceC0425c);
        this.f1252c = m4;
        this.f1253d = interfaceC0430h;
        this.f1254e = (h3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new H(this.f1252c, this.f1253d, this.f1254e, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        return ((H) create((InterfaceC0425c) obj)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0054c c0054c;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1251b;
        M m4 = this.f1252c;
        if (i4 == 0) {
            O3.l.w(obj);
            this.f1251b = 1;
            obj = M.f(m4, true, this);
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f1250a;
                    O3.l.w(obj);
                    return obj2;
                }
                c0054c = (C0054c) this.f1250a;
                O3.l.w(obj);
                Object obj3 = c0054c.f1333b;
                if ((obj3 != null ? obj3.hashCode() : 0) != c0054c.f1334c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!kotlin.jvm.internal.i.a(c0054c.f1333b, obj)) {
                    this.f1250a = obj;
                    this.f1251b = 3;
                    if (m4.j(obj, true, this) == enumC0441a) {
                        return enumC0441a;
                    }
                }
                return obj;
            }
            O3.l.w(obj);
        }
        c0054c = (C0054c) obj;
        G g4 = new G(this.f1254e, c0054c, null);
        this.f1250a = c0054c;
        this.f1251b = 2;
        obj = AbstractC1562w.n(this.f1253d, g4, this);
    }
}
