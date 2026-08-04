package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.facebook.common.util.UriUtil;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfcj {
    public final zzbxc zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfdf zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtc zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbvt zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfco zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v119, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v195, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List] */
    zzfcj(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgjz.zzi();
        zzgjz zzi = zzgjz.zzi();
        HashMap hashMap = new HashMap();
        zzgjz zzi2 = zzgjz.zzi();
        zzgjz zzi3 = zzgjz.zzi();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzgjz zzgjzVar = zzi;
        HashMap hashMap2 = hashMap;
        zzgjz zzgjzVar2 = zzi2;
        zzgjz zzgjzVar3 = zzi3;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i7 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        double d = 0.0d;
        zzfco zzfcoVar = null;
        zzbxc zzbxcVar = null;
        zzbtc zzbtcVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        int i8 = 0;
        int i9 = 0;
        zzbvt zzbvtVar = null;
        String str20 = str19;
        String str21 = str20;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_name")) {
                        str14 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_signals")) {
                        jSONObject7 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("omid_settings")) {
                        jSONObject9 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1964744830:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("offline_ad_config")) {
                        if (((Boolean) zzbci.zzjq.zzg()).booleanValue()) {
                            zzwVar = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("recursive_server_response_data")) {
                        str17 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_consent")) {
                        z18 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1840512279:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_urls")) {
                        zzgjzVar2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1828733410:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("network_ping_config")) {
                        if (((Boolean) zzbci.zzjo.zzg()).booleanValue()) {
                            zzvVar = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("play_prewarm_options")) {
                        zzbtcVar = zzbtc.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("parallel_key")) {
                        str19 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_name")) {
                        str12 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_interscroller")) {
                        z12 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("backend_query_id")) {
                        str9 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (!str22.equals("nofill_urls")) {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        emptyList9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        break;
                    }
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_custom_close_blocked")) {
                        z6 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("orientation")) {
                        i = zze(jsonReader.nextString());
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("enable_omid")) {
                        z8 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        z16 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("showable_impression_type")) {
                        i6 = jsonReader.nextInt();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_cover")) {
                        jSONObject10 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_sizes")) {
                        list6 = zzfck.zza(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapters")) {
                        list5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("test_mode_enabled")) {
                        z5 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("extras")) {
                        jSONObject8 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_event_value")) {
                        zztVar = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        z = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_urls")) {
                        emptyList10 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_type")) {
                        i9 = zzc(jsonReader.nextString());
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_scroll_aware")) {
                        z10 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("fill_urls")) {
                        emptyList8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allocation_id")) {
                        str2 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_complete_urls")) {
                        emptyList7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("active_view")) {
                        str5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("valid_from_timestamp")) {
                        str20 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_id")) {
                        str15 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("click_urls")) {
                        emptyList2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -652881372:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("on_device_storage_configs")) {
                        if (((Boolean) zzbci.zzio.zzg()).booleanValue()) {
                            zzgjzVar3 = zzdtq.zza(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("late_load_urls")) {
                        zzgjzVar = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("safe_browsing")) {
                        zzbxcVar = zzbxc.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("imp_urls")) {
                        emptyList3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rtb_native_required_assets")) {
                        jSONObject11 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_timeout_ms")) {
                        i5 = jsonReader.nextInt();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_close_time_ms")) {
                        i2 = jsonReader.nextInt();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("content_url")) {
                        str = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        z15 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("watermark")) {
                        str8 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("native_required_asset_viewability")) {
                        z14 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_offline_ad")) {
                        z13 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_custom_click_gesture")) {
                        z3 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad")) {
                        zzfcoVar = new zzfco(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList10 = list2;
                        emptyList9 = list;
                    }
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("id")) {
                        str3 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals(UriUtil.DATA_SCHEME)) {
                        jSONObject12 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("request_id")) {
                        str16 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_test_label")) {
                        z4 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("qdata")) {
                        str4 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_load_urls")) {
                        emptyList4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_closable_area_disabled")) {
                        z7 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("consent_form_action_identifier")) {
                        i7 = jsonReader.nextInt();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        i4 = jsonReader.nextInt();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_dialog_string")) {
                        str6 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("container_sizes")) {
                        list4 = zzfck.zza(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("impression_type")) {
                        i8 = zzd(jsonReader.nextInt());
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 805095541:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) zzbci.zzat.zzg()).booleanValue()) {
                            hashMap2 = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("transaction_id")) {
                        str21 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rewards")) {
                        zzbvtVar = zzbvt.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_response_info_key")) {
                        str18 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("cache_hit_urls")) {
                        com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1303622534:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("preload_sort_value")) {
                        d = jsonReader.nextDouble();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        z2 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1422388341:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_collapsible")) {
                        z17 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_id")) {
                        str13 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1556932485:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) zzbci.zznG.zzg()).booleanValue()) {
                            i3 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1565514205:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_only_third_party_impression")) {
                        z21 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("bid_response")) {
                        str7 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_start_urls")) {
                        emptyList5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_network_class_name")) {
                        str11 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_reward_urls")) {
                        emptyList6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("use_third_party_container_height")) {
                        z11 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("renderers")) {
                        emptyList = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        z9 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rule_line_external_id")) {
                        str10 = jsonReader.nextString();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 2072888499:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("manual_tracking_urls")) {
                        list3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 2075506442:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_serially")) {
                        z19 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                case 2117205836:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str22.equals("flow_control")) {
                        z20 = jsonReader.nextBoolean();
                        emptyList10 = list2;
                        emptyList9 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i9;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzf = emptyList4;
        this.zze = i8;
        this.zzg = emptyList5;
        this.zzh = emptyList6;
        this.zzi = emptyList7;
        this.zzj = str21;
        this.zzk = str20;
        this.zzl = zzbvtVar;
        this.zzm = emptyList8;
        this.zzn = emptyList9;
        this.zzo = emptyList10;
        this.zzp = list3;
        this.zzq = i4;
        this.zzr = list4;
        this.zzs = zzfcoVar;
        this.zzt = list5;
        this.zzu = list6;
        this.zzw = str2;
        this.zzv = jSONObject12;
        this.zzx = str3;
        this.zzy = str4;
        this.zzz = str5;
        this.zzA = zzbxcVar;
        this.zzB = str6;
        this.zzC = jSONObject7;
        this.zzD = jSONObject8;
        this.zzJ = z;
        this.zzK = z2;
        this.zzL = z3;
        this.zzM = z4;
        this.zzN = z5;
        this.zzO = z6;
        this.zzP = z7;
        this.zzQ = i;
        this.zzR = i5;
        this.zzT = z8;
        this.zzU = str7;
        this.zzV = new zzfdf(jSONObject9);
        this.zzW = z9;
        this.zzX = z10;
        this.zzY = i6;
        this.zzZ = str8;
        this.zzaa = i2;
        this.zzab = str9;
        this.zzac = z11;
        this.zzad = zzbtcVar;
        this.zzae = zztVar;
        this.zzaf = str10;
        this.zzag = z12;
        this.zzah = jSONObject10;
        this.zzE = str11;
        this.zzF = str12;
        this.zzG = str13;
        this.zzH = str14;
        this.zzI = str15;
        this.zzai = z13;
        this.zzaj = jSONObject11;
        this.zzak = z14;
        this.zzal = str;
        this.zzam = z15;
        this.zzS = z16;
        this.zzan = str16;
        this.zzao = str17;
        this.zzap = str18;
        this.zzaq = z17;
        this.zzar = z18;
        this.zzas = i7;
        this.zzau = zzgjzVar;
        this.zzat = str19;
        this.zzav = z19;
        this.zzaw = hashMap2;
        this.zzax = zzvVar;
        this.zzay = zzwVar;
        this.zzaz = d;
        this.zzaA = zzgjzVar2;
        this.zzaB = z20;
        this.zzaC = zzgjzVar3;
        this.zzaD = z21;
        this.zzaE = i3;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    private static int zze(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
