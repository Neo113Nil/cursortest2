package org.bouncycastle.pqc.crypto.hqc;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.plaid.internal.EnumC0170g;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes10.dex */
public class HQCParameters implements KEMParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, MLKEMEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 117, 111, 75, 73, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 65, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 21, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 103, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 67, 118, 105, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 110, 74, 69, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 82, 255, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 239, 24, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 104, 27, 40, 107, 50, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 224, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 119, 13, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 1, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 82, 43, 15, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 50, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 29, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, 131, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 16772367, 5, new int[]{49, 167, 49, 39, 200, 121, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 91, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 63, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 71, 150, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 87, 101, 32, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 71, EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 115, 97, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 12, 31, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 239, 99, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 4, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 144, 8, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 47, 27, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 64, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 47, 39, 188, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 48, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 1});
    private int delta;
    private int fft;
    private int g;
    private int[] generatorPoly;
    private HQCEngine hqcEngine;
    private int k;
    private int n;
    private int n1;
    private int n2;
    private final String name;
    private int utilRejectionThreshold;
    private int w;
    private int we;
    private int wr;

    private HQCParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        this.name = str;
        this.n = i;
        this.n1 = i2;
        this.n2 = i3;
        this.k = i4;
        this.delta = i6;
        this.w = i7;
        this.wr = i8;
        this.we = i9;
        this.generatorPoly = iArr;
        this.g = i5;
        this.utilRejectionThreshold = i10;
        this.fft = i11;
        this.hqcEngine = new HQCEngine(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, iArr);
    }

    public int getDelta() {
        return this.delta;
    }

    public HQCEngine getEngine() {
        return this.hqcEngine;
    }

    public int getK() {
        return this.k;
    }

    public int getN() {
        return this.n;
    }

    public int getN1() {
        return this.n1;
    }

    public int getN1N2_BYTES() {
        return Recorder$$ExternalSyntheticOutline1.m(this.n1, this.n2, 7, 8);
    }

    public int getN2() {
        return this.n2;
    }

    public int getN_BYTES() {
        return (this.n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getSALT_SIZE_BYTES() {
        return 16;
    }

    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSessionKeySize() {
        return this.k * 8;
    }

    public int getW() {
        return this.w;
    }

    public int getWe() {
        return this.we;
    }

    public int getWr() {
        return this.wr;
    }
}
