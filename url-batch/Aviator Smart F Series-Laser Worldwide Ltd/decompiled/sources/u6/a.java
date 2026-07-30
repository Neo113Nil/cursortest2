package u6;

import androidx.exifinterface.media.ExifInterface;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public interface a {
    public static final o id_tc26;
    public static final o id_tc26_agreement;
    public static final o id_tc26_agreement_gost_3410_12_256;
    public static final o id_tc26_agreement_gost_3410_12_512;
    public static final o id_tc26_gost_28147_param_Z;
    public static final o id_tc26_gost_3410_12_256;
    public static final o id_tc26_gost_3410_12_256_paramSet;
    public static final o id_tc26_gost_3410_12_256_paramSetA;
    public static final o id_tc26_gost_3410_12_512;
    public static final o id_tc26_gost_3410_12_512_paramSet;
    public static final o id_tc26_gost_3410_12_512_paramSetA;
    public static final o id_tc26_gost_3410_12_512_paramSetB;
    public static final o id_tc26_gost_3410_12_512_paramSetC;
    public static final o id_tc26_gost_3411_12_256;
    public static final o id_tc26_gost_3411_12_512;
    public static final o id_tc26_hmac_gost_3411_12_256;
    public static final o id_tc26_hmac_gost_3411_12_512;
    public static final o id_tc26_signwithdigest_gost_3410_12_256;
    public static final o id_tc26_signwithdigest_gost_3410_12_512;
    public static final o rosstandart;

    static {
        o oVar = new o("1.2.643.7");
        rosstandart = oVar;
        o branch = oVar.branch("1");
        id_tc26 = branch;
        id_tc26_gost_3411_12_256 = branch.branch("1.2.2");
        id_tc26_gost_3411_12_512 = branch.branch("1.2.3");
        id_tc26_hmac_gost_3411_12_256 = branch.branch("1.4.1");
        id_tc26_hmac_gost_3411_12_512 = branch.branch(BuildConfig.VERSION_NAME);
        id_tc26_gost_3410_12_256 = branch.branch("1.1.1");
        id_tc26_gost_3410_12_512 = branch.branch("1.1.2");
        id_tc26_signwithdigest_gost_3410_12_256 = branch.branch("1.3.2");
        id_tc26_signwithdigest_gost_3410_12_512 = branch.branch("1.3.3");
        o branch2 = branch.branch("1.6");
        id_tc26_agreement = branch2;
        id_tc26_agreement_gost_3410_12_256 = branch2.branch("1");
        id_tc26_agreement_gost_3410_12_512 = branch2.branch("2");
        o branch3 = branch.branch("2.1.1");
        id_tc26_gost_3410_12_256_paramSet = branch3;
        id_tc26_gost_3410_12_256_paramSetA = branch3.branch("1");
        o branch4 = branch.branch("2.1.2");
        id_tc26_gost_3410_12_512_paramSet = branch4;
        id_tc26_gost_3410_12_512_paramSetA = branch4.branch("1");
        id_tc26_gost_3410_12_512_paramSetB = branch4.branch("2");
        id_tc26_gost_3410_12_512_paramSetC = branch4.branch(ExifInterface.GPS_MEASUREMENT_3D);
        id_tc26_gost_28147_param_Z = branch.branch("2.5.1.1");
    }
}
