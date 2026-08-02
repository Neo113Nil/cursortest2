package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0606Mo implements Serializable {
    public static String A0y = null;
    public static byte[] A0z = null;
    public static final long serialVersionUID = -8352540727250859603L;
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public RewardData A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public final int A0x;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0z, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0z = new byte[]{92, 115, 126, 118, 114, Utf8.REPLACEMENT_BYTE, 102, 112, 106, 109, Utf8.REPLACEMENT_BYTE, 121, 109, 122, 122, Utf8.REPLACEMENT_BYTE, 109, 122, 104, 126, 109, 123, 62, Utf8.REPLACEMENT_BYTE, 85, 106, 108, 107, Utf8.REPLACEMENT_BYTE, 118, 113, 108, 107, 126, 115, 115, Utf8.REPLACEMENT_BYTE, 58, 108, Utf8.REPLACEMENT_BYTE, 107, 112, Utf8.REPLACEMENT_BYTE, 108, 116, 118, 111, Utf8.REPLACEMENT_BYTE, 107, 119, 122, Utf8.REPLACEMENT_BYTE, 126, 123, 36, 6, Ascii.ETB, 67, Ascii.SUB, Ascii.FF, Ascii.SYN, 17, 67, 17, 6, Ascii.DC4, 2, 17, 7, 102, 65, 92, 91, 78, 67, 67, Ascii.SI, 78, 95, 95, Ascii.SI, 78, 65, 75, Ascii.SI, 92, 68, 70, 95, Ascii.SI, 91, 71, 74, Ascii.SI, 78, 75, 1, 10, 45, 48, 55, 34, 47, 47, 99, 55, 43, 38, 99, 34, 51, 51, 5, 34, Utf8.REPLACEMENT_BYTE, 56, 45, 32, 32, 108, 56, 35, 108, Utf8.REPLACEMENT_BYTE, 39, 37, 60, 108, 56, 36, 41, 108, 45, 40, 105, 84, 6, 81, 71, 82, 69, 78, 6, 64, 83, 74, 74, 6, 3, 85, Ascii.VT, 85, 67, 69, 73, 72, 66, 6, 71, 66, 4, 57, 107, 60, 42, Utf8.REPLACEMENT_BYTE, 40, 35, 107, Utf8.REPLACEMENT_BYTE, 35, 46, 107, 45, 62, 39, 39, 107, 42, 47, 81, 102, 116, 98, 113, 103, 35, 100, 113, 98, 109, 119, 102, 103, 34, 91, 99, 97, 120, 40, 124, 96, 109, 40, 105, 108, 40, 106, 113, 40, 108, 103, Byte.MAX_VALUE, 102, 100, 103, 105, 108, 97, 102, 111, 40, 124, 96, 109, 40, 105, 120, 120, 40, 105, 102, 108, 40, 97, 102, 123, 124, 105, 102, 124, 100, 113, 40, 111, 109, 124, 40, 113, 103, 125, 122, 40, 122, 109, Byte.MAX_VALUE, 105, 122, 108, 41, 120, 68, 77, 66, 71, Ascii.FF, 85, 67, 89, Ascii.FF, 74, 67, 94, Ascii.FF, 69, 66, 95, 88, 77, 64, 64, 69, 66, 75, Ascii.FF, 9, 95, 51, 5, 10, 16, 68, 16, Ascii.VT, 68, Ascii.ETB, Ascii.SI, Ascii.CR, Ascii.DC4, 68, 16, Ascii.FF, 1, 68, 5, 0, 68, 66, 68, 7, 8, 5, Ascii.CR, 9, 68, Ascii.GS, Ascii.VT, 17, Ascii.SYN, 68, 2, Ascii.SYN, 1, 1, 68, Ascii.SYN, 1, 19, 5, Ascii.SYN, 0, 91, 68, 46, 17, Ascii.ETB, 16, 68, Ascii.CR, 10, Ascii.ETB, 16, 5, 8, 8, 68, 65, Ascii.ETB, 68, 10, Ascii.VT, 19, 59, Ascii.CR, Ascii.ETB, 16, 66, 16, 7, Ascii.NAK, 3, 16, 6, 66, Ascii.VT, 17, 66, 16, 7, 3, 6, Ascii.ESC, 66, Ascii.SYN, Ascii.CR, 66, 0, 7, 66, Ascii.ETB, 17, 7, 6, 67, 40, 45, 39, 62, Ascii.SYN, 42, 33, 40, 32, 39, 44, 45, Ascii.SYN, 40, 45, 58, Ascii.SYN, Utf8.REPLACEMENT_BYTE, 123, Ascii.SYN, 45, 44, 58, 32, 46, 39, 108, 105, 99, 122, 82, 120, 126, 104, 82, 100, 96, 108, 106, 104, 82, 123, Utf8.REPLACEMENT_BYTE, 82, Byte.MAX_VALUE, 104, 105, 104, 126, 100, 106, 99, 49, 52, 62, 39, Ascii.SI, 37, 35, 53, Ascii.SI, 38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, Ascii.SI, 38, 57, 53, 39, Ascii.SI, 38, 98, Ascii.SI, 34, 53, 52, 53, 35, 57, 55, 62, 41, 44, 38, Utf8.REPLACEMENT_BYTE, Ascii.ETB, Utf8.REPLACEMENT_BYTE, 41, 60, 43, 32, Ascii.ETB, 41, 38, 44, Ascii.ETB, 42, 58, 39, Utf8.REPLACEMENT_BYTE, 59, 45, Ascii.ETB, 62, 122, Ascii.ETB, 44, 45, 59, 33, 47, 38, 114, 112, 114, 78, 119, 120, 125, 101, 116, 99, 78, 114, 125, 120, 114, 122, 98, 78, 126, Byte.MAX_VALUE, 78, 114, 101, 112, 78, 116, Byte.MAX_VALUE, 112, 115, 125, 116, 117, Ascii.NAK, Ascii.ETB, Ascii.ESC, 6, Ascii.ETB, Ascii.US, 17, Ascii.CAN, Ascii.US, Ascii.DC2, 75, 1, 19, Ascii.DC4, 41, Ascii.ETB, 3, 2, Ascii.EM, 41, 4, 19, Ascii.DC2, Ascii.US, 4, 19, Ascii.NAK, 2, 86, Ascii.ETB, Ascii.NAK, 2, Ascii.US, Ascii.EM, Ascii.CAN, 75, Ascii.ETB, Ascii.CAN, Ascii.DC2, 4, Ascii.EM, Ascii.US, Ascii.DC2, 88, Ascii.US, Ascii.CAN, 2, 19, Ascii.CAN, 2, 88, Ascii.ETB, Ascii.NAK, 2, Ascii.US, Ascii.EM, Ascii.CAN, 88, 32, Utf8.REPLACEMENT_BYTE, 51, 33, 86, 6, Ascii.ETB, Ascii.NAK, Ascii.GS, Ascii.ETB, 17, 19, 75, Ascii.NAK, Ascii.EM, Ascii.ESC, 88, Ascii.ETB, Ascii.CAN, Ascii.DC2, 4, Ascii.EM, Ascii.US, Ascii.DC2, 88, 0, 19, Ascii.CAN, Ascii.DC2, Ascii.US, Ascii.CAN, 17, 86, Ascii.US, Ascii.CAN, 2, 19, Ascii.CAN, 2, 76, 89, 89, 6, Ascii.SUB, Ascii.ETB, Ascii.SI, 88, 17, Ascii.EM, Ascii.EM, 17, Ascii.SUB, 19, 88, Ascii.NAK, Ascii.EM, Ascii.ESC, 89, 5, 2, Ascii.EM, 4, 19, 105, 107, 120, 101, Byte.MAX_VALUE, 121, 111, 102, 88, 83, 90, 82, 85, 100, 75, 90, 73, 90, 86, 72, 106, 101, 96, 106, 98, 86, 109, 108, 101, 104, 112, 86, 101, 102, 110, 110, 96, 103, 110, 86, 100, 122, 104, 103, 98, 104, 96, 84, 98, 106, 105, 84, 109, 98, 103, Byte.MAX_VALUE, 110, 121, 98, 101, 108, 84, 110, 101, 106, 105, 103, 110, 111, 102, 106, 104, 43, 99, 100, 102, 96, 103, 106, 106, 110, 43, 100, 97, 118, 43, 108, 107, 113, 96, 119, 118, 113, 108, 113, 108, 100, 105, 43, 102, 105, 108, 102, 110, 96, 97, 0, 17, 6, 2, Ascii.ETB, 10, Ascii.NAK, 6, 60, 2, 16, 60, 0, Ascii.ETB, 2, 60, 6, Ascii.CR, 2, 1, Ascii.SI, 6, 7, Ascii.SI, Ascii.RS, 9, Ascii.CR, Ascii.CAN, 5, Ascii.SUB, 9, 51, Ascii.CR, Ascii.US, 51, Ascii.SI, Ascii.CAN, Ascii.CR, 51, 9, 2, Ascii.CR, Ascii.SO, 0, 9, 8, 51, 2, Ascii.CR, Ascii.CAN, 5, Ascii.SUB, 9, 51, Ascii.SO, Ascii.CR, 2, 2, 9, Ascii.RS, Ascii.CAN, Ascii.SI, Ascii.SUB, 36, Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.CAN, 16, 36, Ascii.US, Ascii.RS, Ascii.ETB, Ascii.SUB, 2, 36, Ascii.ETB, Ascii.DC4, Ascii.FS, Ascii.FS, Ascii.DC2, Ascii.NAK, Ascii.FS, 36, Ascii.SYN, 8, 108, 123, 100, 87, 96, 97, 108, 109, 87, 102, 105, 126, 97, 111, 105, 124, 97, 103, 102, 87, 109, 102, 105, 106, 100, 109, 108, 48, 39, 56, Ascii.VT, 60, 39, Ascii.VT, 49, 58, 53, 54, 56, 49, 48, 5, Ascii.DC2, Ascii.CR, 62, 9, Ascii.CAN, 3, 19, 8, 5, 62, 4, Ascii.SI, 0, 3, Ascii.CR, 4, 5, 53, 40, Utf8.REPLACEMENT_BYTE, 48, 60, 56, 50, Ascii.SO, 34, 53, 58, Ascii.SO, Base64.padSymbol, 48, 40, 52, 35, Ascii.SO, 57, 37, 60, Base64.padSymbol, Ascii.SO, 36, 35, Base64.padSymbol, 58, 49, 60, 45, 38, 47, 43, 58, 59, 0, 60, 47, 50, 72, 64, 64, 72, 67, 74, 112, 95, 67, 78, 86, 112, 71, 64, 92, 91, 112, 92, 91, 93, 70, 65, 72, 57, 56, 53, 52, Ascii.SO, 50, 62, 36, Utf8.REPLACEMENT_BYTE, 37, 53, 62, 38, Utf8.REPLACEMENT_BYTE, Ascii.SO, 52, Utf8.REPLACEMENT_BYTE, 48, 51, Base64.padSymbol, 52, 53, 100, 101, 104, 105, 83, 124, 126, 99, 107, 126, 105, Byte.MAX_VALUE, Byte.MAX_VALUE, 83, 
        110, 109, 126, 83, 105, 98, 109, 110, 96, 105, 104, 50, 53, 40, 47, 58, 55, 55, 4, 58, 53, Utf8.REPLACEMENT_BYTE, 4, 60, 62, 47, 4, 41, 62, 44, 58, 41, Utf8.REPLACEMENT_BYTE, 4, Utf8.REPLACEMENT_BYTE, 62, 40, 56, 41, 50, 43, 47, 50, 52, 53, 114, 117, 104, 111, 122, 119, 119, 68, 122, 117, Byte.MAX_VALUE, 68, 124, 126, 111, 68, 105, 126, 108, 122, 105, Byte.MAX_VALUE, 68, 126, 117, 122, 121, 119, 126, Byte.MAX_VALUE, 95, 88, 66, 83, 68, 85, 83, 70, 66, 105, 65, 83, 84, 105, 95, 88, 69, 66, 87, 90, 90, 105, 84, 67, 66, 66, 89, 88, 39, 32, 58, 43, 60, Base64.padSymbol, 58, 39, 58, 39, 47, 34, 1, Ascii.CAN, 52, Ascii.FS, Ascii.SO, 9, 52, 2, 5, Ascii.CAN, Ascii.US, 10, 7, 7, 52, 9, Ascii.RS, Ascii.US, Ascii.US, 4, 5, Byte.MAX_VALUE, 124, 112, 120, 76, 100, 114, 103, 112, 123, 76, 114, 125, 119, 76, 113, 97, 124, 100, 96, 118, 76, 118, 125, 114, 113, Byte.MAX_VALUE, 118, 119, 75, 67, 66, 79, 71, 121, 71, 85, 86, 67, 69, 82, 121, 84, 71, 82, 79, 73, 104, 103, 114, 111, 112, 99, 84, 72, 69, 93, 10, 67, 75, 75, 67, 72, 65, 10, 71, 75, 73, Ascii.FS, Ascii.RS, 9, 51, Ascii.RS, 9, Ascii.ESC, Ascii.CR, Ascii.RS, 8, 51, Ascii.SI, Ascii.CAN, Ascii.CR, 51, Ascii.SO, Ascii.EM, Ascii.CAN, Ascii.CAN, 3, 2, 51, Ascii.CAN, 9, Ascii.DC4, Ascii.CAN, 113, 115, 100, 94, 115, 100, 118, 96, 115, 101, 94, 101, 100, 114, 98, 115, 104, 113, 117, 104, 110, 111, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 40, Ascii.DC2, Utf8.REPLACEMENT_BYTE, 40, 58, 44, Utf8.REPLACEMENT_BYTE, 41, Ascii.DC2, 40, 35, 44, 47, 33, 40, 41, Ascii.CAN, Ascii.SUB, Ascii.CR, 55, Ascii.SUB, Ascii.CR, Ascii.US, 9, Ascii.SUB, Ascii.FF, 55, Ascii.FS, 1, Ascii.FS, 4, Ascii.CR, 68, 70, 81, 107, 70, 81, 67, 85, 70, 80, 107, 67, 85, 64, 87, 92, 107, 85, 80, 107, 86, 65, 64, 64, 91, 90, 107, 64, 81, 76, 64, 9, Ascii.CAN, 36, Ascii.CR, 73, 36, Ascii.RS, 3, Ascii.VT, Ascii.RS, 9, Ascii.DC2, Ascii.RS, Ascii.NAK, Ascii.CAN, Ascii.RS, 36, Ascii.SUB, 36, Ascii.RS, Ascii.NAK, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.RS, Ascii.US, 81, 64, 124, 85, 17, 124, 70, 91, 83, 70, 81, 74, 70, 77, 64, 70, 124, 65, 124, 70, 77, 66, 65, 79, 70, 71, Ascii.CR, Ascii.FS, 32, 9, 77, 32, Ascii.SYN, 17, Ascii.FF, Ascii.VT, Ascii.RS, 19, 19, 32, Ascii.VT, 16, 32, Ascii.FF, Ascii.DC4, Ascii.SYN, Ascii.SI, 95, 78, 114, 91, Ascii.US, 114, 95, 72, 90, 76, 95, 73, 114, 78, 65, 76, 68, 64, 114, 73, 72, 94, 78, 95, 68, 93, 89, 68, 66, 67, 84, 69, 121, 80, Ascii.DC4, 121, 81, 71, 82, 69, 78, 121, 64, 83, 74, 74, 121, 71, 66, 66, 85, 64, 92, 81, 73, 111, 71, 88, 85, 94, 111, 67, 91, 89, 64, 111, 68, 89, 93, 85, 111, 85, 72, 83, 85, 85, 84, 67, 111, 70, 89, 84, 85, 95, 111, 84, 69, 66, 81, 68, 89, 95, 94, 111, 85, 94, 81, 82, 92, 85, 84, 59, 44, 56, 60, 44, 58, Base64.padSymbol, Ascii.SYN, 32, 45, 110, 121, 107, 125, 110, 120, 67, 123, 110, 125, 114, 104, 121, 120, 67, 104, 121, 100, 104, 115, 100, 118, 96, 115, 101, 94, 102, 115, 96, 111, 117, 100, 101, 94, 119, 51, 94, 117, 100, 121, 117, Utf8.REPLACEMENT_BYTE, 40, 58, 44, Utf8.REPLACEMENT_BYTE, 41, Ascii.DC2, 36, 35, 43, 34, Ascii.DC2, 57, 40, 53, 57, 74, 93, 79, 89, 74, 92, 93, 92, 103, 78, 81, 92, 93, 87, 114, 117, 115, 104, 111, 102, 94, 117, 110, 94, 98, 105, 100, 98, 106, 94, 102, 110, 110, 102, 109, 100, 94, 113, 109, 96, 120, 94, 96, 116, 117, 110, 94, 115, 100, 101, 104, 115, 100, 98, 117, 89, 70, 75, 74, 64, 112, 76, 67, 70, 76, 68, 78, 77, 67, 74, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.FS, Ascii.US, Ascii.DC4, 17, Ascii.DC4, 9, 4, 34, Ascii.RS, Ascii.NAK, Ascii.CAN, Ascii.RS, Ascii.SYN, 34, Ascii.DC4, 19, Ascii.DC4, 9, Ascii.DC4, Ascii.FS, 17, 34, Ascii.EM, Ascii.CAN, 17, Ascii.FS, 4, 4, Ascii.ESC, Ascii.ETB, 5, 19, 16, Ascii.ESC, Ascii.RS, Ascii.ESC, 6, Ascii.VT, 45, 17, Ascii.SUB, Ascii.ETB, 17, Ascii.EM, 45, Ascii.ESC, Ascii.FS, 6, Ascii.ETB, 0, 4, 19, Ascii.RS, 58, 44, 57, 46, 37, Ascii.DC2, 44, 35, 41, Ascii.DC2, 47, Utf8.REPLACEMENT_BYTE, 34, 58, 62, 40, Ascii.DC2, 44, 35, 41, Utf8.REPLACEMENT_BYTE, 34, 36, 41, Ascii.DC2, 59, Byte.MAX_VALUE, Ascii.DC2, 56, 36, 41, Utf8.REPLACEMENT_BYTE, 42, Base64.padSymbol, 54, 1, Utf8.REPLACEMENT_BYTE, 48, 58, 1, 60, 44, 49, 41, 45, 59, 1, Base64.padSymbol, 49, 43, 48, 42, 58, 49, 41, 48, 1, 41, 54, 59, 48, 1, 55, Utf8.REPLACEMENT_BYTE, 60, 1, 49, 46, 59, 48, 4, Ascii.DC2, 7, 16, Ascii.ESC, 44, Ascii.DC2, Ascii.GS, Ascii.ETB, 44, Ascii.SUB, Ascii.GS, 0, 7, Ascii.DC2, Ascii.US, Ascii.US, 44, 16, 7, Ascii.DC2, 44, 17, 6, 7, 7, Ascii.FS, Ascii.GS, 44, Ascii.SYN, Ascii.GS, Ascii.DC2, 17, Ascii.US, Ascii.SYN, Ascii.ETB, 107, 125, 104, Byte.MAX_VALUE, 116, 67, 125, 114, 120, 67, 117, 114, 111, 104, 125, 112, 112, 67, 121, 114, 125, 126, 112, 121, 120, 64, 86, 67, 84, 95, 104, 86, 89, 83, 104, 94, 89, 68, 67, 86, 91, 91, 104, 81, 69, 88, 90, 104, 68, 67, 86, 69, 67, 104, 83, 82, 91, 86, 78, Ascii.VT, Ascii.GS, 8, Ascii.US, Ascii.DC4, 35, Ascii.GS, Ascii.DC2, Ascii.CAN, 35, Ascii.NAK, Ascii.DC2, Ascii.SI, 8, Ascii.GS, 16, 16, 35, 19, Ascii.DC2, 35, Ascii.NAK, Ascii.DC2, Ascii.SI, 8, Ascii.GS, Ascii.DC2, 8, 35, Ascii.ESC, Ascii.GS, 17, Ascii.EM, Ascii.SI, 35, Ascii.EM, Ascii.DC2, Ascii.GS, Ascii.RS, 16, Ascii.EM, Ascii.CAN};
    }

    public abstract int A0l();

    public abstract int A0m();

    public AbstractC0606Mo() {
        String A04 = A04(0, 0, 51);
        this.A0F = A04;
        this.A02 = 200;
        this.A0D = A04;
        this.A0M = A04;
        this.A0L = A04;
        this.A0N = A04;
        this.A0J = A04;
        this.A0I = A04;
        this.A0H = A04;
        this.A0K = A04;
        this.A0G = A04;
        this.A0P = A04;
        this.A0Q = A04;
        this.A0k = false;
        this.A0T = false;
        this.A0m = false;
        this.A0g = false;
        this.A0o = false;
        this.A0c = false;
        this.A0E = A04;
        this.A0C = A04(1189, 15, 12);
        this.A0S = A04;
    }

    public static AbstractC0606Mo A03(JSONObject jSONObject, C1153dL c1153dL) {
        boolean has = jSONObject.has(A04(659, 12, 19));
        boolean z = false;
        JSONArray optJSONArray = jSONObject.optJSONArray(A04(651, 8, 34));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            z = true;
        }
        AbstractC0606Mo abstractC0606Mo = null;
        if (has) {
            try {
                abstractC0606Mo = C1426hw.A00(jSONObject, c1153dL);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (abstractC0606Mo == null) {
            has = false;
            abstractC0606Mo = AnonymousClass73.A00(jSONObject, c1153dL);
        }
        abstractC0606Mo.A1L(has);
        abstractC0606Mo.A0Z(z);
        return abstractC0606Mo;
    }

    private void A06(double d) {
        this.A00 = d;
    }

    private void A07(int i) {
        this.A03 = i;
    }

    private final void A08(long j) {
        this.A04 = j;
    }

    private final void A09(long j) {
        this.A05 = j;
    }

    private void A0A(String str) {
        this.A08 = str;
    }

    private void A0B(String str) {
        this.A09 = str;
    }

    private void A0C(String str) {
        this.A0O = str;
    }

    private final void A0D(String str) {
        this.A0D = str;
    }

    private final void A0E(String str) {
        this.A0G = str;
    }

    private final void A0F(String str) {
        this.A0H = str;
    }

    private final void A0G(String str) {
        this.A0I = str;
    }

    private final void A0H(String str) {
        this.A0J = str;
    }

    private final void A0I(String str) {
        this.A0K = str;
    }

    private final void A0J(String str) {
        this.A0L = str;
    }

    private final void A0K(String str) {
        this.A0M = str;
    }

    private final void A0L(String str) {
        this.A0N = str;
    }

    private final void A0M(String str) {
        this.A0P = str;
    }

    private final void A0N(String str) {
        this.A0Q = str;
    }

    private void A0O(JSONObject jSONObject) {
        this.A0F = jSONObject.toString();
    }

    private void A0P(JSONObject jSONObject) {
        if (!A1i()) {
            return;
        }
        boolean A1g = A1g();
        String A04 = A04(1390, 30, 5);
        if (A1g) {
            A0K(jSONObject.optString(A04, A04(287, 65, 76)));
        } else {
            A0K(jSONObject.optString(A04, A04(0, 54, 55)));
        }
        A0J(jSONObject.optString(A04(1369, 21, 87), A04(112, 22, 100)));
        A0L(jSONObject.optString(A04(1420, 19, 14), A04(Opcodes.I2F, 26, 14)));
    }

    private final void A0Q(boolean z) {
        this.A0Z = z;
    }

    private final void A0R(boolean z) {
        this.A0c = z;
    }

    private final void A0S(boolean z) {
        this.A0d = z;
    }

    private final void A0T(boolean z) {
        this.A0e = z;
    }

    private final void A0U(boolean z) {
        this.A0f = z;
    }

    private final void A0V(boolean z) {
        this.A0X = z;
    }

    private final void A0W(boolean z) {
        this.A0Y = z;
    }

    private final void A0X(boolean z) {
        this.A0g = z;
    }

    private final void A0Y(boolean z) {
        this.A0h = z;
    }

    private final void A0Z(boolean z) {
        this.A0a = z;
    }

    private final void A0a(boolean z) {
        this.A0t = z;
    }

    private final void A0b(boolean z) {
        this.A0u = z;
    }

    private final void A0c(boolean z) {
        this.A0v = z;
    }

    private final void A0d(boolean z) {
        this.A0w = z;
    }

    private final void A0e(boolean z) {
        this.A0l = z;
    }

    private final void A0f(boolean z) {
        this.A0m = z;
    }

    private final void A0g(boolean z) {
        this.A0o = z;
    }

    public final double A0h() {
        return this.A00;
    }

    public final int A0i() {
        return this.A03;
    }

    public final int A0j() {
        return this.A0x;
    }

    public final int A0k() {
        return this.A01;
    }

    public final long A0n() {
        return this.A05;
    }

    public final long A0o() {
        return this.A06;
    }

    public final RewardData A0p() {
        return this.A07;
    }

    public final String A0q() {
        return A0y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String A0r() {
        char c;
        String str = this.A0B;
        switch (str.hashCode()) {
            case -1364000502:
                if (str.equals(A04(1558, 14, 16))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1052618729:
                if (str.equals(A04(1183, 6, 46))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(A04(1103, 12, 102))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return A04(720, 37, 45);
            case 1:
                return EnumC1175dh.A04.A03();
            case 2:
                return EnumC1174dg.A03.A03();
            default:
                return A04(0, 0, 51);
        }
    }

    public final String A0s() {
        return this.A08;
    }

    public final String A0t() {
        return this.A09;
    }

    public final String A0u() {
        return this.A0A;
    }

    public final String A0v() {
        return this.A0B;
    }

    public final String A0w() {
        return this.A0C;
    }

    public final String A0x() {
        return this.A0D;
    }

    public final String A0y() {
        return this.A0E;
    }

    public final String A0z() {
        return this.A0G;
    }

    public final String A10() {
        return this.A0H;
    }

    public final String A11() {
        return this.A0I;
    }

    public final String A12() {
        return this.A0J;
    }

    public final String A13() {
        return this.A0K;
    }

    public final String A14() {
        return this.A0L;
    }

    public final String A15() {
        return this.A0M;
    }

    public final String A16() {
        return this.A0N;
    }

    public final String A17() {
        return this.A0O;
    }

    public final String A18() {
        return this.A0P;
    }

    public final String A19() {
        return this.A0Q;
    }

    public final String A1A() {
        return this.A0R;
    }

    public final String A1B() {
        return this.A0S;
    }

    public final JSONObject A1C() {
        try {
            return new JSONObject(this.A0F);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A1D(int i) {
        this.A02 = i;
    }

    public final void A1E(long j) {
        this.A06 = j;
    }

    public final void A1F(RewardData rewardData) {
        this.A07 = rewardData;
    }

    public final void A1G(String str) {
        A0y = str;
    }

    public final void A1H(String str) {
        this.A0A = str;
    }

    public final void A1I(String str) {
        this.A0B = str;
    }

    public final void A1J(String str) {
        this.A0R = str;
    }

    public final void A1K(JSONObject jSONObject) {
        String A04 = A04(1491, 10, 97);
        String A042 = A04(0, 0, 51);
        A0C(jSONObject.optString(A04, A042));
        A0B(jSONObject.optString(A04(928, 13, 119)));
        A0O(jSONObject);
        A07(jSONObject.optInt(A04(1628, 31, 85), 0));
        A1D(jSONObject.optInt(A04(1659, 26, 90), 1000));
        A0A(jSONObject.optString(A04(TypedValues.Custom.TYPE_COLOR, 26, 121), A042));
        A0T(jSONObject.optBoolean(A04(757, 23, 75), false));
        A0U(jSONObject.optBoolean(A04(780, 37, 68), false));
        A0Q(jSONObject.optBoolean(A04(498, 32, 57), false));
        A0S(jSONObject.optBoolean(A04(693, 27, 35), false));
        A0d(jSONObject.optBoolean(A04(1439, 52, 24), false));
        A0Y(jSONObject.optBoolean(A04(1045, 30, 51), false));
        A0D(jSONObject.optString(A04(PointerIconCompat.TYPE_COPY, 34, 115), A04(Opcodes.MONITOREXIT, 65, 32)));
        A0a(jSONObject.optBoolean(A04(1252, 18, 101), false));
        A0b(jSONObject.optBoolean(A04(1317, 26, 83), false));
        A0c(jSONObject.optBoolean(A04(1343, 26, 11), false));
        A0P(jSONObject);
        A0W(jSONObject.optBoolean(A04(986, 25, 36), false));
        A0V(jSONObject.optBoolean(A04(964, 22, 121), false));
        A0H(jSONObject.optString(A04(1270, 16, 64), A04(54, 15, 75)));
        A0f(jSONObject.optBoolean(A04(436, 31, 120), false));
        A0X(jSONObject.optBoolean(A04(410, 26, 37), false));
        A0g(jSONObject.optBoolean(A04(467, 31, 96), false));
        A0R(jSONObject.optBoolean(A04(384, 26, 97), false));
        A0e(jSONObject.optBoolean(A04(1613, 15, 7), false));
        A0F(jSONObject.optString(A04(1204, 26, 68), A04(97, 15, 107)));
        A0I(jSONObject.optString(A04(1286, 31, 28), A04(Opcodes.IF_ICMPNE, 20, 99)));
        A0G(jSONObject.optString(A04(1230, 22, 41), A04(69, 28, 7)));
        A0E(jSONObject.optString(A04(1501, 19, 52), A04(352, 32, 74)));
        A0M(jSONObject.optString(A04(1520, 22, 41), A04(Opcodes.GETFIELD, 15, 43)));
        A0N(jSONObject.optString(A04(1542, 16, 101), A04(260, 27, 4)));
        this.A0V = jSONObject.optBoolean(A04(870, 14, 124));
        this.A0W = jSONObject.optBoolean(A04(884, 18, 73));
        this.A0U = jSONObject.optBoolean(A04(843, 27, 32), true);
        this.A0r = jSONObject.optBoolean(A04(1791, 25, 52), false);
        this.A01 = jSONObject.optInt(A04(1816, 34, 31), -1);
        this.A0s = jSONObject.optBoolean(A04(1850, 42, 84), false);
        this.A0q = jSONObject.optBoolean(A04(1755, 36, 91), false);
        this.A0i = jSONObject.optBoolean(A04(1075, 28, 30), false);
        this.A0E = jSONObject.optString(A04(1115, 21, 67), A042);
        A09(jSONObject.optLong(A04(671, 22, 33), -1L));
        A08(jSONObject.optLong(A04(817, 26, 83), -1L));
        A06(jSONObject.optDouble(A04(1165, 18, 14), 1.0d));
        if (TextUtils.isEmpty(this.A0E)) {
            this.A0E = C0976aT.A00();
        }
        this.A0S = jSONObject.optString(A04(1572, 41, 41), A04(530, 121, 94));
        this.A0C = jSONObject.optString(A04(941, 23, 7), A04(1189, 15, 12));
        this.A0j = jSONObject.optBoolean(A04(1136, 29, 59), false);
        this.A0p = jSONObject.optBoolean(A04(1685, 30, 101), false);
        this.A0n = jSONObject.optBoolean(A04(1715, 40, 118), false);
    }

    public final void A1L(boolean z) {
        this.A0b = z;
    }

    public final void A1M(boolean z) {
        this.A0k = z;
    }

    public final void A1N(boolean z) {
        this.A0T = z;
    }

    public final boolean A1O() {
        return this.A0V;
    }

    public final boolean A1P() {
        return this.A0W;
    }

    public final boolean A1Q() {
        return this.A0U;
    }

    public final boolean A1R() {
        return this.A0Z;
    }

    public final boolean A1S() {
        return this.A0a;
    }

    public final boolean A1T() {
        return this.A0b;
    }

    public final boolean A1U() {
        return this.A0c;
    }

    public final boolean A1V() {
        return this.A0d;
    }

    public final boolean A1W() {
        return this.A0e;
    }

    public final boolean A1X() {
        return this.A0f;
    }

    public final boolean A1Y() {
        return !TextUtils.isEmpty(A0s());
    }

    public final boolean A1Z() {
        return this.A0X;
    }

    public final boolean A1a() {
        return this.A0Y;
    }

    public final boolean A1b() {
        return this.A0g;
    }

    public final boolean A1c() {
        return this.A0h;
    }

    public final boolean A1d() {
        return this.A0i;
    }

    public final boolean A1e() {
        return this.A0j;
    }

    public final boolean A1f() {
        return this.A0t;
    }

    public final boolean A1g() {
        return this.A0u;
    }

    public final boolean A1h() {
        return this.A0v;
    }

    public final boolean A1i() {
        return A1f() && (A1g() || A1h());
    }

    public final boolean A1j() {
        return this.A0k;
    }

    public final boolean A1k() {
        return this.A0w;
    }

    public final boolean A1l() {
        return this.A0T;
    }

    public final boolean A1m() {
        return this.A0m;
    }

    public final boolean A1n() {
        return this.A0n;
    }

    public final boolean A1o() {
        return this.A0o;
    }

    public final boolean A1p() {
        return this.A0p;
    }

    public final boolean A1q() {
        return this.A0q;
    }

    public final boolean A1r() {
        return this.A0r;
    }

    public final boolean A1s() {
        return this.A0s;
    }
}
