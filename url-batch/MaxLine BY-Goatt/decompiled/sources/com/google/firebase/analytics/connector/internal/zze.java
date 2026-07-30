package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import defpackage.ph;
import defpackage.s93;
import defpackage.th2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zze implements zza {
    final Set zza;
    private final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final ph zzc;
    private final zzd zzd;

    public zze(ph phVar, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = phVar;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        phVar.a.f(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
        Set set2 = this.zza;
        set2.clear();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i = zzc.zza;
            if (str != null && str.length() != 0) {
                int codePointAt = str.codePointAt(0);
                if (!Character.isLetter(codePointAt)) {
                    if (codePointAt == 95) {
                        codePointAt = 95;
                    }
                }
                int length = str.length();
                int charCount = Character.charCount(codePointAt);
                while (true) {
                    if (charCount < length) {
                        int codePointAt2 = str.codePointAt(charCount);
                        if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                            charCount += Character.charCount(codePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int codePointAt3 = str.codePointAt(0);
                        if (Character.isLetter(codePointAt3)) {
                            int length2 = str.length();
                            int charCount2 = Character.charCount(codePointAt3);
                            while (true) {
                                if (charCount2 >= length2) {
                                    String p = th2.p(str, s93.n, s93.p);
                                    if (p != null) {
                                        str = p;
                                    }
                                    hashSet.add(str);
                                } else {
                                    int codePointAt4 = str.codePointAt(charCount2);
                                    if (codePointAt4 == 95 || Character.isLetterOrDigit(codePointAt4)) {
                                        charCount2 += Character.charCount(codePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }

    public final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener zzd() {
        return this.zzb;
    }
}
