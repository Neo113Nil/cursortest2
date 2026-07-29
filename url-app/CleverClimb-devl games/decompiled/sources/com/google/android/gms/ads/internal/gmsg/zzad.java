package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaab;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarr;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzjd;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import com.youappi.sdk.net.model.VideoEvent;
import java.net.URISyntaxException;
import java.util.Map;

@zzadh
/* loaded from: classes.dex */
public final class zzad<T extends zzarr & zzars & zzarw & zzarz & zzasb> implements zzv<T> {
    private final Context mContext;
    private final zzjd zzapt;
    private final zzb zzbll;
    private final zzd zzblm;
    private final com.google.android.gms.ads.internal.zzx zzbmw;
    private final zzaab zzbmx;
    private final zzci zzbna;
    private final com.google.android.gms.ads.internal.overlay.zzt zzbnb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzbnc;
    private final zzaqw zzbnd = null;
    private final zzang zzzw;

    public zzad(Context context, zzang zzangVar, zzci zzciVar, com.google.android.gms.ads.internal.overlay.zzt zztVar, zzjd zzjdVar, zzb zzbVar, zzd zzdVar, com.google.android.gms.ads.internal.overlay.zzn zznVar, com.google.android.gms.ads.internal.zzx zzxVar, zzaab zzaabVar) {
        this.mContext = context;
        this.zzzw = zzangVar;
        this.zzbna = zzciVar;
        this.zzbnb = zztVar;
        this.zzapt = zzjdVar;
        this.zzbll = zzbVar;
        this.zzblm = zzdVar;
        this.zzbmw = zzxVar;
        this.zzbmx = zzaabVar;
        this.zzbnc = zznVar;
    }

    @VisibleForTesting
    static String zza(Context context, zzci zzciVar, String str, View view, Activity activity) {
        if (zzciVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (zzciVar.zzc(parse)) {
                parse = zzciVar.zza(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzcj unused) {
            return str;
        } catch (Exception e) {
            zzbv.zzeo().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    private static boolean zzg(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzh(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if (d.ao.equalsIgnoreCase(str)) {
            return zzbv.zzem().zzrm();
        }
        if ("l".equalsIgnoreCase(str)) {
            return zzbv.zzem().zzrl();
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzbv.zzem().zzrn();
        }
        return -1;
    }

    private final void zzl(boolean z) {
        if (this.zzbmx != null) {
            this.zzbmx.zzm(z);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzarr zzarrVar = (zzarr) obj;
        String zzb = zzajb.zzb((String) map.get("u"), zzarrVar.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            zzakb.zzdk("Action missing from an open GMSG.");
            return;
        }
        if (this.zzbmw != null && !this.zzbmw.zzcy()) {
            this.zzbmw.zzs(zzb);
            return;
        }
        if (VideoEvent.EVENT_EXPAND.equalsIgnoreCase(str)) {
            if (((zzars) zzarrVar).zzuj()) {
                zzakb.zzdk("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzarw) zzarrVar).zza(zzg(map), zzh(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            zzl(false);
            if (zzb != null) {
                ((zzarw) zzarrVar).zza(zzg(map), zzh(map), zzb);
                return;
            } else {
                ((zzarw) zzarrVar).zza(zzg(map), zzh(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if (TapjoyConstants.TJC_APP_PLACEMENT.equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzl(true);
            zzarrVar.getContext();
            if (TextUtils.isEmpty(zzb)) {
                zzakb.zzdk("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzarw) zzarrVar).zza(new com.google.android.gms.ads.internal.overlay.zzc(new zzae(zzarrVar.getContext(), ((zzarz) zzarrVar).zzui(), ((zzasb) zzarrVar).getView()).zzi(map)));
                return;
            } catch (ActivityNotFoundException e) {
                zzakb.zzdk(e.getMessage());
                return;
            }
        }
        zzl(true);
        String str2 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent = Intent.parseUri(str2, 0);
            } catch (URISyntaxException e2) {
                String valueOf = String.valueOf(str2);
                zzakb.zzb(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            String uri = data.toString();
            if (!TextUtils.isEmpty(uri)) {
                try {
                    uri = zza(zzarrVar.getContext(), ((zzarz) zzarrVar).zzui(), uri, ((zzasb) zzarrVar).getView(), zzarrVar.zzto());
                } catch (Exception e3) {
                    zzakb.zzb("Error occurred while adding signals.", e3);
                    zzbv.zzeo().zza(e3, "OpenGmsgHandler.onGmsg");
                }
                try {
                    data = Uri.parse(uri);
                } catch (Exception e4) {
                    String valueOf2 = String.valueOf(uri);
                    zzakb.zzb(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e4);
                    zzbv.zzeo().zza(e4, "OpenGmsgHandler.onGmsg");
                }
            }
            intent.setData(data);
        }
        if (intent != null) {
            ((zzarw) zzarrVar).zza(new com.google.android.gms.ads.internal.overlay.zzc(intent));
            return;
        }
        if (!TextUtils.isEmpty(zzb)) {
            zzb = zza(zzarrVar.getContext(), ((zzarz) zzarrVar).zzui(), zzb, ((zzasb) zzarrVar).getView(), zzarrVar.zzto());
        }
        ((zzarw) zzarrVar).zza(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get(d.aq), zzb, (String) map.get("m"), (String) map.get(d.ao), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }
}
