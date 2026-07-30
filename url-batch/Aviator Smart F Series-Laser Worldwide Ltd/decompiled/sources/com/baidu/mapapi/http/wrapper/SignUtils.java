package com.baidu.mapapi.http.wrapper;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SignUtils {
    public static String signParams(BaseParams baseParams, Map<String, String> map, boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (Field field : baseParams.getClass().getFields()) {
            Properties properties = (Properties) field.getAnnotation(Properties.class);
            String name = properties == null ? field.getName() : properties.name();
            Object obj = field.get(baseParams);
            if (!HttpConstants.SIGN.equals(name) && obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
                sb.append(name);
                sb.append("=");
                sb.append(toValue(obj, z7));
                sb.append("&");
            }
        }
        for (Field field2 : baseParams.getClass().getDeclaredFields()) {
            field2.setAccessible(true);
            Properties properties2 = (Properties) field2.getAnnotation(Properties.class);
            String name2 = properties2 == null ? field2.getName() : properties2.name();
            Object obj2 = field2.get(baseParams);
            if (!HttpConstants.SIGN.equals(name2) && obj2 != null && !TextUtils.isEmpty(String.valueOf(obj2))) {
                sb.append(name2);
                sb.append("=");
                sb.append(toValue(obj2, z7));
                sb.append("&");
            }
            field2.setAccessible(false);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null && !TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(toValue(entry.getValue(), z7));
                    sb.append("&");
                }
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return AppMD5.getSignMD5StringUTF8(sb.toString());
    }

    public static String toValue(Object obj, boolean z7) {
        if (obj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        if (obj.getClass().isArray()) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                int length = objArr.length;
                while (i8 < length) {
                    sb.append(ParamsUtils.getValue(objArr[i8], z7));
                    sb.append(SystemInfoUtil.COMMA);
                    i8++;
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                while (i8 < list.size()) {
                    sb.append(ParamsUtils.getValue(list.get(i8), z7));
                    sb.append(SystemInfoUtil.COMMA);
                    i8++;
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        } else if (obj instanceof Set) {
            Set set = (Set) obj;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    sb.append(ParamsUtils.getValue(it.next(), z7));
                    sb.append(SystemInfoUtil.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        } else {
            sb.append(ParamsUtils.getValue(obj, z7));
        }
        return sb.toString();
    }
}
