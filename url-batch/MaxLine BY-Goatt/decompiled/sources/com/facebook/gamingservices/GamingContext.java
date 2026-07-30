package com.facebook.gamingservices;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import defpackage.in1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GamingContext {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_TIMEOUT = 5;
    private static GamingContext currentContext;
    private final String contextID;

    public GamingContext(String str) {
        str.getClass();
        this.contextID = str;
    }

    public static /* synthetic */ GamingContext copy$default(GamingContext gamingContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamingContext.contextID;
        }
        return gamingContext.copy(str);
    }

    public static final GamingContext getCurrentGamingContext() {
        return Companion.getCurrentGamingContext();
    }

    public static final void setCurrentGamingContext(GamingContext gamingContext) {
        Companion.setCurrentGamingContext(gamingContext);
    }

    public final String component1() {
        return this.contextID;
    }

    public final GamingContext copy(String str) {
        str.getClass();
        return new GamingContext(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GamingContext) && Intrinsics.b(this.contextID, ((GamingContext) obj).contextID);
    }

    public final String getContextID() {
        return this.contextID;
    }

    public int hashCode() {
        return this.contextID.hashCode();
    }

    public String toString() {
        return in1.m(new StringBuilder("GamingContext(contextID="), this.contextID, ')');
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GamingContext getCurrentGamingContext() {
            JSONObject jSONObject;
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                return GamingContext.currentContext;
            }
            GraphResponse executeAndWait = DaemonRequest.executeAndWait(FacebookSdk.getApplicationContext(), null, SDKMessageEnum.CONTEXT_GET_ID, 5);
            String string = (executeAndWait == null || (jSONObject = executeAndWait.getJSONObject()) == null) ? null : jSONObject.getString("id");
            if (string == null) {
                return null;
            }
            return new GamingContext(string);
        }

        public final void setCurrentGamingContext(GamingContext gamingContext) {
            gamingContext.getClass();
            if (CloudGameLoginHandler.isRunningInCloud()) {
                return;
            }
            GamingContext.currentContext = gamingContext;
        }

        private Companion() {
        }
    }
}
