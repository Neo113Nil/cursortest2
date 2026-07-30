package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import java.io.InputStream;
import okio.j0;

/* loaded from: classes4.dex */
class g extends w {
    final Context context;

    g(Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        return FirebaseAnalytics.Param.CONTENT.equals(uVar.uri.getScheme());
    }

    InputStream getInputStream(u uVar) {
        return this.context.getContentResolver().openInputStream(uVar.uri);
    }

    @Override // com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        return new w.a(j0.source(getInputStream(uVar)), Picasso.LoadedFrom.DISK);
    }
}
