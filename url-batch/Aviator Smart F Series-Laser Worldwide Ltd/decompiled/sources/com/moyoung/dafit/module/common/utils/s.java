package com.moyoung.dafit.module.common.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class s {
    public static String bean2Json(Object obj) {
        return new Gson().toJson(obj);
    }

    public static <T> T[] json2Array(String str, Class<T[]> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T[]) ((Object[]) new Gson().fromJson(str, (Class) cls));
    }

    public static <T> T json2Bean(String str, Class<T> cls) {
        try {
            return (T) new Gson().fromJson(str, (Class) cls);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> json2List(String str, Class<T[]> cls) {
        Object[] objArr;
        if (TextUtils.isEmpty(str) || (objArr = (Object[]) new Gson().fromJson(str, (Class) cls)) == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(objArr));
    }

    public static <T> T reader2Bean(Reader reader, Class<T> cls) {
        try {
            return (T) new Gson().fromJson(reader, (Class) cls);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
