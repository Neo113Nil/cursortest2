package com.cmplay.base.util.ipc;

import android.content.ContentValues;
import android.text.TextUtils;

/* compiled from: IpcHandler.java */
/* loaded from: classes.dex */
public abstract class a {
    public static final String CLASS_TAG = "class_tag";
    public static final String FORCE_STATIC_METHOD = "getInstance";
    public static final int ID_BASE = 0;
    public static final String METHOD_ID = "method_id";
    public static final String PARAMS_NUM = "params_num";
    public static final String PARAMS_TAG = "arg";

    public abstract String handler(ContentValues contentValues);

    protected String invoke(ContentValues contentValues) {
        return IpcProvider.a(contentValues);
    }

    protected String invoke(ContentValues contentValues, Object obj) {
        String a2 = IpcProvider.a(contentValues);
        return TextUtils.isEmpty(a2) ? obj.toString() : a2;
    }

    protected ContentValues createParams(int i, Object... objArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CLASS_TAG, getClass().getName());
        contentValues.put(METHOD_ID, Integer.valueOf(i));
        if (objArr != null) {
            contentValues.put(PARAMS_NUM, Integer.valueOf(objArr.length));
            for (int i2 = 0; i2 < objArr.length; i2++) {
                contentValues.put(PARAMS_TAG + i2, objArr[i2].toString());
            }
        }
        return contentValues;
    }

    protected int getMid(ContentValues contentValues) {
        return contentValues.getAsInteger(METHOD_ID).intValue();
    }

    protected String[] getParams(ContentValues contentValues) {
        String[] strArr = new String[contentValues.getAsInteger(PARAMS_NUM).intValue()];
        for (int i = 0; i < strArr.length; i++) {
            if (contentValues.containsKey(PARAMS_TAG + i)) {
                strArr[i] = contentValues.get(PARAMS_TAG + i).toString();
            }
        }
        return strArr;
    }
}
