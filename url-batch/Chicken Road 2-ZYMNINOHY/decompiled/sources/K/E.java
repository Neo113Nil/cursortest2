package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.io.Serializable;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class E extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f1240a;

    /* renamed from: b, reason: collision with root package name */
    public int f1241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f1242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f1244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(kotlin.jvm.internal.p pVar, M m4, kotlin.jvm.internal.o oVar, InterfaceC0425c interfaceC0425c) {
        super(1, interfaceC0425c);
        this.f1242c = pVar;
        this.f1243d = m4;
        this.f1244e = oVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new E(this.f1242c, this.f1243d, this.f1244e, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        return ((E) create((InterfaceC0425c) obj)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.o oVar;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1241b;
        kotlin.jvm.internal.o oVar2 = this.f1244e;
        kotlin.jvm.internal.p pVar2 = this.f1242c;
        M m4 = this.f1243d;
        try {
        } catch (C0053b unused) {
            Object obj2 = pVar2.f14159a;
            this.f1240a = oVar2;
            this.f1241b = 3;
            obj = m4.j(obj2, true, this);
        }
        if (i4 == 0) {
            O3.l.w(obj);
            this.f1240a = pVar2;
            this.f1241b = 1;
            obj = m4.i(this);
            if (obj == enumC0441a) {
                return enumC0441a;
            }
            pVar = pVar2;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    oVar = (kotlin.jvm.internal.o) this.f1240a;
                    O3.l.w(obj);
                    oVar.f14158a = ((Number) obj).intValue();
                    return C0297i.f5732a;
                }
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar2 = (kotlin.jvm.internal.o) this.f1240a;
                O3.l.w(obj);
                oVar2.f14158a = ((Number) obj).intValue();
                return C0297i.f5732a;
            }
            pVar = (kotlin.jvm.internal.p) this.f1240a;
            O3.l.w(obj);
        }
        pVar.f14159a = obj;
        g0 g4 = m4.g();
        this.f1240a = oVar2;
        this.f1241b = 2;
        obj = g4.a();
        if (obj == enumC0441a) {
            return enumC0441a;
        }
        oVar = oVar2;
        oVar.f14158a = ((Number) obj).intValue();
        return C0297i.f5732a;
    }
}
