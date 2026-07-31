package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public abstract class l5 extends i5 implements v3.a {
    protected final com.applovin.impl.sdk.ad.b g;
    private AppLovinAdLoadListener h;
    protected final String i;
    private final com.applovin.impl.sdk.m j;
    private final Collection k;
    private boolean l;
    protected ExecutorService m;
    protected ExecutorService n;
    protected List o;
    private d0 p;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.c.a(l5Var.b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements e0.a {
        b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.c.a(l5Var.b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements e0.a {
        final /* synthetic */ e0.a a;

        c(e0.a aVar) {
            this.a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.c.b(l5Var.b, "Failed to cache video");
                }
                l5.this.a(-202);
                Bundle bundle = new Bundle();
                bundle.putLong(CreativeInfo.c, l5.this.g.getAdIdNumber());
                l5.this.a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.c.a(l5Var2.b, "Finish caching video for ad #" + l5.this.g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.a.a(uri);
        }
    }

    class d implements d0.c {
        final /* synthetic */ e a;

        d(e eVar) {
            this.a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z) {
            if (z) {
                l5.this.a(-203);
                return;
            }
            e eVar = this.a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.g = bVar;
        this.h = appLovinAdLoadListener;
        this.j = kVar.G();
        this.k = h();
        if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
            if (kVar.q0().e()) {
                this.m = kVar.q0().a();
                this.n = kVar.q0().d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
            this.m = kVar.q0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) kVar.a(x4.K0)).intValue());
            this.n = kVar.q0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) kVar.a(x4.L0)).intValue());
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.g);
            this.h = null;
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Updating flag for timeout...");
            }
            g();
        }
        this.a.Z().b(this);
    }

    protected e0 b(String str, e0.a aVar) {
        return a(str, this.g.S(), true, aVar);
    }

    Uri c(String str) {
        return b(str, this.g.S(), true);
    }

    protected List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.g.G() != null) {
            arrayList.add(a(this.g.G().toString(), new a()));
        }
        if (this.g.Y() != null) {
            arrayList.add(a(this.g.Y().toString(), new b()));
        }
        return arrayList;
    }

    void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Rendered new ad:" + this.g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l5.this.i();
            }
        });
    }

    protected void g() {
        this.l = true;
        List list = this.o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.a.q0().e()) {
            d0 d0Var = this.p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.m;
        if (executorService != null) {
            executorService.shutdown();
            this.m = null;
        }
        ExecutorService executorService2 = this.n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.n = null;
        }
    }

    void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        Uri a2 = a(this.g.G(), "mute");
        if (a2 != null) {
            this.g.a(a2);
        }
        Uri a3 = a(this.g.Y(), "unmute");
        if (a3 != null) {
            this.g.b(a3);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Ad updated with muteImageFilename = " + this.g.G() + ", unmuteImageFilename = " + this.g.Y());
        }
    }

    protected void k() {
        this.a.Z().b(this);
        if (!this.a.q0().e()) {
            ExecutorService executorService = this.m;
            if (executorService != null) {
                executorService.shutdown();
                this.m = null;
            }
            ExecutorService executorService2 = this.n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.n = null;
            }
        }
        MaxAdFormat d2 = this.g.getAdZone().d();
        if (((Boolean) this.a.a(x4.X0)).booleanValue() && d2 != null && d2.isFullscreenAd()) {
            this.a.h().b(this.g);
        }
        this.a.d0().a(this.i);
    }

    protected boolean l() {
        return this.l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Subscribing to timeout events...");
            }
            this.a.Z().a(this);
        }
    }

    Uri b(String str, List list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        int a2 = this.a.G().a(str, this.g);
        Map a3 = f2.a((AppLovinAdImpl) this.g);
        String a4 = this.j.a(a(), str, this.g.getCachePrefix(), list, z, a2, this.i, a3);
        if (!StringUtils.isValidString(a4)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", a3);
            a(-202);
            return null;
        }
        File a5 = this.j.a(a4, a());
        if (a5 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached video filename = " + a4);
            }
            a(a4, "retrieveVideoFile", a3);
            return null;
        }
        Uri fromFile = Uri.fromFile(a5);
        if (fromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to create URI from cached video file = " + a5);
            }
            a(a4, "extractUriFromVideoFile", a3);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finish caching video for ad #" + this.g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a4);
        }
        return fromFile;
    }

    protected String c(String str, List list, boolean z) {
        try {
            InputStream a2 = this.j.a(str, list, z, f2.a((AppLovinAdImpl) this.g));
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            try {
                String a3 = this.j.a(a2);
                a2.close();
                return a3;
            } finally {
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unknown failure to read input stream.", th);
            }
            this.c.a(this.b, th);
            this.a.D().a(this.b, "readInputStreamAsString", th);
            return null;
        }
    }

    protected List a(List list) {
        this.o = list;
        return this.a.q0().a(list, this.m);
    }

    protected e0 a(String str, e0.a aVar) {
        return new e0(str, this.g, this.i, this.a, aVar);
    }

    protected e0 a(String str, List list, boolean z, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.c.a(this.b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        return new e0(str, this.g, list, z, this.i, this.a, new c(aVar));
    }

    protected d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.g, list, this.n, this.i, this.a, new d(eVar));
        this.p = d0Var;
        return d0Var;
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "No " + str + " image to cache");
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching " + str + " image...");
        }
        return b(uri2);
    }

    Uri a(String str, List list, boolean z) {
        try {
            int a2 = this.a.G().a(str, this.g);
            Map a3 = f2.a((AppLovinAdImpl) this.g);
            String a4 = this.j.a(a(), str, this.g.getCachePrefix(), list, z, a2, this.i, a3);
            if (StringUtils.isValidString(a4)) {
                File a5 = this.j.a(a4, a());
                if (a5 != null) {
                    Uri fromFile = Uri.fromFile(a5);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.b(this.b, "Unable to extract Uri from image file");
                    }
                    a(a4, "extractUriFromImageFile", a3);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Unable to retrieve File from cached image filename = " + a4);
                }
                a(a4, "retrieveImageFile", a3);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", a3);
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to cache image at url = " + str, th);
            }
            Map a6 = f2.a((AppLovinAdImpl) this.g);
            CollectionUtils.putStringIfValid("url", str, a6);
            this.a.D().a(this.b, "cacheImageResource", th, a6);
            return null;
        }
    }

    protected Uri b(String str) {
        return a(str, this.g.S(), true);
    }

    void a(com.applovin.impl.sdk.ad.b bVar) {
        String a0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(a0)) {
            String a2 = a(a0, bVar.S(), bVar);
            bVar.c(a2);
            this.c.f(this.b, "Ad updated with video button HTML assets cached = " + a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        List Q = bVar.Q();
        List H = bVar.H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i = 0;
            int i2 = 0;
            while (i < sb.length()) {
                if (l()) {
                    return str;
                }
                i = sb.indexOf(str2, i2);
                if (i == -1) {
                    break;
                }
                int length = sb.length();
                int i3 = i;
                while (!this.k.contains(Character.valueOf(sb.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 > i && i3 != length) {
                    String substring = sb.substring(str2.length() + i, i3);
                    String str3 = str2 + substring;
                    if (StringUtils.isValidString(substring) && !H.contains(str3)) {
                        Uri a2 = a(str2, substring);
                        if (a2 != null) {
                            sb.replace(i, i3, a2.toString());
                            bVar.a(a2.toString(), str3);
                        } else {
                            if (Q.contains(str3)) {
                                a(-203);
                                this.l = true;
                            }
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.b(this.b, "Failed to cache HTML Resource: " + str3);
                            }
                            a(str3, "cacheHtmlResource", f2.a((AppLovinAdImpl) bVar));
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Skip caching of optional or non-resource: " + substring);
                    }
                    i2 = i3;
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        return sb.toString();
    }

    private Uri a(String str, String str2) {
        File a2 = this.j.a(n7.a(Uri.parse(str2), this.g.getCachePrefix(), this.a), com.applovin.impl.sdk.k.o());
        if (a2 == null) {
            return null;
        }
        if (!((Boolean) this.a.a(x4.Q6)).booleanValue() && this.j.a(a2)) {
            return Uri.parse("file://" + a2.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.j.a(a2, str3, Arrays.asList(str), this.a.G().a(str3, this.g), this.i, f2.a((AppLovinAdImpl) this.g))) {
            return null;
        }
        return Uri.parse("file://" + a2.getAbsolutePath());
    }

    void a(int i) {
        if (this.h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Calling back ad load failed with error code: " + i);
            }
            this.h.failedToReceiveAd(i);
            this.h = null;
        }
        g();
    }

    protected void a(String str, String str2, Map map) {
        HashMap hashMap = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, hashMap);
        this.a.D().a(d2.M0, str2, hashMap);
    }
}
