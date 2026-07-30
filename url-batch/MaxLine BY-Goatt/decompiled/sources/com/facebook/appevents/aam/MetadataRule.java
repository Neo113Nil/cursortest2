package com.facebook.appevents.aam;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.up2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MetadataRule {
    private static final String FIELD_K = "k";
    private static final String FIELD_K_DELIMITER = ",";
    private static final String FIELD_V = "v";
    private final List<String> keyRules;
    private final String name;
    private final String valRule;
    public static final Companion Companion = new Companion(null);
    private static final Set<MetadataRule> rules = new CopyOnWriteArraySet();

    private MetadataRule(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }

    public static final /* synthetic */ Set access$getRules$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return rules;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    public static final Set<String> getEnabledRuleNames() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return Companion.getEnabledRuleNames();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    public static final Set<MetadataRule> getRules() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return Companion.getRules();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    public static final void updateRules(String str) {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return;
        }
        try {
            Companion.updateRules(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
        }
    }

    public final List<String> getKeyRules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getValRule() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void constructRules(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(MetadataRule.FIELD_K);
                    String optString2 = optJSONObject.optString(MetadataRule.FIELD_V);
                    optString.getClass();
                    if (optString.length() != 0) {
                        Set access$getRules$cp = MetadataRule.access$getRules$cp();
                        next.getClass();
                        List F = up2.F(0, 6, optString, new String[]{MetadataRule.FIELD_K_DELIMITER});
                        optString2.getClass();
                        access$getRules$cp.add(new MetadataRule(next, F, optString2, null));
                    }
                }
            }
        }

        public final Set<String> getEnabledRuleNames() {
            HashSet hashSet = new HashSet();
            Iterator it = MetadataRule.access$getRules$cp().iterator();
            while (it.hasNext()) {
                hashSet.add(((MetadataRule) it.next()).getName());
            }
            return hashSet;
        }

        public final Set<MetadataRule> getRules() {
            return new HashSet(MetadataRule.access$getRules$cp());
        }

        public final void updateRules(String str) {
            str.getClass();
            try {
                MetadataRule.access$getRules$cp().clear();
                constructRules(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetadataRule(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }
}
