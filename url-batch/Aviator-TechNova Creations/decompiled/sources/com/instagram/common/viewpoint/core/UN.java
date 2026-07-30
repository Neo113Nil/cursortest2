package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class UN extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final VM A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -14, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, Ascii.DC2, 16, Ascii.GS, 0, 19, Ascii.FF, 2, 10, 3, Ascii.GS, 9, 3, Ascii.ETB, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, Ascii.NAK, Ascii.SYN, Ascii.DC4, 33, Ascii.NAK, 7, Ascii.DC4, Ascii.CAN, Ascii.VT, 5, 7, 33, Ascii.NAK, 6, Ascii.CR, 33, Ascii.CAN, 7, Ascii.DC4, Ascii.NAK, Ascii.VT, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = UN.class.getSimpleName();
    }

    public UN(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = VM.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C1380gz A01(C1376gv c1376gv, String str) {
        C1380gz c1380gz = new C1380gz(c1376gv, this.A03, str);
        c1380gz.A0G(c1376gv.A0B(), c1376gv.A07());
        return c1380gz;
    }

    private C1377gw A02(C1367gm c1367gm, String str) {
        C1377gw c1377gw = new C1377gw(c1367gm, this.A03, str);
        c1377gw.A0J(c1367gm.A05, c1367gm.A02, c1367gm.A08);
        return c1377gw;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    VM.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C1159dL A052 = RB.A05(this.A00, callingAppPackage);
            A052.A0F().AIi(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                str = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                str = null;
            }
            if (str == null) {
                if (messenger != null) {
                    VM.A00().A07(20, callingAppPackage, null, messenger);
                }
                A052.A0F().AHB();
                return;
            }
            switch (msg.what) {
                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                    if (messenger == null) {
                        return;
                    }
                    UK A042 = VM.A00().A04(callingAppPackage);
                    if (A042 == null) {
                        A042 = VM.A00().A05(callingAppPackage, messenger, str);
                    }
                    C1376gv intAdModel = AbstractC0643Nt.A04(A052, msg.getData(), str);
                    if (A042.A00 == null) {
                        A042.A00 = A01(intAdModel, callingAppPackage);
                    } else if (A042.A00 instanceof C1380gz) {
                        ((C1380gz) A042.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    VM.A00().A07(PointerIconCompat.TYPE_COPY, callingAppPackage, A00(), messenger);
                    return;
                case PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                case AdError.CACHE_ERROR_CODE /* 2002 */:
                    VM.A00().A08(callingAppPackage);
                    return;
                case AdError.SERVER_ERROR_CODE /* 2000 */:
                    if (messenger == null) {
                        return;
                    }
                    UK A043 = VM.A00().A04(callingAppPackage);
                    if (A043 == null) {
                        A043 = VM.A00().A05(callingAppPackage, messenger, str);
                    }
                    C1367gm A053 = AbstractC0643Nt.A05(A052, msg.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A053, callingAppPackage);
                    } else if (A043.A00 instanceof C1377gw) {
                        C1377gw c1377gw = (C1377gw) A043.A00;
                        String adId = A053.A05;
                        c1377gw.A0J(adId, A053.A02, A053.A08);
                    }
                    VM.A00().A07(AdError.INTERNAL_ERROR_CODE, callingAppPackage, A00(), messenger);
                    return;
                case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                    InterfaceC0626Nc A03 = VM.A00().A03(callingAppPackage);
                    if (A03 instanceof C1377gw) {
                        RewardData A01 = AbstractC0644Nu.A01(msg.getData());
                        C1377gw c1377gw2 = (C1377gw) A03;
                        if (A01 != null) {
                            c1377gw2.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            AbstractC0838Vl.A00(th, this);
        }
    }
}
