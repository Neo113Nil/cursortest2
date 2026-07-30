package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i93 {
    public static final i93 b;
    public mm a;

    static {
        i93 i93Var = new i93();
        i93Var.a = null;
        b = i93Var;
    }

    public static mm a(Context context) {
        mm mmVar;
        i93 i93Var = b;
        synchronized (i93Var) {
            try {
                if (i93Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    i93Var.a = new mm(context);
                }
                mmVar = i93Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mmVar;
    }
}
