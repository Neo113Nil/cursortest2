package com.ironsource.sdk.controller;

import com.ironsource.km;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes2.dex */
final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final String f19358b = "MD5";

    /* renamed from: a, reason: collision with root package name */
    private String f19359a;

    s(String str) {
        this.f19359a = str;
    }

    static String a() {
        return UUID.randomUUID().toString();
    }

    String b() {
        return this.f19359a;
    }

    private String a(String str) {
        try {
            return km.a(str);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return b(str);
        }
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f19358b);
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return "";
        }
    }

    private String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f19359a));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }
}
