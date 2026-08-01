package z2;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, Function1 function1, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
