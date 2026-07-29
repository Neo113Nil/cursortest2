package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.a.C0177;
import com.aiming.mdt.core.AbstractC0256;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0181 extends C0177.AbstractC0178 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0088 f627;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f628;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0089 f629;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ int f630;

    C0181(C0089 c0089, C0088 c0088, String str, int i) {
        this.f629 = c0089;
        this.f627 = c0088;
        this.f628 = str;
        this.f630 = i;
    }

    @Override // com.aiming.mdt.a.C0177.AbstractC0178
    /* renamed from: ʻʽ */
    public final void mo591(String str) {
        String str2;
        C0045 c0045;
        C0045 c00452;
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = ((AbstractC0256) this.f629).f782;
            str = C0177.m674(str4, this.f627.m311());
        }
        this.f629.f245 = str;
        StringBuilder sb = new StringBuilder("PackageName:");
        sb.append(this.f628);
        sb.append(":");
        str2 = this.f629.f245;
        sb.append(str2);
        C0282.m971(sb.toString());
        c0045 = ((AbstractC0256) this.f629).f780;
        if (c0045 != null) {
            c00452 = ((AbstractC0256) this.f629).f780;
            if (c00452.m119() == 1) {
                C0193 m726 = C0193.m726();
                str3 = ((AbstractC0256) this.f629).f782;
                m726.m729(str3, this.f630, str);
            }
        }
    }
}
