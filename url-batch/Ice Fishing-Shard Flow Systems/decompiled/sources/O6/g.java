package O6;

import D6.B;
import D6.C;
import D6.C0099g;
import D6.E;
import D6.G;
import D6.p;
import G0.C0104d;
import G0.EnumC0101a;
import G0.s;
import G0.t;
import G0.z;
import I.a0;
import I.b0;
import I.c0;
import I.d0;
import I.e0;
import I.f0;
import I.g0;
import I.v0;
import S1.r;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0191g;
import com.appsflyer.attribution.RequestError;
import com.google.firebase.messaging.C0318h;
import d5.C0366b;
import f5.C0403b;
import f5.C0405d;
import g5.C0451b;
import i4.C0547c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.H;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l2.C0660a;
import n.Q0;
import v0.AbstractC0967k;
import v5.C0975a;
import x0.C0995b;
import z1.AbstractC1053a;
import z6.M;

/* loaded from: classes.dex */
public abstract class g implements y6.b, y6.a {
    public static void A(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static S1.b B(String str, String str2) {
        C0660a c0660a = new C0660a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C0660a.class));
        return new S1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new A4.b(2, c0660a), hashSet3);
    }

    public static String E(C0191g c0191g) {
        StringBuilder sb = new StringBuilder(c0191g.size());
        for (int i2 = 0; i2 < c0191g.size(); i2++) {
            byte a7 = c0191g.a(i2);
            if (a7 == 34) {
                sb.append("\\\"");
            } else if (a7 == 39) {
                sb.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a7 >>> 6) & 3) + 48));
                            sb.append((char) (((a7 >>> 3) & 7) + 48));
                            sb.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static InvocationHandler F() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = AbstractC0967k.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static S1.b G(String str, A4.c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C0660a.class));
        for (Class cls : new Class[0]) {
            A(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        S1.j a7 = S1.j.a(Context.class);
        if (hashSet.contains(a7.f2488a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a7);
        return new S1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0318h(str, 7, cVar), hashSet3);
    }

    public static ArrayList H(C0366b c0366b) {
        H4.a aVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = c0366b.f4663i.iterator();
        while (it.hasNext()) {
            C0405d c0405d = (C0405d) it.next();
            C0451b c0451b = c0405d.f4819i;
            String str = c0405d.f4821m;
            if (str.isEmpty()) {
                str = null;
            }
            M5.a aVar2 = M5.a.f1769c;
            int i2 = 0;
            C4.d dVar = new C4.d(0);
            if (str == null) {
                str = null;
            }
            dVar.g(AbstractC1053a.D(c0451b.f5032i));
            M5.a a7 = M5.a.a(dVar.b(), str);
            Iterator it2 = c0405d.f4820l.iterator();
            while (it2.hasNext()) {
                f5.f fVar = (f5.f) it2.next();
                e5.h hVar = fVar.f4823i;
                String str2 = fVar.f4825m;
                String str3 = hVar.f4728i;
                int i5 = C0975a.f8219e;
                C4.b D7 = AbstractC1053a.D(hVar.f4730m);
                String str4 = hVar.f4729l;
                if (str4.isEmpty()) {
                    str4 = null;
                }
                if (str2 == null) {
                    str2 = null;
                }
                C0975a a8 = C0975a.a(str3, str4, str2, D7);
                for (C0403b c0403b : fVar.f4824l) {
                    long j = c0403b.f4807i;
                    long j7 = c0403b.f4808l;
                    byte b7 = (byte) (((byte) 1) | 2);
                    f5.h hVar2 = c0403b.f4809m;
                    I4.i[] values = I4.i.values();
                    int length = values.length;
                    while (i2 < length) {
                        Iterator it3 = it;
                        I4.i iVar = values[i2];
                        Iterator it4 = it2;
                        if (iVar.f1289d == hVar2.f4853d) {
                            String str5 = c0403b.f4810n;
                            e5.b bVar = c0403b.f4811o;
                            C4.j c7 = bVar != null ? AbstractC1053a.c(bVar) : null;
                            C4.b D8 = AbstractC1053a.D(c0403b.f4812p);
                            String b8 = c0403b.f4815s.b();
                            String b9 = c0403b.f4816t.b();
                            K4.e eVar = K4.e.f1456c[((byte) (c0403b.f4814r & 255)) & 255];
                            K4.b bVar2 = K4.a.f1453a;
                            if (b9 != null) {
                                H4.a aVar3 = H4.a.f979f;
                                if (b9.length() == 16 && !"0000000000000000".contentEquals(b9)) {
                                    char[] cArr = H4.f.f994a;
                                    int length2 = b9.length();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < length2) {
                                            if (!H4.f.f996c[b9.charAt(i7)]) {
                                                break;
                                            }
                                            i7++;
                                        } else if (b8 != null && b8.length() == 32 && !"00000000000000000000000000000000".contentEquals(b8)) {
                                            int length3 = b8.length();
                                            for (int i8 = 0; i8 < length3; i8++) {
                                                if (H4.f.f996c[b8.charAt(i8)]) {
                                                }
                                            }
                                            aVar = new H4.a(b8, b9, eVar, bVar2, true);
                                        }
                                    }
                                }
                            }
                            aVar = new H4.a("00000000000000000000000000000000", "0000000000000000", eVar, bVar2, false);
                            H4.a aVar4 = aVar;
                            int size = D8.size() + c0403b.f4813q;
                            byte b10 = (byte) (b7 | 4);
                            String str6 = c0403b.f4817u;
                            if (b10 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((b10 & 1) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b10 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b10 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new V4.a(a7, a8, j, j7, aVar4, iVar, str5, size, D8, c7, str6));
                            it = it3;
                            it2 = it4;
                            i2 = 0;
                        } else {
                            i2++;
                            it = it3;
                            it2 = it4;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    public static p I(SSLSession sSLSession) {
        Object obj;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0099g b7 = C0099g.f486b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        G.f447e.getClass();
        G c7 = D6.l.c(protocol);
        try {
            obj = E6.e.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = A.f6115d;
        }
        return new p(c7, b7, E6.e.j(sSLSession.getLocalCertificates()), new D6.o(1, obj));
    }

    public static Activity J(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return J(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f27c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList K(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        A.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        A.i iVar = new A.i(resources, theme);
        synchronized (A.m.f37c) {
            try {
                SparseArray sparseArray = (SparseArray) A.m.f36b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (A.h) sparseArray.get(i2)) != null) {
                    if (hVar.f26b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.f27c != 0) {
                            }
                            colorStateList2 = hVar.f25a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = A.m.f35a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateList = A.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e7) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (A.m.f37c) {
            try {
                WeakHashMap weakHashMap = A.m.f36b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i2, new A.h(colorStateList, iVar.f28a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static float L(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return L.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable M(Context context, int i2) {
        return Q0.b().c(context, i2);
    }

    public static String N(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case RequestError.STOP_TRACKING /* 11 */:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
                sb.append("unknown status code: ");
                sb.append(i2);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static String O(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static int P(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(C4.p.g(i2, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q(Context context) {
        boolean z7;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (P0.f.t(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z7 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT < 29) {
                new q.l(2, context, new K1.h(), z7).run();
                return;
            } else {
                AbstractC1053a.w(null);
                return;
            }
        }
        z7 = true;
        if (Build.VERSION.SDK_INT < 29) {
        }
    }

    public static final EnumC0101a R(int i2) {
        if (i2 == 0) {
            return EnumC0101a.f778d;
        }
        if (i2 == 1) {
            return EnumC0101a.f779e;
        }
        throw new IllegalArgumentException(C4.p.h(i2, "Could not convert ", " to BackoffPolicy"));
    }

    public static final t S(int i2) {
        if (i2 == 0) {
            return t.f825d;
        }
        if (i2 == 1) {
            return t.f826e;
        }
        if (i2 == 2) {
            return t.f827i;
        }
        if (i2 == 3) {
            return t.f828l;
        }
        if (i2 == 4) {
            return t.f829m;
        }
        if (Build.VERSION.SDK_INT < 30 || i2 != 5) {
            throw new IllegalArgumentException(C4.p.h(i2, "Could not convert ", " to NetworkType"));
        }
        return t.f830n;
    }

    public static final z T(int i2) {
        if (i2 == 0) {
            return z.f838d;
        }
        if (i2 == 1) {
            return z.f839e;
        }
        throw new IllegalArgumentException(C4.p.h(i2, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final G0.A U(int i2) {
        if (i2 == 0) {
            return G0.A.f770d;
        }
        if (i2 == 1) {
            return G0.A.f771e;
        }
        if (i2 == 2) {
            return G0.A.f772i;
        }
        if (i2 == 3) {
            return G0.A.f773l;
        }
        if (i2 == 4) {
            return G0.A.f774m;
        }
        if (i2 == 5) {
            return G0.A.f775n;
        }
        throw new IllegalArgumentException(C4.p.h(i2, "Could not convert ", " to State"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void V(Context context) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            s.d().a(H0.n.f913a, "Migrating WorkDatabase to the no-backup directory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(H0.a.f871a.a(context), "androidx.work.workdb");
            String[] strArr = H0.n.f914b;
            int a7 = H.a(strArr.length);
            if (a7 < 16) {
                a7 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a7);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            Intrinsics.checkNotNullParameter(linkedHashMap2, "<this>");
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = H.b(pair);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        s.d().g(H0.n.f913a, "Over-writing contents of " + file3);
                    }
                    s.d().a(H0.n.f913a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static void W(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float X(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return L.b.c(edgeEffect, f7, f8);
        }
        edgeEffect.onPull(f7, f8);
        return f7;
    }

    public static final int Y(G0.A state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 3;
                if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new R5.k();
                    }
                }
            }
        }
        return i2;
    }

    public static final C Z(C c7) {
        Intrinsics.checkNotNullParameter(c7, "<this>");
        B d7 = c7.d();
        E e7 = c7.f432o;
        E6.a body = new E6.a(e7.d(), e7.a());
        Intrinsics.checkNotNullParameter(body, "body");
        d7.f418g = body;
        return d7.a();
    }

    public static void a0(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        new U5.a(0, block).start();
    }

    public static boolean b0(View view, A4.e eVar) {
        if (view != null) {
            if (eVar.a(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    if (b0(viewGroup.getChildAt(i2), eVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final LinkedHashSet y(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i2 = 0; i2 < readInt; i2++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    linkedHashSet.add(new C0104d(readBoolean, uri));
                }
                Unit unit = Unit.f6114a;
                objectInputStream.close();
                Unit unit2 = Unit.f6114a;
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static void z(Context context, A4.d dVar) {
        Rect rect;
        v0 _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity context2 = J(context);
        if (context2 != null) {
            A0.n.f83a.getClass();
            A0.p it = A0.p.f84b;
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(context2, "activity");
            Intrinsics.checkNotNullParameter(context2, "context");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                maximumWindowMetrics = ((WindowManager) context2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = context2.getSystemService("window");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, "display");
                Point c7 = A0.p.c(display);
                rect = new Rect(0, 0, c7.x, c7.y);
            }
            if (i2 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                if (i2 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = E0.b.f657a.a(context2);
            } else {
                _windowInsetsCompat = (i2 >= 36 ? new g0() : i2 >= 35 ? new f0() : i2 >= 34 ? new e0() : i2 >= 31 ? new d0() : i2 >= 30 ? new c0() : i2 >= 29 ? new b0() : new a0()).b();
                Intrinsics.checkNotNullExpressionValue(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            }
            C0995b _bounds = new C0995b(rect);
            Intrinsics.checkNotNullParameter(_bounds, "_bounds");
            Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
            ((C0547c) dVar).f5501a.updateDisplayMetrics(0, _bounds.a().width(), _bounds.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public Object C(w6.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.a(this);
    }

    public void D() {
        throw new w6.c(kotlin.jvm.internal.E.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // y6.b
    public abstract long a();

    public void b(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // y6.a
    public y6.b c(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k(descriptor.i(i2));
    }

    @Override // y6.b
    public boolean d() {
        D();
        throw null;
    }

    @Override // y6.b
    public boolean e() {
        return true;
    }

    @Override // y6.b
    public char f() {
        D();
        throw null;
    }

    public Object g(x6.e descriptor, int i2, w6.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return C(deserializer);
    }

    @Override // y6.a
    public int h(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p();
    }

    @Override // y6.a
    public char i(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return f();
    }

    @Override // y6.a
    public double j(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return x();
    }

    @Override // y6.b
    public y6.b k(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // y6.a
    public boolean l(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return d();
    }

    @Override // y6.a
    public byte m(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q();
    }

    @Override // y6.a
    public long n(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return a();
    }

    @Override // y6.b
    public abstract int p();

    @Override // y6.b
    public abstract byte q();

    @Override // y6.a
    public float r(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return w();
    }

    @Override // y6.a
    public short s(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return u();
    }

    @Override // y6.b
    public y6.a t(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // y6.b
    public abstract short u();

    @Override // y6.b
    public String v() {
        D();
        throw null;
    }

    @Override // y6.b
    public float w() {
        D();
        throw null;
    }

    @Override // y6.b
    public double x() {
        D();
        throw null;
    }
}
