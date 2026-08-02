package com.squareup.util.android;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public abstract class PhoneNumbers {
    public static final int NANP_COUNTRY_CODE;
    public static final Regex NON_DIGITS;

    /* renamed from: utils, reason: collision with root package name */
    public static final PhoneNumberUtil f1416utils;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Format {
        public static final /* synthetic */ Format[] $VALUES;
        public static final Format INTERNATIONAL;
        public static final Format NATIONAL;

        static {
            Format format2 = new Format("NATIONAL", 0);
            NATIONAL = format2;
            Format format3 = new Format("INTERNATIONAL", 1);
            INTERNATIONAL = format3;
            $VALUES = new Format[]{format2, format3};
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }
    }

    static {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        f1416utils = phoneNumberUtil;
        NANP_COUNTRY_CODE = phoneNumberUtil.getCountryCodeForRegion("US");
        NON_DIGITS = new Regex("[^0-9+]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r1.getCountryCodeForRegion(r5) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String format(String str, String str2, Format format2) {
        Phonenumber$PhoneNumber parse;
        str2.getClass();
        PhoneNumberUtil phoneNumberUtil = f1416utils;
        if (str != null) {
            try {
                parse = phoneNumberUtil.parse(str, str2);
            } catch (NumberParseException unused) {
            }
            if (parse == null && isValid(parse)) {
                int i = 3;
                if (format2 == null) {
                    int i2 = parse.countryCode_;
                    int i3 = NANP_COUNTRY_CODE;
                    if (i2 == i3) {
                    }
                    i = 2;
                    return phoneNumberUtil.format(parse, i);
                }
                int ordinal = format2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = 2;
                }
                return phoneNumberUtil.format(parse, i);
            }
        }
        parse = null;
        return parse == null ? str : str;
    }

    public static final String getCountryCallingCode(String str) {
        str.getClass();
        int countryCodeForRegion = f1416utils.getCountryCodeForRegion(str);
        if (countryCodeForRegion != 0) {
            return String.valueOf(countryCodeForRegion);
        }
        return null;
    }

    public static final String getRegionFromNumber(String str, String str2) {
        String regionCodeForNumber;
        str.getClass();
        str2.getClass();
        try {
            PhoneNumberUtil phoneNumberUtil = f1416utils;
            regionCodeForNumber = phoneNumberUtil.getRegionCodeForNumber(phoneNumberUtil.parse(str, str2));
        } catch (NumberParseException unused) {
        }
        return regionCodeForNumber == null ? str2 : regionCodeForNumber;
    }

    public static boolean isValid(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (!phonenumber$PhoneNumber.hasCountryCode) {
            return false;
        }
        PhoneNumberUtil phoneNumberUtil = f1416utils;
        phoneNumberUtil.getClass();
        String nationalSignificantNumber = PhoneNumberUtil.getNationalSignificantNumber(phonenumber$PhoneNumber);
        int i = phonenumber$PhoneNumber.countryCode_;
        if ((!phoneNumberUtil.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i)) ? 3 : PhoneNumberUtil.testNumberLength(nationalSignificantNumber, phoneNumberUtil.getMetadataForRegionOrCallingCode(i, phoneNumberUtil.getRegionCodeForCountryCode(i)), 12)) != 1) {
            return false;
        }
        if (phonenumber$PhoneNumber.countryCode_ != NANP_COUNTRY_CODE) {
            if (!(phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForNumber(phonenumber$PhoneNumber)) == null ? true : !phoneNumberUtil.isNumberMatchingDesc(PhoneNumberUtil.getNationalSignificantNumber(phonenumber$PhoneNumber), r1.noInternationalDialling_))) {
                return false;
            }
        }
        return true;
    }

    public static final String normalize(String str, String str2, boolean z) {
        String replace;
        String str3 = "";
        if (str != null && (replace = NON_DIGITS.replace(str, "")) != null && replace.length() > 0) {
            String replace$default = StringsKt__StringsJVMKt.replace$default(replace.substring(1), Marker.ANY_NON_NULL_MARKER, "");
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((CharSequence) replace, Marker.ANY_NON_NULL_MARKER, 0, false, 6);
            if (indexOf$default != -1) {
                replace = kotlin.text.StringsKt.replaceRange(replace, indexOf$default + 1, replace.length(), replace$default).toString();
            }
            str3 = replace;
        }
        try {
            PhoneNumberUtil phoneNumberUtil = f1416utils;
            Phonenumber$PhoneNumber parse = phoneNumberUtil.parse(str3, str2);
            if (!isValid(parse)) {
                return null;
            }
            if (parse.countryCode_ != NANP_COUNTRY_CODE || z) {
                return phoneNumberUtil.format(parse, 1);
            }
            String l = Long.toString(parse.nationalNumber_, CharsKt.checkRadix(10));
            l.getClass();
            return l;
        } catch (NumberParseException unused) {
            return null;
        }
    }

    public static final boolean isValid(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            return isValid(f1416utils.parse(str, str2));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public static final String normalize(String str) {
        return normalize(str, "US", false);
    }

    public static final String normalize(String str, String str2) {
        if (str2 == null) {
            str2 = "US";
        }
        return normalize(str, str2, !f1416utils.nanpaRegions.contains(str2));
    }
}
