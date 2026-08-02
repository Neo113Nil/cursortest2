package org.bouncycastle.cert.jcajce;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.util.CollectionStore;

/* loaded from: classes9.dex */
public class JcaCRLStore extends CollectionStore {
    public JcaCRLStore(Collection collection) {
        super(convertCRLs(collection));
    }

    private static Collection convertCRLs(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509CRL) {
                try {
                    arrayList.add(new X509CRLHolder(((X509CRL) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CRLException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot read encoding: ")));
                }
            } else {
                arrayList.add((X509CRLHolder) obj);
            }
        }
        return arrayList;
    }
}
