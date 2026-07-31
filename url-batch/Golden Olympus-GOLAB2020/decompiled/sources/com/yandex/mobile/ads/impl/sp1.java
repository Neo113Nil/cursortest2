package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class sp1 {

    public static final class a {
        private a() {
        }

        public static rp1 a(byte[] bArr) {
            int length = bArr.length;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length2 = bArr.length;
            long j4 = 0;
            long j5 = length;
            byte[] bArr2 = v82.f33550a;
            if ((j4 | j5) < 0 || j4 > length2 || length2 - j4 < j5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new rp1(null, bArr, length, 0);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    @NotNull
    public static final rp1 a(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        long length2 = content.length;
        long j4 = 0;
        long j5 = length;
        byte[] bArr = v82.f33550a;
        if ((j4 | j5) < 0 || j4 > length2 || length2 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new rp1(null, content, length, 0);
    }

    public abstract long a();

    public abstract void a(@NotNull okio.f fVar);

    @Nullable
    public abstract kw0 b();
}
