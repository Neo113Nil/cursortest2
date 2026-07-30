package com.baidu.mapauto.auth.net.format;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7755a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f7756b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f7757c;

    static {
        String uuid = UUID.randomUUID().toString();
        f7755a = uuid;
        f7756b = "\r\n--" + uuid + "\r\n";
        f7757c = "\r\n--" + uuid + "--\r\n";
    }

    public final String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            if (obj instanceof File) {
                throw new UnsupportedOperationException();
            }
            if (obj != null) {
                String obj2 = obj.toString();
                sb.append(f7756b);
                sb.append("Content-Disposition: form-data; name=\"");
                sb.append(str);
                sb.append("\"\r\n");
                sb.append("\r\n");
                sb.append(obj2);
            }
        }
        sb.append(f7757c);
        return sb.toString();
    }
}
