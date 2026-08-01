package n9;

import b0.l0;
import ge.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f7193e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7194i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i3, ld.a aVar) {
        super(2, aVar);
        this.f7193e = cVar;
        this.f7194i = i3;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new b(this.f7193e, this.f7194i, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Object C;
        Object obj2 = md.a.f6622d;
        int i3 = this.f7192d;
        if (i3 == 0) {
            cf.c.M(obj);
            k9.a aVar = this.f7193e.f7195b;
            this.f7192d = 1;
            aVar.getClass();
            int i10 = this.f7194i;
            if (i10 <= 0) {
                C = Unit.f5554a;
            } else {
                String format = new SimpleDateFormat("dd.MM", Locale.getDefault()).format(new Date());
                h9.c cVar = aVar.f5501a;
                format.getClass();
                C = cf.c.C(cVar.f4493a, false, true, new l0(5, cVar, new h9.a(format, 0, i10)), this);
                if (C != obj2) {
                    C = Unit.f5554a;
                }
            }
            if (C == obj2) {
                return obj2;
            }
        } else {
            if (i3 != 1) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
        }
        return Unit.f5554a;
    }
}
