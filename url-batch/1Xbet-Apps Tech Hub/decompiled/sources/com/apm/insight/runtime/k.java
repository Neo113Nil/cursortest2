package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {
    private static j a;

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x004b */
    public static JSONArray a(String str) {
        Closeable closeable;
        BufferedReader bufferedReader;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    File file = new File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            com.apm.insight.l.k.a(bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(readLine);
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    com.apm.insight.l.k.a(bufferedReader);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                com.apm.insight.l.k.a(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    public static void a(j jVar) {
        a = jVar;
    }

    public static JSONArray b(String str) {
        if (a != null && com.apm.insight.i.f().equals(str)) {
            try {
                return a(a.a());
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        try {
            return a(com.apm.insight.l.f.a(str, com.apm.insight.i.i().getLogcatDumpCount(), com.apm.insight.i.i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return null;
        }
    }
}
