package V6;

import A0.j;
import C4.p;
import E.d;
import F.k;
import I.C0127x;
import L.f;
import P.C0140e;
import P.InterfaceC0138c;
import P.InterfaceC0144i;
import P.Q;
import P.V;
import P.W;
import R5.l;
import R5.m;
import R5.n;
import Z3.c;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import androidx.work.impl.WorkDatabase;
import d4.C0363a;
import f.C0382a;
import h0.C0465k;
import h3.InterfaceC0475b;
import h3.InterfaceC0479f;
import h3.g;
import h3.i;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.e;
import n6.AbstractC0768a;
import o5.C0804b;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.h;
import s6.AbstractC0898a;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2764a;

    public /* synthetic */ b(int i2) {
        this.f2764a = i2;
    }

    public static k A(k[] kVarArr, int i2) {
        int i5 = (i2 & 1) == 0 ? 400 : 700;
        boolean z7 = (i2 & 2) != 0;
        k kVar = null;
        int i7 = Integer.MAX_VALUE;
        for (k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f746c - i5) * 2) + (kVar2.f747d == z7 ? 0 : 1);
            if (kVar == null || i7 > abs) {
                kVar = kVar2;
                i7 = abs;
            }
        }
        return kVar;
    }

    public static boolean B(float f7, float f8) {
        if ((f7 == 0.0f ? 0.0f : f7) == (f8 != 0.0f ? f8 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f7) && Float.isNaN(f8);
    }

    public static Object C(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0382a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0127x D(Display display, int i2) {
        RoundedCorner roundedCorner;
        int position;
        int i5;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i5 = 1;
            if (position != 1) {
                i5 = 2;
                if (position != 2) {
                    i5 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(p.g(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i5 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new C0127x(i5, radius, center);
    }

    public static final List E(String name, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list instanceof d4.d) {
            list = ((d4.d) list).f4661e;
        }
        if (list == A.f6115d || (list instanceof C0363a)) {
            return list;
        }
        C0363a c0363a = new C0363a(list);
        if (c0363a.contains(null)) {
            throw new IllegalArgumentException(name.concat(".contains(null)").toString());
        }
        return c0363a;
    }

    public static final d4.d F() {
        return new d4.d(A.f6115d);
    }

    public static final boolean I(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.a(method, "GET") || Intrinsics.a(method, "HEAD")) ? false : true;
    }

    public static final Cursor J(WorkDatabase db, C0465k sqLiteQuery) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return db.m(sqLiteQuery);
    }

    public static void K(e eVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i5 = eVar.f6281g;
                    int i7 = eVar.f6280f;
                    if (integer != 90 && integer != 270) {
                        i7 = i5;
                        i5 = i7;
                    }
                    eVar.f6276b = i5;
                    eVar.f6275a = i7;
                    eVar.f6277c = integer;
                    return;
                }
            }
        } catch (Exception e7) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e7);
        }
    }

    public static final String M(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i2 = 0; i2 < value.length(); i2++) {
            char charAt = value.charAt(i2);
            if (StringsKt.v(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final void N(Function2 function2, AbstractC0768a abstractC0768a, AbstractC0768a abstractC0768a2) {
        try {
            V5.b b7 = W5.d.b(W5.d.a(function2, abstractC0768a, abstractC0768a2));
            l lVar = n.f2421d;
            AbstractC0898a.g(b7, Unit.f6114a);
        } catch (Throwable th) {
            l lVar2 = n.f2421d;
            abstractC0768a2.resumeWith(n(th));
            throw th;
        }
    }

    public static boolean O(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void P(Object obj) {
        if (obj instanceof m) {
            throw ((m) obj).f2420d;
        }
    }

    public static final boolean Q(String str, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean booleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static int R(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static HashMap c(N2.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", d(bVar.getMessage()));
        N2.d result = bVar.getResult();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", result.getActionId());
        hashMap2.put("url", result.getUrl());
        hashMap2.put("closing_message", Boolean.valueOf(result.getClosingMessage()));
        hashMap.put("result", hashMap2);
        return hashMap;
    }

    public static HashMap d(N2.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("message_id", aVar.getMessageId());
        return hashMap;
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject != JSONObject.NULL) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.isNull(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = e((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = f((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static HashMap g(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("notification", h(gVar.getNotification()));
        i result = gVar.getResult();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", result.getActionId());
        hashMap2.put("url", result.getUrl());
        hashMap.put("result", hashMap2);
        return hashMap;
    }

    public static HashMap h(InterfaceC0479f interfaceC0479f) {
        HashMap hashMap = new HashMap();
        hashMap.put("androidNotificationId", Integer.valueOf(interfaceC0479f.getAndroidNotificationId()));
        if (interfaceC0479f.getGroupedNotifications() != null) {
            hashMap.put("groupKey", interfaceC0479f.getGroupKey());
            hashMap.put("groupMessage", interfaceC0479f.getGroupMessage());
            hashMap.put("groupedNotifications", interfaceC0479f.getGroupedNotifications());
        }
        hashMap.put("notificationId", interfaceC0479f.getNotificationId());
        hashMap.put("title", interfaceC0479f.getTitle());
        if (interfaceC0479f.getBody() != null) {
            hashMap.put("body", interfaceC0479f.getBody());
        }
        if (interfaceC0479f.getSmallIcon() != null) {
            hashMap.put("smallIcon", interfaceC0479f.getSmallIcon());
        }
        if (interfaceC0479f.getLargeIcon() != null) {
            hashMap.put("largeIcon", interfaceC0479f.getLargeIcon());
        }
        if (interfaceC0479f.getBigPicture() != null) {
            hashMap.put("bigPicture", interfaceC0479f.getBigPicture());
        }
        if (interfaceC0479f.getSmallIconAccentColor() != null) {
            hashMap.put("smallIconAccentColor", interfaceC0479f.getSmallIconAccentColor());
        }
        if (interfaceC0479f.getLaunchURL() != null) {
            hashMap.put("launchUrl", interfaceC0479f.getLaunchURL());
        }
        if (interfaceC0479f.getSound() != null) {
            hashMap.put("sound", interfaceC0479f.getSound());
        }
        if (interfaceC0479f.getLedColor() != null) {
            hashMap.put("ledColor", interfaceC0479f.getLedColor());
        }
        hashMap.put("lockScreenVisibility", Integer.valueOf(interfaceC0479f.getLockScreenVisibility()));
        if (interfaceC0479f.getGroupKey() != null) {
            hashMap.put("groupKey", interfaceC0479f.getGroupKey());
        }
        if (interfaceC0479f.getGroupMessage() != null) {
            hashMap.put("groupMessage", interfaceC0479f.getGroupMessage());
        }
        if (interfaceC0479f.getFromProjectNumber() != null) {
            hashMap.put("fromProjectNumber", interfaceC0479f.getFromProjectNumber());
        }
        if (interfaceC0479f.getCollapseId() != null) {
            hashMap.put("collapseId", interfaceC0479f.getCollapseId());
        }
        hashMap.put("priority", Integer.valueOf(interfaceC0479f.getPriority()));
        if (interfaceC0479f.getAdditionalData() != null && interfaceC0479f.getAdditionalData().length() > 0) {
            hashMap.put("additionalData", f(interfaceC0479f.getAdditionalData()));
        }
        if (interfaceC0479f.getActionButtons() != null) {
            List<InterfaceC0475b> actionButtons = interfaceC0479f.getActionButtons();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC0475b interfaceC0475b : actionButtons) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("id", interfaceC0475b.getId());
                hashMap2.put("text", interfaceC0475b.getText());
                hashMap2.put("icon", interfaceC0475b.getIcon());
                arrayList.add(hashMap2);
            }
            hashMap.put("buttons", arrayList);
        }
        hashMap.put("rawPayload", interfaceC0479f.getRawPayload());
        return hashMap;
    }

    public static HashMap i(Z3.b bVar) {
        HashMap hashMap = new HashMap();
        c current = bVar.getCurrent();
        HashMap hashMap2 = new HashMap();
        String onesignalId = current.getOnesignalId();
        if (onesignalId.isEmpty()) {
            onesignalId = null;
        }
        String externalId = current.getExternalId();
        String str = externalId.isEmpty() ? null : externalId;
        hashMap2.put("onesignalId", onesignalId);
        hashMap2.put("externalId", str);
        hashMap.put("current", hashMap2);
        return hashMap;
    }

    public static HashMap j(a4.g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", gVar.getToken());
        hashMap.put("id", gVar.getId());
        hashMap.put("optedIn", Boolean.valueOf(gVar.getOptedIn()));
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static B5.f l(Map headers, String appId, String apiBaseUrl, boolean z7) {
        Duration ofSeconds;
        long nanos;
        p5.e eVar;
        SSLContext sSLContext;
        Intrinsics.checkNotNullParameter(headers, "extraHttpHeaders");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(appId, "appId");
        String endpoint = apiBaseUrl + "sdk/log?app_id=" + appId;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        j5.g gVar = new j5.g();
        HashMap hashMap = gVar.f6009e;
        hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
        for (Map.Entry entry : headers.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        Objects.requireNonNull(endpoint, "endpoint");
        try {
            URI uri = new URI(endpoint);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            gVar.f6006b = uri.toString();
            ofSeconds = Duration.ofSeconds(10L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            H4.d.a("timeout must be non-negative", nanos >= 0);
            gVar.f6007c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            Logger logger = j5.g.f6004l;
            j5.d dVar = new j5.d(gVar);
            boolean startsWith = gVar.f6006b.startsWith("http://");
            HashMap hashMap2 = new HashMap();
            Iterator it = ServiceLoader.load(p5.e.class, gVar.f6014k.f1684b).iterator();
            while (it.hasNext()) {
                p5.e eVar2 = (p5.e) it.next();
                hashMap2.put(eVar2.getClass().getName(), eVar2);
            }
            if (hashMap2.isEmpty()) {
                throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            }
            if (hashMap2.size() == 1) {
                eVar = (p5.e) hashMap2.values().stream().findFirst().get();
            } else {
                String b7 = H4.d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                if (b7.isEmpty()) {
                    logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                    eVar = (p5.e) hashMap2.values().stream().findFirst().get();
                } else {
                    if (!hashMap2.containsKey(b7)) {
                        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b7));
                    }
                    eVar = (p5.e) hashMap2.get(b7);
                }
            }
            String str = gVar.f6006b;
            long j = gVar.f6007c;
            c2.e eVar3 = gVar.f6011g;
            if (startsWith) {
                sSLContext = null;
            } else {
                eVar3.getClass();
                try {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sSLContext2.init(null, null, null);
                    sSLContext = sSLContext2;
                } catch (KeyManagementException | NoSuchAlgorithmException e7) {
                    throw new IllegalArgumentException(e7);
                }
            }
            if (!startsWith) {
                eVar3.getClass();
            }
            if (str == null) {
                throw new NullPointerException("Null endpoint");
            }
            eVar.getClass();
            p5.d dVar2 = new p5.d(str, j, gVar.f6008d, dVar, gVar.f6012h, sSLContext);
            logger.log(Level.FINE, "Using HttpSender: ".concat(p5.d.class.getName()));
            C0804b delegate = new C0804b(gVar, new j5.b(new x5.m(gVar.f6005a), dVar2, gVar.f6013i, gVar.j, gVar.f6006b));
            Intrinsics.checkNotNullExpressionValue(delegate, "build(...)");
            if (!z7) {
                return delegate;
            }
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new G3.b(delegate);
        } catch (URISyntaxException e8) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e8);
        }
    }

    public static l2.c m(l2.c cVar, List migrations, s6.c scope, j produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        W storage = new W(new V(1, produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC0138c interfaceC0138c = cVar;
        if (cVar == null) {
            interfaceC0138c = new h(5);
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new l2.c((InterfaceC0144i) new l2.c((InterfaceC0144i) new Q(storage, q.b(new C0140e(migrations, null)), interfaceC0138c, scope)));
    }

    public static final m n(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new m(exception);
    }

    public static String s(Object value, String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0143, code lost:
    
        if (u(r1.getValue(), r4.getValue()) == false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (x(dArr[i2], dArr2[i2])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (B(fArr[i5], fArr2[i5])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i7 = 0; i7 < length3; i7++) {
                        if (u(objArr[i7], objArr2[i7])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (!u(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    return ((obj instanceof Double) && (obj2 instanceof Double)) ? x(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) : ((obj instanceof Float) && (obj2 instanceof Float)) ? B(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it3 = map2.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break loop4;
                            }
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            if (u(key, entry2.getKey())) {
                                break;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int v(Object obj) {
        int i2 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int i5 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i2 < length) {
                double d7 = dArr[i2];
                int i7 = i5 * 31;
                if (d7 == 0.0d) {
                    d7 = 0.0d;
                }
                long doubleToLongBits = Double.doubleToLongBits(d7);
                i5 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                i2++;
            }
            return i5;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i2 < length2) {
                float f7 = fArr[i2];
                int i8 = i5 * 31;
                if (f7 == 0.0f) {
                    f7 = 0.0f;
                }
                i5 = i8 + Float.floatToIntBits(f7);
                i2++;
            }
            return i5;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i2 < length3) {
                i5 = (i5 * 31) + v(objArr[i2]);
                i2++;
            }
            return i5;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 = (i5 * 31) + v(it.next());
            }
            return i5;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i2 += v(entry.getValue()) ^ (v(entry.getKey()) * 31);
            }
            return i2;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Number) obj).doubleValue();
            long doubleToLongBits2 = Double.doubleToLongBits(doubleValue != 0.0d ? doubleValue : 0.0d);
            return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float floatValue = ((Number) obj).floatValue();
        return Float.floatToIntBits(floatValue != 0.0f ? floatValue : 0.0f);
    }

    public static boolean w(Method method, C0643h clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(clazz, "<this>");
        Class clazz2 = clazz.a();
        Intrinsics.c(clazz2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        return method.getReturnType().equals(clazz2);
    }

    public static boolean x(double d7, double d8) {
        if ((d7 == 0.0d ? 0.0d : d7) == (d8 != 0.0d ? d8 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d7) && Double.isNaN(d8);
    }

    public static final boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public abstract void G(Throwable th);

    public abstract void H(P0.i iVar);

    public abstract b L(String str, Function1 function1);

    public abstract Object b();

    public int hashCode() {
        switch (this.f2764a) {
            case 21:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract Typeface o(Context context, A.e eVar, Resources resources, int i2);

    public abstract Typeface p(Context context, k[] kVarArr, int i2);

    public Typeface q(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, Resources resources, int i2, String str, int i5) {
        File l7 = AbstractC0169a.l(context);
        if (l7 == null) {
            return null;
        }
        try {
            if (AbstractC0169a.e(l7, resources, i2)) {
                return Typeface.createFromFile(l7.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            l7.delete();
        }
    }

    public abstract String t(byte[] bArr, int i2, int i5);

    public String toString() {
        switch (this.f2764a) {
            case 21:
                String b7 = E.a(getClass()).b();
                Intrinsics.b(b7);
                return b7;
            default:
                return super.toString();
        }
    }

    public abstract int y(String str, byte[] bArr, int i2, int i5);

    public b() {
        this.f2764a = 1;
        new ConcurrentHashMap();
    }
}
