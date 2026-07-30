package com.baidu.ar;

/* loaded from: classes.dex */
public class fd {

    /* renamed from: a, reason: collision with root package name */
    public int f2234a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2235b = -1;

    public void a() {
        this.f2234a = -1;
        this.f2235b = -1;
    }

    public boolean b() {
        int i8 = this.f2234a;
        return (i8 == 1 || i8 == -1) && this.f2235b == 0;
    }

    public boolean c() {
        return this.f2234a == 0 && this.f2235b == 1;
    }

    public boolean a(boolean z7) {
        int i8 = this.f2235b;
        if (i8 != -1) {
            this.f2234a = i8;
            this.f2235b = !z7 ? 1 : 0;
        } else if (z7) {
            this.f2234a = i8;
            this.f2235b = 0;
        }
        return this.f2235b != -1;
    }
}
