package com.liulishuo.filedownloader.connection;

import com.liulishuo.filedownloader.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {
    private static final int HTTP_PERMANENT_REDIRECT = 308;
    private static final int HTTP_TEMPORARY_REDIRECT = 307;
    private static final int MAX_REDIRECT_TIMES = 10;

    private static b buildRedirectConnection(Map<String, List<String>> map, String str) {
        b createConnection = com.liulishuo.filedownloader.download.b.getImpl().createConnection(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    createConnection.addHeader(key, it.next());
                }
            }
        }
        return createConnection;
    }

    private static boolean isRedirect(int i8) {
        return i8 == 301 || i8 == 302 || i8 == 303 || i8 == 300 || i8 == 307 || i8 == 308;
    }

    public static b process(Map<String, List<String>> map, b bVar, List<String> list) {
        int responseCode = bVar.getResponseCode();
        String responseHeaderField = bVar.getResponseHeaderField("Location");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (isRedirect(responseCode)) {
            if (responseHeaderField == null) {
                throw new IllegalAccessException(f.formatString("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(responseCode), bVar.getResponseHeaderFields()));
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(d.class, "redirect to %s with %d, %s", responseHeaderField, Integer.valueOf(responseCode), arrayList);
            }
            bVar.ending();
            bVar = buildRedirectConnection(map, responseHeaderField);
            arrayList.add(responseHeaderField);
            bVar.execute();
            responseCode = bVar.getResponseCode();
            responseHeaderField = bVar.getResponseHeaderField("Location");
            i8++;
            if (i8 >= 10) {
                throw new IllegalAccessException(f.formatString("redirect too many times! %s", arrayList));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return bVar;
    }
}
