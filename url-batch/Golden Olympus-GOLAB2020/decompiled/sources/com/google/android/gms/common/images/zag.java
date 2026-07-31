package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* loaded from: classes.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i4) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i4;
    }

    protected abstract void zaa(Drawable drawable, boolean z4, boolean z5, boolean z6);

    final void zab(Context context, zak zakVar, boolean z4) {
        int i4 = this.zab;
        zaa(i4 != 0 ? context.getResources().getDrawable(i4) : null, z4, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z4) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
