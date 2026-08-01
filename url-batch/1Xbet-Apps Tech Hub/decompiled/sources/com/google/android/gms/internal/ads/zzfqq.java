package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfqq extends zzfqe {
    private zzfuo<Integer> zza;
    private zzfuo<Integer> zzb;
    private zzfqp zzc;
    private HttpURLConnection zzd;

    zzfqq() {
        this(new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqg
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                return zzfqq.zzf();
            }
        }, new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqh
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                return zzfqq.zzg();
            }
        }, null);
    }

    zzfqq(zzfuo<Integer> zzfuoVar, zzfuo<Integer> zzfuoVar2, zzfqp zzfqpVar) {
        this.zza = zzfuoVar;
        this.zzb = zzfuoVar2;
        this.zzc = zzfqpVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfqf.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfqf.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfqp zzfqpVar = this.zzc;
        zzfqpVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfqpVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfqp zzfqpVar, final int i, final int i2) throws IOException {
        this.zza = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqi
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqj
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfqpVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqk
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfql
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfqp() { // from class: com.google.android.gms.internal.ads.zzfqm
            @Override // com.google.android.gms.internal.ads.zzfqp
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqn
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfqp() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfqp
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
