package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzot {
    static final ImmutableList zza = ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static int zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static String zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final Map zzc(ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        com.google.android.gms.internal.measurement.zzkl zzklVar;
        Object obj;
        com.google.android.gms.internal.measurement.zzkl zzklVar2;
        Object obj2;
        com.google.android.gms.internal.measurement.zzkl zzklVar3 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar3);
        com.google.android.gms.internal.measurement.zzkl zzklVar4 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar2 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar4);
        com.google.android.gms.internal.measurement.zzkl zzklVar5 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkm zzkmVar3 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar5);
        com.google.android.gms.internal.measurement.zzkl zzklVar6 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar4 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar6);
        ImmutableMap.Builder putAll = ImmutableMap.builder().put("Version", "2").put("VendorConsent", true != z4 ? "0" : "1").put("VendorLegitimateInterest", true != z5 ? "0" : "1").put("gdprApplies", i6 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i5 != 1 ? "0" : "1").put("PolicyVersion", String.valueOf(i7)).put("CmpSdkID", String.valueOf(i4)).put("PurposeOneTreatment", i8 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", String.valueOf(zzkmVar != null ? zzkmVar.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", String.valueOf(zzkmVar2 != null ? zzkmVar2.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", String.valueOf(zzkmVar3 != null ? zzkmVar3.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", String.valueOf(zzkmVar4 != null ? zzkmVar4.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(ImmutableMap.of("Purpose1", zzg(zzklVar3, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5), "Purpose3", zzg(zzklVar4, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5), "Purpose4", zzg(zzklVar5, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5), "Purpose7", zzg(zzklVar6, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5)));
        if (true != zzd(zzklVar3, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5)) {
            zzklVar = zzklVar4;
            obj = "0";
        } else {
            zzklVar = zzklVar4;
            obj = "1";
        }
        if (true != zzd(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5)) {
            zzklVar2 = zzklVar5;
            obj2 = "0";
        } else {
            zzklVar2 = zzklVar5;
            obj2 = "1";
        }
        return putAll.putAll(ImmutableMap.of("AuthorizePurpose1", (String) obj, "AuthorizePurpose3", (String) obj2, "AuthorizePurpose4", (String) (true != zzd(zzklVar2, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5) ? "0" : "1"), "AuthorizePurpose7", true != zzd(zzklVar6, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).buildOrThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean zzd(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        int i9;
        int i10;
        int i11;
        boolean z6;
        boolean z7;
        String str4;
        String str5;
        String str6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char[] cArr2;
        ImmutableSet immutableSet2;
        ImmutableMap immutableMap3;
        ImmutableMap immutableMap4;
        com.google.android.gms.internal.measurement.zzkl zzklVar2;
        ImmutableSet immutableSet3;
        String str7;
        zzos zzosVar;
        char c4;
        int zze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5);
        if (zze > 0) {
            i10 = i6;
            if (i10 == 1) {
                i9 = i5;
                if (i9 == 1) {
                    zzklVar2 = zzklVar;
                    immutableMap3 = immutableMap2;
                    immutableSet2 = immutableSet;
                    cArr2 = cArr;
                    i16 = i4;
                    i13 = i7;
                    i12 = i8;
                    str6 = str;
                    str5 = str2;
                    str4 = str3;
                    z7 = z4;
                    z6 = z5;
                    i15 = 1;
                    i14 = 1;
                    i11 = zze;
                    immutableMap4 = immutableMap;
                    if (zzf(zzklVar2, immutableMap4, immutableMap3, immutableSet2, cArr2, i16, i15, i14, i13, i12, str6, str5, str4, z7, z6) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                        c4 = '3';
                    } else {
                        int i17 = i8;
                        if (zzklVar2 == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                            immutableSet3 = immutableSet;
                            str7 = str;
                            if (i17 == 1) {
                                if (immutableSet3.contains(str7)) {
                                    if (i11 > 0 && cArr[i11] != '2') {
                                        cArr[i11] = '1';
                                    }
                                    return true;
                                }
                                i17 = 1;
                            }
                        } else {
                            immutableSet3 = immutableSet;
                            str7 = str;
                        }
                        if (immutableMap4.containsKey(zzklVar2) && (zzosVar = (zzos) immutableMap4.get(zzklVar2)) != null) {
                            int ordinal = zzosVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        return zzf(zzklVar2, immutableMap4, immutableMap2, immutableSet3, cArr, i4, i15, i14, i7, i17, str7, str2, str3, z4, z5) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5) : zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5);
                                    }
                                    if (ordinal == 3) {
                                        return zzf(zzklVar2, immutableMap4, immutableMap2, immutableSet3, cArr, i4, i15, i14, i7, i17, str7, str2, str3, z4, z5) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5) : zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5);
                                    }
                                } else if (zzf(zzklVar2, immutableMap4, immutableMap2, immutableSet3, cArr, i4, i15, i14, i7, i17, str7, str2, str3, z4, z5) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5);
                                }
                            } else if (zzf(zzklVar2, immutableMap4, immutableMap2, immutableSet3, cArr, i4, i15, i14, i7, i17, str7, str2, str3, z4, z5) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                return zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i15, i14, i7, i17, str, str2, str3, z4, z5);
                            }
                            c4 = '8';
                        }
                        c4 = '0';
                    }
                    if (i11 <= 0 && cArr[i11] != '2') {
                        cArr[i11] = c4;
                        return false;
                    }
                }
                i10 = 1;
            } else {
                i9 = i5;
            }
            cArr[zze] = '2';
        } else {
            i9 = i5;
            i10 = i6;
        }
        zzklVar2 = zzklVar;
        immutableMap4 = immutableMap;
        cArr2 = cArr;
        i16 = i4;
        i13 = i7;
        i12 = i8;
        str6 = str;
        str5 = str2;
        str4 = str3;
        z7 = z4;
        z6 = z5;
        i14 = i10;
        i15 = i9;
        i11 = zze;
        immutableMap3 = immutableMap2;
        immutableSet2 = immutableSet;
        if (zzf(zzklVar2, immutableMap4, immutableMap3, immutableSet2, cArr2, i16, i15, i14, i13, i12, str6, str5, str4, z7, z6) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED) {
        }
        return i11 <= 0 ? false : false;
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final com.google.android.gms.internal.measurement.zzkm zzf(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        return (com.google.android.gms.internal.measurement.zzkm) immutableMap2.getOrDefault(zzklVar, com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final String zzg(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < zzklVar.zza()) ? "0" : String.valueOf(str2.charAt(zzklVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzklVar.zza()) {
            str4 = String.valueOf(str3.charAt(zzklVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        char c4;
        int zze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5);
        if (!z4) {
            c4 = '4';
        } else {
            if (str2.length() >= zzklVar.zza()) {
                char charAt = str2.charAt(zzklVar.zza() - 1);
                boolean z6 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '6' : '1';
                }
                return z6;
            }
            c4 = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c4;
        }
        return false;
    }

    private static final boolean zzi(com.google.android.gms.internal.measurement.zzkl zzklVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z4, boolean z5) {
        char c4;
        int zze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i4, i5, i6, i7, i8, str, str2, str3, z4, z5);
        if (!z5) {
            c4 = '5';
        } else {
            if (str3.length() >= zzklVar.zza()) {
                char charAt = str3.charAt(zzklVar.zza() - 1);
                boolean z6 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '7' : '1';
                }
                return z6;
            }
            c4 = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c4;
        }
        return false;
    }
}
