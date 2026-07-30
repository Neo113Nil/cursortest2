package com.crrepa.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bean.CRPFutureWeatherInfo;
import com.crrepa.ble.conn.bean.CRPTodayWeatherInfo;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12466a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12467b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12468c = 25;

    /* renamed from: d, reason: collision with root package name */
    private static final String f12469d = "unicodebigunmarked";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12470e = "市";

    private c() {
    }

    private static String a(String str, int i8) {
        StringBuilder sb = new StringBuilder();
        for (int length = !TextUtils.isEmpty(str) ? str.length() : 0; length < i8; length++) {
            sb.append(cn.hutool.core.text.l.SPACE);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    @NonNull
    public static byte[] b(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
        byte[] bArr;
        byte[] bArr2;
        int i8;
        String festival = cRPTodayWeatherInfo.getFestival();
        String lunar = cRPTodayWeatherInfo.getLunar();
        int pm25 = cRPTodayWeatherInfo.getPm25();
        int temp = cRPTodayWeatherInfo.getTemp();
        int weatherId = cRPTodayWeatherInfo.getWeatherId();
        byte[] a8 = a(lunar, festival);
        try {
            bArr = a(cRPTodayWeatherInfo.getCity(), 8, Charset.forName(f12469d));
        } catch (UnsupportedCharsetException e8) {
            e8.printStackTrace();
            bArr = null;
        }
        int length = a8 != null ? a8.length : 0;
        if (bArr != null) {
            length += bArr.length;
        }
        int i9 = 3;
        if (pm25 <= 0) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 0;
        } else {
            byte[] bArr3 = new byte[length + 5];
            bArr3[0] = 1;
            System.arraycopy(com.crrepa.g1.c.b(pm25), 0, bArr3, 3, 2);
            bArr2 = bArr3;
            i9 = 5;
        }
        bArr2[1] = (byte) weatherId;
        bArr2[2] = (byte) temp;
        if (a8 != null) {
            i8 = a8.length;
            System.arraycopy(a8, 0, bArr2, i9, a8.length);
        } else {
            i8 = 0;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, i8 + i9, bArr.length);
        }
        return g.a(67, bArr2);
    }

    public static byte[] a(CRPFutureWeatherInfo cRPFutureWeatherInfo) {
        if (cRPFutureWeatherInfo == null || cRPFutureWeatherInfo.getFuture() == null) {
            return null;
        }
        List<CRPFutureWeatherInfo.FutureBean> future = cRPFutureWeatherInfo.getFuture();
        byte[] bArr = new byte[21];
        int i8 = 0;
        for (int i9 = 0; i9 < future.size() && i8 < 21; i9++) {
            CRPFutureWeatherInfo.FutureBean futureBean = future.get(i9);
            int lowTemperature = futureBean.getLowTemperature();
            int highTemperature = futureBean.getHighTemperature();
            bArr[i8] = (byte) futureBean.getWeatherId();
            int i10 = i8 + 2;
            bArr[i8 + 1] = (byte) lowTemperature;
            i8 += 3;
            bArr[i10] = (byte) highTemperature;
        }
        return g.a(66, bArr);
    }

    public static byte[] a(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
        byte[] a8 = a(cRPTodayWeatherInfo.getCity(), 25, StandardCharsets.UTF_8);
        byte[] bArr = new byte[a8 != null ? a8.length + 9 : 9];
        bArr[0] = 0;
        bArr[1] = (byte) cRPTodayWeatherInfo.getWeatherId();
        bArr[2] = (byte) cRPTodayWeatherInfo.getTemp();
        byte[] b8 = com.crrepa.g1.c.b(cRPTodayWeatherInfo.getPm25());
        bArr[3] = b8[1];
        bArr[4] = b8[0];
        bArr[5] = (byte) cRPTodayWeatherInfo.getSunriseHour();
        bArr[6] = (byte) cRPTodayWeatherInfo.getSunriseMinute();
        bArr[7] = (byte) cRPTodayWeatherInfo.getSunsetHour();
        bArr[8] = (byte) cRPTodayWeatherInfo.getSunsetMinute();
        if (a8 != null) {
            System.arraycopy(a8, 0, bArr, 9, a8.length);
        }
        return g.a(-75, bArr);
    }

    private static byte[] a(String str, int i8, Charset charset) {
        if (str.endsWith(f12470e)) {
            str = str.substring(0, str.length() - 1);
        }
        return com.crrepa.g1.c.a(str, i8, charset);
    }

    private static byte[] a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str) && str.length() > 4) {
            str = str.substring(0, 4);
        }
        try {
            return a(str, 4).getBytes(f12469d);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
