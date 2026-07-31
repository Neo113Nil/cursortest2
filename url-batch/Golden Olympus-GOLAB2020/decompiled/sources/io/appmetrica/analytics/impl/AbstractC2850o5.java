package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2850o5 {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f39554a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39555b = "[ComponentMigrationToV113]";

    public AbstractC2850o5(C2953s5 c2953s5) {
        this.f39554a = c2953s5;
    }

    @NotNull
    public final C2953s5 a() {
        return this.f39554a;
    }

    @NotNull
    public final String b() {
        return this.f39555b;
    }

    public abstract boolean b(int i4);

    public abstract void c();

    public final void a(int i4) {
        if (b(i4)) {
            c();
        }
    }
}
