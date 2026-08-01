package ha;

import a2.r;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void query$default(c cVar, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: query");
            return;
        }
        if ((i3 & 2) != 0) {
            strArr = null;
        }
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        if ((i3 & 8) != 0) {
            strArr2 = null;
        }
        if ((i3 & 16) != 0) {
            str3 = null;
        }
        if ((i3 & 32) != 0) {
            str4 = null;
        }
        if ((i3 & 64) != 0) {
            str5 = null;
        }
        if ((i3 & 128) != 0) {
            str6 = null;
        }
        cVar.query(str, strArr, str2, strArr2, str3, str4, str5, str6, function1);
    }
}
