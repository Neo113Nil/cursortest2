package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import w3.AbstractC1510g;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916r6 implements Cf {

    /* renamed from: b, reason: collision with root package name */
    public static final C0891q6 f12648b = new C0891q6();

    /* renamed from: a, reason: collision with root package name */
    public final Cf f12649a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0916r6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public final String a() {
        return this.f12649a.a();
    }

    public final boolean b() {
        try {
            String a3 = this.f12649a.a();
            if (a3 != null && a3.length() > 0) {
                return !AbstractC1510g.c0(a3, StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0916r6(Cf cf) {
        this.f12649a = cf;
    }

    public final boolean a(String str) {
        try {
            String a3 = this.f12649a.a();
            if (a3 == null || a3.length() <= 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return w3.o.V(a3, sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0916r6(Cf cf, int i4, kotlin.jvm.internal.e eVar) {
        this(cf);
        if ((i4 & 1) != 0) {
            f12648b.getClass();
            cf = C0891q6.a();
        }
    }
}
