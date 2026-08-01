package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.sUS.pvs.sUS;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.settings.kj;
import java.util.Map;

/* compiled from: ProviderListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class sUS extends sUS.pvs {
    private static volatile sUS pvs;

    public static sUS icD() {
        if (pvs == null) {
            synchronized (sUS.class) {
                if (pvs == null) {
                    pvs = new sUS();
                }
            }
        }
        return pvs;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS
    public Map pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!kj.pvs()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.multipro.NB.pvs(mnm.pvs()).pvs(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS
    public String pvs(Uri uri) {
        if (kj.pvs()) {
            return com.bytedance.sdk.openadsdk.multipro.NB.pvs(mnm.pvs()).pvs(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS
    public String pvs(Uri uri, ContentValues contentValues) {
        Uri pvs2;
        if (kj.pvs() && (pvs2 = com.bytedance.sdk.openadsdk.multipro.NB.pvs(mnm.pvs()).pvs(uri, contentValues)) != null) {
            return pvs2.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS
    public int pvs(Uri uri, String str, String[] strArr) {
        if (kj.pvs()) {
            return com.bytedance.sdk.openadsdk.multipro.NB.pvs(mnm.pvs()).pvs(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (kj.pvs()) {
            return com.bytedance.sdk.openadsdk.multipro.NB.pvs(mnm.pvs()).pvs(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
