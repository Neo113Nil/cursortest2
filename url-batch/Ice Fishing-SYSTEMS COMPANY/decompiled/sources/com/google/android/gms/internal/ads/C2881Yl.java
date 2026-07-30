package com.google.android.gms.internal.ads;

import O.C0357t;
import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C4630a;
import org.json.JSONException;
import org.json.JSONObject;
import w2.AbstractC5153a;
import w2.InterfaceC5155c;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2881Yl implements InterfaceC3774q3, H0, InterfaceC4260z4, Y4, InterfaceC3560m5, InterfaceC0366c, InterfaceC0365b, InterfaceC3373ig, InterfaceC5155c, LD, ZG, InterfaceC3152eb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28861n;

    /* renamed from: u, reason: collision with root package name */
    public Object f28862u;

    /* renamed from: v, reason: collision with root package name */
    public Object f28863v;

    public /* synthetic */ C2881Yl(int i, Object obj, Object obj2) {
        this.f28861n = i;
        this.f28862u = obj;
        this.f28863v = obj2;
    }

    @Override // com.google.android.gms.internal.ads.ZG
    /* renamed from: a */
    public /* synthetic */ InterfaceC3572mH mo9a() {
        switch (this.f28861n) {
            case 21:
                C3267gh c3267gh = (C3267gh) this.f28862u;
                c3267gh.getClass();
                InterfaceC3572mH mo9a = ((ZG) this.f28863v).mo9a();
                Vx vx = new Vx(14, c3267gh);
                return new C2995bh(c3267gh.f31048n, mo9a, c3267gh.f31042G, c3267gh.f31043H, c3267gh, vx);
            default:
                AtomicInteger atomicInteger = C3267gh.f31034N;
                InterfaceC3572mH mo9a2 = ((ZG) this.f28862u).mo9a();
                byte[] bArr = (byte[]) this.f28863v;
                return new C3049ch(new SF(bArr), bArr.length, mo9a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0265 A[LOOP:0: B:2:0x0010->B:31:0x0265, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283 A[EDGE_INSN: B:32:0x0283->B:33:0x0283 BREAK  A[LOOP:0: B:2:0x0010->B:31:0x0265], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d7  */
    @Override // com.google.android.gms.internal.ads.Y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2965b5 b(AbstractC3074d5 abstractC3074d5) {
        F3.q qVar;
        byte[] bArr;
        Throwable c2910a5;
        String str;
        int i;
        int i4;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        C2881Yl c2881Yl = this;
        C0357t c0357t = abstractC3074d5.f29792E;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                T4 t42 = abstractC3074d5.f29790C;
                if (t42 == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = t42.f27710b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j9 = t42.f27712d;
                    if (j9 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j9)));
                    }
                    map = hashMap;
                }
                ((T2) c2881Yl.f28862u).getClass();
                qVar = T2.m(abstractC3074d5, map);
                try {
                    int i9 = qVar.f1059a;
                    List unmodifiableList = Collections.unmodifiableList((ArrayList) qVar.f1061c);
                    if (i9 == 304) {
                        SystemClock.elapsedRealtime();
                        T4 t43 = abstractC3074d5.f29790C;
                        if (t43 != null) {
                            TreeSet treeSet = new TreeSet(comparator);
                            if (!unmodifiableList.isEmpty()) {
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((X4) it.next()).f28602a);
                                }
                            }
                            ArrayList arrayList = new ArrayList(unmodifiableList);
                            List list = t43.f27716h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (X4 x42 : t43.f27716h) {
                                        if (!treeSet.contains(x42.f28602a)) {
                                            arrayList.add(x42);
                                        }
                                    }
                                }
                            } else if (!t43.f27715g.isEmpty()) {
                                for (Map.Entry entry : t43.f27715g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new X4((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new C2965b5(BaseATView.a.f9935O, t43.f27709a, true, arrayList);
                        }
                        try {
                            return new C2965b5(BaseATView.a.f9935O, null, true, unmodifiableList);
                        } catch (IOException e6) {
                            e = e6;
                            bArr = null;
                            if (e instanceof SocketTimeoutException) {
                            }
                            i = c0357t.f2319a;
                            try {
                                i4 = c0357t.f2320b + 1;
                                c0357t.f2320b = i4;
                                c0357t.f2319a = i + i;
                                if (i4 <= 1) {
                                }
                            } catch (C3183f5 e9) {
                                abstractC3074d5.a(str + "-timeout-giveup [timeout=" + i + "]");
                                throw e9;
                            }
                        }
                    } else {
                        C3668o5 c3668o5 = (C3668o5) qVar.f1062d;
                        if (c3668o5 == null) {
                            c3668o5 = null;
                        }
                        if (c3668o5 != null) {
                            int i10 = qVar.f1060b;
                            C3398j5 c3398j5 = (C3398j5) c2881Yl.f28863v;
                            C3722p5 c3722p5 = new C3722p5(c3398j5, i10);
                            try {
                                bArr3 = c3398j5.j(1024);
                                while (true) {
                                    try {
                                        int read = c3668o5.read(bArr3);
                                        if (read == -1) {
                                            break;
                                        }
                                        c3722p5.write(bArr3, 0, read);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            c3668o5.close();
                                            break;
                                        } catch (IOException unused) {
                                            AbstractC3346i5.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        c3398j5.o(bArr3);
                                        c3722p5.close();
                                        throw th;
                                    }
                                }
                                byte[] byteArray = c3722p5.toByteArray();
                                try {
                                    c3668o5.close();
                                } catch (IOException unused2) {
                                    AbstractC3346i5.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                c3398j5.o(bArr3);
                                c3722p5.close();
                                bArr2 = byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                bArr3 = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (AbstractC3346i5.f31315a || elapsedRealtime2 > com.anythink.expressad.video.module.a.a.m.ai) {
                                AbstractC3346i5.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC3074d5, Long.valueOf(elapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i9), Integer.valueOf(c0357t.f2320b));
                            }
                            if (i9 < 200 || i9 > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new C2965b5(i9, bArr2, false, unmodifiableList);
                        } catch (IOException e10) {
                            e = e10;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                                boolean z8 = e instanceof MalformedURLException;
                                String str3 = abstractC3074d5.f29795v;
                                if (z8) {
                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(str3)), e);
                                }
                                if (qVar == null) {
                                    throw new C3019c5(e);
                                }
                                int i11 = qVar.f1059a;
                                AbstractC3346i5.c("Unexpected response code %d for %s", Integer.valueOf(i11), str3);
                                if (bArr != null) {
                                    List<X4> unmodifiableList2 = Collections.unmodifiableList((ArrayList) qVar.f1061c);
                                    SystemClock.elapsedRealtime();
                                    if (unmodifiableList2 != null) {
                                        if (unmodifiableList2.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            TreeMap treeMap = new TreeMap(comparator);
                                            for (X4 x43 : unmodifiableList2) {
                                                treeMap.put(x43.f28602a, x43.f28603b);
                                            }
                                        }
                                    }
                                    if (unmodifiableList2 != null) {
                                        Collections.unmodifiableList(unmodifiableList2);
                                    }
                                    if (i11 != 401 && i11 != 403) {
                                        if (i11 < 400 || i11 > 499) {
                                            throw new C2910a5();
                                        }
                                        throw new V4();
                                    }
                                    c2910a5 = new S4();
                                    str = "auth";
                                } else {
                                    c2910a5 = new C2910a5();
                                    str = "network";
                                }
                            } else {
                                c2910a5 = new C2910a5();
                                str = "socket";
                            }
                            i = c0357t.f2319a;
                            i4 = c0357t.f2320b + 1;
                            c0357t.f2320b = i4;
                            c0357t.f2319a = i + i;
                            if (i4 <= 1) {
                                throw c2910a5;
                            }
                            abstractC3074d5.a(str + "-retry [timeout=" + i + "]");
                            c2881Yl = this;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (IOException e12) {
                e = e12;
                qVar = null;
            }
            abstractC3074d5.a(str + "-retry [timeout=" + i + "]");
            c2881Yl = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.H0
    public void d() {
        byte[] bArr = AbstractC3548lu.f32614b;
        int length = bArr.length;
        ((Lr) this.f28863v).z(0, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0125, code lost:
    
        if (")".equals(com.google.android.gms.internal.ads.S3.b(r7, r8)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0403  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(byte[] bArr, int i, int i4, X1.b bVar) {
        U3 u32;
        String str;
        String sb;
        int i9;
        char c4;
        C2881Yl c2881Yl = this;
        int i10 = -1;
        int i11 = 1;
        Lr lr = (Lr) c2881Yl.f28862u;
        lr.z(i + i4, bArr);
        lr.E(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = lr.f26234b;
            Charset charset = StandardCharsets.UTF_8;
            String n9 = lr.n(charset);
            String str2 = null;
            if (n9 == null || !n9.startsWith("WEBVTT")) {
                lr.E(i12);
                throw W4.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(lr.n(charset))));
            }
            while (!TextUtils.isEmpty(lr.n(StandardCharsets.UTF_8))) {
                c2881Yl = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z8 = 0;
                int i13 = i10;
                int i14 = 0;
                while (i13 == i10) {
                    i14 = lr.f26234b;
                    String n10 = lr.n(StandardCharsets.UTF_8);
                    i13 = n10 == null ? 0 : "STYLE".equals(n10) ? 2 : n10.startsWith("NOTE") ? i11 : 3;
                }
                lr.E(i14);
                if (i13 == 0) {
                    AbstractC2720Pd.h(new C4017ue(arrayList2), bVar);
                    return;
                }
                if (i13 == i11) {
                    while (!TextUtils.isEmpty(lr.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (i13 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        lr.n(StandardCharsets.UTF_8);
                        S3 s3 = (S3) c2881Yl.f28863v;
                        StringBuilder sb2 = s3.f27507b;
                        sb2.setLength(0);
                        int i15 = lr.f26234b;
                        while (!TextUtils.isEmpty(lr.n(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = lr.f26233a;
                        int i16 = lr.f26234b;
                        Lr lr2 = s3.f27506a;
                        lr2.z(i16, bArr2);
                        lr2.E(i15);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            S3.a(lr2);
                            if (lr2.B() >= 5 && "::cue".equals(lr2.k(5, StandardCharsets.UTF_8))) {
                                int i17 = lr2.f26234b;
                                String b9 = S3.b(lr2, sb2);
                                if (b9 != null) {
                                    if ("{".equals(b9)) {
                                        lr2.E(i17);
                                        str = "";
                                    } else if ("(".equals(b9)) {
                                        int i18 = lr2.f26234b;
                                        int i19 = lr2.f26235c;
                                        int i20 = z8 ? 1 : 0;
                                        while (i18 < i19 && i20 == 0) {
                                            int i21 = i18 + 1;
                                            i20 = ((char) lr2.f26233a[i18]) == ')' ? i11 : z8 ? 1 : 0;
                                            i18 = i21;
                                        }
                                        str = lr2.k((i18 + i10) - lr2.f26234b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null || !"{".equals(S3.b(lr2, sb2))) {
                                        break;
                                    }
                                    T3 t32 = new T3();
                                    t32.f27694a = "";
                                    t32.f27695b = "";
                                    t32.f27696c = Collections.EMPTY_SET;
                                    t32.f27697d = "";
                                    t32.f27698e = str2;
                                    t32.f27700g = z8;
                                    t32.i = z8;
                                    t32.f27702j = i10;
                                    t32.f27703k = i10;
                                    t32.f27704l = i10;
                                    t32.f27705m = i10;
                                    t32.f27707o = i10;
                                    t32.f27708p = z8;
                                    if (!str.isEmpty()) {
                                        int indexOf = str.indexOf(91);
                                        if (indexOf != i10) {
                                            Matcher matcher = S3.f27504c.matcher(str.substring(indexOf));
                                            if (matcher.matches()) {
                                                String group = matcher.group(i11);
                                                group.getClass();
                                                t32.f27697d = group;
                                            }
                                            str = str.substring(z8 ? 1 : 0, indexOf);
                                        }
                                        String str3 = AbstractC3548lu.f32613a;
                                        String[] split = str.split("\\.", i10);
                                        String str4 = split[z8 ? 1 : 0];
                                        int indexOf2 = str4.indexOf(35);
                                        if (indexOf2 != i10) {
                                            t32.f27695b = str4.substring(z8 ? 1 : 0, indexOf2);
                                            t32.f27694a = str4.substring(indexOf2 + i11);
                                        } else {
                                            t32.f27695b = str4;
                                        }
                                        int length = split.length;
                                        if (length > i11) {
                                            t32.f27696c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i11, length)));
                                        }
                                    }
                                    int i22 = z8 ? 1 : 0;
                                    String str5 = str2;
                                    int i23 = z8;
                                    while (i22 == 0) {
                                        int i24 = lr2.f26234b;
                                        str5 = S3.b(lr2, sb2);
                                        int i25 = (str5 == null || "}".equals(str5)) ? i11 : i23;
                                        if (i25 == 0) {
                                            lr2.E(i24);
                                            S3.a(lr2);
                                            String c9 = S3.c(lr2, sb2);
                                            if (!c9.isEmpty() && ":".equals(S3.b(lr2, sb2))) {
                                                S3.a(lr2);
                                                StringBuilder sb3 = new StringBuilder();
                                                boolean z9 = false;
                                                while (true) {
                                                    if (z9) {
                                                        sb = sb3.toString();
                                                        break;
                                                    }
                                                    int i26 = lr2.f26234b;
                                                    String b10 = S3.b(lr2, sb2);
                                                    if (b10 == null) {
                                                        sb = null;
                                                        break;
                                                    } else if ("}".equals(b10) || ";".equals(b10)) {
                                                        lr2.E(i26);
                                                        z9 = true;
                                                    } else {
                                                        sb3.append(b10);
                                                    }
                                                }
                                                if (sb != null && !sb.isEmpty()) {
                                                    int i27 = lr2.f26234b;
                                                    String b11 = S3.b(lr2, sb2);
                                                    if (!";".equals(b11)) {
                                                        if ("}".equals(b11)) {
                                                            lr2.E(i27);
                                                        }
                                                    }
                                                    if (com.anythink.expressad.foundation.h.k.f19791d.equals(c9)) {
                                                        i9 = 1;
                                                        t32.f27699f = AbstractC2695Nm.a(sb, true);
                                                        t32.f27700g = true;
                                                    } else {
                                                        i9 = 1;
                                                        if ("background-color".equals(c9)) {
                                                            t32.f27701h = AbstractC2695Nm.a(sb, true);
                                                            t32.i = true;
                                                        } else if ("ruby-position".equals(c9)) {
                                                            if ("over".equals(sb)) {
                                                                t32.f27707o = 1;
                                                            } else if ("under".equals(sb)) {
                                                                t32.f27707o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(c9)) {
                                                            t32.f27708p = "all".equals(sb) || sb.startsWith("digits");
                                                        } else if ("text-decoration".equals(c9)) {
                                                            if ("underline".equals(sb)) {
                                                                t32.f27702j = 1;
                                                            }
                                                        } else if ("font-family".equals(c9)) {
                                                            t32.f27698e = AbstractC3035cL.f(sb);
                                                        } else {
                                                            if (!"font-weight".equals(c9)) {
                                                                i9 = 1;
                                                                if ("font-style".equals(c9)) {
                                                                    if ("italic".equals(sb)) {
                                                                        t32.f27704l = 1;
                                                                    }
                                                                } else if ("font-size".equals(c9)) {
                                                                    Matcher matcher2 = S3.f27505d.matcher(AbstractC3035cL.f(sb));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        int hashCode = group2.hashCode();
                                                                        if (hashCode == 37) {
                                                                            if (group2.equals("%")) {
                                                                                c4 = 2;
                                                                                if (c4 == 0) {
                                                                                }
                                                                                String group3 = matcher2.group(i11);
                                                                                group3.getClass();
                                                                                t32.f27706n = Float.parseFloat(group3);
                                                                            }
                                                                            c4 = 65535;
                                                                            if (c4 == 0) {
                                                                            }
                                                                            String group32 = matcher2.group(i11);
                                                                            group32.getClass();
                                                                            t32.f27706n = Float.parseFloat(group32);
                                                                        } else if (hashCode != 3240) {
                                                                            if (hashCode == 3592 && group2.equals("px")) {
                                                                                c4 = 0;
                                                                                if (c4 == 0) {
                                                                                    i11 = 1;
                                                                                    if (c4 == 1) {
                                                                                        t32.f27705m = 2;
                                                                                    } else {
                                                                                        if (c4 != 2) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        t32.f27705m = 3;
                                                                                    }
                                                                                } else {
                                                                                    i11 = 1;
                                                                                    t32.f27705m = 1;
                                                                                }
                                                                                String group322 = matcher2.group(i11);
                                                                                group322.getClass();
                                                                                t32.f27706n = Float.parseFloat(group322);
                                                                            }
                                                                            c4 = 65535;
                                                                            if (c4 == 0) {
                                                                            }
                                                                            String group3222 = matcher2.group(i11);
                                                                            group3222.getClass();
                                                                            t32.f27706n = Float.parseFloat(group3222);
                                                                        } else {
                                                                            if (group2.equals("em")) {
                                                                                c4 = 1;
                                                                                if (c4 == 0) {
                                                                                }
                                                                                String group32222 = matcher2.group(i11);
                                                                                group32222.getClass();
                                                                                t32.f27706n = Float.parseFloat(group32222);
                                                                            }
                                                                            c4 = 65535;
                                                                            if (c4 == 0) {
                                                                            }
                                                                            String group322222 = matcher2.group(i11);
                                                                            group322222.getClass();
                                                                            t32.f27706n = Float.parseFloat(group322222);
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                                                        sb4.append("Invalid font-size: '");
                                                                        sb4.append(sb);
                                                                        sb4.append("'.");
                                                                        AbstractC3217fl.I("WebvttCssParser", sb4.toString());
                                                                    }
                                                                }
                                                            } else if ("bold".equals(sb)) {
                                                                i9 = 1;
                                                                t32.f27703k = 1;
                                                            }
                                                            i22 = i25;
                                                            i23 = 0;
                                                        }
                                                    }
                                                    i11 = i9;
                                                }
                                                i11 = 1;
                                                i22 = i25;
                                                i23 = 0;
                                            }
                                        }
                                        i22 = i25;
                                        i23 = 0;
                                    }
                                    if ("}".equals(str5)) {
                                        arrayList3.add(t32);
                                    }
                                    i10 = -1;
                                    z8 = 0;
                                    str2 = null;
                                }
                            }
                            str = str2;
                            if (str == null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    Pattern pattern = Z3.f28959a;
                    Charset charset2 = StandardCharsets.UTF_8;
                    String n11 = lr.n(charset2);
                    if (n11 != null) {
                        Pattern pattern2 = Z3.f28959a;
                        Matcher matcher3 = pattern2.matcher(n11);
                        if (matcher3.matches()) {
                            u32 = Z3.b(null, matcher3, lr, arrayList);
                        } else {
                            String n12 = lr.n(charset2);
                            if (n12 != null) {
                                Matcher matcher4 = pattern2.matcher(n12);
                                if (matcher4.matches()) {
                                    u32 = Z3.b(n11.trim(), matcher4, lr, arrayList);
                                }
                            }
                        }
                        if (u32 != null) {
                            arrayList2.add(u32);
                        }
                    }
                    u32 = null;
                    if (u32 != null) {
                    }
                    c2881Yl = this;
                    i10 = -1;
                    str2 = null;
                }
            }
        } catch (W4 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @Override // w2.InterfaceC5155c
    public void f(C4630a c4630a) {
        try {
            String canonicalName = ((AbstractC5153a) this.f28863v).getClass().getCanonicalName();
            int i = c4630a.f38688a;
            String str = c4630a.f38689b;
            String str2 = c4630a.f38690c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            u2.i.a(sb.toString());
            InterfaceC3693od interfaceC3693od = (InterfaceC3693od) this.f28862u;
            interfaceC3693od.d3(c4630a.a());
            interfaceC3693od.A3(i, str);
            interfaceC3693od.l0(i);
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public void h(MotionEvent motionEvent) {
        ((AbstractBinderC3186f8) this.f28862u).onTouch(null, motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public JSONObject i() {
        return ((AbstractBinderC3186f8) this.f28862u).q();
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        try {
            ((C3320hg) this.f28862u).a((C3800qc) ((T8) ((N1.h) this.f28863v).f1962n).u());
        } catch (DeadObjectException e6) {
            ((C3320hg) this.f28862u).b(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.H0
    public G0 k(J0 j02, long j9) {
        long j10 = j02.f25675w;
        int min = (int) Math.min(20000L, j02.f25674v - j10);
        Lr lr = (Lr) this.f28863v;
        lr.y(min);
        j02.I(lr.f26233a, 0, min, false);
        int i = -1;
        int i4 = -1;
        long j11 = -9223372036854775807L;
        while (lr.B() >= 4) {
            if (A1.d(lr.f26234b, lr.f26233a) != 442) {
                lr.G(1);
            } else {
                lr.G(4);
                long a9 = C4098w4.a(lr);
                if (a9 != com.anythink.basead.exoplayer.b.f6539b) {
                    long c4 = ((It) this.f28862u).c(a9);
                    if (c4 > j9) {
                        return j11 == com.anythink.basead.exoplayer.b.f6539b ? new G0(-1, c4, j10) : new G0(0, com.anythink.basead.exoplayer.b.f6539b, j10 + i4);
                    }
                    if (c4 + 100000 > j9) {
                        return new G0(0, com.anythink.basead.exoplayer.b.f6539b, j10 + lr.f26234b);
                    }
                    j11 = c4;
                    i4 = lr.f26234b;
                }
                int i9 = lr.f26235c;
                if (lr.B() >= 10) {
                    lr.G(9);
                    int K8 = lr.K() & 7;
                    if (lr.B() >= K8) {
                        lr.G(K8);
                        if (lr.B() >= 4) {
                            if (A1.d(lr.f26234b, lr.f26233a) == 443) {
                                lr.G(4);
                                int L8 = lr.L();
                                if (lr.B() < L8) {
                                    lr.E(i9);
                                } else {
                                    lr.G(L8);
                                }
                            }
                            while (true) {
                                if (lr.B() < 4) {
                                    break;
                                }
                                int d2 = A1.d(lr.f26234b, lr.f26233a);
                                if (d2 == 442 || d2 == 441 || (d2 >>> 8) != 1) {
                                    break;
                                }
                                lr.G(4);
                                if (lr.B() < 2) {
                                    lr.E(i9);
                                    break;
                                }
                                lr.E(Math.min(lr.f26235c, lr.f26234b + lr.L()));
                            }
                        } else {
                            lr.E(i9);
                        }
                    } else {
                        lr.E(i9);
                    }
                } else {
                    lr.E(i9);
                }
                i = lr.f26234b;
            }
        }
        return j11 != com.anythink.basead.exoplayer.b.f6539b ? new G0(-2, j11, j10 + i) : G0.f25081d;
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        switch (this.f28861n) {
            case 20:
                ((InterfaceC3426jg) this.f28862u).mo5b(obj);
                break;
            case 24:
                String str = (String) obj;
                C2776Si c2776Si = (C2776Si) this.f28863v;
                List a9 = c2776Si.a();
                W2.b bVar = c2776Si.f27601L;
                c2776Si.f27591A.a(c2776Si.f27608z.b(c2776Si.f27606x, c2776Si.f27607y, false, (String) this.f28862u, str, a9, c2776Si.f27598H, bVar), c2776Si.f27597G);
                break;
            default:
                ((C3648nm) this.f28863v).n((View) this.f28862u, (C3330hq) obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    public void m(Lr lr) {
        if (lr.K() != 0 || (lr.K() & 128) == 0) {
            return;
        }
        lr.G(6);
        int B8 = lr.B() / 4;
        int i = 0;
        while (true) {
            B4 b42 = (B4) this.f28863v;
            if (i >= B8) {
                b42.f23975f.remove(0);
                return;
            }
            Er er = (Er) this.f28862u;
            lr.H(er.f24829a, 0, 4);
            er.d(0);
            int h9 = er.h(16);
            er.f(3);
            if (h9 == 0) {
                er.f(13);
            } else {
                int h10 = er.h(13);
                if (b42.f23975f.get(h10) == null) {
                    b42.f23975f.put(h10, new A4(new C3877s(b42, h10)));
                }
            }
            i++;
        }
    }

    public O0 n(Object... objArr) {
        Constructor a9;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f28863v;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    a9 = ((K0) this.f28862u).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f28863v).set(true);
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating extension", e6);
                }
            }
            a9 = null;
        }
        if (a9 == null) {
            return null;
        }
        try {
            return (O0) a9.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public JSONObject o() {
        return ((AbstractBinderC3186f8) this.f28862u).r();
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        synchronized (((com.bumptech.glide.manager.o) this.f28863v).f23625w) {
            ((W8) this.f28862u).b(new RuntimeException("Connection failed."));
        }
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
        ((C3320hg) this.f28862u).b(new RuntimeException(D.y.j(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }

    public void p(ArrayList arrayList) {
        C3997uB c3997uB;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C3244gB) arrayList.get(i)).f30961a == 1) {
                try {
                    c3997uB = new C3997uB((C3244gB) arrayList.get(i));
                } catch (RA unused) {
                    c3997uB = null;
                }
                this.f28863v = c3997uB;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f28861n) {
            case 20:
                ((InterfaceC3373ig) this.f28863v).mo0a();
                break;
            case 24:
                C2776Si c2776Si = (C2776Si) this.f28863v;
                C4304zv c4304zv = c2776Si.f27608z;
                List a9 = c2776Si.a();
                W2.b bVar = c2776Si.f27601L;
                c2776Si.f27591A.a(c4304zv.b(c2776Si.f27606x, c2776Si.f27607y, false, (String) this.f28862u, null, a9, c2776Si.f27598H, bVar), null);
                break;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.p6)).booleanValue()) {
                    p2.j.f39798C.f39808h.e("omid native display exp", th);
                    break;
                }
                break;
        }
    }

    public Set r(C3216fk c3216fk) {
        return Collections.singleton(new C2473Al(c3216fk, AbstractC3212fg.f30745h));
    }

    public Set s(C3216fk c3216fk) {
        return Collections.singleton(new C2473Al(c3216fk, AbstractC3212fg.f30745h));
    }

    public void t(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put(NativeAdvancedJsUtils.f18064p, (String) this.f28863v);
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f28862u;
            if (interfaceC3858rh != null) {
                interfaceC3858rh.c("onError", put);
            }
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error occurred while dispatching error event.", e6);
        }
    }

    public void u(int i, int i4, int i9, int i10) {
        try {
            ((InterfaceC3858rh) this.f28862u).c("onSizeChanged", new JSONObject().put("x", i).put("y", i4).put("width", i9).put("height", i10));
        } catch (JSONException e6) {
            int i11 = t2.C.f40822b;
            u2.i.d("Error occurred while dispatching size change.", e6);
        }
    }

    public void v(String str) {
        try {
            ((InterfaceC3858rh) this.f28862u).c("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f17684b, str));
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error occurred while dispatching state change.", e6);
        }
    }

    public void w(int i, int i4, int i9, int i10, float f6, int i11) {
        try {
            ((InterfaceC3858rh) this.f28862u).c("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i4).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f6).put("rotation", i11));
        } catch (JSONException e6) {
            int i12 = t2.C.f40822b;
            u2.i.d("Error occurred while obtaining screen information.", e6);
        }
    }

    public /* synthetic */ C2881Yl(int i, boolean z8) {
        this.f28861n = i;
    }

    public C2881Yl(Context context) {
        this.f28861n = 11;
        this.f28863v = context;
        this.f28862u = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2881Yl(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm, ViewGroup viewGroup) {
        this.f28861n = 29;
        this.f28862u = (AbstractBinderC3186f8) interfaceViewOnClickListenerC2678Mm;
        this.f28863v = viewGroup;
    }

    public C2881Yl(int i) {
        this.f28861n = i;
        switch (i) {
            case 5:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f28862u = byteArrayOutputStream;
                this.f28863v = new DataOutputStream(byteArrayOutputStream);
                break;
            case 6:
            default:
                this.f28862u = ByteBuffer.allocateDirect(500);
                break;
            case 7:
                this.f28862u = new Lr();
                this.f28863v = new S3();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3560m5
    /* renamed from: a, reason: collision with other method in class */
    public File mo8a() {
        if (((File) this.f28862u) == null) {
            this.f28862u = new File(((Context) this.f28863v).getCacheDir(), "volley");
        }
        return (File) this.f28862u;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3373ig, com.google.android.gms.internal.ads.InterfaceC3152eb, com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        switch (this.f28861n) {
            case 15:
                t2.C.k("callJs > getEngine: Promise rejected");
                ((C3320hg) this.f28862u).b(new K2.m("Unable to obtain a JavascriptEngine."));
                ((C2753Rc) this.f28863v).s();
                break;
            default:
                C3675oC c3675oC = ViewTreeObserverOnGlobalLayoutListenerC4241ym.f35393I;
                ?? r12 = (AbstractBinderC3186f8) this.f28862u;
                Map h9 = r12.h();
                if (h9 != null) {
                    int i = c3675oC.f33117w;
                    int i4 = 0;
                    while (i4 < i) {
                        Object obj = h9.get((String) c3675oC.get(i4));
                        i4++;
                        if (obj != null) {
                            r12.onClick((ViewGroup) this.f28863v);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public C2881Yl(D2.a aVar, InterfaceC3426jg interfaceC3426jg, InterfaceC3373ig interfaceC3373ig) {
        this.f28861n = 20;
        this.f28862u = interfaceC3426jg;
        this.f28863v = interfaceC3373ig;
        Objects.requireNonNull(aVar);
    }

    public C2881Yl(N1.h hVar, C3320hg c3320hg) {
        this.f28861n = 14;
        this.f28862u = c3320hg;
        Objects.requireNonNull(hVar);
        this.f28863v = hVar;
    }

    public C2881Yl(com.bumptech.glide.manager.o oVar, W8 w82) {
        this.f28861n = 12;
        this.f28862u = w82;
        this.f28863v = oVar;
    }

    public /* synthetic */ C2881Yl(P p6) {
        this.f28861n = 2;
        Objects.requireNonNull(p6);
        this.f28863v = p6;
    }

    public C2881Yl(K0 k02) {
        this.f28861n = 3;
        this.f28862u = k02;
        this.f28863v = new AtomicBoolean(false);
    }

    public C2881Yl(T2 t22) {
        this.f28861n = 10;
        C3398j5 c3398j5 = new C3398j5(0, false);
        this.f28862u = t22;
        this.f28863v = c3398j5;
    }

    public C2881Yl(B4 b42) {
        this.f28861n = 9;
        Objects.requireNonNull(b42);
        this.f28863v = b42;
        this.f28862u = new Er(new byte[4], 4);
    }

    public C2881Yl(C3636na c3636na) {
        this.f28861n = 13;
        this.f28863v = c3636na;
        this.f28862u = new HashMap();
    }

    public C2881Yl(C2753Rc c2753Rc, C2889Zc c2889Zc, C3320hg c3320hg) {
        this.f28861n = 15;
        this.f28862u = c3320hg;
        this.f28863v = c2753Rc;
        Objects.requireNonNull(c2889Zc);
    }

    public C2881Yl(BinderC4178xd binderC4178xd, InterfaceC3693od interfaceC3693od, AbstractC5153a abstractC5153a) {
        this.f28861n = 16;
        this.f28862u = interfaceC3693od;
        this.f28863v = abstractC5153a;
        Objects.requireNonNull(binderC4178xd);
    }

    public C2881Yl(C3214fi c3214fi, Context context, String str) {
        this.f28861n = 23;
        C4117wN a9 = C4117wN.a(context);
        C4009uN c4009uN = c3214fi.f30776N0;
        C2495Bq c2495Bq = new C2495Bq(a9, c4009uN, c3214fi.f30778O0, 5);
        C4009uN a10 = C4009uN.a(new Kt(c4009uN, 0));
        C4009uN a11 = C4009uN.a(AbstractC3217fl.f30865C);
        C4009uN a12 = C4009uN.a(new C2674Mi(a9, c3214fi.f30797c, c3214fi.f30773M, c2495Bq, a10, a11));
        this.f28862u = C4009uN.a(new C3323hj(a12, a10, a11, 4));
        this.f28863v = C4009uN.a(new C2491Bm(C4117wN.b(str), a12, a9, a10, a11, c3214fi.i, c3214fi.f30775N, c3214fi.f30819o));
    }

    public C2881Yl(C2776Si c2776Si, String str) {
        this.f28861n = 24;
        this.f28862u = str;
        Objects.requireNonNull(c2776Si);
        this.f28863v = c2776Si;
    }

    public C2881Yl(C3648nm c3648nm, View view) {
        this.f28861n = 28;
        this.f28862u = view;
        Objects.requireNonNull(c3648nm);
        this.f28863v = c3648nm;
    }

    public /* synthetic */ C2881Yl(It it) {
        this.f28861n = 8;
        this.f28862u = it;
        this.f28863v = new Lr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    public void c(It it, Q0 q02, D4 d42) {
    }
}
