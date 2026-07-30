package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.internal.AttributionIdentifiers;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class AFa1eSDK extends AFb1qSDK<String> {
    public AFa1eSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(context, aFc1zSDK, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1qSDK
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public String AFInAppEventType() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFInAppEventParameterName);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("aid"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String AFInAppEventParameterName() {
        this.AFKeystoreWrapper.valueOf().execute(this.values);
        return (String) super.values();
    }

    @Override // com.appsflyer.internal.AFb1qSDK
    public final /* synthetic */ String values() {
        this.AFKeystoreWrapper.valueOf().execute(this.values);
        return (String) super.values();
    }
}
