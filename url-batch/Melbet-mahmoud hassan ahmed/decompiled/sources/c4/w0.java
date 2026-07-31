package c4;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2135a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2136b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2137c = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2139e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2140f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2141g = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2143i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2144j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2145k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2146l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f2147m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f2148n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f2149o = 7;

    /* renamed from: p, reason: collision with root package name */
    public static final int f2150p = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ int[] f2138d = {1, 2, 3};

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ int[] f2142h = {1, 2, 3};

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ int[] f2151q = {1, 2, 3, 4, 5, 6, 7, 8};

    public static int a(JsonReader jsonReader) {
        String nextString;
        nextString = jsonReader.nextString();
        nextString.hashCode();
        switch (nextString) {
            case "CLEAR":
                return f2141g;
            case "WRITE":
                return f2140f;
            case "UNKNOWN_ACTION_TYPE":
                return f2139e;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
        }
    }

    public static void b(int i7, JsonWriter jsonWriter) {
        String str;
        if (i7 == 0) {
            throw null;
        }
        int i8 = s0.f2097a[i7 - 1];
        if (i8 == 1) {
            str = "UNKNOWN";
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                jsonWriter.value("IOS");
                return;
            }
            str = "ANDROID";
        }
        jsonWriter.value(str);
    }

    public static int[] c() {
        return (int[]) f2138d.clone();
    }

    public static int d(JsonReader jsonReader) {
        String nextString;
        nextString = jsonReader.nextString();
        nextString.hashCode();
        switch (nextString) {
            case "CONSENT_SIGNAL_COLLECT_CONSENT":
                return f2147m;
            case "CONSENT_SIGNAL_ERROR":
                return f2149o;
            case "CONSENT_SIGNAL_UNKNOWN":
                return f2143i;
            case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                return f2145k;
            case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                return f2150p;
            case "CONSENT_SIGNAL_SUFFICIENT":
                return f2146l;
            case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                return f2144j;
            case "CONSENT_SIGNAL_NOT_REQUIRED":
                return f2148n;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
        }
    }

    public static int[] e() {
        return (int[]) f2142h.clone();
    }

    public static int[] f() {
        return (int[]) f2151q.clone();
    }
}
