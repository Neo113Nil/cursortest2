package com.instagram.common.viewpoint.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01624o {
    public static byte[] A00;
    public static String[] A01 = {"ftBSrscYCZrU1XGsUffOBJlxDQfDqofj", "6A6pNCV2uhgoYcLypb", "8GOV2FUSZps1pTbJ4je5MwftASUnZkM1", "4wRLkwVxN17llLy", "8LQiKKC5rqzUsPzG", "bVt1RMPFhi5Vk9jMxK8mGuGgg99xJtg4", "bUya0H86JSXRIIoahVHYTIdtcqgWtSBf", "i4ePvK4hrBrPNKxpSWALXVVM3"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i, String str) throws C01594l {
        try {
            if (!AbstractC01484a.A19(sQLiteDatabase, A01(Opcodes.IF_ICMPEQ, 17, 73))) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query(A01(Opcodes.IF_ICMPEQ, 17, 73), new String[]{A01(244, 7, 93)}, A01(Opcodes.INVOKESPECIAL, 32, 22), A05(i, str), null, null, null);
            try {
                if (query.getCount() == 0) {
                    if (query != null) {
                        query.close();
                    }
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new C01594l(e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{53, 36, 51, 55, 34, 51, 86, 34, 55, 52, 58, 51, 86, Utf8.REPLACEMENT_BYTE, 48, 86, 56, 57, 34, 86, 51, 46, Utf8.REPLACEMENT_BYTE, 37, 34, 37, 86, 51, Ascii.SO, Ascii.EM, 38, Ascii.SUB, Ascii.ETB, Ascii.SI, 19, 4, 32, 19, 4, 5, Ascii.US, Ascii.EM, Ascii.CAN, 5, 86, 94, 16, 19, Ascii.ETB, 2, 3, 4, 19, 86, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, Ascii.US, Ascii.CAN, 5, 2, Ascii.ETB, Ascii.CAN, Ascii.NAK, 19, 41, 3, Ascii.US, Ascii.DC2, 86, 34, 51, 46, 34, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 0, 19, 4, 5, Ascii.US, Ascii.EM, Ascii.CAN, 86, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 38, 36, Utf8.REPLACEMENT_BYTE, 59, 55, 36, 47, 86, Base64.padSymbol, 51, 47, 86, 94, 16, 19, Ascii.ETB, 2, 3, 4, 19, 90, 86, Ascii.US, Ascii.CAN, 5, 2, Ascii.ETB, Ascii.CAN, Ascii.NAK, 19, 41, 3, Ascii.US, Ascii.DC2, 95, 95, Ascii.GS, 32, 55, 8, 52, 57, 33, Base64.padSymbol, 42, Ascii.SO, Base64.padSymbol, 42, 43, 49, 55, 54, 43, 103, 100, 96, 117, 116, 115, 100, 97, 98, 102, 115, 114, 117, 98, 39, 58, 39, 56, 39, 70, 73, 67, 39, 110, 105, 116, 115, 102, 105, 100, 98, 88, 114, 110, 99, 39, 58, 39, 56, 64, 72, 72, 64, 9, 66, 95, 72, 9, 67, 70, 83, 70, 69, 70, 84, 66, 9, Ascii.SO, 19, Ascii.DC4, 1, Ascii.SO, 3, 5, Utf8.REPLACEMENT_BYTE, Ascii.NAK, 9, 4, 58, 41, 62, Utf8.REPLACEMENT_BYTE, 37, 35, 34};
        String[] strArr = A01;
        if (strArr[6].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        A01[7] = "SNjSmBwt36dpbjCWXjm4KdaDp";
    }

    static {
        A02();
        C2T.A03(A01(215, 17, 54));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i, String str) throws C01594l {
        String A012 = A01(Opcodes.IF_ICMPEQ, 17, 73);
        try {
            if (!AbstractC01484a.A19(sQLiteDatabase, A012)) {
                return;
            }
            sQLiteDatabase.delete(A012, A01(Opcodes.INVOKESPECIAL, 32, 22), A05(i, str));
        } catch (SQLException e) {
            throw new C01594l(e);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C01594l {
        try {
            sQLiteDatabase.execSQL(A01(0, Opcodes.IF_ICMPEQ, 103));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(Opcodes.ARETURN, 7, 16), Integer.valueOf(i));
            contentValues.put(A01(232, 12, Opcodes.LREM), str);
            contentValues.put(A01(244, 7, 93), Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow(A01(Opcodes.IF_ICMPEQ, 17, 73), null, contentValues);
        } catch (SQLException e) {
            throw new C01594l(e);
        }
    }

    public static String[] A05(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
