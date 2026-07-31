package L1;

import H1.RunnableC0139m;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class d extends g implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public int f1438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f1439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NotificationOpenedActivityHMS notificationOpenedActivityHMS, InterfaceC0564d interfaceC0564d) {
        super(1, interfaceC0564d);
        this.f1439g = notificationOpenedActivityHMS;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
        return new d(this.f1439g, interfaceC0564d);
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        return ((d) create((InterfaceC0564d) obj)).invokeSuspend(v.f5219a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7.handleHMSNotificationOpenIntent(r5, r1, r6) == r0) goto L25;
     */
    @Override // q5.AbstractC0605a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RunnableC0139m runnableC0139m;
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1438f;
        v vVar = v.f5219a;
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.f1439g;
        try {
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Context applicationContext = notificationOpenedActivityHMS.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                this.f1438f = 1;
                obj = f.f(applicationContext, this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    runnableC0139m = new RunnableC0139m(5, notificationOpenedActivityHMS);
                    notificationOpenedActivityHMS.runOnUiThread(runnableC0139m);
                    return vVar;
                }
                AbstractC0676f.w(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                runnableC0139m = new RunnableC0139m(5, notificationOpenedActivityHMS);
                notificationOpenedActivityHMS.runOnUiThread(runnableC0139m);
                return vVar;
            }
            W2.b bVar = (W2.b) f.d().getService(W2.b.class);
            Intent intent = notificationOpenedActivityHMS.getIntent();
            this.f1438f = 2;
        } catch (Throwable th) {
            notificationOpenedActivityHMS.runOnUiThread(new RunnableC0139m(5, notificationOpenedActivityHMS));
            throw th;
        }
    }
}
