package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1kSDK;", "", "", "p0", "", "AFKeystoreWrapper", "(Ljava/lang/String;)Z", "p1", "", "AFInAppEventType", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "AFInAppEventParameterName", "Ljava/util/Map;", "values", "Lcom/appsflyer/internal/AFc1qSDK;", "Lcom/appsflyer/internal/AFc1qSDK;", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1qSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFc1kSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public final Map<String, Object> values;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final AFc1qSDK AFKeystoreWrapper;

    public /* synthetic */ AFc1kSDK(Map map, AFc1qSDK aFc1qSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1qSDK);
    }

    @JvmStatic
    public static final AFc1kSDK AFInAppEventParameterName(AFa1rSDK aFa1rSDK) {
        return Companion.AFInAppEventParameterName(aFa1rSDK);
    }

    @JvmStatic
    public static final AFc1kSDK AFInAppEventType(AFc1qSDK aFc1qSDK) {
        return Companion.AFInAppEventParameterName(aFc1qSDK);
    }

    private AFc1kSDK(Map<String, Object> map, AFc1qSDK aFc1qSDK) {
        this.values = map;
        this.AFKeystoreWrapper = aFc1qSDK;
    }

    /* synthetic */ AFc1kSDK(Map map, AFc1qSDK aFc1qSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1qSDK);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFc1kSDK$AFa1ySDK;", "", "Lcom/appsflyer/internal/AFa1rSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFa1rSDK;)Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFc1qSDK;", "(Lcom/appsflyer/internal/AFc1qSDK;)Lcom/appsflyer/internal/AFc1kSDK;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1kSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static AFc1kSDK AFInAppEventParameterName(AFa1rSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> AFKeystoreWrapper = p0.AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            return new AFc1kSDK(AFKeystoreWrapper, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public static AFc1kSDK AFInAppEventParameterName(AFc1qSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AFc1kSDK(new LinkedHashMap(), p0, null);
        }
    }

    public final void AFInAppEventType(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.values.put(p0, p1);
        AFc1qSDK aFc1qSDK = this.AFKeystoreWrapper;
        if (aFc1qSDK != null) {
            aFc1qSDK.AFInAppEventType(this.values);
        }
    }

    public final boolean AFKeystoreWrapper(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.values.containsKey(p0);
    }
}
