package com.yandex.mobile.ads.impl;

import android.view.View;
import b2.AbstractC1372b;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface bg2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23744b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f23745c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f23746d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f23747e;

        static {
            a aVar = new a(0, "FIRST_QUARTILE");
            f23744b = aVar;
            a aVar2 = new a(1, "MIDPOINT");
            f23745c = aVar2;
            a aVar3 = new a(2, "THIRD_QUARTILE");
            f23746d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f23747e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f23747e.clone();
        }
    }

    void a();

    void a(float f4);

    void a(float f4, long j4);

    void a(@NotNull View view, @NotNull List<mb2> list);

    void a(@NotNull a aVar);

    void a(@NotNull mc2 mc2Var);

    void a(@NotNull String str);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    void m();

    void n();
}
