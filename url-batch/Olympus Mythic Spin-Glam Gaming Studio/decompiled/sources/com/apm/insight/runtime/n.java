package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: ProcessTrack.java */
/* loaded from: classes5.dex */
public final class n {
    private static File a;

    public static File a(long j) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    @NonNull
    public static HashMap<String, a> a(long j, String str) {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a2.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a2.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new a(optString));
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

    /* compiled from: ProcessTrack.java */
    public static class a {
        public String a;
        private String b;
        private long c;

        a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.b = split[0];
                this.a = split[1];
                try {
                    this.c = Long.parseLong(split[2]);
                    return;
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(new RuntimeException("err ProcessTrack line:".concat(str), th), "NPTH_CATCH");
                    return;
                }
            }
            com.apm.insight.c.a();
            j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x0050, B:13:0x000f, B:14:0x004c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, String str2) {
        File file;
        try {
            if (a == null) {
                com.apm.insight.e.g();
                String b = com.apm.insight.l.a.b();
                if (b == null) {
                    file = null;
                    if (file == null) {
                        com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
                        return;
                    }
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + b.replace(':', '_') + ".txt");
            }
            file = a;
            if (file == null) {
            }
        } catch (Throwable unused) {
        }
    }
}
