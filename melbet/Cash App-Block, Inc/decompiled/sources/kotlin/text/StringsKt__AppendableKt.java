package kotlin.text;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class StringsKt__AppendableKt {
    public static void appendElement(Appendable appendable, Object obj, Function1 function1) {
        appendable.getClass();
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
