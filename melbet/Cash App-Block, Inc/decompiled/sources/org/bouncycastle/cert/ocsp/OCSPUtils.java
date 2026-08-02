package org.bouncycastle.cert.ocsp;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: classes9.dex */
class OCSPUtils {
    static final X509CertificateHolder[] EMPTY_CERTS = new X509CertificateHolder[0];
    static Set EMPTY_SET = Collections.unmodifiableSet(new HashSet());
    static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());

    public static Date extractDate(ASN1GeneralizedTime aSN1GeneralizedTime) {
        try {
            return aSN1GeneralizedTime.getDate();
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m$1(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception processing GeneralizedTime: ")));
            return null;
        }
    }

    public static Set getCriticalExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList(extensions.getCriticalExtensionOIDs())));
    }

    public static List getExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_LIST : Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    public static Set getNonCriticalExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList(extensions.getNonCriticalExtensionOIDs())));
    }
}
