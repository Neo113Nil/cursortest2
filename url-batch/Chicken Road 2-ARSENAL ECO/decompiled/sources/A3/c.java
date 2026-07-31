package A3;

import F5.f;
import F5.h;
import F5.j;
import H5.AbstractC0165z;
import H5.C0156p;
import H5.r;
import I.n;
import M5.s;
import N.p;
import T5.M;
import W4.o;
import X5.q;
import a.AbstractC0219a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.widget.TextView;
import com.google.firebase.messaging.FirebaseMessaging;
import i6.g;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import k.C0462v;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v;
import l5.AbstractC0501e;
import l5.C0512p;
import m1.AbstractC0521b;
import n1.InterfaceC0541a;
import p5.EnumC0580a;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;
import z3.e;
import z3.i;
import z3.m;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c implements S5.b, S5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49a;

    public /* synthetic */ c(int i7) {
        this.f49a = i7;
    }

    public static final void D(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g.a(th, th2);
            }
        }
    }

    public static final void E(i iVar, String str) {
        z3.d dVar = z3.d.f6297g;
        D5.c cVar = iVar.f6324b;
        m mVar = m.f6336g;
        new e(iVar, cVar, iVar.f6326d);
    }

    public static Bundle F(Parcel parcel, int i7) {
        int Z3 = Z(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (Z3 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Z3);
        return readBundle;
    }

    public static Parcelable G(Parcel parcel, int i7, Parcelable.Creator creator) {
        int Z3 = Z(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (Z3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Z3);
        return parcelable;
    }

    public static String H(Parcel parcel, int i7) {
        int Z3 = Z(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (Z3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Z3);
        return readString;
    }

    public static Object[] I(Parcel parcel, int i7, Parcelable.Creator creator) {
        int Z3 = Z(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (Z3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Z3);
        return createTypedArray;
    }

    public static boolean L() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            m1.g.c();
            m1.g c7 = m1.g.c();
            c7.a();
            Context context = c7.f5425a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean M(Method method, kotlin.jvm.internal.d dVar) {
        Class a7 = dVar.a();
        kotlin.jvm.internal.i.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a7);
    }

    public static void N(Parcel parcel, int i7) {
        if (parcel.dataPosition() != i7) {
            throw new r(o.c("Overread allowed size end=", i7), parcel);
        }
    }

    public static final boolean O(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static q P(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        B0.c a7 = q.f2982b.a(str, 0);
        if (a7 == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((f) a7.f71g) == null) {
            a7.f71g = new f(a7);
        }
        f fVar = (f) a7.f71g;
        kotlin.jvm.internal.i.b(fVar);
        String str2 = (String) fVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
        if (((f) a7.f71g) == null) {
            a7.f71g = new f(a7);
        }
        f fVar2 = (f) a7.f71g;
        kotlin.jvm.internal.i.b(fVar2);
        String lowerCase2 = ((String) fVar2.get(2)).toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a7.f72h;
        int i7 = g.B(matcher.start(), matcher.end()).f229g;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= str.length()) {
                return new q(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            B0.c a8 = q.f2983c.a(str, i8);
            if (a8 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i8);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Matcher matcher2 = (Matcher) a8.f72h;
            h hVar = (h) a8.f73i;
            F5.e b7 = hVar.b(1);
            String str3 = b7 != null ? b7.f800a : null;
            if (str3 == null) {
                i7 = g.B(matcher2.start(), matcher2.end()).f229g;
            } else {
                F5.e b8 = hVar.b(2);
                String str4 = b8 != null ? b8.f800a : null;
                if (str4 == null) {
                    F5.e b9 = hVar.b(3);
                    kotlin.jvm.internal.i.b(b9);
                    str4 = b9.f800a;
                } else if (j.d0(str4, '\'') && str4.length() > 0 && AbstractC0521b.m(str4.charAt(j.O(str4)), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    kotlin.jvm.internal.i.d(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i7 = g.B(matcher2.start(), matcher2.end()).f229g;
            }
        }
    }

    public static B.c Q(C0462v c0462v) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new B.c(I.o.c(c0462v));
        }
        TextPaint textPaint = new TextPaint(c0462v.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a7 = I.m.a(c0462v);
        int d7 = I.m.d(c0462v);
        if (c0462v.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i7 < 28 || (c0462v.getInputType() & 15) != 3) {
                boolean z5 = c0462v.getLayoutDirection() == 1;
                switch (c0462v.getTextDirection()) {
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z5) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(I.o.b(n.a(c0462v.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new B.c(textPaint, textDirectionHeuristic, a7, d7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List R(List list, String str) {
        kotlin.jvm.internal.i.e(list, "list");
        boolean z5 = list instanceof d;
        List list2 = list;
        if (z5) {
            list2 = ((d) list).f51g;
        }
        if (list2 == C0512p.f5303f || (list2 instanceof a)) {
            return list2;
        }
        a aVar = new a(list2);
        if (aVar.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(Intent intent) {
        long parseLong;
        if (g0(intent)) {
            T("_nr", intent.getExtras());
        }
        int i7 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : L()) {
            A0.e eVar = (A0.e) FirebaseMessaging.f3899l.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            I1.d dVar = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    i7 = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i7 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i8 = i7;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        m1.g c7 = m1.g.c();
                        try {
                            Object obj2 = B1.d.f91m;
                            string = (String) AbstractC0219a.c(((B1.d) c7.b(B1.e.class)).c());
                        } catch (InterruptedException e4) {
                            e = e4;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e7) {
                        e = e7;
                    }
                }
                String str2 = string;
                m1.g c8 = m1.g.c();
                c8.a();
                String packageName = c8.f5425a.getPackageName();
                I1.b bVar = J1.c.n(extras) ? I1.b.DISPLAY_NOTIFICATION : I1.b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str3 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str = string3;
                }
                String str4 = str != null ? str : "";
                String string4 = extras.getString("collapse_key");
                String str5 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str6 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str7 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e8) {
                        Log.w("FirebaseMessaging", "error parsing project number", e8);
                    }
                    dVar = new I1.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i8, str4, str6, str7);
                }
                m1.g c9 = m1.g.c();
                m1.i iVar = c9.f5427c;
                c9.a();
                String str8 = iVar.f5443e;
                if (str8 != null) {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e9) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e9);
                    }
                    dVar = new I1.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i8, str4, str6, str7);
                }
                c9.a();
                String str9 = iVar.f5440b;
                if (str9.startsWith("1:")) {
                    String[] split = str9.split(":");
                    if (split.length >= 2) {
                        String str10 = split[1];
                        if (!str10.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str10);
                            } catch (NumberFormatException e10) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e10);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str9);
                    } catch (NumberFormatException e11) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e11);
                    }
                }
                dVar = new I1.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i8, str4, str6, str7);
            }
            if (dVar == null) {
                return;
            }
            try {
                A0.b bVar2 = new A0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                A0.c cVar = new A0.c("proto");
                B1.g gVar = new B1.g(9);
                D0.r rVar = (D0.r) eVar;
                Set set = rVar.f354a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new B0.c(rVar.f355b, cVar, gVar, rVar.f356c).y(new A0.a(new I1.e(dVar), bVar2));
            } catch (RuntimeException e12) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e12);
            }
        }
    }

    public static void T(String str, Bundle bundle) {
        try {
            m1.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e4);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e7);
                }
            }
            String str2 = J1.c.n(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (m1.g.c().b(InterfaceC0541a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final void U(LinkedHashMap linkedHashMap, String str, String str2) {
        if (str2 != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static boolean X(Parcel parcel, int i7) {
        n0(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static int Y(Parcel parcel, int i7) {
        n0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static int Z(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static final void a0(int i7, int i8, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static final String b0(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i7 = 0; i7 < value.length(); i7++) {
            char charAt = value.charAt(i7);
            if (j.M(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static void e0(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            I.o.d(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void f0(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static boolean g0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void h0(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + Z(parcel, i7));
    }

    public static final Object i0(s sVar, s sVar2, InterfaceC0747p interfaceC0747p) {
        Object c0156p;
        Object J3;
        try {
            v.b(2, interfaceC0747p);
            c0156p = interfaceC0747p.invoke(sVar2, sVar);
        } catch (Throwable th) {
            c0156p = new C0156p(th, false);
        }
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        if (c0156p == enumC0580a || (J3 = sVar.J(c0156p)) == AbstractC0165z.f1118e) {
            return enumC0580a;
        }
        if (J3 instanceof C0156p) {
            throw ((C0156p) J3).f1093a;
        }
        return AbstractC0165z.r(J3);
    }

    public static final k5.o j0(String str) {
        int i7;
        AbstractC0521b.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.i.g(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i7 = 0;
        }
        int i9 = 119304647;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            int i10 = i8 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i8 * 10;
            int i12 = digit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i8 = i12;
        }
        return new k5.o(i8);
    }

    public static final k5.q k0(String str) {
        int i7;
        long j4;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i8 = 10;
        AbstractC0521b.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i9 = 1;
        if (kotlin.jvm.internal.i.g(charAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i7 = 1;
        }
        long j7 = 10;
        long j8 = 0;
        long j9 = 512409557603043100L;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), i8);
            if (digit < 0) {
                return null;
            }
            int i10 = length;
            long j10 = j8 ^ Long.MIN_VALUE;
            int i11 = i7;
            if (Long.compare(j10, j9 ^ Long.MIN_VALUE) <= 0) {
                j4 = j7;
            } else {
                if (j9 != 512409557603043100L) {
                    return null;
                }
                if (j7 >= 0) {
                    long j11 = (Long.MAX_VALUE / j7) << i9;
                    j4 = j7;
                    j9 = j11 + ((((-1) - (j11 * j7)) ^ Long.MIN_VALUE) >= (j7 ^ Long.MIN_VALUE) ? i9 : 0);
                } else if (Long.MAX_VALUE < (j7 ^ Long.MIN_VALUE)) {
                    j4 = j7;
                    j9 = 0;
                } else {
                    j9 = 1;
                    j4 = j7;
                }
                if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j12 = j8 * j4;
            long j13 = (digit & 4294967295L) + j12;
            if (Long.compare(j13 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i7 = i11 + 1;
            j8 = j13;
            length = i10;
            j7 = j4;
            i8 = 10;
            i9 = 1;
        }
        return new k5.q(j8);
    }

    public static int l0(Parcel parcel) {
        int readInt = parcel.readInt();
        int Z3 = Z(parcel, readInt);
        char c7 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c7 != 20293) {
            throw new r("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i7 = Z3 + dataPosition;
        if (i7 < dataPosition || i7 > parcel.dataSize()) {
            throw new r(C1.c.f(dataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        return i7;
    }

    public static final boolean m0(String str, InterfaceC0732a interfaceC0732a) {
        try {
            boolean booleanValue = ((Boolean) interfaceC0732a.invoke()).booleanValue();
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

    public static void n0(Parcel parcel, int i7, int i8) {
        int Z3 = Z(parcel, i7);
        if (Z3 == i8) {
            return;
        }
        String hexString = Integer.toHexString(Z3);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(Z3);
        sb.append(" (0x");
        throw new r(p.b(sb, hexString, ")"), parcel);
    }

    public static Object y(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final String z(Object[] objArr, int i7, int i8, AbstractC0501e abstractC0501e) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == abstractC0501e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public abstract boolean A(r.h hVar, r.d dVar, r.d dVar2);

    public abstract boolean B(r.h hVar, Object obj, Object obj2);

    public abstract boolean C(r.h hVar, r.g gVar, r.g gVar2);

    public Object J(Q5.a deserializer) {
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        return deserializer.b(this);
    }

    public void K() {
        throw new Q5.c(t.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract void V(r.g gVar, r.g gVar2);

    public abstract void W(r.g gVar, Thread thread);

    @Override // S5.b
    public abstract long a();

    @Override // S5.a
    public char b(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return h();
    }

    @Override // S5.a
    public float c(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return v();
    }

    @Override // S5.a
    public long d(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return a();
    }

    public abstract void d0(boolean z5);

    @Override // S5.a
    public short e(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return t();
    }

    @Override // S5.b
    public boolean f() {
        K();
        throw null;
    }

    @Override // S5.b
    public boolean g() {
        return true;
    }

    @Override // S5.b
    public char h() {
        K();
        throw null;
    }

    public int hashCode() {
        switch (this.f49a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // S5.a
    public void i(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
    }

    @Override // S5.a
    public Object k(R5.e descriptor, int i7, Q5.a deserializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        return J(deserializer);
    }

    @Override // S5.a
    public byte l(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return r();
    }

    @Override // S5.a
    public boolean m(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return f();
    }

    @Override // S5.a
    public int n(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return p();
    }

    @Override // S5.a
    public S5.b o(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return s(descriptor.h(i7));
    }

    @Override // S5.b
    public abstract int p();

    @Override // S5.a
    public double q(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return x();
    }

    @Override // S5.b
    public abstract byte r();

    @Override // S5.b
    public S5.b s(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this;
    }

    @Override // S5.b
    public abstract short t();

    public String toString() {
        switch (this.f49a) {
            case 7:
                String b7 = t.a(getClass()).b();
                kotlin.jvm.internal.i.b(b7);
                return b7;
            default:
                return super.toString();
        }
    }

    @Override // S5.b
    public String u() {
        K();
        throw null;
    }

    @Override // S5.b
    public float v() {
        K();
        throw null;
    }

    @Override // S5.b
    public S5.a w(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this;
    }

    @Override // S5.b
    public double x() {
        K();
        throw null;
    }

    public void c0(boolean z5) {
    }
}
