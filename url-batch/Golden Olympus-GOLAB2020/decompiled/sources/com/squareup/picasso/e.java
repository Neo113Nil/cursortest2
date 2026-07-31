package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.q;
import com.squareup.picasso.v;
import java.io.InputStream;

/* loaded from: classes2.dex */
class e extends v {

    /* renamed from: a, reason: collision with root package name */
    final Context f21698a;

    e(Context context) {
        this.f21698a = context;
    }

    @Override // com.squareup.picasso.v
    public boolean c(t tVar) {
        return FirebaseAnalytics.Param.CONTENT.equals(tVar.f21808d.getScheme());
    }

    @Override // com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        return new v.a(okio.p.k(j(tVar)), q.e.DISK);
    }

    InputStream j(t tVar) {
        return this.f21698a.getContentResolver().openInputStream(tVar.f21808d);
    }
}
