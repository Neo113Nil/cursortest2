package h0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.firebase.messaging.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import m0.C0684c;
import p.C0816f;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f5075m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5076a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5077b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5078c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f5079d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5080e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f5081f;

    /* renamed from: g, reason: collision with root package name */
    public volatile m0.j f5082g;

    /* renamed from: h, reason: collision with root package name */
    public final s f5083h;

    /* renamed from: i, reason: collision with root package name */
    public final C0816f f5084i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5085k;

    /* renamed from: l, reason: collision with root package name */
    public final F.b f5086l;

    public C0460f(WorkDatabase_Impl database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f5076a = database;
        this.f5077b = shadowTablesMap;
        this.f5080e = new AtomicBoolean(false);
        this.f5083h = new s(tableNames.length);
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f5084i = new C0816f();
        this.j = new Object();
        this.f5085k = new Object();
        this.f5078c = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = tableNames[i2];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f5078c.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.f5077b.get(tableNames[i2]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i2] = lowerCase;
        }
        this.f5079d = strArr;
        for (Map.Entry entry : this.f5077b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f5078c.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f5078c;
                linkedHashMap.put(lowerCase3, I.d(linkedHashMap, lowerCase2));
            }
        }
        this.f5086l = new F.b(15, this);
    }

    public final boolean a() {
        C0684c c0684c = this.f5076a.f4091a;
        if (!Intrinsics.a(c0684c != null ? Boolean.valueOf(c0684c.f6490d.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f5081f) {
            this.f5076a.h().C();
        }
        if (this.f5081f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C0684c c0684c, int i2) {
        c0684c.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f5079d[i2];
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = f5075m[i5];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + O6.g.O(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            c0684c.j(str3);
        }
    }

    public final void c(C0684c database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.t()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f5076a.f4098h.readLock();
            Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.j) {
                    int[] a7 = this.f5083h.a();
                    if (a7 != null) {
                        Intrinsics.checkNotNullParameter(database, "database");
                        if (database.B()) {
                            database.d();
                        } else {
                            database.a();
                        }
                        try {
                            int length = a7.length;
                            int i2 = 0;
                            int i5 = 0;
                            while (i2 < length) {
                                int i7 = a7[i2];
                                int i8 = i5 + 1;
                                if (i7 == 1) {
                                    b(database, i5);
                                } else if (i7 == 2) {
                                    String str = this.f5079d[i5];
                                    String[] strArr = f5075m;
                                    for (int i9 = 0; i9 < 3; i9++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + O6.g.O(str, strArr[i9]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.j(str2);
                                    }
                                }
                                i2++;
                                i5 = i8;
                            }
                            database.G();
                            database.h();
                            Unit unit = Unit.f6114a;
                        } catch (Throwable th) {
                            database.h();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        } catch (IllegalStateException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        }
    }
}
