package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class RenderingUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (java.lang.Character.isJavaIdentifierStart(r0.codePointAt(0)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String render(Name name, boolean z) {
        name.getClass();
        String asStringStripSpecialMarkers = z ? name.asStringStripSpecialMarkers() : name.asString();
        asStringStripSpecialMarkers.getClass();
        if (!z || !name.isSpecial()) {
            if (!KeywordStringsGenerated.KEYWORDS.contains(asStringStripSpecialMarkers)) {
                int i = 0;
                while (true) {
                    if (i < asStringStripSpecialMarkers.length()) {
                        char charAt = asStringStripSpecialMarkers.charAt(i);
                        if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                            break;
                        }
                        i++;
                    } else if (asStringStripSpecialMarkers.length() != 0) {
                    }
                }
            }
            return "`".concat(asStringStripSpecialMarkers).concat("`");
        }
        return asStringStripSpecialMarkers;
    }

    public static /* synthetic */ String render$default(Name name, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return render(name, z);
    }

    public static final String renderFlexibleMutabilityOrArrayElementVarianceType(String str, String str2, Function0<String> function0, Function0<String> function02, Function1<? super String, String> function1) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        String str3 = (String) function0.invoke();
        String replacePrefixesInTypeRepresentations = replacePrefixesInTypeRepresentations(str, Recorder$$ExternalSyntheticOutline2.m$1(str3, "Mutable"), str2, str3, Recorder$$ExternalSyntheticOutline2.m$1(str3, "(Mutable)"));
        if (replacePrefixesInTypeRepresentations != null) {
            return replacePrefixesInTypeRepresentations;
        }
        String replacePrefixesInTypeRepresentations2 = replacePrefixesInTypeRepresentations(str, Recorder$$ExternalSyntheticOutline2.m$1(str3, "MutableMap.MutableEntry"), str2, Recorder$$ExternalSyntheticOutline2.m$1(str3, "Map.Entry"), Recorder$$ExternalSyntheticOutline2.m$1(str3, "(Mutable)Map.(Mutable)Entry"));
        if (replacePrefixesInTypeRepresentations2 != null) {
            return replacePrefixesInTypeRepresentations2;
        }
        String str4 = (String) function02.invoke();
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str4);
        m.append((String) function1.invoke("Array<"));
        String sb = m.toString();
        StringBuilder m2 = Boxes$$ExternalSyntheticOutline1.m(str4);
        m2.append((String) function1.invoke("Array<out "));
        String sb2 = m2.toString();
        StringBuilder m3 = Boxes$$ExternalSyntheticOutline1.m(str4);
        m3.append((String) function1.invoke("Array<(out) "));
        String replacePrefixesInTypeRepresentations3 = replacePrefixesInTypeRepresentations(str, sb, str2, sb2, m3.toString());
        if (replacePrefixesInTypeRepresentations3 != null) {
            return replacePrefixesInTypeRepresentations3;
        }
        return null;
    }

    public static /* synthetic */ String renderFlexibleMutabilityOrArrayElementVarianceType$default(String str, String str2, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = RenderingUtilsKt$$Lambda$0.INSTANCE;
        }
        return renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, function0, function02, function1);
    }

    public static final String renderFqName(List<Name> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render$default(name, false, 1, null));
        }
        return sb.toString();
    }

    public static final String replacePrefixesInTypeRepresentations(String str, String str2, String str3, String str4, String str5) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        if (!StringsKt__StringsJVMKt.startsWith(str, str2, false) || !StringsKt__StringsJVMKt.startsWith(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        String substring2 = str3.substring(str4.length());
        String concat = str5.concat(substring);
        if (substring.equals(substring2)) {
            return concat;
        }
        if (typeStringsDifferOnlyInNullability(substring, substring2)) {
            return concat.concat("!");
        }
        return null;
    }

    public static final boolean typeStringsDifferOnlyInNullability(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(StringsKt__StringsJVMKt.replace$default(str2, "?", ""))) {
            return true;
        }
        if (StringsKt__StringsJVMKt.endsWith(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return renderFqName(fqNameUnsafe.pathSegments());
    }
}
