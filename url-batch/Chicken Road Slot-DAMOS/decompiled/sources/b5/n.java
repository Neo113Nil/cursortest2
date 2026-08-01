package b5;

import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1159d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1160e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1161i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1163s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(o oVar, z4.d0 d0Var, Function2 function2, ld.a aVar) {
        super(1, aVar);
        this.f1161i = oVar;
        this.f1162r = d0Var;
        this.f1163s = (nd.i) function2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        switch (this.f1159d) {
            case 0:
                return new n((o) this.f1161i, (z4.d0) this.f1162r, (Function2) this.f1163s, aVar);
            default:
                return new n((wd.b0) this.f1161i, (NotificationOpenedActivityHMS) this.f1162r, (Intent) this.f1163s, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.f1159d) {
        }
        return ((n) create(aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1159d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f1160e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                o oVar = (o) this.f1161i;
                z4.d0 d0Var = (z4.d0) this.f1162r;
                ?? r32 = (nd.i) this.f1163s;
                this.f1160e = 1;
                Object e2 = oVar.e(d0Var, r32, this);
                return e2 == aVar ? aVar : e2;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f1160e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    hc.b bVar = (hc.b) ((wd.b0) this.f1161i).f10141d;
                    NotificationOpenedActivityHMS notificationOpenedActivityHMS = (NotificationOpenedActivityHMS) this.f1162r;
                    Intent intent = (Intent) this.f1163s;
                    this.f1160e = 1;
                    if (bVar.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wd.b0 b0Var, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, ld.a aVar) {
        super(1, aVar);
        this.f1161i = b0Var;
        this.f1162r = notificationOpenedActivityHMS;
        this.f1163s = intent;
    }
}
