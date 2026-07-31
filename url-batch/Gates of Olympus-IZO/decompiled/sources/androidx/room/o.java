package androidx.room;

import I.T;
import M1.B;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.gates.olympus.miruv.data.db.MiruvDatabase_Impl;
import i.C0461f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f4088n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final MiruvDatabase_Impl f4089a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4090b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4092d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f4093e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4094f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4095g;

    /* renamed from: h, reason: collision with root package name */
    public volatile v1.e f4096h;

    /* renamed from: i, reason: collision with root package name */
    public final T f4097i;

    /* renamed from: j, reason: collision with root package name */
    public final C0461f f4098j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4099k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4100l;

    /* renamed from: m, reason: collision with root package name */
    public final D2.d f4101m;

    public o(MiruvDatabase_Impl miruvDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f4089a = miruvDatabase_Impl;
        this.f4090b = hashMap;
        this.f4091c = hashMap2;
        this.f4097i = new T(strArr.length);
        Z1.i.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f4098j = new C0461f();
        this.f4099k = new Object();
        this.f4100l = new Object();
        this.f4092d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            String str2 = strArr[i3];
            Locale locale = Locale.US;
            Z1.i.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            Z1.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f4092d.put(lowerCase, Integer.valueOf(i3));
            String str3 = (String) this.f4090b.get(strArr[i3]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                Z1.i.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i3] = lowerCase;
        }
        this.f4093e = strArr2;
        for (Map.Entry entry : this.f4090b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            Z1.i.e(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            Z1.i.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f4092d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                Z1.i.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f4092d;
                linkedHashMap.put(lowerCase3, B.D(lowerCase2, linkedHashMap));
            }
        }
        this.f4101m = new D2.d(1, this);
    }

    public final boolean a() {
        if (!this.f4089a.isOpenInternal()) {
            return false;
        }
        if (!this.f4095g) {
            ((w1.g) this.f4089a.getOpenHelper()).a();
        }
        if (this.f4095g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C2.c cVar) {
        n nVar;
        boolean z3;
        synchronized (this.f4098j) {
            nVar = (n) this.f4098j.c(cVar);
        }
        if (nVar != null) {
            T t3 = this.f4097i;
            int[] iArr = nVar.f4085b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            t3.getClass();
            Z1.i.f(copyOf, "tableIds");
            synchronized (t3) {
                z3 = false;
                for (int i3 : copyOf) {
                    long[] jArr = (long[]) t3.f2198b;
                    long j3 = jArr[i3];
                    jArr[i3] = j3 - 1;
                    if (j3 == 1) {
                        z3 = true;
                        t3.f2197a = true;
                    }
                }
            }
            if (z3) {
                MiruvDatabase_Impl miruvDatabase_Impl = this.f4089a;
                if (miruvDatabase_Impl.isOpenInternal()) {
                    d(((w1.g) miruvDatabase_Impl.getOpenHelper()).a());
                }
            }
        }
    }

    public final void c(InterfaceC1018a interfaceC1018a, int i3) {
        interfaceC1018a.q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i3 + ", 0)");
        String str = this.f4093e[i3];
        String[] strArr = f4088n;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + h.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
            Z1.i.e(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC1018a.q(str3);
        }
    }

    public final void d(InterfaceC1018a interfaceC1018a) {
        Z1.i.f(interfaceC1018a, "database");
        if (interfaceC1018a.M()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f4089a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f4099k) {
                    int[] a3 = this.f4097i.a();
                    if (a3 == null) {
                        return;
                    }
                    if (interfaceC1018a.n()) {
                        interfaceC1018a.y();
                    } else {
                        interfaceC1018a.f();
                    }
                    try {
                        int length = a3.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = a3[i3];
                            int i6 = i4 + 1;
                            if (i5 == 1) {
                                c(interfaceC1018a, i4);
                            } else if (i5 == 2) {
                                String str = this.f4093e[i4];
                                String[] strArr = f4088n;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + h.c(str, strArr[i7]);
                                    Z1.i.e(str2, "StringBuilder().apply(builderAction).toString()");
                                    interfaceC1018a.q(str2);
                                }
                            }
                            i3++;
                            i4 = i6;
                        }
                        interfaceC1018a.s();
                        interfaceC1018a.d();
                    } catch (Throwable th) {
                        interfaceC1018a.d();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        } catch (IllegalStateException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        }
    }
}
