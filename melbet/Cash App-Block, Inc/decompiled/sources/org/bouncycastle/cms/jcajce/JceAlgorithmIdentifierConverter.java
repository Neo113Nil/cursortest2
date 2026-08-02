package org.bouncycastle.cms.jcajce;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes9.dex */
public class JceAlgorithmIdentifierConverter {
    private EnvelopedDataHelper helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    private SecureRandom random;

    public AlgorithmParameters getAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) {
        String str;
        if (algorithmIdentifier.getParameters() == null) {
            return null;
        }
        try {
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
            CMSUtils.loadParameters(createAlgorithmParameters, algorithmIdentifier.getParameters());
            return createAlgorithmParameters;
        } catch (NoSuchAlgorithmException e) {
            e = e;
            str = "can't find parameters for algorithm";
            f$$ExternalSyntheticLambda0.m(e, str);
            return null;
        } catch (NoSuchProviderException e2) {
            e = e2;
            str = "can't find provider for algorithm";
            f$$ExternalSyntheticLambda0.m(e, str);
            return null;
        }
    }

    public JceAlgorithmIdentifierConverter setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceAlgorithmIdentifierConverter setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }
}
