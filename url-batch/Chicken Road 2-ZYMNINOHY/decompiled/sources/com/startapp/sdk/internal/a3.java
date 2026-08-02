package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a3 {
    public static z2 a(String str) {
        try {
            try {
                ArrayList a3 = gb.a(new JsonReader(new StringReader(str)));
                String str2 = (String) a3.get(0);
                if (str2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String str3 = (String) a3.get(1);
                if (str3 == null) {
                    throw new IllegalArgumentException(str);
                }
                List list = (List) a3.get(2);
                if (list == null) {
                    throw new IllegalArgumentException(str);
                }
                int size = list.size();
                String[] strArr = new String[size];
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i4 = 0; i4 < size; i4++) {
                    Map map = (Map) list.get(i4);
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
                        Class a4 = c3.a(str4);
                        Object a5 = c3.a(a4, entry.getValue());
                        strArr[i4] = str4;
                        clsArr[i4] = a4;
                        objArr[i4] = a5;
                    } catch (ClassCastException e4) {
                        throw new IllegalArgumentException(str, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalArgumentException(str, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalArgumentException(str, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalArgumentException(str, e7);
                    } catch (NoSuchMethodException e8) {
                        throw new IllegalArgumentException(str, e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalArgumentException(str, e9);
                    }
                }
                List list2 = (List) a3.get(3);
                if (list2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String[] strArr2 = new String[list2.size()];
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str5 = (String) list2.get(i5);
                    if (str5 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    strArr2[i5] = str5;
                }
                return new z2(str2, str3, strArr, clsArr, objArr, strArr2);
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(str, e10);
            }
        } catch (IOException e11) {
            throw new IllegalArgumentException(str, e11);
        }
    }
}
