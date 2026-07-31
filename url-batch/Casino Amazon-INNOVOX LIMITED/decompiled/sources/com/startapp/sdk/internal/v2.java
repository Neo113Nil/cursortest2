package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class v2 {
    public static u2 a(String str) {
        try {
            try {
                ArrayList a2 = na.a(new JsonReader(new StringReader(str)));
                String str2 = (String) a2.get(0);
                if (str2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String str3 = (String) a2.get(1);
                if (str3 == null) {
                    throw new IllegalArgumentException(str);
                }
                List list = (List) a2.get(2);
                if (list == null) {
                    throw new IllegalArgumentException(str);
                }
                int size = list.size();
                String[] strArr = new String[size];
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i = 0; i < size; i++) {
                    Map map = (Map) list.get(i);
                    if (map == null) {
                        throw new IllegalArgumentException(str);
                    }
                    if (map.size() != 1) {
                        throw new IllegalArgumentException(str);
                    }
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    String str4 = (String) entry.getKey();
                    if (str4 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    try {
                        Class a3 = x2.a(str4);
                        Object a4 = x2.a(a3, entry.getValue());
                        strArr[i] = str4;
                        clsArr[i] = a3;
                        objArr[i] = a4;
                    } catch (ClassCastException e) {
                        throw new IllegalArgumentException(str, e);
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(str, e2);
                    } catch (IllegalAccessException e3) {
                        throw new IllegalArgumentException(str, e3);
                    } catch (InstantiationException e4) {
                        throw new IllegalArgumentException(str, e4);
                    } catch (NoSuchMethodException e5) {
                        throw new IllegalArgumentException(str, e5);
                    } catch (InvocationTargetException e6) {
                        throw new IllegalArgumentException(str, e6);
                    }
                }
                List list2 = (List) a2.get(3);
                if (list2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String[] strArr2 = new String[list2.size()];
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = (String) list2.get(i2);
                    if (str5 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    strArr2[i2] = str5;
                }
                return new u2(str2, str3, strArr, clsArr, objArr, strArr2);
            } catch (IOException e7) {
                throw new IllegalArgumentException(str, e7);
            }
        } catch (ClassCastException e8) {
            throw new IllegalArgumentException(str, e8);
        }
    }
}
