package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface xa {

    public static final class a implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45212a = new a();
    }

    public static final class b implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f45213a;

        public b(@NotNull String operatorName) {
            Intrinsics.checkNotNullParameter(operatorName, "operatorName");
            this.f45213a = operatorName;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f45213a, ((b) obj).f45213a);
        }

        public final int hashCode() {
            return this.f45213a.hashCode();
        }

        @NotNull
        public final String toString() {
            return i1.a(new StringBuilder("PhoneSubmit(operatorName="), this.f45213a, ')');
        }
    }

    public static final class c implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f45214a = new c();
    }

    public static final class d implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f45215a = new d();
    }

    public static final class e implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f45216a = new e();
    }

    public static final class f implements xa {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f45217a = new f();
    }
}
