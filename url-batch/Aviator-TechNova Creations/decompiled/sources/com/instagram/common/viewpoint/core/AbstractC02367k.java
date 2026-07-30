package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02367k extends AbstractC1756nW<C02357j, AbstractC02347i, C1574kM> implements InterfaceC1575kN {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{Ascii.FS, 53, 44, Utf8.REPLACEMENT_BYTE, 55, 44, 42, 59, 44, 43, -25, 43, 44, 42, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract J7 A0g(byte[] bArr, int i, boolean z) throws C1574kM;

    static {
        A0M();
    }

    public AbstractC02367k(String str) {
        super(new C02357j[2], new AbstractC02347i[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0w] */
    @Override // com.instagram.common.viewpoint.core.AbstractC1756nW
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C00680w A0c() {
        return new AbstractC02347i(this) { // from class: com.facebook.ads.redexgen.X.0w
            public final AbstractC02367k A00;

            {
                this.A00 = this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC02347i, com.instagram.common.viewpoint.core.AbstractC1757nX
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1756nW
    /* renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C1574kM A0Y(C02357j c02357j, AbstractC02347i abstractC02347i, boolean z) {
        try {
            ByteBuffer inputData = (ByteBuffer) C3M.A01(c02357j.A02);
            abstractC02347i.A0C(c02357j.A01, A0g(inputData.array(), inputData.limit(), z), c02357j.A00);
            abstractC02347i.A01(Integer.MIN_VALUE);
            return null;
        } catch (C1574kM e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1756nW
    /* renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C1574kM A0Z(Throwable th) {
        return new C1574kM(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1756nW
    /* renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C02357j A0a() {
        return new C02357j();
    }

    public final void A0h(AbstractC02347i abstractC02347i) {
        super.A0f(abstractC02347i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1575kN
    public final void AIx(long j) {
    }
}
