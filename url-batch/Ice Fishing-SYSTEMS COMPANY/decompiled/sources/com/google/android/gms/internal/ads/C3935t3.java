package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3935t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34340b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34344f;

    public /* synthetic */ C3935t3(int i, int i4, int i9, int i10, int i11, int i12) {
        this.f34339a = i;
        this.f34340b = i4;
        this.f34341c = i9;
        this.f34342d = i10;
        this.f34343e = i11;
        this.f34344f = i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C3935t3 a(String str) {
        char c4;
        PA.n(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i4 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i9 == -1 || i10 == -1 || i12 == -1) {
                    return null;
                }
                return new C3935t3(i4, i9, i10, i11, i12, length);
            }
            String f6 = AbstractC3035cL.f(split[i].trim());
            switch (f6.hashCode()) {
                case 100571:
                    if (f6.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3556653:
                    if (f6.equals(com.anythink.basead.exoplayer.k.o.f8603c)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 102749521:
                    if (f6.equals("layer")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109757538:
                    if (f6.equals(com.anythink.expressad.foundation.d.d.cg)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109780401:
                    if (f6.equals(com.anythink.expressad.foundation.h.k.f19792e)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                i4 = i;
            } else if (c4 == 1) {
                i9 = i;
            } else if (c4 == 2) {
                i10 = i;
            } else if (c4 == 3) {
                i11 = i;
            } else if (c4 == 4) {
                i12 = i;
            }
            i++;
        }
    }
}
