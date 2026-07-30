package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class TS implements Callable<Boolean> {
    public static byte[] A04;
    public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ SQ A01;
    public final /* synthetic */ T6 A02;
    public final /* synthetic */ String A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{37, 105, 103, 122, 105, 121, Base64.padSymbol, 49, 51, 112, Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
    }

    static {
        A02();
    }

    public TS(SQ sq, T6 t6, SharedPreferences sharedPreferences, String str) {
        this.A01 = sq;
        this.A02 = t6;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.equals(r0) != false) goto L6;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean call() throws Exception {
        AtomicInteger atomicInteger;
        String str = null;
        if (Build.VERSION.SDK_INT < 31) {
            String A01 = A01(0, 1, 88);
            String checksumApiFingerprint = Build.VERSION.CODENAME;
        }
        if (U7.A2g(this.A01)) {
            String A0B = this.A02.A0B();
            String checksumApiFingerprint2 = A01(6, 19, 112);
            if (checksumApiFingerprint2.equals(A0B)) {
                SQ sq = this.A01;
                String checksumApiFingerprint3 = this.A01.getPackageName();
                str = C0865Wo.A01(sq, checksumApiFingerprint3);
            }
        }
        if (str == null) {
            SQ sq2 = this.A01;
            String checksumApiFingerprint4 = this.A01.getPackageName();
            TT.A00 = W4.A02(sq2, checksumApiFingerprint4);
        } else {
            boolean A1f = U7.A1f(this.A01);
            String[] strArr = A05;
            String str2 = strArr[7];
            String checksumApiFingerprint5 = strArr[0];
            if (str2.length() == checksumApiFingerprint5.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
            strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
            if (A1f) {
                SQ sq3 = this.A01;
                String checksumApiFingerprint6 = this.A01.getPackageName();
                String A02 = W4.A02(sq3, checksumApiFingerprint6);
                String checksumApiFingerprint7 = A01(1, 5, 36);
                C0773Sw c0773Sw = new C0773Sw(checksumApiFingerprint7);
                c0773Sw.A05(1);
                c0773Sw.A06(1);
                c0773Sw.A0A(false);
                JSONObject jSONObject = new JSONObject();
                String checksumApiFingerprint8 = A01(25, 5, Opcodes.LUSHR);
                jSONObject.put(checksumApiFingerprint8, str);
                String checksumApiFingerprint9 = A01(30, 5, Opcodes.DREM);
                jSONObject.put(checksumApiFingerprint9, A02);
                c0773Sw.A07(jSONObject);
                InterfaceC0771Su A08 = this.A01.A08();
                int i = AbstractC0772Sv.A1I;
                String checksumApiFingerprint10 = A01(35, 7, 42);
                A08.AAz(checksumApiFingerprint10, i, c0773Sw);
            }
            TT.A00 = str;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        String str3 = this.A03;
        String checksumApiFingerprint11 = TT.A00;
        edit.putString(str3, checksumApiFingerprint11).apply();
        atomicInteger = TT.A05;
        atomicInteger.set(2);
        return true;
    }
}
