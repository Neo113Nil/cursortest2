package com.baidu.ar;

import com.baidu.ar.util.SystemInfoUtil;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class na implements w6 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2850b = Pattern.compile(cn.hutool.core.text.l.SPACE);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2851c = Pattern.compile(SystemInfoUtil.COMMA);

    /* renamed from: a, reason: collision with root package name */
    public final String f2852a;

    public na(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f2852a = str;
    }

    @Override // com.baidu.ar.w6
    public w6 a() {
        return new na(b());
    }

    @Override // com.baidu.ar.w6
    public String b() {
        return this.f2852a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || na.class != obj.getClass()) {
            return false;
        }
        return this.f2852a.equals(((na) obj).f2852a);
    }

    public int hashCode() {
        return this.f2852a.hashCode();
    }

    @Override // com.baidu.ar.w6
    public String toString() {
        return b();
    }

    @Override // com.baidu.ar.w6
    public boolean a(String str) {
        for (String str2 : f2851c.split(f2850b.matcher(str).replaceAll(""))) {
            if (this.f2852a.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
