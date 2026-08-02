package org.bouncycastle.pqc.crypto.falcon;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes10.dex */
class FalconKeyGen {
    private short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE};
    final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE};
    final int[] bitlength_avg = {4, 11, 24, 50, 102, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, HttpStatusCode.UNAUTHORIZED_401, 794, 1577, 3138, 6308};
    final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};
    final int DEPTH_INT_FG = 4;
    FPREngine fpr = new FPREngine();
    FalconSmallPrimeList primes = new FalconSmallPrimeList();
    FalconFFT fft = new FalconFFT();
    FalconCodec codec = new FalconCodec();
    FalconVrfy vrfy = new FalconVrfy();

    private static int mkn(int i) {
        return 1 << i;
    }

    private long toUnsignedLong(int i) {
        return i & BodyPartID.bodyIdMax;
    }

    public long get_rng_u64(SHAKE256 shake256) {
        shake256.inner_shake256_extract(new byte[8], 0, 8);
        return ((r0[1] & 255) << 8) | (r0[0] & 255) | ((r0[2] & 255) << 16) | ((r0[3] & 255) << 24) | ((r0[4] & 255) << 32) | ((r0[5] & 255) << 40) | ((r0[6] & 255) << 48) | ((r0[7] & 255) << 56);
    }

    public void keygen(SHAKE256 shake256, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int i4, short[] sArr, int i5, int i6) {
        FalconKeyGen falconKeyGen;
        int i7;
        FPREngine fPREngine;
        int i8;
        short[] sArr2;
        int i9;
        int i10;
        byte b;
        FalconKeyGen falconKeyGen2 = this;
        byte[] bArr5 = bArr;
        int i11 = i;
        byte[] bArr6 = bArr2;
        int i12 = i2;
        int i13 = i6;
        int mkn = mkn(i13);
        short[] sArr3 = sArr;
        while (true) {
            FalconFPR[] falconFPRArr = new FalconFPR[mkn * 3];
            falconKeyGen2.poly_small_mkgauss(shake256, bArr5, i11, i13);
            falconKeyGen2.poly_small_mkgauss(shake256, bArr6, i12, i13);
            int i14 = 1 << (falconKeyGen2.codec.max_fg_bits[i13] - 1);
            for (int i15 = 0; i15 < mkn; i15++) {
                byte b2 = bArr5[i11 + i15];
                if (b2 >= i14 || b2 <= (i10 = -i14) || (b = bArr6[i12 + i15]) >= i14 || b <= i10) {
                    i14 = -1;
                    break;
                }
            }
            if (i14 >= 0) {
                int poly_small_sqnorm = falconKeyGen2.poly_small_sqnorm(bArr5, i11, i13);
                int poly_small_sqnorm2 = falconKeyGen2.poly_small_sqnorm(bArr6, i12, i13);
                if ((((-((poly_small_sqnorm | poly_small_sqnorm2) >>> 31)) | (poly_small_sqnorm + poly_small_sqnorm2)) & BodyPartID.bodyIdMax) < 16823) {
                    int i16 = mkn + mkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, 0, bArr5, i11, i13);
                    int i17 = mkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, i17, bArr6, i12, i13);
                    falconKeyGen = falconKeyGen2;
                    falconKeyGen.fft.FFT(falconFPRArr, 0, i13);
                    falconKeyGen.fft.FFT(falconFPRArr, i17, i13);
                    falconKeyGen.fft.poly_invnorm2_fft(falconFPRArr, i16, falconFPRArr, 0, falconFPRArr, i17, i6);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, 0, i6);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, i17, i6);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, 0, falconKeyGen.fpr.fpr_q, i6);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, i17, falconKeyGen.fpr.fpr_q, i6);
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, 0, falconFPRArr, i16, i6);
                    i13 = i6;
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, i17, falconFPRArr, i16, i13);
                    i7 = i17;
                    falconKeyGen.fft.iFFT(falconFPRArr, 0, i13);
                    falconKeyGen.fft.iFFT(falconFPRArr, i7, i13);
                    FalconFPR falconFPR = falconKeyGen.fpr.fpr_zero;
                    int i18 = 0;
                    while (true) {
                        fPREngine = falconKeyGen.fpr;
                        if (i18 >= i7) {
                            break;
                        }
                        FalconFPR fpr_add = fPREngine.fpr_add(falconFPR, fPREngine.fpr_sqr(falconFPRArr[i18]));
                        FPREngine fPREngine2 = falconKeyGen.fpr;
                        falconFPR = fPREngine2.fpr_add(fpr_add, fPREngine2.fpr_sqr(falconFPRArr[i7 + i18]));
                        i18++;
                    }
                    if (fPREngine.fpr_lt(falconFPR, fPREngine.fpr_bnorm_max)) {
                        short[] sArr4 = new short[i7 * 2];
                        if (sArr3 == null) {
                            sArr2 = sArr4;
                            i8 = 0;
                            i9 = i7;
                        } else {
                            i8 = i5;
                            sArr2 = sArr3;
                            i9 = 0;
                        }
                        short[] sArr5 = sArr2;
                        if (falconKeyGen.vrfy.compute_public(sArr2, i8, bArr, i, bArr2, i2, i13, sArr4, i9) != 0) {
                            if (falconKeyGen.solve_NTRU(i13, bArr3, i3, bArr4, i4, bArr, i, bArr2, i2, (1 << (falconKeyGen.codec.max_FG_bits[i13] - 1)) - 1, new int[i13 > 2 ? i7 * 28 : i7 * 84], 0) != 0) {
                                return;
                            }
                        }
                        falconKeyGen2 = this;
                        bArr5 = bArr;
                        i11 = i;
                        bArr6 = bArr2;
                        i12 = i2;
                        i13 = i6;
                        mkn = i7;
                        sArr3 = sArr5;
                    } else {
                        bArr5 = bArr;
                        i11 = i;
                        bArr6 = bArr2;
                        i12 = i2;
                        falconKeyGen2 = falconKeyGen;
                        mkn = i7;
                    }
                }
            }
            falconKeyGen = falconKeyGen2;
            i7 = mkn;
            bArr5 = bArr;
            i11 = i;
            bArr6 = bArr2;
            i12 = i2;
            falconKeyGen2 = falconKeyGen;
            mkn = i7;
        }
    }

    public void make_fg(int[] iArr, int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int i5, int i6) {
        int i7;
        int[] iArr2;
        int i8;
        FalconKeyGen falconKeyGen;
        int mkn = mkn(i4);
        int i9 = i + mkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i10 = falconSmallPrimeArr[0].p;
        for (int i11 = 0; i11 < mkn; i11++) {
            iArr[i + i11] = modp_set(bArr[i2 + i11], i10);
            iArr[i9 + i11] = modp_set(bArr2[i3 + i11], i10);
        }
        if (i5 == 0 && i6 != 0) {
            int i12 = falconSmallPrimeArr[0].p;
            int modp_ninv31 = modp_ninv31(i12);
            int i13 = i9 + mkn;
            modp_mkgm2(iArr, i13, iArr, mkn + i13, i4, falconSmallPrimeArr[0].g, i12, modp_ninv31);
            modp_NTT2(iArr, i, iArr, i13, i4, i12, modp_ninv31);
            modp_NTT2(iArr, i9, iArr, i13, i4, i12, modp_ninv31);
            return;
        }
        int i14 = 0;
        while (i14 < i5) {
            int i15 = i4 - i14;
            int i16 = i14 != 0 ? 1 : 0;
            int i17 = i14 + 1;
            if (i17 < i5 || i6 != 0) {
                i7 = 1;
                iArr2 = iArr;
                i8 = i;
                falconKeyGen = this;
            } else {
                i7 = 0;
                falconKeyGen = this;
                iArr2 = iArr;
                i8 = i;
            }
            falconKeyGen.make_fg_step(iArr2, i8, i15, i14, i16, i7);
            i14 = i17;
        }
    }

    public void make_fg_step(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        FalconKeyGen falconKeyGen;
        int i11;
        int i12;
        int i13;
        int i14;
        FalconKeyGen falconKeyGen2;
        int i15;
        int i16;
        FalconKeyGen falconKeyGen3 = this;
        int[] iArr2 = iArr;
        boolean z = true;
        int i17 = 1 << i2;
        int i18 = i17 >> 1;
        int[] iArr3 = falconKeyGen3.MAX_BL_SMALL;
        int i19 = iArr3[i3];
        int i20 = iArr3[i3 + 1];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i21 = i18 * i20;
        int i22 = i + i21;
        int i23 = i22 + i21;
        int i24 = i17 * i19;
        int i25 = i23 + i24;
        int i26 = i25 + i24;
        int i27 = i26 + i17;
        int i28 = i27 + i17;
        System.arraycopy(iArr2, i, iArr2, i23, i17 * 2 * i19);
        int i29 = 0;
        while (i29 < i19) {
            int i30 = falconSmallPrimeArr[i29].p;
            int modp_ninv31 = falconKeyGen3.modp_ninv31(i30);
            int modp_R2 = falconKeyGen3.modp_R2(i30, modp_ninv31);
            boolean z2 = z;
            int i31 = i29;
            int i32 = i23;
            int i33 = i26;
            int i34 = i27;
            falconKeyGen3.modp_mkgm2(iArr2, i33, iArr, i34, i2, falconSmallPrimeArr[i29].g, i30, modp_ninv31);
            int i35 = i32 + i31;
            int i36 = 0;
            int i37 = i35;
            while (i36 < i17) {
                iArr[i28 + i36] = iArr[i37];
                i36++;
                i37 += i19;
            }
            if (i4 == 0) {
                int i38 = i28;
                falconKeyGen = this;
                falconKeyGen.modp_NTT2(iArr, i38, iArr, i33, i2, i30, modp_ninv31);
                i9 = i38;
                i8 = i34;
                i10 = modp_ninv31;
                i30 = i30;
            } else {
                i8 = i34;
                i9 = i28;
                i10 = modp_ninv31;
                falconKeyGen = this;
            }
            int i39 = i + i31;
            int i40 = 0;
            int i41 = i39;
            while (i40 < i18) {
                int i42 = i9 + (i40 << 1);
                iArr[i41] = falconKeyGen.modp_montymul(falconKeyGen.modp_montymul(iArr[i42], iArr[i42 + 1], i30, i10), modp_R2, i30, i10);
                i40++;
                i41 += i20;
            }
            if (i4 != 0) {
                int i43 = i19;
                falconKeyGen.modp_iNTT2_ext(iArr, i35, i43, iArr, i8, i2, i30, i10);
                i11 = i10;
                i12 = i43;
            } else {
                i11 = i10;
                i12 = i19;
            }
            int i44 = i8;
            int i45 = i25 + i31;
            int i46 = 0;
            int i47 = i45;
            while (i46 < i17) {
                iArr[i9 + i46] = iArr[i47];
                i46++;
                i47 += i12;
            }
            if (i4 == 0) {
                int i48 = i30;
                int i49 = i11;
                falconKeyGen2 = this;
                falconKeyGen2.modp_NTT2(iArr, i9, iArr, i33, i2, i48, i49);
                i13 = i12;
                i14 = i49;
                i30 = i48;
            } else {
                i13 = i12;
                i14 = i11;
                falconKeyGen2 = this;
            }
            int i50 = i22 + i31;
            int i51 = 0;
            int i52 = i50;
            while (i51 < i18) {
                int i53 = i9 + (i51 << 1);
                iArr[i52] = falconKeyGen2.modp_montymul(falconKeyGen2.modp_montymul(iArr[i53], iArr[i53 + 1], i30, i14), modp_R2, i30, i14);
                i51++;
                i52 += i20;
            }
            if (i4 != 0) {
                i15 = i44;
                falconKeyGen2.modp_iNTT2_ext(iArr, i45, i13, iArr, i15, i2, i30, i14);
            } else {
                i15 = i44;
            }
            int i54 = i13;
            if (i5 == 0) {
                int i55 = i2 - 1;
                int i56 = i20;
                modp_iNTT2_ext(iArr, i39, i56, iArr, i15, i55, i30, i14);
                modp_iNTT2_ext(iArr, i50, i56, iArr, i15, i55, i30, i14);
                i16 = i56;
            } else {
                i16 = i20;
            }
            i29 = i31 + 1;
            falconKeyGen3 = this;
            iArr2 = iArr;
            i23 = i32;
            i27 = i15;
            i26 = i33;
            z = z2;
            i28 = i9;
            i20 = i16;
            i19 = i54;
        }
        int i57 = i19;
        int i58 = i20;
        int i59 = i28;
        int i60 = i23;
        int i61 = i26;
        int i62 = i27;
        FalconKeyGen falconKeyGen4 = this;
        falconKeyGen4.zint_rebuild_CRT(iArr, i23, i57, i57, i17, falconSmallPrimeArr, 1, iArr, i61);
        falconKeyGen4.zint_rebuild_CRT(iArr, i25, i57, i57, i17, falconSmallPrimeArr, 1, iArr, i61);
        int i63 = i61;
        int i64 = i57;
        while (i64 < i58) {
            int i65 = falconSmallPrimeArr[i64].p;
            int modp_ninv312 = falconKeyGen4.modp_ninv31(i65);
            int modp_R22 = falconKeyGen4.modp_R2(i65, modp_ninv312);
            int modp_Rx = falconKeyGen4.modp_Rx(i57, i65, modp_ninv312, modp_R22);
            int i66 = modp_R22;
            int i67 = i63;
            int i68 = i62;
            int i69 = i64;
            falconKeyGen4.modp_mkgm2(iArr, i67, iArr, i68, i2, falconSmallPrimeArr[i64].g, i65, modp_ninv312);
            int i70 = i60;
            int i71 = 0;
            while (i71 < i17) {
                int i72 = i65;
                int i73 = i57;
                int i74 = modp_Rx;
                int i75 = i66;
                int zint_mod_small_signed = zint_mod_small_signed(iArr, i70, i73, i72, modp_ninv312, i75, i74);
                i65 = i72;
                iArr[i59 + i71] = zint_mod_small_signed;
                i71++;
                i70 += i73;
                i57 = i73;
                modp_Rx = i74;
                i66 = i75;
            }
            int i76 = modp_Rx;
            int i77 = i66;
            int i78 = i57;
            FalconKeyGen falconKeyGen5 = this;
            int i79 = i77;
            int i80 = i65;
            falconKeyGen5.modp_NTT2(iArr, i59, iArr, i67, i2, i80, modp_ninv312);
            int i81 = i80;
            int i82 = i + i69;
            int i83 = i82;
            int i84 = 0;
            while (i84 < i18) {
                int i85 = i59 + (i84 << 1);
                iArr[i83] = falconKeyGen5.modp_montymul(falconKeyGen5.modp_montymul(iArr[i85], iArr[i85 + 1], i81, modp_ninv312), i79, i81, modp_ninv312);
                i84++;
                i83 += i58;
            }
            int i86 = i25;
            int i87 = 0;
            while (i87 < i17) {
                int i88 = i81;
                int i89 = i79;
                int i90 = i78;
                int i91 = i76;
                int zint_mod_small_signed2 = falconKeyGen5.zint_mod_small_signed(iArr, i86, i90, i88, modp_ninv312, i89, i91);
                i81 = i88;
                iArr[i59 + i87] = zint_mod_small_signed2;
                i87++;
                i86 += i90;
                i79 = i89;
                i78 = i90;
                i76 = i91;
                falconKeyGen5 = this;
            }
            int i92 = i78;
            int i93 = i81;
            modp_NTT2(iArr, i59, iArr, i67, i2, i93, modp_ninv312);
            int i94 = i22 + i69;
            int i95 = 0;
            int i96 = i94;
            while (i95 < i18) {
                int i97 = i59 + (i95 << 1);
                iArr[i96] = modp_montymul(modp_montymul(iArr[i97], iArr[i97 + 1], i93, modp_ninv312), i79, i93, modp_ninv312);
                i95++;
                i96 += i58;
            }
            if (i5 == 0) {
                int i98 = i2 - 1;
                i6 = i58;
                i7 = i68;
                modp_iNTT2_ext(iArr, i82, i6, iArr, i7, i98, i93, modp_ninv312);
                modp_iNTT2_ext(iArr, i94, i6, iArr, i7, i98, i93, modp_ninv312);
            } else {
                i6 = i58;
                i7 = i68;
            }
            i64 = i69 + 1;
            falconKeyGen4 = this;
            i58 = i6;
            i62 = i7;
            i63 = i67;
            i57 = i92;
        }
    }

    public int mkgauss(SHAKE256 shake256, int i) {
        int i2 = 1 << (10 - i);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = get_rng_u64(shake256);
            int i5 = (int) (j >>> 63);
            int i6 = (int) (((j & Long.MAX_VALUE) - this.gauss_1024_12289[0]) >>> 63);
            long j2 = Long.MAX_VALUE & get_rng_u64(shake256);
            int i7 = 1;
            int i8 = 0;
            while (true) {
                long[] jArr = this.gauss_1024_12289;
                if (i7 < jArr.length) {
                    int i9 = ((int) ((j2 - jArr[i7]) >>> 63)) ^ 1;
                    i8 |= (-((i6 ^ 1) & i9)) & i7;
                    i6 |= i9;
                    i7++;
                }
            }
            i3 += ((-i5) ^ i8) + i5;
        }
        return i3;
    }

    public void modp_NTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        modp_NTT2_ext(iArr, i, 1, iArr2, i2, i3, i4, i5);
    }

    public void modp_NTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        if (i4 == 0) {
            return;
        }
        int mkn = mkn(i4);
        int i7 = 1;
        int i8 = mkn;
        while (i7 < mkn) {
            int i9 = i8 >> 1;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = iArr2[i3 + i7 + i10];
                int i13 = (i11 * i2) + i;
                int i14 = (i9 * i2) + i13;
                int i15 = 0;
                while (i15 < i9) {
                    int i16 = iArr[i13];
                    int modp_montymul = modp_montymul(iArr[i14], i12, i5, i6);
                    iArr[i13] = modp_add(i16, modp_montymul, i5);
                    iArr[i14] = modp_sub(i16, modp_montymul, i5);
                    i15++;
                    i13 += i2;
                    i14 += i2;
                }
                i10++;
                i11 += i8;
            }
            i7 <<= 1;
            i8 = i9;
        }
    }

    public int modp_R(int i) {
        return PKIFailureInfo.systemUnavail - i;
    }

    public int modp_R2(int i, int i2) {
        int modp_R = modp_R(i);
        int modp_add = modp_add(modp_R, modp_R, i);
        int modp_montymul = modp_montymul(modp_add, modp_add, i, i2);
        int modp_montymul2 = modp_montymul(modp_montymul, modp_montymul, i, i2);
        int modp_montymul3 = modp_montymul(modp_montymul2, modp_montymul2, i, i2);
        int modp_montymul4 = modp_montymul(modp_montymul3, modp_montymul3, i, i2);
        int modp_montymul5 = modp_montymul(modp_montymul4, modp_montymul4, i, i2);
        return (modp_montymul5 + (i & (-(modp_montymul5 & 1)))) >>> 1;
    }

    public int modp_Rx(int i, int i2, int i3, int i4) {
        int i5 = i - 1;
        int modp_R = modp_R(i2);
        int i6 = 0;
        while (true) {
            int i7 = 1 << i6;
            if (i7 > i5) {
                return modp_R;
            }
            if ((i7 & i5) != 0) {
                modp_R = modp_montymul(modp_R, i4, i2, i3);
            }
            i4 = modp_montymul(i4, i4, i2, i3);
            i6++;
        }
    }

    public int modp_add(int i, int i2, int i3) {
        int i4 = (i + i2) - i3;
        return i4 + ((-(i4 >>> 31)) & i3);
    }

    public int modp_div(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - 2;
        for (int i7 = 30; i7 >= 0; i7--) {
            int modp_montymul = modp_montymul(i5, i5, i3, i4);
            i5 = modp_montymul ^ ((-(1 & (i6 >>> i7))) & (modp_montymul(modp_montymul, i2, i3, i4) ^ modp_montymul));
        }
        return modp_montymul(i, modp_montymul(i5, 1, i3, i4), i3, i4);
    }

    public void modp_iNTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        modp_iNTT2_ext(iArr, i, 1, iArr2, i2, i3, i4, i5);
    }

    public void modp_iNTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        int i7;
        if (i4 == 0) {
            return;
        }
        int mkn = mkn(i4);
        int i8 = 1;
        int i9 = mkn;
        int i10 = 1;
        while (true) {
            i7 = 0;
            if (i9 <= i8) {
                break;
            }
            i9 >>= 1;
            int i11 = i10 << 1;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i9) {
                int i14 = iArr2[i3 + i9 + i12];
                int i15 = (i13 * i2) + i;
                int i16 = (i10 * i2) + i15;
                int i17 = 0;
                while (i17 < i10) {
                    int i18 = iArr[i15];
                    int i19 = i8;
                    int i20 = iArr[i16];
                    iArr[i15] = modp_add(i18, i20, i5);
                    iArr[i16] = modp_montymul(modp_sub(i18, i20, i5), i14, i5, i6);
                    i17++;
                    i15 += i2;
                    i16 += i2;
                    i8 = i19;
                }
                i12++;
                i13 += i11;
            }
            i10 = i11;
        }
        int i21 = i8 << (31 - i4);
        int i22 = i;
        while (i7 < mkn) {
            iArr[i22] = modp_montymul(iArr[i22], i21, i5, i6);
            i7++;
            i22 += i2;
        }
    }

    public void modp_mkgm2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6) {
        int mkn = mkn(i3);
        int modp_R2 = modp_R2(i5, i6);
        int modp_montymul = modp_montymul(i4, modp_R2, i5, i6);
        for (int i7 = i3; i7 < 10; i7++) {
            modp_montymul = modp_montymul(modp_montymul, modp_montymul, i5, i6);
        }
        int modp_div = modp_div(modp_R2, modp_montymul, i5, i6, modp_R(i5));
        int i8 = 10 - i3;
        int modp_R = modp_R(i5);
        int i9 = modp_R;
        for (int i10 = 0; i10 < mkn; i10++) {
            short s = this.REV10[i10 << i8];
            iArr[i + s] = modp_R;
            iArr2[i2 + s] = i9;
            modp_R = modp_montymul(modp_R, modp_montymul, i5, i6);
            i9 = modp_montymul(i9, modp_div, i5, i6);
        }
    }

    public int modp_montymul(int i, int i2, int i3, int i4) {
        long unsignedLong = toUnsignedLong(i) * toUnsignedLong(i2);
        int unsignedLong2 = ((int) (((((i4 * unsignedLong) & toUnsignedLong(Integer.MAX_VALUE)) * i3) + unsignedLong) >>> 31)) - i3;
        return unsignedLong2 + ((-(unsignedLong2 >>> 31)) & i3);
    }

    public int modp_ninv31(int i) {
        int i2 = 2 - i;
        int i3 = (2 - (i * i2)) * i2;
        int i4 = (2 - (i * i3)) * i3;
        int i5 = (2 - (i * i4)) * i4;
        return (-((2 - (i * i5)) * i5)) & Integer.MAX_VALUE;
    }

    public int modp_norm(int i, int i2) {
        return i - ((((i - ((i2 + 1) >>> 1)) >>> 31) - 1) & i2);
    }

    public void modp_poly_rec_res(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 1 << (i2 - 1);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = (i7 << 1) + i;
            iArr[i + i7] = modp_montymul(modp_montymul(iArr[i8], iArr[i8 + 1], i3, i4), i5, i3, i4);
        }
    }

    public int modp_set(int i, int i2) {
        return i + ((-(i >>> 31)) & i2);
    }

    public int modp_sub(int i, int i2, int i3) {
        int i4 = i - i2;
        return i4 + ((-(i4 >>> 31)) & i3);
    }

    public void poly_big_to_fp(FalconFPR[] falconFPRArr, int i, int[] iArr, int i2, int i3, int i4, int i5) {
        int mkn = mkn(i5);
        if (i3 == 0) {
            for (int i6 = 0; i6 < mkn; i6++) {
                falconFPRArr[i + i6] = this.fpr.fpr_zero;
            }
            return;
        }
        int i7 = i2;
        int i8 = 0;
        while (i8 < mkn) {
            int i9 = -(iArr[(i7 + i3) - 1] >>> 30);
            int i10 = i9 >>> 1;
            int i11 = i9 & 1;
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPR = fPREngine.fpr_zero;
            FalconFPR falconFPR2 = fPREngine.fpr_one;
            int i12 = 0;
            while (i12 < i3) {
                int i13 = (iArr[i7 + i12] ^ i10) + i11;
                i11 = i13 >>> 31;
                int i14 = i13 & Integer.MAX_VALUE;
                FPREngine fPREngine2 = this.fpr;
                falconFPR = fPREngine2.fpr_add(falconFPR, fPREngine2.fpr_mul(fPREngine2.fpr_of(i14 - ((i14 << 1) & i9)), falconFPR2));
                i12++;
                FPREngine fPREngine3 = this.fpr;
                falconFPR2 = fPREngine3.fpr_mul(falconFPR2, fPREngine3.fpr_ptwo31);
            }
            falconFPRArr[i + i8] = falconFPR;
            i8++;
            i7 += i4;
        }
    }

    public int poly_big_to_small(byte[] bArr, int i, int[] iArr, int i2, int i3, int i4) {
        int mkn = mkn(i4);
        for (int i5 = 0; i5 < mkn; i5++) {
            int zint_one_to_plain = zint_one_to_plain(iArr, i2 + i5);
            if (zint_one_to_plain < (-i3) || zint_one_to_plain > i3) {
                return 0;
            }
            bArr[i + i5] = (byte) zint_one_to_plain;
        }
        return 1;
    }

    public void poly_small_mkgauss(SHAKE256 shake256, byte[] bArr, int i, int i2) {
        int mkgauss;
        int mkn = mkn(i2);
        int i3 = 0;
        for (int i4 = 0; i4 < mkn; i4++) {
            while (true) {
                mkgauss = mkgauss(shake256, i2);
                if (mkgauss >= -127 && mkgauss <= 127) {
                    if (i4 != mkn - 1) {
                        i3 ^= mkgauss & 1;
                        break;
                    } else if (((mkgauss & 1) ^ i3) == 0) {
                    }
                }
            }
            bArr[i + i4] = (byte) mkgauss;
        }
    }

    public int poly_small_sqnorm(byte[] bArr, int i, int i2) {
        int mkn = mkn(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < mkn; i5++) {
            byte b = bArr[i + i5];
            i3 += b * b;
            i4 |= i3;
        }
        return (-(i4 >>> 31)) | i3;
    }

    public void poly_small_to_fp(FalconFPR[] falconFPRArr, int i, byte[] bArr, int i2, int i3) {
        int mkn = mkn(i3);
        for (int i4 = 0; i4 < mkn; i4++) {
            falconFPRArr[i + i4] = this.fpr.fpr_of(bArr[i2 + i4]);
        }
    }

    public void poly_sub_scaled(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6, int[] iArr3, int i7, int i8, int i9, int i10) {
        int mkn = mkn(i10);
        for (int i11 = 0; i11 < mkn; i11++) {
            int i12 = i4;
            int i13 = -iArr3[i7 + i11];
            int i14 = (i11 * i3) + i;
            for (int i15 = 0; i15 < mkn; i15++) {
                zint_add_scaled_mul_small(iArr, i14, i2, iArr2, i12, i5, i13, i8, i9);
                if (i11 + i15 == mkn - 1) {
                    i14 = i;
                    i13 = -i13;
                } else {
                    i14 += i3;
                }
                i12 += i6;
            }
        }
    }

    public void poly_sub_scaled_ntt(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6, int[] iArr3, int i7, int i8, int i9, int i10, int[] iArr4, int i11) {
        FalconKeyGen falconKeyGen = this;
        int i12 = i5;
        int mkn = mkn(i10);
        int i13 = i12 + 1;
        int mkn2 = i11 + mkn(i10);
        int mkn3 = mkn2 + mkn(i10);
        int i14 = (mkn * i13) + mkn3;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i15 = 0;
        int i16 = 0;
        while (i16 < i13) {
            int i17 = falconSmallPrimeArr[i16].p;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i17);
            int modp_R2 = falconKeyGen.modp_R2(i17, modp_ninv31);
            int modp_Rx = falconKeyGen.modp_Rx(i12, i17, modp_ninv31, modp_R2);
            int i18 = i16;
            falconKeyGen.modp_mkgm2(iArr4, i11, iArr4, mkn2, i10, falconSmallPrimeArr[i16].g, i17, modp_ninv31);
            int i19 = mkn2;
            for (int i20 = 0; i20 < mkn; i20++) {
                iArr4[i14 + i20] = falconKeyGen.modp_set(iArr3[i7 + i20], i17);
            }
            int i21 = i14;
            falconKeyGen.modp_NTT2(iArr4, i21, iArr4, i11, i10, i17, modp_ninv31);
            int i22 = i17;
            int i23 = mkn3 + i18;
            int i24 = i4;
            int i25 = i23;
            int i26 = 0;
            while (i26 < mkn) {
                int i27 = i22;
                int i28 = modp_ninv31;
                int i29 = modp_Rx;
                int zint_mod_small_signed = zint_mod_small_signed(iArr2, i24, i5, i27, i28, modp_R2, i29);
                i22 = i27;
                iArr4[i25] = zint_mod_small_signed;
                i24 += i6;
                i25 += i13;
                modp_Rx = i29;
                i26++;
                modp_ninv31 = i28;
            }
            int i30 = i13;
            modp_NTT2_ext(iArr4, i23, i30, iArr4, i11, i10, i22, modp_ninv31);
            int i31 = 0;
            while (i31 < mkn) {
                iArr4[i23] = modp_montymul(modp_montymul(iArr4[i21 + i31], iArr4[i23], i22, modp_ninv31), modp_R2, i22, modp_ninv31);
                i31++;
                i23 += i30;
            }
            modp_iNTT2_ext(iArr4, i23, i30, iArr4, i19, i10, i22, modp_ninv31);
            i16 = i18 + 1;
            falconKeyGen = this;
            i13 = i30;
            i14 = i21;
            mkn2 = i19;
            i12 = i5;
        }
        int i32 = i13;
        zint_rebuild_CRT(iArr4, mkn3, i32, i32, mkn, falconSmallPrimeArr, 1, iArr4, i14);
        int i33 = mkn3;
        int i34 = i;
        while (i15 < mkn) {
            int i35 = i32;
            zint_sub_scaled(iArr, i34, i2, iArr4, i33, i35, i8, i9);
            i32 = i35;
            i15++;
            i34 += i3;
            i33 += i32;
        }
    }

    public int solve_NTRU(int i, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, int i6, int[] iArr, int i7) {
        byte[] bArr5;
        int i8;
        FalconKeyGen falconKeyGen;
        int i9;
        byte[] bArr6;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int mkn = mkn(i);
        if (solve_NTRU_deepest(i, bArr3, i4, bArr4, i5, iArr, i7) == 0) {
            return 0;
        }
        int i13 = i;
        if (i13 <= 2) {
            int i14 = i13;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i13, bArr3, i4, bArr4, i5, i15, iArr, i7) == 0) {
                    return 0;
                }
                i13 = i;
                i14 = i15;
            }
        } else {
            int i16 = i;
            while (true) {
                int i17 = i16 - 1;
                if (i16 > 2) {
                    if (solve_NTRU_intermediate(i, bArr3, i4, bArr4, i5, i17, iArr, i7) == 0) {
                        return 0;
                    }
                    i16 = i17;
                } else if (solve_NTRU_binary_depth1(i, bArr3, i4, bArr4, i5, iArr, i7) == 0 || solve_NTRU_binary_depth0(i, bArr3, i4, bArr4, i5, iArr, i7) == 0) {
                    return 0;
                }
            }
        }
        if (bArr2 == null) {
            bArr5 = new byte[mkn];
            i8 = 0;
            i9 = i;
            bArr6 = bArr;
            i10 = i2;
            i11 = i6;
            iArr2 = iArr;
            i12 = i7;
            falconKeyGen = this;
        } else {
            bArr5 = bArr2;
            i8 = i3;
            falconKeyGen = this;
            i9 = i;
            bArr6 = bArr;
            i10 = i2;
            i11 = i6;
            iArr2 = iArr;
            i12 = i7;
        }
        if (falconKeyGen.poly_big_to_small(bArr6, i10, iArr2, i12, i11, i9) != 0) {
            int i18 = i7 + mkn;
            byte[] bArr7 = bArr5;
            int i19 = i8;
            if (poly_big_to_small(bArr7, i19, iArr, i18, i6, i) != 0) {
                int i20 = i18 + mkn;
                int i21 = i20 + mkn;
                int i22 = i21 + mkn;
                FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
                int i23 = falconSmallPrimeArr[0].p;
                int modp_ninv31 = modp_ninv31(i23);
                modp_mkgm2(iArr, i22, iArr, i7, i, falconSmallPrimeArr[0].g, i23, modp_ninv31);
                for (int i24 = 0; i24 < mkn; i24++) {
                    iArr[i7 + i24] = modp_set(bArr7[i19 + i24], i23);
                }
                for (int i25 = 0; i25 < mkn; i25++) {
                    iArr[i18 + i25] = modp_set(bArr3[i4 + i25], i23);
                    iArr[i20 + i25] = modp_set(bArr4[i5 + i25], i23);
                    iArr[i21 + i25] = modp_set(bArr[i2 + i25], i23);
                }
                modp_NTT2(iArr, i18, iArr, i22, i, i23, modp_ninv31);
                modp_NTT2(iArr, i20, iArr, i22, i, i23, modp_ninv31);
                modp_NTT2(iArr, i21, iArr, i22, i, i23, modp_ninv31);
                modp_NTT2(iArr, i7, iArr, i22, i, i23, modp_ninv31);
                int modp_montymul = modp_montymul(12289, 1, i23, modp_ninv31);
                for (int i26 = 0; i26 < mkn; i26++) {
                    if (modp_sub(modp_montymul(iArr[i18 + i26], iArr[i7 + i26], i23, modp_ninv31), modp_montymul(iArr[i20 + i26], iArr[i21 + i26], i23, modp_ninv31), i23) != modp_montymul) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public int solve_NTRU_binary_depth0(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int[] iArr, int i4) {
        int i5 = 1;
        int i6 = 1 << i;
        int i7 = i6 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i8 = 0;
        int i9 = falconSmallPrimeArr[0].p;
        int modp_ninv31 = modp_ninv31(i9);
        int modp_R2 = modp_R2(i9, modp_ninv31);
        int i10 = i4 + i7;
        int i11 = i10 + i7;
        int i12 = i11 + i6;
        int i13 = i12 + i6;
        int i14 = i13 + i6;
        modp_mkgm2(iArr, i13, iArr, i14, i, falconSmallPrimeArr[0].g, i9, modp_ninv31);
        for (int i15 = 0; i15 < i7; i15++) {
            int i16 = i4 + i15;
            iArr[i16] = modp_set(zint_one_to_plain(iArr, i16), i9);
            int i17 = i10 + i15;
            iArr[i17] = modp_set(zint_one_to_plain(iArr, i17), i9);
        }
        int i18 = i - 1;
        modp_NTT2(iArr, i4, iArr, i13, i18, i9, modp_ninv31);
        modp_NTT2(iArr, i10, iArr, i13, i18, i9, modp_ninv31);
        for (int i19 = 0; i19 < i6; i19++) {
            iArr[i11 + i19] = modp_set(bArr[i2 + i19], i9);
            iArr[i12 + i19] = modp_set(bArr2[i3 + i19], i9);
        }
        modp_NTT2(iArr, i11, iArr, i13, i, i9, modp_ninv31);
        modp_NTT2(iArr, i12, iArr, i13, i, i9, modp_ninv31);
        int i20 = 0;
        while (i20 < i6) {
            int i21 = i11 + i20;
            int i22 = iArr[i21];
            int i23 = i21 + 1;
            int i24 = iArr[i23];
            int i25 = i12 + i20;
            int i26 = i5;
            int i27 = iArr[i25];
            int i28 = i25 + 1;
            int i29 = i8;
            int i30 = iArr[i28];
            int i31 = i20 >> 1;
            int i32 = i20;
            int modp_montymul = modp_montymul(iArr[i4 + i31], modp_R2, i9, modp_ninv31);
            int modp_montymul2 = modp_montymul(iArr[i10 + i31], modp_R2, i9, modp_ninv31);
            iArr[i21] = modp_montymul(i30, modp_montymul, i9, modp_ninv31);
            iArr[i23] = modp_montymul(i27, modp_montymul, i9, modp_ninv31);
            iArr[i25] = modp_montymul(i24, modp_montymul2, i9, modp_ninv31);
            iArr[i28] = modp_montymul(i22, modp_montymul2, i9, modp_ninv31);
            i20 = i32 + 2;
            i5 = i26;
            i8 = i29;
        }
        int i33 = i5;
        int i34 = i8;
        modp_iNTT2(iArr, i11, iArr, i14, i, i9, modp_ninv31);
        modp_iNTT2(iArr, i12, iArr, i14, i, i9, modp_ninv31);
        int i35 = i4 + i6;
        int i36 = i35 + i6;
        System.arraycopy(iArr, i11, iArr, i4, i6 * 2);
        int i37 = i36 + i6;
        int i38 = i37 + i6;
        int i39 = i38 + i6;
        int i40 = i39 + i6;
        modp_mkgm2(iArr, i36, iArr, i37, i, FalconSmallPrimeList.PRIMES[i34].g, i9, modp_ninv31);
        modp_NTT2(iArr, i4, iArr, i36, i, i9, modp_ninv31);
        modp_NTT2(iArr, i35, iArr, i36, i, i9, modp_ninv31);
        int modp_set = modp_set(bArr[i2], i9);
        iArr[i40] = modp_set;
        iArr[i39] = modp_set;
        for (int i41 = i33; i41 < i6; i41++) {
            int i42 = i2 + i41;
            iArr[i39 + i41] = modp_set(bArr[i42], i9);
            iArr[(i40 + i6) - i41] = modp_set(-bArr[i42], i9);
        }
        modp_NTT2(iArr, i39, iArr, i36, i, i9, modp_ninv31);
        modp_NTT2(iArr, i40, iArr, i36, i, i9, modp_ninv31);
        for (int i43 = i34; i43 < i6; i43++) {
            int modp_montymul3 = modp_montymul(iArr[i40 + i43], modp_R2, i9, modp_ninv31);
            iArr[i37 + i43] = modp_montymul(modp_montymul3, iArr[i4 + i43], i9, modp_ninv31);
            iArr[i38 + i43] = modp_montymul(modp_montymul3, iArr[i39 + i43], i9, modp_ninv31);
        }
        int modp_set2 = modp_set(bArr2[i3], i9);
        iArr[i40] = modp_set2;
        iArr[i39] = modp_set2;
        for (int i44 = i33; i44 < i6; i44++) {
            int i45 = i3 + i44;
            iArr[i39 + i44] = modp_set(bArr2[i45], i9);
            iArr[(i40 + i6) - i44] = modp_set(-bArr2[i45], i9);
        }
        modp_NTT2(iArr, i39, iArr, i36, i, i9, modp_ninv31);
        modp_NTT2(iArr, i40, iArr, i36, i, i9, modp_ninv31);
        for (int i46 = i34; i46 < i6; i46++) {
            int modp_montymul4 = modp_montymul(iArr[i40 + i46], modp_R2, i9, modp_ninv31);
            int i47 = i37 + i46;
            iArr[i47] = modp_add(iArr[i47], modp_montymul(modp_montymul4, iArr[i35 + i46], i9, modp_ninv31), i9);
            int i48 = i38 + i46;
            iArr[i48] = modp_add(iArr[i48], modp_montymul(modp_montymul4, iArr[i39 + i46], i9, modp_ninv31), i9);
        }
        int i49 = modp_ninv31;
        modp_mkgm2(iArr, i36, iArr, i39, i, FalconSmallPrimeList.PRIMES[i34].g, i9, i49);
        modp_iNTT2(iArr, i37, iArr, i39, i, i9, i49);
        modp_iNTT2(iArr, i38, iArr, i39, i, i9, i49);
        for (int i50 = i34; i50 < i6; i50++) {
            int i51 = i37 + i50;
            iArr[i36 + i50] = modp_norm(iArr[i51], i9);
            iArr[i51] = modp_norm(iArr[i38 + i50], i9);
        }
        FalconFPR[] falconFPRArr = new FalconFPR[i6 * 3];
        int i52 = i6 + i6;
        for (int i53 = i34; i53 < i6; i53++) {
            falconFPRArr[i52 + i53] = this.fpr.fpr_of(iArr[i37 + i53]);
        }
        this.fft.FFT(falconFPRArr, i52, i);
        System.arraycopy(falconFPRArr, i52, falconFPRArr, i6, i7);
        int i54 = i6 + i7;
        int i55 = i34;
        while (i55 < i6) {
            falconFPRArr[i54 + i55] = this.fpr.fpr_of(iArr[i36 + i55]);
            i55++;
            i35 = i35;
            i49 = i49;
        }
        int i56 = i49;
        int i57 = i35;
        this.fft.FFT(falconFPRArr, i54, i);
        this.fft.poly_div_autoadj_fft(falconFPRArr, i54, falconFPRArr, i6, i);
        this.fft.iFFT(falconFPRArr, i54, i);
        for (int i58 = i34; i58 < i6; i58++) {
            iArr[i36 + i58] = modp_set((int) this.fpr.fpr_rint(falconFPRArr[i54 + i58]), i9);
        }
        modp_mkgm2(iArr, i37, iArr, i38, i, FalconSmallPrimeList.PRIMES[i34].g, i9, i56);
        for (int i59 = i34; i59 < i6; i59++) {
            iArr[i39 + i59] = modp_set(bArr[i2 + i59], i9);
            iArr[i40 + i59] = modp_set(bArr2[i3 + i59], i9);
        }
        modp_NTT2(iArr, i36, iArr, i37, i, i9, i56);
        modp_NTT2(iArr, i39, iArr, i37, i, i9, i56);
        modp_NTT2(iArr, i40, iArr, i37, i, i9, i56);
        for (int i60 = i34; i60 < i6; i60++) {
            int modp_montymul5 = modp_montymul(iArr[i36 + i60], modp_R2, i9, i56);
            int i61 = i4 + i60;
            iArr[i61] = modp_sub(iArr[i61], modp_montymul(modp_montymul5, iArr[i39 + i60], i9, i56), i9);
            int i62 = i57 + i60;
            iArr[i62] = modp_sub(iArr[i62], modp_montymul(modp_montymul5, iArr[i40 + i60], i9, i56), i9);
        }
        modp_iNTT2(iArr, i4, iArr, i38, i, i9, i56);
        modp_iNTT2(iArr, i57, iArr, i38, i, i9, i56);
        for (int i63 = i34; i63 < i6; i63++) {
            int i64 = i4 + i63;
            iArr[i64] = modp_norm(iArr[i64], i9);
            int i65 = i57 + i63;
            iArr[i65] = modp_norm(iArr[i65], i9);
        }
        return i33;
    }

    public int solve_NTRU_binary_depth1(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int[] iArr, int i4) {
        int i5;
        FalconKeyGen falconKeyGen = this;
        int i6 = 1;
        int i7 = 1 << i;
        int i8 = i - 1;
        int i9 = 1 << i8;
        int i10 = i9 >> 1;
        int[] iArr2 = falconKeyGen.MAX_BL_SMALL;
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = falconKeyGen.MAX_BL_LARGE[1];
        int i14 = i12 * i10;
        int i15 = i4 + i14;
        int i16 = i15 + i14;
        int i17 = i13 * i9;
        int i18 = i16 + i17;
        int i19 = 0;
        int i20 = 0;
        while (i20 < i13) {
            int i21 = FalconSmallPrimeList.PRIMES[i20].p;
            int i22 = i19;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i21);
            int i23 = i20;
            int modp_R2 = falconKeyGen.modp_R2(i21, modp_ninv31);
            int i24 = i18;
            int modp_Rx = falconKeyGen.modp_Rx(i12, i21, modp_ninv31, modp_R2);
            int i25 = i16 + i23;
            int i26 = i24 + i23;
            int i27 = i17;
            int i28 = i4;
            int i29 = i6;
            int i30 = i15;
            int i31 = i22;
            while (i31 < i10) {
                int i32 = i28;
                iArr[i25] = falconKeyGen.zint_mod_small_signed(iArr, i28, i12, i21, modp_ninv31, modp_R2, modp_Rx);
                falconKeyGen = this;
                int i33 = i30;
                iArr[i26] = falconKeyGen.zint_mod_small_signed(iArr, i33, i12, i21, modp_ninv31, modp_R2, modp_Rx);
                i25 += i13;
                i26 += i13;
                i30 = i33 + i12;
                i28 = i32 + i12;
                i24 = i24;
                i10 = i10;
                i23 = i23;
                i16 = i16;
                i31++;
                i27 = i27;
                i11 = i11;
            }
            i20 = i23 + 1;
            i16 = i16;
            i18 = i24;
            i17 = i27;
            i11 = i11;
            i10 = i10;
            i6 = i29;
            i19 = 0;
        }
        int i34 = i6;
        int i35 = i10;
        int i36 = i11;
        int i37 = i16;
        int i38 = i17;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i37, iArr3, i4, i38);
        int i39 = i4 + i38;
        System.arraycopy(iArr3, i18, iArr3, i39, i38);
        int i40 = i39 + i38;
        int i41 = i36 * i9;
        int i42 = i40 + i41;
        int i43 = i42 + i41;
        int i44 = 0;
        while (i44 < i13) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i45 = falconSmallPrimeArr[i44].p;
            int modp_ninv312 = falconKeyGen.modp_ninv31(i45);
            int modp_R22 = falconKeyGen.modp_R2(i45, modp_ninv312);
            int i46 = i44;
            int i47 = i43;
            int i48 = i47 + i7;
            int i49 = i48 + i9;
            int i50 = i49 + i7;
            int i51 = i13;
            falconKeyGen.modp_mkgm2(iArr3, i47, iArr, i48, i, falconSmallPrimeArr[i46].g, i45, modp_ninv312);
            int i52 = i45;
            for (int i53 = 0; i53 < i7; i53++) {
                iArr[i49 + i53] = falconKeyGen.modp_set(bArr[i2 + i53], i52);
                iArr[i50 + i53] = falconKeyGen.modp_set(bArr2[i3 + i53], i52);
            }
            falconKeyGen.modp_NTT2(iArr, i49, iArr, i47, i, i52, modp_ninv312);
            modp_NTT2(iArr, i50, iArr, i47, i, i52, modp_ninv312);
            int i54 = i47;
            int i55 = i;
            while (i55 > i8) {
                int i56 = i52;
                int i57 = modp_R22;
                int i58 = i49;
                modp_poly_rec_res(iArr, i58, i55, i56, modp_ninv312, i57);
                modp_poly_rec_res(iArr, i50, i55, i56, modp_ninv312, i57);
                i52 = i56;
                i55--;
                i49 = i58;
                i54 = i54;
                modp_R22 = i57;
            }
            int i59 = modp_R22;
            int i60 = i54;
            int i61 = i60 + i9;
            System.arraycopy(iArr, i48, iArr, i61, i9);
            int i62 = i61 + i9;
            System.arraycopy(iArr, i49, iArr, i62, i9);
            int i63 = i62 + i9;
            System.arraycopy(iArr, i50, iArr, i63, i9);
            int i64 = i63 + i9;
            int i65 = i64 + i35;
            int i66 = i4 + i46;
            int i67 = i39 + i46;
            int i68 = i35;
            int i69 = i39;
            int i70 = i66;
            int i71 = i67;
            int i72 = 0;
            while (i72 < i68) {
                iArr[i64 + i72] = iArr[i70];
                iArr[i65 + i72] = iArr[i71];
                i72++;
                i70 += i51;
                i71 += i51;
            }
            int i73 = i - 2;
            modp_NTT2(iArr, i64, iArr, i60, i73, i52, modp_ninv312);
            int i74 = i65;
            modp_NTT2(iArr, i74, iArr, i60, i73, i52, modp_ninv312);
            int i75 = i66;
            int i76 = i67;
            int i77 = 0;
            while (i77 < i68) {
                int i78 = i77 << 1;
                int i79 = i62 + i78;
                int i80 = i75;
                int i81 = iArr[i79];
                int i82 = i74;
                int i83 = iArr[i79 + 1];
                int i84 = i63 + i78;
                int i85 = i76;
                int i86 = iArr[i84];
                int i87 = iArr[i84 + 1];
                int i88 = i77;
                int modp_montymul = modp_montymul(iArr[i64 + i77], i59, i52, modp_ninv312);
                int i89 = i7;
                int modp_montymul2 = modp_montymul(iArr[i82 + i88], i59, i52, modp_ninv312);
                iArr[i80] = modp_montymul(i87, modp_montymul, i52, modp_ninv312);
                iArr[i80 + i51] = modp_montymul(i86, modp_montymul, i52, modp_ninv312);
                iArr[i85] = modp_montymul(i83, modp_montymul2, i52, modp_ninv312);
                iArr[i85 + i51] = modp_montymul(i81, modp_montymul2, i52, modp_ninv312);
                i77 = i88 + 1;
                int i90 = i51 << 1;
                i76 = i85 + i90;
                i75 = i80 + i90;
                i74 = i82;
                i7 = i89;
            }
            int i91 = i7;
            int i92 = i52;
            int i93 = i8;
            modp_iNTT2_ext(iArr, i66, i51, iArr, i61, i93, i92, modp_ninv312);
            modp_iNTT2_ext(iArr, i67, i51, iArr, i61, i93, i92, modp_ninv312);
            int i94 = i36;
            if (i46 < i94) {
                modp_iNTT2(iArr, i62, iArr, i61, i93, i92, modp_ninv312);
                modp_iNTT2(iArr, i63, iArr, i61, i93, i92, modp_ninv312);
                i5 = i93;
                int i95 = i40 + i46;
                int i96 = i42 + i46;
                int i97 = 0;
                while (i97 < i9) {
                    iArr[i95] = iArr[i62 + i97];
                    iArr[i96] = iArr[i63 + i97];
                    i97++;
                    i95 += i94;
                    i96 += i94;
                }
            } else {
                i5 = i93;
            }
            i44 = i46 + 1;
            i35 = i68;
            i39 = i69;
            falconKeyGen = this;
            iArr3 = iArr;
            i36 = i94;
            i43 = i60;
            i13 = i51;
            i8 = i5;
            i7 = i91;
        }
        int i98 = i43;
        int i99 = i13;
        int i100 = i8;
        int i101 = i36;
        int i102 = i9 << 1;
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        zint_rebuild_CRT(iArr, i4, i99, i99, i102, falconSmallPrimeArr2, 1, iArr, i98);
        zint_rebuild_CRT(iArr, i40, i101, i101, i102, falconSmallPrimeArr2, 1, iArr, i98);
        FalconFPR[] falconFPRArr = new FalconFPR[i9];
        FalconFPR[] falconFPRArr2 = new FalconFPR[i9];
        poly_big_to_fp(falconFPRArr, 0, iArr, i4, i99, i99, i100);
        poly_big_to_fp(falconFPRArr2, 0, iArr, i39, i99, i99, i100);
        System.arraycopy(iArr, i40, iArr, i4, i101 * 2 * i9);
        FalconFPR[] falconFPRArr3 = new FalconFPR[i9];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i9];
        poly_big_to_fp(falconFPRArr3, 0, iArr, i4, i101, i101, i100);
        poly_big_to_fp(falconFPRArr4, 0, iArr, i4 + i41, i101, i101, i100);
        this.fft.FFT(falconFPRArr, 0, i100);
        this.fft.FFT(falconFPRArr2, 0, i100);
        this.fft.FFT(falconFPRArr3, 0, i100);
        this.fft.FFT(falconFPRArr4, 0, i100);
        FalconFPR[] falconFPRArr5 = new FalconFPR[i9];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i35];
        this.fft.poly_add_muladj_fft(falconFPRArr5, 0, falconFPRArr, 0, falconFPRArr2, 0, falconFPRArr3, 0, falconFPRArr4, 0, i100);
        this.fft.poly_invnorm2_fft(falconFPRArr6, 0, falconFPRArr3, 0, falconFPRArr4, 0, i100);
        this.fft.poly_mul_autoadj_fft(falconFPRArr5, 0, falconFPRArr6, 0, i100);
        this.fft.iFFT(falconFPRArr5, 0, i100);
        for (int i103 = 0; i103 < i9; i103++) {
            FalconFPR falconFPR = falconFPRArr5[i103];
            FPREngine fPREngine = this.fpr;
            if (!fPREngine.fpr_lt(falconFPR, fPREngine.fpr_ptwo63m1)) {
                return 0;
            }
            FPREngine fPREngine2 = this.fpr;
            if (!fPREngine2.fpr_lt(fPREngine2.fpr_mtwo63m1, falconFPR)) {
                return 0;
            }
            FPREngine fPREngine3 = this.fpr;
            falconFPRArr5[i103] = fPREngine3.fpr_of(fPREngine3.fpr_rint(falconFPR));
        }
        this.fft.FFT(falconFPRArr5, 0, i100);
        this.fft.poly_mul_fft(falconFPRArr3, 0, falconFPRArr5, 0, i100);
        this.fft.poly_mul_fft(falconFPRArr4, 0, falconFPRArr5, 0, i100);
        this.fft.poly_sub(falconFPRArr, 0, falconFPRArr3, 0, i100);
        this.fft.poly_sub(falconFPRArr2, 0, falconFPRArr4, 0, i100);
        this.fft.iFFT(falconFPRArr, 0, i100);
        this.fft.iFFT(falconFPRArr2, 0, i100);
        int i104 = i4 + i9;
        for (int i105 = 0; i105 < i9; i105++) {
            iArr[i4 + i105] = (int) this.fpr.fpr_rint(falconFPRArr[i105]);
            iArr[i104 + i105] = (int) this.fpr.fpr_rint(falconFPRArr2[i105]);
        }
        return i34;
    }

    public int solve_NTRU_deepest(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int[] iArr, int i4) {
        int i5 = this.MAX_BL_SMALL[i];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i6 = i4 + i5;
        int i7 = i6 + i5;
        int i8 = i7 + i5;
        int i9 = i8 + i5;
        make_fg(iArr, i7, bArr, i2, bArr2, i3, i, i, 0);
        zint_rebuild_CRT(iArr, i7, i5, i5, 2, falconSmallPrimeArr, 0, iArr, i9);
        return (zint_bezout(iArr, i6, iArr, i4, iArr, i7, iArr, i8, i5, iArr, i9) != 0 && zint_mul_small(iArr, i4, i5, 12289) == 0 && zint_mul_small(iArr, i6, i5, 12289) == 0) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0493 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int solve_NTRU_intermediate(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, int i5) {
        FalconFPR falconFPR;
        int i6;
        int i7;
        int i8;
        int i9;
        FalconFPR[] falconFPRArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        FalconSmallPrime[] falconSmallPrimeArr;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        FalconKeyGen falconKeyGen = this;
        int i32 = i - i4;
        int i33 = 1 << i32;
        int i34 = i33 >> 1;
        int[] iArr3 = falconKeyGen.MAX_BL_SMALL;
        int i35 = iArr3[i4];
        int i36 = iArr3[i4 + 1];
        int i37 = falconKeyGen.MAX_BL_LARGE[i4];
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        int i38 = i36 * i34;
        int i39 = i5 + i38 + i38;
        int[] iArr4 = iArr;
        int i40 = i33;
        int i41 = i37;
        falconKeyGen.make_fg(iArr4, i39, bArr, i2, bArr2, i3, i, i4, 1);
        int i42 = i40 * i41;
        int i43 = i5 + i42;
        int i44 = i43 + i42;
        System.arraycopy(iArr4, i39, iArr4, i44, i40 * 2 * i35);
        int i45 = i35 * i40;
        int i46 = i44 + i45;
        int i47 = i46 + i45;
        System.arraycopy(iArr4, i5, iArr4, i47, i34 * 2 * i36);
        int i48 = i47 + i38;
        int i49 = 0;
        int i50 = 0;
        while (i50 < i41) {
            int i51 = falconSmallPrimeArr2[i50].p;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i51);
            int modp_R2 = falconKeyGen.modp_R2(i51, modp_ninv31);
            int modp_Rx = falconKeyGen.modp_Rx(i36, i51, modp_ninv31, modp_R2);
            int i52 = i5 + i50;
            int i53 = i43 + i50;
            int i54 = i49;
            int i55 = i44;
            int i56 = i48;
            int i57 = i54;
            int i58 = i47;
            while (true) {
                i29 = i54;
                i30 = i50;
                i31 = i36;
                if (i57 < i34) {
                    int i59 = i58;
                    iArr[i52] = falconKeyGen.zint_mod_small_signed(iArr4, i58, i31, i51, modp_ninv31, modp_R2, modp_Rx);
                    falconKeyGen = this;
                    int i60 = i56;
                    iArr[i53] = falconKeyGen.zint_mod_small_signed(iArr, i60, i31, i51, modp_ninv31, modp_R2, modp_Rx);
                    i57++;
                    int i61 = i59 + i31;
                    i56 = i60 + i31;
                    i52 += i41;
                    i53 += i41;
                    i36 = i31;
                    i50 = i30;
                    i54 = i29;
                    i58 = i61;
                    iArr4 = iArr;
                }
            }
            i44 = i55;
            i49 = i29;
            i36 = i31;
            i50 = i30 + 1;
            iArr4 = iArr;
        }
        int i62 = i44;
        int i63 = i49;
        while (i63 < i41) {
            int i64 = falconSmallPrimeArr2[i63].p;
            int modp_ninv312 = falconKeyGen.modp_ninv31(i64);
            int modp_R22 = falconKeyGen.modp_R2(i64, modp_ninv312);
            if (i63 == i35) {
                i15 = i63;
                i16 = modp_ninv312;
                i17 = modp_R22;
                i19 = i35;
                FalconSmallPrime[] falconSmallPrimeArr3 = falconSmallPrimeArr2;
                int i65 = i40;
                i22 = i64;
                int i66 = i62;
                falconKeyGen.zint_rebuild_CRT(iArr, i66, i19, i35, i65, falconSmallPrimeArr3, 1, iArr, i47);
                i21 = i66;
                zint_rebuild_CRT(iArr, i46, i19, i19, i65, falconSmallPrimeArr3, 1, iArr, i47);
                falconSmallPrimeArr = falconSmallPrimeArr3;
                i18 = i47;
                i20 = i65;
            } else {
                i15 = i63;
                i16 = modp_ninv312;
                i17 = modp_R22;
                i18 = i47;
                i19 = i35;
                falconSmallPrimeArr = falconSmallPrimeArr2;
                i20 = i40;
                i21 = i62;
                i22 = i64;
            }
            int i67 = i18 + i20;
            int i68 = i67 + i20;
            int i69 = i68 + i20;
            int i70 = i18;
            int i71 = i32;
            int i72 = i16;
            int i73 = i19;
            int i74 = i22;
            modp_mkgm2(iArr, i70, iArr, i67, i71, falconSmallPrimeArr[i15].g, i74, i72);
            if (i15 < i73) {
                int i75 = i21 + i15;
                int i76 = i46 + i15;
                int i77 = i75;
                int i78 = i76;
                int i79 = 0;
                while (i79 < i20) {
                    iArr[i68 + i79] = iArr[i77];
                    iArr[i69 + i79] = iArr[i78];
                    i79++;
                    i77 += i73;
                    i78 += i73;
                }
                modp_iNTT2_ext(iArr, i75, i73, iArr, i67, i71, i74, i72);
                modp_iNTT2_ext(iArr, i76, i73, iArr, i67, i71, i74, i72);
                i23 = i67;
                i28 = i72;
                i24 = i70;
                i25 = i68;
                i26 = i69;
                i27 = i71;
            } else {
                FalconKeyGen falconKeyGen2 = this;
                i23 = i67;
                int i80 = i74;
                int modp_Rx2 = falconKeyGen2.modp_Rx(i73, i80, i72, i17);
                int i81 = i21;
                int i82 = i46;
                int i83 = 0;
                while (i83 < i20) {
                    int i84 = i80;
                    int i85 = i72;
                    int i86 = i17;
                    int i87 = i83;
                    int zint_mod_small_signed = falconKeyGen2.zint_mod_small_signed(iArr, i81, i73, i84, i85, i86, modp_Rx2);
                    int i88 = i81;
                    int i89 = modp_Rx2;
                    iArr[i68 + i83] = zint_mod_small_signed;
                    int i90 = i82;
                    iArr[i69 + i87] = zint_mod_small_signed(iArr, i90, i73, i84, i85, i86, i89);
                    i83 = i87 + 1;
                    i82 = i90 + i73;
                    i81 = i88 + i73;
                    i72 = i85;
                    i17 = i86;
                    i80 = i84;
                    modp_Rx2 = i89;
                    falconKeyGen2 = this;
                }
                int i91 = i80;
                int i92 = i72;
                i24 = i70;
                i73 = i73;
                modp_NTT2(iArr, i68, iArr, i24, i71, i91, i92);
                i25 = i68;
                modp_NTT2(iArr, i69, iArr, i24, i71, i91, i92);
                i26 = i69;
                i27 = i71;
                i28 = i92;
                i74 = i91;
            }
            int i93 = i26 + i20;
            int i94 = i93 + i34;
            int i95 = i5 + i15;
            int i96 = i43 + i15;
            int i97 = i95;
            int i98 = i96;
            int i99 = 0;
            while (i99 < i34) {
                iArr[i93 + i99] = iArr[i97];
                iArr[i94 + i99] = iArr[i98];
                i99++;
                i97 += i41;
                i98 += i41;
            }
            int i100 = i74;
            int i101 = i28;
            int i102 = i27 - 1;
            modp_NTT2(iArr, i93, iArr, i24, i102, i100, i101);
            int i103 = i94;
            modp_NTT2(iArr, i103, iArr, i24, i102, i100, i101);
            int i104 = i20;
            i47 = i24;
            int i105 = i95;
            int i106 = i96;
            int i107 = 0;
            while (i107 < i34) {
                int i108 = i107 << 1;
                int i109 = i25 + i108;
                int i110 = i107;
                int i111 = iArr[i109];
                int i112 = i103;
                int i113 = iArr[i109 + 1];
                int i114 = i26 + i108;
                int i115 = i105;
                int i116 = iArr[i114];
                int i117 = iArr[i114 + 1];
                int i118 = i106;
                int modp_montymul = modp_montymul(iArr[i93 + i110], i17, i100, i101);
                int i119 = i27;
                int modp_montymul2 = modp_montymul(iArr[i112 + i110], i17, i100, i101);
                iArr[i115] = modp_montymul(i117, modp_montymul, i100, i101);
                iArr[i115 + i41] = modp_montymul(i116, modp_montymul, i100, i101);
                iArr[i118] = modp_montymul(i113, modp_montymul2, i100, i101);
                iArr[i118 + i41] = modp_montymul(i111, modp_montymul2, i100, i101);
                i107 = i110 + 1;
                int i120 = i41 << 1;
                i105 = i115 + i120;
                i106 = i118 + i120;
                i103 = i112;
                i27 = i119;
            }
            int i121 = i27;
            int i122 = i23;
            modp_iNTT2_ext(iArr, i95, i41, iArr, i122, i121, i100, i101);
            falconKeyGen = this;
            falconKeyGen.modp_iNTT2_ext(iArr, i96, i41, iArr, i122, i121, i100, i101);
            i63 = i15 + 1;
            i35 = i73;
            i62 = i21;
            falconSmallPrimeArr2 = falconSmallPrimeArr;
            i40 = i104;
            i32 = i121;
        }
        int i123 = i32;
        int i124 = i35;
        FalconSmallPrime[] falconSmallPrimeArr4 = falconSmallPrimeArr2;
        int i125 = i40;
        int i126 = i62;
        int i127 = i4;
        zint_rebuild_CRT(iArr, i5, i41, i41, i125, falconSmallPrimeArr4, 1, iArr, i47);
        zint_rebuild_CRT(iArr, i43, i41, i41, i125, falconSmallPrimeArr4, 1, iArr, i47);
        int i128 = i43;
        int i129 = i125;
        FalconFPR[] falconFPRArr2 = new FalconFPR[i129];
        FalconFPR[] falconFPRArr3 = new FalconFPR[i129];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i129];
        FalconFPR[] falconFPRArr5 = new FalconFPR[i34];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i129];
        int i130 = i47;
        int[] iArr5 = new int[i129];
        int i131 = i124 > 10 ? 10 : i124;
        int i132 = (i126 + i124) - i131;
        FalconFPR[] falconFPRArr7 = falconFPRArr2;
        poly_big_to_fp(falconFPRArr3, 0, iArr, i132, i131, i124, i123);
        int i133 = i131;
        poly_big_to_fp(falconFPRArr4, 0, iArr, (i46 + i124) - i133, i133, i124, i123);
        int i134 = i124;
        int i135 = (i134 - i133) * 31;
        int i136 = this.bitlength_avg[i127];
        int i137 = this.bitlength_std[i127];
        int i138 = i136 - (i137 * 6);
        int i139 = (i137 * 6) + i136;
        this.fft.FFT(falconFPRArr3, 0, i123);
        this.fft.FFT(falconFPRArr4, 0, i123);
        FalconKeyGen falconKeyGen3 = this;
        this.fft.poly_invnorm2_fft(falconFPRArr5, 0, falconFPRArr3, 0, falconFPRArr4, 0, i123);
        FalconFPR[] falconFPRArr8 = falconFPRArr3;
        FalconFPR[] falconFPRArr9 = falconFPRArr4;
        int i140 = i123;
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr8, 0, i140);
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr9, 0, i140);
        int i141 = i41 * 31;
        int i142 = i141 - i138;
        int i143 = i41;
        int i144 = 10;
        while (true) {
            int i145 = i140;
            int i146 = i143 > i144 ? i144 : i143;
            int i147 = i144;
            FalconKeyGen falconKeyGen4 = falconKeyGen3;
            FalconFPR[] falconFPRArr10 = falconFPRArr8;
            int i148 = i41;
            FalconFPR[] falconFPRArr11 = falconFPRArr9;
            FalconFPR[] falconFPRArr12 = falconFPRArr6;
            int i149 = i141;
            falconKeyGen4.poly_big_to_fp(falconFPRArr12, 0, iArr, (i5 + i143) - i146, i146, i148, i145);
            int i150 = i146;
            FalconFPR[] falconFPRArr13 = falconFPRArr7;
            poly_big_to_fp(falconFPRArr13, 0, iArr, (i128 + i143) - i150, i150, i148, i145);
            this.fft.FFT(falconFPRArr12, 0, i145);
            this.fft.FFT(falconFPRArr13, 0, i145);
            this.fft.poly_mul_fft(falconFPRArr12, 0, falconFPRArr10, 0, i145);
            this.fft.poly_mul_fft(falconFPRArr13, 0, falconFPRArr11, 0, i145);
            this.fft.poly_add(falconFPRArr13, 0, falconFPRArr12, 0, i145);
            this.fft.poly_mul_autoadj_fft(falconFPRArr13, 0, falconFPRArr5, 0, i145);
            this.fft.iFFT(falconFPRArr13, 0, i145);
            int i151 = (i142 - ((i143 - i146) * 31)) + i135;
            FPREngine fPREngine = this.fpr;
            if (i151 < 0) {
                i151 = -i151;
                falconFPR = fPREngine.fpr_two;
            } else {
                falconFPR = fPREngine.fpr_onehalf;
            }
            FalconFPR falconFPR2 = this.fpr.fpr_one;
            while (i151 != 0) {
                if ((i151 & 1) != 0) {
                    falconFPR2 = this.fpr.fpr_mul(falconFPR2, falconFPR);
                }
                i151 >>= 1;
                falconFPR = this.fpr.fpr_sqr(falconFPR);
            }
            for (int i152 = 0; i152 < i129; i152++) {
                FalconFPR fpr_mul = this.fpr.fpr_mul(falconFPRArr13[i152], falconFPR2);
                FPREngine fPREngine2 = this.fpr;
                if (!fPREngine2.fpr_lt(fPREngine2.fpr_mtwo31m1, fpr_mul)) {
                    return 0;
                }
                FPREngine fPREngine3 = this.fpr;
                if (!fPREngine3.fpr_lt(fpr_mul, fPREngine3.fpr_ptwo31m1)) {
                    return 0;
                }
                iArr5[i152] = (int) this.fpr.fpr_rint(fpr_mul);
            }
            int i153 = i142 / 31;
            int i154 = i143;
            int i155 = i142 % 31;
            if (i127 <= 4) {
                falconFPRArr = falconFPRArr13;
                int i156 = i126;
                i9 = i147;
                i6 = i148;
                int i157 = i134;
                i7 = i129;
                poly_sub_scaled_ntt(iArr, i5, i154, i6, iArr, i156, i157, i134, iArr5, 0, i153, i155, i145, iArr, i130);
                i8 = i156;
                i10 = i145;
                i11 = i128;
                iArr5 = iArr5;
                i12 = i157;
                i13 = i154;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, i11, i13, i6, iArr, i46, i12, i157, iArr5, 0, i153, i155, i10, iArr, i130);
            } else {
                i6 = i148;
                i7 = i129;
                int i158 = i134;
                i8 = i126;
                i9 = i147;
                falconFPRArr = falconFPRArr13;
                poly_sub_scaled(iArr, i5, i154, i6, iArr, i8, i158, i158, iArr5, 0, i153, i155, i145);
                i10 = i145;
                i11 = i128;
                i12 = i158;
                i13 = i154;
                iArr2 = iArr;
                poly_sub_scaled(iArr2, i11, i13, i6, iArr, i46, i12, i158, iArr5, 0, i153, i155, i10);
            }
            int i159 = i13;
            int i160 = i12;
            i140 = i10;
            int i161 = i142 + i139;
            int i162 = i161 + 10;
            if (i162 >= i149) {
                i162 = i149;
            } else if (i159 * 31 >= i161 + 41) {
                i143 = i159 - 1;
                if (i142 > 0) {
                    if (i143 < i160) {
                        int i163 = i5;
                        int i164 = i11;
                        int i165 = 0;
                        i14 = i7;
                        while (i165 < i14) {
                            int i166 = (-(iArr2[(i163 + i143) - 1] >>> 30)) >>> 1;
                            for (int i167 = i143; i167 < i160; i167++) {
                                iArr2[i163 + i167] = i166;
                            }
                            int i168 = (-(iArr2[(i164 + i143) - 1] >>> 30)) >>> 1;
                            for (int i169 = i143; i169 < i160; i169++) {
                                iArr2[i164 + i169] = i168;
                            }
                            i165++;
                            i163 += i6;
                            i164 += i6;
                        }
                    } else {
                        i14 = i7;
                    }
                    int i170 = i5;
                    int i171 = i170;
                    int i172 = 0;
                    while (i172 < (i14 << 1)) {
                        System.arraycopy(iArr2, i170, iArr2, i171, i160);
                        i172++;
                        i171 += i160;
                        i170 += i6;
                    }
                    return 1;
                }
                i129 = i7;
                int i173 = i142 - 25;
                i142 = i173 < 0 ? 0 : i173;
                falconKeyGen3 = this;
                i127 = i4;
                i128 = i11;
                i41 = i6;
                falconFPRArr7 = falconFPRArr;
                i144 = i9;
                i126 = i8;
                falconFPRArr8 = falconFPRArr10;
                falconFPRArr9 = falconFPRArr11;
                falconFPRArr6 = falconFPRArr12;
                i134 = i160;
                i141 = i162;
            }
            i143 = i159;
            if (i142 > 0) {
            }
        }
    }

    public void zint_add_mul_small(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i + i6;
            long unsignedLong = (toUnsignedLong(iArr2[i2 + i6]) * toUnsignedLong(i4)) + toUnsignedLong(iArr[i7]) + toUnsignedLong(i5);
            iArr[i7] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i5 = (int) (unsignedLong >>> 31);
        }
        iArr[i + i3] = i5;
    }

    public void zint_add_scaled_mul_small(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return;
        }
        int i8 = (-(iArr2[(i3 + i4) - 1] >>> 30)) >>> 1;
        int i9 = 0;
        int i10 = i6;
        int i11 = 0;
        while (i10 < i2) {
            int i12 = i10 - i6;
            int i13 = i12 < i4 ? iArr2[i3 + i12] : i8;
            int i14 = i + i10;
            long unsignedLong = (toUnsignedLong(i9 | ((i13 << i7) & Integer.MAX_VALUE)) * i5) + toUnsignedLong(iArr[i14]) + i11;
            iArr[i14] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i11 = (int) (unsignedLong >>> 31);
            i10++;
            i9 = i13 >>> (31 - i7);
        }
    }

    public int zint_bezout(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int[] iArr4, int i4, int i5, int[] iArr5, int i6) {
        FalconKeyGen falconKeyGen = this;
        int i7 = i5;
        int[] iArr6 = iArr5;
        if (i7 == 0) {
            return 0;
        }
        int i8 = i6 + i7;
        int i9 = i8 + i7;
        int i10 = i9 + i7;
        int modp_ninv31 = falconKeyGen.modp_ninv31(iArr3[i3]);
        int modp_ninv312 = falconKeyGen.modp_ninv31(iArr4[i4]);
        System.arraycopy(iArr3, i3, iArr6, i9, i7);
        System.arraycopy(iArr4, i4, iArr6, i10, i7);
        iArr[i] = 1;
        iArr2[i2] = 0;
        for (int i11 = 1; i11 < i7; i11++) {
            iArr[i + i11] = 0;
            iArr2[i2 + i11] = 0;
        }
        System.arraycopy(iArr4, i4, iArr6, i6, i7);
        System.arraycopy(iArr3, i3, iArr6, i8, i7);
        iArr6[i8] = iArr6[i8] - 1;
        int i12 = 30;
        int i13 = (i7 * 62) + 30;
        while (i13 >= i12) {
            int i14 = -1;
            int i15 = i7;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = i15 - 1;
                if (i15 <= 0) {
                    break;
                }
                int i22 = iArr6[i9 + i21];
                int i23 = iArr6[i10 + i21];
                i18 ^= (i18 ^ i22) & i16;
                i17 ^= (i17 ^ i22) & i14;
                i20 ^= (i20 ^ i23) & i16;
                i19 ^= (i19 ^ i23) & i14;
                int i24 = ((((i22 | i23) + Integer.MAX_VALUE) >>> 31) - 1) & i16;
                int i25 = i16;
                i16 = i24;
                i14 = i25;
                i15 = i21;
            }
            int i26 = ~i14;
            int i27 = i18 & i26;
            long unsignedLong = (falconKeyGen.toUnsignedLong(i27) << 31) + falconKeyGen.toUnsignedLong(i17 | (i18 & i14));
            long unsignedLong2 = (falconKeyGen.toUnsignedLong(i20 & i26) << 31) + falconKeyGen.toUnsignedLong(i19 | (i20 & i14));
            int i28 = iArr6[i9];
            int i29 = iArr6[i10];
            long j = 0;
            int i30 = i9;
            int i31 = 0;
            long j2 = 0;
            long j3 = 1;
            long j4 = 1;
            for (int i32 = 31; i31 < i32; i32 = 31) {
                long j5 = unsignedLong2 - unsignedLong;
                int i33 = i31;
                int i34 = (int) ((j5 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j5))) >>> 63);
                int i35 = (i28 >> i33) & 1;
                int i36 = i35 & (i29 >> i33) & 1;
                int i37 = i36 & i34;
                int i38 = i36 & (~i34);
                int i39 = i37 | (i35 ^ 1);
                int i40 = i28 - ((-i37) & i29);
                long j6 = unsignedLong - ((-falconKeyGen.toUnsignedLong(i37)) & unsignedLong2);
                long j7 = -i37;
                long j8 = j3 - (j2 & j7);
                long j9 = j - (j4 & j7);
                int i41 = i29 - ((-i38) & i40);
                long j10 = unsignedLong2 - (j6 & (-falconKeyGen.toUnsignedLong(i38)));
                long j11 = -i38;
                long j12 = j2 - (j8 & j11);
                long j13 = j4 - (j9 & j11);
                i28 = i40 + ((i39 - 1) & i40);
                long j14 = i39;
                long j15 = j14 - 1;
                j3 = j8 + (j8 & j15);
                j = j9 + (j9 & j15);
                unsignedLong = j6 ^ ((j6 ^ (j6 >> 1)) & (-falconKeyGen.toUnsignedLong(i39)));
                i29 = i41 + ((-i39) & i41);
                long j16 = -j14;
                j2 = j12 + (j12 & j16);
                j4 = j13 + (j13 & j16);
                unsignedLong2 = j10 ^ (((j10 >> 1) ^ j10) & (falconKeyGen.toUnsignedLong(i39) - 1));
                i31 = i33 + 1;
                i8 = i8;
            }
            int i42 = i8;
            int i43 = i10;
            long j17 = j;
            long j18 = j2;
            long j19 = j4;
            int zint_co_reduce = falconKeyGen.zint_co_reduce(iArr5, i30, iArr5, i43, i5, j3, j17, j18, j19);
            long j20 = -(zint_co_reduce & 1);
            long j21 = j3 - ((j3 + j3) & j20);
            long j22 = j17 - ((j17 + j17) & j20);
            long j23 = -(zint_co_reduce >>> 1);
            long j24 = j18 - ((j18 + j18) & j23);
            long j25 = j19 - ((j19 + j19) & j23);
            falconKeyGen = this;
            iArr6 = iArr5;
            int i44 = modp_ninv312;
            i7 = i5;
            falconKeyGen.zint_co_reduce_mod(iArr, i, iArr6, i6, iArr4, i4, i7, i44, j21, j22, j24, j25);
            int i45 = modp_ninv31;
            falconKeyGen.zint_co_reduce_mod(iArr2, i2, iArr6, i42, iArr3, i3, i7, i45, j21, j22, j24, j25);
            i13 -= 30;
            modp_ninv312 = i44;
            i12 = 30;
            i9 = i30;
            i8 = i42;
            modp_ninv31 = i45;
            i10 = i43;
        }
        int i46 = i9;
        int i47 = iArr5[i46] ^ 1;
        for (int i48 = 1; i48 < i7; i48++) {
            i47 |= iArr5[i46 + i48];
        }
        return (1 - ((i47 | (-i47)) >>> 31)) & iArr3[i3] & iArr4[i4];
    }

    public int zint_co_reduce(int[] iArr, int i, int[] iArr2, int i2, int i3, long j, long j2, long j3, long j4) {
        long j5 = 0;
        int i4 = 0;
        long j6 = 0;
        while (i4 < i3) {
            int i5 = i + i4;
            int i6 = i2 + i4;
            long j7 = iArr[i5];
            long j8 = iArr2[i6];
            long m = SVG$Unit$EnumUnboxingLocalUtility.m(j8, j2, j7 * j, j6);
            int i7 = i4;
            long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(j8, j4, j7 * j3, j5);
            if (i7 > 0) {
                iArr[i5 - 1] = ((int) m) & Integer.MAX_VALUE;
                iArr2[i6 - 1] = ((int) m2) & Integer.MAX_VALUE;
            }
            j5 = m2 >> 31;
            i4 = i7 + 1;
            j6 = m >> 31;
        }
        long j9 = j5;
        long j10 = j6;
        iArr[(i + i3) - 1] = (int) j10;
        iArr2[(i2 + i3) - 1] = (int) j9;
        int i8 = (int) (j10 >>> 63);
        int i9 = (int) (j9 >>> 63);
        zint_negate(iArr, i, i3, i8);
        zint_negate(iArr2, i2, i3, i9);
        return (i9 << 1) | i8;
    }

    public void zint_co_reduce_mod(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int i4, int i5, long j, long j2, long j3, long j4) {
        FalconKeyGen falconKeyGen = this;
        int i6 = iArr[i];
        int i7 = iArr2[i2];
        int i8 = Integer.MAX_VALUE;
        int m$1 = Fragment$5$$ExternalSyntheticOutline0.m$1(i7, (int) j2, ((int) j) * i6, i5) & Integer.MAX_VALUE;
        int m$12 = Fragment$5$$ExternalSyntheticOutline0.m$1(i7, (int) j4, i6 * ((int) j3), i5) & Integer.MAX_VALUE;
        int i9 = 0;
        long j5 = 0;
        long j6 = 0;
        while (i9 < i4) {
            int i10 = i + i9;
            int i11 = i2 + i9;
            int i12 = i8;
            long j7 = iArr[i10];
            long j8 = j7 * j;
            long j9 = iArr2[i11];
            long m = SVG$Unit$EnumUnboxingLocalUtility.m(iArr3[r14], falconKeyGen.toUnsignedLong(m$1), (j9 * j2) + j8, j5);
            long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(iArr3[i3 + i9], falconKeyGen.toUnsignedLong(m$12), (j9 * j4) + (j7 * j3), j6);
            if (i9 > 0) {
                iArr[i10 - 1] = ((int) m) & i12;
                iArr2[i11 - 1] = ((int) m2) & i12;
            }
            j5 = m >> 31;
            j6 = m2 >> 31;
            i9++;
            falconKeyGen = this;
            i8 = i12;
        }
        long j10 = j5;
        long j11 = j6;
        iArr[(i + i4) - 1] = (int) j10;
        iArr2[(i2 + i4) - 1] = (int) j11;
        zint_finish_mod(iArr, i, i4, iArr3, i3, (int) (j10 >>> 63));
        zint_finish_mod(iArr2, i2, i4, iArr3, i3, (int) (j11 >>> 63));
    }

    public void zint_finish_mod(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = ((iArr[i + i6] - iArr2[i3 + i6]) - i5) >>> 31;
        }
        int i7 = (-i4) >>> 1;
        int i8 = -((1 - i5) | i4);
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i + i9;
            int i11 = (iArr[i10] - ((iArr2[i3 + i9] ^ i7) & i8)) - i4;
            iArr[i10] = Integer.MAX_VALUE & i11;
            i4 = i11 >>> 31;
        }
    }

    public int zint_mod_small_signed(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i, i2, i3, i4, i5), (-(iArr[(i + i2) - 1] >>> 30)) & i6, i3);
    }

    public int zint_mod_small_unsigned(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (true) {
            int i7 = i2 - 1;
            if (i2 <= 0) {
                return i6;
            }
            int modp_montymul = modp_montymul(i6, i5, i3, i4);
            int i8 = iArr[i + i7] - i3;
            i6 = modp_add(modp_montymul, i8 + ((-(i8 >>> 31)) & i3), i3);
            i2 = i7;
        }
    }

    public int zint_mul_small(int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i + i5;
            long unsignedLong = (toUnsignedLong(iArr[i6]) * toUnsignedLong(i3)) + i4;
            iArr[i6] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i4 = (int) (unsignedLong >> 31);
        }
        return i4;
    }

    public void zint_negate(int[] iArr, int i, int i2, int i3) {
        int i4 = (-i3) >>> 1;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i + i5;
            int i7 = (iArr[i6] ^ i4) + i3;
            iArr[i6] = Integer.MAX_VALUE & i7;
            i3 = i7 >>> 31;
        }
    }

    public void zint_norm_zero(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = 0;
        int i5 = i3;
        int i6 = 0;
        while (true) {
            int i7 = i5 - 1;
            if (i5 <= 0) {
                zint_sub(iArr, i, iArr2, i2, i3, i4 >>> 31);
                return;
            }
            int i8 = iArr[i + i7];
            int i9 = iArr2[i2 + i7];
            int i10 = ((i6 << 30) | (i9 >>> 1)) - i8;
            i4 |= ((-(i10 >>> 31)) | ((-i10) >>> 31)) & ((i4 & 1) - 1);
            i5 = i7;
            i6 = i9 & 1;
        }
    }

    public int zint_one_to_plain(int[] iArr, int i) {
        int i2 = iArr[i];
        return i2 | ((1073741824 & i2) << 1);
    }

    public void zint_rebuild_CRT(int[] iArr, int i, int i2, int i3, int i4, FalconSmallPrime[] falconSmallPrimeArr, int i5, int[] iArr2, int i6) {
        FalconKeyGen falconKeyGen = this;
        int i7 = 0;
        iArr2[i6] = falconSmallPrimeArr[0].p;
        int i8 = 1;
        int i9 = i2;
        while (true) {
            int i10 = i8;
            if (i10 >= i9) {
                break;
            }
            FalconSmallPrime falconSmallPrime = falconSmallPrimeArr[i10];
            int i11 = falconSmallPrime.p;
            int i12 = falconSmallPrime.s;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i11);
            int modp_R2 = falconKeyGen.modp_R2(i11, modp_ninv31);
            int i13 = i;
            int i14 = 0;
            while (i14 < i4) {
                int i15 = i11;
                int i16 = modp_ninv31;
                int i17 = modp_R2;
                int modp_montymul = falconKeyGen.modp_montymul(i12, falconKeyGen.modp_sub(iArr[i13 + i10], falconKeyGen.zint_mod_small_unsigned(iArr, i13, i10, i11, modp_ninv31, modp_R2), i15), i15, i16);
                int i18 = i10;
                falconKeyGen.zint_add_mul_small(iArr, i13, iArr2, i6, i18, modp_montymul);
                i14++;
                i13 += i3;
                i10 = i18;
                i11 = i15;
                modp_ninv31 = i16;
                modp_R2 = i17;
            }
            int i19 = i10;
            iArr2[i6 + i19] = falconKeyGen.zint_mul_small(iArr2, i6, i19, i11);
            i8 = i19 + 1;
        }
        int[] iArr3 = iArr2;
        int i20 = i6;
        if (i5 != 0) {
            int i21 = i;
            while (i7 < i4) {
                falconKeyGen.zint_norm_zero(iArr, i21, iArr3, i20, i9);
                i7++;
                i21 += i3;
                falconKeyGen = this;
                i9 = i2;
                iArr3 = iArr2;
                i20 = i6;
            }
        }
    }

    public int zint_sub(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = -i4;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = i + i7;
            int i9 = iArr[i8];
            int i10 = (i9 - iArr2[i2 + i7]) - i6;
            i6 = i10 >>> 31;
            iArr[i8] = i9 ^ (((i10 & Integer.MAX_VALUE) ^ i9) & i5);
        }
        return i6;
    }

    public void zint_sub_scaled(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        if (i4 == 0) {
            return;
        }
        int i7 = (-(iArr2[(i3 + i4) - 1] >>> 30)) >>> 1;
        int i8 = 0;
        int i9 = i5;
        int i10 = 0;
        while (i9 < i2) {
            int i11 = i9 - i5;
            int i12 = i11 < i4 ? iArr2[i11 + i3] : i7;
            int i13 = i + i9;
            int i14 = (iArr[i13] - (i8 | ((i12 << i6) & Integer.MAX_VALUE))) - i10;
            iArr[i13] = i14 & Integer.MAX_VALUE;
            i10 = i14 >>> 31;
            i9++;
            i8 = i12 >>> (31 - i6);
        }
    }
}
