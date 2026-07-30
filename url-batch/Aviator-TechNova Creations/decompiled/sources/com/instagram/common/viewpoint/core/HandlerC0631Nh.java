package com.instagram.common.viewpoint.core;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0631Nh extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC1393hD A06;
    public final C1159dL A07;
    public final C1133cu A08;
    public final AbstractRunnableC0846Vt A09;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, -63, -64, -59, -53, -42, -55, -51, -42, -72, -57, -57, -42, -58, -55, -64, -68, -59, -53, -72, -53, -64, -58, -59, -42, -62, -68, -48, -54, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, -31, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, 37, 74, 65, 54};
    }

    static {
        A07();
    }

    public HandlerC0631Nh(C1159dL c1159dL, AbstractC1393hD abstractC1393hD) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnectionC0630Ng(this);
        this.A07 = c1159dL;
        this.A08 = c1159dL.A02();
        this.A05 = new Messenger(this);
        this.A06 = abstractC1393hD;
        this.A09 = new C1372gr(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6h() == NZ.A06) {
            this.A07.A0F().AHD();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6i() == NZ.A07) {
            if (UA.A08(this.A07)) {
                this.A07.A0F().AH3();
                if (this.A06 instanceof C02166q) {
                    this.A06.AED(1022, this.A06.A04(), null);
                    return;
                } else {
                    if (this.A06 instanceof C02156p) {
                        this.A06.AED(PathInterpolatorCompat.MAX_NUM_POINTS, this.A06.A04(), null);
                        if (((C02156p) this.A06).A0E().A03 != null) {
                            this.A06.AED(3002, this.A06.A04(), null);
                        }
                        this.A06.AED(2110, this.A06.A04(), null);
                        return;
                    }
                    return;
                }
            }
            C1159dL c1159dL = this.A07;
            String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c1159dL.A0F().AHD();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6h() != NZ.A05) {
            return;
        }
        if (UA.A0C(this.A07)) {
            this.A07.A0F().AHK();
            this.A06.A03().AAn();
            this.A06.A0D(true);
            this.A06.A09();
            return;
        }
        this.A07.A0F().AHJ();
        this.A06.A03().AIh(new AdError(AdError.REMOTE_ADS_SERVICE_ERROR, A04(31, 21, 34)));
    }

    private void A08(Messenger messenger, int i, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, i);
        obtain.replyTo = this.A05;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(obtain);
    }

    public static void A0B(C1159dL c1159dL, String str) {
        c1159dL.A0F().AH7(str);
        SN A0G = c1159dL.A0G();
        if (A0G != null && A0G.A6g() != null && A0G.A6c() != null) {
            A0G.A6g().onError(A0G.A6c(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AHW();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C1159dL c1159dL, int i) {
        this.A07.A0F().AHU();
        AdActivityIntent A05 = WB.A05(c1159dL);
        A05.putExtra(A04(65, 8, Opcodes.LSHR), EnumC0829Vb.A0E);
        A05.putExtra(A04(52, 13, 3), this.A06.A04());
        A05.putExtra(A04(5, 26, 33), i);
        try {
            int usedContext = WB.A00(c1159dL, A05);
            this.A07.A0F().AHV(usedContext);
        } catch (W9 e) {
            String A04 = A04(0, 5, 75);
            Throwable cause = e.getCause();
            if (cause != null) {
                A04 = A04 + cause.toString();
            }
            A0B(c1159dL, A04);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = C0632Ni.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0F().AH9();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, UA.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AHH();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e) {
            A0C();
            this.A07.A0F().AHC(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AHR();
                    UA.A07(this.A08);
                } else {
                    this.A07.A0F().AHQ();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AHX();
            } else if (message.what == 2001 || message.what == 1011) {
                C0632Ni.A02(this.A08, message);
            } else {
                this.A07.A0F().AHI(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
