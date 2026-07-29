package com.aiming.mdt.core;

import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0177;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.core.ʻʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0245 extends C0177.AbstractC0178 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ AbstractC0253 f764;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ C0088 f765;

    C0245(AbstractC0253 abstractC0253, C0088 c0088) {
        this.f764 = abstractC0253;
        this.f765 = c0088;
    }

    @Override // com.aiming.mdt.a.C0177.AbstractC0178
    /* renamed from: ʻʽ */
    public final void mo591(String str) {
        StringBuilder sb = new StringBuilder("PackageName:");
        sb.append(this.f765.m304());
        sb.append(":");
        sb.append(str);
        C0282.m971(sb.toString());
    }
}
