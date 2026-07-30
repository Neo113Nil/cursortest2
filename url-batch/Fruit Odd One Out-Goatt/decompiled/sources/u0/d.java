package u0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static String G(Iterable iterable, int i2) {
        String str = (i2 & 2) != 0 ? "" : "WindowLayoutInfo{ DisplayFeatures[";
        String str2 = (i2 & 4) == 0 ? "] }" : "";
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) ", ");
            }
            if (next != null ? next instanceof CharSequence : true) {
                sb.append((CharSequence) next);
            } else if (next instanceof Character) {
                sb.append(((Character) next).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(next));
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }
}
