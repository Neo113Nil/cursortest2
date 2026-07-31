package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sj2;
import com.yandex.mobile.ads.impl.uu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class p11 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final sf1 f30265m = new sf1();

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        uu a4;
        this.f30265m.a(i4, bArr);
        ArrayList arrayList = new ArrayList();
        while (this.f30265m.a() > 0) {
            if (this.f30265m.a() < 8) {
                throw new e32("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int h4 = this.f30265m.h();
            if (this.f30265m.h() == 1987343459) {
                sf1 sf1Var = this.f30265m;
                int i5 = h4 - 8;
                CharSequence charSequence = null;
                uu.a aVar = null;
                while (i5 > 0) {
                    if (i5 < 8) {
                        throw new e32("Incomplete vtt cue box header found.");
                    }
                    int h5 = sf1Var.h();
                    int h6 = sf1Var.h();
                    int i6 = h5 - 8;
                    String a5 = u82.a(sf1Var.c(), sf1Var.d(), i6);
                    sf1Var.f(i6);
                    i5 = (i5 - 8) - i6;
                    if (h6 == 1937011815) {
                        aVar = sj2.a(a5);
                    } else if (h6 == 1885436268) {
                        charSequence = sj2.a(null, a5.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    a4 = aVar.a(charSequence).a();
                } else {
                    Pattern pattern = sj2.f31770a;
                    sj2.d dVar = new sj2.d();
                    dVar.f31785c = charSequence;
                    a4 = dVar.a().a();
                }
                arrayList.add(a4);
            } else {
                this.f30265m.f(h4 - 8);
            }
        }
        return new q11(arrayList);
    }
}
