package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final androidx.collection.a zzb = new androidx.collection.a();

    public static synchronized Uri zza(String str) {
        synchronized (zzjx.class) {
            androidx.collection.a aVar = zzb;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
