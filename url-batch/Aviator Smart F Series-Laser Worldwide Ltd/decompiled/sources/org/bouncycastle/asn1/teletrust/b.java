package org.bouncycastle.asn1.teletrust;

import androidx.exifinterface.media.ExifInterface;
import com.my.lib.data.ErrorCode;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public interface b {
    public static final o brainpoolP160r1;
    public static final o brainpoolP160t1;
    public static final o brainpoolP192r1;
    public static final o brainpoolP192t1;
    public static final o brainpoolP224r1;
    public static final o brainpoolP224t1;
    public static final o brainpoolP256r1;
    public static final o brainpoolP256t1;
    public static final o brainpoolP320r1;
    public static final o brainpoolP320t1;
    public static final o brainpoolP384r1;
    public static final o brainpoolP384t1;
    public static final o brainpoolP512r1;
    public static final o brainpoolP512t1;
    public static final o ecSign;
    public static final o ecSignWithRipemd160;
    public static final o ecSignWithSha1;
    public static final o ecc_brainpool;
    public static final o ellipticCurve;
    public static final o ripemd128;
    public static final o ripemd160;
    public static final o ripemd256;
    public static final o rsaSignatureWithripemd128;
    public static final o rsaSignatureWithripemd160;
    public static final o rsaSignatureWithripemd256;
    public static final o teleTrusTAlgorithm;
    public static final o teleTrusTRSAsignatureAlgorithm;
    public static final o versionOne;

    static {
        o oVar = new o("1.3.36.3");
        teleTrusTAlgorithm = oVar;
        ripemd160 = oVar.branch("2.1");
        ripemd128 = oVar.branch("2.2");
        ripemd256 = oVar.branch("2.3");
        o branch = oVar.branch("3.1");
        teleTrusTRSAsignatureAlgorithm = branch;
        rsaSignatureWithripemd160 = branch.branch("2");
        rsaSignatureWithripemd128 = branch.branch(ExifInterface.GPS_MEASUREMENT_3D);
        rsaSignatureWithripemd256 = branch.branch("4");
        o branch2 = oVar.branch("3.2");
        ecSign = branch2;
        ecSignWithSha1 = branch2.branch("1");
        ecSignWithRipemd160 = branch2.branch("2");
        o branch3 = oVar.branch("3.2.8");
        ecc_brainpool = branch3;
        o branch4 = branch3.branch("1");
        ellipticCurve = branch4;
        o branch5 = branch4.branch("1");
        versionOne = branch5;
        brainpoolP160r1 = branch5.branch("1");
        brainpoolP160t1 = branch5.branch("2");
        brainpoolP192r1 = branch5.branch(ExifInterface.GPS_MEASUREMENT_3D);
        brainpoolP192t1 = branch5.branch("4");
        brainpoolP224r1 = branch5.branch(ErrorCode.PARAMETER_ERROR);
        brainpoolP224t1 = branch5.branch("6");
        brainpoolP256r1 = branch5.branch("7");
        brainpoolP256t1 = branch5.branch("8");
        brainpoolP320r1 = branch5.branch("9");
        brainpoolP320t1 = branch5.branch("10");
        brainpoolP384r1 = branch5.branch("11");
        brainpoolP384t1 = branch5.branch("12");
        brainpoolP512r1 = branch5.branch("13");
        brainpoolP512t1 = branch5.branch("14");
    }
}
