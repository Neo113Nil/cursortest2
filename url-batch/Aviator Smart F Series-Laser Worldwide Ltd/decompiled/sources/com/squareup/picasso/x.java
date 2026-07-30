package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;

/* loaded from: classes4.dex */
class x extends w {
    private final Context context;

    x(Context context) {
        this.context = context;
    }

    private static Bitmap decodeResource(Resources resources, int i8, u uVar) {
        BitmapFactory.Options createBitmapOptions = w.createBitmapOptions(uVar);
        if (w.requiresInSampleSize(createBitmapOptions)) {
            BitmapFactory.decodeResource(resources, i8, createBitmapOptions);
            w.calculateInSampleSize(uVar.targetWidth, uVar.targetHeight, createBitmapOptions, uVar);
        }
        return BitmapFactory.decodeResource(resources, i8, createBitmapOptions);
    }

    @Override // com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        if (uVar.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(uVar.uri.getScheme());
    }

    @Override // com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        Resources resources = d0.getResources(this.context, uVar);
        return new w.a(decodeResource(resources, d0.getResourceId(resources, uVar), uVar), Picasso.LoadedFrom.DISK);
    }
}
