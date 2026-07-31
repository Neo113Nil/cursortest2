package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class dy1 extends om {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f24994h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f24995i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f24996j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f24997k = 0;

    private dy1(String str, long j4, long j5, long j6, File file) {
        super(str, j4, j5, j6, file);
    }

    public final dy1 a(File file, long j4) {
        if (this.f30092e) {
            return new dy1(this.f30089b, this.f30090c, this.f30091d, j4, file);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r14.renameTo(r3) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dy1 a(File file, long j4, long j5, tm tmVar) {
        File file2;
        long j6;
        String str;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f24995i.matcher(name2);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                str = u82.f(group);
            } else {
                matcher = f24994h.matcher(name2);
                if (matcher.matches()) {
                    str = matcher.group(1);
                    str.getClass();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    int i4 = tmVar.c(str).f31838a;
                    String group2 = matcher.group(2);
                    group2.getClass();
                    long parseLong = Long.parseLong(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    file3 = new File(parentFile, i4 + "." + parseLong + "." + Long.parseLong(group3) + ".v3.exo");
                } else {
                    throw new IllegalStateException();
                }
            }
            file3 = null;
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        Matcher matcher2 = f24996j.matcher(name);
        if (!matcher2.matches()) {
            return null;
        }
        String group4 = matcher2.group(1);
        group4.getClass();
        String a4 = tmVar.a(Integer.parseInt(group4));
        if (a4 == null) {
            return null;
        }
        long length = j4 == -1 ? file2.length() : j4;
        if (length == 0) {
            return null;
        }
        String group5 = matcher2.group(2);
        group5.getClass();
        long parseLong2 = Long.parseLong(group5);
        if (j5 == -9223372036854775807L) {
            String group6 = matcher2.group(3);
            group6.getClass();
            j6 = Long.parseLong(group6);
        } else {
            j6 = j5;
        }
        return new dy1(a4, parseLong2, length, j6, file2);
    }

    public static dy1 a(String str, long j4) {
        return new dy1(str, j4, -1L, -9223372036854775807L, null);
    }

    public static dy1 a(String str, long j4, long j5) {
        return new dy1(str, j4, j5, -9223372036854775807L, null);
    }
}
