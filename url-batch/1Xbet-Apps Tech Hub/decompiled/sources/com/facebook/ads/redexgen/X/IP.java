package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.view.PointerIconCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class IP {
    public static IP A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0R(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0c() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, Byte.MAX_VALUE, 101, 120, Byte.MAX_VALUE, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, Byte.MAX_VALUE, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, Ascii.GS, 6, 17, Ascii.EM, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, Ascii.FF, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, Byte.MAX_VALUE, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, Ascii.FS, 32, 47, 42, 32, 40, 48, Ascii.FS, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, Ascii.FS, 48, 55, 38, 51, Ascii.FS, 32, 34, 45, 32, 38, 47, Ascii.FS, 33, 54, 55, 55, 44, 45, Ascii.FS, 55, 38, 59, 55, Ascii.EM, Ascii.ESC, Ascii.ESC, 17, Ascii.FS, Ascii.GS, Ascii.SYN, Ascii.FF, Ascii.EM, Ascii.DC4, 39, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, Ascii.VT, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, Ascii.US, 86, Ascii.FF, Ascii.SI, Ascii.ETB, 39, Ascii.VT, Ascii.FF, Ascii.GS, 8, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, 10, Ascii.NAK, 39, Ascii.SUB, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.ETB, Ascii.SYN, 39, Ascii.FF, Ascii.GS, 0, Ascii.FF, 3, 1, 1, Ascii.VT, 6, 7, Ascii.FF, Ascii.SYN, 3, Ascii.SO, Base64.padSymbol, 1, Ascii.SO, Ascii.VT, 1, 9, 17, Base64.padSymbol, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, 5, 76, Ascii.SYN, Ascii.NAK, Ascii.CR, Base64.padSymbol, 17, Ascii.SYN, 7, Ascii.DC2, Base64.padSymbol, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, 16, Ascii.SI, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, Ascii.VT, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.SYN, Ascii.ESC, Ascii.SUB, 17, Ascii.VT, Ascii.RS, 19, 32, Ascii.FS, 19, Ascii.SYN, Ascii.FS, Ascii.DC4, Ascii.FF, 32, Ascii.FS, 16, 17, Ascii.EM, Ascii.SYN, Ascii.CAN, 81, Ascii.VT, 8, 16, 32, Ascii.FF, Ascii.VT, Ascii.SUB, Ascii.SI, 32, Ascii.FS, 16, 17, Ascii.EM, Ascii.SYN, Ascii.CR, Ascii.DC2, Ascii.RS, Ascii.VT, Ascii.SYN, 16, 17, 32, Ascii.VT, Ascii.SYN, Ascii.VT, 19, Ascii.SUB, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, Byte.MAX_VALUE, 96, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, Ascii.ETB, Ascii.NAK, Ascii.NAK, 19, 6, 2, Ascii.ETB, Ascii.DC4, Ascii.SUB, 19, 41, 5, 2, Ascii.ETB, Ascii.NAK, Ascii.GS, 2, 4, Ascii.ETB, Ascii.NAK, 19, 41, Ascii.SUB, 19, Ascii.CAN, 17, 2, Ascii.RS, 63, 58, 48, 41, 1, 63, 58, 1, 58, 59, 42, 63, 55, 50, 45, 1, Base64.padSymbol, 50, 55, Base64.padSymbol, 53, 63, 60, 50, 59, 121, 124, 118, 111, 71, 121, 124, 71, 124, 125, 108, 121, 113, 116, 107, 71, 113, 118, 71, 123, 112, 121, 113, 118, 125, 124, 71, 113, 117, 121, Byte.MAX_VALUE, 125, 71, 121, 124, 71, 126, 119, 119, 108, 125, 106, 71, 123, 116, 113, 123, 115, 121, 122, 116, 125, Ascii.US, Ascii.SUB, 16, 9, 33, Ascii.US, 16, Ascii.SUB, Ascii.FF, 17, Ascii.ETB, Ascii.SUB, 33, Ascii.US, Ascii.DC2, Ascii.DC2, 17, 9, 33, Ascii.DC2, 17, Ascii.US, Ascii.SUB, 33, Ascii.SUB, Ascii.VT, Ascii.FF, Ascii.ETB, 16, Ascii.EM, 33, Ascii.CR, Ascii.SYN, 17, 9, Ascii.ETB, 16, Ascii.EM, 46, 43, 33, 56, 16, 46, 33, 43, Base64.padSymbol, 32, 38, 43, 16, 46, 33, Base64.padSymbol, 16, 43, 42, 59, 42, 44, 59, 32, Base64.padSymbol, 16, 42, 33, 46, 45, 35, 42, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 62, 49, 45, 0, 59, 58, 43, 58, 60, 43, 48, 45, 0, 43, 54, 50, 58, 48, 42, 43, 0, 50, 44, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, 120, 117, 78, 115, 112, Byte.MAX_VALUE, Byte.MAX_VALUE, 116, 99, 78, 116, 105, 101, 99, 112, 78, 121, 120, Byte.MAX_VALUE, 101, 98, 78, 119, 120, 105, 78, 116, Byte.MAX_VALUE, 112, 115, 125, 116, 117, 33, 36, 46, 55, Ascii.US, 33, 46, 36, 50, 47, 41, 36, Ascii.US, 34, 44, 33, 35, 43, 44, 41, 51, 52, 37, 36, Ascii.US, 41, 46, 52, 37, 46, 52, Ascii.US, 53, 50, 44, Ascii.US, 48, 50, 37, 38, 41, 56, 37, 51, 5, 0, 10, 19, 59, 5, 10, 0, Ascii.SYN, Ascii.VT, Ascii.CR, 0, 59, 6, 8, Ascii.VT, 7, Ascii.SI, 59, 17, 10, Ascii.ETB, 5, 2, 1, 59, Ascii.DC4, 8, 5, Ascii.GS, 5, 6, 8, 1, 59, 3, 5, 9, 1, Ascii.ETB, 59, 7, 5, 7, Ascii.FF, 1, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 112, 107, 98, 115, 97, 97, 77, 98, 115, 113, 121, 115, 117, 119, 77, 118, 119, 102, 119, 113, 102, 123, 125, 124, 77, 116, 125, 96, 77, 118, 119, 119, 98, 126, 123, 124, 121, 97, Ascii.FS, Ascii.EM, 19, 10, 34, Ascii.FS, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 34, Ascii.RS, Ascii.FS, Ascii.RS, Ascii.NAK, Ascii.CAN, 34, 16, Ascii.DC2, Ascii.EM, 8, 17, Ascii.CAN, 34, 16, Ascii.FS, 5, 34, Ascii.SO, Ascii.DC4, 7, Ascii.CAN, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 71, 69, 71, 76, 65, 123, 73, 75, 64, 81, 72, 65, 123, 86, 65, 80, 86, 93, 123, 72, 77, 73, 77, 80, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 99, 97, 114, 111, 117, 115, 101, 108, 95, 119, 104, 105, 116, 101, 95, 105, 110, 116, 101, 114, 115, 116, 105, 116, 105, 97, 108, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 69, 73, 75, 86, 84, 67, 85, 85, 121, 79, 75, 71, 65, 67, 85, 121, 66, 83, 84, 79, 72, 65, 121, 66, 73, 81, 72, 74, 73, 71, 66, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 123, 122, 121, 126, 106, 115, 107, 64, 126, 108, 108, 122, 107, 64, 111, 
        109, 122, 115, 112, 126, 123, 64, 108, 118, 101, 122, 64, 125, 102, 107, 122, 108, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 120, 117, 111, 125, 126, 112, 121, 67, 108, 112, 125, 101, 125, 126, 112, 121, 67, 108, 110, 121, Byte.MAX_VALUE, 125, Byte.MAX_VALUE, 116, 121, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 50, 57, 9, 56, 57, 34, 9, 35, 37, 51, 9, 37, 34, 55, 34, 51, 9, 62, 55, 56, 50, 58, 51, 36, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 84, 95, 80, 83, 93, 84, 110, 95, 80, 69, 88, 71, 84, 110, 87, 68, 95, 95, 84, 93, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.FF, 3, 9, Ascii.US, 2, 4, 9, 50, 8, Ascii.NAK, 2, 50, Ascii.GS, 1, Ascii.FF, Ascii.DC4, 8, Ascii.US, 50, Ascii.SO, Ascii.FF, Ascii.SO, 5, 8, 50, 0, Ascii.FF, Ascii.NAK, 50, Ascii.RS, 4, Ascii.ETB, 8, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, Byte.MAX_VALUE, 120, 112, 117, 70, 120, 125, 70, 117, 118, 120, 125, 70, 118, 119, 70, 125, 112, 106, 114, 70, 124, 107, 107, 118, 107, 106, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 109, 106, 98, 103, 84, 100, 101, 84, 124, 110, 105, 125, 98, 110, 124, 84, 110, 121, 121, 100, 121, 120, 10, Ascii.SI, 5, Ascii.FS, 52, 10, 5, Ascii.SI, Ascii.EM, 4, 2, Ascii.SI, 52, Ascii.CR, 4, Ascii.EM, 8, Ascii.SO, 52, 3, 10, Ascii.EM, Ascii.SI, Ascii.FS, 10, Ascii.EM, Ascii.SO, 52, 10, 8, 8, Ascii.SO, 7, Ascii.SO, Ascii.EM, 10, Ascii.US, 2, 4, 5, Ascii.NAK, 16, Ascii.SUB, 3, 43, Ascii.NAK, Ascii.SUB, 16, 6, Ascii.ESC, Ascii.GS, 16, 43, Ascii.FS, Ascii.GS, 16, 17, 43, 2, Ascii.GS, 16, 17, Ascii.ESC, 4, 6, Ascii.ESC, 19, 6, 17, 7, 7, 43, Ascii.NAK, Ascii.SUB, Ascii.GS, Ascii.EM, Ascii.NAK, 0, Ascii.GS, Ascii.ESC, Ascii.SUB, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 102, 106, 108, 110, 84, 104, 106, 104, 99, 110, 84, 120, Byte.MAX_VALUE, 100, 121, 110, 84, 105, 114, Byte.MAX_VALUE, 110, 84, 104, 100, 126, 101, Byte.MAX_VALUE, 43, 46, 36, Base64.padSymbol, Ascii.NAK, 43, 36, 46, 56, 37, 35, 46, Ascii.NAK, 35, 36, 62, 47, 36, 62, Ascii.NAK, 36, 37, Ascii.NAK, 36, 47, Base64.padSymbol, Ascii.NAK, 62, 43, 57, 33, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 75, 67, 75, 73, 84, 95, 121, 73, 86, 82, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 117, 106, 123, 71, 113, 117, 104, 106, 125, 107, 107, 113, 119, 118, 71, 126, 119, 106, 71, 118, 121, 108, 113, 110, 125, 71, 110, 113, 124, 125, 119, 71, 121, 124, 107, 71, 110, 42, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 103, 114, 111, 112, 99, 89, 101, 103, 116, 105, 115, 117, 99, 106, 89, 99, 126, 114, 99, 104, 117, 111, 105, 104, 89, 112, 103, 116, 111, 103, 104, 114, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 124, 105, 116, 107, 120, 66, 115, 120, 106, 66, 126, 124, 111, 114, 104, 110, 120, 113, 66, 121, 120, 110, 116, 122, 115, 56, Base64.padSymbol, 55, 46, 6, 56, 55, Base64.padSymbol, 43, 54, 48, Base64.padSymbol, 6, 55, 60, 45, 46, 54, 43, 50, 6, Base64.padSymbol, 60, 63, 56, 44, 53, 45, 6, 58, 54, 55, 55, 60, 58, 45, 48, 54, 55, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 89, 82, 67, 64, 88, 69, 92, 104, 83, 82, 81, 86, 66, 91, 67, 104, 69, 82, 86, 83, 104, 67, 94, 90, 82, 88, 66, 67, 104, 90, 68, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 92, 91, 79, 86, 78, 101, 72, 95, 78, 72, 83, 95, 73, 101, 84, 79, 87, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 59, 48, 33, 34, 58, 39, 62, 10, 49, 48, 51, 52, 32, 57, 33, 10, 33, Base64.padSymbol, 39, 58, 33, 33, 57, 48, 10, 33, 60, 56, 48, 58, 32, 33, 10, 56, 38, Ascii.SO, Ascii.VT, 1, Ascii.CAN, 48, Ascii.SO, 1, Ascii.VT, Ascii.GS, 0, 6, Ascii.VT, 48, 1, 10, Ascii.ESC, Ascii.CAN, 0, Ascii.GS, 4, 48, Ascii.VT, 10, 9, Ascii.SO, Ascii.SUB, 3, Ascii.ESC, 48, Ascii.ESC, 6, 2, 10, 0, Ascii.SUB, Ascii.ESC, 48, 2, Ascii.FS, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 99, 120, Byte.MAX_VALUE, 96, 83, 105, 98, 109, 110, 96, 105, 104, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 41, 62, 54, 52, 45, 62, 4, 42, 46, 62, 41, 34, 4, 43, 58, 41, 47, 4, Base64.padSymbol, 41, 52, 54, 4, 56, 58, 56, 51, 62, 4, 48, 62, 34, 35, 38, 44, 53, Ascii.GS, 35, 44, 38, 48, 45, 43, 38, Ascii.GS, 48, 39, 50, 45, 48, 54, Ascii.GS, 50, 48, 39, 49, 39, 44, 54, 35, 54, 43, 45, 44, Ascii.GS, 39, 48, 48, 45, 48, Ascii.GS, 53, 42, 39, 44, Ascii.GS, 44, 45, Ascii.GS, 43, 47, 50, 48, 39, 49, 49, 43, 45, 44, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 72, 95, 74, 85, 72, 78, 101, 74, 72, 95, 73, 95, 84, 78, 91, 78, 83, 85, 84, 101, 95, 72, 72, 85, 72, 73, 101, 83, 84, 73, 78, 95, 91, 94, 101, 85, 92, 101, 83, 84, 78, 95, 72, 84, 91, 86, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 40, 19, 46, 32, 35, 47, 39, 19, 63, 53, 34, 47, 19, 35, 34, 19, 46, 45, 47, 39, 43, 62, 35, 57, 34, 
        40, 7, 2, 8, 17, 57, 7, 8, 2, Ascii.DC4, 9, Ascii.SI, 2, 57, Ascii.NAK, Ascii.SO, 9, 19, 10, 2, 57, Ascii.SO, Ascii.SI, 2, 3, 57, 10, 9, 7, 2, 3, Ascii.DC4, 41, 44, 38, 63, Ascii.ETB, 41, 38, 44, 58, 39, 33, 44, Ascii.ETB, 59, 32, 39, Base64.padSymbol, 36, 44, Ascii.ETB, 33, 38, 33, 60, Ascii.ETB, Base64.padSymbol, 38, 59, 35, 33, 56, 56, 41, 42, 36, 45, Ascii.ETB, 59, 45, 43, 39, 38, 44, 59, Ascii.ETB, 43, 39, 37, 56, 36, 45, 60, 45, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 96, 123, 124, 102, Byte.MAX_VALUE, 119, 76, Byte.MAX_VALUE, 114, 102, 125, 112, 123, 76, 99, Byte.MAX_VALUE, 114, 106, 76, 96, 103, 124, 97, 118, 76, 122, 125, 76, 124, 101, 118, 97, Byte.MAX_VALUE, 114, 106, 122, Byte.MAX_VALUE, 117, 108, 68, 122, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 68, 104, 115, 116, 110, 119, Byte.MAX_VALUE, 68, 105, 126, 104, 126, 111, 68, 125, 116, 120, 110, 104, 68, 116, 117, 68, 117, 122, 111, 114, 109, 126, 68, 105, 126, 107, 116, 105, 111, 114, 117, 124, Ascii.NAK, 16, Ascii.SUB, 3, 43, Ascii.NAK, Ascii.SUB, 16, 6, Ascii.ESC, Ascii.GS, 16, 43, 1, Ascii.SYN, 2, 6, Ascii.ETB, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 79, 73, 95, 101, 89, 91, 89, 82, 95, 101, 87, 85, 94, 79, 86, 95, 101, 92, 85, 72, 101, 83, 87, 91, 93, 95, 73, 51, 54, 60, 37, Ascii.CR, 51, 60, 54, 32, Base64.padSymbol, 59, 54, Ascii.CR, 39, 33, 55, Ascii.CR, 33, 38, 55, 51, 63, 59, 60, 53, Ascii.CR, 59, 63, 51, 53, 55, Ascii.CR, 54, 55, 49, Base64.padSymbol, 54, 59, 60, 53, 35, 38, 44, 53, Ascii.GS, 35, 44, 38, 48, 45, 43, 38, Ascii.GS, 53, 42, 43, 54, 39, 46, 43, 49, 54, 39, 38, Ascii.GS, 43, 44, 54, 39, 44, 54, Ascii.GS, 55, 48, 46, Ascii.GS, 50, 48, 39, 36, 43, 58, 39, 49, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.FF, 36, Ascii.SUB, 8, 8, Ascii.RS, Ascii.SI, 36, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.CAN, 19, Ascii.DC2, Ascii.NAK, Ascii.FS, 36, Ascii.SO, Ascii.NAK, Ascii.DC2, Ascii.GS, Ascii.DC2, Ascii.RS, Ascii.US, 66, 71, 77, 84, 124, 65, 66, 77, 77, 70, 81, 124, 77, 76, 87, 74, 69, 90, 124, 66, 71, 124, 79, 76, 66, 71, 70, 71, 124, 76, 77, 124, 66, 80, 80, 70, 87, 80, 124, 79, 76, 66, 71, 70, 71, 52, 49, 59, 34, 10, 55, 48, 59, 54, Base64.padSymbol, 56, 52, 39, 62, 10, 39, 48, 37, 58, 39, 33, 10, 60, 59, 33, 48, 39, 35, 52, 57, 10, 56, 38, 37, 32, 42, 51, Ascii.ESC, 38, 40, 43, 39, 47, Ascii.ESC, 40, 43, 39, 47, 55, 39, 54, 33, 33, 42, 89, 92, 86, 79, 103, 91, 84, 81, 91, 83, 75, 103, 75, 93, 91, 87, 86, 92, 103, 91, 80, 89, 86, 86, 93, 84, 103, 93, 86, 89, 90, 84, 93, 92, 87, 82, 88, 65, 105, 85, 68, 87, 69, 94, 105, 69, 94, 95, 83, 90, 82, 105, 83, 88, 87, 84, 90, 83, 82, 58, 63, 53, 44, 4, 56, 47, 58, 4, 58, 53, 50, 54, 58, 47, 50, 52, 53, 4, 63, 62, 55, 58, 34, 4, 54, 40, 47, 42, 32, 57, 17, 45, 58, 47, 17, 35, 39, 32, 17, Base64.padSymbol, 45, 47, 34, 43, 17, 47, 32, 39, 35, 47, 58, 39, 33, 32, 17, 62, 43, 60, 45, 43, 32, 58, 47, 41, 43, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.SI, 4, 52, 7, Ascii.SO, Ascii.CAN, Ascii.CAN, 52, Ascii.CAN, Ascii.US, Ascii.EM, 2, 8, Ascii.US, 52, Ascii.CAN, Ascii.SO, 8, 4, 5, Ascii.SI, 52, 8, 3, 10, 5, 5, Ascii.SO, 7, 52, 2, 6, Ascii.ESC, 65, 68, 78, 87, Byte.MAX_VALUE, 69, 78, 65, 66, 76, 69, Byte.MAX_VALUE, 65, 85, 84, 79, Byte.MAX_VALUE, 68, 69, 83, 84, 82, 79, 89, Byte.MAX_VALUE, 76, 69, 65, 75, 83, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 93, 86, 91, 91, 90, 77, 96, 75, 80, 84, 90, 81, 96, 86, 81, 89, 80, Ascii.CAN, Ascii.GS, Ascii.ETB, Ascii.SO, 38, Ascii.FS, Ascii.ETB, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 38, Ascii.GS, Ascii.FS, Ascii.ESC, Ascii.FF, Ascii.RS, 38, Ascii.SYN, Ascii.SI, Ascii.FS, Ascii.VT, Ascii.NAK, Ascii.CAN, 0, Ascii.CR, 8, 2, Ascii.ESC, 51, 9, 2, Ascii.CR, Ascii.SO, 0, 9, 51, 9, Ascii.DC4, 3, Ascii.FS, 0, Ascii.CR, Ascii.NAK, 9, Ascii.RS, 51, Ascii.SI, Ascii.CR, Ascii.SI, 4, 9, 77, 72, 66, 91, 115, 73, 66, 77, 78, 64, 73, 115, 73, 84, 67, 92, 64, 77, 85, 73, 94, 115, 79, 77, 79, 68, 73, 115, 74, 67, 94, 115, 72, 95, 64, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.CR, 37, Ascii.US, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SYN, Ascii.US, 37, Ascii.US, 2, Ascii.NAK, 10, Ascii.SYN, Ascii.ESC, 3, Ascii.US, 8, 37, Ascii.FF, 72, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 99, 112, 107, 107, 96, 105, 79, 74, 64, 89, 113, 75, 64, 79, 76, 66, 75, 113, 71, 64, 66, 71, 64, 75, 113, 86, 113, 65, 91, 90, 113, 64, 65, 64, 113, 72, 91, 66, 66, 93, 77, 92, 75, 75, 64, 113, 65, 64, 113, 93, 74, 69, 96, 101, 111, 118, 94, 100, 111, 96, 99, 109, 100, 94, 111, 100, 117, 118, 110, 115, 106, Ascii.SI, 10, 0, Ascii.EM, 49, Ascii.VT, 0, Ascii.SI, Ascii.FF, 2, Ascii.VT, 49, Ascii.RS, Ascii.FS, Ascii.VT, 2, 1, Ascii.SI, 10, Ascii.DC4, 17, Ascii.ESC, 2, 42, 16, Ascii.ESC, Ascii.DC4, Ascii.ETB, Ascii.EM, 16, 42, 7, Ascii.DC4, Ascii.DC2, 16, 42, 6, Ascii.GS, Ascii.DC4, Ascii.RS, 16, 117, 112, 122, 99, 75, 113, 122, 117, 118, 120, 113, 75, 103, 109, 122, 119, 121, 124, 118, 111, 71, 125, 118, 124, 71, 123, 121, 106, 124, 107, 71, 123, 116, 113, 123, 115, 121, 122, 116, 125, 123, 126, 116, 109, 69, Byte.MAX_VALUE, 98, 106, 117, 105, Byte.MAX_VALUE, 69, 108, 115, 126, Byte.MAX_VALUE, 117, 69, 109, 123, 110, 121, 114, 69, 110, 115, 119, Byte.MAX_VALUE, 43, 46, 36, Base64.padSymbol, Ascii.NAK, 44, 40, Ascii.NAK, 45, 58, Ascii.NAK, 37, 60, 47, 56, 38, 43, 51, Ascii.NAK, 57, 47, 41, 63, 
        56, 47, Ascii.RS, 37, 33, 47, 36, 56, Base64.padSymbol, 55, 46, 6, 63, 59, 6, 62, 41, 6, 54, 47, 60, 43, 53, 56, 32, 6, 47, 60, 43, 42, 48, 54, 55, 109, 104, 98, 123, 83, 106, 101, 96, 120, 105, 126, 83, 110, 101, 104, 104, 101, 98, 107, 83, 120, 99, 103, 105, 98, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.CR, 4, Ascii.EM, 8, Ascii.SO, 52, Ascii.SI, Ascii.SO, Ascii.GS, 2, 8, Ascii.SO, 52, Ascii.CAN, 8, Ascii.EM, Ascii.SO, Ascii.SO, 5, 52, 10, 7, Ascii.FS, 10, Ascii.DC2, Ascii.CAN, 52, 4, 5, 100, 97, 107, 114, 90, 98, 117, 90, 106, 115, 96, 119, 105, 100, 124, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, Ascii.SI, Ascii.SYN, 62, 8, 0, 3, 62, 2, Ascii.DC4, Ascii.DC2, Ascii.NAK, Ascii.SO, Ascii.FF, 62, Ascii.DC2, 2, 9, 4, Ascii.FF, 0, Ascii.DC2, 62, 7, 8, Ascii.EM, 62, 4, Ascii.SI, 0, 3, Ascii.CR, 4, 5, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, Ascii.US, Ascii.ESC, 6, 5, 41, 5, 19, Ascii.NAK, Ascii.EM, Ascii.CAN, Ascii.DC2, 41, Ascii.NAK, Ascii.RS, Ascii.ETB, Ascii.CAN, Ascii.CAN, 19, Ascii.SUB, 41, 19, Ascii.CAN, Ascii.ETB, Ascii.DC4, Ascii.SUB, 19, Ascii.DC2, 52, 49, 59, 34, 10, 60, 59, 33, 10, 60, 56, 52, 50, 48, 10, 52, 38, 10, 54, 33, 52, 10, 48, 59, 52, 55, 57, 48, 49, 81, 84, 94, 71, 111, 89, 94, 68, 111, 89, 93, 81, 87, 85, 111, 81, 67, 111, 83, 68, 81, 111, 89, 94, 94, 85, 66, 111, 67, 65, 69, 81, 66, 85, 115, 118, 124, 101, 77, 123, 124, 102, 77, 96, 100, 77, 123, 124, 97, 102, 115, 126, 126, 77, 123, 124, 100, 115, 126, 123, 118, 115, 102, 123, 125, 124, 97, Base64.padSymbol, 56, 50, 43, 3, 53, 50, 40, 3, 46, 42, 3, 42, 53, 56, 57, 51, 3, Base64.padSymbol, 47, 3, 63, 40, Base64.padSymbol, 3, 57, 50, Base64.padSymbol, 62, 48, 57, 56, 71, 66, 72, 81, 121, 79, 72, 82, 121, 84, 80, 121, 80, 79, 66, 67, 73, 121, 71, 85, 121, 69, 82, 71, 121, 79, 72, 72, 67, 84, 121, 85, 87, 83, 71, 84, 67, 99, 102, 108, 117, 93, 107, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 93, 108, 103, 117, 93, 107, 111, 99, 101, 103, 93, 102, 103, 113, 107, 101, 108, 58, 63, 53, 44, 4, 55, 52, 60, 4, 56, 40, 4, 56, 54, 43, 121, 124, 118, 111, 71, 116, 119, Byte.MAX_VALUE, Byte.MAX_VALUE, 113, 118, Byte.MAX_VALUE, 71, 125, 118, 124, 104, 119, 113, 118, 108, 71, 104, 106, 125, 126, 113, 96, 34, 39, 45, 52, Ascii.FS, 45, 34, 55, 42, 53, 38, Ascii.FS, 32, 34, 49, 44, 54, 48, 38, 47, Ascii.FS, 32, 44, 46, 51, 34, 32, 55, Ascii.FS, 55, 43, 49, 38, 48, 43, 44, 47, 39, Ascii.EM, Ascii.FS, Ascii.SYN, Ascii.SI, 39, Ascii.SYN, Ascii.EM, Ascii.FF, 17, Ascii.SO, Ascii.GS, 39, Ascii.SO, 17, Ascii.FS, Ascii.GS, Ascii.ETB, 39, Ascii.DC4, Ascii.ETB, Ascii.ETB, 8, 17, Ascii.SYN, Ascii.US, 39, Ascii.GS, Ascii.SYN, Ascii.EM, Ascii.SUB, Ascii.DC4, Ascii.GS, Ascii.FS, 94, 91, 81, 72, 96, 81, 94, 75, 86, 73, 90, 96, 73, 86, 90, 72, 96, 76, 81, 94, 79, 76, 87, 80, 75, 96, 83, 80, 88, 88, 86, 81, 88, 96, 90, 81, 94, 93, 83, 90, 91, 44, 41, 35, 58, Ascii.DC2, 34, 35, 41, 40, 59, 36, 46, 40, Ascii.DC2, 37, 36, 62, 57, 34, 63, 52, Ascii.DC2, 41, 44, 57, 44, Ascii.DC2, 40, 35, 44, 47, 33, 40, 41, 32, 37, 47, 54, Ascii.RS, 46, 49, 36, 47, Ascii.RS, 39, 35, Ascii.RS, 32, 49, 49, Ascii.RS, 32, 45, 54, 32, 56, 50, 125, 120, 114, 107, 67, 108, 112, 125, 101, 125, 126, 112, 121, 67, Byte.MAX_VALUE, 112, 117, Byte.MAX_VALUE, 119, 67, 113, 125, 100, 67, 120, 121, 112, 125, 101, 67, 113, 111, 68, 65, 75, 82, 122, 85, 73, 68, 92, 68, 71, 73, 64, 122, 65, 76, 86, 68, 71, 73, 64, 122, 87, 64, 72, 74, 81, 64, 122, 74, 75, 122, 75, 64, 81, 82, 74, 87, 78, 122, 73, 74, 86, 86, 34, 39, 45, 52, Ascii.FS, 51, 47, 34, 58, 34, 33, 47, 38, 48, Ascii.FS, 47, 44, 36, 36, 42, 45, 36, Ascii.FS, 38, 45, 34, 33, 47, 38, 39, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.ESC, 7, 10, Ascii.DC2, 10, 9, 7, Ascii.SO, Ascii.CAN, 52, 5, Ascii.SO, Ascii.FS, 52, Ascii.SI, Ascii.SO, Ascii.CAN, 2, Ascii.FF, 5, 46, 43, 33, 56, 16, 63, 35, 46, 54, 46, 45, 35, 42, 60, 16, 60, 39, 32, 56, 16, 42, 33, 43, 44, 46, Base64.padSymbol, 43, 1, 4, Ascii.SO, Ascii.ETB, 63, 16, Ascii.DC2, 5, Ascii.FF, Ascii.SI, 1, 4, 63, 9, Ascii.SO, Ascii.DC4, 5, Ascii.DC2, 19, Ascii.DC4, 9, Ascii.DC4, 9, 1, Ascii.FF, 63, 4, Ascii.EM, Ascii.SO, 1, Ascii.CR, 9, 3, 63, Ascii.ETB, 5, 2, Ascii.SYN, 9, 5, Ascii.ETB, 52, 49, 59, 34, 10, 37, 39, 48, 57, 58, 52, 49, 10, 59, 52, 33, 60, 35, 48, 10, 49, 44, 59, 52, 56, 60, 54, 10, 34, 48, 55, 35, 60, 48, 34, 76, 73, 67, 90, 114, 93, 95, 72, 65, 66, 76, 73, 114, 95, 91, 114, 73, 84, 67, 76, 64, 68, 78, 114, 90, 72, 79, 91, 68, 72, 90, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.GS, Ascii.US, 8, Ascii.ESC, 8, 3, Ascii.EM, 50, Ascii.GS, 1, Ascii.FF, Ascii.DC4, Ascii.FF, Ascii.SI, 1, 8, 50, Ascii.FF, Ascii.CAN, Ascii.EM, 2, 50, Ascii.SO, 1, 4, Ascii.SO, 6, 79, 74, 64, 89, 113, 94, 91, 92, 73, 75, 113, 65, 64, 113, Ascii.SUB, Ascii.US, Ascii.GS, 113, 92, 75, 93, 94, 65, 64, 93, 75, 55, 50, 56, 33, 9, 36, 51, 53, 57, 59, 38, 35, 34, 51, 9, 52, 34, 9, 55, 48, 34, 51, 36, 9, 51, 46, 34, 36, 55, 37, 9, 53, 62, 55, 56, 49, 51, 126, 123, 113, 104, 64, 109, 105, 64, 125, 106, 121, 121, 122, 109, 64, 124, 119, 122, 124, 116, 64, 122, 113, 126, 125, 115, 122, 123, 3, 6, Ascii.FF, Ascii.NAK, Base64.padSymbol, 16, Ascii.DC4, Base64.padSymbol, Ascii.DC2, Ascii.SO, 3, Ascii.ESC, 0, 3, 1, 9, Base64.padSymbol, 1, 16, 
        3, 17, 10, Base64.padSymbol, 4, 3, Ascii.SO, Ascii.SO, 0, 3, 1, 9, 121, 124, 118, 111, 71, 107, 125, 118, 124, 113, 118, Byte.MAX_VALUE, 71, 126, 106, 125, 105, 109, 125, 118, 123, 97, 71, 123, 121, 104, 104, 113, 118, Byte.MAX_VALUE, 71, 121, 116, 116, 119, 111, 125, 124, 33, 36, 46, 55, Ascii.US, 51, 37, 52, Ascii.US, 52, 37, 56, 52, Ascii.US, 35, 47, 44, 47, 50, Ascii.US, 36, 57, 46, 33, 45, 41, 35, 33, 44, 44, 57, 104, 109, 103, 126, 86, 122, 97, 102, 124, 101, 109, 86, 104, 109, 109, 86, 108, 113, 125, 108, 103, 122, 96, 102, 103, 86, 125, 102, 86, 121, 101, 104, 112, 104, 107, 101, 108, 122, 7, 2, 8, 17, 57, Ascii.NAK, Ascii.SO, 9, 19, 10, 2, 57, 5, 10, 3, 7, Ascii.DC4, 57, 0, 3, 7, Ascii.DC2, 19, Ascii.DC4, 3, 57, 5, 9, 8, 0, Ascii.SI, 1, 57, 9, 8, 57, 5, Ascii.DC4, 7, Ascii.NAK, Ascii.SO, 3, Ascii.NAK, 98, 103, 109, 116, 92, 112, 107, 108, 118, 111, 103, 92, 106, 100, 109, 108, 113, 102, 92, 103, 102, 112, 119, 113, 108, 122, 92, 96, 98, 111, 111, 123, 126, 116, 109, 69, 105, 114, 117, 111, 118, 126, 69, 115, 116, 121, 104, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 69, 104, Byte.MAX_VALUE, 110, 104, 99, 69, 121, 117, 111, 116, 110, Byte.MAX_VALUE, 104, 69, 117, 116, 69, Byte.MAX_VALUE, 119, 106, 110, 99, 69, 104, Byte.MAX_VALUE, 105, 106, 117, 116, 105, Byte.MAX_VALUE, 35, 38, 44, 53, Ascii.GS, 49, 42, 45, 55, 46, 38, Ascii.GS, 43, 44, 43, 54, Ascii.GS, 36, 48, 45, 47, Ascii.GS, 33, 45, 44, 54, 39, 44, 54, Ascii.GS, 50, 48, 45, 52, 43, 38, 39, 48, 96, 101, 111, 118, 94, 114, 105, 110, 116, 109, 101, 94, 104, 111, 104, 117, 94, 110, 111, 94, 98, 109, 96, 114, 114, 94, 109, 110, 96, 101, 104, 111, 102, 106, 111, 101, 124, 84, 120, 99, 100, 126, 103, 111, 84, 103, 100, 108, 84, 106, 120, 120, 110, Byte.MAX_VALUE, 84, 126, 121, 103, 69, 64, 74, 83, 123, 87, 76, 75, 81, 72, 64, 123, 84, 86, 65, 71, 75, 73, 84, 81, 80, 65, 123, 70, 77, 64, 64, 65, 86, 123, 80, 75, 79, 65, 74, 83, 86, 92, 69, 109, 65, 89, 91, 66, 109, 68, 91, 86, 87, 93, 109, 92, 93, 92, 109, 90, 83, 64, 86, 69, 83, 64, 87, 109, 83, 81, 81, 87, 94, 87, 64, 83, 70, 87, 86, 115, 118, 124, 101, 77, 97, 98, 126, 123, 102, 77, 97, 113, 96, 119, 119, 124, 77, 119, 124, 115, 112, 126, 119, 118, 77, 36, 77, 35, 36, 125, 120, 114, 107, 67, 111, 104, 125, Byte.MAX_VALUE, 119, 104, 110, 125, Byte.MAX_VALUE, 121, 67, 123, 110, 115, 105, 108, 117, 114, 123, 67, 121, 114, 125, 126, 112, 121, 120, 54, 51, 57, 32, 8, 36, 46, 57, 52, 8, 54, 49, 35, 50, 37, 8, 54, 51, 8, 59, 56, 54, 51, 72, 77, 71, 94, 118, 90, 80, 71, 74, 118, 76, 71, 77, 89, 70, 64, 71, 93, 118, 89, 91, 76, 79, 64, 81, 50, 55, Base64.padSymbol, 36, Ascii.FF, 39, 58, 62, 54, Ascii.FF, 39, 60, Ascii.FF, 36, 50, 58, 39, Ascii.FF, 53, 60, 33, Ascii.FF, 37, 58, 55, 54, 60, Ascii.FF, 35, 63, 50, 42, Ascii.FF, 62, 32, 53, 48, 58, 35, Ascii.VT, 32, Base64.padSymbol, 57, 49, Ascii.VT, 32, 59, Ascii.VT, 35, 53, Base64.padSymbol, 32, Ascii.VT, 50, 59, 38, Ascii.VT, 34, Base64.padSymbol, 48, 49, 59, Ascii.VT, 36, 38, 49, 36, 53, 38, 49, 48, Ascii.VT, 57, 39, 113, 116, 126, 103, 79, 100, 121, 125, 117, Byte.MAX_VALUE, 101, 100, 79, 98, 117, 103, 113, 98, 116, 117, 116, 79, 102, 121, 116, 117, Byte.MAX_VALUE, Ascii.RS, Ascii.ESC, 17, 8, 32, Ascii.VT, Ascii.CR, Ascii.SYN, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.CR, 32, 17, Ascii.RS, Ascii.VT, Ascii.SYN, 9, Ascii.SUB, 32, Ascii.CR, Ascii.SUB, Ascii.CAN, Ascii.SYN, Ascii.FF, Ascii.VT, Ascii.SUB, Ascii.CR, 32, 9, Ascii.SYN, Ascii.SUB, 8, 32, Ascii.SUB, Ascii.CR, Ascii.CR, 16, Ascii.CR, 32, Ascii.FS, Ascii.RS, 19, 19, Ascii.GS, Ascii.RS, Ascii.FS, Ascii.DC4, 34, 39, 45, 52, Ascii.FS, 54, 45, 42, 50, 54, 38, Ascii.FS, 39, 33, Ascii.FS, 45, 34, 46, 38, Ascii.FS, 51, 38, 49, Ascii.FS, 51, 49, 44, 32, 38, 48, 48, Ascii.US, Ascii.SUB, 16, 9, 33, Ascii.VT, Ascii.SO, Ascii.SUB, Ascii.US, 10, Ascii.ESC, 33, Ascii.ESC, 6, 10, Ascii.FF, Ascii.US, 33, Ascii.SYN, Ascii.ETB, 16, 10, Ascii.CR, 33, Ascii.CAN, 17, Ascii.FF, 33, Ascii.GS, Ascii.SYN, Ascii.US, Ascii.ETB, 16, Ascii.ETB, 16, Ascii.EM, Ascii.EM, Ascii.FS, Ascii.SYN, Ascii.SI, 39, Ascii.CR, Ascii.VT, Ascii.GS, 39, Ascii.EM, 8, 8, 39, Ascii.FS, 17, Ascii.US, Ascii.GS, Ascii.VT, Ascii.FF, 39, Ascii.EM, 8, 17, 75, 78, 68, 93, 117, 95, 89, 79, 117, 73, 75, 73, 66, 79, 78, 117, 79, 82, 79, 73, 95, 94, 69, 88, 117, 76, 69, 88, 117, 68, 79, 94, 93, 69, 88, 65, 105, 108, 102, Byte.MAX_VALUE, 87, 125, 123, 109, 87, 107, 105, 107, 96, 109, 108, 87, 109, 112, 109, 107, 125, 124, 103, 122, 87, 97, 102, 87, 107, 105, 107, 96, 109, 87, 101, 105, 102, 105, 111, 109, 122, 42, 47, 37, 60, Ascii.DC4, 62, 56, 46, Ascii.DC4, 57, 34, 59, 59, 39, 46, Ascii.DC4, 42, 37, 34, 38, 42, 63, 34, 36, 37, 125, 120, 114, 107, 67, 105, 111, 121, 67, 111, 121, Byte.MAX_VALUE, 105, 110, 121, 67, 105, 110, 117, 67, 108, 125, 110, 111, 121, 110, Ascii.VT, Ascii.SO, 4, Ascii.GS, 53, Ascii.FS, 3, Ascii.SO, Ascii.SI, 5, 53, Ascii.EM, Ascii.SI, 9, 5, 4, Ascii.SO, 53, 9, 2, Ascii.VT, 4, 4, Ascii.SI, 6, 53, Ascii.SI, 4, Ascii.VT, 8, 6, Ascii.SI, Ascii.SO, 98, 118, 119, 108, 113, 108, 119, 98, 119, 102, 92, 103, 106, 112, 98, 97, 111, 102, 103, 92, 72, 73, 82, 79, 82, 73, 92, 73, 88, 98, 88, 83, 92, 95, 81, 88, 89, 86, 89, 92, 86, 94, 82, 64, 84, 71, 81, 106, 65, 92, 88, 80, 106, 88, 70, 60, 48, 50, 113, 57, 62, 60, 58, Base64.padSymbol, 48, 48, 52, 113, 62, 59, 44, 113, Ascii.EM, 
        Ascii.SUB, Ascii.RS, Ascii.VT, 10, Ascii.CR, Ascii.SUB, 0, Ascii.FS, 16, 17, Ascii.EM, Ascii.SYN, Ascii.CAN, 66, 70, 65, 70, 66, 90, 66, 112, 74, 67, 78, 95, 92, 74, 75, 112, 91, 70, 66, 74, 112, 78, 73, 91, 74, 93, 112, 70, 66, 95, 93, 74, 92, 92, 70, 64, 65, 17, 10, 19, 19, 124, 107, 125, 122, 124, 103, 109, 122, 107, 106, 81, 106, 111, 122, 111, 81, 126, 124, 97, 109, 107, 125, 125, 103, 96, 105, 81, 109, 97, 99, 108, 103, 96, 111, 122, 103, 97, 96, 125, 41, 46, 59, 57, 49, 5, 46, 40, 59, 57, 63, 5, 41, 59, 55, 42, 54, 63, 5, 40, 59, 46, 63, Ascii.DC4, Ascii.VT, 6, 7, Ascii.CR, Base64.padSymbol, 3, Ascii.FF, 6, Base64.padSymbol, 7, Ascii.FF, 6, 1, 3, 16, 6, Base64.padSymbol, 3, Ascii.ETB, Ascii.SYN, Ascii.CR, 16, Ascii.CR, Ascii.SYN, 3, Ascii.SYN, 7, 6, 6, 6};
    }

    static {
        A0c();
        A04 = new String[0];
        A05 = new String[]{A0R(86, 5, 14), A0R(65, 9, 115), A0R(74, 12, 88)};
    }

    public IP(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0R(4982, 31, 113), context), 0);
    }

    public static float A00(Context context) {
        return A0Q(context).A01(A0R(2538, 39, 96), 0.98f);
    }

    private final float A01(String str, float f) {
        String string = this.A00.getString(str, String.valueOf(f));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return f;
                }
                f = Float.parseFloat(string);
                return f;
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public static int A02(Context context) {
        return A0Q(context).A2P(A0R(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0Q(context).A2P(A0R(2398, 33, 123), 0);
    }

    public static int A04(Context context) {
        return A0Q(context).A2P(A0R(2511, 27, 117), -1);
    }

    public static int A05(Context context) {
        return A0Q(context).A2P(A0R(851, 37, 10), 3);
    }

    public static int A06(Context context) {
        return A0Q(context).A2P(A0R(4964, 18, 27), 0);
    }

    public static int A07(Context context) {
        return A0Q(context).A2P(A0R(597, 36, 113), PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    public static int A08(Context context) {
        return A0Q(context).A2P(A0R(1550, 50, 119), 30000);
    }

    public static int A09(Context context) {
        return A0Q(context).A2P(A0R(1644, 40, 20), 3);
    }

    public static int A0A(Context context) {
        return A0Q(context).A2P(A0R(1600, 44, 25), 8000);
    }

    public static int A0B(Context context) {
        return A0Q(context).A2P(A0R(1684, 48, 123), 100);
    }

    public static int A0C(Context context) {
        return A0Q(context).A2P(A0R(1732, 39, 65), 60000);
    }

    public static int A0D(Context context) {
        return A0Q(context).A2P(A0R(3007, 26, 119), -1);
    }

    public static int A0E(Context context) {
        return A0Q(context).A2P(A0R(3424, 38, 109), 225);
    }

    public static int A0F(Context context) {
        return A0Q(context).A2P(A0R(1319, 41, 37), 3145728);
    }

    public static int A0G(Context context) {
        return A0Q(context).A2P(A0R(5013, 37, 1), -1);
    }

    public static int A0H(Context context) {
        return A0Q(context).A2P(A0R(3593, 32, 50), AdError.SERVER_ERROR_CODE);
    }

    public static int A0I(Context context) {
        return A0Q(context).A2P(A0R(371, 46, 43), -1);
    }

    public static int A0J(Context context) {
        return A0Q(context).A2P(A0R(5093, 23, 116), 0);
    }

    public static int A0K(Context context) {
        return A0Q(context).A2P(A0R(4527, 35, 125), PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    public static int A0L(Context context) {
        return A0Q(context).A2P(A0R(4562, 39, 122), PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    public static int A0M(Context context) {
        return A0Q(context).A2P(A0R(1465, 46, 40), 0);
    }

    public static long A0N(Context context) {
        return A0Q(context).A2Q(A0R(817, 34, 83), 67108864L);
    }

    public static long A0O(Context context) {
        return A0Q(context).A2Q(A0R(972, 45, 49), 1048576L);
    }

    public static long A0P(Context context) {
        return A0Q(context).A2Q(A0R(1125, 38, 67), 33554432L);
    }

    public static synchronized IP A0Q(Context context) {
        IP ip;
        synchronized (IP.class) {
            if (A01 == null) {
                A01 = new IP(context);
            }
            ip = A01;
        }
        return ip;
    }

    public static String A0S(Context context) {
        return A0Q(context).A2R(A0R(3396, 28, 54), A0R(5144, 3, 95));
    }

    public static String A0T(Context context) {
        return A0Q(context).A2R(A0R(4502, 25, 7), A0R(5144, 3, 95));
    }

    public static String A0U(Context context) {
        return A0Q(context).A2R(A0R(117, 52, 109), A0R(1, 6, 36));
    }

    public static String A0V(Context context) {
        return A0Q(context).A2R(A0R(268, 51, 11), A0R(24, 41, 29));
    }

    public static String A0W(Context context) {
        return A0Q(context).A2R(A0R(Opcodes.RET, 53, 86), A0R(7, 8, 63));
    }

    public static String A0X(Context context) {
        return A0Q(context).A2R(A0R(319, 52, 81), A0R(15, 9, 110));
    }

    public static Set<String> A0Y(Context context) {
        return A0Q(context).A0b(A0R(676, 44, 110), A04);
    }

    public static Set<String> A0Z(Context context) {
        return A0Q(context).A0b(A0R(5054, 39, 32), A05);
    }

    public static Set<String> A0a(Context context) {
        return A0Q(context).A0b(A0R(2282, 44, 108), A04);
    }

    private Set<String> A0b(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2R(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(jSONArray.getString(i));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    public static void A0d(Context context) {
        A0Q(context).A00.edit().clear().commit();
    }

    private void A0e(String str, String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0R(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0f(json, str2);
    }

    private void A0f(JSONObject jSONObject, String str) throws JSONException {
        SharedPreferences.Editor edit = this.A00.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(A0R(93, 24, 54))) {
                A0e(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0R(0, 1, 108) + str2;
                }
                edit.putString(str2, jSONObject.getString(next));
            }
        }
        edit.apply();
    }

    public static boolean A0g(Context context) {
        return A0Q(context).A2R(A0R(5116, 28, 76), A0R(4927, 19, 45)).equals(A0R(4946, 18, 19));
    }

    public static boolean A0h(Context context) {
        return A0Q(context).A2U(A0R(527, 38, 80), false);
    }

    public static boolean A0i(Context context) {
        return A0Q(context).A2U(A0R(3916, 37, 120), false);
    }

    public static boolean A0j(Context context) {
        return A0Q(context).A2U(A0R(633, 43, 63), true);
    }

    public static boolean A0k(Context context) {
        return A0Q(context).A2U(A0R(2645, 29, 17), true);
    }

    public static boolean A0l(Context context) {
        return A0Q(context).A2U(A0R(3724, 27, 97), false);
    }

    public static boolean A0m(Context context) {
        return A0Q(context).A2U(A0R(928, 44, 8), true);
    }

    public static boolean A0n(Context context) {
        return A0Q(context).A2U(A0R(2486, 25, 24), true);
    }

    public static boolean A0o(Context context) {
        return A0Q(context).A2U(A0R(3625, 44, 11), true);
    }

    public static boolean A0p(Context context) {
        return A0Q(context).A2U(A0R(1055, 37, 120), true);
    }

    public static boolean A0q(Context context) {
        return A0Q(context).A2U(A0R(2615, 30, 14), false);
    }

    public static boolean A0r(Context context) {
        return A0Q(context).A2U(A0R(3245, 33, 60), false);
    }

    public static boolean A0s(Context context) {
        return A0Q(context).A2U(A0R(1092, 33, 31), true);
    }

    public static boolean A0t(Context context) {
        return A0Q(context).A2U(A0R(2949, 28, 52), false);
    }

    public static boolean A0u(Context context) {
        return A0Q(context).A2U(A0R(1163, 40, 55), true);
    }

    public static boolean A0v(Context context) {
        return A0Q(context).A2U(A0R(1203, 35, 37), false);
    }

    public static boolean A0w(Context context) {
        return A0Q(context).A2U(A0R(2785, 18, 43), false);
    }

    public static boolean A0x(Context context) {
        return A0Q(context).A2U(A0R(3115, 35, 79), true);
    }

    public static boolean A0y(Context context) {
        return A0Q(context).A2U(A0R(565, 32, 97), false);
    }

    public static boolean A0z(Context context) {
        return A0Q(context).A2U(A0R(450, 25, 112), false);
    }

    public static boolean A10(Context context) {
        return A0Q(context).A2U(A0R(475, 52, 54), false);
    }

    public static boolean A11(Context context) {
        return A0Q(context).A2U(A0R(3033, 25, 34), false);
    }

    public static boolean A12(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        IP A0Q = A0Q(context);
        String A0R = A0R(2674, 25, 87);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return A0Q.A2U(A0R, false);
    }

    public static boolean A13(Context context) {
        return A0Q(context).A2U(A0R(2925, 24, 54), false);
    }

    public static boolean A14(Context context) {
        return A0Q(context).A2U(A0R(3536, 34, 99), false);
    }

    public static boolean A15(Context context) {
        return A0Q(context).A2U(A0R(3092, 23, 43), false);
    }

    public static boolean A16(Context context) {
        return A0Q(context).A2U(A0R(2977, 30, 100), true);
    }

    public static boolean A17(Context context) {
        return A0Q(context).A2U(A0R(3182, 29, 123), false);
    }

    public static boolean A18(Context context) {
        return A0Q(context).A2U(A0R(3211, 34, 30), false);
    }

    public static boolean A19(Context context) {
        return A0Q(context).A2U(A0R(3278, 32, 114), false);
    }

    public static boolean A1A(Context context) {
        return A0Q(context).A2U(A0R(3310, 37, 8), false);
    }

    public static boolean A1B(Context context) {
        return A0Q(context).A2U(A0R(1391, 23, 8), false);
    }

    public static boolean A1C(Context context) {
        return A0Q(context).A2U(A0R(3495, 41, 17), false);
    }

    public static boolean A1D(Context context) {
        return A0Q(context).A2U(A0R(2887, 22, 91), false);
    }

    public static boolean A1E(Context context) {
        return A0Q(context).A2U(A0R(3953, 28, 49), true);
    }

    public static boolean A1F(Context context) {
        return A0Q(context).A2U(A0R(3981, 31, 76), true);
    }

    public static boolean A1G(Context context) {
        return A0Q(context).A2U(A0R(4417, 30, 60), false);
    }

    public static boolean A1H(Context context) {
        return A0Q(context).A2U(A0R(4447, 32, 50), false);
    }

    public static boolean A1I(Context context) {
        return A0Q(context).A2U(A0R(222, 46, 76), false);
    }

    public static boolean A1J(Context context) {
        return A0Q(context).A2U(A0R(3462, 33, 86), false);
    }

    public static boolean A1K(Context context) {
        return A0Q(context).A2U(A0R(3381, 15, 117), false);
    }

    public static boolean A1L(Context context) {
        return A0Q(context).A2U(A0R(2577, 38, 69), false);
    }

    public static boolean A1M(Context context) {
        return A0Q(context).A2U(A0R(2849, 19, 47), true);
    }

    public static boolean A1N(Context context) {
        return A0Q(context).A2U(A0R(2353, 45, 13), false);
    }

    public static boolean A1O(Context context) {
        return A0Q(context).A2U(A0R(1771, 25, 34), true);
    }

    public static boolean A1P(Context context) {
        return A0Q(context).A2U(A0R(3751, 41, 78), true);
    }

    public static boolean A1Q(Context context) {
        return A0Q(context).A2U(A0R(2868, 19, 64), true);
    }

    public static boolean A1R(Context context) {
        return A0Q(context).A2U(A0R(3792, 35, 123), true);
    }

    public static boolean A1S(Context context) {
        return A0Q(context).A2U(A0R(3827, 31, 3), true);
    }

    public static boolean A1T(Context context) {
        return A0Q(context).A2U(A0R(3858, 32, 67), true);
    }

    public static boolean A1U(Context context) {
        return A0Q(context).A2U(A0R(1796, 45, 117), true);
    }

    public static boolean A1V(Context context) {
        return A0Q(context).A2U(A0R(1841, 57, 108), false);
    }

    public static boolean A1W(Context context) {
        return A0Q(context).A2U(A0R(1898, 59, 20), true);
    }

    public static boolean A1X(Context context) {
        return A0Q(context).A2U(A0R(3150, 32, 88), false);
    }

    public static boolean A1Y(Context context) {
        return A0Q(context).A2U(A0R(4894, 33, 68), false);
    }

    public static boolean A1Z(Context context) {
        return A0Q(context).A2U(A0R(4012, 38, 54), true);
    }

    public static boolean A1a(Context context) {
        return A0Q(context).A2U(A0R(4081, 38, 39), true);
    }

    public static boolean A1b(Context context) {
        return A0Q(context).A2U(A0R(3570, 23, 111), true);
    }

    public static boolean A1c(Context context) {
        return A0Q(context).A2U(A0R(2431, 21, 106), false);
    }

    public static boolean A1d(Context context) {
        return A0Q(context).A2U(A0R(1957, 44, 98), true);
    }

    public static boolean A1e(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0Q(context).A2U(A0R(720, 46, 74), false);
    }

    public static boolean A1f(Context context) {
        return A0Q(context).A2U(A0R(766, 51, 60), true);
    }

    public static boolean A1g(Context context) {
        return A0Q(context).A2U(A0R(4119, 43, 72), true);
    }

    public static boolean A1h(Context context) {
        return A0Q(context).A2U(A0R(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 38, 50), false);
    }

    public static boolean A1i(Context context) {
        return A0Q(context).A2U(A0R(3669, 30, 109), true);
    }

    public static boolean A1j(Context context) {
        return A0Q(context).A2U(A0R(2326, 27, 85), false);
    }

    public static boolean A1k(Context context) {
        return A0Q(context).A2U(A0R(1414, 51, 54), false);
    }

    public static boolean A1l(Context context) {
        return A0Q(context).A2U(A0R(1238, 40, 69), true);
    }

    public static boolean A1m(Context context) {
        return A0Q(context).A2U(A0R(AdError.INTERNAL_ERROR_CODE, 31, 72), false);
    }

    public static boolean A1n(Context context) {
        return A0Q(context).A2U(A0R(1278, 41, 90), false);
    }

    public static boolean A1o(Context context) {
        return A0Q(context).A2U(A0R(4162, 31, 45), false);
    }

    public static boolean A1p(Context context) {
        return A0Q(context).A2U(A0R(4193, 53, 52), false);
    }

    public static boolean A1q(Context context) {
        return A0Q(context).A2U(A0R(4246, 38, 108), true);
    }

    public static boolean A1r(Context context) {
        return A0Q(context).A2U(A0R(4284, 33, 47), false);
    }

    public static boolean A1s(Context context) {
        return A0Q(context).A2U(A0R(2032, 53, 102), false);
    }

    public static boolean A1t(Context context) {
        return A0Q(context).A2U(A0R(3058, 34, 69), false);
    }

    public static boolean A1u(Context context) {
        return A0Q(context).A2U(A0R(2085, 48, 61), false);
    }

    public static boolean A1v(Context context) {
        return A0Q(context).A2U(A0R(4317, 25, 37), false);
    }

    public static boolean A1w(Context context) {
        return A0Q(context).A2U(A0R(2452, 34, 22), false);
    }

    public static boolean A1x(Context context) {
        return A0Q(context).A2U(A0R(4342, 35, 10), false);
    }

    public static boolean A1y(Context context) {
        return A0Q(context).A2U(A0R(3890, 26, 0), false);
    }

    public static boolean A1z(Context context) {
        return A0Q(context).A2U(A0R(2133, 51, 53), true);
    }

    public static boolean A20(Context context) {
        return A0Q(context).A2U(A0R(4050, 31, 110), false);
    }

    public static boolean A21(Context context) {
        return A0Q(context).A2U(A0R(1360, 31, 100), false);
    }

    public static boolean A22(Context context) {
        return A0Q(context).A2U(A0R(4479, 23, 121), true);
    }

    public static boolean A23(Context context) {
        return A0Q(context).A2U(A0R(4601, 27, 62), false);
    }

    public static boolean A24(Context context) {
        return A0Q(context).A2U(A0R(4707, 36, 80), false);
    }

    public static boolean A25(Context context) {
        return A0Q(context).A2U(A0R(2803, 46, 0), true);
    }

    public static boolean A26(Context context) {
        return A0Q(context).A2U(A0R(3347, 34, 44), false);
    }

    public static boolean A27(Context context) {
        return A0Q(context).A2U(A0R(4843, 25, 101), false);
    }

    public static boolean A28(Context context) {
        return A0Q(context).A2U(A0R(4676, 31, 109), false);
    }

    public static boolean A29(Context context) {
        return A0Q(context).A2U(A0R(4377, 40, 28), true);
    }

    public static boolean A2A(Context context) {
        return A0Q(context).A2U(A0R(2909, 16, 58), true);
    }

    public static boolean A2B(Context context) {
        return A0Q(context).A2U(A0R(4628, 48, 81), false);
    }

    public static boolean A2C(Context context) {
        return A0Q(context).A2U(A0R(4743, 23, 86), true);
    }

    public static boolean A2D(Context context) {
        return A0Q(context).A2U(A0R(2184, 18, 90), false);
    }

    public static boolean A2E(Context context) {
        return A0Q(context).A2U(A0R(2202, 40, 20), false);
    }

    public static boolean A2F(Context context) {
        return A0Q(context).A2U(A0R(4766, 36, 4), false);
    }

    public static boolean A2G(Context context) {
        return A0Q(context).A2U(A0R(4802, 41, 38), true);
    }

    public static boolean A2H(Context context) {
        return A0Q(context).A2U(A0R(888, 40, 46), false);
    }

    public static boolean A2I(Context context) {
        return A0Q(context).A2U(A0R(1511, 39, 51), false);
    }

    public static boolean A2J(Context context) {
        return A0Q(context).A2U(A0R(3699, 25, 69), false);
    }

    public static boolean A2K(Context context) {
        return A0Q(context).A2U(A0R(4868, 26, 50), true);
    }

    public static boolean A2L(Context context) {
        return A0Q(context).A2U(A0R(2242, 40, 124), true);
    }

    public static boolean A2M(Context context, boolean z) {
        return A2O(context, z) && A0Q(context).A2U(A0R(2699, 27, 66), false);
    }

    public static boolean A2N(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A2M(context, z) && A0Q(context).A2U(A0R(2726, 35, 2), true);
    }

    public static boolean A2O(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0Q(context).A2U(A0R(2761, 24, 84), false);
    }

    public final int A2P(String str, int i) {
        String string = this.A00.getString(str, String.valueOf(i));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return i;
                }
                i = Integer.parseInt(string);
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final long A2Q(String str, long j) {
        String string = this.A00.getString(str, String.valueOf(j));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return j;
                }
                j = Long.parseLong(string);
                return j;
            } catch (NumberFormatException unused) {
                return j;
            }
        }
        return j;
    }

    public final String A2R(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string == null) {
            return str2;
        }
        String value = A0R(5050, 4, 81);
        return string.equals(value) ? str2 : string;
    }

    public final void A2S(String str) throws JSONException {
        A0e(str, null);
    }

    public final void A2T(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0f(jSONObject, null);
    }

    public final boolean A2U(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            String value = A0R(5050, 4, 81);
            boolean equals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return equals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
