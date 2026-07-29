package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.tapjoy.TapjoyConstants;
import com.umeng.analytics.pro.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@VisibleForTesting
/* loaded from: classes.dex */
public class Tracker extends zzar {
    private boolean zzsh;
    private final Map<String, String> zzsi;
    private final Map<String, String> zzsj;
    private final zzck zzsk;
    private final zza zzsl;
    private ExceptionReporter zzsm;
    private zzdc zzsn;

    class zza extends zzar implements GoogleAnalytics.zza {
        private boolean zzsw;
        private int zzsx;
        private long zzsy;
        private boolean zzsz;
        private long zzta;

        protected zza(zzat zzatVar) {
            super(zzatVar);
            this.zzsy = -1L;
        }

        private final void zzae() {
            if (this.zzsy >= 0 || this.zzsw) {
                zzbx().zza(Tracker.this.zzsl);
            } else {
                zzbx().zzb(Tracker.this.zzsl);
            }
        }

        public final void enableAutoActivityTracking(boolean z) {
            this.zzsw = z;
            zzae();
        }

        public final void setSessionTimeout(long j) {
            this.zzsy = j;
            zzae();
        }

        @Override // com.google.android.gms.internal.measurement.zzar
        protected final void zzac() {
        }

        public final synchronized boolean zzad() {
            boolean z;
            z = this.zzsz;
            this.zzsz = false;
            return z;
        }

        @Override // com.google.android.gms.analytics.GoogleAnalytics.zza
        public final void zzc(Activity activity) {
            String canonicalName;
            if (this.zzsx == 0) {
                if (zzbt().elapsedRealtime() >= this.zzta + Math.max(1000L, this.zzsy)) {
                    this.zzsz = true;
                }
            }
            this.zzsx++;
            if (this.zzsw) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Tracker.this.setCampaignParamsOnNextHit(intent.getData());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                Tracker tracker = Tracker.this;
                if (Tracker.this.zzsn != null) {
                    zzdc zzdcVar = Tracker.this.zzsn;
                    canonicalName = activity.getClass().getCanonicalName();
                    String str = zzdcVar.zzabx.get(canonicalName);
                    if (str != null) {
                        canonicalName = str;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", canonicalName);
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    Preconditions.checkNotNull(activity);
                    Intent intent2 = activity.getIntent();
                    String str2 = null;
                    if (intent2 != null) {
                        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            str2 = stringExtra;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("&dr", str2);
                    }
                }
                Tracker.this.send(hashMap);
            }
        }

        @Override // com.google.android.gms.analytics.GoogleAnalytics.zza
        public final void zzd(Activity activity) {
            this.zzsx--;
            this.zzsx = Math.max(0, this.zzsx);
            if (this.zzsx == 0) {
                this.zzta = zzbt().elapsedRealtime();
            }
        }
    }

    Tracker(zzat zzatVar, String str, zzck zzckVar) {
        super(zzatVar);
        this.zzsi = new HashMap();
        this.zzsj = new HashMap();
        if (str != null) {
            this.zzsi.put("&tid", str);
        }
        this.zzsi.put("useSecure", "1");
        this.zzsi.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.zzsk = new zzck("tracking", zzbt());
        this.zzsl = new zza(zzatVar);
    }

    private static String zza(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (key.startsWith("&") && key.length() >= 2) {
            return entry.getKey().substring(1);
        }
        return null;
    }

    private static void zza(Map<String, String> map, Map<String, String> map2) {
        Preconditions.checkNotNull(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String zza2 = zza(entry);
            if (zza2 != null) {
                map2.put(zza2, entry.getValue());
            }
        }
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.zzsh = z;
    }

    public void enableAutoActivityTracking(boolean z) {
        this.zzsl.enableAutoActivityTracking(z);
    }

