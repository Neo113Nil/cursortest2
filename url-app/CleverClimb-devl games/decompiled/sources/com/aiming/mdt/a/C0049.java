package com.aiming.mdt.a;

import com.aiming.mdt.utils.C0285;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0049 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private Map<String, C0285.InterfaceC0286> f98;

    /* renamed from: com.aiming.mdt.a.ʻʼʾˈˉ$ʻ, reason: contains not printable characters */
    static final class C0050 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private static final C0049 f99 = new C0049(0);
    }

    static {
        new HashMap();
    }

    private C0049() {
        this.f98 = new HashMap();
    }

    /* synthetic */ C0049(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0049 m149() {
        return C0050.f99;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m151(String str, C0088 c0088) {
        if (this.f98 == null || !this.f98.containsKey(str)) {
            return;
        }
        this.f98.get(str);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final synchronized void m152(String str, C0088 c0088) {
        if (this.f98 != null && this.f98.containsKey(str)) {
            this.f98.get(str);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m153(String str, C0088 c0088) {
        if (this.f98 == null || !this.f98.containsKey(str)) {
            return;
        }
        C0285.m979(new RunnableC0030(this, str, c0088));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m154(String str, boolean z, int i, int i2) {
        if (this.f98 == null || !this.f98.containsKey(str)) {
            return;
        }
        this.f98.get(str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m155(String str, C0088 c0088) {
        if (this.f98 == null || !this.f98.containsKey(str)) {
            return;
        }
        this.f98.get(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m156(String str, C0088 c0088) {
        if (this.f98 == null || !this.f98.containsKey(str)) {
            return;
        }
        C0285.m979(new RunnableC0056(this, str, c0088));
    }
}
