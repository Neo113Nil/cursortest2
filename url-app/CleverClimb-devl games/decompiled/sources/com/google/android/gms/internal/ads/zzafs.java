package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.umeng.analytics.pro.b;
import com.umeng.commonsdk.proguard.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzadh
/* loaded from: classes2.dex */
public final class zzafs {
    private static final SimpleDateFormat zzcho = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[Catch: JSONException -> 0x026a, TryCatch #0 {JSONException -> 0x026a, blocks: (B:3:0x0003, B:5:0x0026, B:8:0x002f, B:10:0x0037, B:12:0x003f, B:14:0x0047, B:16:0x004f, B:17:0x0053, B:19:0x0069, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:30:0x00de, B:33:0x00e4, B:37:0x00f2, B:38:0x00f7, B:42:0x0105, B:43:0x010a, B:47:0x0118, B:48:0x0121, B:52:0x012f, B:54:0x013a, B:56:0x013e, B:57:0x0142, B:59:0x014a, B:60:0x0150, B:62:0x015e, B:63:0x0169, B:68:0x012b, B:70:0x0114, B:71:0x0101, B:72:0x00ee, B:74:0x0096, B:76:0x009e), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: JSONException -> 0x026a, TryCatch #0 {JSONException -> 0x026a, blocks: (B:3:0x0003, B:5:0x0026, B:8:0x002f, B:10:0x0037, B:12:0x003f, B:14:0x0047, B:16:0x004f, B:17:0x0053, B:19:0x0069, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:30:0x00de, B:33:0x00e4, B:37:0x00f2, B:38:0x00f7, B:42:0x0105, B:43:0x010a, B:47:0x0118, B:48:0x0121, B:52:0x012f, B:54:0x013a, B:56:0x013e, B:57:0x0142, B:59:0x014a, B:60:0x0150, B:62:0x015e, B:63:0x0169, B:68:0x012b, B:70:0x0114, B:71:0x0101, B:72:0x00ee, B:74:0x0096, B:76:0x009e), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e A[Catch: JSONException -> 0x026a, TryCatch #0 {JSONException -> 0x026a, blocks: (B:3:0x0003, B:5:0x0026, B:8:0x002f, B:10:0x0037, B:12:0x003f, B:14:0x0047, B:16:0x004f, B:17:0x0053, B:19:0x0069, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:30:0x00de, B:33:0x00e4, B:37:0x00f2, B:38:0x00f7, B:42:0x0105, B:43:0x010a, B:47:0x0118, B:48:0x0121, B:52:0x012f, B:54:0x013a, B:56:0x013e, B:57:0x0142, B:59:0x014a, B:60:0x0150, B:62:0x015e, B:63:0x0169, B:68:0x012b, B:70:0x0114, B:71:0x0101, B:72:0x00ee, B:74:0x0096, B:76:0x009e), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaej zza(Context context, zzaef zzaefVar, String str) {
        int i;
        int zzrl;
        String str2;
        String str3;
        zzaej zzaejVar;
        long j;
        long j2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_slot_size", optString3);
            boolean z = (zzaefVar == null || zzaefVar.zzcdb == 0) ? false : true;
            String optString5 = jSONObject.optString("ad_json", null);
            if (optString5 == null) {
                optString5 = jSONObject.optString("ad_html", null);
            }
            if (optString5 == null) {
                optString5 = jSONObject.optString("body", null);
            }
            if (optString5 == null && jSONObject.has("ads")) {
                optString5 = jSONObject.toString();
            }
            String optString6 = jSONObject.optString("debug_dialog", null);
            String optString7 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1L;
            String optString8 = jSONObject.optString("orientation", null);
            if (TJAdUnitConstants.String.PORTRAIT.equals(optString8)) {
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrm();
            } else {
                if (!TJAdUnitConstants.String.LANDSCAPE.equals(optString8)) {
                    i = -1;
                    if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString2)) {
                        str2 = optString;
                        str3 = optString5;
                        zzaejVar = null;
                        j = -1;
                    } else {
                        zzaejVar = zzafn.zza(zzaefVar, context, zzaefVar.zzacr.zzcw, optString2, null, null, null, null, null);
                        String str4 = zzaejVar.zzbyq;
                        String str5 = zzaejVar.zzceo;
                        j = zzaejVar.zzceu;
                        str3 = str5;
                        str2 = str4;
                    }
                    if (str3 != null) {
                        return new zzaej(0);
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
                    List<String> list = zzaejVar == null ? null : zzaejVar.zzbsn;
                    if (optJSONArray != null) {
                        list = zza(optJSONArray, list);
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
                    List<String> list2 = zzaejVar == null ? null : zzaejVar.zzbso;
                    if (optJSONArray2 != null) {
                        list2 = zza(optJSONArray2, list2);
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("downloaded_impression_urls");
                    List<String> list3 = zzaejVar == null ? null : zzaejVar.zzbsp;
                    List<String> zza = optJSONArray3 != null ? zza(optJSONArray3, list3) : list3;
                    JSONArray optJSONArray4 = jSONObject.optJSONArray("manual_impression_urls");
                    List<String> list4 = zzaejVar == null ? null : zzaejVar.zzces;
                    List<String> zza2 = optJSONArray4 != null ? zza(optJSONArray4, list4) : list4;
                    if (zzaejVar != null) {
                        if (zzaejVar.orientation != -1) {
                            i = zzaejVar.orientation;
                        }
                        if (zzaejVar.zzcep > 0) {
                            j2 = zzaejVar.zzcep;
                            String optString9 = jSONObject.optString("active_view");
                            boolean optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                            String optString10 = !optBoolean ? jSONObject.optString("ad_passback_url", null) : null;
                            boolean optBoolean2 = jSONObject.optBoolean("mediation", false);
                            boolean optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                            boolean optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                            boolean optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                            boolean optBoolean6 = jSONObject.optBoolean("prefetch", false);
                            long optLong = jSONObject.optLong("refresh_interval_milliseconds", -1L);
                            long optLong2 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
                            String optString11 = jSONObject.optString("gws_query_id", "");
                            boolean equals = "height".equals(jSONObject.optString("fluid", ""));
                            boolean optBoolean7 = jSONObject.optBoolean("native_express", false);
                            List<String> zza3 = zza(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
                            List<String> zza4 = zza(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
                            return new zzaej(zzaefVar, str2, str3, list, list2, j2, optBoolean2, optLong2, zza2, optLong, i, optString3, j, optString6, optBoolean, optString10, optString9, optBoolean3, z, zzaefVar.zzcdd, optBoolean4, optBoolean6, optString11, equals, optBoolean7, zzaig.zza(jSONObject.optJSONArray("rewards")), zza3, zza4, jSONObject.optBoolean("use_displayed_impression", false), zzael.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaefVar.zzcdr, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", zzaefVar.zzbss), optString4, zzaiq.zzo(jSONObject.optJSONObject("safe_browsing")), optString7, optBoolean5, zzaefVar.zzced, jSONObject.optBoolean("custom_close_blocked"), 0, jSONObject.optBoolean("enable_omid", false), zza, jSONObject.optBoolean("disable_closable_area", false), jSONObject.optString("omid_settings", null));
                        }
                    }
                    j2 = j3;
                    String optString92 = jSONObject.optString("active_view");
                    boolean optBoolean8 = jSONObject.optBoolean("ad_is_javascript", false);
                    if (!optBoolean8) {
                    }
                    boolean optBoolean22 = jSONObject.optBoolean("mediation", false);
                    boolean optBoolean32 = jSONObject.optBoolean("custom_render_allowed", false);
                    boolean optBoolean42 = jSONObject.optBoolean("content_url_opted_out", true);
                    boolean optBoolean52 = jSONObject.optBoolean("content_vertical_opted_out", true);
                    boolean optBoolean62 = jSONObject.optBoolean("prefetch", false);
                    long optLong3 = jSONObject.optLong("refresh_interval_milliseconds", -1L);
                    long optLong22 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
                    String optString112 = jSONObject.optString("gws_query_id", "");
                    boolean equals2 = "height".equals(jSONObject.optString("fluid", ""));
                    boolean optBoolean72 = jSONObject.optBoolean("native_express", false);
                    List<String> zza32 = zza(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
                    List<String> zza42 = zza(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
                    return new zzaej(zzaefVar, str2, str3, list, list2, j2, optBoolean22, optLong22, zza2, optLong3, i, optString3, j, optString6, optBoolean8, optString10, optString92, optBoolean32, z, zzaefVar.zzcdd, optBoolean42, optBoolean62, optString112, equals2, optBoolean72, zzaig.zza(jSONObject.optJSONArray("rewards")), zza32, zza42, jSONObject.optBoolean("use_displayed_impression", false), zzael.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaefVar.zzcdr, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", zzaefVar.zzbss), optString4, zzaiq.zzo(jSONObject.optJSONObject("safe_browsing")), optString7, optBoolean52, zzaefVar.zzced, jSONObject.optBoolean("custom_close_blocked"), 0, jSONObject.optBoolean("enable_omid", false), zza, jSONObject.optBoolean("disable_closable_area", false), jSONObject.optString("omid_settings", null));
                }
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrl();
            }
            i = zzrl;
            if (TextUtils.isEmpty(optString5)) {
            }
            str2 = optString;
            str3 = optString5;
            zzaejVar = null;
            j = -1;
            if (str3 != null) {
            }
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzakb.zzdk(valueOf.length() != 0 ? "Could not parse the inline ad response: ".concat(valueOf) : new String("Could not parse the inline ad response: "));
            return new zzaej(0);
        }
    }

    private static List<String> zza(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x024e A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0259 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0601 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x061e A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x062a A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0670 A[Catch: JSONException -> 0x091c, TRY_LEAVE, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x069c A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06be A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06cf A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06f5 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x070d A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x071c A[Catch: JSONException -> 0x091c, TRY_LEAVE, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0747 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07bf A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07e9 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0821 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x082c A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0854 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0861 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0894 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x08c5 A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08ee A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x064c A[Catch: JSONException -> 0x091c, TryCatch #3 {JSONException -> 0x091c, blocks: (B:3:0x000c, B:5:0x0028, B:6:0x0035, B:8:0x0039, B:9:0x0040, B:11:0x0048, B:12:0x004d, B:14:0x0055, B:15:0x0067, B:17:0x006b, B:18:0x0072, B:20:0x0077, B:21:0x0082, B:23:0x0086, B:24:0x008d, B:26:0x0091, B:27:0x009c, B:29:0x00a1, B:31:0x00b3, B:32:0x00b9, B:34:0x00c2, B:36:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00dc, B:42:0x00e3, B:44:0x00e8, B:46:0x00ec, B:47:0x00f3, B:49:0x00f8, B:51:0x00fc, B:52:0x0103, B:54:0x0107, B:55:0x010e, B:57:0x0112, B:58:0x0119, B:60:0x011e, B:62:0x0122, B:63:0x0129, B:65:0x012e, B:66:0x0139, B:68:0x013f, B:70:0x014e, B:71:0x018c, B:73:0x0192, B:74:0x0199, B:76:0x01a0, B:77:0x01a7, B:79:0x01ad, B:81:0x01bb, B:85:0x01f6, B:86:0x01c3, B:88:0x01c9, B:89:0x01ce, B:91:0x01d2, B:92:0x01dc, B:94:0x01e9, B:95:0x01f3, B:97:0x01f1, B:98:0x01da, B:101:0x01fd, B:103:0x0203, B:104:0x020b, B:106:0x0210, B:107:0x0215, B:109:0x021b, B:112:0x0243, B:114:0x024e, B:115:0x0255, B:117:0x0259, B:118:0x0264, B:125:0x027b, B:126:0x0236, B:127:0x0238, B:131:0x0280, B:133:0x0284, B:135:0x028c, B:136:0x0292, B:138:0x0298, B:149:0x02a5, B:144:0x02ac, B:140:0x02b0, B:143:0x02b7, B:151:0x02be, B:153:0x02c4, B:154:0x02ce, B:156:0x02e0, B:157:0x02ea, B:159:0x02ee, B:160:0x0305, B:162:0x0319, B:163:0x0326, B:165:0x0373, B:166:0x037a, B:168:0x0385, B:169:0x038f, B:171:0x0393, B:172:0x039f, B:174:0x03c4, B:175:0x03cb, B:177:0x03db, B:178:0x03e6, B:180:0x0454, B:181:0x0473, B:183:0x048b, B:185:0x04e1, B:186:0x0544, B:187:0x054d, B:189:0x055f, B:190:0x0566, B:192:0x0595, B:194:0x0599, B:195:0x05a8, B:197:0x05ae, B:198:0x05bc, B:199:0x05c0, B:201:0x05d1, B:203:0x05e6, B:204:0x05fc, B:206:0x0601, B:207:0x0608, B:209:0x060d, B:211:0x0611, B:213:0x061e, B:214:0x0625, B:216:0x062a, B:217:0x0648, B:218:0x066b, B:220:0x0670, B:222:0x068c, B:228:0x0687, B:229:0x0697, B:231:0x069c, B:232:0x06a3, B:234:0x06a9, B:236:0x06b1, B:237:0x06b8, B:239:0x06be, B:240:0x06c9, B:242:0x06cf, B:243:0x06da, B:245:0x06e0, B:247:0x06e4, B:248:0x06ef, B:250:0x06f5, B:253:0x0700, B:254:0x06fd, B:255:0x0707, B:257:0x070d, B:258:0x0718, B:260:0x071c, B:262:0x0738, B:268:0x0733, B:269:0x0743, B:271:0x0747, B:272:0x0752, B:274:0x07bf, B:275:0x07c6, B:277:0x07cc, B:279:0x07d0, B:280:0x07d7, B:282:0x07e9, B:284:0x07f5, B:288:0x0801, B:293:0x080e, B:296:0x081d, B:298:0x0821, B:299:0x0828, B:301:0x082c, B:303:0x0836, B:304:0x0842, B:305:0x0850, B:307:0x0854, B:308:0x085b, B:310:0x0861, B:311:0x086c, B:313:0x087a, B:315:0x0880, B:317:0x0894, B:319:0x08a2, B:321:0x08ae, B:322:0x08b3, B:324:0x08c5, B:325:0x08d4, B:327:0x08d8, B:329:0x08e0, B:330:0x08e7, B:332:0x08ee, B:334:0x0906, B:335:0x0910, B:336:0x090b, B:337:0x0913, B:341:0x0846, B:343:0x064c, B:344:0x05ea, B:346:0x05f1, B:348:0x05f7, B:351:0x0156, B:353:0x0162, B:356:0x016a, B:357:0x0173, B:360:0x0179, B:365:0x0186, B:264:0x0724, B:224:0x0678, B:121:0x026c), top: B:2:0x000c, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zza(Context context, zzafl zzaflVar) {
        Bundle bundle;
        JSONObject jSONObject;
        int i;
        String str;
        Integer valueOf;
        String str2;
        Object obj;
        String str3;
        boolean z;
        Bundle bundle2;
        String str4;
        boolean z2;
        String str5;
        String str6;
        String str7;
        boolean z3;
        String str8;
        int i2;
        String str9;
        Object obj2;
        zzaef zzaefVar = zzaflVar.zzcgs;
        Location location = zzaflVar.zzaqe;
        zzaga zzagaVar = zzaflVar.zzcgt;
        Bundle bundle3 = zzaflVar.zzcdc;
        JSONObject jSONObject2 = zzaflVar.zzcgu;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_caps", zzkb.zzik().zzd(zznk.zzbbk));
            if (zzaflVar.zzcdj.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", zzaflVar.zzcdj));
            }
            if (zzaefVar.zzccu != null) {
                hashMap.put("ad_pos", zzaefVar.zzccu);
            }
            zzjj zzjjVar = zzaefVar.zzccv;
            String zzqn = zzajw.zzqn();
            if (zzqn != null) {
                hashMap.put("abf", zzqn);
            }
            if (zzjjVar.zzapw != -1) {
                hashMap.put("cust_age", zzcho.format(new Date(zzjjVar.zzapw)));
            }
            if (zzjjVar.extras != null) {
                hashMap.put("extras", zzjjVar.extras);
            }
            int i3 = -1;
            if (zzjjVar.zzapx != -1) {
                hashMap.put("cust_gender", Integer.valueOf(zzjjVar.zzapx));
            }
            if (zzjjVar.zzapy != null) {
                hashMap.put("kw", zzjjVar.zzapy);
            }
            if (zzjjVar.zzaqa != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzjjVar.zzaqa));
            }
            if (zzjjVar.zzapz) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbfp)).booleanValue()) {
                    str9 = "test_request";
                    obj2 = true;
                } else {
                    str9 = "adtest";
                    obj2 = TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON;
                }
                hashMap.put(str9, obj2);
            }
            if (zzjjVar.versionCode >= 2) {
                if (zzjjVar.zzaqb) {
                    hashMap.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(zzjjVar.zzaqc)) {
                    hashMap.put("ppid", zzjjVar.zzaqc);
                }
            }
            if (zzjjVar.versionCode >= 3 && zzjjVar.zzaqf != null) {
                hashMap.put("url", zzjjVar.zzaqf);
            }
            if (zzjjVar.versionCode >= 5) {
                if (zzjjVar.zzaqh != null) {
                    hashMap.put("custom_targeting", zzjjVar.zzaqh);
                }
                if (zzjjVar.zzaqi != null) {
                    hashMap.put("category_exclusions", zzjjVar.zzaqi);
                }
                if (zzjjVar.zzaqj != null) {
                    hashMap.put("request_agent", zzjjVar.zzaqj);
                }
            }
            if (zzjjVar.versionCode >= 6 && zzjjVar.zzaqk != null) {
                hashMap.put("request_pkg", zzjjVar.zzaqk);
            }
            if (zzjjVar.versionCode >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(zzjjVar.zzaql));
            }
            if (zzaefVar.zzacv.zzard != null) {
                boolean z4 = false;
                boolean z5 = false;
                for (zzjn zzjnVar : zzaefVar.zzacv.zzard) {
                    if (!zzjnVar.zzarf && !z4) {
                        hashMap.put("format", zzjnVar.zzarb);
                        z4 = true;
                    }
                    if (zzjnVar.zzarf && !z5) {
                        hashMap.put("fluid", "height");
                        z5 = true;
                    }
                    if (z4 && z5) {
                        break;
                    }
                }
            } else {
                hashMap.put("format", zzaefVar.zzacv.zzarb);
                if (zzaefVar.zzacv.zzarf) {
                    hashMap.put("fluid", "height");
                }
            }
            if (zzaefVar.zzacv.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (zzaefVar.zzacv.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (zzaefVar.zzacv.zzard != null) {
                StringBuilder sb = new StringBuilder();
                zzjn[] zzjnVarArr = zzaefVar.zzacv.zzard;
                int length = zzjnVarArr.length;
                int i4 = 0;
                boolean z6 = false;
                while (i4 < length) {
                    zzjn zzjnVar2 = zzjnVarArr[i4];
                    if (zzjnVar2.zzarf) {
                        z6 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(zzjnVar2.width == i3 ? (int) (zzjnVar2.widthPixels / zzagaVar.zzagu) : zzjnVar2.width);
                        sb.append("x");
                        sb.append(zzjnVar2.height == -2 ? (int) (zzjnVar2.heightPixels / zzagaVar.zzagu) : zzjnVar2.height);
                    }
                    i4++;
                    i3 = -1;
                }
                if (z6) {
                    if (sb.length() != 0) {
                        i2 = 0;
                        sb.insert(0, "|");
                    } else {
                        i2 = 0;
                    }
                    sb.insert(i2, "320x50");
                }
                hashMap.put("sz", sb);
            }
            if (zzaefVar.zzcdb != 0) {
                hashMap.put("native_version", Integer.valueOf(zzaefVar.zzcdb));
                hashMap.put("native_templates", zzaefVar.zzads);
                zzpl zzplVar = zzaefVar.zzadj;
                if (zzplVar != null) {
                    switch (zzplVar.zzbjo) {
                        case 0:
                            break;
                        case 1:
                            str8 = TJAdUnitConstants.String.PORTRAIT;
                            break;
                        case 2:
                            str8 = TJAdUnitConstants.String.LANDSCAPE;
                            break;
                        default:
                            str8 = "not_set";
                            break;
                    }
                    hashMap.put("native_image_orientation", str8);
                    if (!zzaefVar.zzcdk.isEmpty()) {
                        hashMap.put("native_custom_templates", zzaefVar.zzcdk);
                    }
                    if (zzaefVar.versionCode >= 24) {
                        hashMap.put("max_num_ads", Integer.valueOf(zzaefVar.zzceg));
                    }
                    if (!TextUtils.isEmpty(zzaefVar.zzcee)) {
                        try {
                            hashMap.put("native_advanced_settings", new JSONArray(zzaefVar.zzcee));
                        } catch (JSONException e) {
                            zzakb.zzc("Problem creating json from native advanced settings", e);
                        }
                    }
                }
                str8 = "any";
                hashMap.put("native_image_orientation", str8);
                if (!zzaefVar.zzcdk.isEmpty()) {
                }
                if (zzaefVar.versionCode >= 24) {
                }
                if (!TextUtils.isEmpty(zzaefVar.zzcee)) {
                }
            }
            if (zzaefVar.zzadn != null && zzaefVar.zzadn.size() > 0) {
                for (Integer num : zzaefVar.zzadn) {
                    if (num.intValue() == 2) {
                        str7 = "iba";
                        z3 = true;
                    } else if (num.intValue() == 1) {
                        str7 = "ina";
                        z3 = true;
                    }
                    hashMap.put(str7, z3);
                }
            }
            if (zzaefVar.zzacv.zzarg) {
                hashMap.put("ene", true);
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzaxv)).booleanValue()) {
                hashMap.put("xsrve", true);
            }
            if (zzaefVar.zzadl != null) {
                hashMap.put("is_icon_ad", true);
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzaefVar.zzadl.zzasj));
            }
            hashMap.put("slotname", zzaefVar.zzacp);
            hashMap.put("pn", zzaefVar.applicationInfo.packageName);
            if (zzaefVar.zzccw != null) {
                hashMap.put("vc", Integer.valueOf(zzaefVar.zzccw.versionCode));
            }
            hashMap.put("ms", zzaflVar.zzccx);
            hashMap.put("seq_num", zzaefVar.zzccy);
            hashMap.put(TapjoyConstants.TJC_SESSION_ID, zzaefVar.zzccz);
            hashMap.put("js", zzaefVar.zzacr.zzcw);
            zzagk zzagkVar = zzaflVar.zzcgo;
            Bundle bundle4 = zzaefVar.zzcdw;
            Bundle bundle5 = zzaflVar.zzcgn;
            hashMap.put("am", Integer.valueOf(zzagaVar.zzcjk));
            hashMap.put("cog", zzv(zzagaVar.zzcjl));
            hashMap.put("coh", zzv(zzagaVar.zzcjm));
            if (!TextUtils.isEmpty(zzagaVar.zzcjn)) {
                hashMap.put(d.O, zzagaVar.zzcjn);
            }
            hashMap.put("gl", zzagaVar.zzcjo);
            if (zzagaVar.zzcjp) {
                hashMap.put("simulator", 1);
            }
            if (zzagaVar.zzcjq) {
                hashMap.put("is_sidewinder", 1);
            }
            hashMap.put("ma", zzv(zzagaVar.zzcjr));
            hashMap.put("sp", zzv(zzagaVar.zzcjs));
            hashMap.put("hl", zzagaVar.zzcjt);
            if (!TextUtils.isEmpty(zzagaVar.zzcju)) {
                hashMap.put("mv", zzagaVar.zzcju);
            }
            hashMap.put("muv", Integer.valueOf(zzagaVar.zzcjw));
            if (zzagaVar.zzcjx != -2) {
                hashMap.put("cnt", Integer.valueOf(zzagaVar.zzcjx));
            }
            hashMap.put("gnt", Integer.valueOf(zzagaVar.zzcjy));
            hashMap.put("pt", Integer.valueOf(zzagaVar.zzcjz));
            hashMap.put("rm", Integer.valueOf(zzagaVar.zzcka));
            hashMap.put("riv", Integer.valueOf(zzagaVar.zzckb));
            Bundle bundle6 = new Bundle();
            bundle6.putString("build_build", zzagaVar.zzckg);
            bundle6.putString("build_device", zzagaVar.zzckh);
            Bundle bundle7 = new Bundle();
            bundle7.putBoolean("is_charging", zzagaVar.zzckd);
            bundle7.putDouble("battery_level", zzagaVar.zzckc);
            bundle6.putBundle(d.W, bundle7);
            Bundle bundle8 = new Bundle();
            bundle8.putInt("active_network_state", zzagaVar.zzckf);
            bundle8.putBoolean("active_network_metered", zzagaVar.zzcke);
            if (zzagkVar != null) {
                Bundle bundle9 = new Bundle();
                bundle9.putInt("predicted_latency_micros", zzagkVar.zzckq);
                bundle9.putLong("predicted_down_throughput_bps", zzagkVar.zzckr);
                bundle9.putLong("predicted_up_throughput_bps", zzagkVar.zzcks);
                bundle8.putBundle("predictions", bundle9);
            }
            bundle6.putBundle("network", bundle8);
            Bundle bundle10 = new Bundle();
            bundle10.putBoolean("is_browser_custom_tabs_capable", zzagaVar.zzcki);
            bundle6.putBundle("browser", bundle10);
            if (bundle4 != null) {
                Bundle bundle11 = new Bundle();
                bundle = bundle3;
                jSONObject = jSONObject2;
                bundle11.putString("runtime_free", Long.toString(bundle4.getLong("runtime_free_memory", -1L)));
                bundle11.putString("runtime_max", Long.toString(bundle4.getLong("runtime_max_memory", -1L)));
                bundle11.putString("runtime_total", Long.toString(bundle4.getLong("runtime_total_memory", -1L)));
                i = 0;
                bundle11.putString("web_view_count", Integer.toString(bundle4.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle4.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle11.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle11.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle11.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle11.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle11.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle11.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle11.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle11.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle11.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle6.putBundle("android_mem_info", bundle11);
            } else {
                bundle = bundle3;
                jSONObject = jSONObject2;
                i = 0;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBundle("parental_controls", bundle5);
            if (!TextUtils.isEmpty(zzagaVar.zzcjv)) {
                bundle12.putString("package_version", zzagaVar.zzcjv);
            }
            bundle6.putBundle("play_store", bundle12);
            hashMap.put(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX, bundle6);
            Bundle bundle13 = new Bundle();
            bundle13.putString("doritos", zzaflVar.zzcgp);
            bundle13.putString("doritos_v2", zzaflVar.zzcgq);
            if (((Boolean) zzkb.zzik().zzd(zznk.zzayj)).booleanValue()) {
                if (zzaflVar.zzcgr != null) {
                    str4 = zzaflVar.zzcgr.getId();
                    z2 = zzaflVar.zzcgr.isLimitAdTrackingEnabled();
                } else {
                    str4 = null;
                    z2 = false;
                }
                if (TextUtils.isEmpty(str4)) {
                    zzkb.zzif();
                    bundle13.putString("pdid", zzamu.zzbd(context));
                    str5 = "pdidtype";
                    str6 = "ssaid";
                } else {
                    bundle13.putString("rdid", str4);
                    bundle13.putBoolean("is_lat", z2);
                    str5 = "idtype";
                    str6 = "adid";
                }
                bundle13.putString(str5, str6);
            }
            hashMap.put("pii", bundle13);
            hashMap.put(TapjoyConstants.TJC_PLATFORM, Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location == null) {
                if (zzaefVar.zzccv.versionCode >= 2 && zzaefVar.zzccv.zzaqe != null) {
                    location = zzaefVar.zzccv.zzaqe;
                }
                if (zzaefVar.versionCode >= 2) {
                    hashMap.put("quality_signals", zzaefVar.zzcda);
                }
                if (zzaefVar.versionCode >= 4 && zzaefVar.zzcdd) {
                    hashMap.put("forceHttps", Boolean.valueOf(zzaefVar.zzcdd));
                }
                if (bundle != null) {
                    hashMap.put("content_info", bundle);
                }
                if (zzaefVar.versionCode < 5) {
                    hashMap.put("u_sd", Float.valueOf(zzaefVar.zzagu));
                    hashMap.put("sh", Integer.valueOf(zzaefVar.zzcdf));
                    str = "sw";
                    valueOf = Integer.valueOf(zzaefVar.zzcde);
                } else {
                    hashMap.put("u_sd", Float.valueOf(zzagaVar.zzagu));
                    hashMap.put("sh", Integer.valueOf(zzagaVar.zzcdf));
                    str = "sw";
                    valueOf = Integer.valueOf(zzagaVar.zzcde);
                }
                hashMap.put(str, valueOf);
                if (zzaefVar.versionCode >= 6) {
                    if (!TextUtils.isEmpty(zzaefVar.zzcdg)) {
                        try {
                            hashMap.put("view_hierarchy", new JSONObject(zzaefVar.zzcdg));
                        } catch (JSONException e2) {
                            zzakb.zzc("Problem serializing view hierarchy to JSON", e2);
                        }
                    }
                    hashMap.put("correlation_id", Long.valueOf(zzaefVar.zzcdh));
                }
                if (zzaefVar.versionCode >= 7) {
                    hashMap.put("request_id", zzaefVar.zzcdi);
                }
                if (zzaefVar.versionCode >= 12 && !TextUtils.isEmpty(zzaefVar.zzcdm)) {
                    hashMap.put("anchor", zzaefVar.zzcdm);
                }
                if (zzaefVar.versionCode >= 13) {
                    hashMap.put("android_app_volume", Float.valueOf(zzaefVar.zzcdn));
                }
                if (zzaefVar.versionCode >= 18) {
                    hashMap.put("android_app_muted", Boolean.valueOf(zzaefVar.zzcdt));
                }
                if (zzaefVar.versionCode >= 14 && zzaefVar.zzcdo > 0) {
                    hashMap.put("target_api", Integer.valueOf(zzaefVar.zzcdo));
                }
                if (zzaefVar.versionCode >= 15) {
                    int i5 = -1;
                    if (zzaefVar.zzcdp != -1) {
                        i5 = zzaefVar.zzcdp;
                    }
                    hashMap.put("scroll_index", Integer.valueOf(i5));
                }
                if (zzaefVar.versionCode >= 16) {
                    hashMap.put("_activity_context", Boolean.valueOf(zzaefVar.zzcdq));
                }
                if (zzaefVar.versionCode >= 18) {
                    if (!TextUtils.isEmpty(zzaefVar.zzcdu)) {
                        try {
                            hashMap.put("app_settings", new JSONObject(zzaefVar.zzcdu));
                        } catch (JSONException e3) {
                            zzakb.zzc("Problem creating json from app settings", e3);
                        }
                    }
                    hashMap.put("render_in_browser", Boolean.valueOf(zzaefVar.zzbss));
                }
                if (zzaefVar.versionCode >= 18) {
                    hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzaefVar.zzcdv));
                }
                zzang zzangVar = zzaefVar.zzacr;
                boolean z7 = zzaefVar.zzceh;
                boolean z8 = zzaflVar.zzcgv;
                boolean z9 = zzaefVar.zzcej;
                Bundle bundle14 = new Bundle();
                Bundle bundle15 = new Bundle();
                bundle15.putString("cl", "193400285");
                bundle15.putString("rapid_rc", "dev");
                bundle15.putString("rapid_rollup", "HEAD");
                bundle14.putBundle("build_meta", bundle15);
                bundle14.putString("mf", Boolean.toString(((Boolean) zzkb.zzik().zzd(zznk.zzbbm)).booleanValue()));
                bundle14.putBoolean("instant_app", z7);
                bundle14.putBoolean("lite", zzangVar.zzcvh);
                bundle14.putBoolean("local_service", z8);
                bundle14.putBoolean("is_privileged_process", z9);
                hashMap.put("sdk_env", bundle14);
                hashMap.put("cache_state", jSONObject);
                if (zzaefVar.versionCode >= 19) {
                    hashMap.put("gct", zzaefVar.zzcdx);
                }
                if (zzaefVar.versionCode >= 21 && zzaefVar.zzcdy) {
                    hashMap.put("de", "1");
                }
                if (((Boolean) zzkb.zzik().zzd(zznk.zzayy)).booleanValue()) {
                    String str10 = zzaefVar.zzacv.zzarb;
                    if (!str10.equals("interstitial_mb") && !str10.equals("reward_mb")) {
                        z = false;
                        bundle2 = zzaefVar.zzcdz;
                        boolean z10 = bundle2 == null;
                        if (z && z10) {
                            Bundle bundle16 = new Bundle();
                            bundle16.putBundle("interstitial_pool", bundle2);
                            hashMap.put("counters", bundle16);
                        }
                    }
                    z = true;
                    bundle2 = zzaefVar.zzcdz;
                    if (bundle2 == null) {
                    }
                    if (z) {
                        Bundle bundle162 = new Bundle();
                        bundle162.putBundle("interstitial_pool", bundle2);
                        hashMap.put("counters", bundle162);
                    }
                }
                if (zzaefVar.zzcea != null) {
                    hashMap.put("gmp_app_id", zzaefVar.zzcea);
                }
                if (zzaefVar.zzceb != null) {
                    str2 = "fbs_aiid";
                    obj = "";
                } else if ("TIME_OUT".equals(zzaefVar.zzceb)) {
                    str2 = "sai_timeout";
                    obj = zzkb.zzik().zzd(zznk.zzaxt);
                } else {
                    str2 = "fbs_aiid";
                    obj = zzaefVar.zzceb;
                }
                hashMap.put(str2, obj);
                if (zzaefVar.zzcec != null) {
                    hashMap.put("fbs_aeid", zzaefVar.zzcec);
                }
                if (zzaefVar.versionCode >= 24) {
                    hashMap.put("disable_ml", Boolean.valueOf(zzaefVar.zzcei));
                }
                str3 = (String) zzkb.zzik().zzd(zznk.zzavo);
                if (str3 != null && !str3.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzkb.zzik().zzd(zznk.zzavp)).intValue()) {
                        HashMap hashMap2 = new HashMap();
                        String[] split = str3.split(",");
                        int length2 = split.length;
                        while (i < length2) {
                            String str11 = split[i];
                            hashMap2.put(str11, zzams.zzdd(str11));
                            i++;
                        }
                        hashMap.put("video_decoders", hashMap2);
                    }
                }
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbet)).booleanValue()) {
                    hashMap.put("omid_v", com.google.android.gms.ads.internal.zzbv.zzfa().getVersion(context));
                }
                if (zzaefVar.zzcek != null && !zzaefVar.zzcek.isEmpty()) {
                    hashMap.put("android_permissions", zzaefVar.zzcek);
                }
                if (zzakb.isLoggable(2)) {
                    String valueOf2 = String.valueOf(com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap).toString(2));
                    zzakb.v(valueOf2.length() != 0 ? "Ad Request JSON: ".concat(valueOf2) : new String("Ad Request JSON: "));
                }
                return com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap);
            }
            zza((HashMap<String, Object>) hashMap, location);
            if (zzaefVar.versionCode >= 2) {
            }
            if (zzaefVar.versionCode >= 4) {
                hashMap.put("forceHttps", Boolean.valueOf(zzaefVar.zzcdd));
            }
            if (bundle != null) {
            }
            if (zzaefVar.versionCode < 5) {
            }
            hashMap.put(str, valueOf);
            if (zzaefVar.versionCode >= 6) {
            }
            if (zzaefVar.versionCode >= 7) {
            }
            if (zzaefVar.versionCode >= 12) {
                hashMap.put("anchor", zzaefVar.zzcdm);
            }
            if (zzaefVar.versionCode >= 13) {
            }
            if (zzaefVar.versionCode >= 18) {
            }
            if (zzaefVar.versionCode >= 14) {
                hashMap.put("target_api", Integer.valueOf(zzaefVar.zzcdo));
            }
            if (zzaefVar.versionCode >= 15) {
            }
            if (zzaefVar.versionCode >= 16) {
            }
            if (zzaefVar.versionCode >= 18) {
            }
            if (zzaefVar.versionCode >= 18) {
            }
            zzang zzangVar2 = zzaefVar.zzacr;
            boolean z72 = zzaefVar.zzceh;
            boolean z82 = zzaflVar.zzcgv;
            boolean z92 = zzaefVar.zzcej;
            Bundle bundle142 = new Bundle();
            Bundle bundle152 = new Bundle();
            bundle152.putString("cl", "193400285");
            bundle152.putString("rapid_rc", "dev");
            bundle152.putString("rapid_rollup", "HEAD");
            bundle142.putBundle("build_meta", bundle152);
            bundle142.putString("mf", Boolean.toString(((Boolean) zzkb.zzik().zzd(zznk.zzbbm)).booleanValue()));
            bundle142.putBoolean("instant_app", z72);
            bundle142.putBoolean("lite", zzangVar2.zzcvh);
            bundle142.putBoolean("local_service", z82);
            bundle142.putBoolean("is_privileged_process", z92);
            hashMap.put("sdk_env", bundle142);
            hashMap.put("cache_state", jSONObject);
            if (zzaefVar.versionCode >= 19) {
            }
            if (zzaefVar.versionCode >= 21) {
                hashMap.put("de", "1");
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzayy)).booleanValue()) {
            }
            if (zzaefVar.zzcea != null) {
            }
            if (zzaefVar.zzceb != null) {
            }
            hashMap.put(str2, obj);
            if (zzaefVar.zzcec != null) {
            }
            if (zzaefVar.versionCode >= 24) {
            }
            str3 = (String) zzkb.zzik().zzd(zznk.zzavo);
            if (str3 != null) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzkb.zzik().zzd(zznk.zzavp)).intValue()) {
                }
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbet)).booleanValue()) {
            }
            if (zzaefVar.zzcek != null) {
                hashMap.put("android_permissions", zzaefVar.zzcek);
            }
            if (zzakb.isLoggable(2)) {
            }
            return com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap);
        } catch (JSONException e4) {
            String valueOf3 = String.valueOf(e4.getMessage());
            zzakb.zzdk(valueOf3.length() != 0 ? "Problem serializing ad request to JSON: ".concat(valueOf3) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put(b.x, valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzb(zzaej zzaejVar) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (zzaejVar.zzbyq != null) {
            jSONObject.put("ad_base_url", zzaejVar.zzbyq);
        }
        if (zzaejVar.zzcet != null) {
            jSONObject.put("ad_size", zzaejVar.zzcet);
        }
        jSONObject.put(TapjoyConstants.TJC_PLUGIN_NATIVE, zzaejVar.zzare);
        jSONObject.put(zzaejVar.zzare ? "ad_json" : "ad_html", zzaejVar.zzceo);
        if (zzaejVar.zzcev != null) {
            jSONObject.put("debug_dialog", zzaejVar.zzcev);
        }
        if (zzaejVar.zzcfl != null) {
            jSONObject.put("debug_signals", zzaejVar.zzcfl);
        }
        if (zzaejVar.zzcep != -1) {
            double d2 = zzaejVar.zzcep;
            Double.isNaN(d2);
            jSONObject.put("interstitial_timeout", d2 / 1000.0d);
        }
        if (zzaejVar.orientation != com.google.android.gms.ads.internal.zzbv.zzem().zzrm()) {
            if (zzaejVar.orientation == com.google.android.gms.ads.internal.zzbv.zzem().zzrl()) {
                str = "orientation";
                str2 = TJAdUnitConstants.String.LANDSCAPE;
            }
            if (zzaejVar.zzbsn != null) {
                jSONObject.put("click_urls", zzm(zzaejVar.zzbsn));
            }
            if (zzaejVar.zzbso != null) {
                jSONObject.put("impression_urls", zzm(zzaejVar.zzbso));
            }
            if (zzaejVar.zzbsp != null) {
                jSONObject.put("downloaded_impression_urls", zzm(zzaejVar.zzbsp));
            }
            if (zzaejVar.zzces != null) {
                jSONObject.put("manual_impression_urls", zzm(zzaejVar.zzces));
            }
            if (zzaejVar.zzcey != null) {
                jSONObject.put("active_view", zzaejVar.zzcey);
            }
            jSONObject.put("ad_is_javascript", zzaejVar.zzcew);
            if (zzaejVar.zzcex != null) {
                jSONObject.put("ad_passback_url", zzaejVar.zzcex);
            }
            jSONObject.put("mediation", zzaejVar.zzceq);
            jSONObject.put("custom_render_allowed", zzaejVar.zzcez);
            jSONObject.put("content_url_opted_out", zzaejVar.zzcfa);
            jSONObject.put("content_vertical_opted_out", zzaejVar.zzcfm);
            jSONObject.put("prefetch", zzaejVar.zzcfb);
            if (zzaejVar.zzbsu != -1) {
                jSONObject.put("refresh_interval_milliseconds", zzaejVar.zzbsu);
            }
            if (zzaejVar.zzcer != -1) {
                jSONObject.put("mediation_config_cache_time_milliseconds", zzaejVar.zzcer);
            }
            if (!TextUtils.isEmpty(zzaejVar.zzamj)) {
                jSONObject.put("gws_query_id", zzaejVar.zzamj);
            }
            jSONObject.put("fluid", !zzaejVar.zzarf ? "height" : "");
            jSONObject.put("native_express", zzaejVar.zzarg);
            if (zzaejVar.zzcff != null) {
                jSONObject.put("video_start_urls", zzm(zzaejVar.zzcff));
            }
            if (zzaejVar.zzcfg != null) {
                jSONObject.put("video_complete_urls", zzm(zzaejVar.zzcfg));
            }
            if (zzaejVar.zzcfe != null) {
                zzaig zzaigVar = zzaejVar.zzcfe;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rb_type", zzaigVar.type);
                jSONObject2.put("rb_amount", zzaigVar.zzcmk);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("rewards", jSONArray);
            }
            jSONObject.put("use_displayed_impression", zzaejVar.zzcfh);
            jSONObject.put("auto_protection_configuration", zzaejVar.zzcfi);
            jSONObject.put("render_in_browser", zzaejVar.zzbss);
            jSONObject.put("disable_closable_area", zzaejVar.zzzm);
            return jSONObject;
        }
        str = "orientation";
        str2 = TJAdUnitConstants.String.PORTRAIT;
        jSONObject.put(str, str2);
        if (zzaejVar.zzbsn != null) {
        }
        if (zzaejVar.zzbso != null) {
        }
        if (zzaejVar.zzbsp != null) {
        }
        if (zzaejVar.zzces != null) {
        }
        if (zzaejVar.zzcey != null) {
        }
        jSONObject.put("ad_is_javascript", zzaejVar.zzcew);
        if (zzaejVar.zzcex != null) {
        }
        jSONObject.put("mediation", zzaejVar.zzceq);
        jSONObject.put("custom_render_allowed", zzaejVar.zzcez);
        jSONObject.put("content_url_opted_out", zzaejVar.zzcfa);
        jSONObject.put("content_vertical_opted_out", zzaejVar.zzcfm);
        jSONObject.put("prefetch", zzaejVar.zzcfb);
        if (zzaejVar.zzbsu != -1) {
        }
        if (zzaejVar.zzcer != -1) {
        }
        if (!TextUtils.isEmpty(zzaejVar.zzamj)) {
        }
        jSONObject.put("fluid", !zzaejVar.zzarf ? "height" : "");
        jSONObject.put("native_express", zzaejVar.zzarg);
        if (zzaejVar.zzcff != null) {
        }
        if (zzaejVar.zzcfg != null) {
        }
        if (zzaejVar.zzcfe != null) {
        }
        jSONObject.put("use_displayed_impression", zzaejVar.zzcfh);
        jSONObject.put("auto_protection_configuration", zzaejVar.zzcfi);
        jSONObject.put("render_in_browser", zzaejVar.zzbss);
        jSONObject.put("disable_closable_area", zzaejVar.zzzm);
        return jSONObject;
    }

    private static JSONArray zzm(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    private static Integer zzv(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }
}
