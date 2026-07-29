package com.xsj.crasheye;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ExtraData extends HashMap<String, Object> {
    private static final long serialVersionUID = -3516111185615801729L;

    public HashMap<String, Object> getExtraData() {
        return this;
    }

    public boolean addExtraData(String str, Object obj) {
        if (str == null || obj == null) {
            return false;
        }
        put(str, obj);
        return true;
    }

    public boolean addExtraDataMap(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return false;
        }
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public boolean addExtraData(ExtraData extraData) {
        if (extraData == null) {
            return false;
        }
        for (Map.Entry<String, Object> entry : extraData.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public boolean removeKey(String str) {
        if (str == null || !containsKey(str)) {
            return false;
        }
        remove(str);
        return true;
    }

    public void clearData() {
        clear();
    }
}
