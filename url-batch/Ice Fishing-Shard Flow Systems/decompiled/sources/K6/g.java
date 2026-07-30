package K6;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0133d[] f1524a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1525b;

    static {
        C0133d c0133d = new C0133d(C0133d.f1505i, "");
        T6.i iVar = C0133d.f1502f;
        C0133d c0133d2 = new C0133d(iVar, "GET");
        C0133d c0133d3 = new C0133d(iVar, "POST");
        T6.i iVar2 = C0133d.f1503g;
        C0133d c0133d4 = new C0133d(iVar2, "/");
        C0133d c0133d5 = new C0133d(iVar2, "/index.html");
        T6.i iVar3 = C0133d.f1504h;
        C0133d c0133d6 = new C0133d(iVar3, "http");
        C0133d c0133d7 = new C0133d(iVar3, "https");
        T6.i iVar4 = C0133d.f1501e;
        C0133d[] c0133dArr = {c0133d, c0133d2, c0133d3, c0133d4, c0133d5, c0133d6, c0133d7, new C0133d(iVar4, "200"), new C0133d(iVar4, "204"), new C0133d(iVar4, "206"), new C0133d(iVar4, "304"), new C0133d(iVar4, "400"), new C0133d(iVar4, "404"), new C0133d(iVar4, "500"), new C0133d("accept-charset", ""), new C0133d("accept-encoding", "gzip, deflate"), new C0133d("accept-language", ""), new C0133d("accept-ranges", ""), new C0133d("accept", ""), new C0133d("access-control-allow-origin", ""), new C0133d("age", ""), new C0133d("allow", ""), new C0133d("authorization", ""), new C0133d("cache-control", ""), new C0133d("content-disposition", ""), new C0133d("content-encoding", ""), new C0133d("content-language", ""), new C0133d("content-length", ""), new C0133d("content-location", ""), new C0133d("content-range", ""), new C0133d("content-type", ""), new C0133d("cookie", ""), new C0133d("date", ""), new C0133d("etag", ""), new C0133d("expect", ""), new C0133d("expires", ""), new C0133d("from", ""), new C0133d(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C0133d("if-match", ""), new C0133d("if-modified-since", ""), new C0133d("if-none-match", ""), new C0133d("if-range", ""), new C0133d("if-unmodified-since", ""), new C0133d("last-modified", ""), new C0133d("link", ""), new C0133d("location", ""), new C0133d("max-forwards", ""), new C0133d("proxy-authenticate", ""), new C0133d("proxy-authorization", ""), new C0133d("range", ""), new C0133d("referer", ""), new C0133d("refresh", ""), new C0133d("retry-after", ""), new C0133d("server", ""), new C0133d("set-cookie", ""), new C0133d("strict-transport-security", ""), new C0133d("transfer-encoding", ""), new C0133d("user-agent", ""), new C0133d("vary", ""), new C0133d("via", ""), new C0133d("www-authenticate", "")};
        f1524a = c0133dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c0133dArr[i2].f1506a)) {
                linkedHashMap.put(c0133dArr[i2].f1506a, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        f1525b = unmodifiableMap;
    }

    public static void a(T6.i name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int a7 = name.a();
        for (int i2 = 0; i2 < a7; i2++) {
            byte d7 = name.d(i2);
            if (65 <= d7 && d7 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.k()));
            }
        }
    }
}
