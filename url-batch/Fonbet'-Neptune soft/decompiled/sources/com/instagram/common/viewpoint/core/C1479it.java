package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1479it implements M5 {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public MC A00;
    public boolean A01;
    public final C3O A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A03() {
        A07 = new byte[]{Ascii.VT, Ascii.SI, Ascii.GS};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, M4> hashMap) throws IOException {
        try {
            C3N A03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new MC(A03);
            } else {
                this.A00.A00(A03);
            }
            MC mc = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(mc);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC01424a.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC01424a.A0f(this.A04)).init(1, (Key) AbstractC01424a.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(mc, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (M4 m4 : hashMap.values()) {
                A04(m4, dataOutputStream);
                i += A00(m4, 2);
            }
            dataOutputStream.writeInt(i);
            this.A02.A06(dataOutputStream);
            AbstractC01424a.A10(null);
        } catch (Throwable th) {
            AbstractC01424a.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, M4> hashMap, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 2) {
                AbstractC01424a.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    AbstractC01424a.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) AbstractC01424a.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int readInt2 = dataInputStream.readInt();
            int i = 0;
            for (int i2 = 0; i2 < readInt2; i2++) {
                M4 A01 = A01(readInt, dataInputStream);
                hashMap.put(A01.A02, A01);
                sparseArray.put(A01.A01, A01.A02);
                i += A00(A01, readInt);
            }
            int readInt3 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (readInt3 == i && z) {
                AbstractC01424a.A10(dataInputStream);
                return true;
            }
            AbstractC01424a.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                AbstractC01424a.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                AbstractC01424a.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C1479it(File file, byte[] bArr, boolean z) {
        C3M.A08((bArr == null && z) ? false : true);
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            C3M.A07(bArr.length == 16);
            try {
                cipher = M6.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C3M.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipher;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new C3O(file);
    }

    private int A00(M4 m4, int i) {
        int result = m4.A01;
        int i2 = result * 31;
        int result2 = m4.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = M7.A00(m4.A03());
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + m4.A03().hashCode();
    }

    private M4 A01(int i, DataInputStream dataInputStream) throws IOException {
        C1478is A02;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i >= 2) {
            A02 = M6.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            M9 m9 = new M9();
            M9.A00(m9, length);
            A02 = C1478is.A03.A05(m9);
        }
        return new M4(readInt, readUTF, A02);
    }

    private void A04(M4 m4, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(m4.A01);
        dataOutputStream.writeUTF(m4.A02);
        M6.A08(m4.A03(), dataOutputStream);
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void A5h() {
        this.A02.A05();
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final boolean A6K() {
        return this.A02.A07();
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AA7(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AAj(HashMap<String, M4> hashMap, SparseArray<String> sparseArray) {
        C3M.A08(!this.A01);
        if (!A06(hashMap, sparseArray)) {
            hashMap.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AEv(M4 m4, boolean z) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AFa(M4 m4) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AJX(HashMap<String, M4> hashMap) throws IOException {
        A05(hashMap);
        this.A01 = false;
    }

    @Override // com.instagram.common.viewpoint.core.M5
    public final void AJY(HashMap<String, M4> hashMap) throws IOException {
        if (!this.A01) {
            return;
        }
        AJX(hashMap);
    }
}
