package com.bytedance.sdk.openadsdk.multipro.pvs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.NB;
import com.bytedance.sdk.openadsdk.core.mnm;

/* compiled from: DBMultiProviderImpl.java */
/* loaded from: classes2.dex */
public class icD implements com.bytedance.sdk.openadsdk.multipro.pvs {
    private static final Object icD = new Object();
    private Context pvs;

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs() {
        return "t_db";
    }

    private boolean icD(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    private Context icD() {
        Context context = this.pvs;
        return context == null ? mnm.pvs() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (icD) {
            if (icD(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str3 = split[2];
                String str4 = split[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return NB.pvs(icD()).pvs().pvs(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs(Uri uri) {
        synchronized (icD) {
            if (icD(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 5) {
                String str = split[2];
                String str2 = split[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            NB.pvs(icD()).pvs().pvs(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        NB.pvs(icD()).pvs().icD();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        NB.pvs(icD()).pvs().vG();
                    } else if ("transactionEnd".equals(str2)) {
                        NB.pvs(icD()).pvs().Jd();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Uri pvs(Uri uri, ContentValues contentValues) {
        synchronized (icD) {
            if (icD(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str = split[2];
                String str2 = split[3];
                if ("ttopensdk.db".equals(str)) {
                    NB.pvs(icD()).pvs().pvs(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, String str, String[] strArr) {
        synchronized (icD) {
            if (icD(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return NB.pvs(icD()).pvs().pvs(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (icD) {
            if (icD(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return NB.pvs(icD()).pvs().pvs(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}
