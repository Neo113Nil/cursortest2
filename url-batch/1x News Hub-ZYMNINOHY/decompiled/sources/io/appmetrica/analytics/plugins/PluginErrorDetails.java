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
    private final String f8929a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8930b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f8931c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8932d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8933e;
    private final Map f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8934a;

        /* renamed from: b, reason: collision with root package name */
        private String f8935b;

        /* renamed from: c, reason: collision with root package name */
        private List f8936c;

        /* renamed from: d, reason: collision with root package name */
        private String f8937d;

        /* renamed from: e, reason: collision with root package name */
        private String f8938e;
        private Map f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f8934a, this.f8935b, (List) WrapUtils.getOrDefault(this.f8936c, new ArrayList()), this.f8937d, this.f8938e, (Map) WrapUtils.getOrDefault(this.f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f8934a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f8935b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f8937d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f8936c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f8938e = str;
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

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i3) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f8929a;
    }

    public String getMessage() {
        return this.f8930b;
    }

    public String getPlatform() {
        return this.f8932d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f8931c;
    }

    public String getVirtualMachineVersion() {
        return this.f8933e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f8929a = str;
        this.f8930b = str2;
        this.f8931c = new ArrayList(list);
        this.f8932d = str3;
        this.f8933e = str4;
        this.f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
