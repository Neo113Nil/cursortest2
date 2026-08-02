package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0354a5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f6986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6987b = "[ComponentMigrationToV113]";

    public AbstractC0354a5(C0457e5 c0457e5) {
        this.f6986a = c0457e5;
    }

    public final C0457e5 a() {
        return this.f6986a;
    }

    public final String b() {
        return this.f6987b;
    }

    public abstract boolean b(int i3);

    public abstract void c();

    public final void a(int i3) {
        if (b(i3)) {
            c();
        }
    }
}
