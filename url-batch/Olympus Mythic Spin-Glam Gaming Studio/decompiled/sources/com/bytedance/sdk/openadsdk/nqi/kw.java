package com.bytedance.sdk.openadsdk.nqi;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class kw {
    private static final kw[] zmn = fb();
    private final int fb;
    private final int fs;
    private final fs[] zn;

    private kw(int i, int[] iArr, fs... fsVarArr) {
        this.fs = i;
        this.zn = fsVarArr;
        int zmn2 = fsVarArr[0].zmn();
        int i2 = 0;
        for (zmn zmnVar : fsVarArr[0].fb()) {
            i2 += zmnVar.zmn() * (zmnVar.fs() + zmn2);
        }
        this.fb = i2;
    }

    public int zmn() {
        return this.fs;
    }

    public int fs() {
        return this.fb;
    }

    public int zn() {
        return (this.fs * 4) + 17;
    }

    public fs zmn(zg zgVar) {
        return this.zn[zgVar.ordinal()];
    }

    public static kw zmn(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return zmn[i - 1];
    }

    public static final class fs {
        private final zmn[] fs;
        private final int zmn;

        fs(int i, zmn... zmnVarArr) {
            this.zmn = i;
            this.fs = zmnVarArr;
        }

        public int zmn() {
            return this.zmn;
        }

        public int fs() {
            int i = 0;
            for (zmn zmnVar : this.fs) {
                i += zmnVar.zmn();
            }
            return i;
        }

        public int zn() {
            return this.zmn * fs();
        }

        public zmn[] fb() {
            return this.fs;
        }
    }

    public static final class zmn {
        private final int fs;
        private final int zmn;

        zmn(int i, int i2) {
            this.zmn = i;
            this.fs = i2;
        }

        public int zmn() {
            return this.zmn;
        }

        public int fs() {
            return this.fs;
        }
    }

    private static kw[] fb() {
        return new kw[]{new kw(1, new int[0], new fs(7, new zmn(1, 19)), new fs(10, new zmn(1, 16)), new fs(13, new zmn(1, 13)), new fs(17, new zmn(1, 9))), new kw(2, new int[]{6, 18}, new fs(10, new zmn(1, 34)), new fs(16, new zmn(1, 28)), new fs(22, new zmn(1, 22)), new fs(28, new zmn(1, 16))), new kw(3, new int[]{6, 22}, new fs(15, new zmn(1, 55)), new fs(26, new zmn(1, 44)), new fs(18, new zmn(2, 17)), new fs(22, new zmn(2, 13))), new kw(4, new int[]{6, 26}, new fs(20, new zmn(1, 80)), new fs(18, new zmn(2, 32)), new fs(26, new zmn(2, 24)), new fs(16, new zmn(4, 9))), new kw(5, new int[]{6, 30}, new fs(26, new zmn(1, 108)), new fs(24, new zmn(2, 43)), new fs(18, new zmn(2, 15), new zmn(2, 16)), new fs(22, new zmn(2, 11), new zmn(2, 12))), new kw(6, new int[]{6, 34}, new fs(18, new zmn(2, 68)), new fs(16, new zmn(4, 27)), new fs(24, new zmn(4, 19)), new fs(28, new zmn(4, 15))), new kw(7, new int[]{6, 22, 38}, new fs(20, new zmn(2, 78)), new fs(18, new zmn(4, 31)), new fs(18, new zmn(2, 14), new zmn(4, 15)), new fs(26, new zmn(4, 13), new zmn(1, 14))), new kw(8, new int[]{6, 24, 42}, new fs(24, new zmn(2, 97)), new fs(22, new zmn(2, 38), new zmn(2, 39)), new fs(22, new zmn(4, 18), new zmn(2, 19)), new fs(26, new zmn(4, 14), new zmn(2, 15))), new kw(9, new int[]{6, 26, 46}, new fs(30, new zmn(2, 116)), new fs(22, new zmn(3, 36), new zmn(2, 37)), new fs(20, new zmn(4, 16), new zmn(4, 17)), new fs(24, new zmn(4, 12), new zmn(4, 13))), new kw(10, new int[]{6, 28, 50}, new fs(18, new zmn(2, 68), new zmn(2, 69)), new fs(26, new zmn(4, 43), new zmn(1, 44)), new fs(24, new zmn(6, 19), new zmn(2, 20)), new fs(28, new zmn(6, 15), new zmn(2, 16))), new kw(11, new int[]{6, 30, 54}, new fs(20, new zmn(4, 81)), new fs(30, new zmn(1, 50), new zmn(4, 51)), new fs(28, new zmn(4, 22), new zmn(4, 23)), new fs(24, new zmn(3, 12), new zmn(8, 13))), new kw(12, new int[]{6, 32, 58}, new fs(24, new zmn(2, 92), new zmn(2, 93)), new fs(22, new zmn(6, 36), new zmn(2, 37)), new fs(26, new zmn(4, 20), new zmn(6, 21)), new fs(28, new zmn(7, 14), new zmn(4, 15))), new kw(13, new int[]{6, 34, 62}, new fs(26, new zmn(4, 107)), new fs(22, new zmn(8, 37), new zmn(1, 38)), new fs(24, new zmn(8, 20), new zmn(4, 21)), new fs(22, new zmn(12, 11), new zmn(4, 12))), new kw(14, new int[]{6, 26, 46, 66}, new fs(30, new zmn(3, 115), new zmn(1, 116)), new fs(24, new zmn(4, 40), new zmn(5, 41)), new fs(20, new zmn(11, 16), new zmn(5, 17)), new fs(24, new zmn(11, 12), new zmn(5, 13))), new kw(15, new int[]{6, 26, 48, 70}, new fs(22, new zmn(5, 87), new zmn(1, 88)), new fs(24, new zmn(5, 41), new zmn(5, 42)), new fs(30, new zmn(5, 24), new zmn(7, 25)), new fs(24, new zmn(11, 12), new zmn(7, 13))), new kw(16, new int[]{6, 26, 50, 74}, new fs(24, new zmn(5, 98), new zmn(1, 99)), new fs(28, new zmn(7, 45), new zmn(3, 46)), new fs(24, new zmn(15, 19), new zmn(2, 20)), new fs(30, new zmn(3, 15), new zmn(13, 16))), new kw(17, new int[]{6, 30, 54, 78}, new fs(28, new zmn(1, 107), new zmn(5, 108)), new fs(28, new zmn(10, 46), new zmn(1, 47)), new fs(28, new zmn(1, 22), new zmn(15, 23)), new fs(28, new zmn(2, 14), new zmn(17, 15))), new kw(18, new int[]{6, 30, 56, 82}, new fs(30, new zmn(5, 120), new zmn(1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE)), new fs(26, new zmn(9, 43), new zmn(4, 44)), new fs(28, new zmn(17, 22), new zmn(1, 23)), new fs(28, new zmn(2, 14), new zmn(19, 15))), new kw(19, new int[]{6, 30, 58, 86}, new fs(28, new zmn(3, 113), new zmn(4, 114)), new fs(26, new zmn(3, 44), new zmn(11, 45)), new fs(26, new zmn(17, 21), new zmn(4, 22)), new fs(26, new zmn(9, 13), new zmn(16, 14))), new kw(20, new int[]{6, 34, 62, 90}, new fs(28, new zmn(3, 107), new zmn(5, 108)), new fs(26, new zmn(3, 41), new zmn(13, 42)), new fs(30, new zmn(15, 24), new zmn(5, 25)), new fs(28, new zmn(15, 15), new zmn(10, 16))), new kw(21, new int[]{6, 28, 50, 72, 94}, new fs(28, new zmn(4, 116), new zmn(4, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new fs(26, new zmn(17, 42)), new fs(28, new zmn(17, 22), new zmn(6, 23)), new fs(30, new zmn(19, 16), new zmn(6, 17))), new kw(22, new int[]{6, 26, 50, 74, 98}, new fs(28, new zmn(2, 111), new zmn(7, 112)), new fs(28, new zmn(17, 46)), new fs(30, new zmn(7, 24), new zmn(16, 25)), new fs(24, new zmn(34, 13))), new kw(23, new int[]{6, 30, 54, 78, 102}, new fs(30, new zmn(4, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new zmn(5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new fs(28, new zmn(4, 47), new zmn(14, 48)), new fs(30, new zmn(11, 24), new zmn(14, 25)), new fs(30, new zmn(16, 15), new zmn(14, 16))), new kw(24, new int[]{6, 28, 54, 80, 106}, new fs(30, new zmn(6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new zmn(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new fs(28, new zmn(6, 45), new zmn(14, 46)), new fs(30, new zmn(11, 24), new zmn(16, 25)), new fs(30, new zmn(30, 16), new zmn(2, 17))), new kw(25, new int[]{6, 32, 58, 84, 110}, new fs(26, new zmn(8, 106), new zmn(4, 107)), new fs(28, new zmn(8, 47), new zmn(13, 48)), new fs(30, new zmn(7, 24), new zmn(22, 25)), new fs(30, new zmn(22, 15), new zmn(13, 16))), new kw(26, new int[]{6, 30, 58, 86, 114}, new fs(28, new zmn(10, 114), new zmn(2, 115)), new fs(28, new zmn(19, 46), new zmn(4, 47)), new fs(28, new zmn(28, 22), new zmn(6, 23)), new fs(30, new zmn(33, 16), new zmn(4, 17))), new kw(27, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, new fs(30, new zmn(8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new zmn(4, 123)), new fs(28, new zmn(22, 45), new zmn(3, 46)), new fs(30, new zmn(8, 23), new zmn(26, 24)), new fs(30, new zmn(12, 15), new zmn(28, 16))), new kw(28, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, new fs(30, new zmn(3, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new zmn(10, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new fs(28, new zmn(3, 45), new zmn(23, 46)), new fs(30, new zmn(4, 24), new zmn(31, 25)), new fs(30, new zmn(11, 15), new zmn(31, 16))), new kw(29, new int[]{6, 30, 54, 78, 102, 126}, new fs(30, new zmn(7, 116), new zmn(7, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new fs(28, new zmn(21, 45), new zmn(7, 46)), new fs(30, new zmn(1, 23), new zmn(37, 24)), new fs(30, new zmn(19, 15), new zmn(26, 16))), new kw(30, new int[]{6, 26, 52, 78, 104, 130}, new fs(30, new zmn(5, 115), new zmn(10, 116)), new fs(28, new zmn(19, 47), new zmn(10, 48)), new fs(30, new zmn(15, 24), new zmn(25, 25)), new fs(30, new zmn(23, 15), new zmn(25, 16))), new kw(31, new int[]{6, 30, 56, 82, 108, 134}, new fs(30, new zmn(13, 115), new zmn(3, 116)), new fs(28, new zmn(2, 46), new zmn(29, 47)), new fs(30, new zmn(42, 24), new zmn(1, 25)), new fs(30, new zmn(23, 15), new zmn(28, 16))), new kw(32, new int[]{6, 34, 60, 86, 112, 138}, new fs(30, new zmn(17, 115)), new fs(28, new zmn(10, 46), new zmn(23, 47)), new fs(30, new zmn(10, 24), new zmn(35, 25)), new fs(30, new zmn(19, 15), new zmn(35, 16))), new kw(33, new int[]{6, 30, 58, 86, 114, 142}, new fs(30, new zmn(17, 115), new zmn(1, 116)), new fs(28, new zmn(14, 46), new zmn(21, 47)), new fs(30, new zmn(29, 24), new zmn(19, 25)), new fs(30, new zmn(11, 15), new zmn(46, 16))), new kw(34, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146}, new fs(30, new zmn(13, 115), new zmn(6, 116)), new fs(28, new zmn(14, 46), new zmn(23, 47)), new fs(30, new zmn(44, 24), new zmn(7, 25)), new fs(30, new zmn(59, 16), new zmn(1, 17))), new kw(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new fs(30, new zmn(12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new zmn(7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new fs(28, new zmn(12, 47), new zmn(26, 48)), new fs(30, new zmn(39, 24), new zmn(14, 25)), new fs(30, new zmn(22, 15), new zmn(41, 16))), new kw(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new fs(30, new zmn(6, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new zmn(14, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new fs(28, new zmn(6, 47), new zmn(34, 48)), new fs(30, new zmn(46, 24), new zmn(10, 25)), new fs(30, new zmn(2, 15), new zmn(64, 16))), new kw(37, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new fs(30, new zmn(17, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new zmn(4, 123)), new fs(28, new zmn(29, 46), new zmn(14, 47)), new fs(30, new zmn(49, 24), new zmn(10, 25)), new fs(30, new zmn(24, 15), new zmn(46, 16))), new kw(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new fs(30, new zmn(4, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new zmn(18, 123)), new fs(28, new zmn(13, 46), new zmn(32, 47)), new fs(30, new zmn(48, 24), new zmn(14, 25)), new fs(30, new zmn(42, 15), new zmn(32, 16))), new kw(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new fs(30, new zmn(20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new zmn(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new fs(28, new zmn(40, 47), new zmn(7, 48)), new fs(30, new zmn(43, 24), new zmn(22, 25)), new fs(30, new zmn(10, 15), new zmn(67, 16))), new kw(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new fs(30, new zmn(19, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), new zmn(6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)), new fs(28, new zmn(18, 47), new zmn(31, 48)), new fs(30, new zmn(34, 24), new zmn(34, 25)), new fs(30, new zmn(20, 15), new zmn(61, 16)))};
    }
}
