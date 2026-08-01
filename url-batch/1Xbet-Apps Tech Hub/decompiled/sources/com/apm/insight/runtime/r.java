package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {
    private static File a;

    public static class a {
        public String a;
        public String b;
        public long c;

        a(String str) {
            String[] split = str.split("\\s+");
            if (split.length != 3) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str));
                return;
            }
            this.a = split[0];
            this.b = split[1];
            try {
                this.c = Long.parseLong(split[2]);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str, th));
            }
        }
    }

    private static File a() {
        if (a == null) {
            String c = com.apm.insight.l.a.c(com.apm.insight.i.g());
            if (c == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            a = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + c.replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
        }
        return a;
    }

    public static File a(long j) {
        return new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    public static HashMap<String, a> a(long j, String str) {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a2 = com.apm.insight.l.i.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a2.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a2.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', AbstractJsonLexerKt.COLON).replace(".txt", ""), new a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    public static void a(String str, String str2) {
        try {
            File a2 = a();
            if (a2 != null) {
                com.apm.insight.l.i.a(a2, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
