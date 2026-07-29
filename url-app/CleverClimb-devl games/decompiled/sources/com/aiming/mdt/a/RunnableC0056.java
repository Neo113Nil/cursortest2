package com.aiming.mdt.a;

import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0056 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f119;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ C0049 f120;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ C0088 f121;

    RunnableC0056(C0049 c0049, String str, C0088 c0088) {
        this.f120 = c0049;
        this.f119 = str;
        this.f121 = c0088;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        map = this.f120.f98;
        map.get(this.f119);
    }
}
