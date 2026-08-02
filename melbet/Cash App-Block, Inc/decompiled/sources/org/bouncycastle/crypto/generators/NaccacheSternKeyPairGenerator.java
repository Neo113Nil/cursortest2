package org.bouncycastle.crypto.generators;

import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 151, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 167, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 211, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 239, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC0170g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC0170g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, HttpStatusCode.UNAUTHORIZED_401, HttpStatusCode.CONFLICT_409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger createRandomPrime;
        do {
            createRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (createRandomPrime.bitLength() != i);
        return createRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int nextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = nextInt % i;
        } while ((i - 1) + (nextInt - i2) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f7, code lost:
    
        r10 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fb, code lost:
    
        r24 = r1;
     */
    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger generatePrime;
        BigInteger add;
        BigInteger generatePrime2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger add2;
        boolean z;
        BigInteger multiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        long j;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        int i;
        PrintStream printStream;
        StringBuilder sb;
        int i2;
        BigInteger createRandomPrime;
        SecureRandom secureRandom;
        int i3;
        SecureRandom secureRandom2;
        int i4;
        BigInteger bigInteger9;
        BigInteger bigInteger10;
        int i5;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean isDebug = this.param.isDebug();
        if (isDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector permuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigInteger11 = ONE;
        BigInteger bigInteger12 = bigInteger11;
        for (int i6 = 0; i6 < permuteList.size() / 2; i6++) {
            bigInteger12 = bigInteger12.multiply((BigInteger) permuteList.elementAt(i6));
        }
        for (int size = permuteList.size() / 2; size < permuteList.size(); size++) {
            bigInteger11 = bigInteger11.multiply((BigInteger) permuteList.elementAt(size));
        }
        BigInteger multiply2 = bigInteger12.multiply(bigInteger11);
        int bitLength = (((strength - multiply2.bitLength()) - 48) / 2) + 1;
        BigInteger generatePrime3 = generatePrime(bitLength, certainty, random);
        BigInteger generatePrime4 = generatePrime(bitLength, certainty, random);
        if (isDebug) {
            System.out.println("generating p and q");
        }
        BigInteger shiftLeft = generatePrime3.multiply(bigInteger12).shiftLeft(1);
        BigInteger shiftLeft2 = generatePrime4.multiply(bigInteger11).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j2++;
            int i7 = 24;
            generatePrime = generatePrime(24, certainty, random);
            add = generatePrime.multiply(shiftLeft).add(ONE);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    generatePrime2 = generatePrime(i7, certainty, random);
                    if (!generatePrime.equals(generatePrime2)) {
                        BigInteger multiply3 = generatePrime2.multiply(shiftLeft2);
                        bigInteger = shiftLeft2;
                        bigInteger2 = ONE;
                        add2 = multiply3.add(bigInteger2);
                        if (add2.isProbablePrime(certainty)) {
                            break;
                        }
                        shiftLeft2 = bigInteger;
                        i7 = 24;
                    }
                }
                z = isDebug;
                if (BigIntegers.modOddIsCoprime(generatePrime.multiply(generatePrime2), multiply2)) {
                    BigInteger bigInteger13 = shiftLeft;
                    multiply = add.multiply(add2);
                    bigInteger3 = bigInteger13;
                    if (multiply.bitLength() >= strength) {
                        break;
                    }
                    int i8 = strength;
                    secureRandom2 = random;
                    i4 = certainty;
                    bigInteger9 = generatePrime3;
                    bigInteger10 = generatePrime4;
                    if (z) {
                        PrintStream printStream2 = System.out;
                        i5 = i8;
                        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i5, "key size too small. Should be ", " but is actually ");
                        m2m.append(add.multiply(add2).bitLength());
                        printStream2.println(m2m.toString());
                    } else {
                        i5 = i8;
                    }
                    generatePrime3 = bigInteger9;
                    strength = i5;
                    generatePrime4 = bigInteger10;
                    shiftLeft2 = bigInteger;
                    isDebug = z;
                    shiftLeft = bigInteger3;
                    random = secureRandom2;
                    certainty = i4;
                } else {
                    secureRandom2 = random;
                    i4 = certainty;
                }
            } else {
                bigInteger = shiftLeft2;
                secureRandom2 = random;
                i4 = certainty;
                z = isDebug;
            }
            bigInteger3 = shiftLeft;
            bigInteger10 = generatePrime4;
            bigInteger9 = generatePrime3;
            i5 = strength;
            generatePrime3 = bigInteger9;
            strength = i5;
            generatePrime4 = bigInteger10;
            shiftLeft2 = bigInteger;
            isDebug = z;
            shiftLeft = bigInteger3;
            random = secureRandom2;
            certainty = i4;
        }
        BigInteger bigInteger14 = generatePrime4;
        if (z) {
            bigInteger4 = generatePrime3;
            System.out.println("needed " + j2 + " tries to generate p and q.");
        } else {
            bigInteger4 = generatePrime3;
        }
        BigInteger multiply4 = add.subtract(bigInteger2).multiply(add2.subtract(bigInteger2));
        if (z) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger5 = add2;
            j = j3;
            int i9 = 0;
            while (i9 != permuteList.size()) {
                BigInteger divide = multiply4.divide((BigInteger) permuteList.elementAt(i9));
                while (true) {
                    j++;
                    i2 = i9;
                    createRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i3 = certainty;
                    if (createRandomPrime.modPow(divide, multiply).equals(ONE)) {
                        i9 = i2;
                        random = secureRandom;
                        certainty = i3;
                    }
                }
                vector.addElement(createRandomPrime);
                i9 = i2 + 1;
                random = secureRandom;
                certainty = i3;
            }
            SecureRandom secureRandom3 = random;
            int i10 = certainty;
            bigInteger6 = ONE;
            for (int i11 = 0; i11 < permuteList.size(); i11++) {
                bigInteger6 = bigInteger6.multiply(((BigInteger) vector.elementAt(i11)).modPow(multiply2.divide((BigInteger) permuteList.elementAt(i11)), multiply)).mod(multiply);
            }
            int i12 = 0;
            while (true) {
                if (i12 >= permuteList.size()) {
                    BigInteger modPow = bigInteger6.modPow(multiply4.divide(BigInteger.valueOf(4L)), multiply);
                    BigInteger bigInteger15 = ONE;
                    if (!modPow.equals(bigInteger15)) {
                        if (!bigInteger6.modPow(multiply4.divide(generatePrime), multiply).equals(bigInteger15)) {
                            if (!bigInteger6.modPow(multiply4.divide(generatePrime2), multiply).equals(bigInteger15)) {
                                bigInteger7 = bigInteger4;
                                if (!bigInteger6.modPow(multiply4.divide(bigInteger7), multiply).equals(bigInteger15)) {
                                    bigInteger8 = bigInteger14;
                                    if (!bigInteger6.modPow(multiply4.divide(bigInteger8), multiply).equals(bigInteger15)) {
                                        break;
                                    }
                                    if (z) {
                                        i = strength;
                                        System.out.println("g has order phi(n)/b\n g: " + bigInteger6);
                                    }
                                } else {
                                    if (z) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigInteger6);
                                    }
                                    bigInteger8 = bigInteger14;
                                }
                            } else if (z) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb.append(bigInteger6);
                                printStream.println(sb.toString());
                            }
                        } else if (z) {
                            printStream = System.out;
                            sb = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb.append(bigInteger6);
                            printStream.println(sb.toString());
                        }
                    } else if (z) {
                        printStream = System.out;
                        sb = new StringBuilder("g has order phi(n)/4\n g:");
                        sb.append(bigInteger6);
                        printStream.println(sb.toString());
                    }
                } else if (!bigInteger6.modPow(multiply4.divide((BigInteger) permuteList.elementAt(i12)), multiply).equals(ONE)) {
                    i12++;
                } else if (z) {
                    System.out.println("g has order phi(n)/" + permuteList.elementAt(i12) + "\n g: " + bigInteger6);
                }
            }
            bigInteger4 = bigInteger7;
            j3 = j;
            strength = i;
            random = secureRandom3;
            certainty = i10;
            bigInteger14 = bigInteger8;
            add2 = bigInteger5;
        }
        if (z) {
            System.out.println("needed " + j + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + permuteList);
            System.out.println("sigma:...... " + multiply2 + " (" + multiply2.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb2 = new StringBuilder("a:.......... ");
            sb2.append(bigInteger7);
            printStream3.println(sb2.toString());
            System.out.println("b:.......... " + bigInteger8);
            System.out.println("p':......... " + generatePrime);
            System.out.println("q':......... " + generatePrime2);
            System.out.println("p:.......... " + add);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + multiply);
            System.out.println("phi(n):..... " + multiply4);
            System.out.println("g:.......... " + bigInteger6);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigInteger6, multiply, multiply2.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigInteger6, multiply, multiply2.bitLength(), permuteList, multiply4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
