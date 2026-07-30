package q6;

import com.my.lib.data.ErrorCode;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public class a {
    public static final o cryptlib;
    public static final o curvey25519;
    public static final o ecc;

    static {
        o oVar = new o("1.3.6.1.4.1.3029");
        cryptlib = oVar;
        o branch = oVar.branch("1").branch(ErrorCode.PARAMETER_ERROR);
        ecc = branch;
        curvey25519 = branch.branch("1");
    }
}
