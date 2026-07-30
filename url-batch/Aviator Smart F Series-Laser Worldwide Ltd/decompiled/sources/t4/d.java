package t4;

import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d {
    private final String value;

    private /* synthetic */ d(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ d m1489boximpl(String str) {
        return new d(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m1491constructorimpl(String value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1492equalsimpl(String str, Object obj) {
        return (obj instanceof d) && s.areEqual(str, ((d) obj).m1496unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1493equalsimpl0(String str, String str2) {
        return s.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1494hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1495toStringimpl(String str) {
        return "DownloadFileDir(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m1492equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1494hashCodeimpl(this.value);
    }

    public String toString() {
        return m1495toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1496unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m1490constructorimpl(File fileDir) {
        s.checkNotNullParameter(fileDir, "fileDir");
        String absolutePath = fileDir.getAbsolutePath();
        s.checkNotNullExpressionValue(absolutePath, "fileDir.absolutePath");
        return m1491constructorimpl(absolutePath);
    }
}
