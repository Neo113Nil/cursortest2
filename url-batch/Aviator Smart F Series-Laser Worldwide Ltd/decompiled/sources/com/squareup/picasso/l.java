package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.util.g1;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import okio.j0;

/* loaded from: classes4.dex */
class l extends g {
    l(Context context) {
        super(context);
    }

    static int getFileExifRotation(Uri uri) {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        return g1.URL_PROTOCOL_FILE.equals(uVar.uri.getScheme());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        return new w.a(null, j0.source(getInputStream(uVar)), Picasso.LoadedFrom.DISK, getFileExifRotation(uVar.uri));
    }
}
