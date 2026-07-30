package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.Logger;
import defpackage.s03;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEvent implements Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;
    private final JSONObject operationalJsonObject;
    public static final Companion Companion = new Companion(null);
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, OperationalData operationalData) {
        JSONObject json;
        str.getClass();
        str2.getClass();
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.operationalJsonObject = (operationalData == null || (json = operationalData.toJSON()) == null) ? new JSONObject() : json;
        this.jsonObject = getJSONObjectForAppEvent(str, str2, d, bundle, uuid);
    }

    private final JSONObject getJSONObjectForAppEvent(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        Companion.validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        String processEvent = RestrictiveDataManager.processEvent(str2);
        if (Intrinsics.b(processEvent, str2)) {
            processEvent = RedactedEventsManager.processEventsRedaction(str2);
        }
        jSONObject.put(Constants.EVENT_NAME_EVENT_KEY, processEvent);
        jSONObject.put(Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map validateParameters$default = validateParameters$default(this, bundle, false, 2, null);
            for (String str3 : validateParameters$default.keySet()) {
                jSONObject.put(str3, validateParameters$default.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            return jSONObject;
        }
        Logger.Companion companion = Logger.Companion;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        companion.log(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Companion companion = Companion;
            str.getClass();
            companion.validateIdentifier(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            hashMap.put(str, obj.toString());
        }
        if (!z) {
            IntegrityManager.processParameters(hashMap);
            RestrictiveDataManager.processParameters(s03.e(hashMap), this.name);
            EventDeactivationManager.processDeprecatedParameters(s03.e(hashMap), this.name);
        }
        return hashMap;
    }

    public static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appEvent.validateParameters(bundle, z);
    }

    private final Object writeReplace() {
        String jSONObject = this.jsonObject.toString();
        jSONObject.getClass();
        String jSONObject2 = this.operationalJsonObject.toString();
        jSONObject2.getClass();
        return new SerializationProxyV2(jSONObject, jSONObject2, this.isImplicit, this.inBackground);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getOperationalJSONObject(OperationalDataEnum operationalDataEnum) {
        operationalDataEnum.getClass();
        return this.operationalJsonObject.optJSONObject(operationalDataEnum.getValue());
    }

    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class SerializationProxyV2 implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 20160803001L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;
        private final String operationalJsonString;

        public SerializationProxyV2(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.jsonString = str;
            this.operationalJsonString = str2;
            this.isImplicit = z;
            this.inBackground = z2;
        }

        private final Object readResolve() {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, null);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void validateIdentifier(String str) {
            boolean contains;
            str.getClass();
            if (str.length() == 0 || str.length() > 40) {
                throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                contains = AppEvent.validatedIdentifiers.contains(str);
                Unit unit = Unit.a;
            }
            if (contains) {
                return;
            }
            if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                AppEvent.validatedIdentifiers.add(str);
            }
        }

        private Companion() {
        }
    }

    public final JSONObject getOperationalJSONObject() {
        return this.operationalJsonObject;
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, OperationalData operationalData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, bundle, z, z2, uuid, (i & 128) != 0 ? null : operationalData);
    }

    public /* synthetic */ AppEvent(String str, String str2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2);
    }

    private AppEvent(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z;
        String optString = jSONObject.optString(Constants.EVENT_NAME_EVENT_KEY);
        optString.getClass();
        this.name = optString;
        this.inBackground = z2;
    }
}
