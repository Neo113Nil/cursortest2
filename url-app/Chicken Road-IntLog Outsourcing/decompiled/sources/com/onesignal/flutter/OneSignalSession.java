package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.OneSignal;

/* loaded from: classes.dex */
public class OneSignalSession extends FlutterMessengerResponder implements m {
    private static OneSignalSession sharedInstance;

    private OneSignalSession() {
    }

    private void addOutcome(l lVar, n nVar) {
        String str = (String) lVar.f1147b;
        if (str == null || str.isEmpty()) {
            replyError(nVar, "OneSignal", "addOutcome() name must not be null or empty", null);
        } else {
            OneSignal.getSession().addOutcome(str);
            replySuccess(nVar, null);
        }
    }

    private void addOutcomeWithValue(l lVar, n nVar) {
        String str = (String) lVar.a("outcome_name");
        Double d6 = (Double) lVar.a("outcome_value");
        if (str == null || str.isEmpty()) {
            replyError(nVar, "OneSignal", "sendOutcomeWithValue() name must not be null or empty", null);
        } else if (d6 == null) {
            replyError(nVar, "OneSignal", "sendOutcomeWithValue() value must not be null", null);
        } else {
            OneSignal.getSession().addOutcomeWithValue(str, d6.floatValue());
            replySuccess(nVar, null);
        }
    }

    private void addUniqueOutcome(l lVar, n nVar) {
        String str = (String) lVar.f1147b;
        if (str == null || str.isEmpty()) {
            replyError(nVar, "OneSignal", "sendUniqueOutcome() name must not be null or empty", null);
        } else {
            OneSignal.getSession().addUniqueOutcome(str);
            replySuccess(nVar, null);
        }
    }

    public static OneSignalSession getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalSession();
        }
        return sharedInstance;
    }

    public static void registerWith(f fVar) {
        OneSignalSession sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#session");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#addOutcome")) {
            addOutcome(lVar, nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#addUniqueOutcome")) {
            addUniqueOutcome(lVar, nVar);
        } else if (str.contentEquals("OneSignal#addOutcomeWithValue")) {
            addOutcomeWithValue(lVar, nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }
}
