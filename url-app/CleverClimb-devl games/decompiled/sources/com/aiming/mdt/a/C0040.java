package com.aiming.mdt.a;

import android.app.Application;

/* renamed from: com.aiming.mdt.a.ʻʼʽˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0040 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f67;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static volatile C0040 f68;

    /* renamed from: ʻ, reason: contains not printable characters */
    private C0038 f69;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0040 m93() {
        if (f68 == null) {
            synchronized (C0040.class) {
                if (f68 == null) {
                    f68 = new C0040();
                }
            }
        }
        return f68;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static /* synthetic */ void m94(C0040 c0040) {
        Application m738 = C0195.m731().m738();
        C0131 m735 = C0195.m731().m735();
        c0040.f69 = new C0038(m738);
        c0040.f69.loadUrl(m735.m482());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0038 m95() {
        if (!(this.f69 != null)) {
            return null;
        }
        return this.f69;
    }
}
