package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126y6 implements Hf {

    /* renamed from: b, reason: collision with root package name */
    public static final C1101x6 f9590b = new C1101x6();

    /* renamed from: a, reason: collision with root package name */
    public final Hf f9591a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1126y6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Hf
    public final String a() {
        return this.f9591a.a();
    }

    public final boolean b() {
        try {
            String a6 = this.f9591a.a();
            if (a6 != null && a6.length() > 0) {
                return !B4.k.R(a6, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C1126y6(Hf hf) {
        this.f9591a = hf;
    }

    public final boolean a(String str) {
        try {
            String a6 = this.f9591a.a();
            if (a6 == null || a6.length() <= 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return B4.r.H(a6, sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1126y6(Hf hf, int i2, kotlin.jvm.internal.e eVar) {
        this(hf);
        if ((i2 & 1) != 0) {
            f9590b.getClass();
            hf = C1101x6.a();
        }
    }
}
