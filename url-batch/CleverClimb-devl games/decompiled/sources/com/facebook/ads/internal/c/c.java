package com.facebook.ads.internal.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class c {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5054a;

        /* renamed from: b, reason: collision with root package name */
        public String f5055b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5056c;

        public a(String str, String str2, boolean z) {
            this.f5054a = str;
            this.f5055b = str2;
            this.f5056c = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(ContentResolver contentResolver) {
        Cursor cursor;
        try {
            try {
                cursor = contentResolver.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid", "androidid", "limit_tracking"}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            a aVar = new a(cursor.getString(cursor.getColumnIndex("aid")), cursor.getString(cursor.getColumnIndex("androidid")), Boolean.valueOf(cursor.getString(cursor.getColumnIndex("limit_tracking"))).booleanValue());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return aVar;
                        }
                    } catch (Exception unused) {
                        a aVar2 = new a(null, null, false);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return aVar2;
                    }
                }
                a aVar3 = new a(null, null, false);
                if (cursor != null) {
                    cursor.close();
                }
                return aVar3;
            } catch (Throwable th) {
                th = th;
                if (contentResolver != 0) {
                    contentResolver.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            contentResolver = 0;
            if (contentResolver != 0) {
            }
            throw th;
        }
    }
}
