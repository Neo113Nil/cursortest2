package k2;

import A.n;
import N3.j;
import O3.i;
import a1.AbstractC0223a;
import java.util.HashMap;
import java.util.Map;
import l2.InterfaceC0492b;
import l2.g;
import l2.h;
import org.json.JSONException;
import u0.C0675e;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469c extends AbstractC0467a implements i, l2.c, g {

    /* renamed from: j, reason: collision with root package name */
    public static C0469c f5183j;

    public static void j(C0675e c0675e, j jVar) {
        try {
            L1.f.a().mo12addTriggers((Map) c0675e.f5976c);
            AbstractC0467a.f(jVar, null);
        } catch (ClassCastException e4) {
            AbstractC0467a.d(jVar, "Add triggers failed with error: " + e4.getMessage() + "\n" + e4.getStackTrace());
        }
    }

    @Override // O3.i
    public final void g(C0675e c0675e, j jVar) {
        h(jVar, new n((AbstractC0467a) this, (Object) c0675e, (Object) jVar, 3));
    }

    @Override // l2.c
    public final void onClick(InterfaceC0492b interfaceC0492b) {
        try {
            b("OneSignal#onClickInAppMessage", AbstractC0223a.g(interfaceC0492b));
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageClickEvent object to hash map:" + e4.toString(), null);
        }
    }

    @Override // l2.g
    public final void onDidDismiss(l2.e eVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", AbstractC0223a.h(eVar.getMessage()));
            b("OneSignal#onDidDismissInAppMessage", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageDidDismissEvent object to hash map:" + e4.toString(), null);
        }
    }

    @Override // l2.g
    public final void onDidDisplay(l2.f fVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", AbstractC0223a.h(fVar.getMessage()));
            b("OneSignal#onDidDisplayInAppMessage", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageDidDisplayEvent object to hash map:" + e4.toString(), null);
        }
    }

    @Override // l2.g
    public final void onWillDismiss(h hVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", AbstractC0223a.h(hVar.getMessage()));
            b("OneSignal#onWillDismissInAppMessage", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageWillDismissEvent object to hash map:" + e4.toString(), null);
        }
    }

    @Override // l2.g
    public final void onWillDisplay(l2.i iVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", AbstractC0223a.h(iVar.getMessage()));
            b("OneSignal#onWillDisplayInAppMessage", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageWillDisplayEvent object to hash map:" + e4.toString(), null);
        }
    }
}
