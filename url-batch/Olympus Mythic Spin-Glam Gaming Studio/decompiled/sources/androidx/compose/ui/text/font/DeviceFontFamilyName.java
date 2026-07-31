package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceFontFamilyNameFont.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceFontFamilyName {
    private final String name;

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2282equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && Intrinsics.areEqual(str, ((DeviceFontFamilyName) obj).getName());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2283equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2284hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2285toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m2282equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m2284hashCodeimpl(this.name);
    }

    public String toString() {
        return m2285toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getName() {
        return this.name;
    }
}
