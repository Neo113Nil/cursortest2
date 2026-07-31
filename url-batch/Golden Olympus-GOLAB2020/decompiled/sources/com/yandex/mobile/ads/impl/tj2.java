package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class tj2 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final sf1 f32459m = new sf1();

    /* renamed from: n, reason: collision with root package name */
    private final pj2 f32460n = new pj2();

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        rj2 a4;
        this.f32459m.a(i4, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            sf1 sf1Var = this.f32459m;
            int i5 = uj2.f33155a;
            int d4 = sf1Var.d();
            String j4 = sf1Var.j();
            if (j4 == null || !j4.startsWith("WEBVTT")) {
                sf1Var.e(d4);
                throw wf1.a("Expected WEBVTT. Got " + sf1Var.j(), (Exception) null);
            }
            while (!TextUtils.isEmpty(this.f32459m.j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                sf1 sf1Var2 = this.f32459m;
                int i6 = 0;
                char c4 = 65535;
                while (c4 == 65535) {
                    i6 = sf1Var2.d();
                    String j5 = sf1Var2.j();
                    c4 = j5 == null ? (char) 0 : "STYLE".equals(j5) ? (char) 2 : j5.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                sf1Var2.e(i6);
                if (c4 == 0) {
                    return new vj2(arrayList2);
                }
                if (c4 == 1) {
                    while (!TextUtils.isEmpty(this.f32459m.j())) {
                    }
                } else if (c4 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new e32("A style block was found after the first cue.");
                    }
                    this.f32459m.j();
                    arrayList.addAll(this.f32460n.a(this.f32459m));
                } else if (c4 == 3 && (a4 = sj2.a(this.f32459m, arrayList)) != null) {
                    arrayList2.add(a4);
                }
            }
        } catch (wf1 e4) {
            throw new e32(e4);
        }
    }
}
