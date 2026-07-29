package com.applovin.impl.sdk.d;

import android.net.Uri;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.network.b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.youappi.sdk.net.model.VideoEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.g f3082a;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdLoadListener f3083c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f3084d;
    private final Collection<Character> e;
    private final com.applovin.impl.sdk.c.e f;

    c(String str, com.applovin.impl.sdk.ad.g gVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, jVar);
        if (gVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f3082a = gVar;
        this.f3083c = appLovinAdLoadListener;
        this.f3084d = jVar.N();
        this.e = h();
        this.f = new com.applovin.impl.sdk.c.e();
    }

    private Uri a(Uri uri, String str) {
        StringBuilder sb;
        String str2;
        if (uri != null) {
            String uri2 = uri.toString();
            if (com.applovin.impl.sdk.e.i.b(uri2)) {
                a("Caching " + str + " image...");
                return f(uri2);
            }
            sb = new StringBuilder();
            sb.append("Failed to cache ");
            sb.append(str);
            str2 = " image";
        } else {
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        a(sb.toString());
        return null;
    }

    private String a(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String H = this.f3082a.H();
        if (com.applovin.impl.sdk.e.i.b(H)) {
            replace = H + replace;
        }
        File a2 = this.f3084d.a(replace, this.f3073b.w(), true);
        if (a2 == null) {
            return null;
        }
        if (a2.exists()) {
            this.f.b(a2.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3084d.a(a2, str + str2, Arrays.asList(str), this.f)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a2.getAbsolutePath());
        return sb.toString();
    }

    private Collection<Character> h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f3073b.a(com.applovin.impl.sdk.b.b.bo)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    Uri a(String str, List<String> list, boolean z) {
        String str2;
        try {
            if (com.applovin.impl.sdk.e.i.b(str)) {
                a("Caching video " + str + "...");
                String a2 = this.f3084d.a(d(), str, this.f3082a.H(), list, z, this.f);
                if (com.applovin.impl.sdk.e.i.b(a2)) {
                    File a3 = this.f3084d.a(a2, d(), false);
                    if (a3 != null) {
                        Uri fromFile = Uri.fromFile(a3);
                        if (fromFile != null) {
                            a("Finish caching video for ad #" + this.f3082a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a2);
                            return fromFile;
                        }
                        str2 = "Unable to create URI from cached video file = " + a3;
                    } else {
                        str2 = "Unable to cache video = " + str + "Video file was missing or null - please make sure your app has the WRITE_EXTERNAL_STORAGE permission!";
                    }
                } else if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.bt)).booleanValue()) {
                    d("Failed to cache video");
                    com.applovin.impl.sdk.e.l.a(this.f3083c, this.f3082a.getAdZone(), AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES, this.f3073b);
                    this.f3083c = null;
                } else {
                    str2 = "Failed to cache video, but not failing ad load";
                }
                d(str2);
            }
        } catch (Exception e) {
            a("Encountered exception while attempting to cache video.", e);
        }
        return null;
    }

    String a(String str, List<String> list) {
        return c(str, list, true);
    }

    String a(String str, List<String> list, com.applovin.impl.sdk.ad.g gVar) {
        int i;
        if (!com.applovin.impl.sdk.e.i.b(str)) {
            return str;
        }
        if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.bs)).booleanValue()) {
            a("Resource caching is disabled, skipping cache...");
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = gVar.shouldCancelHtmlCachingIfShown();
        for (String str2 : list) {
            int i2 = 0;
            for (int i3 = 0; i2 < sb.length() && (i2 = sb.indexOf(str2, i3)) != -1; i3 = i) {
                int length = sb.length();
                i = i2;
                while (!this.e.contains(Character.valueOf(sb.charAt(i))) && i < length) {
                    i++;
                }
                if (i <= i2 || i == length) {
                    d("Unable to cache resource; ad HTML is invalid.");
                    return str;
                }
                String substring = sb.substring(str2.length() + i2, i);
                if (!com.applovin.impl.sdk.e.i.b(substring)) {
                    a("Skip caching of non-resource " + substring);
                } else {
                    if (shouldCancelHtmlCachingIfShown && gVar.hasShown()) {
                        a("Cancelling HTML caching due to ad being shown already");
                        this.f.a();
                        return str;
                    }
                    String a2 = a(str2, substring);
                    if (a2 != null) {
                        sb.replace(i2, i, a2);
                        this.f.e();
                    } else {
                        this.f.f();
                    }
                }
            }
        }
        return sb.toString();
    }

    protected void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.c.d.a(this.f, appLovinAdBase, this.f3073b);
    }

    Uri b(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a2 = this.f3084d.a(d(), str, this.f3082a.H(), list, z, this.f);
            if (!com.applovin.impl.sdk.e.i.b(a2)) {
                return null;
            }
            File a3 = this.f3084d.a(a2, d(), false);
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    return fromFile;
                }
                str2 = "Unable to extract Uri from image file";
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a2;
            }
            d(str2);
            return null;
        } catch (MalformedURLException e) {
            a("Failed to cache image at url = " + str, e);
            return null;
        }
    }

    String c(String str, List<String> list, boolean z) {
        if (com.applovin.impl.sdk.e.i.b(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                a("Nothing to cache, skipping...");
                return null;
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (com.applovin.impl.sdk.e.i.b(this.f3082a.H())) {
                lastPathSegment = this.f3082a.H() + lastPathSegment;
            }
            File a2 = this.f3084d.a(lastPathSegment, d(), true);
            ByteArrayOutputStream a3 = (a2 == null || !a2.exists()) ? null : this.f3084d.a(a2);
            if (a3 == null) {
                a3 = this.f3084d.a(str, list, z);
                if (a3 != null) {
                    this.f3084d.a(a3, a2);
                    this.f.a(a3.size());
                }
            } else {
                this.f.b(a3.size());
            }
            try {
                return a3.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    Uri e(String str) {
        return a(str, this.f3082a.G(), true);
    }

    Uri f(String str) {
        return b(str, this.f3082a.G(), true);
    }

    void f() {
        a("Caching mute images...");
        Uri a2 = a(this.f3082a.av(), VideoEvent.EVENT_MUTE);
        if (a2 != null) {
            this.f3082a.b(a2);
        }
        Uri a3 = a(this.f3082a.aw(), VideoEvent.EVENT_UNMUTE);
        if (a3 != null) {
            this.f3082a.c(a3);
        }
        a("Ad updated with muteImageFilename = " + this.f3082a.av() + ", unmuteImageFilename = " + this.f3082a.aw());
    }

    String g(final String str) {
        if (!com.applovin.impl.sdk.e.i.b(str)) {
            return null;
        }
        com.applovin.impl.sdk.network.b a2 = com.applovin.impl.sdk.network.b.a(this.f3073b).a(str).b("GET").a((b.a) "").a(0).a();
        final AtomicReference atomicReference = new AtomicReference(null);
        this.f3073b.B().a(a2, new a.C0312a(), new a.b<String>() { // from class: com.applovin.impl.sdk.d.c.1
            @Override // com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                c.this.d("Failed to load resource from '" + str + "'");
            }

            @Override // com.applovin.impl.sdk.network.a.b
            public void a(String str2, int i) {
                atomicReference.set(str2);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f.a(str2.length());
        }
        return str2;
    }

    void g() {
        if (this.f3083c != null) {
            a("Rendered new ad:" + this.f3082a);
            this.f3083c.adReceived(this.f3082a);
            this.f3083c = null;
        }
    }
}
