package com.bytedance.sdk.openadsdk.icD.pvs;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: EventProviderWrapper.java */
/* loaded from: classes2.dex */
public class NB implements com.bytedance.sdk.openadsdk.multipro.pvs {
    private final com.bytedance.sdk.component.sUS.pvs.icD.icD.icD pvs;

    public NB(com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd) {
        this.pvs = icd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs() {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.vG();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs(Uri uri) {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Uri pvs(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.sUS.pvs.icD.icD.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
