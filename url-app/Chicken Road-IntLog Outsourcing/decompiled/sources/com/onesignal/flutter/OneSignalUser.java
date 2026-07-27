package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.state.UserChangedState;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class OneSignalUser extends FlutterMessengerResponder implements m, IUserStateObserver {
    private static OneSignalUser sharedInstance;

    private OneSignalUser() {
    }

    private void addAliases(l lVar, n nVar) {
        try {
            OneSignal.getUser().addAliases((Map) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "addAliases failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void addEmail(l lVar, n nVar) {
        OneSignal.getUser().addEmail((String) lVar.f1147b);
        replySuccess(nVar, null);
    }

    private void addSms(l lVar, n nVar) {
        OneSignal.getUser().addSms((String) lVar.f1147b);
        replySuccess(nVar, null);
    }

    private void addTags(l lVar, n nVar) {
        try {
            OneSignal.getUser().addTags((Map) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "addTags failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void getExternalId(l lVar, n nVar) {
        String externalId = OneSignal.getUser().getExternalId();
        if (externalId.isEmpty()) {
            externalId = null;
        }
        replySuccess(nVar, externalId);
    }

    private void getOnesignalId(l lVar, n nVar) {
        String onesignalId = OneSignal.getUser().getOnesignalId();
        if (onesignalId.isEmpty()) {
            onesignalId = null;
        }
        replySuccess(nVar, onesignalId);
    }

    public static OneSignalUser getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalUser();
        }
        return sharedInstance;
    }

    private void getTags(l lVar, n nVar) {
        replySuccess(nVar, OneSignal.getUser().getTags());
    }

    private void lifecycleInit(n nVar) {
        OneSignal.getUser().removeObserver(this);
        OneSignal.getUser().addObserver(this);
        replySuccess(nVar, null);
    }

    public static void registerWith(f fVar) {
        OneSignalUser sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#user");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    private void removeAliases(l lVar, n nVar) {
        try {
            OneSignal.getUser().removeAliases((List) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "removeAliases failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void removeEmail(l lVar, n nVar) {
        OneSignal.getUser().removeEmail((String) lVar.f1147b);
        replySuccess(nVar, null);
    }

    private void removeSms(l lVar, n nVar) {
        OneSignal.getUser().removeSms((String) lVar.f1147b);
        replySuccess(nVar, null);
    }

    private void removeTags(l lVar, n nVar) {
        try {
            OneSignal.getUser().removeTags((List) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "deleteTags failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void setLanguage(l lVar, n nVar) {
        String str = (String) lVar.a("language");
        if (str != null && str.length() == 0) {
            str = null;
        }
        OneSignal.getUser().setLanguage(str);
        replySuccess(nVar, null);
    }

    private void trackEvent(l lVar, n nVar) {
        OneSignal.getUser().trackEvent((String) lVar.a("name"), (Map) lVar.a("properties"));
        replySuccess(nVar, null);
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#setLanguage")) {
            setLanguage(lVar, nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#getOnesignalId")) {
            getOnesignalId(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#getExternalId")) {
            getExternalId(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#addAliases")) {
            addAliases(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeAliases")) {
            removeAliases(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#addEmail")) {
            addEmail(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeEmail")) {
            removeEmail(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#addSms")) {
            addSms(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeSms")) {
            removeSms(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#addTags")) {
            addTags(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeTags")) {
            removeTags(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#getTags")) {
            getTags(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#lifecycleInit")) {
            lifecycleInit(nVar);
        } else if (str.contentEquals("OneSignal#trackEvent")) {
            trackEvent(lVar, nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }

    @Override // com.onesignal.user.state.IUserStateObserver
    public void onUserStateChange(UserChangedState userChangedState) {
        try {
            invokeMethodOnUiThread("OneSignal#onUserStateChange", OneSignalSerializer.convertOnUserStateChange(userChangedState));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert UserChangedState object to hash map:" + e3.toString(), null);
        }
    }
}
