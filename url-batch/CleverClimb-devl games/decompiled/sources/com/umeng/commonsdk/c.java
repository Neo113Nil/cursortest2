package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.d;

/* compiled from: UMConfigureInternation.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f8966a;

    public static synchronized void a(final Context context) {
        synchronized (c.class) {
            if (context != null) {
                try {
                    if (!f8966a) {
                        new Thread(new Runnable() { // from class: com.umeng.commonsdk.c.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String a2 = com.umeng.commonsdk.framework.b.a(context);
                                    String packageName = context.getPackageName();
                                    if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(packageName) || !a2.equals(packageName) || !UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                                        return;
                                    }
                                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.m, com.umeng.commonsdk.internal.b.a(context).a(), null);
                                } catch (Throwable unused) {
                                }
                            }
                        }).start();
                        f8966a = true;
                    }
                } catch (Throwable th) {
                    d.c("internal", "e is " + th.getMessage());
                }
            }
        }
    }
}
