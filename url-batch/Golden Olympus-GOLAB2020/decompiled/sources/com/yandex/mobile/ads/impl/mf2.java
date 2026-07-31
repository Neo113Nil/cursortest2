package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uy1 f29044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uy1 f29045b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29046b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f29047c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f29048d;

        static {
            a aVar = new a(0, "LEFT_TOP");
            f29046b = aVar;
            a aVar2 = new a(1, "CENTER");
            f29047c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f29048d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29048d.clone();
        }
    }

    public mf2(@NotNull uy1 viewSize, @NotNull uy1 videoSize) {
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        this.f29044a = viewSize;
        this.f29045b = videoSize;
    }

    private final Matrix a(float f4, float f5, a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f4, f5, 0.0f, 0.0f);
            return matrix;
        }
        if (ordinal != 1) {
            throw new W1.m();
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f4, f5, this.f29044a.b() / 2.0f, this.f29044a.a() / 2.0f);
        return matrix2;
    }

    @Nullable
    public final Matrix a(@NotNull nf2 videoScaleType) {
        Intrinsics.checkNotNullParameter(videoScaleType, "videoScaleType");
        uy1 uy1Var = this.f29045b;
        if (uy1Var.b() <= 0 || uy1Var.a() <= 0) {
            return null;
        }
        uy1 uy1Var2 = this.f29044a;
        if (uy1Var2.b() <= 0 || uy1Var2.a() <= 0) {
            return null;
        }
        int ordinal = videoScaleType.ordinal();
        if (ordinal == 0) {
            return a(1.0f, 1.0f, a.f29046b);
        }
        if (ordinal == 1) {
            float b4 = this.f29044a.b() / this.f29045b.b();
            float a4 = this.f29044a.a() / this.f29045b.a();
            float min = Math.min(b4, a4);
            return a(min / b4, min / a4, a.f29047c);
        }
        if (ordinal == 2) {
            float b5 = this.f29044a.b() / this.f29045b.b();
            float a5 = this.f29044a.a() / this.f29045b.a();
            float max = Math.max(b5, a5);
            return a(max / b5, max / a5, a.f29047c);
        }
        throw new W1.m();
    }
}
