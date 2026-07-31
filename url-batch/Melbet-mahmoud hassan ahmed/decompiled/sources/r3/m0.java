package r3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21304a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f21305b;

    /* renamed from: c, reason: collision with root package name */
    private static String f21306c;

    /* renamed from: d, reason: collision with root package name */
    private static int f21307d;

    public static int a(Context context) {
        b(context);
        return f21307d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f21304a) {
            if (f21305b) {
                return;
            }
            f21305b = true;
            try {
                bundle = w3.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("MetadataValueReader", "This should never happen.", e7);
            }
            if (bundle == null) {
                return;
            }
            f21306c = bundle.getString("com.google.app.id");
            f21307d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
