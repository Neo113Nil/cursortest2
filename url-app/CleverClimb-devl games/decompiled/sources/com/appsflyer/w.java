package com.appsflyer;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private a f3508a;

    /* renamed from: b, reason: collision with root package name */
    private String f3509b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3510c;

    w(a aVar, String str, boolean z) {
        this.f3508a = aVar;
        this.f3509b = str;
        this.f3510c = z;
    }

    final String a() {
        return this.f3509b;
    }

    final boolean b() {
        return this.f3510c;
    }

    public final String toString() {
        return String.format("%s,%s", this.f3509b, Boolean.valueOf(this.f3510c));
    }

    enum a {
        GOOGLE(0),
        AMAZON(1);


        /* renamed from: c, reason: collision with root package name */
        private int f3514c;

        a(int i) {
            this.f3514c = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return String.valueOf(this.f3514c);
        }
    }
}
