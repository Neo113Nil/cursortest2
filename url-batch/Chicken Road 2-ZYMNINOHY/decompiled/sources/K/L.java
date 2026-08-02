package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class L extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.o f1266a;

    /* renamed from: b, reason: collision with root package name */
    public int f1267b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f1269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f1270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(kotlin.jvm.internal.o oVar, M m4, Object obj, boolean z, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1269d = oVar;
        this.f1270e = m4;
        this.f1271f = obj;
        this.f1272g = z;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        L l4 = new L(this.f1269d, this.f1270e, this.f1271f, this.f1272g, interfaceC0425c);
        l4.f1268c = obj;
        return l4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((W) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.b(r7, r2) == r0) goto L16;
     */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        W w4;
        kotlin.jvm.internal.o oVar;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1267b;
        Object obj2 = this.f1271f;
        M m4 = this.f1270e;
        kotlin.jvm.internal.o oVar2 = this.f1269d;
        if (i4 == 0) {
            O3.l.w(obj);
            W w5 = (W) this.f1268c;
            g0 g4 = m4.g();
            this.f1268c = w5;
            this.f1266a = oVar2;
            this.f1267b = 1;
            Integer num = new Integer(((AtomicInteger) g4.f1363b.f15398b).incrementAndGet());
            if (num != enumC0441a) {
                w4 = w5;
                obj = num;
                oVar = oVar2;
            }
            return enumC0441a;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
            if (this.f1272g) {
                m4.f1280h.o(new C0054c(obj2 != null ? obj2.hashCode() : 0, oVar2.f14158a, obj2));
            }
            return C0297i.f5732a;
        }
        oVar = this.f1266a;
        w4 = (W) this.f1268c;
        O3.l.w(obj);
        oVar.f14158a = ((Number) obj).intValue();
        this.f1268c = null;
        this.f1266a = null;
        this.f1267b = 2;
    }
}
