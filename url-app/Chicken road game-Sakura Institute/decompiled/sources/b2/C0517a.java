package b2;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517a {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f5629c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f5630d;

    /* renamed from: a, reason: collision with root package name */
    public final int f5631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5632b;

    static {
        HashMap hashMap = new HashMap();
        f5629c = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f5630d = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    public C0517a(int i2, String str) {
        this.f5631a = i2;
        this.f5632b = str;
    }

    public static C0517a a(String str, String str2) {
        Integer num = (Integer) f5630d.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f5629c.get(num);
        }
        return new C0517a(num.intValue(), str2);
    }

    public final String toString() {
        return "DatabaseError: " + this.f5632b;
    }
}
