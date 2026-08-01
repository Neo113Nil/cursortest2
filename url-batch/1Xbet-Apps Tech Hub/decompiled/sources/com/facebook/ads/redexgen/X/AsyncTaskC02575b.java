package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC02575b extends AsyncTask<C02595d, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC02585c A00;
    public final YA A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C02595d... c02595dArr) {
        if (!K0.A02(this) && c02595dArr != null) {
            try {
                if (c02595dArr.length >= 1) {
                    String str = c02595dArr[0].A01;
                    String str2 = c02595dArr[0].A00;
                    Bitmap bitmap = null;
                    try {
                        bitmap = new C6Q(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().A9M(A01(0, 7, 42), C03207x.A1V, new C03217y(th));
                    }
                    if (bitmap != null) {
                        return UJ.A05(this.A01, bitmap, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                K0.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public AsyncTaskC02575b(YA ya, InterfaceC02585c interfaceC02585c, boolean z) {
        this.A01 = ya;
        this.A00 = interfaceC02585c;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC02575b(YA ya, InterfaceC02585c interfaceC02585c, boolean z, YW yw) {
        this(ya, interfaceC02585c, z);
    }

    private final void A03(Drawable drawable) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.ABY(drawable);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C02595d[] c02595dArr) {
        if (K0.A02(this)) {
            return null;
        }
        try {
            return A00(c02595dArr);
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            K0.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
