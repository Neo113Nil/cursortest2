package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1432hw extends AbstractC0612Mo implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC1434hy> A0A;
    public final ArrayList<Integer> A09 = new ArrayList<>();
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public String A04 = A02(190, 2, 71);
    public final String A08 = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{93, 88, 79, 117, 126, 119, Byte.MAX_VALUE, 120, 73, 102, 119, 100, 119, 123, 101, 17, Ascii.SUB, 19, Ascii.ESC, Ascii.FS, Ascii.ETB, Ascii.SYN, 45, 19, Ascii.SYN, 1, 45, 17, Ascii.GS, 7, Ascii.FS, 6, 54, Base64.padSymbol, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, Byte.MAX_VALUE, 100, 84, 104, 103, 100, 120, 110, 84, Byte.MAX_VALUE, 98, 102, 110, 109, 122, 111, 112, 109, 107, 64, 121, 118, 109, 108, 107, 64, 122, 124, 111, 114, 64, 112, 113, 115, 102, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 90, 94, 67, 65, 86, 64, 64, 90, 92, 93, 108, 92, 93, 95, 74, Ascii.CR, Ascii.SO, Ascii.DC2, Ascii.ETB, 10, 33, Ascii.CAN, 17, Ascii.FF, Ascii.GS, Ascii.ESC, 33, 8, Ascii.ETB, Ascii.ESC, 9, Ascii.EM, Ascii.US};
    }

    public C1432hw(List<AbstractC1434hy> list) {
        this.A0A = list;
    }

    public static C1432hw A00(JSONObject jSONObject, C1159dL c1159dL) throws JSONException {
        return A01(jSONObject, c1159dL, false);
    }

    public static C1432hw A01(JSONObject jSONObject, C1159dL c1159dL, boolean z) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(AnonymousClass77.A00(jSONArray.getJSONObject(i), c1159dL));
            } else {
                arrayList.add(AnonymousClass73.A00(jSONArray.getJSONObject(i), c1159dL));
            }
        }
        C1432hw c1432hw = new C1432hw(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c1432hw.A04 = chainingParams.toString();
        c1432hw.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c1432hw.A03 = chainingParams.optInt(A02(32, 24, 112), 0);
        c1432hw.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c1432hw.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c1432hw.A1K(chainingParams);
        c1432hw.A07 = chainingParams.optBoolean(A02(Opcodes.FRETURN, 16, 91), false);
        c1432hw.A06 = chainingParams.optBoolean(A02(Opcodes.I2C, 28, 22), false);
        c1432hw.A05 = chainingParams.optBoolean(A02(124, 22, 58), false);
        JSONArray optJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                c1432hw.A09.add(Integer.valueOf(optJSONArray.optInt(i2, 0)));
            }
        }
        return c1432hw;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0612Mo
    public final int A0l() {
        return 2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0612Mo
    public final int A0m() {
        return this.A03 + this.A02;
    }

    public final int A1t() {
        return this.A00;
    }

    public final int A1u() {
        return this.A01;
    }

    public final int A1v() {
        return this.A02;
    }

    public final AbstractC1434hy A1w() {
        if (!this.A0A.isEmpty()) {
            return this.A0A.get(0);
        }
        return null;
    }

    public final AbstractC1434hy A1x(int i) {
        return this.A0A.get(i);
    }

    public final String A1y() {
        return this.A08;
    }

    public final String A1z() {
        return this.A04;
    }

    public final String A20() {
        AbstractC1434hy firstAdDataBundle = A1w();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A25();
        }
        return null;
    }

    public final ArrayList<Integer> A21() {
        return this.A09;
    }

    public final void A22(int i) {
        this.A0A.remove(i);
        this.A01--;
    }

    public final boolean A23() {
        return this.A00 == 0;
    }

    public final boolean A24() {
        return this.A05;
    }

    public final boolean A25() {
        return this.A06;
    }

    public final boolean A26() {
        return this.A07;
    }

    public final boolean A27(int i) {
        return i >= 0 && i < this.A0A.size();
    }
}
