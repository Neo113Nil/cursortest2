package F3;

import F5.j;
import F5.q;
import X5.o;
import a.AbstractC0219a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l5.AbstractC0507k;
import l5.AbstractC0508l;
import t.C0640G;
import u0.C0689s;

/* loaded from: classes.dex */
public final class g implements O3.e, h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f732f;

    /* renamed from: g, reason: collision with root package name */
    public int f733g;

    /* renamed from: h, reason: collision with root package name */
    public Object f734h;

    /* renamed from: i, reason: collision with root package name */
    public Object f735i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f736j;

    /* renamed from: k, reason: collision with root package name */
    public Object f737k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f738l;

    /* renamed from: m, reason: collision with root package name */
    public Serializable f739m;

    /* renamed from: n, reason: collision with root package name */
    public Object f740n;

    public g(FlutterJNI flutterJNI) {
        this.f732f = 0;
        C0689s.t().getClass();
        this.f735i = new HashMap();
        this.f736j = new HashMap();
        this.f738l = new Object();
        this.f739m = new AtomicBoolean(false);
        this.f737k = new HashMap();
        this.f733g = 1;
        this.f740n = new i(0);
        new WeakHashMap();
        this.f734h = flutterJNI;
    }

    public static boolean o(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean p(N.f fVar) {
        return fVar == null || fVar.f1650i;
    }

    public static ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int Q6 = j.Q(str, '&', i7, 4);
            if (Q6 == -1) {
                Q6 = str.length();
            }
            int Q7 = j.Q(str, '=', i7, 4);
            if (Q7 == -1 || Q7 > Q6) {
                String substring = str.substring(i7, Q6);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i7, Q7);
                kotlin.jvm.internal.i.d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(Q7 + 1, Q6);
                kotlin.jvm.internal.i.d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i7 = Q6 + 1;
        }
        return arrayList;
    }

    public o a() {
        ArrayList arrayList;
        String str = (String) this.f734h;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c7 = m6.a.c(0, 0, 7, (String) this.f735i);
        String c8 = m6.a.c(0, 0, 7, (String) this.f736j);
        String str2 = (String) this.f737k;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int m4 = m();
        ArrayList arrayList2 = (ArrayList) this.f738l;
        ArrayList arrayList3 = new ArrayList(AbstractC0508l.C(arrayList2, 10));
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList3.add(m6.a.c(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = (ArrayList) this.f739m;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0508l.C(arrayList4, 10));
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? m6.a.c(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f740n;
        return new o(str, c7, c8, str2, m4, arrayList, str4 != null ? m6.a.c(0, 0, 7, str4) : null, toString());
    }

    public void b(boolean z5) {
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && z5) {
                fVar.f1649h.b(true);
            }
        }
    }

    public boolean c() {
        if (this.f733g < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && p(fVar) && fVar.f1649h.c()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z5 = true;
            }
        }
        if (((ArrayList) this.f736j) != null) {
            for (int i7 = 0; i7 < ((ArrayList) this.f736j).size(); i7++) {
                N.f fVar2 = (N.f) ((ArrayList) this.f736j).get(i7);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f736j = arrayList;
        return z5;
    }

    @Override // O3.e
    public void d(String str, O3.c cVar) {
        r(str, cVar);
    }

    public void e(boolean z5) {
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && z5) {
                fVar.f1649h.e(true);
            }
        }
    }

    public void f(final String str, final e eVar, final ByteBuffer byteBuffer, final int i7, final long j4) {
        i iVar = eVar != null ? eVar.f728b : null;
        String a7 = T3.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            Y.a.a(AbstractC0219a.D(a7), i7);
        } else {
            String D6 = AbstractC0219a.D(a7);
            try {
                if (AbstractC0219a.f3111c == null) {
                    AbstractC0219a.f3111c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0219a.f3111c.invoke(null, Long.valueOf(AbstractC0219a.f3109a), D6, Integer.valueOf(i7));
            } catch (Exception e4) {
                AbstractC0219a.s("asyncTraceBegin", e4);
            }
        }
        Runnable runnable = new Runnable() { // from class: F3.c
            @Override // java.lang.Runnable
            public final void run() {
                long j7 = j4;
                FlutterJNI flutterJNI = (FlutterJNI) g.this.f734h;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a8 = T3.a.a(sb.toString());
                int i8 = Build.VERSION.SDK_INT;
                int i9 = i7;
                if (i8 >= 29) {
                    Y.a.b(AbstractC0219a.D(a8), i9);
                } else {
                    String D7 = AbstractC0219a.D(a8);
                    try {
                        if (AbstractC0219a.f3112d == null) {
                            AbstractC0219a.f3112d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0219a.f3112d.invoke(null, Long.valueOf(AbstractC0219a.f3109a), D7, Integer.valueOf(i9));
                    } catch (Exception e7) {
                        AbstractC0219a.s("asyncTraceEnd", e7);
                    }
                }
                try {
                    T3.a.d("DartMessenger#handleMessageFromDart on " + str2);
                    e eVar2 = eVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (eVar2 != null) {
                            try {
                                try {
                                    eVar2.f727a.d(byteBuffer2, new f(flutterJNI, i9));
                                } catch (Exception e8) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e8);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
                                }
                            } catch (Error e9) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e9;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e9);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j7);
                }
            }
        };
        if (iVar == null) {
            iVar = (i) this.f740n;
        }
        iVar.f741a.post(runnable);
    }

    public void g(boolean z5) {
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && z5) {
                fVar.f1649h.g(true);
            }
        }
    }

    public boolean h() {
        if (this.f733g < 1) {
            return false;
        }
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && fVar.f1649h.h()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        if (this.f733g < 1) {
            return;
        }
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null) {
                fVar.f1649h.i();
            }
        }
    }

    public void j(boolean z5) {
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && z5) {
                fVar.f1649h.j(true);
            }
        }
    }

    @Override // O3.e
    public void k(String str, ByteBuffer byteBuffer, O3.d dVar) {
        FlutterJNI flutterJNI = (FlutterJNI) this.f734h;
        T3.a.d("DartMessenger#send on " + str);
        try {
            int i7 = this.f733g;
            this.f733g = i7 + 1;
            if (dVar != null) {
                ((HashMap) this.f737k).put(Integer.valueOf(i7), dVar);
            }
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i7);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i7);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean l() {
        boolean z5 = false;
        if (this.f733g < 1) {
            return false;
        }
        for (N.f fVar : ((C0689s) this.f735i).r()) {
            if (fVar != null && p(fVar) && fVar.f1649h.l()) {
                z5 = true;
            }
        }
        return z5;
    }

    public int m() {
        int i7 = this.f733g;
        if (i7 != -1) {
            return i7;
        }
        String str = (String) this.f734h;
        kotlin.jvm.internal.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public void n() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0213, code lost:
    
        if (r8 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x007b, code lost:
    
        if (r14 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(o oVar, String input) {
        int i7;
        int i8;
        int i9;
        int i10;
        int b7;
        char charAt;
        int i11;
        int i12;
        int i13;
        char charAt2;
        ArrayList arrayList = (ArrayList) this.f738l;
        kotlin.jvm.internal.i.e(input, "input");
        byte[] bArr = Y5.c.f3099a;
        int f7 = Y5.c.f(input, 0, input.length());
        int g7 = Y5.c.g(input, f7, input.length());
        if (g7 - f7 >= 2) {
            char charAt3 = input.charAt(f7);
            char c7 = 'a';
            if ((kotlin.jvm.internal.i.g(charAt3, 97) >= 0 && kotlin.jvm.internal.i.g(charAt3, 122) <= 0) || (kotlin.jvm.internal.i.g(charAt3, 65) >= 0 && kotlin.jvm.internal.i.g(charAt3, 90) <= 0)) {
                i7 = f7 + 1;
                while (true) {
                    if (i7 >= g7) {
                        break;
                    }
                    char charAt4 = input.charAt(i7);
                    if ((c7 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i7++;
                        c7 = 'a';
                    }
                }
                if (i7 != -1) {
                    if (oVar == null) {
                        throw new IllegalArgumentException(C1.c.h("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? j.f0(input, 6).concat("...") : input));
                    }
                    this.f734h = oVar.f2974a;
                } else if (q.H(input, f7, "https:", true)) {
                    this.f734h = "https";
                    f7 += 6;
                } else {
                    if (!q.H(input, f7, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, i7);
                        kotlin.jvm.internal.i.d(substring, "substring(...)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f734h = "http";
                    f7 += 5;
                }
                i9 = 0;
                for (i8 = f7; i8 < g7 && ((charAt2 = input.charAt(i8)) == '/' || charAt2 == '\\'); i8++) {
                    i9++;
                }
                char c8 = '#';
                if (i9 < 2 || oVar == null || !kotlin.jvm.internal.i.a(oVar.f2974a, (String) this.f734h)) {
                    i10 = f7 + i9;
                    boolean z5 = false;
                    boolean z6 = false;
                    while (true) {
                        b7 = Y5.c.b(i10, g7, input, "@/\\?#");
                        charAt = b7 == g7 ? input.charAt(b7) : (char) 65535;
                        if (charAt != 65535 || charAt == c8 || charAt == '/' || charAt == '\\' || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z5) {
                                this.f736j = ((String) this.f736j) + "%40" + m6.a.a(input, i10, b7, " \"':;<=>@[]^`{}|/\\?#", 112);
                                z5 = z5;
                            } else {
                                boolean z7 = z5;
                                int c9 = Y5.c.c(input, ':', i10, b7);
                                String a7 = m6.a.a(input, i10, c9, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z6) {
                                    a7 = ((String) this.f735i) + "%40" + a7;
                                }
                                this.f735i = a7;
                                if (c9 != b7) {
                                    this.f736j = m6.a.a(input, c9 + 1, b7, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z5 = true;
                                } else {
                                    z5 = z7;
                                }
                                z6 = true;
                            }
                            i10 = b7 + 1;
                            c8 = '#';
                        }
                    }
                    i11 = i10;
                    while (true) {
                        if (i11 >= b7) {
                            i11 = b7;
                            break;
                        }
                        char charAt5 = input.charAt(i11);
                        if (charAt5 == ':') {
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i11++;
                                if (i11 < b7) {
                                }
                            } while (input.charAt(i11) != ']');
                        }
                        i11++;
                    }
                    i12 = i11 + 1;
                    if (i12 >= b7) {
                        this.f737k = Y5.b.b(m6.a.c(i10, i11, 4, input));
                        try {
                            i13 = Integer.parseInt(m6.a.a(input, i12, b7, "", 120));
                            if (1 <= i13) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i13 = -1;
                        this.f733g = i13;
                        if (i13 == -1) {
                            StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                            String substring2 = input.substring(i12, b7);
                            kotlin.jvm.internal.i.d(substring2, "substring(...)");
                            sb2.append(substring2);
                            sb2.append('\"');
                            throw new IllegalArgumentException(sb2.toString().toString());
                        }
                    } else {
                        this.f737k = Y5.b.b(m6.a.c(i10, i11, 4, input));
                        String str = (String) this.f734h;
                        kotlin.jvm.internal.i.b(str);
                        this.f733g = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
                    }
                    if (((String) this.f737k) != null) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                        String substring3 = input.substring(i10, i11);
                        kotlin.jvm.internal.i.d(substring3, "substring(...)");
                        sb3.append(substring3);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    f7 = b7;
                } else {
                    this.f735i = oVar.e();
                    this.f736j = oVar.a();
                    this.f737k = oVar.f2977d;
                    this.f733g = oVar.f2978e;
                    arrayList.clear();
                    arrayList.addAll(oVar.c());
                    if (f7 == g7 || input.charAt(f7) == '#') {
                        String d7 = oVar.d();
                        this.f739m = d7 != null ? s(m6.a.a(d7, 0, 0, " \"'<>#", 83)) : null;
                    }
                }
                int b8 = Y5.c.b(f7, g7, input, "?#");
                if (f7 != b8) {
                    char charAt6 = input.charAt(f7);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        f7++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (f7 < b8) {
                        int b9 = Y5.c.b(f7, b8, input, "/\\");
                        boolean z8 = b9 < b8;
                        String a8 = m6.a.a(input, f7, b9, " \"<>^`{}|/\\?#", 112);
                        if (!a8.equals(".") && !a8.equalsIgnoreCase("%2e")) {
                            if (!a8.equals("..") && !a8.equalsIgnoreCase("%2e.") && !a8.equalsIgnoreCase(".%2e") && !a8.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a8);
                                } else {
                                    arrayList.add(a8);
                                }
                                if (z8) {
                                    arrayList.add("");
                                }
                            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        f7 = z8 ? b9 + 1 : b9;
                    }
                }
                if (b8 < g7 && input.charAt(b8) == '?') {
                    int c10 = Y5.c.c(input, '#', b8, g7);
                    this.f739m = s(m6.a.a(input, b8 + 1, c10, " \"'<>#", 80));
                    b8 = c10;
                }
                if (b8 >= g7 || input.charAt(b8) != '#') {
                    return;
                }
                this.f740n = m6.a.a(input, b8 + 1, g7, "", 48);
                return;
            }
        }
        i7 = -1;
        if (i7 != -1) {
        }
        i9 = 0;
        while (i8 < g7) {
            i9++;
        }
        char c82 = '#';
        if (i9 < 2) {
        }
        i10 = f7 + i9;
        boolean z52 = false;
        boolean z62 = false;
        while (true) {
            b7 = Y5.c.b(i10, g7, input, "@/\\?#");
            if (b7 == g7) {
            }
            if (charAt != 65535) {
                break;
            } else {
                break;
            }
        }
        i11 = i10;
        while (true) {
            if (i11 >= b7) {
            }
            i11++;
        }
        i12 = i11 + 1;
        if (i12 >= b7) {
        }
        if (((String) this.f737k) != null) {
        }
    }

    public void r(String str, O3.c cVar) {
        if (cVar == null) {
            synchronized (this.f738l) {
                ((HashMap) this.f735i).remove(str);
            }
            return;
        }
        synchronized (this.f738l) {
            try {
                ((HashMap) this.f735i).put(str, new e(cVar, null));
                List<d> list = (List) ((HashMap) this.f736j).remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    f(str, (e) ((HashMap) this.f735i).get(str), dVar.f724a, dVar.f725b, dVar.f726c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f732f) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f734h;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f735i).length() > 0 || ((String) this.f736j).length() > 0) {
                    sb2.append((String) this.f735i);
                    if (((String) this.f736j).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.f736j);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f737k;
                if (str2 != null) {
                    if (j.M(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f737k);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f737k);
                    }
                }
                int i7 = -1;
                if (this.f733g != -1 || ((String) this.f734h) != null) {
                    int m4 = m();
                    String str3 = (String) this.f734h;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i7 = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i7 = 443;
                            break;
                        }
                    }
                    sb2.append(':');
                    sb2.append(m4);
                }
                ArrayList arrayList = (ArrayList) this.f738l;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i8));
                }
                if (((ArrayList) this.f739m) != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f739m;
                    kotlin.jvm.internal.i.b(arrayList2);
                    C5.a A6 = i6.g.A(i6.g.B(0, arrayList2.size()), 2);
                    int i9 = A6.f228f;
                    int i10 = A6.f229g;
                    int i11 = A6.f230h;
                    if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i9);
                            String str5 = (String) arrayList2.get(i9 + 1);
                            if (i9 > 0) {
                                sb2.append('&');
                            }
                            sb2.append(str4);
                            if (str5 != null) {
                                sb2.append('=');
                                sb2.append(str5);
                            }
                            if (i9 != i10) {
                                i9 += i11;
                            }
                        }
                    }
                }
                if (((String) this.f740n) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f740n);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public g(int i7) {
        this.f732f = i7;
        switch (i7) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f735i = "";
                this.f736j = "";
                this.f733g = -1;
                this.f738l = AbstractC0507k.A("");
                break;
            default:
                this.f734h = new ArrayList();
                this.f735i = new C0689s(3);
                new ArrayList();
                this.f737k = null;
                new N.h(this);
                this.f738l = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                this.f739m = new ArrayList();
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                final int i8 = 0;
                new C.a(this) { // from class: N.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F3.g f1663b;

                    {
                        this.f1663b = this;
                    }

                    @Override // C.a
                    public final void accept(Object obj) {
                        switch (i8) {
                            case 0:
                                this.f1663b.b(false);
                                break;
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                if (((Integer) obj).intValue() == 80) {
                                    this.f1663b.e(false);
                                    break;
                                }
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                boolean z5 = ((t.i) obj).f5904a;
                                this.f1663b.g(false);
                                break;
                            default:
                                boolean z6 = ((C0640G) obj).f5903a;
                                this.f1663b.j(false);
                                break;
                        }
                    }
                };
                final int i9 = 1;
                new C.a(this) { // from class: N.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F3.g f1663b;

                    {
                        this.f1663b = this;
                    }

                    @Override // C.a
                    public final void accept(Object obj) {
                        switch (i9) {
                            case 0:
                                this.f1663b.b(false);
                                break;
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                if (((Integer) obj).intValue() == 80) {
                                    this.f1663b.e(false);
                                    break;
                                }
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                boolean z5 = ((t.i) obj).f5904a;
                                this.f1663b.g(false);
                                break;
                            default:
                                boolean z6 = ((C0640G) obj).f5903a;
                                this.f1663b.j(false);
                                break;
                        }
                    }
                };
                final int i10 = 2;
                new C.a(this) { // from class: N.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F3.g f1663b;

                    {
                        this.f1663b = this;
                    }

                    @Override // C.a
                    public final void accept(Object obj) {
                        switch (i10) {
                            case 0:
                                this.f1663b.b(false);
                                break;
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                if (((Integer) obj).intValue() == 80) {
                                    this.f1663b.e(false);
                                    break;
                                }
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                boolean z5 = ((t.i) obj).f5904a;
                                this.f1663b.g(false);
                                break;
                            default:
                                boolean z6 = ((C0640G) obj).f5903a;
                                this.f1663b.j(false);
                                break;
                        }
                    }
                };
                final int i11 = 3;
                new C.a(this) { // from class: N.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F3.g f1663b;

                    {
                        this.f1663b = this;
                    }

                    @Override // C.a
                    public final void accept(Object obj) {
                        switch (i11) {
                            case 0:
                                this.f1663b.b(false);
                                break;
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                if (((Integer) obj).intValue() == 80) {
                                    this.f1663b.e(false);
                                    break;
                                }
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                boolean z5 = ((t.i) obj).f5904a;
                                this.f1663b.g(false);
                                break;
                            default:
                                boolean z6 = ((C0640G) obj).f5903a;
                                this.f1663b.j(false);
                                break;
                        }
                    }
                };
                new N.i(this);
                this.f733g = -1;
                this.f740n = new R0.g();
                new ArrayDeque();
                new A.b(i11, this);
                break;
        }
    }
}
