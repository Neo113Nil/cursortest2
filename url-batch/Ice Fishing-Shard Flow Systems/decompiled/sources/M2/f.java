package M2;

import D6.z;
import android.app.Activity;
import android.content.Context;
import com.onesignal.common.i;
import com.onesignal.flutter.OneSignalNotifications;
import com.onesignal.flutter.OneSignalPushSubscription;
import com.onesignal.flutter.OneSignalUser;
import n2.AbstractC0755f;
import p4.InterfaceC0828a;
import r4.l;
import s4.n;
import s4.o;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class f extends a implements o4.c, o, InterfaceC0828a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f1741m = 0;

    public final void i() {
        OneSignalNotifications i2 = OneSignalNotifications.i();
        i2.c(this.f1731i, "OneSignal#notifications", i2);
        if (i2.f4550o && AbstractC0755f.c().isInitialized()) {
            AbstractC0755f.b().mo26removeClickListener(i2);
            AbstractC0755f.b().mo20addClickListener(i2);
        }
        if (OneSignalUser.f4552m == null) {
            OneSignalUser.f4552m = new OneSignalUser();
        }
        OneSignalUser oneSignalUser = OneSignalUser.f4552m;
        oneSignalUser.c(this.f1731i, "OneSignal#user", oneSignalUser);
        if (OneSignalPushSubscription.f4551m == null) {
            OneSignalPushSubscription.f4551m = new OneSignalPushSubscription();
        }
        OneSignalPushSubscription oneSignalPushSubscription = OneSignalPushSubscription.f4551m;
        oneSignalPushSubscription.c(this.f1731i, "OneSignal#pushsubscription", oneSignalPushSubscription);
        if (c.f1736m == null) {
            c.f1736m = new c();
        }
        c cVar = c.f1736m;
        cVar.c(this.f1731i, "OneSignal#inappmessages", cVar);
    }

    @Override // p4.InterfaceC0828a
    public final void onAttachedToActivity(p4.b bVar) {
        this.f1729d = (Activity) ((z) bVar).f640c;
        i();
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
        Context context = bVar.f7120a;
        s4.f fVar = bVar.f7122c;
        this.f1729d = context;
        this.f1731i = fVar;
        i.setSdkType("flutter");
        i.setSdkVersion("050603");
        q qVar = new q(fVar, com.onesignal.common.threading.a.BASE_THREAD_NAME);
        this.f1730e = qVar;
        qVar.b(this);
        if (b.f1732n == null) {
            b.f1732n = new b(0);
        }
        b bVar2 = b.f1732n;
        bVar2.f1731i = fVar;
        q qVar2 = new q(fVar, "OneSignal#debug");
        bVar2.f1730e = qVar2;
        qVar2.b(bVar2);
        if (b.f1733o == null) {
            b.f1733o = new b(1);
        }
        b bVar3 = b.f1733o;
        bVar3.f1731i = fVar;
        q qVar3 = new q(fVar, "OneSignal#location");
        bVar3.f1730e = qVar3;
        qVar3.b(bVar3);
        if (b.f1734p == null) {
            b.f1734p = new b(2);
        }
        b bVar4 = b.f1734p;
        bVar4.f1731i = fVar;
        q qVar4 = new q(fVar, "OneSignal#session");
        bVar4.f1730e = qVar4;
        qVar4.b(bVar4);
        if (c.f1736m == null) {
            c.f1736m = new c();
        }
        c cVar = c.f1736m;
        cVar.a(fVar, "OneSignal#inappmessages", cVar);
        if (OneSignalUser.f4552m == null) {
            OneSignalUser.f4552m = new OneSignalUser();
        }
        OneSignalUser oneSignalUser = OneSignalUser.f4552m;
        oneSignalUser.a(fVar, "OneSignal#user", oneSignalUser);
        if (OneSignalPushSubscription.f4551m == null) {
            OneSignalPushSubscription.f4551m = new OneSignalPushSubscription();
        }
        OneSignalPushSubscription oneSignalPushSubscription = OneSignalPushSubscription.f4551m;
        oneSignalPushSubscription.a(fVar, "OneSignal#pushsubscription", oneSignalPushSubscription);
        OneSignalNotifications i2 = OneSignalNotifications.i();
        i2.a(fVar, "OneSignal#notifications", i2);
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivity() {
        OneSignalNotifications i2 = OneSignalNotifications.i();
        i2.getClass();
        if (AbstractC0755f.c().isInitialized()) {
            AbstractC0755f.b().mo26removeClickListener(i2);
        }
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivityForConfigChanges() {
        OneSignalNotifications i2 = OneSignalNotifications.i();
        i2.getClass();
        if (AbstractC0755f.c().isInitialized()) {
            AbstractC0755f.b().mo26removeClickListener(i2);
        }
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
        OneSignalNotifications i2 = OneSignalNotifications.i();
        s4.f fVar = bVar.f7122c;
        if (fVar == null) {
            i2.getClass();
        } else if (fVar != i2.f1731i) {
            return;
        }
        if (AbstractC0755f.c().isInitialized()) {
            AbstractC0755f.b().mo26removeClickListener(i2);
        }
    }

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        l lVar = (l) pVar;
        g(lVar, new F.n((a) this, (Object) nVar, (Object) lVar, 6));
    }

    @Override // p4.InterfaceC0828a
    public final void onReattachedToActivityForConfigChanges(p4.b bVar) {
        this.f1729d = (Activity) ((z) bVar).f640c;
        i();
    }
}
