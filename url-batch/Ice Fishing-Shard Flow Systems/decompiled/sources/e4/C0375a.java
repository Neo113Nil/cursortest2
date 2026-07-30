package e4;

import B.f;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import o4.b;
import o4.c;
import r4.l;
import s4.n;
import s4.o;
import s4.p;
import s4.q;

@Metadata
/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375a implements c, o {

    /* renamed from: d, reason: collision with root package name */
    public Context f4706d;

    /* renamed from: e, reason: collision with root package name */
    public q f4707e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4708i = new ArrayList(1);

    /* renamed from: l, reason: collision with root package name */
    public InstallReferrerClient f4709l;

    /* renamed from: m, reason: collision with root package name */
    public ReferrerDetails f4710m;

    /* renamed from: n, reason: collision with root package name */
    public Pair f4711n;

    public final synchronized void a(p pVar) {
        ReferrerDetails referrerDetails = this.f4710m;
        if (referrerDetails != null) {
            pVar.success(I.e(new Pair("installReferrer", referrerDetails.getInstallReferrer()), new Pair("referrerClickTimestampSeconds", Long.valueOf(referrerDetails.getReferrerClickTimestampSeconds())), new Pair("installBeginTimestampSeconds", Long.valueOf(referrerDetails.getInstallBeginTimestampSeconds())), new Pair("referrerClickTimestampServerSeconds", Long.valueOf(referrerDetails.getReferrerClickTimestampServerSeconds())), new Pair("installBeginTimestampServerSeconds", Long.valueOf(referrerDetails.getInstallBeginTimestampServerSeconds())), new Pair("installVersion", referrerDetails.getInstallVersion()), new Pair("googlePlayInstantParam", Boolean.valueOf(referrerDetails.getGooglePlayInstantParam()))));
            return;
        }
        Pair pair = this.f4711n;
        if (pair != null) {
            pVar.error((String) pair.f6112d, (String) pair.f6113e, null);
        }
    }

    @Override // o4.c
    public final void onAttachedToEngine(b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f7120a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f4706d = context;
        q qVar = new q(flutterPluginBinding.f7122c, "de.lschmierer.android_play_install_referrer");
        this.f4707e = qVar;
        qVar.b(this);
    }

    @Override // o4.c
    public final synchronized void onDetachedFromEngine(b binding) {
        try {
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f4708i.clear();
            InstallReferrerClient installReferrerClient = this.f4709l;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
            q qVar = this.f4707e;
            if (qVar == null) {
                Intrinsics.h(AppsFlyerProperties.CHANNEL);
                throw null;
            }
            qVar.b(null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r3 != false) goto L39;
     */
    @Override // s4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(n call, p result) {
        boolean z7;
        boolean z8;
        boolean z9;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.a(call.f7767a, "getInstallReferrer")) {
            ((l) result).notImplemented();
            return;
        }
        synchronized (this) {
            try {
                synchronized (this) {
                    z7 = true;
                    if (this.f4710m == null) {
                        if (this.f4711n == null) {
                            z8 = false;
                        }
                    }
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            a(result);
        } else {
            this.f4708i.add(result);
            synchronized (this) {
                if (this.f4709l != null) {
                    synchronized (this) {
                        if (this.f4710m == null) {
                            if (this.f4711n == null) {
                                z9 = false;
                            }
                        }
                        z9 = true;
                    }
                }
                z7 = false;
                if (!z7) {
                    Context context = this.f4706d;
                    if (context == null) {
                        Intrinsics.h("context");
                        throw null;
                    }
                    InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                    this.f4709l = build;
                    if (build != null) {
                        build.startConnection(new f(21, this));
                    }
                }
            }
        }
    }
}
