package com.aiming.mdt.a;

import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0030 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ C0088 f24;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0049 f25;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ String f26;

    RunnableC0030(C0049 c0049, String str, C0088 c0088) {
        this.f25 = c0049;
        this.f26 = str;
        this.f24 = c0088;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        map = this.f25.f98;
        map.get(this.f26);
    }
}
