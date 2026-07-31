package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class sq1 implements Closeable, AutoCloseable {

    public static final class a {
        private a() {
        }

        public static rq1 a(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C3372e L3 = new C3372e().L(bArr);
            long length = bArr.length;
            Intrinsics.checkNotNullParameter(L3, "<this>");
            return new rq1(length, null, L3);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public abstract long a();

    @Nullable
    public abstract kw0 b();

    @NotNull
    public abstract okio.g c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v82.a((Closeable) c());
    }
}
