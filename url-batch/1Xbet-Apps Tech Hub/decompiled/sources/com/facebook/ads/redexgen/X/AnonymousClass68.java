package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.68, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass68 {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AnonymousClass60 A02(C7S c7s) {
        Object A002;
        Method A022;
        Object A003;
        Method A023 = AnonymousClass69.A02(A00, A04(257, 29, 114), Context.class);
        if (A023 == null || (A002 = AnonymousClass69.A00(null, A023, c7s)) == null || ((Integer) A002).intValue() != 0 || (A022 = AnonymousClass69.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (A003 = AnonymousClass69.A00(null, A022, c7s)) == null) {
            return null;
        }
        Method A012 = AnonymousClass69.A01(A003.getClass(), A04(252, 5, 38), new Class[0]);
        Method A013 = AnonymousClass69.A01(A003.getClass(), A04(286, 24, 120), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String str = (String) AnonymousClass69.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) AnonymousClass69.A00(A003, A013, new Object[0]);
        if (str != null) {
            return new AnonymousClass60(str, bool != null && bool.booleanValue(), EnumC02815z.A07);
        }
        return null;
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, 19, 84, 86, 71, 19, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, 71, 91, 65, 86, 82, 87, Ascii.GS, 91, 87, 85, Ascii.SYN, 95, 87, 87, 95, 84, 93, Ascii.SYN, 89, 86, 92, 74, 87, 81, 92, Ascii.SYN, 95, 85, 75, 82, 94, 92, Ascii.US, 86, 94, 94, 86, 93, 84, Ascii.US, 80, 95, 85, 67, 94, 88, 85, Ascii.US, 86, 92, 66, Ascii.US, 80, 85, 66, Ascii.US, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, Ascii.US, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, Ascii.DC2, Ascii.RS, Ascii.FS, 95, Ascii.SYN, Ascii.RS, Ascii.RS, Ascii.SYN, Ascii.GS, Ascii.DC4, 95, 16, Ascii.US, Ascii.NAK, 3, Ascii.RS, Ascii.CAN, Ascii.NAK, 95, Ascii.SYN, Ascii.FS, 2, 95, Ascii.DC2, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.US, 95, 54, Ascii.RS, Ascii.RS, Ascii.SYN, Ascii.GS, Ascii.DC4, 33, Ascii.GS, 16, 8, 34, Ascii.DC4, 3, 7, Ascii.CAN, Ascii.DC2, Ascii.DC4, 2, 36, 5, Ascii.CAN, Ascii.GS, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, Byte.MAX_VALUE, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, Ascii.SI, 39, 39, 47, 36, 45, Ascii.CAN, 36, 41, 49, Ascii.ESC, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, Ascii.SO, 43, 47, 43, 54, 3, 38, Ascii.SYN, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A02[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A01 = bArr;
    }

    static {
        A05();
        A03 = AnonymousClass60.class.getSimpleName();
        A00 = A04(Opcodes.LRETURN, 52, 75);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnonymousClass60 A00(C7S c7s) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AnonymousClass60 A012 = A01(c7s);
            if (A012 != null) {
                boolean isEmpty = TextUtils.isEmpty(A012.A03());
                if (A02[0].charAt(25) != 'L') {
                    throw new RuntimeException();
                }
                A02[4] = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF";
            }
            A012 = A02(c7s);
            if (A012 == null || TextUtils.isEmpty(A012.A03())) {
                return A03(c7s);
            }
            return A012;
        }
        throw new IllegalStateException(A04(0, 43, 9));
    }

    public static AnonymousClass60 A01(C7S c7s) {
        C7W adId = c7s.A04().A7h();
        if (adId != null) {
            return new AnonymousClass60(adId.getId(), adId.A8w(), EnumC02815z.A03);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static AnonymousClass60 A03(C7S c7s) {
        AnonymousClass67 anonymousClass67 = new AnonymousClass67();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c7s.bindService(intent, anonymousClass67, 1)) {
            try {
                final IBinder A022 = anonymousClass67.A02();
                ?? r0 = new IInterface(A022) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    public IBinder A00;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A02[3] = "";
                            if (i4 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
                            i4++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{42, 54, 52, -11, 46, 54, 54, 46, 51, 44, -11, 40, 53, 43, 57, 54, 48, 43, -11, 46, 52, 58, -11, 40, 43, 58, -11, 48, 43, 44, 53, 59, 48, 45, 48, 44, 57, -11, 48, 53, 59, 44, 57, 53, 40, 51, -11, 16, 8, 43, Base64.padSymbol, 44, 57, 59, 48, 58, 48, 53, 46, 16, 43, Ascii.SUB, 44, 57, Base64.padSymbol, 48, 42, 44};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 119));
                            this.A00.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            return readString != null ? readString : A00(0, 0, 88);
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 119));
                            boolean z = true;
                            obtain.writeInt(1);
                            this.A00.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            if (obtain2.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new AnonymousClass60(r0.A02(), r0.A03(), EnumC02815z.A08);
            } catch (Throwable th) {
                try {
                    c7s.A07().A9M(A04(225, 7, 30), C03207x.A1Q, new C03217y(th));
                } finally {
                    c7s.unbindService(anonymousClass67);
                }
            }
        }
        return null;
    }
}
