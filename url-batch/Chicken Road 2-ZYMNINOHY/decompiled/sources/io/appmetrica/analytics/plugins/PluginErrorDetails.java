package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f13349a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13350b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f13351c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13352d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13353e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f13354f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f13355a;

        /* renamed from: b, reason: collision with root package name */
        private String f13356b;

        /* renamed from: c, reason: collision with root package name */
        private List f13357c;

        /* renamed from: d, reason: collision with root package name */
        private String f13358d;

        /* renamed from: e, reason: collision with root package name */
        private String f13359e;

        /* renamed from: f, reason: collision with root package name */
        private Map f13360f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f13355a, this.f13356b, (List) WrapUtils.getOrDefault(this.f13357c, new ArrayList()), this.f13358d, this.f13359e, (Map) WrapUtils.getOrDefault(this.f13360f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f13355a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f13356b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f13358d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f13360f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f13357c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f13359e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i4) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f13349a;
    }

    public String getMessage() {
        return this.f13350b;
    }

    public String getPlatform() {
        return this.f13352d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f13354f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f13351c;
    }

    public String getVirtualMachineVersion() {
        return this.f13353e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f13349a = str;
        this.f13350b = str2;
        this.f13351c = new ArrayList(list);
        this.f13352d = str3;
        this.f13353e = str4;
        this.f13354f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
