package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class T4 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f10976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10977b = "[ComponentMigrationToV113]";

    public T4(X4 x4) {
        this.f10976a = x4;
    }

    public final X4 a() {
        return this.f10976a;
    }

    public final String b() {
        return this.f10977b;
    }

    public abstract boolean b(int i4);

    public abstract void c();

    public final void a(int i4) {
        if (b(i4)) {
            c();
        }
    }
}
