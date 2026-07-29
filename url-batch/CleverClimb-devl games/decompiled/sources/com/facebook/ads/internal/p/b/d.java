package com.facebook.ads.internal.p.b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class d {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f5320d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    private static final Pattern e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a, reason: collision with root package name */
    public final String f5321a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5322b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5323c;

    public d(String str) {
        j.a(str);
        long a2 = a(str);
        this.f5322b = Math.max(0L, a2);
        this.f5323c = a2 >= 0;
        this.f5321a = b(str);
    }

    private long a(String str) {
        Matcher matcher = f5320d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    public static d a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new d(sb.toString());
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    private String b(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f5322b + ", partial=" + this.f5323c + ", uri='" + this.f5321a + "'}";
    }
}
