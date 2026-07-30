package d4;

import I.Z;
import P.C0141f;
import P.C0143h;
import P.C0147l;
import P.InterfaceC0144i;
import R5.C0164d;
import T6.i;
import X5.j;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.C0314d;
import i.AbstractActivityC0525l;
import i4.AbstractC0549e;
import i4.C0547c;
import io.flutter.plugins.GeneratedPluginRegistrant;
import j0.C0565c;
import j0.C0566d;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m0.C0684c;
import n6.AbstractC0792z;
import n6.F;
import n6.m0;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import q1.h;
import u6.C0953e;
import u6.ExecutorC0952d;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c implements Z {

    /* renamed from: a, reason: collision with root package name */
    public static Field f4652a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4653b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f4654c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4655d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f4656e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4657f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f4658g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4659h;

    public static boolean A(double d7, double d8) {
        if ((d7 == 0.0d ? 0.0d : d7) != (d8 != 0.0d ? d8 : 0.0d)) {
            return Double.isNaN(d7) && Double.isNaN(d8);
        }
        return true;
    }

    public static String B(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        StringBuilder sb = new StringBuilder("sha256/");
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        i iVar = i.f2618l;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        int i2 = 0;
        i s7 = h.s(encoded, 0, -1234567890);
        Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(s7.f2619d, 0, s7.a());
        byte[] digest = messageDigest.digest();
        Intrinsics.b(digest);
        new i(digest);
        byte[] map = T6.a.f2602a;
        Intrinsics.checkNotNullParameter(digest, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i5 = 0;
        while (i2 < length) {
            byte b7 = digest[i2];
            int i7 = i2 + 2;
            byte b8 = digest[i2 + 1];
            i2 += 3;
            byte b9 = digest[i7];
            bArr[i5] = map[(b7 & 255) >> 2];
            bArr[i5 + 1] = map[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i8 = i5 + 3;
            bArr[i5 + 2] = map[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i5 += 4;
            bArr[i8] = map[b9 & 63];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b10 = digest[i2];
            bArr[i5] = map[(b10 & 255) >> 2];
            bArr[i5 + 1] = map[(b10 & 3) << 4];
            bArr[i5 + 2] = 61;
            bArr[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i9 = i2 + 1;
            byte b11 = digest[i2];
            byte b12 = digest[i9];
            bArr[i5] = map[(b11 & 255) >> 2];
            bArr[i5 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr[i5 + 2] = map[(b12 & 15) << 2];
            bArr[i5 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        sb.append(new String(bArr, Charsets.UTF_8));
        return sb.toString();
    }

    public static S.b C(String name, l2.c cVar, U1.a aVar, int i2) {
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        Function1 produceMigrations = aVar;
        if ((i2 & 4) != 0) {
            produceMigrations = S.a.f2444d;
        }
        C0953e c0953e = F.f7011a;
        ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
        m0 m0Var = new m0();
        executorC0952d.getClass();
        s6.c scope = AbstractC0792z.b(e.c(executorC0952d, m0Var));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new S.b(name, cVar, produceMigrations, scope);
    }

    public static boolean D(Parcel parcel, int i2) {
        O(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static final List E(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        S5.e eVar = new S5.e(0, 1, null);
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            eVar.add(new C0565c(string, string2, i2, i5));
        }
        return CollectionsKt.w(q.a(eVar));
    }

    public static final C0566d F(C0684c c0684c, String str, boolean z7) {
        Cursor E7 = c0684c.E("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = E7.getColumnIndex("seqno");
            int columnIndex2 = E7.getColumnIndex("cid");
            int columnIndex3 = E7.getColumnIndex("name");
            int columnIndex4 = E7.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (E7.moveToNext()) {
                    if (E7.getInt(columnIndex2) >= 0) {
                        int i2 = E7.getInt(columnIndex);
                        String columnName = E7.getString(columnIndex3);
                        String str2 = E7.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i2);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List z8 = CollectionsKt.z(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                C0566d c0566d = new C0566d(str, z7, z8, CollectionsKt.z(values2));
                E7.close();
                return c0566d;
            }
            E7.close();
            return null;
        } finally {
        }
    }

    public static int G(Parcel parcel, int i2) {
        O(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int H(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void I(C0547c c0547c) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C0547c.class).invoke(null, c0547c);
        } catch (Exception e7) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c0547c + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }

    public static void J(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i2));
    }

    public static int K(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static byte[] L(C0314d c0314d) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < min2) {
                int read = c0314d.read(bArr, i5, min2 - i5);
                if (read == -1) {
                    return f(arrayDeque, i2);
                }
                i5 += read;
                i2 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (c0314d.read() == -1) {
            return f(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int M(Parcel parcel) {
        int readInt = parcel.readInt();
        int H7 = H(parcel, readInt);
        char c7 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c7 != 20293) {
            throw new E1.i("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = H7 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new E1.i(sb.toString(), parcel);
    }

    public static ArrayList N(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void O(Parcel parcel, int i2, int i5) {
        int H7 = H(parcel, i2);
        if (H7 == i5) {
            return;
        }
        String hexString = Integer.toHexString(H7);
        int length = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(H7).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(H7);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new E1.i(sb.toString(), parcel);
    }

    public static void P(int i2, int i5) {
        String O7;
        if (i2 < 0 || i2 >= i5) {
            if (i2 < 0) {
                O7 = AbstractC1053a.O("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i5 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i5);
                    throw new IllegalArgumentException(sb.toString());
                }
                O7 = AbstractC1053a.O("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(O7);
        }
    }

    public static void Q(int i2, int i5, int i7) {
        if (i2 < 0 || i5 < i2 || i5 > i7) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i7) ? R("start index", i2, i7) : (i5 < 0 || i5 > i7) ? R("end index", i5, i7) : AbstractC1053a.O("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2)));
        }
    }

    public static String R(String str, int i2, int i5) {
        if (i2 < 0) {
            return AbstractC1053a.O("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i5 >= 0) {
            return AbstractC1053a.O("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void d(Logger logger, G6.a aVar, G6.c cVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f853b);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f846a);
        logger.fine(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(List list, C0147l c0147l, X5.c cVar) {
        C0141f c0141f;
        int i2;
        List list2;
        D d7;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0141f) {
            c0141f = (C0141f) cVar;
            int i5 = c0141f.f2079l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0141f.f2079l = i5 - Integer.MIN_VALUE;
                Object obj = c0141f.f2078i;
                Object obj2 = W5.a.f2787d;
                i2 = c0141f.f2079l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    ArrayList arrayList = new ArrayList();
                    C0143h c0143h = new C0143h(list, arrayList, null);
                    c0141f.f2076d = arrayList;
                    c0141f.f2079l = 1;
                    if (c0147l.a(c0143h, c0141f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0141f.f2077e;
                        d7 = (D) c0141f.f2076d;
                        try {
                            V6.b.P(obj);
                        } catch (Throwable th2) {
                            Object obj3 = d7.f6152d;
                            if (obj3 == null) {
                                d7.f6152d = th2;
                            } else {
                                C0164d.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            c0141f.f2076d = d7;
                            c0141f.f2077e = it;
                            c0141f.f2079l = 2;
                            if (function1.invoke(c0141f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) d7.f6152d;
                        if (th == null) {
                            return Unit.f6114a;
                        }
                        throw th;
                    }
                    list2 = (List) c0141f.f2076d;
                    V6.b.P(obj);
                }
                d7 = new D();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) d7.f6152d;
                if (th == null) {
                }
            }
        }
        c0141f = new C0141f(cVar);
        Object obj4 = c0141f.f2078i;
        Object obj22 = W5.a.f2787d;
        i2 = c0141f.f2079l;
        if (i2 != 0) {
        }
        d7 = new D();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) d7.f6152d;
        if (th == null) {
        }
    }

    public static byte[] f(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static Bundle g(Parcel parcel, int i2) {
        int H7 = H(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (H7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + H7);
        return readBundle;
    }

    public static Parcelable h(Parcel parcel, int i2, Parcelable.Creator creator) {
        int H7 = H(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (H7 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + H7);
        return parcelable;
    }

    public static String i(Parcel parcel, int i2) {
        int H7 = H(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (H7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + H7);
        return readString;
    }

    public static Object[] j(Parcel parcel, int i2, Parcelable.Creator creator) {
        int H7 = H(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (H7 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + H7);
        return createTypedArray;
    }

    public static void k(String str, String str2, Object obj) {
        String u7 = u(str);
        if (Log.isLoggable(u7, 3)) {
            Log.d(u7, String.format(str2, obj));
        }
    }

    public static void l(String str, String str2, Exception exc) {
        String u7 = u(str);
        if (Log.isLoggable(u7, 6)) {
            Log.e(u7, str2, exc);
        }
    }

    public static final Object m(InterfaceC0144i interfaceC0144i, Function2 function2, j jVar) {
        return interfaceC0144i.a(new T.h(function2, null), jVar);
    }

    public static void n(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new E1.i(sb.toString(), parcel);
    }

    public static final Y5.b o(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new Y5.b(entries);
    }

    public static final String p(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final Object q(T.b bVar, T.d key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object c7 = bVar.c(key);
        return c7 == null ? serializable : c7;
    }

    public static Intent r(AbstractActivityC0525l abstractActivityC0525l) {
        Intent parentActivityIntent = abstractActivityC0525l.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String t6 = t(abstractActivityC0525l, abstractActivityC0525l.getComponentName());
            if (t6 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0525l, t6);
            try {
                return t(abstractActivityC0525l, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + t6 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static Intent s(AbstractActivityC0525l abstractActivityC0525l, ComponentName componentName) {
        String t6 = t(abstractActivityC0525l, componentName);
        if (t6 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), t6);
        return t(abstractActivityC0525l, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String t(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String u(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static boolean v(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static p5.d w(Context context) {
        String string;
        String string2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = AbstractC0549e.f5527a.f5525b;
            String str2 = AbstractC0549e.f5528b.f5525b;
            String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(str, null);
                if (string == null) {
                    string = bundle.getString(str2);
                }
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str4 = AbstractC0549e.f5532f.f5525b;
            if (bundle2 != null) {
                bundle2.getString(str4, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str5 = AbstractC0549e.f5533g.f5525b;
            if (bundle3 != null) {
                bundle3.getString(str5, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str6 = AbstractC0549e.f5529c.f5525b;
            String str7 = AbstractC0549e.f5530d.f5525b;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(str6, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str7);
                }
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                x(xml, jSONArray, false);
                            }
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str8 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new p5.d(bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true, string, string2, str3, str8);
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void x(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z7) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z7);
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
                    x(xmlResourceParser, jSONArray, attributeBooleanValue);
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

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        if (y(r2, r5.getValue()) == false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
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
            if (dArr.length != dArr2.length) {
                return false;
            }
            for (int i2 = 0; i2 < dArr.length; i2++) {
                if (!A(dArr[i2], dArr2[i2])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                if (!y(list.get(i5), list2.get(i5))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            if ((obj instanceof Double) && (obj2 instanceof Double)) {
                return A(((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
            }
            if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
                return obj.equals(obj2);
            }
            float floatValue = ((Float) obj).floatValue();
            float floatValue2 = ((Float) obj2).floatValue();
            return ((floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1)) == 0 ? 0.0f : floatValue) == (floatValue2 != 0.0f ? floatValue2 : 0.0f) || (Float.isNaN(floatValue) && Float.isNaN(floatValue2));
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        loop2: for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Iterator it = map2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (y(key, entry2.getKey())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static int z(Object obj) {
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
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 = (i5 * 31) + z(it.next());
            }
            return i5;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i2 += z(entry.getValue()) ^ (z(entry.getKey()) * 31);
            }
            return i2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length2 = objArr.length;
            while (i2 < length2) {
                i5 = (i5 * 31) + z(objArr[i2]);
                i2++;
            }
            return i5;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            long doubleToLongBits2 = Double.doubleToLongBits(doubleValue != 0.0d ? doubleValue : 0.0d);
            return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float floatValue = ((Float) obj).floatValue();
        if (floatValue == 0.0f) {
            floatValue = 0.0f;
        }
        return Float.floatToIntBits(floatValue);
    }

    @Override // I.Z
    public void b() {
    }

    @Override // I.Z
    public void c() {
    }
}
