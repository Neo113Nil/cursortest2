package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface vc4 {

    /* renamed from: a, reason: collision with root package name */
    public static final vc4 f13302a = new vc4() { // from class: com.google.android.gms.internal.ads.tc4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            int i7 = uc4.f12743a;
            return new oc4[0];
        }
    };

    oc4[] a(Uri uri, Map<String, List<String>> map);

    oc4[] zza();
}
