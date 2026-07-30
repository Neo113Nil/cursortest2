package y2;

import kotlin.jvm.functions.Function1;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1025b {
    public static /* synthetic */ void query$default(InterfaceC1026c interfaceC1026c, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i2 & 2) != 0) {
            strArr = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            strArr2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = null;
        }
        interfaceC1026c.query(str, strArr, str2, strArr2, str3, str4, str5, str6, function1);
    }
}
