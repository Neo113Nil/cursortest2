package M2;

import N2.g;
import N2.h;
import N2.i;
import java.util.HashMap;
import java.util.Map;
import n2.AbstractC0755f;
import org.json.JSONException;
import r4.l;
import s4.n;
import s4.o;
import s4.p;

/* loaded from: classes.dex */
public final class c extends a implements o, N2.c, g {

    /* renamed from: m, reason: collision with root package name */
    public static c f1736m;

    public static void i(n nVar, l lVar) {
        try {
            AbstractC0755f.a().mo14addTriggers((Map) nVar.f7768b);
            a.f(null, lVar);
        } catch (ClassCastException e7) {
            a.d("Add triggers failed with error: " + e7.getMessage() + "\n" + e7.getStackTrace(), lVar);
        }
    }

    @Override // N2.c
    public final void onClick(N2.b bVar) {
        try {
            b("OneSignal#onClickInAppMessage", V6.b.c(bVar));
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageClickEvent object to hash map:" + e7.toString(), null);
        }
    }

    @Override // N2.g
    public final void onDidDismiss(N2.e eVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", V6.b.d(eVar.getMessage()));
            b("OneSignal#onDidDismissInAppMessage", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageDidDismissEvent object to hash map:" + e7.toString(), null);
        }
    }

    @Override // N2.g
    public final void onDidDisplay(N2.f fVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", V6.b.d(fVar.getMessage()));
            b("OneSignal#onDidDisplayInAppMessage", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageDidDisplayEvent object to hash map:" + e7.toString(), null);
        }
    }

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        l lVar = (l) pVar;
        g(lVar, new F.n((a) this, (Object) nVar, (Object) lVar, 4));
    }

    @Override // N2.g
    public final void onWillDismiss(h hVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", V6.b.d(hVar.getMessage()));
            b("OneSignal#onWillDismissInAppMessage", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageWillDismissEvent object to hash map:" + e7.toString(), null);
        }
    }

    @Override // N2.g
    public final void onWillDisplay(i iVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("message", V6.b.d(iVar.getMessage()));
            b("OneSignal#onWillDisplayInAppMessage", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert IInAppMessageWillDisplayEvent object to hash map:" + e7.toString(), null);
        }
    }
}
