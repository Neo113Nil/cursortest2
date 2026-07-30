package com.onesignal.inAppMessages.internal.preview;

import X5.c;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C0827a;
import s3.d;
import s3.e;
import u3.InterfaceC0946b;
import v2.f;
import w3.InterfaceC0991a;

/* loaded from: classes.dex */
public final class a implements com.onesignal.core.internal.startup.a, InterfaceC0991a {
    private final f _applicationService;
    private final Q2.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final InterfaceC0946b _notificationDisplayer;
    private final w3.b _notificationLifeCycle;
    private final X2.a _state;
    private final I2.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0039a extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0039a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class b extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(Q2.a _iamDisplayer, f _applicationService, InterfaceC0946b _notificationDisplayer, com.onesignal.notifications.internal.a _notificationActivityOpener, w3.b _notificationLifeCycle, X2.a _state, I2.a _time) {
        Intrinsics.checkNotNullParameter(_iamDisplayer, "_iamDisplayer");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationActivityOpener, "_notificationActivityOpener");
        Intrinsics.checkNotNullParameter(_notificationLifeCycle, "_notificationLifeCycle");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(C0827a.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(C0827a.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w3.InterfaceC0991a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, V5.b bVar) {
        C0039a c0039a;
        int i2;
        String inAppPreviewPushUUID;
        a aVar;
        if (bVar instanceof C0039a) {
            c0039a = (C0039a) bVar;
            int i5 = c0039a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0039a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0039a.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0039a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar3 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    c0039a.L$0 = this;
                    c0039a.L$1 = inAppPreviewPushUUID;
                    c0039a.label = 1;
                    if (aVar3.openDestinationActivity(activity, put, c0039a) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0039a.L$0;
                    V6.b.P(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0039a.L$1;
                a aVar4 = (a) c0039a.L$0;
                V6.b.P(obj);
                inAppPreviewPushUUID = str;
                aVar = aVar4;
                aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                Q2.a aVar5 = aVar._iamDisplayer;
                c0039a.L$0 = aVar;
                c0039a.L$1 = null;
                c0039a.label = 2;
                obj = aVar5.displayPreviewMessage(inAppPreviewPushUUID, c0039a);
            }
        }
        c0039a = new C0039a(bVar);
        Object obj2 = c0039a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0039a.label;
        if (i2 != 0) {
        }
        aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        Q2.a aVar52 = aVar._iamDisplayer;
        c0039a.L$0 = aVar;
        c0039a.L$1 = null;
        c0039a.label = 2;
        obj2 = aVar52.displayPreviewMessage(inAppPreviewPushUUID, c0039a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // w3.InterfaceC0991a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, V5.b bVar) {
        b bVar2;
        int i2;
        a aVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        Q2.a aVar3 = this._iamDisplayer;
                        bVar2.L$0 = this;
                        bVar2.label = 1;
                        obj = aVar3.displayPreviewMessage(inAppPreviewPushUUID, bVar2);
                        if (obj != aVar2) {
                            aVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        d dVar = new d(jSONObject, this._time);
                        InterfaceC0946b interfaceC0946b = this._notificationDisplayer;
                        bVar2.label = 2;
                    }
                    return aVar2;
                }
                if (i2 == 1) {
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        return Boolean.FALSE;
    }
}
