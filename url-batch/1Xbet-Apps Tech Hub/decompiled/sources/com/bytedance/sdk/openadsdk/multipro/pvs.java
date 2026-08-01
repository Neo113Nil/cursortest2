package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: ITTProvider.java */
/* loaded from: classes2.dex */
public interface pvs {
    int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int pvs(Uri uri, String str, String[] strArr);

    Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri pvs(Uri uri, ContentValues contentValues);

    String pvs();

    String pvs(Uri uri);
}
