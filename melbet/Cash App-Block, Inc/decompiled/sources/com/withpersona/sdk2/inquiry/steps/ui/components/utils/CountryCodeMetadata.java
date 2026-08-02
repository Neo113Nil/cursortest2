package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CountryCodeMetadata {
    public final String countryCode;
    public final String defaultFlagEmoji;
    public final String pattern;
    public final String prefix;

    public CountryCodeMetadata(String str, String str2, String str3, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        this.prefix = str;
        this.countryCode = str2;
        this.pattern = str3;
        this.defaultFlagEmoji = "🌐";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryCodeMetadata)) {
            return false;
        }
        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) obj;
        return this.prefix.equals(countryCodeMetadata.prefix) && this.countryCode.equals(countryCodeMetadata.countryCode) && Intrinsics.areEqual(this.pattern, countryCodeMetadata.pattern) && this.defaultFlagEmoji.equals(countryCodeMetadata.defaultFlagEmoji);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prefix.hashCode() * 31, 31, this.countryCode);
        String str = this.pattern;
        return this.defaultFlagEmoji.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CountryCodeMetadata(prefix=", this.prefix, ", countryCode=", this.countryCode, ", pattern="), this.pattern, ", defaultFlagEmoji=", this.defaultFlagEmoji, ")");
    }
}
