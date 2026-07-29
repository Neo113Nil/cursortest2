package com.google.ads.consent;

import com.google.gson.a.c;
import java.util.HashSet;

/* loaded from: classes.dex */
class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.6";

    @c(a = "consent_source")
    private String consentSource;

    @c(a = "providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();

    @c(a = "consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();

    @c(a = "pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();

    @c(a = "tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = false;

    @c(a = "consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;

    @c(a = "is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;

    @c(a = "has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;

    @c(a = "version")
    private final String sdkVersionString = SDK_VERSION;

    @c(a = "plat")
    private final String sdkPlatformString = "android";

    @c(a = "raw_response")
    private String rawResponse = "";

    ConsentData() {
    }

    HashSet<AdProvider> a() {
        return this.adProviders;
    }

    void a(HashSet<AdProvider> hashSet) {
        this.adProviders = hashSet;
    }

    ConsentStatus b() {
        return this.consentStatus;
    }

    void a(ConsentStatus consentStatus) {
        this.consentStatus = consentStatus;
    }

    void b(HashSet<String> hashSet) {
        this.publisherIds = hashSet;
    }

    boolean c() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    void a(boolean z) {
        this.isRequestLocationInEeaOrUnknown = z;
    }

    HashSet<AdProvider> d() {
        return this.consentedAdProviders;
    }

    void c(HashSet<AdProvider> hashSet) {
        this.consentedAdProviders = hashSet;
    }

    boolean e() {
        return this.hasNonPersonalizedPublisherId;
    }

    void b(boolean z) {
        this.hasNonPersonalizedPublisherId = z;
    }

    public String f() {
        return this.sdkVersionString;
    }

    public String g() {
        return this.sdkPlatformString;
    }

    public void a(String str) {
        this.consentSource = str;
    }

    void b(String str) {
        this.rawResponse = str;
    }
}
