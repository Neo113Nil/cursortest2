package w6;

import java.util.Map;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public interface a {
    public static final String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";
    public static final String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";
    public static final String DH_DEFAULT_PARAMS = "DhDefaultParams";
    public static final String EC_IMPLICITLY_CA = "ecImplicitlyCa";
    public static final String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
    public static final String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";

    void addAlgorithm(String str, String str2);

    void addAlgorithm(String str, o oVar, String str2);

    void addAttributes(String str, Map<String, String> map);

    void addKeyInfoConverter(o oVar, x6.b bVar);

    x6.b getKeyInfoConverter(o oVar);

    boolean hasAlgorithm(String str, String str2);

    void setParameter(String str, Object obj);
}
