package w6;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.d;

/* loaded from: classes5.dex */
public interface b {
    Set getAcceptableNamedCurves();

    Map getAdditionalECParameters();

    DHParameterSpec getDHDefaultParameters(int i8);

    DSAParameterSpec getDSADefaultParameters(int i8);

    d getEcImplicitlyCa();
}
