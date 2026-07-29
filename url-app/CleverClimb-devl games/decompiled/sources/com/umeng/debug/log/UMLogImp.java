package com.umeng.debug.log;

import android.os.Bundle;
import com.umeng.commonsdk.debug.UMDebugLog;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UMLogImp implements UMDebugLog {
    public static Map logMap;

    public UMLogImp() {
        if (logMap == null) {
            logMap = new HashMap();
        }
        Field[] fields = UMLogCommon.class.getFields();
        if (fields != null) {
            for (int i = 0; i < fields.length; i++) {
                try {
                    logMap.put(fields[i].getName(), fields[i].get(fields[i].getName()).toString());
                } catch (Exception unused) {
                }
            }
        }
        Field[] fields2 = UMLogAnalytics.class.getFields();
        if (fields2 != null) {
            for (int i2 = 0; i2 < fields2.length; i2++) {
                try {
                    logMap.put(fields2[i2].getName(), fields2[i2].get(fields2[i2].getName()).toString());
                } catch (Exception unused2) {
                }
            }
        }
        Field[] fields3 = UMLogPush.class.getFields();
        if (fields3 != null) {
            for (int i3 = 0; i3 < fields3.length; i3++) {
                try {
                    logMap.put(fields3[i3].getName(), fields3[i3].get(fields3[i3].getName()).toString());
                } catch (Exception unused3) {
                }
            }
        }
        Field[] fields4 = UMLogShare.class.getFields();
        if (fields4 != null) {
            for (int i4 = 0; i4 < fields4.length; i4++) {
                try {
                    logMap.put(fields4[i4].getName(), fields4[i4].get(fields4[i4].getName()).toString());
                } catch (Exception unused4) {
                }
            }
        }
        Field[] fields5 = UMLogError.class.getFields();
        if (fields5 != null) {
            for (int i5 = 0; i5 < fields5.length; i5++) {
                try {
                    logMap.put(fields5[i5].getName(), fields5[i5].get(fields5[i5].getName()).toString());
                } catch (Exception unused5) {
                }
            }
        }
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(int i, String str, String str2) {
        UMLog.aq(i, str, str2);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(String str, int i, String str2) {
        UMLog.aq(str, i, str2);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(String str, int i, String str2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        UMLog.aq(str, i, str2, strArr, strArr2, strArr3, strArr4);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(String str, int i, String str2, String str3) {
        UMLog.aq(str, i, str2, str3);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(String str, String str2, int i, String str3) {
        UMLog.aq(str, str2, i, str3);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void aq(String str, String str2, int i, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        UMLog.aq(str, str2, i, str3, strArr, strArr2, strArr3, strArr4);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(int i, String... strArr) {
        UMLog.mutlInfo(i, strArr);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(String str, int i, String str2) {
        UMLog.mutlInfo(str, i, str2);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(String str, int i, String str2, String[] strArr, String[] strArr2) {
        UMLog.mutlInfo(str, i, str2, strArr, strArr2);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(String str, int i, String... strArr) {
        UMLog.mutlInfo(str, i, strArr);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(String str, String str2, int i, String str3) {
        UMLog.mutlInfo(str, str2, i, str3);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void mutlInfo(String str, String str2, int i, String str3, String[] strArr, String[] strArr2) {
        UMLog.mutlInfo(str, str2, i, str3, strArr, strArr2);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void bundle(int i, Bundle bundle) {
        UMLog.bundle(i, bundle);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void bundle(String str, int i, Bundle bundle) {
        UMLog.bundle(str, i, bundle);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void jsonObject(JSONObject jSONObject) {
        UMLog.jsonObject(jSONObject);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void jsonObject(String str, JSONObject jSONObject) {
        UMLog.jsonObject(str, jSONObject);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void jsonArry(JSONArray jSONArray) {
        UMLog.jsonArry(jSONArray);
    }

    @Override // com.umeng.commonsdk.debug.UMDebugLog
    public void jsonArry(String str, JSONArray jSONArray) {
        UMLog.jsonArry(str, jSONArray);
    }
}
