package com.onesignal.notifications.internal.registration.impl;

import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class a {
    public static final C0238a Companion = new C0238a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final t4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final y4.c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0238a {
        public /* synthetic */ C0238a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0238a() {
        }
    }

    public static final class b extends x7.h implements p {
        int label;

        public b(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i) {
            ((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new b(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            final Activity current = a.this._applicationService.getCurrent();
            v vVar = v.f40183a;
            if (current == null) {
                return vVar;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
            AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
            final a aVar = a.this;
            message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new com.onesignal.core.internal.permissions.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return vVar;
        }
    }

    public a(t4.f _applicationService, y4.c _deviceService, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
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
            kotlin.jvm.internal.h.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            L2.e eVar = L2.e.f1724d;
            PendingIntent pendingIntent = null;
            Intent b9 = eVar.b(activity, null, eVar.c(this._applicationService.getAppContext(), L2.f.f1725a));
            if (b9 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, b9, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e6) {
            e6.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(InterfaceC5133d interfaceC5133d) {
        boolean isAndroidDeviceType = this._deviceService.isAndroidDeviceType();
        v vVar = v.f40183a;
        if (isAndroidDeviceType && isGooglePlayStoreInstalled() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getDisableGMSMissingPrompt() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            V7.e eVar = F.f2551a;
            Object y6 = AbstractC0399y.y(o.f3162a, new b(null), interfaceC5133d);
            if (y6 == EnumC5179a.f41704n) {
                return y6;
            }
        }
        return vVar;
    }
}
