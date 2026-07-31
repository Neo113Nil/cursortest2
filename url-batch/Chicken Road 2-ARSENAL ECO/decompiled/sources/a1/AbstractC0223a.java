package a1;

import C1.c;
import C4.h;
import D.K;
import D.M;
import D.N;
import D.Y;
import F2.f;
import F2.g;
import F5.j;
import H1.C0133g;
import U4.e;
import X5.v;
import X5.w;
import X5.y;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import e3.C0344a;
import f0.l;
import f0.m;
import j0.C0434a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.i;
import l2.InterfaceC0491a;
import l2.InterfaceC0492b;
import l2.d;
import m1.AbstractC0521b;
import o5.C0562b;
import o5.C0570j;
import o5.InterfaceC0567g;
import o5.InterfaceC0568h;
import o5.InterfaceC0569i;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.C0576a;
import p1.o;
import x5.InterfaceC0743l;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0223a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3124a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3125b;

    public static String A(String tableName, String triggerType) {
        i.e(tableName, "tableName");
        i.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static InterfaceC0569i B(InterfaceC0567g interfaceC0567g, InterfaceC0568h key) {
        i.e(key, "key");
        return i.a(interfaceC0567g.getKey(), key) ? C0570j.f5620f : interfaceC0567g;
    }

    public static MappedByteBuffer C(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static InterfaceC0569i D(InterfaceC0567g interfaceC0567g, InterfaceC0569i context) {
        i.e(context, "context");
        return context == C0570j.f5620f ? interfaceC0567g : (InterfaceC0569i) context.h(interfaceC0567g, new C0562b(1));
    }

    public static int F(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }

    public static final w G(w wVar) {
        i.e(wVar, "<this>");
        v a7 = wVar.a();
        y yVar = wVar.f3067l;
        a7.f3052g = new Y5.a(yVar.d(), yVar.a());
        return a7.a();
    }

    public static void a(Context context, T3.b bVar) {
        Rect rect;
        Y _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity v5 = v(context);
        if (v5 != null) {
            l.f4196a.getClass();
            int i7 = m.f4197b;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                maximumWindowMetrics = ((WindowManager) v5.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = v5.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                i.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i8 < 30) {
                _windowInsetsCompat = (i8 >= 30 ? new N() : i8 >= 29 ? new M() : new K()).b();
                i.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i8 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = C0434a.f4875a.a(v5);
            }
            int i9 = rect.left;
            int i10 = rect.top;
            int i11 = rect.right;
            int i12 = rect.bottom;
            if (i9 > i11) {
                throw new IllegalArgumentException(c.f(i9, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i10 > i12) {
                throw new IllegalArgumentException(c.f(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            i.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((E3.c) bVar).f600a.updateDisplayMetrics(0, new Rect(i9, i10, i11, i12).width(), new Rect(i9, i10, i11, i12).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final double e(double d7, G5.c cVar, G5.c targetUnit) {
        i.e(targetUnit, "targetUnit");
        long convert = targetUnit.f874f.convert(1L, cVar.f874f);
        return convert > 0 ? d7 * convert : d7 / r8.convert(1L, r9);
    }

    public static final long f(long j4, G5.c sourceUnit, G5.c targetUnit) {
        i.e(sourceUnit, "sourceUnit");
        i.e(targetUnit, "targetUnit");
        return targetUnit.f874f.convert(j4, sourceUnit.f874f);
    }

    public static HashMap g(InterfaceC0492b interfaceC0492b) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", h(interfaceC0492b.getMessage()));
        d result = interfaceC0492b.getResult();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", result.getActionId());
        hashMap2.put("url", result.getUrl());
        hashMap2.put("closing_message", Boolean.valueOf(result.getClosingMessage()));
        hashMap.put("result", hashMap2);
        return hashMap;
    }

    public static HashMap h(InterfaceC0491a interfaceC0491a) {
        HashMap hashMap = new HashMap();
        hashMap.put("message_id", interfaceC0491a.getMessageId());
        return hashMap;
    }

    public static ArrayList i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = i((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = j((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap j(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject != JSONObject.NULL) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.isNull(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = i((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = j((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static HashMap k(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("notification", l(gVar.getNotification()));
        F2.i result = gVar.getResult();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", result.getActionId());
        hashMap2.put("url", result.getUrl());
        hashMap.put("result", hashMap2);
        return hashMap;
    }

    public static HashMap l(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("androidNotificationId", Integer.valueOf(fVar.getAndroidNotificationId()));
        if (fVar.getGroupedNotifications() != null) {
            hashMap.put("groupKey", fVar.getGroupKey());
            hashMap.put("groupMessage", fVar.getGroupMessage());
            hashMap.put("groupedNotifications", fVar.getGroupedNotifications());
        }
        hashMap.put("notificationId", fVar.getNotificationId());
        hashMap.put("title", fVar.getTitle());
        if (fVar.getBody() != null) {
            hashMap.put("body", fVar.getBody());
        }
        if (fVar.getSmallIcon() != null) {
            hashMap.put("smallIcon", fVar.getSmallIcon());
        }
        if (fVar.getLargeIcon() != null) {
            hashMap.put("largeIcon", fVar.getLargeIcon());
        }
        if (fVar.getBigPicture() != null) {
            hashMap.put("bigPicture", fVar.getBigPicture());
        }
        if (fVar.getSmallIconAccentColor() != null) {
            hashMap.put("smallIconAccentColor", fVar.getSmallIconAccentColor());
        }
        if (fVar.getLaunchURL() != null) {
            hashMap.put("launchUrl", fVar.getLaunchURL());
        }
        if (fVar.getSound() != null) {
            hashMap.put("sound", fVar.getSound());
        }
        if (fVar.getLedColor() != null) {
            hashMap.put("ledColor", fVar.getLedColor());
        }
        hashMap.put("lockScreenVisibility", Integer.valueOf(fVar.getLockScreenVisibility()));
        if (fVar.getGroupKey() != null) {
            hashMap.put("groupKey", fVar.getGroupKey());
        }
        if (fVar.getGroupMessage() != null) {
            hashMap.put("groupMessage", fVar.getGroupMessage());
        }
        if (fVar.getFromProjectNumber() != null) {
            hashMap.put("fromProjectNumber", fVar.getFromProjectNumber());
        }
        if (fVar.getCollapseId() != null) {
            hashMap.put("collapseId", fVar.getCollapseId());
        }
        hashMap.put("priority", Integer.valueOf(fVar.getPriority()));
        if (fVar.getAdditionalData() != null && fVar.getAdditionalData().length() > 0) {
            hashMap.put("additionalData", j(fVar.getAdditionalData()));
        }
        if (fVar.getActionButtons() != null) {
            List<F2.b> actionButtons = fVar.getActionButtons();
            ArrayList arrayList = new ArrayList();
            for (F2.b bVar : actionButtons) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("id", bVar.getId());
                hashMap2.put("text", bVar.getText());
                hashMap2.put("icon", bVar.getIcon());
                arrayList.add(hashMap2);
            }
            hashMap.put("buttons", arrayList);
        }
        hashMap.put("rawPayload", fVar.getRawPayload());
        return hashMap;
    }

    public static HashMap m(x3.b bVar) {
        HashMap hashMap = new HashMap();
        x3.c current = bVar.getCurrent();
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

    public static HashMap n(y3.g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", gVar.getToken());
        hashMap.put("id", gVar.getId());
        hashMap.put("optedIn", Boolean.valueOf(gVar.getOptedIn()));
        return hashMap;
    }

    public static boolean o(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean p4 = p(file, inputStream);
                c(inputStream);
                return p4;
            } catch (Throwable th) {
                th = th;
                c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean p(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static e q(Map extraHttpHeaders, String appId, String apiBaseUrl, boolean z5) {
        Duration ofSeconds;
        long nanos;
        I4.f fVar;
        SSLContext sSLContext;
        i.e(extraHttpHeaders, "extraHttpHeaders");
        i.e(appId, "appId");
        i.e(apiBaseUrl, "apiBaseUrl");
        String endpoint = apiBaseUrl + "sdk/log?app_id=" + appId;
        i.e(endpoint, "endpoint");
        h hVar = new h();
        HashMap hashMap = hVar.f221e;
        hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
        for (Map.Entry entry : extraHttpHeaders.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            URI uri = new URI(endpoint);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            hVar.f218b = uri.toString();
            ofSeconds = Duration.ofSeconds(10L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            a4.d.a("timeout must be non-negative", nanos >= 0);
            hVar.f219c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            Logger logger = h.f216l;
            C4.e eVar = new C4.e(hVar);
            boolean startsWith = hVar.f218b.startsWith("http://");
            HashMap hashMap2 = new HashMap();
            Iterator it = ServiceLoader.load(I4.f.class, (ClassLoader) hVar.f227k.f2734g).iterator();
            while (it.hasNext()) {
                I4.f fVar2 = (I4.f) it.next();
                hashMap2.put(fVar2.getClass().getName(), fVar2);
            }
            if (hashMap2.isEmpty()) {
                throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            }
            if (hashMap2.size() == 1) {
                fVar = (I4.f) hashMap2.values().stream().findFirst().get();
            } else {
                String b7 = a4.d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                if (b7.isEmpty()) {
                    logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                    fVar = (I4.f) hashMap2.values().stream().findFirst().get();
                } else {
                    if (!hashMap2.containsKey(b7)) {
                        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b7));
                    }
                    fVar = (I4.f) hashMap2.get(b7);
                }
            }
            String str = hVar.f218b;
            long j4 = hVar.f219c;
            R0.g gVar = hVar.f223g;
            if (startsWith) {
                sSLContext = null;
            } else {
                gVar.getClass();
                try {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sSLContext2.init(null, null, null);
                    sSLContext = sSLContext2;
                } catch (KeyManagementException | NoSuchAlgorithmException e4) {
                    throw new IllegalArgumentException(e4);
                }
            }
            if (!startsWith) {
                gVar.getClass();
            }
            if (str == null) {
                throw new NullPointerException("Null endpoint");
            }
            fVar.getClass();
            I4.e eVar2 = new I4.e(str, j4, hVar.f220d, eVar, hVar.f224h, sSLContext);
            logger.log(Level.FINE, "Using HttpSender: ".concat(I4.e.class.getName()));
            H4.b bVar = new H4.b(hVar, new C4.b(new Q4.m(hVar.f217a), eVar2, hVar.f225i, hVar.f226j, hVar.f218b));
            return z5 ? new C0344a(bVar) : bVar;
        } catch (URISyntaxException e7) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e7);
        }
    }

    public static C0576a r(String str, String str2) {
        J1.a aVar = new J1.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(J1.a.class));
        return new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B0.b(12, aVar), hashSet3);
    }

    public static String s(Object value, String str) {
        i.e(value, "value");
        return str + " value: " + value;
    }

    public static boolean t(String current, String str) {
        i.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i7 < current.length()) {
                    char charAt = current.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i8 - 1 == 0 && i9 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i8++;
                    }
                    i7++;
                    i9 = i10;
                } else if (i8 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return i.a(j.h0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static C0576a u(String str, B1.g gVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(J1.a.class));
        for (Class cls : new Class[0]) {
            AbstractC0521b.f(cls, "Null interface");
            hashSet.add(o.a(cls));
        }
        p1.g a7 = p1.g.a(Context.class);
        if (hashSet.contains(a7.f5680a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a7);
        return new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0133g(str, 4, gVar), hashSet3);
    }

    public static Activity v(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return v(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static SharedPreferences w(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int x(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        }
        return i8;
    }

    public static String y(byte[] bArr) {
        int a7;
        D4.c cVar = new D4.c(bArr);
        boolean z5 = false;
        while (!z5) {
            int i7 = cVar.f516c;
            int i8 = cVar.f515b;
            if (i7 == i8) {
                cVar.f517d = 0;
                a7 = 0;
            } else {
                a7 = cVar.a();
                cVar.f517d = a7;
                if ((a7 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + cVar.f517d);
                }
            }
            if (a7 == 0) {
                z5 = true;
            } else {
                if (a7 == 18) {
                    int a8 = cVar.a();
                    if (a8 > 0) {
                        int i9 = cVar.f516c;
                        if (a8 <= i8 - i9) {
                            String str = new String(bArr, i9, a8, StandardCharsets.UTF_8);
                            cVar.f516c += a8;
                            return str;
                        }
                    }
                    if (a8 == 0) {
                        return "";
                    }
                    if (a8 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i10 = a7 & 7;
                if (i10 == 0) {
                    if (i8 - cVar.f516c >= 10) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            int i12 = cVar.f516c;
                            cVar.f516c = i12 + 1;
                            if (bArr[i12] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i13 = 0; i13 < 10; i13++) {
                        int i14 = cVar.f516c;
                        if (i14 == i8) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        cVar.f516c = i14 + 1;
                        if (cVar.f514a[i14] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i10 == 1) {
                    cVar.b(8);
                } else if (i10 == 2) {
                    cVar.b(cVar.a());
                } else {
                    if (i10 != 5) {
                        throw new IOException(W4.o.c("Invalid wire type: ", a7));
                    }
                    cVar.b(4);
                }
            }
        }
        return "";
    }

    public static File z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public abstract AbstractC0223a E(String str, InterfaceC0743l interfaceC0743l);

    public abstract List b(List list, String str);

    public abstract Object d();
}
