package M;

import java.io.Serializable;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class G extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f1579a;

    /* renamed from: b, reason: collision with root package name */
    public int f1580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f1581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f1583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(kotlin.jvm.internal.s sVar, P p5, kotlin.jvm.internal.r rVar, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.f1581c = sVar;
        this.f1582d = p5;
        this.f1583e = rVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new G(this.f1581c, this.f1582d, this.f1583e, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        return ((G) create((InterfaceC1218d) obj)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.s sVar;
        kotlin.jvm.internal.r rVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1580b;
        kotlin.jvm.internal.r rVar2 = this.f1583e;
        kotlin.jvm.internal.s sVar2 = this.f1581c;
        P p5 = this.f1582d;
        try {
        } catch (C0074c unused) {
            Object obj2 = sVar2.f10741a;
            this.f1579a = rVar2;
            this.f1580b = 3;
            obj = p5.j(obj2, true, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        }
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1579a = sVar2;
            this.f1580b = 1;
            obj = p5.i(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
            sVar = sVar2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    rVar = (kotlin.jvm.internal.r) this.f1579a;
                    e5.g.y(obj);
                    rVar.f10740a = ((Number) obj).intValue();
                    return f4.v.f5689a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (kotlin.jvm.internal.r) this.f1579a;
                e5.g.y(obj);
                rVar2.f10740a = ((Number) obj).intValue();
                return f4.v.f5689a;
            }
            sVar = (kotlin.jvm.internal.s) this.f1579a;
            e5.g.y(obj);
        }
        sVar.f10741a = obj;
        j0 g6 = p5.g();
        this.f1579a = rVar2;
        this.f1580b = 2;
        obj = g6.a();
        if (obj == enumC1260a) {
            return enumC1260a;
        }
        rVar = rVar2;
        rVar.f10740a = ((Number) obj).intValue();
        return f4.v.f5689a;
    }
}
