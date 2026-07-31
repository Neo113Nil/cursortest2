package com.yandex.mobile.ads.impl;

import android.util.Base64;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1930fj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1930fj f25812a = new C1930fj();

    private C1930fj() {
    }

    @NotNull
    public static final byte[] a(@Nullable String str) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            if (str == null) {
                str = "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] c4 = AbstractC2419b.c(gZIPInputStream);
                    AbstractC2420c.a(gZIPInputStream, null);
                    AbstractC2420c.a(byteArrayInputStream, null);
                    m243constructorimpl = Result.m243constructorimpl(c4);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = new byte[0];
        }
        return (byte[]) m243constructorimpl;
    }

    @NotNull
    public static final String b(@Nullable String str) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(new String(a(str), Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = "";
        }
        return (String) m243constructorimpl;
    }

    @NotNull
    public static final String c(@Nullable String str) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNull(decode);
            Charset charset = Charsets.UTF_8;
            m243constructorimpl = Result.m243constructorimpl(new String(a(new String(decode, charset)), charset));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = "";
        }
        return (String) m243constructorimpl;
    }
}
