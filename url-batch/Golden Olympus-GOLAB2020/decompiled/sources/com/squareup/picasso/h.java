package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.ironsource.b9;
import com.squareup.picasso.q;
import com.squareup.picasso.v;

/* loaded from: classes2.dex */
class h extends e {
    h(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new V.a(uri.getPath()).f("Orientation", 1);
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.v
    public boolean c(t tVar) {
        return b9.h.f15468b.equals(tVar.f21808d.getScheme());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        return new v.a(null, okio.p.k(j(tVar)), q.e.DISK, k(tVar.f21808d));
    }
}
