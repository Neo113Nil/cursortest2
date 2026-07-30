package n2;

import X5.j;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC1029b;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753d extends j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f6974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f6975e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Intent f6976i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753d(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, V5.b bVar) {
        super(1, bVar);
        this.f6975e = notificationOpenedActivityHMS;
        this.f6976i = intent;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new C0753d(this.f6975e, this.f6976i, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0753d) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r6.handleHMSNotificationOpenIntent(r2, r5.f6976i, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f6974d;
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.f6975e;
        if (i2 == 0) {
            V6.b.P(obj);
            Context applicationContext = notificationOpenedActivityHMS.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.f6974d = 1;
            obj = AbstractC0755f.f(applicationContext, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return Unit.f6114a;
            }
            V6.b.P(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.f6114a;
        }
        InterfaceC1029b interfaceC1029b = (InterfaceC1029b) AbstractC0755f.d().getService(InterfaceC1029b.class);
        this.f6974d = 2;
    }
}
