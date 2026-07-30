package com.instagram.common.viewpoint.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1297fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final List<C1455iN> A00;
    public final /* synthetic */ C1296fa A01;

    public C1297fb(C1296fa c1296fa, List<C1455iN> list) {
        this.A01 = c1296fa;
        this.A00 = list;
    }

    private void A00() {
        RO ro;
        RO ro2;
        RO ro3;
        C1159dL c1159dL;
        RO ro4;
        RO ro5;
        C1159dL c1159dL2;
        ro = this.A01.A00;
        ro.A05(true);
        ro2 = this.A01.A00;
        ro2.A02();
        ro3 = this.A01.A00;
        ro3.A03(0);
        Iterator<C1455iN> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                C1455iN next = it.next();
                c1159dL = this.A01.A01;
                S3 A0K = C0702Qc.A0K();
                ro4 = this.A01.A00;
                C0702Qc c0702Qc = new C0702Qc(c1159dL, next, null, A0K, ro4.A01());
                if (c0702Qc.A0z() != null && c0702Qc.A0z().A0F() != null) {
                    ((AbstractC1400hL) c0702Qc.A0z().A0F()).A00(c0702Qc);
                }
                ro5 = this.A01.A00;
                c1159dL2 = this.A01.A01;
                ro5.A04(new NativeAd(c1159dL2, c0702Qc));
            } else {
                AbstractC0837Vk.A00(new C1298fc(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        A00();
    }
}
