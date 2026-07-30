package com.crrepa.k;

import com.crrepa.ble.conn.type.CRPEcgMeasureType;

/* loaded from: classes3.dex */
public class b {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13124a;

        static {
            int[] iArr = new int[CRPEcgMeasureType.values().length];
            f13124a = iArr;
            try {
                iArr[CRPEcgMeasureType.TYHX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13124a[CRPEcgMeasureType.TI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public com.crrepa.k.a a(CRPEcgMeasureType cRPEcgMeasureType) {
        int i8 = a.f13124a[cRPEcgMeasureType.ordinal()];
        if (i8 == 1) {
            return new d();
        }
        if (i8 != 2) {
            return null;
        }
        return new c();
    }
}
