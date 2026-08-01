package com.fortuneink.neonpad;

import B0.q;
import android.content.SharedPreferences;
import i1.r;
import i1.s;
import i1.y;
import i1.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import q1.l;

/* loaded from: classes.dex */
public final class MainActivity$fetchAndLoad$1 implements i1.e {
    final /* synthetic */ String $_prefsKey;
    final /* synthetic */ MainActivity this$0;

    public MainActivity$fetchAndLoad$1(MainActivity mainActivity, String str) {
        this.this$0 = mainActivity;
        this.$_prefsKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$2(String str, String str2, MainActivity mainActivity, String str3, String str4, String str5) {
        SharedPreferences prefs;
        if (e1.d.B0(str, str2)) {
            if (e1.d.B0(str3, str4)) {
                mainActivity.loadFallbackGame();
                return;
            } else {
                mainActivity.loadFallbackGame();
                return;
            }
        }
        prefs = mainActivity.getPrefs();
        X0.f.d(prefs, "access$getPrefs(...)");
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString(str5, str);
        edit.apply();
        mainActivity.redirectUrl = str;
        mainActivity.openExternal(str);
    }

    @Override // i1.e
    public void onFailure(i1.d dVar, IOException iOException) {
        X0.f.e(dVar, "call");
        X0.f.e(iOException, "e");
        MainActivity mainActivity = this.this$0;
        mainActivity.runOnUiThread(new q(9, mainActivity));
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
        final String d2;
        final String d3;
        String str;
        s sVar;
        Charset charset;
        String str2;
        X0.f.e(dVar, "call");
        X0.f.e(yVar, "response");
        d2 = this.this$0.d(new byte[]{1, 23, -92, -78, 19, 10, -91, -9, 18, 29, -96});
        d3 = this.this$0.d(new byte[]{84, 11, -94, -72, 2, 13, -91, -5, 76, 90, -71, -78, 84});
        final String str3 = yVar.f2792a.f2776a.h;
        z zVar = yVar.f2798g;
        if (zVar != null) {
            v1.h h = zVar.h();
            try {
                switch (zVar.f2803a) {
                    case 0:
                        sVar = (s) zVar.f2805c;
                        break;
                    default:
                        String str4 = (String) zVar.f2805c;
                        if (str4 != null) {
                            Pattern pattern = s.f2722c;
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
                    charset = e1.a.f2371a;
                    String[] strArr = sVar.f2725b;
                    int i = 0;
                    int F = l.F(0, strArr.length - 1, 2);
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
                charset = e1.a.f2371a;
                str = h.f(j1.b.q(h, charset));
                q1.d.l(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = this.this$0;
        final String str6 = this.$_prefsKey;
        mainActivity.runOnUiThread(new Runnable() { // from class: com.fortuneink.neonpad.i
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity$fetchAndLoad$1.onResponse$lambda$2(str3, d2, mainActivity, str5, d3, str6);
            }
        });
    }
}
