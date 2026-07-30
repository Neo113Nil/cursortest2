package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* loaded from: classes3.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i8) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i8;
    }

    protected abstract void zaa(@Nullable Drawable drawable, boolean z7, boolean z8, boolean z9);

    final void zab(Context context, zam zamVar, boolean z7) {
        int i8 = this.zab;
        zaa(i8 != 0 ? context.getResources().getDrawable(i8) : null, z7, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z7) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
