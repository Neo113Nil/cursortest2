package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPStockInfo;
import com.crrepa.ble.conn.bean.CRPStockPriceInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12567a = 14;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12568b = 30;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12569c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12570d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12571e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12572f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12573g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12574h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final long f12575i = 10000;

    private i0() {
    }

    public static long a(float f8, long j8) {
        return new BigDecimal(f8).setScale(2, RoundingMode.HALF_UP).multiply(new BigDecimal(j8)).longValue();
    }

    private static long b(float f8, long j8) {
        return new BigDecimal(String.valueOf(f8)).multiply(new BigDecimal(j8)).longValue();
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{14, 1});
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{14, 0});
    }

    public static byte[] a(byte b8) {
        return g.a(-71, new byte[]{14, 4, b8});
    }

    public static byte[] a(CRPStockInfo cRPStockInfo) {
        byte[] bArr = new byte[113];
        bArr[0] = 14;
        bArr[1] = 2;
        bArr[2] = cRPStockInfo.getId();
        String abbreviation = cRPStockInfo.getAbbreviation();
        Charset charset = StandardCharsets.UTF_8;
        byte[] a8 = com.crrepa.g1.c.a(abbreviation, 50, charset);
        if (!com.crrepa.g1.c.h(a8)) {
            System.arraycopy(a8, 0, bArr, 3, a8.length);
        }
        byte[] a9 = com.crrepa.g1.c.a(cRPStockInfo.getCode(), 30, charset);
        if (!com.crrepa.g1.c.h(a9)) {
            System.arraycopy(a9, 0, bArr, 53, a9.length);
        }
        byte[] a10 = com.crrepa.g1.c.a(cRPStockInfo.getExchange(), 20, charset);
        if (!com.crrepa.g1.c.h(a10)) {
            System.arraycopy(a10, 0, bArr, 83, a10.length);
        }
        byte[] a11 = com.crrepa.g1.c.a(cRPStockInfo.getCurrency(), 10, charset);
        if (!com.crrepa.g1.c.h(a11)) {
            System.arraycopy(a11, 0, bArr, 103, a11.length);
        }
        return g.a(-71, bArr);
    }

    public static byte[] a(CRPStockPriceInfo cRPStockPriceInfo) {
        byte[] bArr = new byte[88];
        bArr[0] = 14;
        bArr[1] = 3;
        bArr[2] = cRPStockPriceInfo.getId();
        byte[] a8 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getPrice(), 10000L));
        System.arraycopy(a8, 0, bArr, 3, a8.length);
        int length = a8.length + 3;
        byte[] a9 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getChange(), 10000L));
        System.arraycopy(a9, 0, bArr, length, a9.length);
        int length2 = length + a9.length;
        byte[] a10 = com.crrepa.g1.c.a((int) a(cRPStockPriceInfo.getChangePercent(), 100L));
        System.arraycopy(a10, 0, bArr, length2, a10.length);
        int length3 = length2 + a10.length;
        byte[] a11 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getOpeningPrice(), 10000L));
        System.arraycopy(a11, 0, bArr, length3, a11.length);
        int length4 = length3 + a11.length;
        byte[] a12 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getHighestPrice(), 10000L));
        System.arraycopy(a12, 0, bArr, length4, a12.length);
        int length5 = length4 + a12.length;
        byte[] a13 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getLowestPrice(), 10000L));
        System.arraycopy(a13, 0, bArr, length5, a13.length);
        int length6 = length5 + a13.length;
        byte[] a14 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getYearHighestPrice(), 10000L));
        System.arraycopy(a14, 0, bArr, length6, a14.length);
        int length7 = length6 + a14.length;
        byte[] a15 = com.crrepa.g1.c.a(b(cRPStockPriceInfo.getYearLowestPrice(), 10000L));
        System.arraycopy(a15, 0, bArr, length7, a15.length);
        int length8 = length7 + a15.length;
        byte[] a16 = com.crrepa.g1.c.a((int) b(cRPStockPriceInfo.getPe(), 100L));
        System.arraycopy(a16, 0, bArr, length8, a16.length);
        int length9 = length8 + a16.length;
        byte[] a17 = com.crrepa.g1.c.a(cRPStockPriceInfo.getMarketValue());
        System.arraycopy(a17, 0, bArr, length9, a17.length);
        int length10 = length9 + a17.length;
        byte[] a18 = com.crrepa.g1.c.a(cRPStockPriceInfo.getTurnover());
        System.arraycopy(a18, 0, bArr, length10, a18.length);
        int length11 = length10 + a18.length;
        byte[] a19 = com.crrepa.g1.c.a(cRPStockPriceInfo.getAverage());
        System.arraycopy(a19, 0, bArr, length11, a19.length);
        bArr[length11 + a19.length] = (byte) (!cRPStockPriceInfo.isEnable() ? 1 : 0);
        return g.a(-71, bArr);
    }

    public static byte[] a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = 14;
        bArr2[1] = 5;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return g.a(-71, bArr2);
    }
}
