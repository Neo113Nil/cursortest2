package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.b9;
import com.squareup.picasso.q;
import com.squareup.picasso.v;

/* loaded from: classes2.dex */
class b extends v {

    /* renamed from: d, reason: collision with root package name */
    private static final int f21668d = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21669a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21670b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f21671c;

    b(Context context) {
        this.f21669a = context;
    }

    static String j(t tVar) {
        return tVar.f21808d.toString().substring(f21668d);
    }

    @Override // com.squareup.picasso.v
    public boolean c(t tVar) {
        Uri uri = tVar.f21808d;
        return b9.h.f15468b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        if (this.f21671c == null) {
            synchronized (this.f21670b) {
                try {
                    if (this.f21671c == null) {
                        this.f21671c = this.f21669a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new v.a(okio.p.k(this.f21671c.open(j(tVar))), q.e.DISK);
    }
}
