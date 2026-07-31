package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface x60 extends r52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n52 f34456a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f34457b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34458c;

        public a(int i4, n52 n52Var, int[] iArr) {
            if (iArr.length == 0) {
                ms0.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f34456a = n52Var;
            this.f34457b = iArr;
            this.f34458c = i4;
        }
    }

    public interface b {
    }

    void a(float f4);

    default void a(boolean z4) {
    }

    void c();

    void d();

    yb0 e();

    default void f() {
    }

    default void g() {
    }
}
