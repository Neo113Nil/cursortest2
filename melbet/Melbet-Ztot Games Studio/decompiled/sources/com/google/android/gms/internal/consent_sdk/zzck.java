package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes3.dex */
public final class zzck {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzg = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fa, code lost:
    
        if (r1.equals("CONSENT_SIGNAL_UNKNOWN") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r1.equals("UNKNOWN") == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzck zza(JsonReader jsonReader) throws IOException {
        char c;
        char c2;
        char c3;
        int i;
        zzck zzckVar = new zzck();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = 4;
            int i3 = 3;
            char c4 = 0;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String nextString = jsonReader.nextString();
                    switch (nextString.hashCode()) {
                        case -2058725357:
                            if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1969035850:
                            if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1263695752:
                            break;
                        case -954325659:
                            if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -918677260:
                            if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 429411856:
                            if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 467888915:
                            if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1725474845:
                            if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            i2 = 1;
                            zzckVar.zzf = i2;
                            break;
                        case 1:
                            i2 = 2;
                            zzckVar.zzf = i2;
                            break;
                        case 2:
                            i2 = 3;
                            zzckVar.zzf = i2;
                            break;
                        case 3:
                            zzckVar.zzf = i2;
                            break;
                        case 4:
                            i2 = 5;
                            zzckVar.zzf = i2;
                            break;
                        case 5:
                            i2 = 6;
                            zzckVar.zzf = i2;
                            break;
                        case 6:
                            i2 = 7;
                            zzckVar.zzf = i2;
                            break;
                        case 7:
                            i2 = 8;
                            zzckVar.zzf = i2;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(String.valueOf(nextString)));
                    }
                case 1:
                    zzckVar.zza = jsonReader.nextString();
                    break;
                case 2:
                    zzckVar.zzb = jsonReader.nextString();
                    break;
                case 3:
                    zzckVar.zzc = jsonReader.nextString();
                    break;
                case 4:
                    zzckVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzckVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case 5:
                    zzckVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcj zzcjVar = new zzcj();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    c2 = 0;
                                }
                                c2 = 65535;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    c2 = 1;
                                }
                                c2 = 65535;
                            }
                            if (c2 == 0) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c3 = 2;
                                        if (c3 != 0) {
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c3 = 0;
                                        if (c3 != 0) {
                                            i = 1;
                                        } else if (c3 == 1) {
                                            i = 2;
                                        } else {
                                            if (c3 != 2) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(String.valueOf(nextString2)));
                                            }
                                            i = 3;
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c3 = 1;
                                        if (c3 != 0) {
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                }
                            } else if (c2 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzcjVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzckVar.zze.add(zzcjVar);
                    }
                    jsonReader.endArray();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 == -1888946261) {
                        if (nextString3.equals("NOT_REQUIRED")) {
                            c4 = 2;
                            if (c4 == 0) {
                            }
                            zzckVar.zzg = i3;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                        }
                        zzckVar.zzg = i3;
                    } else if (hashCode3 != 389487519) {
                        if (hashCode3 == 433141802) {
                            break;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                            i3 = 1;
                        } else if (c4 == 1) {
                            i3 = 2;
                        } else if (c4 != 2) {
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(String.valueOf(nextString3)));
                        }
                        zzckVar.zzg = i3;
                        break;
                    } else {
                        if (nextString3.equals("REQUIRED")) {
                            c4 = 1;
                            if (c4 == 0) {
                            }
                            zzckVar.zzg = i3;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                        }
                        zzckVar.zzg = i3;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzckVar;
    }
}
