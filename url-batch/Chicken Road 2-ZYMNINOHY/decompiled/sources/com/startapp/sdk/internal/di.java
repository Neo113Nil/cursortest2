package com.startapp.sdk.internal;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TopicsClientMetadata;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6816a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6817b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f6818c;

    /* renamed from: d, reason: collision with root package name */
    public final p5 f6819d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f6820e = new AtomicReference();

    public di(Context context, ib ibVar, ib ibVar2, p5 p5Var) {
        this.f6816a = context;
        this.f6817b = ibVar;
        this.f6818c = ibVar2;
        this.f6819d = p5Var;
    }

    public final void a() {
        int extensionVersion;
        int extensionVersion2;
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        if (Build.VERSION.SDK_INT >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion >= 4) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                if (extensionVersion2 >= 5) {
                    try {
                        this.f6819d.getClass();
                        TopicsClientMetadata b02 = MetaData.E().b0();
                        if (b02 == null || !si.a(b02.a())) {
                            return;
                        }
                        TopicsManager m4 = E.c0.m(this.f6816a.getSystemService(E.c0.p()));
                        E.c0.r();
                        adsSdkName = E.c0.g().setAdsSdkName(this.f6816a.getPackageName());
                        shouldRecordObservation = adsSdkName.setShouldRecordObservation(true);
                        build = shouldRecordObservation.build();
                        m4.getTopics(build, (Executor) this.f6818c.a(), new ci(this));
                    } catch (Throwable th) {
                        if (a(2)) {
                            d9.a(th);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        k8 k8Var = (k8) this.f6817b.a();
        k8Var.f7181a.post(new R1.n(19, this));
    }

    public final boolean a(int i4) {
        this.f6819d.getClass();
        TopicsClientMetadata b02 = MetaData.E().b0();
        ComponentInfoEventConfig b4 = b02 != null ? b02.b() : null;
        return b4 != null && b4.a((long) i4);
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(str);
            sb.append('M');
            sb.append(((Pair) entry.getKey()).first);
            sb.append('T');
            sb.append(((Pair) entry.getKey()).second);
            String str2 = StringUtils.PROCESS_POSTFIX_DELIMITER;
            for (Integer num : (Set) entry.getValue()) {
                sb.append(str2);
                sb.append(num);
                str2 = StringUtils.COMMA;
            }
            str = ";";
        }
        return sb.length() > 0 ? sb.toString() : "NONE";
    }
}
