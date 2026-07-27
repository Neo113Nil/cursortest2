package com.onesignal.flutter;

import D2.b;
import E2.a;
import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import M0.e;
import android.content.Context;
import com.onesignal.OneSignal;
import com.onesignal.common.OneSignalWrapper;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public class OneSignalPlugin extends FlutterMessengerResponder implements b, m, a {
    private void init(Context context, f fVar) {
        this.context = context;
        this.messenger = fVar;
        OneSignalWrapper.setSdkType(PluginErrorDetails.Platform.FLUTTER);
        OneSignalWrapper.setSdkVersion("050505");
        o oVar = new o(fVar, "OneSignal");
        this.channel = oVar;
        oVar.b(this);
        OneSignalDebug.registerWith(fVar);
        OneSignalLocation.registerWith(fVar);
        OneSignalSession.registerWith(fVar);
        OneSignalInAppMessages.registerWith(fVar);
        OneSignalUser.registerWith(fVar);
        OneSignalPushSubscription.registerWith(fVar);
        OneSignalNotifications.registerWith(fVar);
    }

    private void initWithContext(l lVar, n nVar) {
        OneSignal.initWithContext(this.context, (String) lVar.a("appId"));
        replySuccess(nVar, null);
    }

    private void login(l lVar, n nVar) {
        OneSignal.login((String) lVar.a("externalId"));
        replySuccess(nVar, null);
    }

    private void loginWithJWT(l lVar, n nVar) {
        OneSignal.login((String) lVar.a("externalId"), (String) lVar.a("jwt"));
        replySuccess(nVar, null);
    }

    private void logout(l lVar, n nVar) {
        OneSignal.logout();
        replySuccess(nVar, null);
    }

    private void setConsentGiven(l lVar, n nVar) {
        OneSignal.setConsentGiven(((Boolean) lVar.a("granted")).booleanValue());
        replySuccess(nVar, null);
    }

    private void setConsentRequired(l lVar, n nVar) {
        OneSignal.setConsentRequired(((Boolean) lVar.a("required")).booleanValue());
        replySuccess(nVar, null);
    }

    @Override // E2.a
    public void onAttachedToActivity(E2.b bVar) {
        this.context = (AbstractActivityC1515c) ((e) bVar).f1788h;
    }

    @Override // D2.b
    public void onAttachedToEngine(D2.a aVar) {
        init(aVar.f433a, aVar.f435c);
    }

    @Override // E2.a
    public void onDetachedFromActivity() {
    }

    @Override // E2.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // D2.b
    public void onDetachedFromEngine(D2.a aVar) {
        onDetachedFromEngine();
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#initialize")) {
            initWithContext(lVar, nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#consentRequired")) {
            setConsentRequired(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#consentGiven")) {
            setConsentGiven(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#login")) {
            login(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#loginWithJWT")) {
            loginWithJWT(lVar, nVar);
        } else if (str.contentEquals("OneSignal#logout")) {
            logout(lVar, nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }

    private void onDetachedFromEngine() {
        OneSignalNotifications.getSharedInstance().onDetachedFromEngine();
    }

    @Override // E2.a
    public void onReattachedToActivityForConfigChanges(E2.b bVar) {
    }
}
