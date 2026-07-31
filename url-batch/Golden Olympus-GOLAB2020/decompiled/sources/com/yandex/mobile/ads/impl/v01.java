package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v01 {

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.v01$a$a, reason: collision with other inner class name */
        public static final class C0204a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0204a f33458a = new C0204a();

            private C0204a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<jo0> f33459a;

            public b(@NotNull List<jo0> causes) {
                Intrinsics.checkNotNullParameter(causes, "causes");
                this.f33459a = causes;
            }

            @NotNull
            public final List<jo0> a() {
                return this.f33459a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f33459a, ((b) obj).f33459a);
            }

            public final int hashCode() {
                return this.f33459a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "IncorrectIntegration(causes=" + this.f33459a + ")";
            }
        }
    }

    @NotNull
    public static a a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m01 m01Var = new m01(new xa2());
        C1888e1 c1888e1 = new C1888e1();
        C2252te c2252te = new C2252te();
        jo0 e4 = null;
        try {
            m01Var.a(t01.f32106b);
            e = null;
        } catch (jo0 e5) {
            e = e5;
        }
        try {
            c1888e1.a(context);
            e = null;
        } catch (jo0 e6) {
            e = e6;
        }
        try {
            mg1.a(context);
            e = null;
        } catch (jo0 e7) {
            e = e7;
        }
        try {
            c2252te.a();
        } catch (jo0 e8) {
            e4 = e8;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new jo0[]{e, e, e, e4});
        return !listOfNotNull.isEmpty() ? new a.b(listOfNotNull) : a.C0204a.f33458a;
    }
}
