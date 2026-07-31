package W1;

import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void query$default(c cVar, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC0743l interfaceC0743l, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            strArr = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            strArr2 = null;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            str4 = null;
        }
        if ((i7 & 64) != 0) {
            str5 = null;
        }
        if ((i7 & 128) != 0) {
            str6 = null;
        }
        cVar.query(str, strArr, str2, strArr2, str3, str4, str5, str6, interfaceC0743l);
    }
}
