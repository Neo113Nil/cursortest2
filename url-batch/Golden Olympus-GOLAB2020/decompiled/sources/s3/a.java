package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String a(String applicationId, String libraryPackageName, String tracerSdkVersion) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        Intrinsics.checkNotNullParameter(tracerSdkVersion, "tracerSdkVersion");
        String str = "TracerSDK/" + tracerSdkVersion + " Lib/" + libraryPackageName + " App/" + applicationId + " " + b();
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    private static final String b() {
        String property = System.getProperty("http.agent");
        return property != null ? property : "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
    }
}
