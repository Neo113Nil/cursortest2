package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
final class AFa1eSDK extends AFb1qSDK<String> {
    AFa1eSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(context, aFc1zSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1qSDK
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public String AFInAppEventType() {
        Cursor cursor = null;
        try {
            Cursor query = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFInAppEventParameterName).toString()), new String[]{"aid"}, null, null, null);
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
