package w4;

import E7.l;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5171b {
    public static /* synthetic */ void query$default(c cVar, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, l lVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            strArr = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            strArr2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        cVar.query(str, strArr, str2, strArr2, str3, str4, str5, str6, lVar);
    }
}
