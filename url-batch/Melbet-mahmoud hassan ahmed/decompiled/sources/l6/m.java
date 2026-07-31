package l6;

import java.util.Collection;
import java.util.Iterator;
import w5.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends l {
    public static final boolean j(String str, String str2, boolean z6) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "suffix");
        return !z6 ? str.endsWith(str2) : m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return j(str, str2, z6);
    }

    public static boolean l(CharSequence charSequence) {
        boolean z6;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable t6 = n.t(charSequence);
            if (!(t6 instanceof Collection) || !((Collection) t6).isEmpty()) {
                Iterator it = t6.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((v) it).a()))) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            if (!z6) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(String str, int i7, String str2, int i8, int i9, boolean z6) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "other");
        return !z6 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z6, i7, str2, i8, i9);
    }

    public static final boolean n(String str, String str2, boolean z6) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "prefix");
        return !z6 ? str.startsWith(str2) : m(str, 0, str2, 0, str2.length(), z6);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return n(str, str2, z6);
    }
}
