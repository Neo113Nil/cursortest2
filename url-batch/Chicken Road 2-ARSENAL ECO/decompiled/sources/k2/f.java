package k2;

import A.n;
import D0.h;
import N3.j;
import O3.i;
import android.app.Activity;
import android.content.Context;
import com.onesignal.flutter.OneSignalNotifications;
import com.onesignal.flutter.OneSignalPushSubscription;
import com.onesignal.flutter.OneSignalUser;
import u0.C0675e;

/* loaded from: classes.dex */
public class f extends AbstractC0467a implements K3.b, i, L3.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f5188j = 0;

    @Override // O3.i
    public final void g(C0675e c0675e, j jVar) {
        h(jVar, new n((AbstractC0467a) this, (Object) c0675e, (Object) jVar, 5));
    }

    public final void j() {
        OneSignalNotifications j4 = OneSignalNotifications.j();
        j4.c(this.f5178h, "OneSignal#notifications", j4);
        if (j4.f3923l && L1.f.c().isInitialized()) {
            L1.f.b().mo24removeClickListener(j4);
            L1.f.b().mo18addClickListener(j4);
        }
        if (OneSignalUser.f3925j == null) {
            OneSignalUser.f3925j = new OneSignalUser();
        }
        OneSignalUser oneSignalUser = OneSignalUser.f3925j;
        oneSignalUser.c(this.f5178h, "OneSignal#user", oneSignalUser);
        if (OneSignalPushSubscription.f3924j == null) {
            OneSignalPushSubscription.f3924j = new OneSignalPushSubscription();
        }
        OneSignalPushSubscription oneSignalPushSubscription = OneSignalPushSubscription.f3924j;
        oneSignalPushSubscription.c(this.f5178h, "OneSignal#pushsubscription", oneSignalPushSubscription);
        if (C0469c.f5183j == null) {
            C0469c.f5183j = new C0469c();
        }
        C0469c c0469c = C0469c.f5183j;
        c0469c.c(this.f5178h, "OneSignal#inappmessages", c0469c);
    }

    @Override // L3.a
    public final void onAttachedToActivity(L3.b bVar) {
        this.f5176f = (Activity) ((h) bVar).f330b;
        j();
    }

    @Override // K3.b
    public final void onAttachedToEngine(K3.a aVar) {
        Context context = aVar.f1368a;
        O3.e eVar = aVar.f1370c;
        this.f5176f = context;
        this.f5178h = eVar;
        com.onesignal.common.i.setSdkType("flutter");
        com.onesignal.common.i.setSdkVersion("050604");
        B0.c cVar = new B0.c(eVar, com.onesignal.common.threading.a.BASE_THREAD_NAME);
        this.f5177g = cVar;
        cVar.C(this);
        if (C0468b.f5179k == null) {
            C0468b.f5179k = new C0468b(0);
        }
        C0468b c0468b = C0468b.f5179k;
        c0468b.f5178h = eVar;
        B0.c cVar2 = new B0.c(eVar, "OneSignal#debug");
        c0468b.f5177g = cVar2;
        cVar2.C(c0468b);
        if (C0468b.f5180l == null) {
            C0468b.f5180l = new C0468b(1);
        }
        C0468b c0468b2 = C0468b.f5180l;
        c0468b2.f5178h = eVar;
        B0.c cVar3 = new B0.c(eVar, "OneSignal#location");
        c0468b2.f5177g = cVar3;
        cVar3.C(c0468b2);
        if (C0468b.f5181m == null) {
            C0468b.f5181m = new C0468b(2);
        }
        C0468b c0468b3 = C0468b.f5181m;
        c0468b3.f5178h = eVar;
        B0.c cVar4 = new B0.c(eVar, "OneSignal#session");
        c0468b3.f5177g = cVar4;
        cVar4.C(c0468b3);
        if (C0469c.f5183j == null) {
            C0469c.f5183j = new C0469c();
        }
        C0469c c0469c = C0469c.f5183j;
        c0469c.a(eVar, "OneSignal#inappmessages", c0469c);
        if (OneSignalUser.f3925j == null) {
            OneSignalUser.f3925j = new OneSignalUser();
        }
        OneSignalUser oneSignalUser = OneSignalUser.f3925j;
        oneSignalUser.a(eVar, "OneSignal#user", oneSignalUser);
        if (OneSignalPushSubscription.f3924j == null) {
            OneSignalPushSubscription.f3924j = new OneSignalPushSubscription();
        }
        OneSignalPushSubscription oneSignalPushSubscription = OneSignalPushSubscription.f3924j;
        oneSignalPushSubscription.a(eVar, "OneSignal#pushsubscription", oneSignalPushSubscription);
        OneSignalNotifications j4 = OneSignalNotifications.j();
        j4.a(eVar, "OneSignal#notifications", j4);
    }

    @Override // L3.a
    public final void onDetachedFromActivity() {
        OneSignalNotifications j4 = OneSignalNotifications.j();
        j4.getClass();
        if (L1.f.c().isInitialized()) {
            L1.f.b().mo24removeClickListener(j4);
        }
    }

    @Override // L3.a
    public final void onDetachedFromActivityForConfigChanges() {
        OneSignalNotifications j4 = OneSignalNotifications.j();
        j4.getClass();
        if (L1.f.c().isInitialized()) {
            L1.f.b().mo24removeClickListener(j4);
        }
    }

    @Override // K3.b
    public final void onDetachedFromEngine(K3.a aVar) {
        OneSignalNotifications j4 = OneSignalNotifications.j();
        O3.e eVar = aVar.f1370c;
        if (eVar == null) {
            j4.getClass();
        } else if (eVar != j4.f5178h) {
            return;
        }
        if (L1.f.c().isInitialized()) {
            L1.f.b().mo24removeClickListener(j4);
        }
    }

    @Override // L3.a
    public final void onReattachedToActivityForConfigChanges(L3.b bVar) {
        this.f5176f = (Activity) ((h) bVar).f330b;
        j();
    }
}
