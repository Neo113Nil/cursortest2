package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.AlertFragment;
import com.google.android.gms.ads.impl.R;
import com.google.common.net.HttpHeaders;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbrs extends zzbsb {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrs(zzcek zzcekVar, Map map) {
        super(zzcekVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbbp(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        zzO.setTitle(zzf != null ? zzf.getString(R.string.s5) : "Create calendar event");
        zzO.setMessage(zzf != null ? zzf.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzO.setPositiveButton(zzf != null ? zzf.getString(R.string.s3) : HttpHeaders.ACCEPT, new zzbrq(this));
        zzO.setNegativeButton(zzf != null ? zzf.getString(R.string.s4) : "Decline", new zzbrr(this));
        zzO.create().show();
    }

    final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(AlertFragment.ARG_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    final /* synthetic */ Context zzc() {
        return this.zzb;
    }
}
