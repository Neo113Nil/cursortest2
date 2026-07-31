package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m8 implements b7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f332a;
    public final List b;
    public final TrackingParams c;
    public final Map d;
    public final AtomicInteger e;
    public AtomicReference f;
    public String g;

    public m8(Context context, List list, TrackingParams trackingParams, x4 x4Var) {
        this.f332a = context;
        this.b = list;
        this.c = trackingParams;
        this.d = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.e = new AtomicInteger(list.size());
    }

    @Override // com.startapp.sdk.internal.b7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((c8) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else {
            if (th instanceof SDKException) {
                SDKException sDKException = (SDKException) th;
                if (sDKException.a() > 0) {
                    pair = new Pair(1, String.valueOf(sDKException.a()));
                } else {
                    th = th.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            pair = th != null ? new Pair(2, th.getClass().getName()) : new Pair(2, String.valueOf(-1));
        }
        this.d.put(str, pair);
        a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, List list, TrackingParams trackingParams) {
        m8 m8Var = (m8) ((b7) com.startapp.sdk.components.a.a(context).N.a()).a(context, list, trackingParams);
        if (m8Var != null) {
            zh.a(4, m8Var.f332a, "Sending impression");
            for (String str : m8Var.b) {
                if (str != null && str.length() > 0) {
                    if (m8Var.g == null) {
                        m8Var.g = e0.a(str, (String) null);
                    }
                    Context context2 = m8Var.f332a;
                    TrackingParams trackingParams2 = m8Var.c;
                    if (zh.d(str)) {
                        StringBuilder sb = new StringBuilder(str);
                        String a2 = e0.a(str, (String) null);
                        if (a2 != null) {
                            sb.append(g.a(g.c(a2)));
                        }
                        if (trackingParams2 != null) {
                            sb.append(trackingParams2.e());
                        }
                        str = sb.toString();
                    }
                    Pair pair = new Pair(str, Boolean.valueOf(nh.a(context2, str, m8Var)));
                    String str2 = (String) pair.first;
                    boolean equals = Boolean.TRUE.equals(pair.second);
                    m8Var.d.put(str2, null);
                    if (!equals) {
                        m8Var.a();
                    }
                } else {
                    m8Var.d.put(str, null);
                    m8Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String name;
        if (this.e.decrementAndGet() == 0) {
            AtomicReference atomicReference = this.f;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata y = MetaData.A().y();
                if (y == null || y.a() <= ((Random) zh.d.a()).nextDouble()) {
                    y = null;
                }
                AtomicReference atomicReference2 = new AtomicReference(y);
                this.f = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                boolean z = false;
                for (Map.Entry entry : this.d.entrySet()) {
                    Integer num = entry.getValue() != null ? (Integer) ((Pair) entry.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = entry.getValue() != null ? (String) ((Pair) entry.getValue()).second : String.valueOf(-2);
                        String str2 = (String) entry.getKey();
                        sb.append(str).append(valueOf);
                        StringBuilder append = sb2.append(str);
                        if (str2 != null) {
                            try {
                                Uri parse = Uri.parse(str2);
                                name = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                name = th.getClass().getName();
                            }
                        } else {
                            name = String.valueOf((char[]) null);
                        }
                        append.append(name);
                        str = StringUtils.COMMA;
                        z = true;
                    }
                }
                if (z) {
                    n8 n8Var = new n8(o8.k);
                    n8Var.e = ((Object) sb) + ";" + ((Object) sb2);
                    n8Var.g = this.g;
                    StringBuilder sb3 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.c;
                    n8Var.d = sb3.append(trackingParams != null ? trackingParams.a() : null).toString();
                    n8Var.a();
                }
            }
        }
    }
}
