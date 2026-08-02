package com.squareup.cash.support.presenters;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealContactSupportNavigator {
    public final ToolbarTuckTargets dbQueries;
    public final AndroidStringManager stringManager;

    public RealContactSupportNavigator(ToolbarTuckTargets toolbarTuckTargets, AndroidStringManager androidStringManager) {
        this.dbQueries = toolbarTuckTargets;
        this.stringManager = androidStringManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getScreenForEmail(SupportScreens.ContactScreens.Data data, ContinuationImpl continuationImpl) {
        RealContactSupportNavigator$getScreenForEmail$1 realContactSupportNavigator$getScreenForEmail$1;
        int i;
        if (continuationImpl instanceof RealContactSupportNavigator$getScreenForEmail$1) {
            realContactSupportNavigator$getScreenForEmail$1 = (RealContactSupportNavigator$getScreenForEmail$1) continuationImpl;
            int i2 = realContactSupportNavigator$getScreenForEmail$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSupportNavigator$getScreenForEmail$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactSupportNavigator$getScreenForEmail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSupportNavigator$getScreenForEmail$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realContactSupportNavigator$getScreenForEmail$1.L$0 = data;
                    realContactSupportNavigator$getScreenForEmail$1.label = 1;
                    obj = this.dbQueries.getExistingEmail(realContactSupportNavigator$getScreenForEmail$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    data = realContactSupportNavigator$getScreenForEmail$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str = (String) obj;
                return new SupportScreens.ContactScreens.ContactSupportEmailInputScreen(this.stringManager.get(R.string.contact_support_email_input_prefilled_email_title), str != null ? new RedactedString(str) : null, data);
            }
        }
        realContactSupportNavigator$getScreenForEmail$1 = new RealContactSupportNavigator$getScreenForEmail$1(this, continuationImpl);
        Object obj2 = realContactSupportNavigator$getScreenForEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSupportNavigator$getScreenForEmail$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        return new SupportScreens.ContactScreens.ContactSupportEmailInputScreen(this.stringManager.get(R.string.contact_support_email_input_prefilled_email_title), str2 != null ? new RedactedString(str2) : null, data);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object goToScreenForOption(Navigator navigator, Article.ContactOption contactOption, boolean z, String str, String str2, Boolean bool, String str3, ContinuationImpl continuationImpl) {
        RealContactSupportNavigator$goToScreenForOption$1 realContactSupportNavigator$goToScreenForOption$1;
        int i;
        Navigator navigator2;
        Screen chatLoading;
        if (continuationImpl instanceof RealContactSupportNavigator$goToScreenForOption$1) {
            realContactSupportNavigator$goToScreenForOption$1 = (RealContactSupportNavigator$goToScreenForOption$1) continuationImpl;
            int i2 = realContactSupportNavigator$goToScreenForOption$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSupportNavigator$goToScreenForOption$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactSupportNavigator$goToScreenForOption$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSupportNavigator$goToScreenForOption$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportScreens.ContactScreens.Data data = new SupportScreens.ContactScreens.Data(str2, str, str3, contactOption, bool, null, null, null, new Finish(null));
                    if (z) {
                        navigator.askQuestion(new SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion(str, contactOption), new RealSandboxer$$ExternalSyntheticLambda0(data, 25));
                        return Unit.INSTANCE;
                    }
                    int ordinal = contactOption.ordinal();
                    if (ordinal == 0) {
                        navigator2 = navigator;
                        chatLoading = new SupportChatScreens.FlowScreen.ChatLoading(new Finish(null), str3, str, str2, null, null, 48);
                        navigator2.goTo(chatLoading);
                        return Unit.INSTANCE;
                    }
                    if (ordinal == 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("Phone is currently unsupported.");
                        return null;
                    }
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realContactSupportNavigator$goToScreenForOption$1.L$0 = navigator;
                    realContactSupportNavigator$goToScreenForOption$1.label = 1;
                    obj = getScreenForEmail(data, realContactSupportNavigator$goToScreenForOption$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    navigator2 = navigator;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    navigator2 = realContactSupportNavigator$goToScreenForOption$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                chatLoading = (Screen) obj;
                navigator2.goTo(chatLoading);
                return Unit.INSTANCE;
            }
        }
        realContactSupportNavigator$goToScreenForOption$1 = new RealContactSupportNavigator$goToScreenForOption$1(this, continuationImpl);
        Object obj3 = realContactSupportNavigator$goToScreenForOption$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSupportNavigator$goToScreenForOption$1.label;
        if (i != 0) {
        }
        chatLoading = (Screen) obj3;
        navigator2.goTo(chatLoading);
        return Unit.INSTANCE;
    }
}
