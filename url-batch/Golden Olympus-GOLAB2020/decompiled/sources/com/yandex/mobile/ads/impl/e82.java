package com.yandex.mobile.ads.impl;

import android.content.Context;
import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface e82 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25146b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25147c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f25148d;

        static {
            a aVar = new a(0, "AD");
            f25146b = aVar;
            a aVar2 = new a(1, "PASSBACK");
            f25147c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f25148d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25148d.clone();
        }
    }

    @NotNull
    a a();

    @NotNull
    String a(@NotNull Context context, @NotNull C2286v2 c2286v2, @NotNull zw1 zw1Var);

    @Nullable
    String a(@NotNull C2286v2 c2286v2);
}
