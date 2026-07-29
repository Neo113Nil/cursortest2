package com.umeng.commonsdk.debug;

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface UMDebugLog {
    void aq(int i, String str, String str2);

    void aq(String str, int i, String str2);

    void aq(String str, int i, String str2, String str3);

    void aq(String str, int i, String str2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);

    void aq(String str, String str2, int i, String str3);

    void aq(String str, String str2, int i, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);

    void bundle(int i, Bundle bundle);

    void bundle(String str, int i, Bundle bundle);

    void jsonArry(String str, JSONArray jSONArray);

    void jsonArry(JSONArray jSONArray);

    void jsonObject(String str, JSONObject jSONObject);

    void jsonObject(JSONObject jSONObject);

    void mutlInfo(int i, String... strArr);

    void mutlInfo(String str, int i, String str2);

    void mutlInfo(String str, int i, String str2, String[] strArr, String[] strArr2);

    void mutlInfo(String str, int i, String... strArr);

    void mutlInfo(String str, String str2, int i, String str3);

    void mutlInfo(String str, String str2, int i, String str3, String[] strArr, String[] strArr2);
}
