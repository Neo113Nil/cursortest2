package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.AbstractC1686t0;
import com.my.tracker.obfuscated.C1672p1;
import com.my.tracker.obfuscated.C1712z2;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1631f0 {

    /* renamed from: k, reason: collision with root package name */
    public static final DecimalFormat f21307k;

    /* renamed from: b, reason: collision with root package name */
    final C1712z2 f21309b;

    /* renamed from: c, reason: collision with root package name */
    final Context f21310c;

    /* renamed from: d, reason: collision with root package name */
    final b f21311d;

    /* renamed from: g, reason: collision with root package name */
    C1636g1 f21314g;

    /* renamed from: a, reason: collision with root package name */
    final Map f21308a = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    protected C1615b3 f21312e = C1615b3.f21150j;

    /* renamed from: f, reason: collision with root package name */
    protected String f21313f = "";

    /* renamed from: h, reason: collision with root package name */
    private final r f21315h = new r(65536);

    /* renamed from: i, reason: collision with root package name */
    final C1640h1 f21316i = C1640h1.b();

    /* renamed from: j, reason: collision with root package name */
    long f21317j = 0;

    /* renamed from: com.my.tracker.obfuscated.f0$a */
    public interface a {
        void b(List list);
    }

    /* renamed from: com.my.tracker.obfuscated.f0$b */
    public interface b {
        void a();

        void a(String str);
    }

    /* renamed from: com.my.tracker.obfuscated.f0$c */
    public interface c {
        void a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        f21307k = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private C1631f0(C1712z2 c1712z2, b bVar, Context context) {
        this.f21309b = c1712z2;
        this.f21311d = bVar;
        this.f21310c = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (a(this.f21314g)) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f21314g != null) {
            AbstractC1708y2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        C1628e1 a4 = C1628e1.a(this.f21309b.g(), this.f21310c);
        if (a4 == null) {
            return;
        }
        C1636g1 a5 = C1636g1.a(a4);
        this.f21314g = a5;
        if (a(a5)) {
            return;
        }
        this.f21317j = C1676q1.a(this.f21310c).l();
        this.f21309b.m().a(new InterfaceC1685t() { // from class: com.my.tracker.obfuscated.S1
            @Override // com.my.tracker.obfuscated.InterfaceC1685t
            public final void a(Object obj) {
                C1631f0.this.a((C1615b3) obj);
            }
        }, new InterfaceC1685t() { // from class: com.my.tracker.obfuscated.T1
            @Override // com.my.tracker.obfuscated.InterfaceC1685t
            public final void a(Object obj) {
                C1631f0.this.c((C1615b3) obj);
            }
        });
        b();
    }

    public void a(final List list, final a aVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.L2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(aVar, list);
            }
        });
    }

    void b(C1615b3 c1615b3, String str, C1636g1 c1636g1) {
        AbstractC1708y2.a("createAndStorePartialPacket: start");
        C1712z2.a o4 = this.f21309b.o();
        String h4 = this.f21309b.h();
        MyTrackerConfig.OkHttpClientProvider n4 = this.f21309b.n();
        this.f21315h.a();
        int a4 = a(this.f21315h, c1636g1, o4, c1615b3, str, this.f21316i, h4, n4, this.f21310c);
        AbstractC1708y2.a("createAndStorePartialPacket: writeResult=" + a4);
        if (a4 == 1) {
            c1636g1.a();
            c1636g1.a(this.f21315h.c());
        } else if (a4 == 2) {
            c1636g1.a();
        }
        this.f21315h.d();
    }

    public void c() {
        if (a(this.f21314g)) {
            return;
        }
        this.f21311d.a();
        if (!AbstractC1686t0.a(this.f21310c)) {
            AbstractC1708y2.a("MyTrackerRepository: no network connection");
            return;
        }
        String a4 = a(this.f21312e, this.f21313f, this.f21314g);
        if (a4 != null) {
            this.f21311d.a(a4);
        }
        b(this.f21314g);
    }

    public void d() {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.M1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.f();
            }
        });
    }

    public void g() {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.I1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j4, float f4) {
        if (a(this.f21314g) || a(29, j4)) {
            return;
        }
        long b4 = AbstractC1700w2.b(j4);
        byte[] c4 = this.f21316i.c((long) (f4 * 1000.0f));
        if (c4 != null) {
            this.f21314g.p(c4, b4);
        }
    }

    public void a(final List list, final c cVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.D1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(cVar, list);
            }
        });
    }

    void b() {
        int f4;
        if (a(this.f21314g)) {
            return;
        }
        if (this.f21314g.h() != 0 || ((f4 = this.f21309b.f()) > 0 && AbstractC1700w2.a() - this.f21317j <= f4)) {
            c();
        }
    }

    public void d(final String str) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.Q1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, a4);
            }
        });
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        aVar.b(a(this.f21314g) ? Collections.EMPTY_LIST : this.f21314g.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final C1615b3 c1615b3) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.A2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(c1615b3);
            }
        });
    }

    public void d(final List list) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.O1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(list);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(C1615b3 c1615b3, String str, C1636g1 c1636g1) {
        String str2;
        AbstractC1686t0.b a4;
        C1712z2.a o4 = this.f21309b.o();
        String q4 = this.f21309b.q();
        String h4 = this.f21309b.h();
        MyTrackerConfig.OkHttpClientProvider n4 = this.f21309b.n();
        this.f21315h.a();
        if (a(this.f21315h, c1636g1, o4, c1615b3, str, this.f21316i, h4, n4, this.f21310c) == 1 && (a4 = a(q4, n4, this.f21315h)) != null) {
            if (a4.c()) {
                AbstractC1708y2.a("Events were sent successfully");
                c1636g1.a();
            }
            str2 = (String) a4.b();
        }
        str2 = null;
        this.f21315h.d();
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        cVar.a(a(this.f21314g) ? Collections.EMPTY_LIST : this.f21314g.g());
    }

    static boolean c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        AbstractC1708y2.b("EventTracker error: length of the string " + str + " is more than " + KotlinVersion.MAX_COMPONENT_VALUE + ", event ignored");
        return true;
    }

    public void d(Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.I2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(a5, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(C1615b3 c1615b3) {
        AbstractC1708y2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(c1615b3.f21157g));
        if (AbstractC1654l.a(this.f21312e.f21157g, c1615b3.f21157g) != 0 && !a(this.f21314g)) {
            b(this.f21312e, this.f21313f, this.f21314g);
        }
        this.f21312e = c1615b3;
    }

    public void a() {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.F2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.e();
            }
        });
    }

    public void c(final List list) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.R1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (a(this.f21314g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1671p0 c1671p0 = (C1671p0) it.next();
            a(c1671p0.e(), c1671p0.d(), c1671p0.a(), (Map) null, c1671p0.f());
            this.f21314g.b(c1671p0);
        }
        b();
    }

    public void a(final a aVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.V1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(aVar);
            }
        });
    }

    public void c(Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.L1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a5, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j4, long j5, long j6) {
        byte[] b4;
        if (a(this.f21314g) || (b4 = this.f21316i.b(str, str2, j4, j5)) == null || !this.f21314g.h(b4, j6)) {
            return;
        }
        b();
    }

    public void a(final c cVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.C2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(cVar);
            }
        });
    }

    public void c(final float f4) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.U1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.c(currentTimeMillis, f4);
            }
        });
    }

    static boolean a(C1636g1 c1636g1) {
        if (c1636g1 != null) {
            return false;
        }
        AbstractC1708y2.b("EventTracker error: repository is null");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j4) {
        byte[] b4;
        if (a(this.f21314g) || b(map) || (b4 = this.f21316i.b(map)) == null || !this.f21314g.k(b4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.f21314g)) {
            aVar.b(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f21314g.a((C1630f) it.next());
        }
        aVar.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j4, float f4, float f5, float f6) {
        if (a(this.f21314g) || a(26, j4)) {
            return;
        }
        long b4 = AbstractC1700w2.b(j4);
        byte[] b5 = this.f21316i.b((long) (f4 * 1000.0f), (long) (f5 * 1000.0f), (long) (f6 * 1000.0f));
        if (b5 != null) {
            this.f21314g.n(b5, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.f21314g)) {
            cVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f21314g.a((C1671p0) it.next());
        }
        cVar.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j4, float f4) {
        if (a(this.f21314g) || a(28, j4)) {
            return;
        }
        long b4 = AbstractC1700w2.b(j4);
        byte[] b5 = this.f21316i.b((long) (f4 * 1000.0f));
        if (b5 != null) {
            this.f21314g.o(b5, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1615b3 c1615b3) {
        this.f21312e = c1615b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j4) {
        byte[] b4;
        if (a(this.f21314g) || b(map) || (b4 = this.f21316i.b(str, str2, map)) == null || !this.f21314g.r(b4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        AbstractC1708y2.a("setRemoteConfig: remoteConfig=" + str);
        if (this.f21313f.equals(str)) {
            return;
        }
        if (!a(this.f21314g)) {
            b(this.f21312e, this.f21313f, this.f21314g);
        }
        this.f21313f = str;
    }

    static boolean b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (c((String) entry.getKey()) || c((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j4) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(adEvent, f21307k.format(adEvent.revenue))) == null || !this.f21314g.a(adEvent.eventType, a4, j4)) {
            return;
        }
        b();
    }

    public void b(final String str) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.B2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j4, long j5, long j6) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(str, str2, j4, j5)) == null || !this.f21314g.a(a4, j6)) {
            return;
        }
        b();
    }

    public void b(final String str, final String str2, final long j4, final long j5) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.G1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(str, str2, j4, j5, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j4) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(str)) == null || !this.f21314g.b(a4, j4)) {
            return;
        }
        b();
    }

    public void b(final float f4, final float f5, final float f6) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.Y1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(currentTimeMillis, f4, f5, f6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j4) {
        if (a(this.f21314g) || b(map) || !a(jSONObject, str, str2, str3, map, j4)) {
            return;
        }
        b();
    }

    public void b(final float f4) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.W1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(currentTimeMillis, f4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        String str;
        if (a(this.f21314g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1630f c1630f = (C1630f) it.next();
            try {
                str = c1630f.e().toString();
            } catch (Throwable th) {
                AbstractC1708y2.a("Error: purchase data: ", th);
                str = null;
            }
            a(c1630f.d(), str, c1630f.a(), c1630f.f(), (Map) null, c1630f.h());
            this.f21314g.b(c1630f);
        }
        b();
    }

    public void b(final String str, final String str2, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.C1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.b(a5, str, str2, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, long j4) {
        byte[] a4;
        if (a(this.f21314g) || c(str) || b(map) || (a4 = this.f21316i.a(str, map)) == null || !this.f21314g.d(a4, j4)) {
            return;
        }
        b();
    }

    void b(C1636g1 c1636g1) {
        String q4 = this.f21309b.q();
        MyTrackerConfig.OkHttpClientProvider n4 = this.f21309b.n();
        try {
            InterfaceC1611b d4 = c1636g1.d();
            try {
                if (d4 != null) {
                    while (d4.b()) {
                        long a4 = d4.a();
                        byte[] i4 = d4.i();
                        this.f21315h.a();
                        this.f21315h.b(i4);
                        AbstractC1686t0.b a5 = a(q4, n4, this.f21315h);
                        if (a5 == null || !a5.c()) {
                            break;
                        }
                        String str = (String) a5.b();
                        if (!TextUtils.isEmpty(str)) {
                            this.f21311d.a(str);
                        }
                        c1636g1.a(a4);
                    }
                } else {
                    AbstractC1708y2.a("EventTracker error: iterator is null");
                    if (d4 == null) {
                        return;
                    }
                }
                d4.close();
            } finally {
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("EventTracker error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j4) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(str, str2)) == null || !this.f21314g.e(a4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j4) {
        if (a(this.f21314g) || b(map) || !a(jSONObject, jSONObject2, str, map, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4, float f4, float f5, float f6) {
        if (a(this.f21314g) || a(27, j4)) {
            return;
        }
        long b4 = AbstractC1700w2.b(j4);
        byte[] a4 = this.f21316i.a((long) (f4 * 1000.0f), (long) (f5 * 1000.0f), (long) (f6 * 1000.0f));
        if (a4 != null) {
            this.f21314g.g(a4, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4, String str, C1672p1.a aVar, long j5) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(j4, str, aVar)) == null || !this.f21314g.i(a4, j5)) {
            return;
        }
        C1676q1.a(this.f21310c).c(j5);
        this.f21317j = j5;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j4) {
        byte[] a4;
        if (a(this.f21314g) || b(map) || (a4 = this.f21316i.a(map)) == null || !this.f21314g.j(a4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4) {
        if (a(this.f21314g)) {
            return;
        }
        boolean a4 = this.f21314g.a(j4, C1676q1.a(this.f21310c).n());
        if (this.f21314g.b(j4) || a4) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i4, long j4) {
        byte[] a4;
        if (a(this.f21314g) || b(map) || (a4 = this.f21316i.a(i4, map)) == null || !this.f21314g.k(a4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4, float f4) {
        if (a(this.f21314g) || a(25, j4)) {
            return;
        }
        long b4 = AbstractC1700w2.b(j4);
        byte[] a4 = this.f21316i.a((long) (f4 * 1000.0f));
        if (a4 != null) {
            this.f21314g.l(a4, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j4) {
        byte[] a4;
        if (a(this.f21314g) || b(map) || (a4 = this.f21316i.a(str, str2, map)) == null || !this.f21314g.m(a4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j4) {
        String str;
        Map<String, String> map;
        if (a(this.f21314g) || c(miniAppEvent.name) || b(miniAppEvent.eventParams)) {
            return;
        }
        int i4 = miniAppEvent.eventType;
        String str2 = (i4 == 24 || i4 == 22 || i4 == 23) ? miniAppEvent.customUserId : null;
        if (i4 == 24) {
            str = miniAppEvent.name;
            map = miniAppEvent.eventParams;
        } else {
            str = null;
            map = null;
        }
        byte[] a4 = this.f21316i.a(i4, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i4 == 20 ? miniAppEvent.query : null, map);
        if (a4 == null || !this.f21314g.b(i4, a4, j4)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i4, byte[] bArr, boolean z4, boolean z5, long j4, Runnable runnable) {
        if (!a(this.f21314g) && this.f21314g.a(i4, bArr, z4, z5, j4)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j4, Runnable runnable) {
        if (a(this.f21314g)) {
            return;
        }
        byte[] b4 = this.f21316i.b(str, str2);
        if (b4 != null && this.f21314g.q(b4, j4)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j4) {
        byte[] a4;
        if (a(this.f21314g) || (a4 = this.f21316i.a(str, str2, str3, str4, str5)) == null || !this.f21314g.s(a4, j4)) {
            return;
        }
        C1676q1.a(this.f21310c).c(j4);
        this.f21317j = j4;
        b();
    }

    public static C1631f0 a(C1712z2 c1712z2, b bVar, Context context) {
        return new C1631f0(c1712z2, bVar, context);
    }

    private static void a(Runnable runnable) {
        AbstractC1658m.a(runnable);
    }

    private AbstractC1686t0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, r rVar) {
        if (this.f21316i.a(rVar, AbstractC1700w2.a())) {
            return AbstractC1686t0.a(new C1681s(rVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:12|(8:31|32|33|15|16|17|18|(1:25)(1:24))|14|15|16|17|18|(2:20|26)(1:27)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("Error: wrong price in micros in sku details: ", r0);
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(JSONObject jSONObject, String str, String str2, String str3, Map map, long j4) {
        String str4;
        if (str == null) {
            AbstractC1708y2.a("Error: empty data " + str);
            return false;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(str).optString("productId"))) {
                AbstractC1708y2.a("Error: empty productId in data " + str);
                return false;
            }
            String str5 = null;
            if (jSONObject != null) {
                try {
                    str4 = null;
                    str5 = jSONObject.toString();
                } catch (Throwable th) {
                    AbstractC1708y2.a("Error: can't convert productInfo json to string", th);
                }
                String str6 = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
                byte[] a4 = this.f21316i.a(str5, str, str2, str3, 0, str6, jSONObject.optString("currency"), map);
                return a4 == null ? false : false;
            }
            str4 = null;
            String str62 = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
            byte[] a42 = this.f21316i.a(str5, str, str2, str3, 0, str62, jSONObject.optString("currency"), map);
            return a42 == null ? false : false;
        } catch (Throwable th2) {
            AbstractC1708y2.b("Error: creating object failed", th2);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|4)|(11:28|29|30|7|8|9|10|11|12|13|(1:21)(1:19))|6|7|8|9|10|11|12|13|(1:15)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("Error: wrong currency in sku details: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("Error: wrong price in micros in sku details: ", r0);
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map, long j4) {
        String str2;
        String jSONObject3;
        C1636g1 c1636g1;
        String str3 = null;
        try {
            str2 = jSONObject2.toString();
        } catch (Throwable th) {
            AbstractC1708y2.a("Error: can't convert purchaseData json to string", th);
            str2 = null;
        }
        if (jSONObject != null) {
            try {
                jSONObject3 = jSONObject.toString();
            } catch (Throwable th2) {
                AbstractC1708y2.a("Error: can't convert skuDetails json to string", th2);
            }
            String str4 = f21307k.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
            str3 = jSONObject.optString("price_currency_code");
            byte[] a4 = this.f21316i.a(str, str2, jSONObject3, str4, str3, map);
            return a4 == null && (c1636g1 = this.f21314g) != null && c1636g1.f(a4, j4);
        }
        jSONObject3 = null;
        String str42 = f21307k.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
        str3 = jSONObject.optString("price_currency_code");
        byte[] a42 = this.f21316i.a(str, str2, jSONObject3, str42, str3, map);
        if (a42 == null) {
        }
    }

    protected boolean a(int i4, long j4) {
        Long l4 = (Long) this.f21308a.get(Integer.valueOf(i4));
        if (l4 == null || j4 - l4.longValue() >= 800) {
            this.f21308a.put(Integer.valueOf(i4), Long.valueOf(j4));
            return false;
        }
        AbstractC1708y2.a("EventTracker: event with type " + i4 + " was throttled");
        return true;
    }

    public void a(final AdEvent adEvent) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.H1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(adEvent, a4);
            }
        });
    }

    public void a(final String str, final String str2, final long j4, final long j5) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.P1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, str2, j4, j5, a4);
            }
        });
    }

    public void a(final JSONObject jSONObject, final String str, final String str2, final String str3, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.K2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a5, jSONObject, str, str2, str3, a4);
            }
        });
    }

    public void a(final String str, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.K1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, a5, a4);
            }
        });
    }

    public void a(final String str, final String str2) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.J2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, str2, a4);
            }
        });
    }

    public void a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.F1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a5, jSONObject, jSONObject2, str, a4);
            }
        });
    }

    public void a(final float f4, final float f5, final float f6) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.X1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(currentTimeMillis, f4, f5, f6);
            }
        });
    }

    public void a(final long j4, final String str, final C1672p1.a aVar) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.E2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(j4, str, aVar, a4);
            }
        });
    }

    public void a(final int i4, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.N1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a5, i4, a4);
            }
        });
    }

    public void a(final float f4) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.G2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(currentTimeMillis, f4);
            }
        });
    }

    public void a(final String str, final String str2, Map map) {
        final long a4 = AbstractC1700w2.a();
        final Map a5 = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.J1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(a5, str, str2, a4);
            }
        });
    }

    public void a(final MiniAppEvent miniAppEvent) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.H2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(miniAppEvent, a4);
            }
        });
    }

    public void a(final int i4, final byte[] bArr, final boolean z4, final boolean z5, final Runnable runnable) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.D2
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(i4, bArr, z4, z5, a4, runnable);
            }
        });
    }

    public void a(final String str, final String str2, final Runnable runnable) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.E1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, str2, a4, runnable);
            }
        });
    }

    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        final long a4 = AbstractC1700w2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.Z1
            @Override // java.lang.Runnable
            public final void run() {
                C1631f0.this.a(str, str2, str3, str4, str5, a4);
            }
        });
    }

    private static int a(AbstractC1683s1 abstractC1683s1, C1636g1 c1636g1, C1712z2.a aVar, C1615b3 c1615b3, String str, C1640h1 c1640h1, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!c1636g1.j()) {
            return 3;
        }
        long i4 = c1636g1.i();
        InterfaceC1707y1 b4 = c1636g1.b();
        InterfaceC1609a2 c4 = c1636g1.c();
        return c1640h1.a(abstractC1683s1, aVar, c1615b3, str, C1639h0.a().a(aVar.f21625m, aVar.f21619g, aVar.f21617e, str2, okHttpClientProvider, context), i4, c1636g1.f(), b4, c4);
    }
}
