package kotlin.random;

import androidx.compose.ui.draw.RotateKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.banking.observability.DefaultProtoParsingExceptionFactory;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.investautomator.model.Automation;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class RandomKt {
    public static final String boundsErrorMessage(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void checkRangeBounds(long j, long j2) {
        if (j2 > j) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) boundsErrorMessage(Long.valueOf(j), Long.valueOf(j2)));
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            a$$ExternalSyntheticBUOutline0.m$3("The key length in bytes must be 32.");
            return null;
        }
        long load32 = load32(0, bArr) & 67108863;
        int i = 3;
        long load322 = (load32(3, bArr) >> 2) & 67108611;
        long load323 = (load32(6, bArr) >> 4) & 67092735;
        long load324 = (load32(9, bArr) >> 6) & 66076671;
        long load325 = (load32(12, bArr) >> 8) & 1048575;
        long j = load322 * 5;
        long j2 = load323 * 5;
        long j3 = load324 * 5;
        long j4 = load325 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long load326 = j9 + (load32(0, bArr3) & 67108863);
            long load327 = j5 + ((load32(i, bArr3) >> 2) & 67108863);
            long load328 = j6 + ((load32(6, bArr3) >> 4) & 67108863);
            long load329 = j7 + ((load32(9, bArr3) >> 6) & 67108863);
            long j10 = load322;
            long load3210 = j8 + (((load32(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (load3210 * j) + (load329 * j2) + (load328 * j3) + (load327 * j4) + (load326 * load32);
            long j12 = (load3210 * j2) + (load329 * j3) + (load328 * j4) + (load327 * load32) + (load326 * j10);
            long j13 = (load3210 * j3) + (load329 * j4) + (load328 * load32) + (load327 * j10) + (load326 * load323);
            long j14 = (load3210 * j4) + (load329 * load32) + (load328 * j10) + (load327 * load323) + (load326 * load324);
            long j15 = load329 * j10;
            long j16 = load3210 * load32;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (load328 * load323) + (load327 * load324) + (load326 * load325) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            load322 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & BodyPartID.bodyIdMax;
        long j51 = ((j47 >> 6) | (j48 << 20)) & BodyPartID.bodyIdMax;
        long j52 = ((j48 >> 12) | (j49 << 14)) & BodyPartID.bodyIdMax;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & BodyPartID.bodyIdMax;
        long load3211 = load32(16, bArr) + j50;
        long j54 = load3211 & BodyPartID.bodyIdMax;
        long load3212 = load32(20, bArr) + j51 + (load3211 >> 32);
        long j55 = load3212 & BodyPartID.bodyIdMax;
        long load3213 = load32(24, bArr) + j52 + (load3212 >> 32);
        long j56 = load3213 & BodyPartID.bodyIdMax;
        long load3214 = (load32(28, bArr) + j53 + (load3213 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        toByteArray(bArr4, j54, 0);
        toByteArray(bArr4, j55, 4);
        toByteArray(bArr4, j56, 8);
        toByteArray(bArr4, load3214, 12);
        return bArr4;
    }

    public static final int fastLog2(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static long load32(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & BodyPartID.bodyIdMax;
    }

    public static final int nextInt(Random random, IntRange intRange) {
        random.getClass();
        if (intRange.isEmpty()) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) intRange, "Cannot get random in empty range: ");
            return 0;
        }
        int i = intRange.last;
        int i2 = intRange.first;
        return i < Integer.MAX_VALUE ? random.nextInt(i2, i + 1) : i2 > Integer.MIN_VALUE ? random.nextInt(i2 - 1, i) + 1 : random.nextInt();
    }

    public static final int takeUpperBits(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static void toByteArray(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static final RoundUpsAutomationTarget toTarget(HasObservability hasObservability, Automation.AutomationTarget automationTarget) {
        automationTarget.getClass();
        DefaultProtoParsingExceptionFactory defaultProtoParsingExceptionFactory = DefaultProtoParsingExceptionFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(automationTarget, defaultProtoParsingExceptionFactory, hasObservability);
            Automation.AutomationTarget.Type type2 = automationTarget.f1279type;
            String str = automationTarget.icon_id;
            String str2 = automationTarget.identifier;
            String str3 = automationTarget.display_name;
            ProtoValidationScope.required(type2, "type");
            int ordinal = type2.ordinal();
            if (ordinal == 0) {
                throw new Exception("unsupported type for round ups");
            }
            String str4 = "";
            if (ordinal == 1) {
                ProtoValidationScope.required(str2, "identifier for " + type2);
                String str5 = (String) protoValidationScope.reportIfNullAndContinue("display_name for " + type2, (String) null, str3);
                if (str5 != null) {
                    str4 = str5;
                }
                return new RoundUpsAutomationTarget.InvestmentEntity(str2, str4);
            }
            if (ordinal == 2) {
                String str6 = (String) protoValidationScope.reportIfNullAndContinue("display_name for " + type2, (String) null, str3);
                if (str6 != null) {
                    str4 = str6;
                }
                return new RoundUpsAutomationTarget.CryptoCurrency(str4);
            }
            if (ordinal == 3) {
                String str7 = (String) protoValidationScope.reportIfNullAndContinue("display_name for " + type2, (String) null, str3);
                if (str7 != null) {
                    str4 = str7;
                }
                return new RoundUpsAutomationTarget.SavingsBalance(str4, str);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            String str8 = (String) protoValidationScope.reportIfNullAndContinue("identifier for " + type2, (String) null, str2);
            String str9 = (String) protoValidationScope.reportIfNullAndContinue("display_name for " + type2, (String) null, str3);
            if (str9 != null) {
                str4 = str9;
            }
            String str10 = (String) protoValidationScope.reportIfNullAndContinue("icon_id for " + type2, (String) null, str);
            if (str10 == null) {
                e eVar = Emojis.Companion;
                str10 = "extra_cash";
            }
            return new RoundUpsAutomationTarget.SavingsGoals(str8, str10, str4);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Automation.AutomationTarget.class), defaultProtoParsingExceptionFactory, null);
        }
    }

    public static final void checkRangeBounds(int i, int i2) {
        if (i2 > i) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) boundsErrorMessage(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final void checkRangeBounds(double d, double d2) {
        if (d2 > d) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) boundsErrorMessage(Double.valueOf(d), Double.valueOf(d2)));
    }
}
