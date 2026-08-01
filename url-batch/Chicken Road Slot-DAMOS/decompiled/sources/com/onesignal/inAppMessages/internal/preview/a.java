package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import bc.d;
import bc.e;
import ea.f;
import kotlin.collections.i0;
import nd.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ra.a, fc.a {
    private final f _applicationService;
    private final za.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final dc.b _notificationDisplayer;
    private final fc.b _notificationLifeCycle;
    private final gb.a _state;
    private final sa.a _time;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0032a extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0032a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(za.a aVar, f fVar, dc.b bVar, com.onesignal.notifications.internal.a aVar2, fc.b bVar2, gb.a aVar3, sa.a aVar4) {
        aVar.getClass();
        fVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this._iamDisplayer = aVar;
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._notificationActivityOpener = aVar2;
        this._notificationLifeCycle = bVar2;
        this._state = aVar3;
        this._time = aVar4;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(yb.a.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(yb.a.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // ra.a
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // fc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, ld.a aVar) {
        C0032a c0032a;
        int i3;
        String inAppPreviewPushUUID;
        a aVar2;
        if (aVar instanceof C0032a) {
            c0032a = (C0032a) aVar;
            int i10 = c0032a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0032a.label = i10 - Integer.MIN_VALUE;
                Object obj = c0032a.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0032a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar4 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    put.getClass();
                    c0032a.L$0 = this;
                    c0032a.L$1 = inAppPreviewPushUUID;
                    c0032a.label = 1;
                    if (aVar4.openDestinationActivity(activity, put, c0032a) != aVar3) {
                        aVar2 = this;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) c0032a.L$0;
                    cf.c.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar2._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0032a.L$1;
                a aVar5 = (a) c0032a.L$0;
                cf.c.M(obj);
                inAppPreviewPushUUID = str;
                aVar2 = aVar5;
                aVar2._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                za.a aVar6 = aVar2._iamDisplayer;
                c0032a.L$0 = aVar2;
                c0032a.L$1 = null;
                c0032a.label = 2;
                obj = aVar6.displayPreviewMessage(inAppPreviewPushUUID, c0032a);
            }
        }
        c0032a = new C0032a(aVar);
        Object obj2 = c0032a.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0032a.label;
        if (i3 != 0) {
        }
        aVar2._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        za.a aVar62 = aVar2._iamDisplayer;
        c0032a.L$0 = aVar2;
        c0032a.L$1 = null;
        c0032a.label = 2;
        obj2 = aVar62.displayPreviewMessage(inAppPreviewPushUUID, c0032a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // fc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, ld.a aVar) {
        b bVar;
        int i3;
        a aVar2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        za.a aVar4 = this._iamDisplayer;
                        bVar.L$0 = this;
                        bVar.label = 1;
                        obj = aVar4.displayPreviewMessage(inAppPreviewPushUUID, bVar);
                        if (obj != aVar3) {
                            aVar2 = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        d dVar = new d(jSONObject, this._time);
                        dc.b bVar2 = this._notificationDisplayer;
                        bVar.label = 2;
                    }
                    return aVar3;
                }
                if (i3 == 1) {
                    aVar2 = (a) bVar.L$0;
                    cf.c.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar2._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        return Boolean.FALSE;
    }
}
