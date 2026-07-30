package com.crrepa.w0;

import java.io.File;

/* loaded from: classes3.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13973a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f13974b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("crp");
        sb.append(str);
        sb.append("firmware");
        f13973a = sb.toString();
        f13974b = com.crrepa.g1.d.a().getFilesDir().getAbsolutePath() + str + "crp" + str + "tp";
    }
}
