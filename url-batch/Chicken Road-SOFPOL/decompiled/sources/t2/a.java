package t2;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, a4.a aVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            aVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (aVar != null) {
                sb.append((CharSequence) aVar.i(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
