package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class rl3 {
    public static final hi a = new hi(0);

    public static synchronized Uri a() {
        synchronized (rl3.class) {
            hi hiVar = a;
            Uri uri = (Uri) hiVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            hiVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
