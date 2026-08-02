package org.bouncycastle.cert.jcajce;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.CollectionStore;

/* loaded from: classes9.dex */
public class JcaCertStore extends CollectionStore {
    public JcaCertStore(Collection collection) {
        super(convertCerts(collection));
    }

    private static Collection convertCerts(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new X509CertificateHolder(((X509Certificate) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CertificateEncodingException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to read encoding: ")));
                }
            } else {
                arrayList.add((X509CertificateHolder) obj);
            }
        }
        return arrayList;
    }
}
