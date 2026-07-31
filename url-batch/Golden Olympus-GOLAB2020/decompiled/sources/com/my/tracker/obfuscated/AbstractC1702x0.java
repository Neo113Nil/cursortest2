package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.my.tracker.obfuscated.C1672p1;

/* renamed from: com.my.tracker.obfuscated.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1702x0 {
    public static void a(final C1712z2 c1712z2, final C1631f0 c1631f0, final C1703x1 c1703x1, final Context context) {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.y3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1702x0.a(context, c1712z2, c1631f0, c1703x1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, C1712z2 c1712z2, C1631f0 c1631f0, C1703x1 c1703x1) {
        String str;
        String str2;
        C1712z2 c1712z22;
        char c4;
        String str3;
        String num;
        long longVersionCode;
        PackageInfo a4 = AbstractC1689u.a(context);
        if (a4 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = a4.getLongVersionCode();
                num = Long.toString(longVersionCode);
            } else {
                num = Integer.toString(a4.versionCode);
            }
            str = a4.versionName;
            str2 = num;
        } else {
            str = "";
            str2 = str;
        }
        C1676q1 a5 = C1676q1.a(context);
        String a6 = a5.a();
        String g4 = c1712z2.g();
        if (g4.equals(a5.c())) {
            c1712z22 = c1712z2;
            if (str2.equals(a6)) {
                c4 = 0;
            } else {
                if (a6.isEmpty()) {
                    str3 = "InstallHandler: tracking update";
                } else {
                    str3 = "InstallHandler: tracking update from" + a6 + " to " + str2;
                }
                AbstractC1708y2.a(str3);
                c1631f0.a(a5.f(), a6, str, str2, AbstractC1689u.b(context));
                c4 = 2;
            }
        } else {
            AbstractC1708y2.a("InstallHandler: tracking install");
            long b4 = a4 != null ? AbstractC1700w2.b(a4.firstInstallTime) : 0L;
            c1712z22 = c1712z2;
            C1672p1 a7 = C1672p1.a(c1631f0, c1712z22, context);
            C1672p1.a a8 = a7.a();
            c1631f0.a(b4, AbstractC1689u.b(context), a8);
            if (a8 == null) {
                a7.c();
            }
            a5.e(g4);
            c4 = 1;
        }
        long j4 = a5.j();
        long a9 = AbstractC1700w2.a();
        String b5 = c1712z22.b();
        if (!TextUtils.isEmpty(b5)) {
            if (a9 - j4 < 604800 || j4 == 0) {
                AbstractC1708y2.a("InstallHandler: tracking apkPreinstallParams");
                c1631f0.d(b5);
            } else {
                AbstractC1708y2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c4 == 0) {
            AbstractC1708y2.a("InstallHandler: no install/update");
            c1703x1.a(j4);
            return;
        }
        if (c4 == 1) {
            a5.b(a9);
            c1703x1.a(a9);
        } else if (c4 == 2) {
            c1703x1.a(j4);
        }
        a5.d(str2);
        a5.g(str);
        a5.c(a9);
    }
}
