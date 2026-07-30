package com.anythink.core.common.s.a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.anythink.core.common.s.a.b;
import com.anythink.core.common.s.a.e;
import com.google.android.gms.internal.ads.CL;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f16418a = "both files error";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f16419b = "parse dara failed";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f16420c = "open file failed";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f16421d = "map failed";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f16422e = "miss cipher";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f16423f = "Encrypt failed";

    /* renamed from: g, reason: collision with root package name */
    static final String f16424g = "truncate finish";

    /* renamed from: h, reason: collision with root package name */
    static final String f16425h = "gc finish";
    protected static final String i = ".kva";

    /* renamed from: j, reason: collision with root package name */
    protected static final String f16426j = ".kvb";

    /* renamed from: k, reason: collision with root package name */
    protected static final String f16427k = ".kvc";

    /* renamed from: l, reason: collision with root package name */
    protected static final String f16428l = ".tmp";

    /* renamed from: m, reason: collision with root package name */
    protected static final int f16429m = 268435456;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f16430n = 1073741824;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f16432p = 12;

    /* renamed from: r, reason: collision with root package name */
    protected static final int f16433r;

    /* renamed from: s, reason: collision with root package name */
    protected static final int f16434s;

    /* renamed from: t, reason: collision with root package name */
    protected static final int f16435t = 8192;

    /* renamed from: u, reason: collision with root package name */
    protected static final int f16436u = 80;

    /* renamed from: A, reason: collision with root package name */
    protected int f16437A;

    /* renamed from: B, reason: collision with root package name */
    protected long f16438B;

    /* renamed from: E, reason: collision with root package name */
    protected f f16441E;

    /* renamed from: F, reason: collision with root package name */
    protected int f16442F;

    /* renamed from: G, reason: collision with root package name */
    protected int f16443G;

    /* renamed from: K, reason: collision with root package name */
    protected String f16446K;

    /* renamed from: P, reason: collision with root package name */
    protected int f16451P;

    /* renamed from: v, reason: collision with root package name */
    protected final String f16456v;

    /* renamed from: w, reason: collision with root package name */
    protected final String f16457w;

    /* renamed from: x, reason: collision with root package name */
    protected final Map<String, com.anythink.core.common.s.a.a.b> f16458x;

    /* renamed from: z, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.a f16460z;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f16417S = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    protected static final int[] f16431o = {0, 1, 4, 4, 8, 8};

    /* renamed from: q, reason: collision with root package name */
    protected final int f16455q = h.f16510c;

    /* renamed from: y, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.c f16459y = h.f16508a;

    /* renamed from: C, reason: collision with root package name */
    protected final HashMap<String, b.AbstractC0097b> f16439C = new HashMap<>();

    /* renamed from: D, reason: collision with root package name */
    protected volatile boolean f16440D = false;

    /* renamed from: H, reason: collision with root package name */
    protected final List<String> f16444H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    protected boolean f16445I = false;
    protected boolean J = false;

    /* renamed from: L, reason: collision with root package name */
    protected final m f16447L = new m();

    /* renamed from: M, reason: collision with root package name */
    protected final m f16448M = new m();

    /* renamed from: N, reason: collision with root package name */
    protected final e f16449N = new e();

    /* renamed from: O, reason: collision with root package name */
    protected final Executor f16450O = new i();

    /* renamed from: Q, reason: collision with root package name */
    protected final ArrayList<C0096a> f16452Q = new ArrayList<>();

    /* renamed from: R, reason: collision with root package name */
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f16453R = new ArrayList<>();

    /* renamed from: T, reason: collision with root package name */
    private final Handler f16454T = new Handler(Looper.getMainLooper());

    /* renamed from: com.anythink.core.common.s.a.a$a, reason: collision with other inner class name */
    public static class C0096a implements Comparable<C0096a> {

        /* renamed from: a, reason: collision with root package name */
        int f16461a;

        /* renamed from: b, reason: collision with root package name */
        int f16462b;

        public C0096a(int i, int i4) {
            this.f16461a = i;
            this.f16462b = i4;
        }

        private int a(C0096a c0096a) {
            return this.f16461a - c0096a.f16461a;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0096a c0096a) {
            return this.f16461a - c0096a.f16461a;
        }
    }

    static {
        int b9 = l.b();
        f16433r = b9;
        f16434s = Math.max(b9, 32768);
    }

    public a(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar) {
        this.f16456v = str;
        this.f16457w = str2;
        this.f16460z = aVar;
        HashMap hashMap = new HashMap();
        if (bVarArr != null) {
            for (com.anythink.core.common.s.a.a.b bVar : bVarArr) {
                String a9 = bVar.a();
                if (hashMap.containsKey(a9)) {
                    b("duplicate encoder tag:".concat(String.valueOf(a9)));
                } else {
                    hashMap.put(a9, bVar);
                }
            }
        }
        hashMap.put("StringSet", k.f16528a);
        this.f16458x = hashMap;
    }

    private static int e(int i4) {
        return i4 & (-1073741825);
    }

    private static void f(int i4) {
        if (i4 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private static void h(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private synchronized boolean i(String str) {
        return getBoolean(str, false);
    }

    private void j() {
        f fVar = this.f16441E;
        if (fVar == null || fVar.f16492a.length != f16433r) {
            this.f16441E = new f(f16433r);
        } else {
            fVar.a(4, 0L);
        }
        this.f16441E.a(0, a(0));
    }

    private float k(String str) {
        return getFloat(str, 0.0f);
    }

    private long l(String str) {
        return getLong(str, 0L);
    }

    private double m(String str) {
        return a(str, 0.0d);
    }

    private String n(String str) {
        return getString(str, "");
    }

    private byte[] o(String str) {
        return b(str, f16417S);
    }

    private synchronized Set<String> p(String str) {
        return (Set) d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (this.f16449N.a(str)) {
            return;
        }
        l.c(new File(this.f16456v + this.f16457w, str));
    }

    public abstract void a(byte b9, int i4);

    public abstract void a(int i4, int i9, int i10);

    public abstract void a(int i4, long j9, int i9);

    public abstract void a(long j9, long j10, int i4);

    public abstract void a(g gVar);

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.f16439C.containsKey(str);
    }

    public void d() {
        this.f16437A = 12;
        this.f16438B = 0L;
        this.f16439C.clear();
        this.f16448M.a();
        this.f16447L.a();
        e();
    }

    public abstract void d(int i4);

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public abstract void f(String str);

    public void g() {
    }

    public abstract void g(String str);

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.f16439C.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, b.AbstractC0097b> entry : this.f16439C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0097b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((b.c) value).f16464b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((b.f) value).f16467b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((b.e) value).f16466b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((b.g) value).f16468b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((b.d) value).f16465b);
                    break;
                case 6:
                    b.i iVar = (b.i) value;
                    if (iVar.f16473f) {
                        valueOf = a(iVar, this.f16460z);
                        break;
                    } else {
                        valueOf = iVar.f16470c;
                        break;
                    }
                case 7:
                    b.a aVar = (b.a) value;
                    if (aVar.f16473f) {
                        valueOf = a(aVar, this.f16460z);
                        break;
                    } else {
                        valueOf = aVar.f16470c;
                        break;
                    }
                case 8:
                    b.h hVar = (b.h) value;
                    if (hVar.f16473f) {
                        valueOf = a(hVar, this.f16460z);
                        break;
                    } else {
                        valueOf = ((b.h) value).f16470c;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            if (valueOf != null) {
                hashMap.put(key, valueOf);
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z8) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 1) {
            return ((b.c) abstractC0097b).f16464b;
        }
        return z8;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f6) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 3) {
            return ((b.e) abstractC0097b).f16466b;
        }
        return f6;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i4) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 2) {
            return ((b.f) abstractC0097b).f16467b;
        }
        return i4;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j9) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 4) {
            return ((b.g) abstractC0097b).f16468b;
        }
        return j9;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 6) {
            b.i iVar = (b.i) abstractC0097b;
            if (!iVar.f16473f) {
                return (String) iVar.f16470c;
            }
            Object a9 = this.f16448M.a(str);
            if (a9 instanceof String) {
                return (String) a9;
            }
            String a10 = a(iVar, this.f16460z);
            if (a10 != null && !a10.isEmpty()) {
                this.f16448M.a(str, a10);
                return a10;
            }
            remove(str);
            return str2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> p6 = p(str);
        return p6 != null ? p6 : set;
    }

    public abstract void h();

    public abstract void i();

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z8) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
            if (abstractC0097b != null && abstractC0097b.a() != 1) {
                remove(str);
                abstractC0097b = null;
            }
            b.c cVar = (b.c) abstractC0097b;
            if (cVar == null) {
                if (!a(str, (byte) 1)) {
                    return this;
                }
                f fVar = this.f16441E;
                int i4 = fVar.f16493b;
                fVar.a(z8 ? (byte) 1 : (byte) 0);
                i();
                this.f16439C.put(str, new b.c(i4, z8));
                f(str);
            } else if (cVar.f16464b != z8) {
                cVar.f16464b = z8;
                a(z8 ? (byte) 1 : (byte) 0, cVar.f16463a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f6) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
            if (abstractC0097b != null && abstractC0097b.a() != 3) {
                remove(str);
                abstractC0097b = null;
            }
            b.e eVar = (b.e) abstractC0097b;
            if (eVar == null) {
                if (!a(str, (byte) 3)) {
                    return this;
                }
                f fVar = this.f16441E;
                int i4 = fVar.f16493b;
                fVar.b(a(f6));
                i();
                this.f16439C.put(str, new b.e(i4, f6));
                f(str);
            } else if (eVar.f16466b != f6) {
                eVar.f16466b = f6;
                a(a(f6), (this.f16441E.a(eVar.f16463a) ^ r1) & 4294967295L, eVar.f16463a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i4) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
            if (abstractC0097b != null && abstractC0097b.a() != 2) {
                remove(str);
                abstractC0097b = null;
            }
            b.f fVar = (b.f) abstractC0097b;
            if (fVar == null) {
                if (!a(str, (byte) 2)) {
                    return this;
                }
                f fVar2 = this.f16441E;
                int i9 = fVar2.f16493b;
                com.anythink.core.common.s.a.a.a aVar = this.f16460z;
                fVar2.b(aVar != null ? aVar.c() : i4);
                i();
                this.f16439C.put(str, new b.f(i9, i4));
                f(str);
            } else if (fVar.f16467b != i4) {
                com.anythink.core.common.s.a.a.a aVar2 = this.f16460z;
                int c4 = aVar2 != null ? aVar2.c() : i4;
                int a9 = this.f16460z != null ? this.f16441E.a(fVar.f16463a) : fVar.f16467b;
                fVar.f16467b = i4;
                a(c4, (a9 ^ c4) & 4294967295L, fVar.f16463a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j9) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
                if (abstractC0097b != null) {
                    try {
                        if (abstractC0097b.a() != 4) {
                            remove(str);
                            abstractC0097b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.g gVar = (b.g) abstractC0097b;
                if (gVar == null) {
                    if (!a(str, (byte) 4)) {
                        return this;
                    }
                    f fVar = this.f16441E;
                    int i4 = fVar.f16493b;
                    com.anythink.core.common.s.a.a.a aVar2 = this.f16460z;
                    fVar.a(aVar2 != null ? aVar2.e() : j9);
                    i();
                    this.f16439C.put(str, new b.g(i4, j9));
                    f(str);
                } else if (gVar.f16468b != j9) {
                    com.anythink.core.common.s.a.a.a aVar3 = this.f16460z;
                    long e6 = aVar3 != null ? aVar3.e() : j9;
                    long c4 = (this.f16460z != null ? this.f16441E.c(gVar.f16463a) : gVar.f16468b) ^ e6;
                    gVar.f16468b = j9;
                    aVar = this;
                    aVar.a(e6, c4, gVar.f16463a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            if (str2 == null) {
                remove(str);
            } else {
                b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
                b.AbstractC0097b abstractC0097b2 = abstractC0097b;
                if (abstractC0097b != null) {
                    byte a9 = abstractC0097b.a();
                    abstractC0097b2 = abstractC0097b;
                    if (a9 != 6) {
                        remove(str);
                        abstractC0097b2 = null;
                    }
                }
                b.i iVar = (b.i) abstractC0097b2;
                if (iVar != null && !iVar.f16473f && str2.equals(iVar.f16470c)) {
                    return this;
                }
                g();
                if (this.f16460z != null || str2.length() * 3 >= this.f16455q) {
                    byte[] bytes = str2.isEmpty() ? f16417S : str2.getBytes(StandardCharsets.UTF_8);
                    com.anythink.core.common.s.a.a.a aVar = this.f16460z;
                    if (aVar != null) {
                        bytes = aVar.a();
                    }
                    byte[] bArr = bytes;
                    if (bArr == null) {
                        a(new Exception(f16423f));
                        return this;
                    }
                    a(str, str2, bArr, iVar, (byte) 6);
                } else {
                    int b9 = f.b(str2);
                    if (iVar == null) {
                        int b10 = f.b(str);
                        f(b10);
                        int i4 = b10 + 4;
                        this.f16443G = i4 + b9;
                        k();
                        this.f16441E.a((byte) 6);
                        a(str, b10);
                        b(str2, b9);
                        HashMap<String, b.AbstractC0097b> hashMap = this.f16439C;
                        int i9 = this.f16442F;
                        hashMap.put(str, new b.i(i9, i4 + i9, str2, b9, false));
                        i();
                    } else {
                        int i10 = iVar.f16463a;
                        int i11 = i10 - iVar.f16471d;
                        int i12 = iVar.f16472e;
                        boolean z8 = false;
                        if (i12 == b9) {
                            this.f16438B = this.f16441E.b(i10, i12) ^ this.f16438B;
                            if (b9 == str2.length()) {
                                str2.getBytes(0, b9, this.f16441E.f16492a, iVar.f16463a);
                            } else {
                                f fVar = this.f16441E;
                                fVar.f16493b = iVar.f16463a;
                                fVar.a(str2);
                            }
                            this.f16442F = iVar.f16463a;
                            this.f16443G = b9;
                        } else {
                            this.f16443G = i11 + b9;
                            k();
                            this.f16441E.a((byte) 6);
                            int i13 = i11 - 3;
                            f fVar2 = this.f16441E;
                            byte[] bArr2 = fVar2.f16492a;
                            System.arraycopy(bArr2, iVar.f16471d + 1, bArr2, fVar2.f16493b, i13);
                            this.f16441E.f16493b += i13;
                            b(str2, b9);
                            a((byte) 6, iVar.f16471d, iVar.f16463a + iVar.f16472e);
                            r1 = iVar.f16473f ? (String) iVar.f16470c : null;
                            iVar.f16473f = false;
                            int i14 = this.f16442F;
                            iVar.f16471d = i14;
                            iVar.f16463a = i14 + i11;
                            iVar.f16472e = b9;
                            z8 = true;
                        }
                        iVar.f16470c = str2;
                        i();
                        if (z8) {
                            h();
                        }
                        if (r1 != null) {
                            g(r1);
                        }
                    }
                }
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        try {
            if (this.J) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                a(str, (String) set, (com.anythink.core.common.s.a.a.b<String>) k.f16528a);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f16453R.contains(onSharedPreferenceChangeListener)) {
            this.f16453R.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f16453R.remove(onSharedPreferenceChangeListener);
    }

    public static long a(long j9, int i4) {
        int i9 = (i4 & 7) << 3;
        return (j9 >>> (64 - i9)) | (j9 << i9);
    }

    public static boolean b(int i4) {
        return (i4 & 1073741824) != 0;
    }

    private void k() {
        d(this.f16443G);
        int i4 = this.f16437A;
        this.f16442F = i4;
        this.f16437A = this.f16443G + i4;
        this.f16441E.f16493b = i4;
    }

    public final void c(int i4) {
        ArrayList<C0096a> arrayList = this.f16452Q;
        Collections.sort(arrayList);
        C0096a c0096a = arrayList.get(0);
        int size = arrayList.size();
        boolean z8 = true;
        int i9 = 0;
        for (int i10 = 1; i10 < size; i10++) {
            C0096a c0096a2 = arrayList.get(i10);
            if (c0096a2.f16461a == c0096a.f16462b) {
                c0096a.f16462b = c0096a2.f16462b;
            } else {
                i9++;
                if (i9 != i10) {
                    arrayList.set(i9, c0096a2);
                }
                c0096a = c0096a2;
            }
        }
        int i11 = i9 + 1;
        if (size > i11) {
            arrayList.subList(i11, size).clear();
        }
        C0096a c0096a3 = this.f16452Q.get(0);
        int i12 = c0096a3.f16461a;
        int i13 = this.f16437A;
        int i14 = i13 - this.f16451P;
        int i15 = i14 - 12;
        int i16 = i14 - i12;
        int i17 = i13 - i12;
        boolean z9 = i15 < i17 + i16;
        if (!z9) {
            this.f16438B ^= this.f16441E.b(i12, i17);
        }
        int size2 = this.f16452Q.size();
        int i18 = size2 - 1;
        int i19 = this.f16437A - this.f16452Q.get(i18).f16462b;
        int i20 = i19 > 0 ? size2 : i18;
        int[] iArr = new int[i20];
        int[] iArr2 = new int[i20];
        int i21 = c0096a3.f16461a;
        int i22 = c0096a3.f16462b;
        int i23 = 1;
        while (i23 < size2) {
            boolean z10 = z8;
            C0096a c0096a4 = this.f16452Q.get(i23);
            int i24 = i23;
            int i25 = c0096a4.f16461a - i22;
            int i26 = size2;
            byte[] bArr = this.f16441E.f16492a;
            System.arraycopy(bArr, i22, bArr, i21, i25);
            int i27 = i24 - 1;
            iArr[i27] = i22;
            iArr2[i27] = i22 - i21;
            i21 += i25;
            i22 = c0096a4.f16462b;
            i23 = i24 + 1;
            z8 = z10;
            size2 = i26;
        }
        if (i19 > 0) {
            byte[] bArr2 = this.f16441E.f16492a;
            System.arraycopy(bArr2, i22, bArr2, i21, i19);
            iArr[i18] = i22;
            iArr2[i18] = i22 - i21;
        }
        e();
        if (z9) {
            this.f16438B = this.f16441E.b(12, i15);
        } else {
            this.f16438B ^= this.f16441E.b(i12, i16);
        }
        this.f16437A = i14;
        a(i12, i4, i16);
        for (b.AbstractC0097b abstractC0097b : this.f16439C.values()) {
            int i28 = abstractC0097b.f16463a;
            if (i28 > i12) {
                int i29 = i20 - 1;
                int i30 = 0;
                while (true) {
                    if (i30 > i29) {
                        break;
                    }
                    int i31 = (i30 + i29) >>> 1;
                    int i32 = iArr[i31];
                    if (i32 >= i28) {
                        if (i32 <= i28) {
                            i29 = i31;
                            break;
                        }
                        i29 = i31 - 1;
                    } else {
                        i30 = i31 + 1;
                    }
                }
                int i33 = iArr2[i29];
                abstractC0097b.f16463a -= i33;
                if (abstractC0097b.a() >= 6) {
                    ((b.j) abstractC0097b).f16471d -= i33;
                }
            }
        }
        c(f16425h);
    }

    public final void e() {
        this.f16451P = 0;
        this.f16452Q.clear();
    }

    public final int f() {
        if (this.f16437A <= 16384) {
            return f16435t;
        }
        return 16384;
    }

    public final int a(int i4) {
        return this.f16460z == null ? i4 : i4 | 1073741824;
    }

    public final void b() {
        try {
            l.c(new File(this.f16456v, this.f16457w + f16427k));
            l.c(new File(this.f16456v, this.f16457w + f16428l));
        } catch (Exception e6) {
            a(e6);
        }
    }

    public static int a(int i4, int i9) {
        if (i9 < f16429m) {
            int i10 = f16433r;
            if (i9 <= i10) {
                return i10;
            }
            while (i4 < i9) {
                i4 <<= 1;
            }
            return i4;
        }
        throw new IllegalStateException("data size out of limit");
    }

    public final synchronized void e(String str) {
        if (this.f16453R.isEmpty()) {
            return;
        }
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f16453R.iterator();
        while (it.hasNext()) {
            this.f16454T.post(new a7.b(this, it.next(), str, 5));
        }
    }

    private int j(String str) {
        return getInt(str, 0);
    }

    private void b(int i4, int i9) {
        this.f16451P = (i9 - i4) + this.f16451P;
        this.f16452Q.add(new C0096a(i4, i9));
    }

    public final void a() {
        com.anythink.core.common.s.a.a.b bVar;
        com.anythink.core.common.s.a.a.b[] bVarArr = (com.anythink.core.common.s.a.a.b[]) this.f16458x.values().toArray(new com.anythink.core.common.s.a.a.b[this.f16458x.size()]);
        String str = "temp_" + this.f16457w;
        g gVar = new g(this.f16456v, str, bVarArr, this.f16460z, 2);
        gVar.f16499V = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b.AbstractC0097b> entry : this.f16439C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0097b value = entry.getValue();
            if (value instanceof b.i) {
                b.i iVar = (b.i) value;
                if (iVar.f16473f) {
                    arrayList.add((String) iVar.f16470c);
                    String a9 = a(iVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a9 != null) {
                        gVar.putString(key, a9);
                    }
                } else {
                    gVar.putString(key, (String) iVar.f16470c);
                }
            } else if (value instanceof b.c) {
                gVar.putBoolean(key, ((b.c) value).f16464b);
            } else if (value instanceof b.f) {
                gVar.putInt(key, ((b.f) value).f16467b);
            } else if (value instanceof b.g) {
                gVar.putLong(key, ((b.g) value).f16468b);
            } else if (value instanceof b.e) {
                gVar.putFloat(key, ((b.e) value).f16466b);
            } else if (value instanceof b.d) {
                gVar.b(key, ((b.d) value).f16465b);
            } else if (value instanceof b.a) {
                b.a aVar = (b.a) value;
                if (aVar.f16473f) {
                    arrayList.add((String) aVar.f16470c);
                    byte[] a10 = a(aVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a10 != null) {
                        gVar.a(key, a10);
                    }
                } else {
                    gVar.a(key, (byte[]) aVar.f16470c);
                }
            } else if (value instanceof b.h) {
                b.h hVar = (b.h) value;
                if (hVar.f16473f) {
                    arrayList.add((String) hVar.f16470c);
                    Object a11 = a(hVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a11 != null && (bVar = hVar.f16469b) != null) {
                        gVar.a(key, (String) a11, (com.anythink.core.common.s.a.a.b<String>) bVar);
                    }
                } else {
                    com.anythink.core.common.s.a.a.b bVar2 = hVar.f16469b;
                    if (bVar2 != null) {
                        gVar.a(key, (String) hVar.f16470c, (com.anythink.core.common.s.a.a.b<String>) bVar2);
                    }
                }
            }
        }
        gVar.contains("");
        this.f16441E = gVar.f16441E;
        this.f16438B = gVar.f16438B;
        this.f16437A = gVar.f16437A;
        e();
        this.f16439C.clear();
        this.f16439C.putAll(gVar.f16439C);
        a(gVar);
        while (gVar.f16449N.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.f16456v, str);
        String str2 = this.f16456v + this.f16457w;
        l.a(file, str2);
        l.c(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.c(new File(str2, (String) it.next()));
        }
        this.f16445I = false;
    }

    public final synchronized <T> T d(String str) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 8) {
            b.h hVar = (b.h) abstractC0097b;
            if (hVar.f16473f) {
                T t9 = (T) this.f16448M.a(str);
                if (t9 != null) {
                    return t9;
                }
                T t10 = (T) a(hVar, this.f16460z);
                if (t10 == null) {
                    remove(str);
                    return null;
                }
                this.f16448M.a(str, t10);
                return t10;
            }
            return (T) hVar.f16470c;
        }
        return null;
    }

    public final void b(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.f16459y;
        if (cVar != null) {
            cVar.b(this.f16457w, new Exception(str));
        }
    }

    public final void b(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.f16459y;
        if (cVar != null) {
            cVar.a(this.f16457w, exc);
        }
    }

    private synchronized byte[] b(String str, byte[] bArr) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 7) {
            b.a aVar = (b.a) abstractC0097b;
            if (aVar.f16473f) {
                Object a9 = this.f16448M.a(str);
                if (a9 instanceof byte[]) {
                    return (byte[]) a9;
                }
                byte[] a10 = a(aVar, this.f16460z);
                if (a10 != null && a10.length != 0) {
                    this.f16448M.a(str, a10);
                    return a10;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) aVar.f16470c;
        }
        return bArr;
    }

    public final synchronized SharedPreferences.Editor b(String str, double d2) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
                if (abstractC0097b != null) {
                    try {
                        if (abstractC0097b.a() != 5) {
                            remove(str);
                            abstractC0097b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.d dVar = (b.d) abstractC0097b;
                if (dVar == null) {
                    if (!a(str, (byte) 5)) {
                        return this;
                    }
                    f fVar = this.f16441E;
                    int i4 = fVar.f16493b;
                    fVar.a(a(d2));
                    i();
                    this.f16439C.put(str, new b.d(i4, d2));
                    f(str);
                } else if (dVar.f16465b != d2) {
                    long a9 = a(d2);
                    long c4 = a9 ^ this.f16441E.c(dVar.f16463a);
                    dVar.f16465b = d2;
                    aVar = this;
                    aVar.a(a9, c4, dVar.f16463a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void c() {
        d();
        j();
    }

    public final void c(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.f16459y;
        if (cVar != null) {
            cVar.a(this.f16457w, str);
        }
    }

    private void b(String str, int i4) {
        this.f16441E.a((short) i4);
        if (i4 == str.length()) {
            f fVar = this.f16441E;
            str.getBytes(0, i4, fVar.f16492a, fVar.f16493b);
        } else {
            this.f16441E.a(str);
        }
    }

    private int b(String str, byte[] bArr, byte b9) {
        if (!a(str, b9, bArr.length + 2)) {
            return 0;
        }
        this.f16441E.a((short) bArr.length);
        f fVar = this.f16441E;
        int i4 = fVar.f16493b;
        fVar.a(bArr);
        return i4;
    }

    public final boolean a(File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i4 = (int) length;
            int a9 = a(f16433r, i4);
            f fVar = this.f16441E;
            if (fVar != null && fVar.f16492a.length == a9) {
                fVar.f16493b = 0;
            } else {
                fVar = new f(new byte[a9]);
                this.f16441E = fVar;
            }
            l.a(file, fVar.f16492a, i4);
            int c4 = fVar.c();
            if (c4 < 0) {
                return false;
            }
            int i9 = (-1073741825) & c4;
            boolean b9 = b(c4);
            long d2 = fVar.d();
            this.f16437A = i9 + 12;
            if (i9 >= 0 && i9 <= i4 - 12 && d2 == fVar.b(12, i9) && a(b9)) {
                this.f16438B = d2;
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        h.a().execute(new o(1, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01cb, code lost:
    
        throw new java.lang.Exception(com.anythink.core.common.s.a.a.f16419b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z8) {
        int length;
        f fVar;
        Object obj;
        boolean z9 = false;
        if (z8 && this.f16460z == null) {
            b(f16422e);
            return false;
        }
        com.anythink.core.common.s.a.a.a aVar = z8 ? this.f16460z : null;
        f fVar2 = this.f16441E;
        fVar2.f16493b = 12;
        while (true) {
            try {
                int i4 = fVar2.f16493b;
                int i9 = this.f16437A;
                boolean z10 = true;
                if (i4 >= i9) {
                    if (i4 != i9) {
                        a(new Exception(f16419b));
                        return false;
                    }
                    if (!z8 && this.f16460z != null && i9 != 12) {
                        z9 = true;
                    }
                    this.f16445I = z9;
                    return true;
                }
                byte a9 = fVar2.a();
                byte b9 = (byte) (a9 & c.f16476c);
                if (b9 <= 0 || b9 > 8) {
                    break;
                }
                int a10 = fVar2.a() & 255;
                if (a10 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (a9 < 0) {
                    fVar2.f16493b += a10;
                    int b10 = fVar2.f16493b + (b9 <= 5 ? f16431o[b9] : fVar2.b() & 65535);
                    fVar2.f16493b = b10;
                    b(i4, b10);
                } else {
                    String a11 = fVar2.a(aVar, a10);
                    int i10 = fVar2.f16493b;
                    if (b9 > 5) {
                        int b11 = fVar2.b() & 65535;
                        boolean z11 = (a9 & c.f16475b) != 0;
                        if (z11 && b11 != 32) {
                            throw new IllegalStateException("name size not match");
                        }
                        if (b9 == 6) {
                            this.f16439C.put(a11, new b.i(i4, i10 + 2, z11 ? fVar2.d(b11) : fVar2.a(aVar, b11), b11, z11));
                        } else if (b9 == 7) {
                            if (z11) {
                                obj = fVar2.d(b11);
                            } else {
                                obj = new byte[b11];
                                System.arraycopy(fVar2.f16492a, fVar2.f16493b, obj, 0, b11);
                                fVar2.f16493b += b11;
                                if (aVar != null) {
                                    obj = aVar.b();
                                }
                            }
                            this.f16439C.put(a11, new b.a(i4, i10 + 2, obj, b11, z11));
                        } else if (z11) {
                            this.f16439C.put(a11, new b.h(i4, i10 + 2, fVar2.d(b11), b11, true));
                        } else {
                            if (aVar == null) {
                                fVar = this.f16441E;
                                length = b11;
                            } else {
                                f fVar3 = this.f16441E;
                                System.arraycopy(fVar3.f16492a, fVar3.f16493b, new byte[b11], 0, b11);
                                byte[] b12 = aVar.b();
                                f fVar4 = new f(b12);
                                length = b12.length;
                                fVar = fVar4;
                            }
                            int a12 = fVar.a() & 255;
                            String d2 = fVar.d(a12);
                            com.anythink.core.common.s.a.a.b bVar = this.f16458x.get(d2);
                            int i11 = length - (a12 + 1);
                            if (i11 >= 0) {
                                if (bVar != null) {
                                    try {
                                        b.h hVar = new b.h(i4, i10 + 2, bVar.a(fVar.f16492a, fVar.f16493b, i11), b11, false);
                                        hVar.f16469b = bVar;
                                        this.f16439C.put(a11, hVar);
                                    } catch (Exception e6) {
                                        a(e6);
                                    }
                                } else {
                                    b("object with tag: " + d2 + " without encoder");
                                }
                                fVar2.f16493b = i10 + 2 + b11;
                            } else {
                                throw new Exception(f16419b);
                            }
                        }
                    } else if (b9 == 1) {
                        HashMap<String, b.AbstractC0097b> hashMap = this.f16439C;
                        if (fVar2.a() != 1) {
                            z10 = false;
                        }
                        hashMap.put(a11, new b.c(i10, z10));
                    } else if (b9 == 2) {
                        this.f16439C.put(a11, new b.f(i10, fVar2.a(aVar)));
                    } else if (b9 == 3) {
                        this.f16439C.put(a11, new b.e(i10, Float.intBitsToFloat(fVar2.a(aVar))));
                    } else if (b9 != 4) {
                        this.f16439C.put(a11, new b.d(i10, Double.longBitsToDouble(fVar2.b(aVar))));
                    } else {
                        this.f16439C.put(a11, new b.g(i10, fVar2.b(aVar)));
                    }
                }
            } catch (Exception e9) {
                a(e9);
                return false;
            }
        }
    }

    private void a(int i4, String str, int i9, int i10, com.anythink.core.common.s.a.a.a aVar) {
        int length;
        f fVar;
        if (aVar == null) {
            fVar = this.f16441E;
            length = i4;
        } else {
            f fVar2 = this.f16441E;
            System.arraycopy(fVar2.f16492a, fVar2.f16493b, new byte[i4], 0, i4);
            byte[] b9 = aVar.b();
            f fVar3 = new f(b9);
            length = b9.length;
            fVar = fVar3;
        }
        int a9 = fVar.a() & 255;
        String d2 = fVar.d(a9);
        com.anythink.core.common.s.a.a.b bVar = this.f16458x.get(d2);
        int i11 = length - (a9 + 1);
        if (i11 < 0) {
            throw new Exception(f16419b);
        }
        if (bVar != null) {
            try {
                b.h hVar = new b.h(i9, i10 + 2, bVar.a(fVar.f16492a, fVar.f16493b, i11), i4, false);
                hVar.f16469b = bVar;
                this.f16439C.put(str, hVar);
                return;
            } catch (Exception e6) {
                a(e6);
                return;
            }
        }
        b("object with tag: " + d2 + " without encoder");
    }

    private static void a(ArrayList<C0096a> arrayList) {
        Collections.sort(arrayList);
        int i4 = 0;
        C0096a c0096a = arrayList.get(0);
        int size = arrayList.size();
        for (int i9 = 1; i9 < size; i9++) {
            C0096a c0096a2 = arrayList.get(i9);
            if (c0096a2.f16461a == c0096a.f16462b) {
                c0096a.f16462b = c0096a2.f16462b;
            } else {
                i4++;
                if (i4 != i9) {
                    arrayList.set(i4, c0096a2);
                }
                c0096a = c0096a2;
            }
        }
        int i10 = i4 + 1;
        if (size > i10) {
            arrayList.subList(i10, size).clear();
        }
    }

    private void a(int i4, int[] iArr, int[] iArr2) {
        for (b.AbstractC0097b abstractC0097b : this.f16439C.values()) {
            int i9 = abstractC0097b.f16463a;
            if (i9 > i4) {
                int length = iArr.length - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > length) {
                        break;
                    }
                    int i11 = (i10 + length) >>> 1;
                    int i12 = iArr[i11];
                    if (i12 >= i9) {
                        if (i12 <= i9) {
                            length = i11;
                            break;
                        }
                        length = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
                int i13 = iArr2[length];
                abstractC0097b.f16463a -= i13;
                if (abstractC0097b.a() >= 6) {
                    ((b.j) abstractC0097b).f16471d -= i13;
                }
            }
        }
    }

    public final void a(File file, File file2) {
        try {
            if (a(file)) {
                return;
            }
        } catch (IOException e6) {
            b(e6);
        }
        c();
        try {
            if (a(file2)) {
                return;
            }
        } catch (IOException e9) {
            b(e9);
        }
        c();
    }

    public final void a(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.f16459y;
        if (cVar != null) {
            cVar.b(this.f16457w, exc);
        }
    }

    public final synchronized double a(String str, double d2) {
        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
        if (abstractC0097b != null && abstractC0097b.a() == 5) {
            return ((b.d) abstractC0097b).f16465b;
        }
        return d2;
    }

    private String a(b.i iVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) iVar.f16470c;
        byte[] bArr = (byte[]) this.f16447L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16456v + this.f16457w, str));
            } catch (Exception e6) {
                a(e6);
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    private byte[] a(b.a aVar, com.anythink.core.common.s.a.a.a aVar2) {
        String str = (String) aVar.f16470c;
        byte[] bArr = (byte[]) this.f16447L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16456v + this.f16457w, str));
            } catch (Exception e6) {
                a(e6);
                return null;
            }
        }
        if (bArr != null) {
            return aVar2 != null ? aVar2.b() : bArr;
        }
        return null;
    }

    private Object a(b.h hVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) hVar.f16470c;
        byte[] bArr = (byte[]) this.f16447L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16456v + this.f16457w, str));
            } catch (Exception e6) {
                a(e6);
                return null;
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            int i4 = bArr[0] & 255;
            String a9 = this.f16441E.a(bArr, 1, i4);
            com.anythink.core.common.s.a.a.b bVar = this.f16458x.get(a9);
            if (bVar != null) {
                hVar.f16469b = bVar;
                int i9 = i4 + 1;
                return bVar.a(bArr, i9, bArr.length - i9);
            }
            b(new Exception("No encoder for tag:".concat(String.valueOf(a9))));
            return null;
        }
        b(new Exception("Read object data failed"));
        return null;
    }

    private void a(String str, String str2, b.i iVar) {
        int b9 = f.b(str2);
        if (iVar == null) {
            int b10 = f.b(str);
            f(b10);
            int i4 = b10 + 4;
            this.f16443G = i4 + b9;
            k();
            this.f16441E.a((byte) 6);
            a(str, b10);
            b(str2, b9);
            HashMap<String, b.AbstractC0097b> hashMap = this.f16439C;
            int i9 = this.f16442F;
            hashMap.put(str, new b.i(i9, i4 + i9, str2, b9, false));
            i();
            return;
        }
        int i10 = iVar.f16463a;
        int i11 = i10 - iVar.f16471d;
        int i12 = iVar.f16472e;
        boolean z8 = false;
        if (i12 == b9) {
            this.f16438B = this.f16441E.b(i10, i12) ^ this.f16438B;
            if (b9 == str2.length()) {
                str2.getBytes(0, b9, this.f16441E.f16492a, iVar.f16463a);
            } else {
                f fVar = this.f16441E;
                fVar.f16493b = iVar.f16463a;
                fVar.a(str2);
            }
            this.f16442F = iVar.f16463a;
            this.f16443G = b9;
        } else {
            this.f16443G = i11 + b9;
            k();
            this.f16441E.a((byte) 6);
            int i13 = i11 - 3;
            f fVar2 = this.f16441E;
            byte[] bArr = fVar2.f16492a;
            System.arraycopy(bArr, iVar.f16471d + 1, bArr, fVar2.f16493b, i13);
            this.f16441E.f16493b += i13;
            b(str2, b9);
            a((byte) 6, iVar.f16471d, iVar.f16463a + iVar.f16472e);
            r2 = iVar.f16473f ? (String) iVar.f16470c : null;
            iVar.f16473f = false;
            int i14 = this.f16442F;
            iVar.f16471d = i14;
            iVar.f16463a = i14 + i11;
            iVar.f16472e = b9;
            z8 = true;
        }
        iVar.f16470c = str2;
        i();
        if (z8) {
            h();
        }
        if (r2 != null) {
            g(r2);
        }
    }

    public final synchronized SharedPreferences.Editor a(String str, byte[] bArr) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        aVar = this;
                    } else {
                        g();
                        b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
                        b.AbstractC0097b abstractC0097b2 = abstractC0097b;
                        if (abstractC0097b != null) {
                            byte a9 = abstractC0097b.a();
                            abstractC0097b2 = abstractC0097b;
                            if (a9 != 7) {
                                remove(str);
                                abstractC0097b2 = null;
                            }
                        }
                        b.a aVar2 = (b.a) abstractC0097b2;
                        com.anythink.core.common.s.a.a.a aVar3 = this.f16460z;
                        byte[] a10 = aVar3 != null ? aVar3.a() : bArr;
                        if (a10 == null) {
                            a(new Exception(f16423f));
                            return this;
                        }
                        aVar = this;
                        aVar.a(str, bArr, a10, aVar2, (byte) 7);
                        f(str);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized <T> SharedPreferences.Editor a(String str, T t9, com.anythink.core.common.s.a.a.b<T> bVar) {
        Throwable th;
        byte[] bArr;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                if (bVar != null) {
                    String a9 = bVar.a();
                    if (!a9.isEmpty() && a9.length() <= 50) {
                        if (!this.f16458x.containsKey(a9)) {
                            throw new IllegalArgumentException("Encoder hasn't been registered");
                        }
                        try {
                            if (t9 == null) {
                                remove(str);
                                return this;
                            }
                            b.AbstractC0097b abstractC0097b = null;
                            try {
                                bArr = bVar.a(t9);
                            } catch (Exception e6) {
                                a(e6);
                                bArr = null;
                            }
                            if (bArr == null) {
                                remove(str);
                                return this;
                            }
                            g();
                            b.AbstractC0097b abstractC0097b2 = this.f16439C.get(str);
                            if (abstractC0097b2 == null || abstractC0097b2.a() == 8) {
                                abstractC0097b = abstractC0097b2;
                            } else {
                                remove(str);
                            }
                            b.h hVar = (b.h) abstractC0097b;
                            int b9 = f.b(a9);
                            f fVar = new f(b9 + 1 + bArr.length);
                            fVar.a((byte) b9);
                            fVar.a(a9);
                            fVar.a(bArr);
                            byte[] bArr2 = fVar.f16492a;
                            com.anythink.core.common.s.a.a.a aVar = this.f16460z;
                            if (aVar != null) {
                                bArr2 = aVar.a();
                            }
                            byte[] bArr3 = bArr2;
                            if (bArr3 == null) {
                                return this;
                            }
                            a(str, t9, bArr3, hVar, (byte) 8);
                            f(str);
                            return this;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw new IllegalArgumentException("Invalid encoder tag:".concat(a9));
                }
                throw new IllegalArgumentException("Encoder is null");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
    }

    public synchronized void a(Map<String, Object> map, Map<Class, com.anythink.core.common.s.a.a.b> map2) {
        try {
            if (this.J) {
                return;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        b(key, ((Double) value).doubleValue());
                    } else if (value instanceof byte[]) {
                        a(key, (byte[]) value);
                    } else {
                        if (value instanceof Set) {
                            Set<String> set = (Set) value;
                            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                                putStringSet(key, set);
                            }
                        }
                        if (map2 != null) {
                            com.anythink.core.common.s.a.a.b bVar = map2.get(value.getClass());
                            if (bVar != null) {
                                a(key, (String) value, (com.anythink.core.common.s.a.a.b<String>) bVar);
                            } else {
                                b(new Exception("missing encoder for type:" + value.getClass()));
                            }
                        } else {
                            b(new Exception("missing encoders"));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Map<String, Object> map) {
        a(map, (Map<Class, com.anythink.core.common.s.a.a.b>) null);
    }

    private void a(String str, Object obj, Map<Class, com.anythink.core.common.s.a.a.b> map) {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map != null) {
            com.anythink.core.common.s.a.a.b bVar = map.get(obj.getClass());
            if (bVar != null) {
                a(str, (String) obj, (com.anythink.core.common.s.a.a.b<String>) bVar);
                return;
            }
            b(new Exception("missing encoder for type:" + obj.getClass()));
            return;
        }
        b(new Exception("missing encoders"));
    }

    private boolean a(String str, byte b9) {
        return a(str, b9, f16431o[b9]);
    }

    private boolean a(String str, byte b9, int i4) {
        com.anythink.core.common.s.a.a.a aVar = this.f16460z;
        if (aVar != null) {
            str.getBytes(StandardCharsets.UTF_8);
            byte[] a9 = aVar.a();
            if (a9 == null) {
                a(new Exception(f16423f));
                return false;
            }
            int length = a9.length;
            a(length, i4, b9);
            this.f16441E.a((byte) length);
            f fVar = this.f16441E;
            System.arraycopy(a9, 0, fVar.f16492a, fVar.f16493b, length);
            this.f16441E.f16493b += length;
            return true;
        }
        int b10 = f.b(str);
        a(b10, i4, b9);
        a(str, b10);
        return true;
    }

    private void a(int i4, int i9, byte b9) {
        f(i4);
        this.f16443G = i4 + 2 + i9;
        k();
        this.f16441E.a(b9);
    }

    private void a(String str, int i4) {
        this.f16441E.a((byte) i4);
        if (i4 == str.length()) {
            f fVar = this.f16441E;
            str.getBytes(0, i4, fVar.f16492a, fVar.f16493b);
            this.f16441E.f16493b += i4;
            return;
        }
        this.f16441E.a(str);
    }

    public void a(byte b9, int i4, int i9) {
        b(i4, i9);
        byte b10 = (byte) (b9 | c.f16474a);
        byte[] bArr = this.f16441E.f16492a;
        this.f16438B = (((bArr[i4] ^ b10) & 255) << ((i4 & 7) << 3)) ^ this.f16438B;
        bArr[i4] = b10;
    }

    public void a(int i4, byte[] bArr) {
        int length = bArr.length;
        this.f16438B ^= this.f16441E.b(i4, length);
        f fVar = this.f16441E;
        fVar.f16493b = i4;
        fVar.a(bArr);
        this.f16438B = this.f16441E.b(i4, length) ^ this.f16438B;
    }

    private int a(float f6) {
        int floatToRawIntBits = Float.floatToRawIntBits(f6);
        com.anythink.core.common.s.a.a.a aVar = this.f16460z;
        return aVar != null ? aVar.c() : floatToRawIntBits;
    }

    private long a(double d2) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        com.anythink.core.common.s.a.a.a aVar = this.f16460z;
        return aVar != null ? aVar.e() : doubleToRawLongBits;
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar, byte b9) {
        if (jVar == null) {
            a(str, obj, bArr, b9);
        } else if (!jVar.f16473f && jVar.f16472e == bArr.length) {
            a(jVar.f16463a, bArr);
            jVar.f16470c = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
    }

    private void a(String str, Object obj, byte[] bArr, byte b9) {
        int length;
        b.AbstractC0097b hVar;
        int a9 = a(str, bArr, b9);
        if (a9 > 0) {
            boolean z8 = this.f16446K != null;
            if (z8) {
                this.f16448M.a(str, obj);
                obj = this.f16446K;
                this.f16446K = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i4 = length;
            if (b9 == 6) {
                hVar = new b.i(this.f16442F, a9, (String) obj2, i4, z8);
            } else if (b9 == 7) {
                hVar = new b.a(this.f16442F, a9, obj2, i4, z8);
            } else {
                hVar = new b.h(this.f16442F, a9, obj2, i4, z8);
            }
            this.f16439C.put(str, hVar);
            i();
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar) {
        int a9 = a(str, bArr, jVar.a());
        if (a9 > 0) {
            String str2 = jVar.f16473f ? (String) jVar.f16470c : null;
            a(jVar.a(), jVar.f16471d, jVar.f16463a + jVar.f16472e);
            boolean z8 = this.f16446K != null;
            jVar.f16471d = this.f16442F;
            jVar.f16463a = a9;
            jVar.f16473f = z8;
            if (z8) {
                this.f16448M.a(str, obj);
                jVar.f16470c = this.f16446K;
                jVar.f16472e = 32;
                this.f16446K = null;
            } else {
                jVar.f16470c = obj;
                jVar.f16472e = bArr.length;
            }
            i();
            h();
            if (str2 != null) {
                g(str2);
            }
        }
    }

    private int a(final String str, final byte[] bArr, byte b9) {
        this.f16446K = null;
        if (bArr.length < this.f16455q) {
            return b(str, bArr, b9);
        }
        StringBuilder m8 = CL.m("Large value, key: ", str, ", size: ");
        m8.append(bArr.length);
        c(m8.toString());
        final String a9 = l.a();
        byte[] bArr2 = new byte[32];
        a9.getBytes(0, 32, bArr2, 0);
        int b10 = b(str, bArr2, (byte) (b9 | c.f16475b));
        if (b10 > 0) {
            this.f16447L.a(a9, bArr);
            this.f16449N.a(a9, new e.a() { // from class: com.anythink.core.common.s.a.n
                @Override // com.anythink.core.common.s.a.e.a
                public final void execute(AtomicBoolean atomicBoolean) {
                    a.this.a(a9, bArr, str, atomicBoolean);
                }
            });
            this.f16446K = a9;
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, byte[] bArr, String str2, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            return;
        }
        if (l.a(new File(this.f16456v + this.f16457w, str), bArr, atomicBoolean)) {
            return;
        }
        c("Write large value with key:" + str2 + " failed");
    }
}
