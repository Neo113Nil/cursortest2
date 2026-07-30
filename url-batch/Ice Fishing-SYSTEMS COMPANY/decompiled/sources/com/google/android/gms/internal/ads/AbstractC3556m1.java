package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3556m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final TC f32640a = new TC(new int[]{0, 2, 1}, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final TC f32641b = new TC(new int[]{0, 2, 1, 3, 4}, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final TC f32642c = new TC(new int[]{0, 2, 1, 5, 3, 4}, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final TC f32643d;

    /* renamed from: e, reason: collision with root package name */
    public static final TC f32644e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        f32643d = new TC(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        f32644e = new TC(iArr2, 8);
    }

    public static R3 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = AbstractC3548lu.f32613a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC3217fl.I("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(Q1.b(new Lr(Base64.decode(split[1], 0))));
                } catch (RuntimeException e6) {
                    AbstractC3217fl.O("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new C3395j2(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new R3(arrayList);
    }
}
