package com.onesignal.inAppMessages.internal.preview;

import Q2.d;
import Q2.e;
import T1.f;
import android.app.Activity;
import g2.InterfaceC0391a;
import kotlin.jvm.internal.i;
import o2.InterfaceC0558a;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import v2.C0705a;

/* loaded from: classes.dex */
public final class a implements com.onesignal.core.internal.startup.a, U2.a {
    private final f _applicationService;
    private final InterfaceC0558a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final S2.b _notificationDisplayer;
    private final U2.b _notificationLifeCycle;
    private final C0705a _state;
    private final InterfaceC0391a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0039a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0039a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(InterfaceC0558a _iamDisplayer, f _applicationService, S2.b _notificationDisplayer, com.onesignal.notifications.internal.a _notificationActivityOpener, U2.b _notificationLifeCycle, C0705a _state, InterfaceC0391a _time) {
        i.e(_iamDisplayer, "_iamDisplayer");
        i.e(_applicationService, "_applicationService");
        i.e(_notificationDisplayer, "_notificationDisplayer");
        i.e(_notificationActivityOpener, "_notificationActivityOpener");
        i.e(_notificationLifeCycle, "_notificationLifeCycle");
        i.e(_state, "_state");
        i.e(_time, "_time");
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
            if (customJSONObject.has(N2.a.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(N2.a.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
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
    @Override // U2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
        C0039a c0039a;
        int i7;
        String inAppPreviewPushUUID;
        a aVar;
        if (interfaceC0564d instanceof C0039a) {
            c0039a = (C0039a) interfaceC0564d;
            int i8 = c0039a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0039a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0039a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0039a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar2 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    i.d(put, "put(...)");
                    c0039a.L$0 = this;
                    c0039a.L$1 = inAppPreviewPushUUID;
                    c0039a.label = 1;
                    if (aVar2.openDestinationActivity(activity, put, c0039a) != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0039a.L$0;
                    AbstractC0676f.w(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0039a.L$1;
                a aVar3 = (a) c0039a.L$0;
                AbstractC0676f.w(obj);
                inAppPreviewPushUUID = str;
                aVar = aVar3;
                aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                InterfaceC0558a interfaceC0558a = aVar._iamDisplayer;
                c0039a.L$0 = aVar;
                c0039a.L$1 = null;
                c0039a.label = 2;
                obj = interfaceC0558a.displayPreviewMessage(inAppPreviewPushUUID, c0039a);
            }
        }
        c0039a = new C0039a(interfaceC0564d);
        Object obj2 = c0039a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0039a.label;
        if (i7 != 0) {
        }
        aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        InterfaceC0558a interfaceC0558a2 = aVar._iamDisplayer;
        c0039a.L$0 = aVar;
        c0039a.L$1 = null;
        c0039a.label = 2;
        obj2 = interfaceC0558a2.displayPreviewMessage(inAppPreviewPushUUID, c0039a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // U2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        a aVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        InterfaceC0558a interfaceC0558a = this._iamDisplayer;
                        bVar.L$0 = this;
                        bVar.label = 1;
                        obj = interfaceC0558a.displayPreviewMessage(inAppPreviewPushUUID, bVar);
                        if (obj != enumC0580a) {
                            aVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        d dVar = new d(jSONObject, this._time);
                        S2.b bVar2 = this._notificationDisplayer;
                        bVar.label = 2;
                    }
                    return enumC0580a;
                }
                if (i7 == 1) {
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        return Boolean.FALSE;
    }
}
