package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3S {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> SparseArray<T> A00(C1R<T> c1r, SparseArray<Bundle> bundleSparseArray) {
        SparseArray<T> sparseArray = new SparseArray<>(bundleSparseArray.size());
        for (int i = 0; i < bundleSparseArray.size(); i++) {
            int i2 = bundleSparseArray.keyAt(i);
            sparseArray.put(i2, c1r.A6X(bundleSparseArray.valueAt(i)));
        }
        return sparseArray;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC0297Am<T> A01(C1R<T> c1r, List<Bundle> list) {
        C00731h A01 = AbstractC0297Am.A01();
        int i = 0;
        while (true) {
            int size = list.size();
            int i2 = A00[2].length();
            if (i2 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i < size) {
                A01.A04(c1r.A6X((Bundle) C3M.A01(list.get(i))));
                i++;
            } else {
                return A01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC01424a.A0f(C3S.class.getClassLoader()));
        }
    }
}
