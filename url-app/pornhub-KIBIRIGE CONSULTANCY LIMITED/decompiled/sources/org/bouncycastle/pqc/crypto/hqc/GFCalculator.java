package org.bouncycastle.pqc.crypto.hqc;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imageutils.JfifUtil;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;

/* loaded from: classes3.dex */
class GFCalculator {
    static int[] exp = {1, 2, 4, 8, 16, 32, 64, 128, 29, 58, 116, 232, 205, 135, 19, 38, 76, 152, 45, 90, RotationOptions.ROTATE_180, 117, 234, 201, 143, 3, 6, 12, 24, 48, 96, 192, 157, 39, 78, 156, 37, 74, 148, 53, 106, 212, 181, 119, 238, 193, 159, 35, 70, 140, 5, 10, 20, 40, 80, 160, 93, 186, 105, 210, 185, 111, 222, 161, 95, 190, 97, 194, 153, 47, 94, 188, 101, 202, 137, 15, 30, 60, 120, 240, 253, 231, Primes.SMALL_FACTOR_LIMIT, 187, 107, 214, 177, 127, 254, JfifUtil.MARKER_APP1, 223, 163, 91, 182, 113, 226, JfifUtil.MARKER_EOI, 175, 67, 134, 17, 34, 68, 136, 13, 26, 52, LocationRequestCompat.QUALITY_LOW_POWER, JfifUtil.MARKER_RST0, 189, 103, 206, 129, 31, 62, 124, 248, 237, 199, 147, 59, 118, 236, 197, 151, 51, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 204, 133, 23, 46, 92, 184, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, JfifUtil.MARKER_SOS, 169, 79, 158, 33, 66, 132, 21, 42, 84, 168, 77, 154, 41, 82, 164, 85, 170, 73, 146, 57, 114, 228, 213, 183, 115, 230, 209, 191, 99, 198, 145, 63, WebSocketProtocol.PAYLOAD_SHORT, 252, 229, JfifUtil.MARKER_RST7, 179, 123, 246, 241, 255, 227, 219, 171, 75, 150, 49, 98, 196, 149, 55, 110, 220, 165, 87, 174, 65, 130, 25, 50, 100, 200, 141, 7, 14, 28, 56, 112, BERTags.FLAGS, 221, 167, 83, 166, 81, 162, 89, 178, 121, 242, 249, 239, 195, 155, 43, 86, 172, 69, 138, 9, 18, 36, 72, 144, 61, 122, 244, 245, 247, 243, 251, 235, 203, 139, 11, 22, 44, 88, 176, 125, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 233, 207, 131, 27, 54, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, JfifUtil.MARKER_SOI, 173, 71, 142, 1, 2, 4};
    static int[] log = {0, 0, 1, 25, 2, 50, 26, 198, 3, 223, 51, 238, 27, LocationRequestCompat.QUALITY_LOW_POWER, 199, 75, 4, 100, BERTags.FLAGS, 14, 52, 141, 239, 129, 28, 193, 105, 248, 200, 8, 76, 113, 5, 138, 101, 47, JfifUtil.MARKER_APP1, 36, 15, 33, 53, 147, 142, JfifUtil.MARKER_SOS, 240, 18, 130, 69, 29, 181, 194, 125, 106, 39, 249, 185, 201, 154, 9, 120, 77, 228, 114, 166, 6, 191, 139, 98, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 221, 48, 253, 226, 152, 37, 179, 16, 145, 34, 136, 54, JfifUtil.MARKER_RST0, 148, 206, 143, 150, 219, 189, 241, 210, 19, 92, 131, 56, 70, 64, 30, 66, 182, 163, 195, 72, WebSocketProtocol.PAYLOAD_SHORT, 110, 107, 58, 40, 84, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 133, 186, 61, 202, 94, 155, 159, 10, 21, 121, 43, 78, 212, 229, 172, 115, 243, 167, 87, 7, 112, 192, 247, 140, 128, 99, 13, 103, 74, 222, 237, 49, 197, 254, 24, 227, 165, 153, 119, 38, 184, RotationOptions.ROTATE_180, 124, 17, 68, 146, JfifUtil.MARKER_EOI, 35, 32, 137, 46, 55, 63, 209, 91, 149, 188, 207, 205, 144, 135, 151, 178, 220, 252, 190, 97, 242, 86, Primes.SMALL_FACTOR_LIMIT, 171, 20, 42, 93, 158, 132, 60, 57, 83, 71, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 65, 162, 31, 45, 67, JfifUtil.MARKER_SOI, 183, 123, 164, 118, 196, 23, 73, 236, 127, 12, 111, 246, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 161, 59, 82, 41, 157, 85, 170, 251, 96, 134, 177, 187, 204, 62, 90, 203, 89, 95, 176, 156, 169, 160, 81, 11, 245, 22, 235, 122, 117, 44, JfifUtil.MARKER_RST7, 79, 174, 213, 233, 230, 231, 173, 232, 116, 214, 244, 234, 168, 80, 88, 175};

    GFCalculator() {
    }

    static int inverse(int i) {
        return exp[255 - log[i]] & Utils.toUnsigned16Bits((-i) >> 31);
    }

    static int mod(int i) {
        int unsigned16Bits = Utils.toUnsigned16Bits(i - 255);
        return Utils.toUnsigned16Bits(unsigned16Bits + (Utils.toUnsigned8bits(-(unsigned16Bits >> 15)) & 255));
    }

    static int mult(int i, int i2) {
        int unsigned16Bits = Utils.toUnsigned16Bits((-i) >> 31) & Utils.toUnsigned16Bits((-i2) >> 31);
        int[] iArr = exp;
        int[] iArr2 = log;
        return Utils.toUnsigned16Bits(iArr[mod(iArr2[i] + iArr2[i2])] & unsigned16Bits);
    }
}
