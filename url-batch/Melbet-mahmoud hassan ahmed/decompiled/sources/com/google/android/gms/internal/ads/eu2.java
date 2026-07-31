package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class eu2 implements du2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f4769a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eu2(kv kvVar, String str, int i7, String str2, vv vvVar) {
        String string;
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i7));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(kvVar.f7644g));
        }
        if (!hashSet.contains("extras")) {
            string = hashSet.contains("npa") ? kvVar.f7645h.getString("npa") : string;
            if (hashSet.contains("gender")) {
                arrayList.add(Integer.valueOf(kvVar.f7646i));
            }
            if (hashSet.contains("keywords")) {
                List<String> list = kvVar.f7647j;
                if (list != null) {
                    arrayList.add(list.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("isTestDevice")) {
                arrayList.add(Boolean.valueOf(kvVar.f7648k));
            }
            if (hashSet.contains("tagForChildDirectedTreatment")) {
                arrayList.add(Integer.valueOf(kvVar.f7649l));
            }
            if (hashSet.contains("manualImpressionsEnabled")) {
                arrayList.add(Boolean.valueOf(kvVar.f7650m));
            }
            if (hashSet.contains("publisherProvidedId")) {
                arrayList.add(kvVar.f7651n);
            }
            if (hashSet.contains("location")) {
                Location location = kvVar.f7653p;
                if (location != null) {
                    arrayList.add(location.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("contentUrl")) {
                arrayList.add(kvVar.f7654q);
            }
            if (hashSet.contains("networkExtras")) {
                arrayList.add(a(kvVar.f7655r));
            }
            if (hashSet.contains("customTargeting")) {
                arrayList.add(a(kvVar.f7656s));
            }
            if (hashSet.contains("categoryExclusions")) {
                List<String> list2 = kvVar.f7657t;
                if (list2 != null) {
                    arrayList.add(list2.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("requestAgent")) {
                arrayList.add(kvVar.f7658u);
            }
            if (hashSet.contains("requestPackage")) {
                arrayList.add(kvVar.f7659v);
            }
            if (hashSet.contains("isDesignedForFamilies")) {
                arrayList.add(Boolean.valueOf(kvVar.f7660w));
            }
            if (hashSet.contains("tagForUnderAgeOfConsent")) {
                arrayList.add(Integer.valueOf(kvVar.f7662y));
            }
            if (hashSet.contains("maxAdContentRating")) {
                arrayList.add(kvVar.f7663z);
            }
            if (hashSet.contains("orientation")) {
                if (vvVar != null) {
                    arrayList.add(Integer.valueOf(vvVar.f13509f));
                } else {
                    arrayList.add(null);
                }
            }
            this.f4769a = arrayList.toArray();
        }
        string = a(kvVar.f7645h);
        arrayList.add(string);
        if (hashSet.contains("gender")) {
        }
        if (hashSet.contains("keywords")) {
        }
        if (hashSet.contains("isTestDevice")) {
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
        }
        if (hashSet.contains("publisherProvidedId")) {
        }
        if (hashSet.contains("location")) {
        }
        if (hashSet.contains("contentUrl")) {
        }
        if (hashSet.contains("networkExtras")) {
        }
        if (hashSet.contains("customTargeting")) {
        }
        if (hashSet.contains("categoryExclusions")) {
        }
        if (hashSet.contains("requestAgent")) {
        }
        if (hashSet.contains("requestPackage")) {
        }
        if (hashSet.contains("isDesignedForFamilies")) {
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
        }
        if (hashSet.contains("maxAdContentRating")) {
        }
        if (hashSet.contains("orientation")) {
        }
        this.f4769a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.du2
    public final boolean equals(Object obj) {
        if (obj instanceof eu2) {
            return Arrays.equals(this.f4769a, ((eu2) obj).f4769a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.du2
    public final int hashCode() {
        return Arrays.hashCode(this.f4769a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f4769a);
        String arrays = Arrays.toString(this.f4769a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
