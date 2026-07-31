package u;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import t.AbstractC0634A;
import t.C0639F;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5964a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : AbstractC0634A.a(new C0639F(context).f5902b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }
}
