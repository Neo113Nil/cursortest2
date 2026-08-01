package com.bytedance.sdk.openadsdk.multipro.Jd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.mnm;
import java.util.Map;

/* compiled from: SPMultiProviderImpl.java */
/* loaded from: classes2.dex */
public class vG implements com.bytedance.sdk.openadsdk.multipro.pvs {
    private Context pvs;

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs() {
        return "t_sp";
    }

    private Context icD() {
        Context context = this.pvs;
        return context == null ? mnm.pvs() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> vG;
        if (!uri.getPath().split("/")[2].equals("get_all") || (vG = icD.vG(icD(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : vG.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = vG.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = TypedValues.Custom.S_BOOLEAN;
            } else if (obj instanceof String) {
                objArr[1] = TypedValues.Custom.S_STRING;
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = TypedValues.Custom.S_FLOAT;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(icD.pvs(mnm.pvs(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return icD.pvs(icD(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Uri pvs(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            icD.pvs(icD(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            icD.icD(icD(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (icD.pvs(icD(), uri.getQueryParameter("sp_file_name"), str2)) {
            icD.icD(icD(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        pvs(uri, contentValues);
        return 0;
    }
}
