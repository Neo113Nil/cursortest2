package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f40638a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40639b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f40640c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40641d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40642e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f40643f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f40644a;

        /* renamed from: b, reason: collision with root package name */
        private String f40645b;

        /* renamed from: c, reason: collision with root package name */
        private List f40646c;

        /* renamed from: d, reason: collision with root package name */
        private String f40647d;

        /* renamed from: e, reason: collision with root package name */
        private String f40648e;

        /* renamed from: f, reason: collision with root package name */
        private Map f40649f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f40644a, this.f40645b, (List) WrapUtils.getOrDefault(this.f40646c, new ArrayList()), this.f40647d, this.f40648e, (Map) WrapUtils.getOrDefault(this.f40649f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(String str) {
            this.f40644a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(String str) {
            this.f40645b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(String str) {
            this.f40647d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f40649f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f40646c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(String str) {
            this.f40648e = str;
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

    /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i4) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f40638a;
    }

    public String getMessage() {
        return this.f40639b;
    }

    public String getPlatform() {
        return this.f40641d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f40643f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f40640c;
    }

    public String getVirtualMachineVersion() {
        return this.f40642e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f40638a = str;
        this.f40639b = str2;
        this.f40640c = new ArrayList(list);
        this.f40641d = str3;
        this.f40642e = str4;
        this.f40643f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
