package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2998bk {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29559a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f29560b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f29561c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f29562d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f29563e;

    static {
        String str = AbstractC3548lu.f32613a;
        f29559a = Integer.toString(0, 36);
        f29560b = Integer.toString(1, 36);
        f29561c = Integer.toString(2, 36);
        f29562d = Integer.toString(3, 36);
        f29563e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f29559a, spanned.getSpanStart(obj));
        bundle2.putInt(f29560b, spanned.getSpanEnd(obj));
        bundle2.putInt(f29561c, spanned.getSpanFlags(obj));
        bundle2.putInt(f29562d, i);
        if (bundle != null) {
            bundle2.putBundle(f29563e, bundle);
        }
        return bundle2;
    }
}
