package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessageClickEvent;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageDidDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageDidDisplayEvent;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessageWillDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDisplayEvent;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class OneSignalInAppMessages extends FlutterMessengerResponder implements m, IInAppMessageClickListener, IInAppMessageLifecycleListener {
    private static OneSignalInAppMessages sharedInstance;

    private OneSignalInAppMessages() {
    }

    private void addTriggers(l lVar, n nVar) {
        try {
            OneSignal.getInAppMessages().mo13addTriggers((Map) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "Add triggers failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void clearTriggers(l lVar, n nVar) {
        OneSignal.getInAppMessages().mo14clearTriggers();
        replySuccess(nVar, null);
    }

    public static OneSignalInAppMessages getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalInAppMessages();
        }
        return sharedInstance;
    }

    private void paused(l lVar, n nVar) {
        OneSignal.getInAppMessages().setPaused(((Boolean) lVar.f1147b).booleanValue());
        replySuccess(nVar, null);
    }

    public static void registerWith(f fVar) {
        OneSignalInAppMessages sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#inappmessages");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    private void removeTrigger(l lVar, n nVar) {
        OneSignal.getInAppMessages().mo17removeTrigger((String) lVar.f1147b);
        replySuccess(nVar, null);
    }

    private void removeTriggers(l lVar, n nVar) {
        try {
            OneSignal.getInAppMessages().mo18removeTriggers((Collection) lVar.f1147b);
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "Remove triggers for keys failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    public void lifecycleInit(n nVar) {
        OneSignal.getInAppMessages().mo16removeLifecycleListener(this);
        OneSignal.getInAppMessages().mo11addLifecycleListener(this);
        OneSignal.getInAppMessages().mo15removeClickListener(this);
        OneSignal.getInAppMessages().mo10addClickListener(this);
        replySuccess(nVar, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickListener
    public void onClick(IInAppMessageClickEvent iInAppMessageClickEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onClickInAppMessage", OneSignalSerializer.convertInAppMessageClickEventToMap(iInAppMessageClickEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert IInAppMessageClickEvent object to hash map:" + e3.toString(), null);
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
    public void onDidDismiss(IInAppMessageDidDismissEvent iInAppMessageDidDismissEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onDidDismissInAppMessage", OneSignalSerializer.convertInAppMessageDidDismissEventToMap(iInAppMessageDidDismissEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert IInAppMessageDidDismissEvent object to hash map:" + e3.toString(), null);
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
    public void onDidDisplay(IInAppMessageDidDisplayEvent iInAppMessageDidDisplayEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onDidDisplayInAppMessage", OneSignalSerializer.convertInAppMessageDidDisplayEventToMap(iInAppMessageDidDisplayEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert IInAppMessageDidDisplayEvent object to hash map:" + e3.toString(), null);
        }
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#addTrigger")) {
            addTriggers(lVar, nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#addTriggers")) {
            addTriggers(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeTrigger")) {
            removeTrigger(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#removeTriggers")) {
            removeTriggers(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#clearTriggers")) {
            clearTriggers(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#arePaused")) {
            replySuccess(nVar, Boolean.valueOf(OneSignal.getInAppMessages().getPaused()));
            return;
        }
        if (str.contentEquals("OneSignal#paused")) {
            paused(lVar, nVar);
        } else if (str.contentEquals("OneSignal#lifecycleInit")) {
            lifecycleInit(nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
    public void onWillDismiss(IInAppMessageWillDismissEvent iInAppMessageWillDismissEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onWillDismissInAppMessage", OneSignalSerializer.convertInAppMessageWillDismissEventToMap(iInAppMessageWillDismissEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert IInAppMessageWillDismissEvent object to hash map:" + e3.toString(), null);
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
    public void onWillDisplay(IInAppMessageWillDisplayEvent iInAppMessageWillDisplayEvent) {
        try {
            invokeMethodOnUiThread("OneSignal#onWillDisplayInAppMessage", OneSignalSerializer.convertInAppMessageWillDisplayEventToMap(iInAppMessageWillDisplayEvent));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert IInAppMessageWillDisplayEvent object to hash map:" + e3.toString(), null);
        }
    }
}
