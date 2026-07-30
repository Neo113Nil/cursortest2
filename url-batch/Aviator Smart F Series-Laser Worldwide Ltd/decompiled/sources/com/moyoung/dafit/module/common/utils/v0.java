package com.moyoung.dafit.module.common.utils;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes4.dex */
public final class v0 {
    private v0() {
        throw new AssertionError();
    }

    public static String getImagePath(Context context, Intent intent) {
        Uri data = intent.getData();
        b5.b.d("uri=intent.getData :" + data);
        if (!DocumentsContract.isDocumentUri(context, data)) {
            if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(data.getScheme())) {
                return getImagePath(context, data, null);
            }
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(data);
        Log.d("getDocumentId(uri) :", "" + documentId);
        Log.d("uri.getAuthority() :", "" + data.getAuthority());
        if (!"com.android.providers.media.documents".equals(data.getAuthority())) {
            if ("com.android.providers.downloads.documents".equals(data.getAuthority())) {
                return getImagePath(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null);
            }
            return null;
        }
        return getImagePath(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + documentId.split(":")[1]);
    }

    private static String getImagePath(Context context, Uri uri, String str) {
        Cursor query = context.getContentResolver().query(uri, null, str, null, null);
        if (query != null) {
            r7 = query.moveToFirst() ? query.getString(query.getColumnIndex("_data")) : null;
            query.close();
        }
        return r7;
    }
}
