package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaa extends zzi<zzaa> {
    private ProductAction zzrd;
    private final List<Product> zzrg = new ArrayList();
    private final List<Promotion> zzrf = new ArrayList();
    private final Map<String, List<Product>> zzre = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zzrg.isEmpty()) {
            hashMap.put("products", this.zzrg);
        }
        if (!this.zzrf.isEmpty()) {
            hashMap.put("promotions", this.zzrf);
        }
        if (!this.zzre.isEmpty()) {
            hashMap.put("impressions", this.zzre);
        }
        hashMap.put("productAction", this.zzrd);
        return zza((Object) hashMap);
    }

    public final ProductAction zzat() {
        return this.zzrd;
    }

    public final List<Product> zzau() {
        return Collections.unmodifiableList(this.zzrg);
    }

    public final Map<String, List<Product>> zzav() {
        return this.zzre;
    }

    public final List<Promotion> zzaw() {
        return Collections.unmodifiableList(this.zzrf);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzaa zzaaVar) {
        zzaa zzaaVar2 = zzaaVar;
        zzaaVar2.zzrg.addAll(this.zzrg);
        zzaaVar2.zzrf.addAll(this.zzrf);
        for (Map.Entry<String, List<Product>> entry : this.zzre.entrySet()) {
            String key = entry.getKey();
            for (Product product : entry.getValue()) {
                if (product != null) {
                    String str = key == null ? "" : key;
                    if (!zzaaVar2.zzre.containsKey(str)) {
                        zzaaVar2.zzre.put(str, new ArrayList());
                    }
                    zzaaVar2.zzre.get(str).add(product);
                }
            }
        }
        if (this.zzrd != null) {
            zzaaVar2.zzrd = this.zzrd;
        }
    }
}
