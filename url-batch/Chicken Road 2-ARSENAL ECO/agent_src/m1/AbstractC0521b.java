package m1;

import D.C;
import D.D;
import D3.M;
import F5.q;
import H5.r;
import N.p;
import V5.s;
import W4.o;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.strategylink.Row.Five.R;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.v0;
import k5.C0480j;
import k5.C0481k;
import k5.EnumC0476f;
import k5.InterfaceC0475e;
import k5.w;
import kotlin.jvm.internal.t;
import l0.C0489c;
import x4.j;
import x5.InterfaceC0732a;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0521b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5414a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f5415b;

    public static V3.a A(List list) {
        M m4 = new M(27);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String str = jVar.f6219h;
            x4.b bVar = jVar.f6220i;
            String str2 = bVar.f6199h;
            Double d7 = bVar.f6202k;
            Long l7 = bVar.f6201j;
            Boolean bool = bVar.f6200i;
            V3.b bVar2 = V3.b.f2707f;
            if (str2 != null) {
                m4.u(a4.e.a(bVar2, str), bVar.f6199h);
            } else if (bool != null) {
                m4.u(a4.e.a(V3.b.f2708g, str), bool);
            } else if (l7 != null) {
                m4.u(a4.e.a(V3.b.f2709h, str), l7);
            } else if (d7 != null) {
                m4.u(a4.e.a(V3.b.f2710i, str), d7);
            } else {
                x4.d dVar = bVar.f6203l;
                if (dVar != null) {
                    List list2 = dVar.f6207h;
                    x4.b bVar3 = (x4.b) list2.get(0);
                    if (bVar3.f6199h != null) {
                        a4.e a7 = a4.e.a(V3.b.f2711j, str);
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((x4.b) it2.next()).f6199h);
                        }
                        m4.u(a7, arrayList);
                    } else if (bVar3.f6200i != null) {
                        a4.e a8 = a4.e.a(V3.b.f2712k, str);
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((x4.b) it3.next()).f6200i);
                        }
                        m4.u(a8, arrayList2);
                    } else if (bVar3.f6201j != null) {
                        a4.e a9 = a4.e.a(V3.b.f2713l, str);
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((x4.b) it4.next()).f6201j);
                        }
                        m4.u(a9, arrayList3);
                    } else {
                        if (bVar3.f6202k == null) {
                            throw new UnsupportedOperationException();
                        }
                        a4.e a10 = a4.e.a(V3.b.f2714m, str);
                        ArrayList arrayList4 = new ArrayList(list2.size());
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((x4.b) it5.next()).f6202k);
                        }
                        m4.u(a10, arrayList4);
                    }
                } else {
                    m4.u(a4.e.a(bVar2, str), "");
                }
            }
        }
        return m4.t();
    }

    public static void B(H3.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i7 = 0; i7 < trackCount; i7++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i7);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i8 = dVar.f1017g;
                    int i9 = dVar.f1016f;
                    if (integer != 90 && integer != 270) {
                        i9 = i8;
                        i8 = i9;
                    }
                    dVar.f1012b = i8;
                    dVar.f1011a = i9;
                    dVar.f1013c = integer;
                    return;
                }
            }
        } catch (Exception e4) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e4);
        }
    }

    public static void C(E3.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", E3.c.class).invoke(null, cVar);
        } catch (Exception e4) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e4);
        }
    }

    public static final int D(int i7) {
        o.f("state", i7);
        int c7 = p.c(i7);
        if (c7 == 0) {
            return 0;
        }
        int i8 = 1;
        if (c7 != 1) {
            i8 = 2;
            if (c7 != 2) {
                i8 = 3;
                if (c7 != 3) {
                    i8 = 4;
                    if (c7 != 4) {
                        if (c7 == 5) {
                            return 5;
                        }
                        throw new r();
                    }
                }
            }
        }
        return i8;
    }

    public static final void a(s sVar) {
        kotlin.jvm.internal.i.e(sVar, "<this>");
        if ((sVar instanceof s ? sVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + t.a(sVar.getClass()));
    }

    public static final V5.r b(S5.b bVar) {
        kotlin.jvm.internal.i.e(bVar, "<this>");
        V5.r rVar = bVar instanceof V5.r ? (V5.r) bVar : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + t.a(bVar.getClass()));
    }

    public static final LinkedHashSet e(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.i.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i7 = 0; i7 < readInt; i7++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                kotlin.jvm.internal.i.d(uri, "uri");
                linkedHashSet.add(new C0489c(readBoolean, uri));
            }
            objectInputStream.close();
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(int i7) {
        if (2 > i7 || i7 >= 37) {
            throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new C5.c(2, 36, 1));
        }
    }

    public static final void h(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static void i(String str, String str2, Object obj) {
        String o7 = o(str);
        if (Log.isLoggable(o7, 3)) {
            Log.d(o7, String.format(str2, obj));
        }
    }

    public static int j(String str, int i7, int i8, boolean z5) {
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z5)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = D.f240a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C.f236d;
        C c7 = (C) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c7 == null) {
            c7 = new C();
            c7.f237a = null;
            c7.f238b = null;
            c7.f239c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c7);
        }
        WeakReference weakReference2 = c7.f239c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c7.f239c = new WeakReference(keyEvent);
        if (c7.f238b == null) {
            c7.f238b = new SparseArray();
        }
        SparseArray sparseArray = c7.f238b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static void l(String str, String str2, Exception exc) {
        String o7 = o(str);
        if (Log.isLoggable(o7, 6)) {
            Log.e(o7, str2, exc);
        }
    }

    public static final boolean m(char c7, char c8, boolean z5) {
        if (c7 == c8) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class n(D5.c cVar) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        Class a7 = ((kotlin.jvm.internal.c) cVar).a();
        if (a7.isPrimitive()) {
            String name = a7.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a7;
    }

    public static String o(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final int p(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(C1.c.g("Could not convert ", i7, " to BackoffPolicy"));
    }

    public static final int q(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
            throw new IllegalArgumentException(C1.c.g("Could not convert ", i7, " to NetworkType"));
        }
        return 6;
    }

    public static final int r(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(C1.c.g("Could not convert ", i7, " to OutOfQuotaPolicy"));
    }

    public static final int s(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 == 4) {
            return 5;
        }
        if (i7 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(C1.c.g("Could not convert ", i7, " to State"));
    }

    public static boolean t(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean u(StackTraceElement[] stackTrace) {
        kotlin.jvm.internal.i.e(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.i.d(className, "getClassName(...)");
            if (q.I(className, "com.onesignal")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean v(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    public static InterfaceC0475e w(EnumC0476f enumC0476f, InterfaceC0732a interfaceC0732a) {
        k5.s sVar = k5.s.f5216a;
        int ordinal = enumC0476f.ordinal();
        if (ordinal == 0) {
            return new C0481k(interfaceC0732a);
        }
        if (ordinal == 1) {
            C0480j c0480j = new C0480j();
            c0480j.f5202f = interfaceC0732a;
            c0480j.f5203g = sVar;
            return c0480j;
        }
        if (ordinal != 2) {
            throw new r();
        }
        w wVar = new w();
        wVar.f5220f = interfaceC0732a;
        wVar.f5221g = sVar;
        return wVar;
    }

    public static C0481k x(InterfaceC0732a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        return new C0481k(initializer);
    }

    public static long y(String str, int i7) {
        int j4 = j(str, 0, i7, false);
        Matcher matcher = X5.j.f2949n.matcher(str);
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (j4 < i7) {
            int j7 = j(str, j4 + 1, i7, true);
            matcher.region(j4, j7);
            if (i9 == -1 && matcher.usePattern(X5.j.f2949n).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.i.d(group, "group(...)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.i.d(group2, "group(...)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.i.d(group3, "group(...)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(X5.j.f2948m).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.i.d(group4, "group(...)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = X5.j.f2947l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.i.d(group5, "group(...)");
                        Locale US = Locale.US;
                        kotlin.jvm.internal.i.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.i.d(pattern2, "pattern(...)");
                        i11 = F5.j.R(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i8 == -1 && matcher.usePattern(X5.j.f2946k).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.i.d(group6, "group(...)");
                    i8 = Integer.parseInt(group6);
                }
            }
            j4 = j(str, j7 + 1, i7, false);
        }
        if (70 <= i8 && i8 < 100) {
            i8 += 1900;
        }
        if (i8 >= 0 && i8 < 70) {
            i8 += 2000;
        }
        if (i8 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i10 || i10 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Y5.e.f3102a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i8);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i10);
        gregorianCalendar.set(11, i9);
        gregorianCalendar.set(12, i12);
        gregorianCalendar.set(13, i13);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean z(String method) {
        kotlin.jvm.internal.i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public S0.a c(Context context, Looper looper, v0 v0Var, Object obj, S0.e eVar, S0.f fVar) {
        return d(context, looper, v0Var, obj, eVar, fVar);
    }

    public S0.a d(Context context, Looper looper, v0 v0Var, Object obj, S0.e eVar, S0.f fVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
