package defpackage;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gy0 {
    public static final kx0[] a;
    public static final Map b;

    static {
        kx0 kx0Var = new kx0(kx0.i, BuildConfig.FLAVOR);
        dr drVar = kx0.f;
        kx0 kx0Var2 = new kx0(drVar, "GET");
        kx0 kx0Var3 = new kx0(drVar, "POST");
        dr drVar2 = kx0.g;
        kx0 kx0Var4 = new kx0(drVar2, "/");
        kx0 kx0Var5 = new kx0(drVar2, "/index.html");
        dr drVar3 = kx0.h;
        kx0 kx0Var6 = new kx0(drVar3, "http");
        kx0 kx0Var7 = new kx0(drVar3, TournamentShareDialogURIBuilder.scheme);
        dr drVar4 = kx0.e;
        kx0[] kx0VarArr = {kx0Var, kx0Var2, kx0Var3, kx0Var4, kx0Var5, kx0Var6, kx0Var7, new kx0(drVar4, "200"), new kx0(drVar4, "204"), new kx0(drVar4, "206"), new kx0(drVar4, "304"), new kx0(drVar4, "400"), new kx0(drVar4, "404"), new kx0(drVar4, "500"), new kx0("accept-charset", BuildConfig.FLAVOR), new kx0("accept-encoding", "gzip, deflate"), new kx0("accept-language", BuildConfig.FLAVOR), new kx0("accept-ranges", BuildConfig.FLAVOR), new kx0("accept", BuildConfig.FLAVOR), new kx0("access-control-allow-origin", BuildConfig.FLAVOR), new kx0("age", BuildConfig.FLAVOR), new kx0("allow", BuildConfig.FLAVOR), new kx0("authorization", BuildConfig.FLAVOR), new kx0("cache-control", BuildConfig.FLAVOR), new kx0("content-disposition", BuildConfig.FLAVOR), new kx0("content-encoding", BuildConfig.FLAVOR), new kx0("content-language", BuildConfig.FLAVOR), new kx0("content-length", BuildConfig.FLAVOR), new kx0("content-location", BuildConfig.FLAVOR), new kx0("content-range", BuildConfig.FLAVOR), new kx0("content-type", BuildConfig.FLAVOR), new kx0("cookie", BuildConfig.FLAVOR), new kx0("date", BuildConfig.FLAVOR), new kx0("etag", BuildConfig.FLAVOR), new kx0("expect", BuildConfig.FLAVOR), new kx0("expires", BuildConfig.FLAVOR), new kx0(Constants.MessagePayloadKeys.FROM, BuildConfig.FLAVOR), new kx0("host", BuildConfig.FLAVOR), new kx0("if-match", BuildConfig.FLAVOR), new kx0("if-modified-since", BuildConfig.FLAVOR), new kx0("if-none-match", BuildConfig.FLAVOR), new kx0("if-range", BuildConfig.FLAVOR), new kx0("if-unmodified-since", BuildConfig.FLAVOR), new kx0("last-modified", BuildConfig.FLAVOR), new kx0("link", BuildConfig.FLAVOR), new kx0(FirebaseAnalytics.Param.LOCATION, BuildConfig.FLAVOR), new kx0("max-forwards", BuildConfig.FLAVOR), new kx0("proxy-authenticate", BuildConfig.FLAVOR), new kx0("proxy-authorization", BuildConfig.FLAVOR), new kx0("range", BuildConfig.FLAVOR), new kx0("referer", BuildConfig.FLAVOR), new kx0("refresh", BuildConfig.FLAVOR), new kx0("retry-after", BuildConfig.FLAVOR), new kx0("server", BuildConfig.FLAVOR), new kx0("set-cookie", BuildConfig.FLAVOR), new kx0("strict-transport-security", BuildConfig.FLAVOR), new kx0("transfer-encoding", BuildConfig.FLAVOR), new kx0("user-agent", BuildConfig.FLAVOR), new kx0("vary", BuildConfig.FLAVOR), new kx0("via", BuildConfig.FLAVOR), new kx0("www-authenticate", BuildConfig.FLAVOR)};
        a = kx0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(kx0VarArr[i].a)) {
                linkedHashMap.put(kx0VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(dr drVar) {
        drVar.getClass();
        int c = drVar.c();
        for (int i = 0; i < c; i++) {
            byte h = drVar.h(i);
            if (65 <= h && h < 91) {
                dm0.j("PROTOCOL_ERROR response malformed: mixed case name: ".concat(drVar.p()));
                return;
            }
        }
    }
}
