package a;

import F5.j;
import F5.q;
import G5.b;
import G5.c;
import T0.M;
import V3.e;
import V3.f;
import V3.h;
import V3.k;
import a.AbstractC0219a;
import a1.AbstractC0223a;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import i6.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;
import k1.n;
import kotlin.jvm.internal.i;
import l5.AbstractC0506j;
import l5.r;
import l5.t;
import m5.C0529f;
import m5.C0532i;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import q4.C0600a;
import q4.C0601b;
import q4.C0603d;
import r5.C0621b;
import u0.AbstractC0676f;
import u4.C0693a;
import u4.C0694b;
import v.C0698c;
import x4.d;
import x4.l;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0219a {

    /* renamed from: a, reason: collision with root package name */
    public static long f3109a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3110b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f3111c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f3112d;

    public AbstractC0219a() {
        new ConcurrentHashMap();
    }

    public static final long A(String str) {
        char charAt;
        int length = str.length();
        int i7 = (length <= 0 || !j.M("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            int i8 = i7;
            while (true) {
                if (i7 < length) {
                    char charAt2 = str.charAt(i7);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i8 == i7) {
                        i8++;
                    }
                    i7++;
                } else if (length - i8 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!q.I(str, "+") || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(j.N(str, 1));
    }

    public static Set B(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f5305f;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            i.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.p0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final long C(long j4, c unit) {
        i.e(unit, "unit");
        c cVar = c.f867g;
        long f7 = AbstractC0223a.f(4611686018426999999L, cVar, unit);
        if ((-f7) <= j4 && j4 <= f7) {
            return m(AbstractC0223a.f(j4, unit, cVar));
        }
        c targetUnit = c.f868h;
        i.e(targetUnit, "targetUnit");
        return k(g.i(targetUnit.f874f.convert(j4, unit.f874f)));
    }

    public static String D(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int E(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int F(long j4) {
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (((-16384) & j4) == 0) {
            return 2;
        }
        if (((-2097152) & j4) == 0) {
            return 3;
        }
        if (((-268435456) & j4) == 0) {
            return 4;
        }
        if (((-34359738368L) & j4) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j4) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j4) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j4) == 0) {
            return 8;
        }
        return (j4 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static Object G(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(G(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i7 = 0; i7 < length; i7++) {
                jSONArray2.put(G(Array.get(obj, i7)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), G(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static void H(Parcel parcel, int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int O6 = O(parcel, i7);
        parcel.writeBundle(bundle);
        Q(parcel, O6);
    }

    public static void I(Parcel parcel, int i7, Parcelable parcelable, int i8) {
        if (parcelable == null) {
            return;
        }
        int O6 = O(parcel, i7);
        parcelable.writeToParcel(parcel, i8);
        Q(parcel, O6);
    }

    public static void J(Parcel parcel, int i7, String str) {
        if (str == null) {
            return;
        }
        int O6 = O(parcel, i7);
        parcel.writeString(str);
        Q(parcel, O6);
    }

    public static void K(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8) {
        if (parcelableArr == null) {
            return;
        }
        int O6 = O(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Q(parcel, O6);
    }

    public static void L(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int O6 = O(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Q(parcel, O6);
    }

    public static void M(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int O(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object P(n nVar) {
        if (nVar.h()) {
            return nVar.f();
        }
        if (nVar.f5172d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(nVar.e());
    }

    public static void Q(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void R(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static final long a(String str) {
        c cVar;
        long l7;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i7 = G5.a.f864i;
        char charAt2 = str.charAt(0);
        int i8 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z5 = i8 > 0 && j.d0(str, '-');
        if (length <= i8) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i8) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i8 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long j4 = 0;
        boolean z6 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (charAt = str.charAt(i10)) && charAt < ':') || j.M("+-.", charAt))) {
                    i10++;
                }
                String substring = str.substring(i9, i10);
                i.d(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z6) {
                    if (charAt3 == 'H') {
                        cVar = c.f871k;
                    } else if (charAt3 == 'M') {
                        cVar = c.f870j;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = c.f869i;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = c.f872l;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int Q6 = j.Q(substring, '.', 0, 6);
                if (cVar != c.f869i || Q6 <= 0) {
                    j4 = G5.a.e(j4, C(A(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, Q6);
                    i.d(substring2, "substring(...)");
                    long e4 = G5.a.e(j4, C(A(substring2), cVar));
                    String substring3 = substring.substring(Q6);
                    i.d(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double e7 = AbstractC0223a.e(parseDouble, cVar, c.f867g);
                    if (Double.isNaN(e7)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(e7)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long round = Math.round(e7);
                    if (-4611686018426999999L > round || round >= 4611686018427000000L) {
                        double e8 = AbstractC0223a.e(parseDouble, cVar, c.f868h);
                        if (Double.isNaN(e8)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        l7 = l(Math.round(e8));
                    } else {
                        l7 = m(round);
                    }
                    j4 = G5.a.e(e4, l7);
                }
                cVar2 = cVar;
                i9 = i11;
            } else {
                if (z6 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z6 = true;
            }
        }
        if (!z5) {
            return j4;
        }
        long j7 = ((-(j4 >> 1)) << 1) + (((int) j4) & 1);
        int i12 = b.f866a;
        return j7;
    }

    public static V3.g b(x4.b bVar) {
        String str = bVar.f6199h;
        if (str != null) {
            return new f(2, str);
        }
        Long l7 = bVar.f6201j;
        if (l7 != null) {
            return new k(l7.longValue());
        }
        Double d7 = bVar.f6202k;
        if (d7 != null) {
            return new V3.j(d7.doubleValue());
        }
        Boolean bool = bVar.f6200i;
        if (bool != null) {
            return new h(bool.booleanValue());
        }
        n6.i iVar = bVar.f6205n;
        if (iVar != null) {
            byte[] j4 = iVar.j();
            return new V3.i(Arrays.copyOf(j4, j4.length));
        }
        l lVar = bVar.f6204m;
        if (lVar == null) {
            d dVar = bVar.f6203l;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            final int i7 = 1;
            return new f(i7, Collections.unmodifiableList((List) dVar.f6207h.stream().map(new Function() { // from class: n4.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i7) {
                        case 0:
                            return AbstractC0219a.b(((x4.j) obj).f6220i);
                        default:
                            return AbstractC0219a.b((x4.b) obj);
                    }
                }
            }).collect(Collectors.toList())));
        }
        final int i8 = 0;
        Map map = (Map) lVar.f6222h.stream().collect(Collectors.toMap(new A4.b(29), new Function() { // from class: n4.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i8) {
                    case 0:
                        return AbstractC0219a.b(((x4.j) obj).f6220i);
                    default:
                        return AbstractC0219a.b((x4.b) obj);
                }
            }
        }));
        Objects.requireNonNull(map, "value must not be null");
        V3.d[] dVarArr = (V3.d[]) map.entrySet().stream().map(new A4.b(19)).toArray(new e());
        Objects.requireNonNull(dVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(dVarArr.length);
        arrayList.addAll(Arrays.asList(dVarArr));
        return new f(0, Collections.unmodifiableList(arrayList));
    }

    public static Object c(n nVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        U0.t.e();
        U0.t.g(nVar, "Task must not be null");
        if (nVar.g()) {
            return P(nVar);
        }
        Q0.i iVar = new Q0.i();
        Executor executor = k1.i.f5159b;
        nVar.b(executor, iVar);
        k1.k kVar = new k1.k(executor, (k1.d) iVar);
        M m4 = nVar.f5170b;
        m4.c(kVar);
        nVar.n();
        m4.c(new k1.k(executor, (k1.b) iVar));
        nVar.n();
        iVar.f1983f.await();
        return P(nVar);
    }

    public static Object d(n nVar, long j4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        U0.t.e();
        U0.t.g(nVar, "Task must not be null");
        U0.t.g(timeUnit, "TimeUnit must not be null");
        if (nVar.g()) {
            return P(nVar);
        }
        Q0.i iVar = new Q0.i();
        Executor executor = k1.i.f5159b;
        nVar.b(executor, iVar);
        k1.k kVar = new k1.k(executor, (k1.d) iVar);
        M m4 = nVar.f5170b;
        m4.c(kVar);
        nVar.n();
        m4.c(new k1.k(executor, (k1.b) iVar));
        nVar.n();
        if (iVar.f1983f.await(j4, timeUnit)) {
            return P(nVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static C0532i e(C0532i c0532i) {
        C0529f c0529f = c0532i.f5486f;
        c0529f.b();
        return c0529f.f5477n > 0 ? c0532i : C0532i.f5485g;
    }

    public static n f(Executor executor, Callable callable) {
        U0.t.g(executor, "Executor must not be null");
        n nVar = new n();
        executor.execute(new A.a(nVar, 16, callable));
        return nVar;
    }

    public static final long k(long j4) {
        long j7 = (j4 << 1) + 1;
        int i7 = G5.a.f864i;
        int i8 = b.f866a;
        return j7;
    }

    public static final long l(long j4) {
        return (-4611686018426L > j4 || j4 >= 4611686018427L) ? k(g.i(j4)) : m(j4 * 1000000);
    }

    public static final long m(long j4) {
        long j7 = j4 << 1;
        int i7 = G5.a.f864i;
        int i8 = b.f866a;
        return j7;
    }

    public static final C0621b n(Enum[] entries) {
        i.e(entries, "entries");
        return new C0621b(entries);
    }

    public static n p(Object obj) {
        n nVar = new n();
        nVar.k(obj);
        return nVar;
    }

    public static final int q(Cursor c7, String str) {
        String str2;
        i.e(c7, "c");
        int columnIndex = c7.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c7.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c7.getColumnNames();
                    i.d(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i8 < length) {
                        String str4 = columnNames[i8];
                        int i9 = i7 + 1;
                        if (str4.length() >= str.length() + 2 && (q.B(str4, concat) || (str4.charAt(0) == '`' && q.B(str4, str3)))) {
                            columnIndex = i7;
                            break;
                        }
                        i8++;
                        i7 = i9;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c7.getColumnNames();
            i.d(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i10 = 0;
            for (String str5 : columnNames2) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) ", ");
                }
                AbstractC0676f.b(sb, str5, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e4) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e4);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static C0694b r(long j4, String rootDir) {
        i.e(rootDir, "rootDir");
        File file = new File(rootDir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30L);
        timeUnit.toMillis(33L);
        TimeUnit.HOURS.toMillis(18L);
        byte b7 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
        int i7 = G5.a.f864i;
        c unit = c.f871k;
        i.e(unit, "unit");
        long m4 = unit.compareTo(c.f869i) <= 0 ? m(AbstractC0223a.f(72, unit, c.f867g)) : C(72, unit);
        long f7 = ((((int) m4) & 1) != 1 || G5.a.d(m4)) ? G5.a.f(m4, c.f868h) : m4 >> 1;
        byte b8 = (byte) (b7 | 4);
        if (b8 == 31) {
            C0693a c0693a = new C0693a(2000L, j4, f7);
            if (j4 <= 2000) {
                throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("destinationDir must be a directory");
            }
            if (file.exists() || file.mkdirs()) {
                return new C0694b(new C0600a(new C0603d(new C0601b(file, c0693a)), new V5.g(12)));
            }
            throw new IllegalStateException("Could not create dir: " + file);
        }
        StringBuilder sb = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb.append(" maxFileAgeForWriteMillis");
        }
        if ((b8 & 2) == 0) {
            sb.append(" minFileAgeForReadMillis");
        }
        if ((b8 & 4) == 0) {
            sb.append(" maxFileAgeForReadMillis");
        }
        if ((b8 & 8) == 0) {
            sb.append(" maxFileSize");
        }
        if ((b8 & 16) == 0) {
            sb.append(" maxFolderSize");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public static void s(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(final Context context) {
        final boolean z5;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC0223a.w(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z5 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                p(null);
                return;
            } else {
                final k1.h hVar = new k1.h();
                new Runnable() { // from class: H1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        String notificationDelegate;
                        Context context2 = context;
                        k1.h hVar2 = hVar;
                        try {
                            if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                return;
                            }
                            SharedPreferences.Editor edit = AbstractC0223a.w(context2).edit();
                            edit.putBoolean("proxy_notification_initialized", true);
                            edit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z5) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else {
                                notificationDelegate = notificationManager.getNotificationDelegate();
                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            }
                        } finally {
                            hVar2.c(null);
                        }
                    }
                }.run();
                return;
            }
        }
        z5 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean u() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Y.a.c();
        }
        try {
            if (f3110b == null) {
                f3109a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3110b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3110b.invoke(null, Long.valueOf(f3109a))).booleanValue();
        } catch (Exception e4) {
            s("isTagEnabled", e4);
            return false;
        }
    }

    public static boolean v(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("ContentSizingFlag", "Could not get metadata", e4);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static I4.e w(Context context) {
        String str;
        String str2;
        int i7;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = E3.f.f635a.f633b;
            String str4 = E3.f.f636b.f633b;
            String str5 = null;
            if (bundle == null) {
                str = null;
            } else {
                String string = bundle.getString(str3, null);
                if (string == null) {
                    string = bundle.getString(str4);
                }
                str = string;
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str6 = E3.f.f640f.f633b;
            if (bundle2 != null) {
                bundle2.getString(str6, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str7 = E3.f.f641g.f633b;
            if (bundle3 != null) {
                bundle3.getString(str7, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str8 = E3.f.f637c.f633b;
            String str9 = E3.f.f638d.f633b;
            if (bundle4 == null) {
                str2 = null;
            } else {
                String string2 = bundle4.getString(str8, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str9);
                }
                str2 = string2;
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i7 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i7);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                z(xml, jSONArray, false);
                            }
                        }
                    }
                    str5 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str10 = str5;
            String str11 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new I4.e(str, str2, str10, str11, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String x(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }

    public static Set y(Set set, Set elements) {
        i.e(set, "<this>");
        i.e(elements, "elements");
        if (elements.isEmpty()) {
            return AbstractC0506j.T(set);
        }
        if (!(elements instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(elements);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!elements.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static void z(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z5) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z5);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    z(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public abstract void N();

    public abstract Typeface g(Context context, C0698c c0698c, Resources resources, int i7);

    public abstract Typeface h(Context context, A.k[] kVarArr, int i7);

    public Typeface i(Context context, InputStream inputStream) {
        File z5 = AbstractC0223a.z(context);
        if (z5 == null) {
            return null;
        }
        try {
            if (AbstractC0223a.p(z5, inputStream)) {
                return Typeface.createFromFile(z5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            z5.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i7, String str, int i8) {
        File z5 = AbstractC0223a.z(context);
        if (z5 == null) {
            return null;
        }
        try {
            if (AbstractC0223a.o(z5, resources, i7)) {
                return Typeface.createFromFile(z5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            z5.delete();
        }
    }

    public A.k o(A.k[] kVarArr, int i7) {
        new U0.h(14);
        int i8 = (i7 & 1) == 0 ? 400 : 700;
        boolean z5 = (i7 & 2) != 0;
        A.k kVar = null;
        int i9 = Integer.MAX_VALUE;
        for (A.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f30c - i8) * 2) + (kVar2.f31d == z5 ? 0 : 1);
            if (kVar == null || i9 > abs) {
                kVar = kVar2;
                i9 = abs;
            }
        }
        return kVar;
    }
}
