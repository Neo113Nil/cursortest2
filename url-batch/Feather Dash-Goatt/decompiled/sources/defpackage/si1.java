package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class si1 {
    public static WeakReference b;
    public mc a;

    public final synchronized ri1 a() {
        String str;
        ri1 ri1Var;
        mc mcVar = this.a;
        synchronized (((ArrayDeque) mcVar.h)) {
            str = (String) ((ArrayDeque) mcVar.h).peek();
        }
        Pattern pattern = ri1.d;
        ri1Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                ri1Var = new ri1(split[0], split[1]);
            }
        }
        return ri1Var;
    }
}
