package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class CreationOptions {
    public static final Companion Companion = new Companion(null);
    private final PlatformVideoFormat formatHint;
    private final Map<String, String> httpHeaders;
    private final String uri;
    private final String userAgent;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final CreationOptions fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            PlatformVideoFormat platformVideoFormat = (PlatformVideoFormat) list.get(1);
            Object obj = list.get(2);
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            return new CreationOptions(str, platformVideoFormat, (Map) obj, (String) list.get(3));
        }

        private Companion() {
        }
    }

    public CreationOptions(String uri, PlatformVideoFormat platformVideoFormat, Map<String, String> httpHeaders, String str) {
        i.e(uri, "uri");
        i.e(httpHeaders, "httpHeaders");
        this.uri = uri;
        this.formatHint = platformVideoFormat;
        this.httpHeaders = httpHeaders;
        this.userAgent = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreationOptions copy$default(CreationOptions creationOptions, String str, PlatformVideoFormat platformVideoFormat, Map map, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = creationOptions.uri;
        }
        if ((i4 & 2) != 0) {
            platformVideoFormat = creationOptions.formatHint;
        }
        if ((i4 & 4) != 0) {
            map = creationOptions.httpHeaders;
        }
        if ((i4 & 8) != 0) {
            str2 = creationOptions.userAgent;
        }
        return creationOptions.copy(str, platformVideoFormat, map, str2);
    }

    public final String component1() {
        return this.uri;
    }

    public final PlatformVideoFormat component2() {
        return this.formatHint;
    }

    public final Map<String, String> component3() {
        return this.httpHeaders;
    }

    public final String component4() {
        return this.userAgent;
    }

    public final CreationOptions copy(String uri, PlatformVideoFormat platformVideoFormat, Map<String, String> httpHeaders, String str) {
        i.e(uri, "uri");
        i.e(httpHeaders, "httpHeaders");
        return new CreationOptions(uri, platformVideoFormat, httpHeaders, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CreationOptions)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((CreationOptions) obj).toList());
    }

    public final PlatformVideoFormat getFormatHint() {
        return this.formatHint;
    }

    public final Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return j.W(this.uri, this.formatHint, this.httpHeaders, this.userAgent);
    }

    public String toString() {
        return "CreationOptions(uri=" + this.uri + ", formatHint=" + this.formatHint + ", httpHeaders=" + this.httpHeaders + ", userAgent=" + this.userAgent + ")";
    }

    public /* synthetic */ CreationOptions(String str, PlatformVideoFormat platformVideoFormat, Map map, String str2, int i4, e eVar) {
        this(str, (i4 & 2) != 0 ? null : platformVideoFormat, map, (i4 & 8) != 0 ? null : str2);
    }
}
