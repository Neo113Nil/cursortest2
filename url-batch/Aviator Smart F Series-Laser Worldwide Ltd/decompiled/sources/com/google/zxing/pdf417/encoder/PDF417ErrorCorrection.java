package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.baidu.location.BDLocation;
import com.crrepa.band.my.device.customkey.util.c;
import com.crrepa.ble.sifli.dfu.constants.General;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.material.internal.ViewUtils;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{DfuConstants.PROGRESS_HAND_OVER_PROCESSING, 568, 723, 809}, new int[]{237, 308, 436, DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE, 646, 653, 428, 379}, new int[]{DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, 562, 232, 755, 599, DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET, 801, 132, 295, 116, 442, 428, 295, 42, DfuAdapter.ConnectState.REQUEST_MTU, 65}, new int[]{361, 575, 922, 525, DfuAdapter.ConnectState.REQUEST_MTU, 586, 640, 321, DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE, 742, 677, 742, 687, DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE, 193, 517, DfuException.ERROR_READ_IMAGE_VERSION_FAILED, 494, DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS, GattError.GATT_CONNECTION_TIMEOUT, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 6, 93, 862, 771, 453, 106, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, DfuException.ERROR_DFU_ALREADY_BE_LATEST_VERSION, 107, 505, 733, 877, 381, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 723, 476, 462, TsExtractor.TS_STREAM_TYPE_AC4, 430, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 858, 822, DfuAdapter.STATE_READ_IMAGE_INFO, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, DfuAdapter.STATE_PREPARE_CONNECTING, 517, 352, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 771, 840, 629, 4, 381, 843, 623, DfuException.ERROR_CONNECT_ERROR, DfuAdapter.STATE_READ_IMAGE_INFO}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, FAUEnum.PR_ANIMATE_FAILED, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 516, 258, 457, 907, 594, 723, 674, 292, DfuException.ERROR_READ_PATCH_INFO_ERROR, 96, 684, 432, 686, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 860, 569, 193, 219, 129, 186, 236, DfuException.ERROR_DFU_ALREADY_BE_LATEST_VERSION, PsExtractor.AUDIO_STREAM, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, DfuException.ERROR_BATTERY_LEVEL_LOW, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET, 894, 75, DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED, 882, 857, 74, 204, 82, 586, 708, 250, TypedValues.Custom.TYPE_DIMENSION, 786, TsExtractor.TS_STREAM_TYPE_DTS, 720, 858, 194, 311, 913, DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES, FaceFrame.FACE_LANDMARKS_COUNT, 375, 850, 438, 733, 194, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 201, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 540, 913, 801, TypedValues.TransitionType.TYPE_DURATION, 799, GattError.GATT_AUTH_FAIL, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE, 549, FAUEnum.PR_TIMEOUT, 884, 315, 70, 329, 793, 490, DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, 877, BDLocation.TypeServerDecryptError, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, DfuException.ERROR_BATTERY_LEVEL_LOW, 463, 830, 730, 433, 848, 585, GattError.GATT_PENDING, 538, TypedValues.Custom.TYPE_REFERENCE, 90, 2, 290, 743, 199, 655, TypedValues.Custom.TYPE_STRING, 329, 49, 802, 580, 355, 588, TsExtractor.TS_PACKET_SIZE, 462, 10, 134, 628, 320, 479, 130, 739, 71, DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 374, 601, PsExtractor.AUDIO_STREAM, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, GattError.GATT_NOT_ENCRYPTED, 673, 687, 234, 722, RendererCapabilities.MODE_SUPPORT_MASK, 177, 752, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 640, 455, 193, 689, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, GattError.GATT_DUP_REG, 500, 238, 836, 394, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 441, c.MAX_GOAL_TIME, 791, 893, 754, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 829, PsExtractor.PRIVATE_STREAM_1, 20, BDLocation.TypeServerError, 29, 872, 449, 83, TypedValues.CycleType.TYPE_VISIBILITY, 41, 656, 505, 579, 481, 173, 404, 251, DfuAdapter.STATE_REQUEST_MTU, 95, 497, 555, 642, DfuAdapter.STATE_READ_IMAGE_INFO, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, DfuException.ERROR_DFU_PUB_KEYS_CONFLICT, 380, 350, 492, 197, DfuException.ERROR_CANNOT_FIND_DEVICE, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, DfuAdapter.STATE_READ_IMAGE_INFO, 203, 666, 249, 346, 781, 621, 640, DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES, 794, DfuAdapter.STATE_PREPARE_PAIRING_REQUEST, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, DfuAdapter.STATE_READ_BATTERY_INFO, 289, 122, DfuException.ERROR_READ_PATCH_INFO_ERROR, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, c.MAX_GOAL_TIME, 20, 297, 451, 593, 913, GattError.GATT_NOT_ENCRYPTED, 808, 684, DfuException.ERROR_DFU_ALREADY_BE_LATEST_VERSION, DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE, 561, 76, 653, 899, 729, 567, 744, 390, 513, PsExtractor.AUDIO_STREAM, 516, 258, 240, 518, 794, 395, ViewUtils.EDGE_TO_EDGE_FLAGS, 848, 51, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, RendererCapabilities.MODE_SUPPORT_MASK, 168, FaceFrame.FACE_LANDMARKS_COUNT, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, TypedValues.CycleType.TYPE_VISIBILITY, 40, 708, 575, BDLocation.TypeServerDecryptError, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, DfuException.ERROR_DFU_COPY_IMAGE_FAILED, 357, 850, 836, 827, 736, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 94, 8, 494, 114, 521, 2, 499, 851, DfuAdapter.STATE_READ_IMAGE_INFO, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, TypedValues.Custom.TYPE_COLOR, 452, BDLocation.TypeServerError, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, TypedValues.CycleType.TYPE_EASING, 245, DfuException.ERROR_DFU_COPY_IMAGE_FAILED, 594, 394, 511, 327, 589, 777, 699, DfuAdapter.STATE_REQUEST_MTU, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, GattError.GATT_ALREADY_OPEN, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, FAUEnum.PR_TIMEOUT, 563, 564, 343, 693, 109, TypedValues.MotionType.TYPE_DRAW_PATH, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE, 35, 777, 618, 586, TypedValues.CycleType.TYPE_WAVE_OFFSET, 833, 77, 597, 346, DfuException.ERROR_BATTERY_LEVEL_LOW, 757, 632, 695, 751, 331, SerialTrans.MTU_MAX, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, TypedValues.CycleType.TYPE_EASING, 305, 441, 207, 300, 892, 827, GattError.GATT_ENCRYPED_NO_MITM, DfuAdapter.STATE_DISCOVERY_SERVICE, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, TypedValues.CycleType.TYPE_WAVE_PHASE, 216, General.SIFLI_DFU_PACKET_BODY_LEN_NOR, 249, 321, 881, 699, DfuAdapter.STATE_PREPARE_CONNECTING, 673, 782, 210, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, DfuException.ERROR_DFU_SPP_OTA_NOT_SUPPORTED, 73, 469, 791, 660, BDLocation.TypeServerDecryptError, 498, 308, 155, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 907, 817, 187, 62, 16, TypedValues.CycleType.TYPE_WAVE_PHASE, DfuAdapter.STATE_PREPARE_CONNECTING, 336, DfuException.ERROR_DFU_HAND_SHAKE_FAILED, 437, 375, DfuException.ERROR_READ_IMAGE_VERSION_FAILED, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, TypedValues.CycleType.TYPE_WAVE_OFFSET, 242, 749, 321, 54, 669, TypedValues.AttributesType.TYPE_PATH_ROTATE, 342, 299, DfuAdapter.STATE_PREPARE_PAIRING_REQUEST, 105, 667, 488, 640, 672, 576, 540, TypedValues.AttributesType.TYPE_PATH_ROTATE, 486, 721, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 46, 656, 447, 171, 616, 464, FaceFrame.FACE_LANDMARKS_COUNT, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE, 736, TsExtractor.TS_STREAM_TYPE_DTS, 646, 411, 877, 669, GattError.GATT_ENCRYPED_NO_MITM, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, ViewUtils.EDGE_TO_EDGE_FLAGS, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS}};

    private PDF417ErrorCorrection() {
    }

    static String generateErrorCorrection(CharSequence charSequence, int i8) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i8);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i9) + cArr[i10]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i10 > 0) {
                cArr[i10] = (char) ((cArr[i10 - 1] + (929 - ((EC_COEFFICIENTS[i8][i10] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i10--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i8][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i11 = errorCorrectionCodewordCount - 1; i11 >= 0; i11--) {
            char c8 = cArr[i11];
            if (c8 != 0) {
                cArr[i11] = (char) (929 - c8);
            }
            sb.append(cArr[i11]);
        }
        return sb.toString();
    }

    static int getErrorCorrectionCodewordCount(int i8) {
        if (i8 < 0 || i8 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i8 + 1);
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i8 <= 40) {
            return 2;
        }
        if (i8 <= 160) {
            return 3;
        }
        if (i8 <= 320) {
            return 4;
        }
        if (i8 <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
