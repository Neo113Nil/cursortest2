package okhttp3;

import bo.app.re$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class MediaType {
    public final String mediaType;
    public final String[] parameterNamesAndValues;
    public final String subtype;

    /* renamed from: type, reason: collision with root package name */
    public final String f1545type;
    public static final Regex TYPE_SUBTYPE = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex PARAMETER = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public MediaType(String str, String str2, String str3, String[] strArr) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        strArr.getClass();
        this.mediaType = str;
        this.f1545type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset charset$default(MediaType mediaType) {
        String str;
        String[] strArr = mediaType.parameterNamesAndValues;
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (!StringsKt__StringsJVMKt.equals(strArr[i], "charset", true)) {
                if (i != progressionLastElement) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return null;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.areEqual(((MediaType) obj).mediaType, this.mediaType);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String toString() {
        return this.mediaType;
    }
}
