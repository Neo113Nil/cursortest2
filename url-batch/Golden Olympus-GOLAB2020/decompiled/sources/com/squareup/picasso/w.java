package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.q;
import com.squareup.picasso.v;

/* loaded from: classes2.dex */
class w extends v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21859a;

    w(Context context) {
        this.f21859a = context;
    }

    private static Bitmap j(Resources resources, int i4, t tVar) {
        BitmapFactory.Options d4 = v.d(tVar);
        if (v.g(d4)) {
            BitmapFactory.decodeResource(resources, i4, d4);
            v.b(tVar.f21812h, tVar.f21813i, d4, tVar);
        }
        return BitmapFactory.decodeResource(resources, i4, d4);
    }

    @Override // com.squareup.picasso.v
    public boolean c(t tVar) {
        if (tVar.f21809e != 0) {
            return true;
        }
        return "android.resource".equals(tVar.f21808d.getScheme());
    }

    @Override // com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        Resources m4 = y.m(this.f21859a, tVar);
        return new v.a(j(m4, y.l(m4, tVar), tVar), q.e.DISK);
    }
}
