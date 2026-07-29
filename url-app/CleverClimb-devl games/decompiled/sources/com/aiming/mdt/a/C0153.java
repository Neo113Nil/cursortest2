package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.a.C0177;
import com.aiming.mdt.core.AbstractC0256;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʽʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0153 extends C0177.AbstractC0178 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0088 f509;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ int f510;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0046 f511;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ String f512;

    C0153(C0046 c0046, String str, C0088 c0088, int i) {
        this.f511 = c0046;
        this.f512 = str;
        this.f509 = c0088;
        this.f510 = i;
    }

    @Override // com.aiming.mdt.a.C0177.AbstractC0178
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void mo591(String str) {
        String str2;
        C0045 c0045;
        C0045 c00452;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("callback pkgName :");
        sb.append(this.f512);
        sb.append(":");
        sb.append(str);
        C0282.m971(sb.toString());
        if (TextUtils.isEmpty(str)) {
            str4 = ((AbstractC0256) this.f511).f782;
            str = C0177.m674(str4, this.f509.m311());
        }
        this.f511.f89 = str;
        StringBuilder sb2 = new StringBuilder("PackageName:");
        sb2.append(this.f512);
        sb2.append(":");
        str2 = this.f511.f89;
        sb2.append(str2);
        C0282.m971(sb2.toString());
        c0045 = ((AbstractC0256) this.f511).f780;
        if (c0045 != null) {
            c00452 = ((AbstractC0256) this.f511).f780;
            if (c00452.m119() == 1) {
                C0193 m726 = C0193.m726();
                str3 = ((AbstractC0256) this.f511).f782;
                m726.m729(str3, this.f510, str);
            }
        }
    }
}
