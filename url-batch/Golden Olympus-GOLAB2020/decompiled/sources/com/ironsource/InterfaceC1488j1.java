package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1488j1 {

    @Metadata
    /* renamed from: com.ironsource.j1$a */
    public static final class a implements InterfaceC1488j1 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0149a f16780c = new C0149a(null);

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f16781a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16782b;

        @Metadata
        /* renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        public static final class C0149a {
            private C0149a() {
            }

            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }

            public /* synthetic */ C0149a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a a(a aVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aVar.f16781a;
            }
            return aVar.a(str);
        }

        @Nullable
        public final String b() {
            return this.f16781a;
        }

        @Nullable
        public final String c() {
            return this.f16781a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f16781a, ((a) obj).f16781a);
        }

        public int hashCode() {
            String str = this.f16781a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotReady(reason=" + this.f16781a + ')';
        }

        public a(@Nullable String str) {
            this.f16781a = str;
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        public /* synthetic */ a(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC1488j1
        public boolean a() {
            return this.f16782b;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.j1$b */
    public static final class b implements InterfaceC1488j1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f16783a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f16784b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC1488j1
        public boolean a() {
            return f16784b;
        }
    }

    boolean a();
}
