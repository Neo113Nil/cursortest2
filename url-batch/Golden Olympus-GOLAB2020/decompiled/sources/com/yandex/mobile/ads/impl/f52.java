package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f52 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f25627c;

    /* renamed from: d, reason: collision with root package name */
    public static final f52 f25628d;

    /* renamed from: e, reason: collision with root package name */
    public static final f52 f25629e;

    /* renamed from: f, reason: collision with root package name */
    public static final f52 f25630f;

    /* renamed from: g, reason: collision with root package name */
    public static final f52 f25631g;

    /* renamed from: h, reason: collision with root package name */
    public static final f52 f25632h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ f52[] f25633i;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25634b;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public static f52 a(@NotNull String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return f52.f25630f;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return f52.f25629e;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return f52.f25628d;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return f52.f25631g;
                }
            } else if (javaName.equals("SSLv3")) {
                return f52.f25632h;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        f52 f52Var = new f52(0, "TLS_1_3", "TLSv1.3");
        f25628d = f52Var;
        f52 f52Var2 = new f52(1, "TLS_1_2", "TLSv1.2");
        f25629e = f52Var2;
        f52 f52Var3 = new f52(2, "TLS_1_1", "TLSv1.1");
        f25630f = f52Var3;
        f52 f52Var4 = new f52(3, "TLS_1_0", "TLSv1");
        f25631g = f52Var4;
        f52 f52Var5 = new f52(4, "SSL_3_0", "SSLv3");
        f25632h = f52Var5;
        f52[] f52VarArr = {f52Var, f52Var2, f52Var3, f52Var4, f52Var5};
        f25633i = f52VarArr;
        AbstractC1372b.a(f52VarArr);
        f25627c = new a(0);
    }

    private f52(int i4, String str, String str2) {
        this.f25634b = str2;
    }

    public static f52 valueOf(String str) {
        return (f52) Enum.valueOf(f52.class, str);
    }

    public static f52[] values() {
        return (f52[]) f25633i.clone();
    }

    @NotNull
    public final String a() {
        return this.f25634b;
    }
}
