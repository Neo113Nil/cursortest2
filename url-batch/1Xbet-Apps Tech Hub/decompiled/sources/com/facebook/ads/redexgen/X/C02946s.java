package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02946s extends MI {
    public static byte[] A01;
    public final /* synthetic */ C02936r A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-7, Ascii.CR, -4, 1, 7};
    }

    public C02946s(C02936r c02936r) {
        this.A00 = c02936r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.get() == null) goto L6;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC03238a
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(MJ mj) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new WeakReference(new C0756Pt(this));
        AudioManager audioManager = (AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 34));
        weakReference2 = this.A00.A00;
        audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}
