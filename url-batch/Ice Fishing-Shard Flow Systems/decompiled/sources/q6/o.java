package q6;

import com.onesignal.core.activities.PermissionsActivity;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o extends X5.j implements e6.n {

    /* renamed from: d, reason: collision with root package name */
    public int f7402d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ e f7403e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7404i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity.b.a f7405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PermissionsActivity.b.a aVar, V5.b bVar) {
        super(3, bVar);
        this.f7405l = aVar;
    }

    @Override // e6.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.f7405l, (V5.b) obj3);
        oVar.f7403e = (e) obj;
        oVar.f7404i = obj2;
        return oVar.invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f7402d;
        if (i2 == 0) {
            V6.b.P(obj);
            eVar = this.f7403e;
            Object obj2 = this.f7404i;
            this.f7403e = eVar;
            this.f7402d = 1;
            obj = this.f7405l.invoke(obj2, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return Unit.f6114a;
            }
            eVar = this.f7403e;
            V6.b.P(obj);
        }
        this.f7403e = null;
        this.f7402d = 2;
    }
}
