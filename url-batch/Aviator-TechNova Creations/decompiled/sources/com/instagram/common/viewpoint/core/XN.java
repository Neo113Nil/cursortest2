package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class XN implements SV {
    public static byte[] A01;
    public final SQ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, Ascii.EM, Ascii.SI, Ascii.GS, Ascii.SUB, Ascii.DC4, Ascii.SI};
    }

    public XN(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A71() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A7y() {
        return VZ.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A7z() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A8N() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A8U() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final SU A8p() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new XV(this, advertisingIdInfoDirectly);
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A9I() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A9K() {
        return A00(0, 7, Opcodes.FREM);
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final String A9L() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.SV
    public final boolean AAF() {
        return BuildConfigApi.isDebug();
    }
}
