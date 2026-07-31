package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class mb {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17218d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17219e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final String f17220f = "C38FB23A402222A0C17D34A92F971D1F";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17221g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17222h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* renamed from: i, reason: collision with root package name */
    public static final int f17223i = 32;

    /* renamed from: j, reason: collision with root package name */
    private static final mb f17224j = new mb();

    /* renamed from: a, reason: collision with root package name */
    private String f17225a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f17226b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f17227c = "";

    public static mb b() {
        return f17224j;
    }

    public String a() {
        if (TextUtils.isEmpty(this.f17227c)) {
            try {
                this.f17227c = hk.a(d(), f17221g);
            } catch (Exception e4) {
                o9.d().a(e4);
                String str = "Session key encryption exception: " + e4.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f17227c;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f17225a)) {
            this.f17225a = f17220f;
        }
        return this.f17225a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f17226b)) {
                this.f17226b = a(f17222h, 32);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17226b;
    }

    private String a(String str, int i4) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }
}
