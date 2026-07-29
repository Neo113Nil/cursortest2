package com.appsflyer;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3484a;

    /* renamed from: b, reason: collision with root package name */
    private long f3485b;

    /* renamed from: c, reason: collision with root package name */
    private String f3486c;

    q() {
    }

    q(long j, String str) {
        this.f3484a = new Object();
        this.f3485b = 0L;
        this.f3486c = "";
        this.f3485b = j;
        this.f3486c = str;
    }

    q(String str) {
        this(System.currentTimeMillis(), str);
    }

    static q a(String str) {
        if (str == null) {
            return new q(0L, "");
        }
        String[] split = str.split(",");
        if (split.length >= 2) {
            return new q(Long.parseLong(split[0]), split[1]);
        }
        return new q(0L, "");
    }

    final boolean a(q qVar) {
        return a(qVar.f3485b, qVar.f3486c);
    }

    private boolean a(long j, String str) {
        synchronized (this.f3484a) {
            if (str != null) {
                if (!str.equals(this.f3486c)) {
                    if (j - this.f3485b > 2000) {
                        this.f3485b = j;
                        this.f3486c = str;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3485b);
        sb.append(",");
        sb.append(this.f3486c);
        return sb.toString();
    }

    final String a() {
        return this.f3486c;
    }
}
