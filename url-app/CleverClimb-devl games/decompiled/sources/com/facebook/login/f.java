package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.ac;
import com.facebook.internal.e;
import com.facebook.internal.m;
import com.facebook.j;
import com.facebook.l;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: LoginManager.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f6267a = a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f6268b;

    /* renamed from: c, reason: collision with root package name */
    private d f6269c = d.NATIVE_WITH_FALLBACK;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.login.a f6270d = com.facebook.login.a.FRIENDS;

    f() {
        ac.a();
    }

    public static f c() {
        if (f6268b == null) {
            synchronized (f.class) {
                if (f6268b == null) {
                    f6268b = new f();
                }
            }
        }
        return f6268b;
    }

    boolean a(int i, Intent intent) {
        return a(i, intent, null);
    }

    boolean a(int i, Intent intent, com.facebook.h<g> hVar) {
        LoginClient.Result.a aVar;
        LoginClient.Request request;
        AccessToken accessToken;
        Map<String, String> map;
        boolean z;
        AccessToken accessToken2;
        Map<String, String> map2;
        LoginClient.Request request2;
        LoginClient.Result.a aVar2 = LoginClient.Result.a.ERROR;
        j jVar = null;
        boolean z2 = false;
        if (intent != null) {
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request3 = result.request;
                LoginClient.Result.a aVar3 = result.code;
                if (i == -1) {
                    if (result.code == LoginClient.Result.a.SUCCESS) {
                        accessToken2 = result.token;
                    } else {
                        jVar = new com.facebook.f(result.errorMessage);
                        accessToken2 = null;
                    }
                } else if (i == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.loggingExtras;
                request2 = request3;
                aVar2 = aVar3;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            LoginClient.Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i == 0) {
            aVar = LoginClient.Result.a.CANCEL;
            request = null;
            accessToken = null;
            map = null;
            z = true;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (jVar == null && accessToken == null && !z) {
            jVar = new j("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, aVar, map, jVar, true, request);
        a(accessToken, request, jVar, z, hVar);
        return true;
    }

    public f a(d dVar) {
        this.f6269c = dVar;
        return this;
    }

    public f a(com.facebook.login.a aVar) {
        this.f6270d = aVar;
        return this;
    }

    public void d() {
        AccessToken.setCurrentAccessToken(null);
        Profile.setCurrentProfile(null);
    }

    public void a(Fragment fragment, Collection<String> collection) {
        a(new m(fragment), collection);
    }

    public void a(android.app.Fragment fragment, Collection<String> collection) {
        a(new m(fragment), collection);
    }

    private void a(m mVar, Collection<String> collection) {
        b(collection);
        a(new b(mVar), a(collection));
    }

    public void a(Activity activity, Collection<String> collection) {
        b(collection);
        a(new a(activity), a(collection));
    }

    public void b(Fragment fragment, Collection<String> collection) {
        b(new m(fragment), collection);
    }

    public void b(android.app.Fragment fragment, Collection<String> collection) {
        b(new m(fragment), collection);
    }

    private void b(m mVar, Collection<String> collection) {
        c(collection);
        a(new b(mVar), a(collection));
    }

    public void b(Activity activity, Collection<String> collection) {
        c(collection);
        a(new a(activity), a(collection));
    }

    private void b(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (a(str)) {
                throw new j(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
            }
        }
    }

    private void c(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!a(str)) {
                throw new j(String.format("Cannot pass a read permission (%s) to a request for publish authorization", str));
            }
        }
    }

    static boolean a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f6267a.contains(str));
    }

    private static Set<String> a() {
        return Collections.unmodifiableSet(new HashSet<String>() { // from class: com.facebook.login.f.1
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
        });
    }

    protected LoginClient.Request a(Collection<String> collection) {
        LoginClient.Request request = new LoginClient.Request(this.f6269c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f6270d, l.i(), UUID.randomUUID().toString());
        request.setRerequest(AccessToken.getCurrentAccessToken() != null);
        return request;
    }

    private void a(h hVar, LoginClient.Request request) throws j {
        a(hVar.a(), request);
        com.facebook.internal.e.a(e.b.Login.a(), new e.a() { // from class: com.facebook.login.f.2
            @Override // com.facebook.internal.e.a
            public boolean a(int i, Intent intent) {
                return f.this.a(i, intent);
            }
        });
        if (b(hVar, request)) {
            return;
        }
        j jVar = new j("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        a(hVar.a(), LoginClient.Result.a.ERROR, null, jVar, false, request);
        throw jVar;
    }

    private void a(Context context, LoginClient.Request request) {
        e b2 = c.b(context);
        if (b2 == null || request == null) {
            return;
        }
        b2.a(request);
    }

    private void a(Context context, LoginClient.Result.a aVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        e b2 = c.b(context);
        if (b2 == null) {
            return;
        }
        if (request == null) {
            b2.b("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : "0");
        b2.a(request.getAuthId(), hashMap, aVar, map, exc);
    }

    private boolean b(h hVar, LoginClient.Request request) {
        Intent a2 = a(request);
        if (!a(a2)) {
            return false;
        }
        try {
            hVar.a(a2, LoginClient.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private boolean a(Intent intent) {
        return l.f().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private Intent a(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(l.f(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtras(bundle);
        return intent;
    }

    static g a(LoginClient.Request request, AccessToken accessToken) {
        Set<String> permissions = request.getPermissions();
        HashSet hashSet = new HashSet(accessToken.getPermissions());
        if (request.isRerequest()) {
            hashSet.retainAll(permissions);
        }
        HashSet hashSet2 = new HashSet(permissions);
        hashSet2.removeAll(hashSet);
        return new g(accessToken, hashSet, hashSet2);
    }

    private void a(AccessToken accessToken, LoginClient.Request request, j jVar, boolean z, com.facebook.h<g> hVar) {
        if (accessToken != null) {
            AccessToken.setCurrentAccessToken(accessToken);
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (hVar != null) {
            g a2 = accessToken != null ? a(request, accessToken) : null;
            if (z || (a2 != null && a2.a().size() == 0)) {
                hVar.a();
            } else if (jVar != null) {
                hVar.a(jVar);
            } else if (accessToken != null) {
                hVar.a((com.facebook.h<g>) a2);
            }
        }
    }

    public static void a(Intent intent, Bundle bundle) {
        LoginClient.Request request = (LoginClient.Request) intent.getExtras().getParcelable("request");
        intent.putExtra("com.facebook.LoginFragment:Result", LoginClient.Result.createTokenResult(request, LoginMethodHandler.createAccessTokenFromWebBundle(request.getPermissions(), bundle, com.facebook.c.CHROME_CUSTOM_TAB, request.getApplicationId())));
    }

    /* compiled from: LoginManager.java */
    private static class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f6272a;

        a(Activity activity) {
            ac.a(activity, "activity");
            this.f6272a = activity;
        }

        @Override // com.facebook.login.h
        public void a(Intent intent, int i) {
            this.f6272a.startActivityForResult(intent, i);
        }

        @Override // com.facebook.login.h
        public Activity a() {
            return this.f6272a;
        }
    }

    /* compiled from: LoginManager.java */
    private static class b implements h {

        /* renamed from: a, reason: collision with root package name */
        private final m f6273a;

        b(m mVar) {
            ac.a(mVar, "fragment");
            this.f6273a = mVar;
        }

        @Override // com.facebook.login.h
        public void a(Intent intent, int i) {
            this.f6273a.a(intent, i);
        }

        @Override // com.facebook.login.h
        public Activity a() {
            return this.f6273a.c();
        }
    }

    /* compiled from: LoginManager.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static volatile e f6274a;

        /* JADX INFO: Access modifiers changed from: private */
        public static synchronized e b(Context context) {
            synchronized (c.class) {
                if (context == null) {
                    context = l.f();
                }
                if (context == null) {
                    return null;
                }
                if (f6274a == null) {
                    f6274a = new e(context, l.i());
                }
                return f6274a;
            }
        }
    }
}
