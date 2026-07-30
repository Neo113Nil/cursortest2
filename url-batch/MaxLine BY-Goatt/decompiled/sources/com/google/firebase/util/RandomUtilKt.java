package com.google.firebase.util;

import com.google.firebase.encoders.json.BuildConfig;
import defpackage.c62;
import defpackage.in1;
import defpackage.lh;
import defpackage.rv;
import defpackage.t31;
import defpackage.zv;
import java.util.ArrayList;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    public static final String nextAlphanumericString(c62 c62Var, int i) {
        c62Var.getClass();
        if (i < 0) {
            lh.c(in1.k(i, "invalid length: "));
            return null;
        }
        IntRange f = d.f(0, i);
        ArrayList arrayList = new ArrayList(rv.l(f, 10));
        t31 it = f.iterator();
        while (it.o) {
            it.nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(c62Var.d(30))));
        }
        return zv.A(arrayList, BuildConfig.FLAVOR, null, null, null, 62);
    }

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }
}
