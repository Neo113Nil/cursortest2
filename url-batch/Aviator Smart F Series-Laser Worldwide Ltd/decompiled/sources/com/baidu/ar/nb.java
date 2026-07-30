package com.baidu.ar;

import com.baidu.ar.util.SystemInfoUtil;

/* loaded from: classes.dex */
public class nb extends y2 {

    /* renamed from: e, reason: collision with root package name */
    public nd f2853e;

    public nb(c7 c7Var, nd ndVar, int i8, int i9) {
        super(c7Var, i8, i9);
        this.f2853e = ndVar;
    }

    @Override // com.baidu.ar.y2, com.baidu.ar.s6
    public boolean a(float[] fArr) {
        int i8;
        int i9;
        String[] split = this.f2853e.e().split(SystemInfoUtil.COMMA);
        String a8 = this.f3743a.a(this.f2853e);
        int i10 = this.f3744b / 2;
        int i11 = this.f3745c / 2;
        try {
            int[] a9 = this.f3743a.a(Float.parseFloat(split[0].trim()), Float.parseFloat(split[1].trim()));
            i10 = a9[0];
            i9 = a9[1];
            i8 = i10;
        } catch (NumberFormatException unused) {
            h.b("model position is not number !!!");
            i8 = i10;
            i9 = i11;
        }
        this.f3743a.a(a8, i8, i9, y2.f3742d, this.f2853e.a());
        return true;
    }
}
