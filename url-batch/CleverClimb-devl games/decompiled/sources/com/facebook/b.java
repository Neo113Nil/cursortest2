package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.p;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccessTokenManager.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f6008a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalBroadcastManager f6009b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.a f6010c;

    /* renamed from: d, reason: collision with root package name */
    private AccessToken f6011d;
    private AtomicBoolean e = new AtomicBoolean(false);
    private Date f = new Date(0);

    b(LocalBroadcastManager localBroadcastManager, com.facebook.a aVar) {
        ac.a(localBroadcastManager, "localBroadcastManager");
        ac.a(aVar, "accessTokenCache");
        this.f6009b = localBroadcastManager;
        this.f6010c = aVar;
    }

    static b a() {
        if (f6008a == null) {
            synchronized (b.class) {
                if (f6008a == null) {
                    f6008a = new b(LocalBroadcastManager.getInstance(l.f()), new com.facebook.a());
                }
            }
        }
        return f6008a;
    }

    AccessToken b() {
        return this.f6011d;
    }

    boolean c() {
        AccessToken a2 = this.f6010c.a();
        if (a2 == null) {
            return false;
        }
        a(a2, false);
        return true;
    }

    void a(AccessToken accessToken) {
        a(accessToken, true);
    }

    private void a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f6011d;
        this.f6011d = accessToken;
        this.e.set(false);
        this.f = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f6010c.a(accessToken);
            } else {
                this.f6010c.b();
                ab.b(l.f());
            }
        }
        if (ab.a(accessToken2, accessToken)) {
            return;
        }
        a(accessToken2, accessToken);
    }

    private void a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f6009b.sendBroadcast(intent);
    }

    void d() {
        if (e()) {
            a((AccessToken.a) null);
        }
    }

    private boolean e() {
        if (this.f6011d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        return this.f6011d.getSource().a() && valueOf.longValue() - this.f.getTime() > 3600000 && valueOf.longValue() - this.f6011d.getLastRefresh().getTime() > 86400000;
    }

    private static GraphRequest a(AccessToken accessToken, GraphRequest.b bVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), s.GET, bVar);
    }

    private static GraphRequest b(AccessToken accessToken, GraphRequest.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new GraphRequest(accessToken, "oauth/access_token", bundle, s.GET, bVar);
    }

    /* compiled from: AccessTokenManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f6024a;

        /* renamed from: b, reason: collision with root package name */
        public int f6025b;

        private a() {
        }
    }

    void a(final AccessToken.a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.b(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AccessToken.a aVar) {
        final AccessToken accessToken = this.f6011d;
        if (accessToken == null) {
            if (aVar != null) {
                aVar.a(new j("No current access token to refresh"));
            }
        } else {
            if (!this.e.compareAndSet(false, true)) {
                if (aVar != null) {
                    aVar.a(new j("Refresh already in progress"));
                    return;
                }
                return;
            }
            this.f = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final a aVar2 = new a();
            p pVar = new p(a(accessToken, new GraphRequest.b() { // from class: com.facebook.b.2
                @Override // com.facebook.GraphRequest.b
                public void a(q qVar) {
                    JSONArray optJSONArray;
                    JSONObject b2 = qVar.b();
                    if (b2 == null || (optJSONArray = b2.optJSONArray("data")) == null) {
                        return;
                    }
                    atomicBoolean.set(true);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString("status");
                            if (!ab.a(optString) && !ab.a(optString2)) {
                                String lowerCase = optString2.toLowerCase(Locale.US);
                                if (lowerCase.equals("granted")) {
                                    hashSet.add(optString);
                                } else if (lowerCase.equals("declined")) {
                                    hashSet2.add(optString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                                }
                            }
                        }
                    }
                }
            }), b(accessToken, new GraphRequest.b() { // from class: com.facebook.b.3
                @Override // com.facebook.GraphRequest.b
                public void a(q qVar) {
                    JSONObject b2 = qVar.b();
                    if (b2 == null) {
                        return;
                    }
                    aVar2.f6024a = b2.optString("access_token");
                    aVar2.f6025b = b2.optInt("expires_at");
                }
            }));
            pVar.a(new p.a() { // from class: com.facebook.b.4
                @Override // com.facebook.p.a
                public void a(p pVar2) {
                    AccessToken accessToken2 = null;
                    try {
                        if (b.a().b() != null && b.a().b().getUserId() == accessToken.getUserId()) {
                            if (!atomicBoolean.get() && aVar2.f6024a == null && aVar2.f6025b == 0) {
                                if (aVar != null) {
                                    aVar.a(new j("Failed to refresh access token"));
                                }
                                b.this.e.set(false);
                                AccessToken.a aVar3 = aVar;
                                return;
                            }
                            AccessToken accessToken3 = new AccessToken(aVar2.f6024a != null ? aVar2.f6024a : accessToken.getToken(), accessToken.getApplicationId(), accessToken.getUserId(), atomicBoolean.get() ? hashSet : accessToken.getPermissions(), atomicBoolean.get() ? hashSet2 : accessToken.getDeclinedPermissions(), accessToken.getSource(), aVar2.f6025b != 0 ? new Date(aVar2.f6025b * 1000) : accessToken.getExpires(), new Date());
                            try {
                                b.a().a(accessToken3);
                                b.this.e.set(false);
                                if (aVar != null) {
                                    aVar.a(accessToken3);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                accessToken2 = accessToken3;
                                b.this.e.set(false);
                                if (aVar != null && accessToken2 != null) {
                                    aVar.a(accessToken2);
                                }
                                throw th;
                            }
                        }
                        if (aVar != null) {
                            aVar.a(new j("No current access token to refresh"));
                        }
                        b.this.e.set(false);
                        AccessToken.a aVar4 = aVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            });
            pVar.h();
        }
    }
}
