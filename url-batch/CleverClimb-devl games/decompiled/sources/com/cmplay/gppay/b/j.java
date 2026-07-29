package com.cmplay.gppay.b;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f4141a;

    /* renamed from: b, reason: collision with root package name */
    public int f4142b;

    /* renamed from: c, reason: collision with root package name */
    public String f4143c;

    /* renamed from: d, reason: collision with root package name */
    public String f4144d;
    public String e;
    public long f;
    public String g;

    public static j a(String str) {
        String substring;
        int indexOf = str.indexOf(58);
        if (-1 == indexOf) {
            substring = "";
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = indexOf >= str.length() ? "" : str.substring(indexOf + 1);
            str = substring2;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        j jVar = new j();
        jVar.g = substring;
        jVar.f4141a = Integer.parseInt(split[0]);
        jVar.f4142b = Integer.parseInt(split[1]);
        jVar.f4143c = split[2];
        jVar.f4144d = split[3];
        jVar.e = split[4];
        jVar.f = Long.parseLong(split[5]);
        return jVar;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f4141a), Integer.valueOf(this.f4142b), this.f4143c, this.f4144d, this.e, Long.valueOf(this.f)});
    }
}
