package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cm1 {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static cm1 c;
    public final tc1 a;

    public cm1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    public final boolean a(wb wbVar) {
        if (TextUtils.isEmpty(wbVar.c)) {
            return true;
        }
        long j = wbVar.f + wbVar.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
