package com.squareup.cash.util.legal;

import okhttp3.HttpUrl;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class LegalUrl {
    public static final String ESign;
    public static final String InvestingDisclosures;
    public static final String Privacy;
    public static final String Savings;
    public static final String SpanishTermsOfService;
    public static final String TermsOfService;
    public static final String TermsOfServiceCashAppGreen;
    public static final String TermsOfServiceOffers;

    static {
        LegalUrl legalUrl = new LegalUrl();
        create$default(legalUrl, "card-agreement", null, 11);
        create$default(legalUrl, "bitcoin-disclosures", null, 11);
        create$default(legalUrl, "ecbsv", null, 11);
        ESign = create$default(legalUrl, "sign", null, 11);
        InvestingDisclosures = create$default(legalUrl, "disclosures-in-app", null, 11);
        Privacy = create$default(legalUrl, "privacy", null, 11);
        Savings = create$default(legalUrl, "savings", null, 11);
        SpanishTermsOfService = create$default(legalUrl, "cash-en-espanol-general-terms-conditions", null, 11);
        TermsOfService = create$default(legalUrl, "tos", null, 11);
        TermsOfServiceCashAppGreen = create$default(legalUrl, "tos", "cag", 3);
        create$default(legalUrl, "tos", "neighborhoods-on-cash-app", 3);
        TermsOfServiceOffers = create$default(legalUrl, "tos", "offers", 3);
    }

    public static String create$default(LegalUrl legalUrl, String str, String str2, int i) {
        String str3 = (i & 8) != 0 ? null : str2;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.parse$okhttp(null, "https://cash.app/legal/");
        HttpUrl.Builder newBuilder = builder.build().newBuilder();
        newBuilder.addPathSegment(str);
        if (str3 != null) {
            newBuilder.encodedFragment = _UrlKt.canonicalize$default(0, 0, 59, str3, "", false);
        }
        return newBuilder.build().url;
    }
}
