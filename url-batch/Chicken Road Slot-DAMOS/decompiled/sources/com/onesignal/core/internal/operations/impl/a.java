package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.modeling.k;
import com.onesignal.user.internal.operations.impl.executors.e;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import java.util.Set;
import kotlin.collections.w;
import org.json.JSONObject;
import zc.d;
import zc.f;
import zc.h;
import zc.i;
import zc.j;
import zc.m;
import zc.o;
import zc.p;
import zc.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qa.b bVar) {
        super("operations", bVar);
        bVar.getClass();
    }

    private final boolean isValidOperation(JSONObject jSONObject) {
        if (!jSONObject.has("name")) {
            com.onesignal.debug.internal.logging.b.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jSONObject.getString("name");
        Set x10 = w.x(new String[]{g.LOGIN_USER, e.LOGIN_USER_FROM_SUBSCRIPTION_USER});
        if (jSONObject.has("onesignalId") || x10.contains(string)) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.error$default(string + " jsonObject must have 'onesignalId' attribute", null, 2, null);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public na.g create(JSONObject jSONObject) {
        na.g bVar;
        if (jSONObject == null) {
            com.onesignal.debug.internal.logging.b.error$default("null jsonObject sent to OperationModelStore.create", null, 2, null);
            return null;
        }
        if (!isValidOperation(jSONObject)) {
            return null;
        }
        String string = jSONObject.getString("name");
        if (string != null) {
            switch (string.hashCode()) {
                case -1865677906:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.c.DELETE_ALIAS)) {
                        bVar = new zc.b();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1793763409:
                    if (string.equals(g.LOGIN_USER)) {
                        bVar = new f();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1606689981:
                    if (string.equals(n.TRACK_PURCHASE)) {
                        bVar = new m();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1188793632:
                    if (string.equals(n.SET_PROPERTY)) {
                        bVar = new j();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1080179201:
                    if (string.equals(l.DELETE_SUBSCRIPTION)) {
                        bVar = new zc.c();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -828599391:
                    if (string.equals(l.UPDATE_SUBSCRIPTION)) {
                        bVar = new q();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -713885378:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.CUSTOM_EVENT)) {
                        bVar = new zc.l();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -516221659:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.c.SET_ALIAS)) {
                        bVar = new i();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -92337283:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.REFRESH_USER)) {
                        bVar = new h();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 532599746:
                    if (string.equals(e.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        bVar = new zc.e();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 846157390:
                    if (string.equals(l.CREATE_SUBSCRIPTION)) {
                        bVar = new zc.a();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1707031487:
                    if (string.equals(l.TRANSFER_SUBSCRIPTION)) {
                        bVar = new p();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1763437688:
                    if (string.equals(n.DELETE_TAG)) {
                        bVar = new d();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1852485538:
                    if (string.equals(n.TRACK_SESSION_END)) {
                        bVar = new zc.n();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1983836079:
                    if (string.equals(n.SET_TAG)) {
                        bVar = new zc.k();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 2135250281:
                    if (string.equals(n.TRACK_SESSION_START)) {
                        bVar = new o();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
            }
        }
        throw new Exception(v4.a.k("Unrecognized operation: ", string));
    }

    public final void loadOperations() {
        load();
    }
}
