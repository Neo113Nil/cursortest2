package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class hn implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f26828b = a.f26829b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26829b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26830c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f26831d;

        static {
            a aVar = new a(0, "ACTIVE");
            f26829b = aVar;
            a aVar2 = new a(1, "CANCELED");
            f26830c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f26831d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26831d.clone();
        }
    }

    public final void a() {
        this.f26828b = a.f26830c;
    }

    public final boolean b() {
        return this.f26828b == a.f26829b;
    }
}
