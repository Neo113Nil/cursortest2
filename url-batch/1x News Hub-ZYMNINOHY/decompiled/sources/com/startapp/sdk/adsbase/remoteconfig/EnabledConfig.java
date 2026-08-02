package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.e3;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EnabledConfig implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f3405a = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
    private static final long serialVersionUID = 3477168612652239188L;
    private double chance;
    private String from;
    private String till;

    public static class Parser implements TypeParser<EnabledConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public EnabledConfig parse(Class<EnabledConfig> cls, Object obj) {
            if (obj instanceof Boolean) {
                return new EnabledConfig(Boolean.TRUE.equals(obj) ? 1.0d : 0.0d);
            }
            if (obj instanceof String) {
                return new EnabledConfig(Boolean.parseBoolean((String) obj) ? 1.0d : 0.0d);
            }
            if (obj instanceof Number) {
                return new EnabledConfig(((Number) obj).doubleValue());
            }
            if (obj instanceof JSONObject) {
                return (EnabledConfig) JsonParser.fromJsonObject((JSONObject) obj, cls);
            }
            return null;
        }
    }

    public EnabledConfig() {
        this.chance = 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r0.getTime() < r7.a()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0017, code lost:
    
        if (r7.a() < r0.getTime()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(e3 e3Var) {
        String str = this.from;
        if (str != null) {
            try {
                Date parse = f3405a.parse(str);
                if (parse != null) {
                }
            } catch (Throwable unused) {
            }
        }
        String str2 = this.till;
        if (str2 != null) {
            try {
                Date parse2 = f3405a.parse(str2);
                if (parse2 != null) {
                }
            } catch (Throwable unused2) {
            }
        }
        return si.a(this.chance);
        return false;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EnabledConfig enabledConfig = (EnabledConfig) obj;
            if (Double.compare(this.chance, enabledConfig.chance) == 0 && si.a((Object) this.from, (Object) enabledConfig.from) && si.a((Object) this.till, (Object) enabledConfig.till)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.chance), this.from, this.till};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public EnabledConfig(double d3) {
        this.chance = d3;
    }
}
