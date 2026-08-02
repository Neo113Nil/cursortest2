package org.bouncycastle.pqc.crypto.ntruprime;

import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes10.dex */
public class NTRULPRimeParameters implements KEMParameters {
    private final int delta;
    private final String name;
    private final int p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;
    private final int q;
    private final int roundedPolynomialBytes;
    private final int sharedKeyBytes;
    private final int tau0;
    private final int tau1;
    private final int tau2;
    private final int tau3;
    private final int w;
    public static final NTRULPRimeParameters ntrulpr653 = new NTRULPRimeParameters("ntrulpr653", 653, 4621, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 2175, 113, 2031, EnumC0170g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 865, 897, 1125, 32);
    public static final NTRULPRimeParameters ntrulpr761 = new NTRULPRimeParameters("ntrulpr761", 761, 4591, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 2156, 114, 2007, EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO, 1039, 1294, 32);
    public static final NTRULPRimeParameters ntrulpr857 = new NTRULPRimeParameters("ntrulpr857", 857, 5167, EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC0170g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, 2433, 101, 2265, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, 1152, 1184, 1463, 32);
    public static final NTRULPRimeParameters ntrulpr953 = new NTRULPRimeParameters("ntrulpr953", 953, 6343, 345, HttpStatusCode.NOT_FOUND_404, 2997, 82, 2798, 400, 1317, 1349, 1652, 32);
    public static final NTRULPRimeParameters ntrulpr1013 = new NTRULPRimeParameters("ntrulpr1013", IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO, 7177, 392, 450, 3367, 73, 3143, 449, 1423, 1455, 1773, 32);
    public static final NTRULPRimeParameters ntrulpr1277 = new NTRULPRimeParameters("ntrulpr1277", 1277, 7879, HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.BAD_GATEWAY_502, 3724, 66, 3469, 496, 1815, 1847, 2231, 32);

    private NTRULPRimeParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.name = str;
        this.p = i;
        this.q = i2;
        this.w = i3;
        this.delta = i4;
        this.tau0 = i5;
        this.tau1 = i6;
        this.tau2 = i7;
        this.tau3 = i8;
        this.roundedPolynomialBytes = i9;
        this.publicKeyBytes = i10;
        this.privateKeyBytes = i11;
        this.sharedKeyBytes = i12;
    }

    public int getDelta() {
        return this.delta;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getTau0() {
        return this.tau0;
    }

    public int getTau1() {
        return this.tau1;
    }

    public int getTau2() {
        return this.tau2;
    }

    public int getTau3() {
        return this.tau3;
    }

    public int getW() {
        return this.w;
    }
}
