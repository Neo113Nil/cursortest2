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

/* loaded from: classes.dex */
public final class b9 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6703a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6704b;

    /* renamed from: c, reason: collision with root package name */
    public final TrackingParams f6705c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6706d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f6707e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReference f6708f;

    /* renamed from: g, reason: collision with root package name */
    public String f6709g;

    public b9(Context context, List list, TrackingParams trackingParams, f5 f5Var) {
        this.f6703a = context;
        this.f6704b = list;
        this.f6705c = trackingParams;
        this.f6706d = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f6707e = new AtomicInteger(list.size());
    }

    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((r8) obj2) != null) {
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
        this.f6706d.put(str, pair);
        a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, List list, TrackingParams trackingParams) {
        b9 b9Var = (b9) ((h7) com.startapp.sdk.components.a.a(context).f6554O.a()).a(context, list, trackingParams);
        if (b9Var != null) {
            si.a(4, b9Var.f6703a, "Sending impression");
            for (String str : b9Var.f6704b) {
                if (str != null && str.length() > 0) {
                    if (b9Var.f6709g == null) {
                        b9Var.f6709g = g0.a(str, (String) null);
                    }
                    Context context2 = b9Var.f6703a;
                    TrackingParams trackingParams2 = b9Var.f6705c;
                    if (si.e(str)) {
                        StringBuilder sb = new StringBuilder(str);
                        String a3 = g0.a(str, (String) null);
                        if (a3 != null) {
                            sb.append(AbstractC0366g.a(AbstractC0366g.c(a3)));
                        }
                        if (trackingParams2 != null) {
                            sb.append(trackingParams2.e());
                        }
                        str = sb.toString();
                    }
                    Pair pair = new Pair(str, Boolean.valueOf(gi.a(context2, str, b9Var)));
                    String str2 = (String) pair.first;
                    boolean equals = Boolean.TRUE.equals(pair.second);
                    b9Var.f6706d.put(str2, null);
                    if (!equals) {
                        b9Var.a();
                    }
                } else {
                    b9Var.f6706d.put(str, null);
                    b9Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String name;
        if (this.f6707e.decrementAndGet() == 0) {
            AtomicReference atomicReference = this.f6708f;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata C4 = MetaData.E().C();
                if (C4 == null || C4.a() <= ((Random) si.f7578d.a()).nextDouble()) {
                    C4 = null;
                }
                AtomicReference atomicReference2 = new AtomicReference(C4);
                this.f6708f = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                boolean z = false;
                for (Map.Entry entry : this.f6706d.entrySet()) {
                    Integer num = entry.getValue() != null ? (Integer) ((Pair) entry.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = entry.getValue() != null ? (String) ((Pair) entry.getValue()).second : String.valueOf(-2);
                        String str2 = (String) entry.getKey();
                        sb.append(str);
                        sb.append(valueOf);
                        sb2.append(str);
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
                        sb2.append(name);
                        str = StringUtils.COMMA;
                        z = true;
                    }
                }
                if (z) {
                    d9 d9Var = new d9(e9.f6845k);
                    d9Var.f6793e = ((Object) sb) + ";" + ((Object) sb2);
                    d9Var.f6795g = this.f6709g;
                    StringBuilder sb3 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.f6705c;
                    sb3.append(trackingParams != null ? trackingParams.a() : null);
                    d9Var.f6792d = sb3.toString();
                    d9Var.a();
                }
            }
        }
    }
}
