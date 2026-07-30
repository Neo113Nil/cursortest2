package j1;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class g extends f {
    public static boolean G(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            Iterable bVar = new g1.b(0, charSequence.length() - 1, 1);
            if (!(bVar instanceof Collection) || !((Collection) bVar).isEmpty()) {
                Iterator it = bVar.iterator();
                while (true) {
                    g1.a aVar = (g1.a) it;
                    boolean z2 = aVar.f364d;
                    if (!z2) {
                        break;
                    }
                    int i2 = aVar.f365e;
                    if (i2 != aVar.f363c) {
                        aVar.f365e = aVar.f362b + i2;
                    } else {
                        if (!z2) {
                            throw new NoSuchElementException();
                        }
                        aVar.f364d = false;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String H(String str, String str2) {
        int indexOf = str.indexOf(str2, 0);
        return indexOf == -1 ? str : str.substring(str2.length() + indexOf, str.length());
    }

    public static String I(String str) {
        str.getClass();
        str.getClass();
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1, str.length());
    }
}
