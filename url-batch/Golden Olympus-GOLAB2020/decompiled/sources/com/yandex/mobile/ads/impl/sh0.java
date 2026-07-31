package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sh0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f31742a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f31743a;

        @NotNull
        public final a a(@Nullable String str) {
            return this;
        }

        @NotNull
        public final a b(@Nullable String str) {
            rd2.a(str);
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            rd2.b(str);
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            b bVar;
            b[] values = b.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i4];
                if (Intrinsics.areEqual(bVar.a(), str)) {
                    break;
                }
                i4++;
            }
            if (bVar == null) {
                bVar = b.f31744c;
            }
            if (bVar == b.f31744c) {
                rd2.b(str);
            }
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            rd2.a(str);
            return this;
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.f31743a = str;
            return this;
        }

        @NotNull
        public final a g(@Nullable String str) {
            c[] values = c.values();
            int length = values.length;
            for (int i4 = 0; i4 < length && !Intrinsics.areEqual(values[i4].a(), str); i4++) {
            }
            return this;
        }

        @NotNull
        public final void h(@Nullable String str) {
        }

        @NotNull
        public final a i(@Nullable String str) {
            d dVar;
            d[] values = d.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i4];
                if (Intrinsics.areEqual(dVar.a(), str)) {
                    break;
                }
                i4++;
            }
            if (dVar == null) {
                dVar = d.f31750c;
            }
            if (dVar == d.f31750c) {
                rd2.b(str);
            }
            return this;
        }

        @NotNull
        public final a j(@Nullable String str) {
            rd2.b(str);
            return this;
        }

        @NotNull
        public final sh0 a() {
            return new sh0(this.f31743a, 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f31744c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f31745d;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f31746b;

        static {
            b bVar = new b(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
            b bVar2 = new b(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
            b bVar3 = new b(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
            f31744c = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f31745d = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str, String str2) {
            this.f31746b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31745d.clone();
        }

        @NotNull
        public final String a() {
            return this.f31746b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f31747c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f31748d;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f31749b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i4) {
                this();
            }
        }

        static {
            c[] cVarArr = {new c(0, "STATIC_RESOURCE", "StaticResource"), new c(1, "IFRAME_RESOURCE", "IFrameResource"), new c(2, "HTML_RESOURCE", "HTMLResource")};
            f31748d = cVarArr;
            AbstractC1372b.a(cVarArr);
            f31747c = new a(0);
        }

        private c(int i4, String str, String str2) {
            this.f31749b = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f31748d.clone();
        }

        @NotNull
        public final String a() {
            return this.f31749b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public static final d f31750c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f31751d;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f31752b;

        static {
            d dVar = new d(0, "ICON_VERTICAL_POSITION_TOP", "top");
            d dVar2 = new d(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
            d dVar3 = new d(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
            f31750c = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            f31751d = dVarArr;
            AbstractC1372b.a(dVarArr);
        }

        private d(int i4, String str, String str2) {
            this.f31752b = str2;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f31751d.clone();
        }

        @NotNull
        public final String a() {
            return this.f31752b;
        }
    }

    private sh0(String str) {
        this.f31742a = str;
    }

    @Nullable
    public final String a() {
        return this.f31742a;
    }

    public /* synthetic */ sh0(String str, int i4) {
        this(str);
    }
}
