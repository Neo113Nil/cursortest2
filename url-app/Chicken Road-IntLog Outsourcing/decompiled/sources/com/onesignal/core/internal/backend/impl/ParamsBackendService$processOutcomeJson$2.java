package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ParamsBackendService$processOutcomeJson$2 extends j implements InterfaceC1441l {
    final /* synthetic */ s $iamLimit;
    final /* synthetic */ s $indirectIAMAttributionWindow;
    final /* synthetic */ s $indirectNotificationAttributionWindow;
    final /* synthetic */ s $isIndirectEnabled;
    final /* synthetic */ s $notificationLimit;

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ s $indirectNotificationAttributionWindow;
        final /* synthetic */ s $notificationLimit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s sVar, s sVar2) {
            super(1);
            this.$indirectNotificationAttributionWindow = sVar;
            this.$notificationLimit = sVar2;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5689a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            this.$indirectNotificationAttributionWindow.f10741a = JSONObjectExtensionsKt.safeInt(it, "minutes_since_displayed");
            this.$notificationLimit.f10741a = JSONObjectExtensionsKt.safeInt(it, "limit");
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements InterfaceC1441l {
        final /* synthetic */ s $iamLimit;
        final /* synthetic */ s $indirectIAMAttributionWindow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(s sVar, s sVar2) {
            super(1);
            this.$indirectIAMAttributionWindow = sVar;
            this.$iamLimit = sVar2;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5689a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            this.$indirectIAMAttributionWindow.f10741a = JSONObjectExtensionsKt.safeInt(it, "minutes_since_displayed");
            this.$iamLimit.f10741a = JSONObjectExtensionsKt.safeInt(it, "limit");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamsBackendService$processOutcomeJson$2(s sVar, s sVar2, s sVar3, s sVar4, s sVar5) {
        super(1);
        this.$isIndirectEnabled = sVar;
        this.$indirectNotificationAttributionWindow = sVar2;
        this.$notificationLimit = sVar3;
        this.$indirectIAMAttributionWindow = sVar4;
        this.$iamLimit = sVar5;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return v.f5689a;
    }

    public final void invoke(JSONObject indirectJSON) {
        i.e(indirectJSON, "indirectJSON");
        this.$isIndirectEnabled.f10741a = JSONObjectExtensionsKt.safeBool(indirectJSON, "enabled");
        JSONObjectExtensionsKt.expandJSONObject(indirectJSON, "notification_attribution", new AnonymousClass1(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
        JSONObjectExtensionsKt.expandJSONObject(indirectJSON, "in_app_message_attribution", new AnonymousClass2(this.$indirectIAMAttributionWindow, this.$iamLimit));
    }
}
