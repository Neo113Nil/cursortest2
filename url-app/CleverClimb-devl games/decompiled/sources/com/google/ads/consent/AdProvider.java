package com.google.ads.consent;

import com.google.gson.a.c;

/* loaded from: classes.dex */
public class AdProvider {

    @c(a = "company_id")
    private String id;

    @c(a = "company_name")
    private String name;

    @c(a = "policy_url")
    private String privacyPolicyUrlString;

    public String a() {
        return this.id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdProvider adProvider = (AdProvider) obj;
        return this.id.equals(adProvider.id) && this.name.equals(adProvider.name) && this.privacyPolicyUrlString.equals(adProvider.privacyPolicyUrlString);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.privacyPolicyUrlString.hashCode();
    }
}
