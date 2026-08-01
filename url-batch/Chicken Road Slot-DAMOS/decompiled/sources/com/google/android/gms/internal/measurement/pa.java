package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class pa {

    /* renamed from: a, reason: collision with root package name */
    public static final s.e f2670a = new s.e(0);

    public static synchronized Uri a() {
        synchronized (pa.class) {
            s.e eVar = f2670a;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            te.a1.e("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return v4.a.p(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
