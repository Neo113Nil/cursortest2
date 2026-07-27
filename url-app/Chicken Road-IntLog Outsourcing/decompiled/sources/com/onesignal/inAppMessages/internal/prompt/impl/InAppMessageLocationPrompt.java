package com.onesignal.inAppMessages.internal.prompt.impl;

import C1.b;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.location.ILocationManager;
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class InAppMessageLocationPrompt extends InAppMessagePrompt {
    private final ILocationManager _locationManager;

    public InAppMessageLocationPrompt(ILocationManager _locationManager) {
        i.e(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return InAppMessagePromptTypes.LOCATION_PROMPT_KEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(InterfaceC1218d interfaceC1218d) {
        InAppMessageLocationPrompt$handlePrompt$1 inAppMessageLocationPrompt$handlePrompt$1;
        int i2;
        boolean booleanValue;
        if (interfaceC1218d instanceof InAppMessageLocationPrompt$handlePrompt$1) {
            inAppMessageLocationPrompt$handlePrompt$1 = (InAppMessageLocationPrompt$handlePrompt$1) interfaceC1218d;
            int i3 = inAppMessageLocationPrompt$handlePrompt$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessageLocationPrompt$handlePrompt$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessageLocationPrompt$handlePrompt$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessageLocationPrompt$handlePrompt$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    ILocationManager iLocationManager = this._locationManager;
                    inAppMessageLocationPrompt$handlePrompt$1.label = 1;
                    obj = iLocationManager.requestPermission(inAppMessageLocationPrompt$handlePrompt$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new b();
                }
                return InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
            }
        }
        inAppMessageLocationPrompt$handlePrompt$1 = new InAppMessageLocationPrompt$handlePrompt$1(this, interfaceC1218d);
        Object obj2 = inAppMessageLocationPrompt$handlePrompt$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessageLocationPrompt$handlePrompt$1.label;
        if (i2 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
