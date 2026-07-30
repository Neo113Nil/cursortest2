package com.onesignal.notifications.internal.registration.impl;

import X5.j;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import s6.n;
import u6.C0953e;

/* loaded from: classes.dex */
public final class a {
    public static final C0069a Companion = new C0069a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final v2.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final A2.c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        public /* synthetic */ C0069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0069a() {
        }
    }

    public static final class b extends j implements Function2 {
        int label;

        public b(V5.b bVar) {
            super(2, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i2) {
            ((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new b(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            final Activity current = a.this._applicationService.getCurrent();
            if (current == null) {
                return Unit.f6114a;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final a aVar2 = a.this;
            message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new com.onesignal.core.internal.permissions.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public a(v2.f _applicationService, A2.c _deviceService, com.onesignal.core.internal.config.c _configModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._applicationService = _applicationService;
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(a aVar, Activity activity) {
        aVar.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            Intrinsics.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            q1.e eVar = q1.e.f7323e;
            Intrinsics.checkNotNullExpressionValue(eVar, "getInstance(...)");
            PendingIntent pendingIntent = null;
            Intent a7 = eVar.a(eVar.b(this._applicationService.getAppContext(), q1.f.f7325a), activity, null);
            if (a7 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, a7, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e7) {
            e7.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(V5.b bVar) {
        if (!this._deviceService.isAndroidDeviceType()) {
            return Unit.f6114a;
        }
        if (!isGooglePlayStoreInstalled() || ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getDisableGMSMissingPrompt() || ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            return Unit.f6114a;
        }
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(n.f7850a, new b(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }
}
