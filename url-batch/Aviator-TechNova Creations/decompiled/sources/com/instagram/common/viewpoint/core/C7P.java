package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7P extends AbstractC1478im {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, Ascii.ETB, Base64.padSymbol, 58, 36, Ascii.ETB, Utf8.REPLACEMENT_BYTE, 45, 42, Ascii.ETB, 46, 41, 36, 36, 42, 41, 43, 35};
    }

    public C7P(C1159dL c1159dL, US us, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1159dL, us, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C7P(C1159dL c1159dL, US us, String str, Uri uri, Map<String, String> mExtraData, boolean z) {
        this(c1159dL, us, str, uri, mExtraData);
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1478im
    public final ME A0H() {
        A0J(this.A00, null);
        return ME.A09;
    }

    public final Uri A0M() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return WQ.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, Opcodes.LSHL);
        return WQ.A00(uri.getQueryParameter(url));
    }
}
