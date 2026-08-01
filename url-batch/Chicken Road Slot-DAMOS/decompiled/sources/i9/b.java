package i9;

import a4.j;
import androidx.lifecycle.o0;
import b5.d0;
import ge.a0;
import ge.x;
import je.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.o;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, ld.a aVar, int i3) {
        super(2, aVar);
        this.f4673d = i3;
        this.f4674e = obj;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f4673d) {
            case 0:
                return new b((c) this.f4674e, aVar, 0);
            case 1:
                return new b((n9.c) this.f4674e, aVar, 1);
            case 2:
                return new b((q9.a) this.f4674e, aVar, 2);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new b((s9.a) this.f4674e, aVar, 3);
            default:
                return new b((Function0) this.f4674e, aVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f4673d) {
        }
        return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i3 = this.f4673d;
        Object obj2 = this.f4674e;
        switch (i3) {
            case 0:
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                break;
            case 1:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                n9.c cVar = (n9.c) obj2;
                cVar.i();
                l0 l0Var = cVar.f7196c;
                do {
                    value = l0Var.getValue();
                } while (!l0Var.i(value, j9.a.a((j9.a) value, 0, false, false, 0.0f, 0.0f, 0, null, null, 2019)));
            case 2:
                md.a aVar3 = md.a.f6622d;
                cf.c.M(obj);
                ((v9.a) v9.c.f9999a.getValue()).login(o.g(((q9.a) obj2).f8059b.f4678b, "-", ""));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                md.a aVar4 = md.a.f6622d;
                cf.c.M(obj);
                s9.a aVar5 = (s9.a) obj2;
                a0.s(o0.g(aVar5), null, new d0(aVar5, null, 6), 3);
                break;
            default:
                md.a aVar6 = md.a.f6622d;
                cf.c.M(obj);
                ((Function0) obj2).invoke();
                break;
        }
        return Unit.f5554a;
    }
}
