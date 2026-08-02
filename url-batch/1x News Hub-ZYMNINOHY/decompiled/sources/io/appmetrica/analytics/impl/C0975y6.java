package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975y6 implements Hf {

    /* renamed from: b, reason: collision with root package name */
    public static final C0950x6 f8634b = new C0950x6();

    /* renamed from: a, reason: collision with root package name */
    public final Hf f8635a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0975y6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Hf
    public final String a() {
        return this.f8635a.a();
    }

    public final boolean b() {
        try {
            String a3 = this.f8635a.a();
            if (a3 != null && a3.length() > 0) {
                return !s2.n.R(a3, StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0975y6(Hf hf) {
        this.f8635a = hf;
    }

    public final boolean a(String str) {
        try {
            String a3 = this.f8635a.a();
            if (a3 != null && a3.length() > 0) {
                String suffix = StringUtils.PROCESS_POSTFIX_DELIMITER + str;
                kotlin.jvm.internal.j.e(suffix, "suffix");
                if (a3.endsWith(suffix)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0975y6(Hf hf, int i3, kotlin.jvm.internal.f fVar) {
        this(hf);
        if ((i3 & 1) != 0) {
            f8634b.getClass();
            hf = C0950x6.a();
        }
    }
}
