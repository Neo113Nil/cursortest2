package com.baidu.platform.util;

import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements ParamBuilder<a> {

    /* renamed from: a, reason: collision with root package name */
    protected Map<String, String> f10620a;

    public a a(String str, String str2) {
        if (this.f10620a == null) {
            this.f10620a = new LinkedHashMap();
        }
        this.f10620a.put(str, str2);
        return this;
    }

    public String a() {
        Map<String, String> map = this.f10620a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = new String();
        int i8 = 0;
        for (String str2 : this.f10620a.keySet()) {
            String encodeUrlParamsValue = AppMD5.encodeUrlParamsValue(this.f10620a.get(str2));
            str = i8 == 0 ? str + str2 + "=" + encodeUrlParamsValue : str + "&" + str2 + "=" + encodeUrlParamsValue;
            i8++;
        }
        return str;
    }
}
