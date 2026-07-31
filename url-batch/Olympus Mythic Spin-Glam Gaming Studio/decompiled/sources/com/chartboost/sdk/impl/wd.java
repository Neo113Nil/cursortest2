package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes11.dex */
public final class wd {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public final Throwable d;
    public final String e;
    public final Lazy f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return this.a == wdVar.a && this.b == wdVar.b && Intrinsics.areEqual(this.c, wdVar.c) && Intrinsics.areEqual(this.d, wdVar.d) && Intrinsics.areEqual(this.e, wdVar.e);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31;
        byte[] bArr = this.c;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th = this.d;
        int hashCode3 = (hashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(isSuccessful=" + this.a + ", statusCode=" + this.b + ", bytes=" + Arrays.toString(this.c) + ", error=" + this.d + ", charset=" + this.e + ")";
    }

    public wd(boolean z, int i, byte[] bArr, Throwable th, String str) {
        this.a = z;
        this.b = i;
        this.c = bArr;
        this.d = th;
        this.e = str;
        this.f = LazyKt.lazy(new a());
    }

    public final boolean f() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final byte[] b() {
        return this.c;
    }

    public final Throwable d() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            byte[] b = wd.this.b();
            if (b == null) {
                return null;
            }
            String c = wd.this.c();
            if (c == null) {
                c = Charsets.UTF_8.name();
            }
            try {
                Intrinsics.checkNotNull(c);
                Charset forName = Charset.forName(c);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                return new String(b, forName);
            } catch (Exception unused) {
                return new String(b, Charsets.UTF_8);
            }
        }
    }

    public final String a() {
        return (String) this.f.getValue();
    }

    public /* synthetic */ wd(boolean z, int i, byte[] bArr, Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? null : str);
    }
}
