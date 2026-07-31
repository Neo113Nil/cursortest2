package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes3.dex */
final class AFb1kSDK extends AFc1aSDK<String> {
    AFb1kSDK(Context context, AFd1mSDK aFd1mSDK) {
        super(context, aFd1mSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1aSDK
    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public String valueOf() {
        Cursor cursor = null;
        try {
            Cursor query = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.values).toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("aid"));
                        if (query != null) {
                            query.close();
                        }
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

    public final String AFKeystoreWrapper() {
        this.AFInAppEventParameterName.AFInAppEventParameterName().execute(this.AFKeystoreWrapper);
        return (String) super.values();
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final /* synthetic */ String values() {
        this.AFInAppEventParameterName.AFInAppEventParameterName().execute(this.AFKeystoreWrapper);
        return (String) super.values();
    }
}