    public void enableExceptionReporting(boolean z) {
        String str;
        synchronized (this) {
            if ((this.zzsm != null) == z) {
                return;
            }
            if (z) {
                this.zzsm = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), getContext());
                Thread.setDefaultUncaughtExceptionHandler(this.zzsm);
                str = "Uncaught exceptions will be reported to Google Analytics";
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.zzsm.zzl());
                str = "Uncaught exceptions will not be reported to Google Analytics";
            }
            zzq(str);
        }
    }

    public String get(String str) {
        zzch();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzsi.containsKey(str)) {
            return this.zzsi.get(str);
        }
        if (str.equals("&ul")) {
            return zzdd.zza(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzcc().zzdn();
        }
        if (str.equals("&sr")) {
            return zzcf().zzeh();
        }
        if (str.equals("&aid")) {
            return zzce().zzdb().zzah();
        }
        if (str.equals("&an")) {
            return zzce().zzdb().zzaf();
        }
        if (str.equals("&av")) {
            return zzce().zzdb().zzag();
        }
        if (str.equals("&aiid")) {
            return zzce().zzdb().zzai();
        }
        return null;
    }

    public void send(Map<String, String> map) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        if (zzbx().getAppOptOut()) {
            zzr("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean isDryRunEnabled = zzbx().isDryRunEnabled();
        HashMap hashMap = new HashMap();
        zza(this.zzsi, hashMap);
        zza(map, hashMap);
        boolean zzb = zzdd.zzb(this.zzsi.get("useSecure"), true);
        Map<String, String> map2 = this.zzsj;
        Preconditions.checkNotNull(hashMap);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String zza2 = zza(entry);
                if (zza2 != null && !hashMap.containsKey(zza2)) {
                    hashMap.put(zza2, entry.getValue());
                }
            }
        }
        this.zzsj.clear();
        String str = hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            zzbu().zza(hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            zzbu().zza(hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z = this.zzsh;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || b.ah.equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(this.zzsi.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.zzsi.put("&a", Integer.toString(parseInt));
            }
        }
        zzbw().zza(new zzp(this, hashMap, z, str, currentTimeMillis, isDryRunEnabled, zzb, str2));
    }

    public void set(String str, String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzsi.put(str, str2);
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", zzdd.zzc(z));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter(TapjoyConstants.TJC_REFERRER);
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.zzsj.put("&ci", queryParameter2);
        }
        String queryParameter3 = parse.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.zzsj.put("&anid", queryParameter3);
        }
        String queryParameter4 = parse.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.zzsj.put("&cn", queryParameter4);
        }
        String queryParameter5 = parse.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.zzsj.put("&cc", queryParameter5);
        }
        String queryParameter6 = parse.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.zzsj.put("&cm", queryParameter6);
        }
        String queryParameter7 = parse.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.zzsj.put("&cs", queryParameter7);
        }
        String queryParameter8 = parse.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.zzsj.put("&ck", queryParameter8);
        }
        String queryParameter9 = parse.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.zzsj.put("&dclid", queryParameter9);
        }
        String queryParameter10 = parse.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.zzsj.put("&gclid", queryParameter10);
        }
        String queryParameter11 = parse.getQueryParameter("aclid");
        if (queryParameter11 != null) {
            this.zzsj.put("&aclid", queryParameter11);
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d2) {
        set("&sf", Double.toString(d2));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i < 0 && i2 < 0) {
            zzt("Invalid width or height. The values should be non-negative.");
            return;
        }
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        set("&sr", sb.toString());
    }

    public void setSessionTimeout(long j) {
        this.zzsl.setSessionTimeout(j * 1000);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", zzdd.zzc(z));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    final void zza(zzdc zzdcVar) {
        zzq("Loading Tracker config values");
        this.zzsn = zzdcVar;
        if (this.zzsn.zzabr != null) {
            String str = this.zzsn.zzabr;
            set("&tid", str);
            zza("trackingId loaded", str);
        }
        if (this.zzsn.zzabs >= 0.0d) {
            String d2 = Double.toString(this.zzsn.zzabs);
            set("&sf", d2);
            zza("Sample frequency loaded", d2);
        }
        if (this.zzsn.zzabt >= 0) {
            int i = this.zzsn.zzabt;
            setSessionTimeout(i);
            zza("Session timeout loaded", Integer.valueOf(i));
        }
        if (this.zzsn.zzabu != -1) {
            boolean z = this.zzsn.zzabu == 1;
            enableAutoActivityTracking(z);
            zza("Auto activity tracking loaded", Boolean.valueOf(z));
        }
        if (this.zzsn.zzabv != -1) {
            boolean z2 = this.zzsn.zzabv == 1;
            if (z2) {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(z2));
        }
        enableExceptionReporting(this.zzsn.zzabw == 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzsl.zzm();
        String zzaf = zzca().zzaf();
        if (zzaf != null) {
            set("&an", zzaf);
        }
        String zzag = zzca().zzag();
        if (zzag != null) {
            set("&av", zzag);
        }
    }
}
