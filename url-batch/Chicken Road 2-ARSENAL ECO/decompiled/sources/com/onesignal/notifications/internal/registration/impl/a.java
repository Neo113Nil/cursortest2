package com.onesignal.notifications.internal.registration.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import M5.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a {
    public static final C0069a Companion = new C0069a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final T1.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Y1.c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        public /* synthetic */ C0069a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0069a() {
        }
    }

    public static final class b extends q5.g implements InterfaceC0747p {
        int label;

        public b(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i7) {
            ((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new b(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            final Activity current = a.this._applicationService.getCurrent();
            v vVar = v.f5219a;
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
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new com.onesignal.core.internal.permissions.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return vVar;
        }
    }

    public a(T1.f _applicationService, Y1.c _deviceService, com.onesignal.core.internal.config.c _configModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_deviceService, "_deviceService");
        i.e(_configModelStore, "_configModelStore");
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
            i.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            R0.d dVar = R0.d.f2063c;
            PendingIntent pendingIntent = null;
            Intent a7 = dVar.a(dVar.b(this._applicationService.getAppContext(), R0.e.f2064a), activity, null);
            if (a7 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, a7, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e4) {
            e4.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(InterfaceC0564d interfaceC0564d) {
        if (this._deviceService.isAndroidDeviceType() && isGooglePlayStoreInstalled() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getDisableGMSMissingPrompt() && !((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            O5.d dVar = F.f1027a;
            Object t6 = AbstractC0165z.t(o.f1618a, new b(null), interfaceC0564d);
            if (t6 == EnumC0580a.f5697f) {
                return t6;
            }
        }
        return v.f5219a;
    }
}
