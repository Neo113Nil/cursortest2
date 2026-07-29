package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.j.a;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4891d = "i";
    private final Uri e;

    public i(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri) {
        super(context, cVar, str);
        this.e = uri;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0346a a() {
        return a.EnumC0346a.OPEN_LINK;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        try {
            Log.w("REDIRECTACTION: ", this.e.toString());
            com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), this.f4876a, this.e, this.f4878c);
        } catch (Exception e) {
            Log.d(f4891d, "Failed to open link url: " + this.e.toString(), e);
        }
    }
}
