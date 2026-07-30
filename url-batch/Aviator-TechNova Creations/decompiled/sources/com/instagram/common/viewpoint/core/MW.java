package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class MW {
    public static MW A08;
    public static byte[] A09;
    public static final String A0A;
    public boolean A01;
    public final SQ A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final MV A02 = new MV();
    public String A00 = null;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{65, 64, 82, 57, 44, 91, 94, 73, 121, 91, 74, 74, 83, 84, 93, 115, 84, 92, 85, Ascii.DC4, 78, 66, 78, 72, 74, 91, 91, 78, 79, 106, 79, 88, 5, 95, 83, 95, 66, 86, 65, 85, 81, 65, 74, 71, 93, 123, 71, 69, 84, 84, 77, 74, 67};
    }

    static {
        A09();
        A0A = MW.class.getSimpleName();
    }

    public MW(SQ sq, boolean z, Executor executor, String str) {
        this.A03 = sq.A02();
        this.A04 = str;
        this.A07 = executor;
        if (z) {
            A0A();
        }
    }

    public static synchronized MW A01(SQ sq) {
        MW mw;
        synchronized (MW.class) {
            if (A08 == null) {
                A08 = new MW(sq, true, XU.A06, A03(0, 0, 18));
            }
            mw = A08;
        }
        return mw;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 12);
                    A03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC0772Sv.A17, new C0773Sw(e));
        } catch (IOException e2) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC0772Sv.A19, new C0773Sw(e2));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (C0773Sw e) {
            A0M();
            this.A03.A08().AAy(A03, AbstractC0772Sv.A18, e);
        } catch (JSONException e2) {
            A0M();
            this.A03.A08().AAy(A03, AbstractC0772Sv.A1A, new C0773Sw(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C1474ii(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(N2 n2, String str, boolean z) {
        n2.A07(z);
        if (n2.A08() || n2.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                FileOutputStream fout = new FileOutputStream(file);
                fout.write(bArr);
                fout.close();
            }
        } catch (FileNotFoundException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC0772Sv.A17, new C0773Sw(e));
        } catch (IOException e2) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC0772Sv.A19, new C0773Sw(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z = false;
        try {
            synchronized (this.A02) {
                z = this.A02.A05().get(str) instanceof N2;
            }
        } catch (JSONException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC0772Sv.A1A, new C0773Sw(e));
        }
        return z;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C1472ie(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new Cif(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = U7.A1D(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C1473ih(this, jSONObject));
    }
}
