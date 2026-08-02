package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzq {
    private static final hkh a = hkh.l("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser");
    private static final kud b = new kud("\\s");

    public bzq(a aVar, dih dihVar) {
        aVar.getClass();
        dihVar.getClass();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:65|(2:67|(1:72)(5:71|37|38|39|(1:41)(2:45|(3:47|48|44)(2:49|(3:51|52|53)))))|73|(2:75|(4:77|38|39|(0)(0)))(1:88)|78|(1:80)|(1:82)|83|84|85|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
    
        r2 = 0;
        ((defpackage.hkf) defpackage.bzq.a.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 184, "CxfParser.kt")).u("Skipping TOTP: Unsupported algorithm: %s.", r8);
        r3 = defpackage.bzn.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0215  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bzs a(String str, brn brnVar) {
        JSONArray optJSONArray;
        JSONArray jSONArray;
        int i;
        int i2;
        JSONArray jSONArray2;
        int i3;
        int i4;
        int i5;
        JSONArray jSONArray3;
        int i6;
        int i7;
        JSONArray jSONArray4;
        int i8;
        kt ktVar;
        String optString;
        bzp bzpVar;
        str.getClass();
        if (ksp.n(str)) {
            throw new bzl("Received blank CXF JSON payload.");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("accounts");
            int i9 = 0;
            if (optJSONArray2 == null) {
                return new bzs(ixc.p(arrayList), 0);
            }
            int length = optJSONArray2.length();
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i10);
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("items")) != null) {
                    int length2 = optJSONArray.length();
                    int i12 = i9;
                    while (i12 < length2) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i12);
                        if (optJSONObject2 != null) {
                            String optString2 = optJSONObject2.optString("title");
                            optString2.getClass();
                            if (optString2.length() <= 0) {
                                optString2 = null;
                            }
                            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("credentials");
                            if (optJSONArray3 != null) {
                                int length3 = optJSONArray3.length();
                                int i13 = i9;
                                while (i13 < length3) {
                                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i13);
                                    if (optJSONObject3 == null) {
                                        jSONArray2 = optJSONArray2;
                                        i3 = length;
                                        i4 = i10;
                                        i5 = i11;
                                        jSONArray3 = optJSONArray;
                                        i6 = length2;
                                        i7 = i12;
                                        jSONArray4 = optJSONArray3;
                                        i8 = length3;
                                    } else if (ksp.b(optJSONObject3.optString("type"), "totp")) {
                                        ?? r12 = brnVar.a;
                                        jSONArray2 = optJSONArray2;
                                        String optString3 = optJSONObject3.optString("secret");
                                        optString3.getClass();
                                        i3 = length;
                                        i4 = i10;
                                        i5 = i11;
                                        if (ksp.n(optString3)) {
                                            ((hkf) a.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 127, "CxfParser.kt")).s("Skipping TOTP: Missing or blank secret.");
                                            ktVar = bzn.a;
                                            jSONArray3 = optJSONArray;
                                            i6 = length2;
                                        } else {
                                            jSONArray3 = optJSONArray;
                                            i6 = length2;
                                            String upperCase = b.a(optString3, "").toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                            try {
                                                hpx.f.h(upperCase);
                                                optString = optJSONObject3.optString("username");
                                                optString.getClass();
                                                if (optString.length() <= 0) {
                                                    optString = null;
                                                }
                                                if (optString == null) {
                                                    optString = "Unknown";
                                                }
                                                bzpVar = new bzp(upperCase, optString2, optString);
                                            } catch (IllegalArgumentException unused) {
                                                i7 = i12;
                                                jSONArray4 = optJSONArray3;
                                                i8 = length3;
                                                i9 = 0;
                                                ((hkf) a.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 136, "CxfParser.kt")).s("Skipping TOTP: Invalid Base32 secret format.");
                                                ktVar = bzn.a;
                                            }
                                            if (r12.contains(bzpVar)) {
                                                ((hkf) a.e().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 145, "CxfParser.kt")).s("Skipping duplicate TOTP credential from CXF payload.");
                                                ktVar = bzm.a;
                                            } else {
                                                r12.add(bzpVar);
                                                i7 = i12;
                                                jSONArray4 = optJSONArray3;
                                                int i14 = 6;
                                                if (optJSONObject3.has("digits")) {
                                                    int optInt = optJSONObject3.optInt("digits");
                                                    if (optInt == 6 || optInt == 8) {
                                                        i14 = optInt;
                                                    } else {
                                                        ((hkf) a.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 161, "CxfParser.kt")).t("Skipping TOTP: Unsupported digit count: %d. Only 6 or 8 digits supported.", optInt);
                                                        ktVar = bzn.a;
                                                        i8 = length3;
                                                        i9 = 0;
                                                        if (!(ktVar instanceof bzo)) {
                                                            arrayList.add(((bzo) ktVar).a);
                                                        } else if (ktVar instanceof bzn) {
                                                            i11 = i5 + 1;
                                                            i13++;
                                                            optJSONArray2 = jSONArray2;
                                                            optJSONArray = jSONArray3;
                                                            length = i3;
                                                            i10 = i4;
                                                            length2 = i6;
                                                            i12 = i7;
                                                            length3 = i8;
                                                            optJSONArray3 = jSONArray4;
                                                        } else if (!(ktVar instanceof bzm)) {
                                                            throw new koj();
                                                        }
                                                    }
                                                }
                                                if (optJSONObject3.has("period")) {
                                                    int optInt2 = optJSONObject3.optInt("period");
                                                    i8 = length3;
                                                    if (optInt2 != 30) {
                                                        ((hkf) a.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/CxfParser", "parseTotpCredential", 174, "CxfParser.kt")).t("Skipping TOTP: Unsupported period: %d. Only 30s period supported.", optInt2);
                                                        ktVar = bzn.a;
                                                        i9 = 0;
                                                        if (!(ktVar instanceof bzo)) {
                                                        }
                                                    }
                                                } else {
                                                    i8 = length3;
                                                }
                                                String optString4 = optJSONObject3.optString("algorithm");
                                                optString4.getClass();
                                                if (optString4.length() <= 0) {
                                                    optString4 = null;
                                                }
                                                if (optString4 == null) {
                                                    optString4 = "SHA1";
                                                }
                                                String upperCase2 = optString4.toUpperCase(Locale.ROOT);
                                                upperCase2.getClass();
                                                String str2 = bpa.a(upperCase2).d;
                                                r12.add(bzpVar);
                                                bpb bpbVar = new bpb();
                                                bpbVar.e(optString);
                                                bpbVar.a = optString2;
                                                bpbVar.g(upperCase);
                                                bpbVar.f("totp");
                                                bpbVar.b = null;
                                                bpbVar.i(a.R());
                                                bpbVar.b(str2);
                                                bpbVar.c(i14);
                                                bpbVar.h(Instant.now().toEpochMilli());
                                                i9 = 0;
                                                bpbVar.d(false);
                                                bpbVar.c = null;
                                                ktVar = new bzo(bpbVar.a());
                                                if (!(ktVar instanceof bzo)) {
                                                }
                                            }
                                        }
                                        i7 = i12;
                                        jSONArray4 = optJSONArray3;
                                        i8 = length3;
                                        i9 = 0;
                                        if (!(ktVar instanceof bzo)) {
                                        }
                                    } else {
                                        jSONArray2 = optJSONArray2;
                                        i3 = length;
                                        i4 = i10;
                                        i5 = i11;
                                        jSONArray3 = optJSONArray;
                                        i6 = length2;
                                        i7 = i12;
                                        jSONArray4 = optJSONArray3;
                                        i8 = length3;
                                        i9 = 0;
                                    }
                                    i11 = i5;
                                    i13++;
                                    optJSONArray2 = jSONArray2;
                                    optJSONArray = jSONArray3;
                                    length = i3;
                                    i10 = i4;
                                    length2 = i6;
                                    i12 = i7;
                                    length3 = i8;
                                    optJSONArray3 = jSONArray4;
                                }
                                jSONArray = optJSONArray2;
                                i = length;
                                i2 = i10;
                                i12++;
                                optJSONArray2 = jSONArray;
                                optJSONArray = optJSONArray;
                                length = i;
                                i10 = i2;
                                length2 = length2;
                            }
                        }
                        jSONArray = optJSONArray2;
                        i = length;
                        i2 = i10;
                        i12++;
                        optJSONArray2 = jSONArray;
                        optJSONArray = optJSONArray;
                        length = i;
                        i10 = i2;
                        length2 = length2;
                    }
                }
                i10++;
                optJSONArray2 = optJSONArray2;
                length = length;
            }
            return new bzs(ixc.p(arrayList), i11);
        } catch (JSONException unused2) {
            throw new bzl("Malformed root CXF JSON structure.");
        }
    }
}
