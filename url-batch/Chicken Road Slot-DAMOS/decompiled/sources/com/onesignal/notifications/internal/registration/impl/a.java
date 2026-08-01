package com.onesignal.notifications.internal.registration.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import ge.a0;
import ge.k0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.o;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final C0060a Companion = new C0060a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final ea.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ja.c _deviceService;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        int label;

        public b(ld.a aVar) {
            super(2, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, DialogInterface dialogInterface, int i3) {
            ((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            final Activity current = a.this._applicationService.getCurrent();
            if (current == null) {
                return Unit.f5554a;
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
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    a.access$openPlayStoreToApp(a.this, current);
                }
            }).setNegativeButton(resourceString3, new pa.a(2, a.this)).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
            return Unit.f5554a;
        }
    }

    public a(ea.f fVar, ja.c cVar, com.onesignal.core.internal.config.b bVar) {
        fVar.getClass();
        cVar.getClass();
        bVar.getClass();
        this._applicationService = fVar;
        this._deviceService = cVar;
        this._configModelStore = bVar;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(a aVar, Activity activity) {
        aVar.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager).getClass();
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            z6.f fVar = z6.f.f10879e;
            PendingIntent pendingIntent = null;
            Intent a9 = fVar.a(fVar.b(this._applicationService.getAppContext(), z6.g.f10881a), activity, null);
            if (a9 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, a9, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e2) {
            e2.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(ld.a aVar) {
        if (!this._deviceService.isAndroidDeviceType()) {
            return Unit.f5554a;
        }
        if (!isGooglePlayStoreInstalled() || ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getDisableGMSMissingPrompt() || ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            return Unit.f5554a;
        }
        ne.e eVar = k0.f4372a;
        Object B = a0.B(o.f5995a, new b(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0060a {
        public /* synthetic */ C0060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0060a() {
        }
    }
}
