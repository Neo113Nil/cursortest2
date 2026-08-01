package com.bytedance.sdk.component.adexpress.pvs.pvs;

import android.content.ContentValues;
import android.database.Cursor;

/* compiled from: DbInterface.java */
/* loaded from: classes.dex */
public interface icD {
    int pvs(String str, ContentValues contentValues, String str2, String[] strArr);

    int pvs(String str, String str2, String[] strArr);

    Cursor pvs(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void pvs(String str, ContentValues contentValues);
}
