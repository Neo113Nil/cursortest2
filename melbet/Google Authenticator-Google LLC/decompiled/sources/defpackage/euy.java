package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class euy implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ euy(int i) {
        this.b = i;
        this.a = "com.google";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v28, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r13v46, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r13v50, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r14v61, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        SQLiteDatabase e;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                return ldt.j("", str, (byte[]) ((ldt) this.a).d.get(str));
            case 1:
                int g = ((hrz) obj).g();
                r2 = g == 1 || g == 3;
                Object obj2 = this.a;
                Boolean valueOf = Boolean.valueOf(r2);
                ((esi) obj2).a.set(valueOf);
                return valueOf;
            case 2:
                int i = evo.a;
                jkj k = euk.a.k();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((euk) obj).b).entrySet()) {
                    Object obj3 = this.a;
                    euj eujVar = (euj) entry.getValue();
                    jkj k2 = euj.a.k();
                    if (!eujVar.d.equals(obj3)) {
                        String str2 = eujVar.d;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        euj eujVar2 = (euj) k2.b;
                        str2.getClass();
                        eujVar2.b |= 1;
                        eujVar2.d = str2;
                    }
                    for (String str3 : eujVar.c) {
                        if (!str3.equals(obj3)) {
                            k2.z(str3);
                        }
                    }
                    k.A((String) entry.getKey(), (euj) k2.q());
                }
                return (euk) k.q();
            case 3:
                int i2 = evo.a;
                euj eujVar3 = euj.a;
                euj eujVar4 = (euj) ((euk) obj).b.get(this.a);
                if (eujVar4 != null) {
                    eujVar3 = eujVar4;
                }
                return eujVar3.c;
            case 4:
                int i3 = evo.a;
                Object obj4 = this.a;
                euj eujVar5 = euj.a;
                obj4.getClass();
                euj eujVar6 = (euj) ((euk) obj).b.get(obj4);
                if (eujVar6 != null) {
                    eujVar5 = eujVar6;
                }
                return eujVar5.d;
            case 5:
                euh euhVar = (euh) obj;
                Object obj5 = this.a;
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        synchronized (ewg.a) {
                            String str4 = (String) ((ewg) obj5).f.bB();
                            eud eudVar = euhVar.c;
                            if (eudVar == null) {
                                eudVar = eud.b;
                            }
                            ewg.e(str4, eudVar, "ce-tmp");
                            eud eudVar2 = euhVar.c;
                            if (eudVar2 == null) {
                                eudVar2 = eud.b;
                            }
                            ((ewg) obj5).g = eudVar2;
                        }
                        synchronized (ewg.b) {
                            String str5 = (String) ((ewg) obj5).h.bB();
                            euf eufVar = euhVar.d;
                            if (eufVar == null) {
                                eufVar = euf.b;
                            }
                            ewg.e(str5, eufVar, "de-tmp");
                            euf eufVar2 = euhVar.d;
                            if (eufVar2 == null) {
                                eufVar2 = euf.b;
                            }
                            ((ewg) obj5).i = eufVar2;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                ((AtomicBoolean) this.a).set(false);
                return null;
            case 7:
                ?? r13 = this.a;
                fdl fdlVar = (fdl) r13;
                Context context = fdlVar.b;
                File databasePath = context.getDatabasePath((String) obj);
                if (!fdlVar.l) {
                    bst bstVar = fdlVar.n;
                    String path = databasePath.getPath();
                    if (!bstVar.a.add(path)) {
                        throw new IllegalStateException(a.Z(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                    }
                    fdlVar.l = true;
                    boolean f = fdl.f(context, fdlVar.o);
                    fdlVar.m = f;
                    if (f) {
                        try {
                            File cacheDir = context.getCacheDir();
                            if (cacheDir != null) {
                                ((fdl) r13).m = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
                Set set = fdlVar.g;
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                        if (sQLiteDatabase == null) {
                            it.remove();
                        } else if (sQLiteDatabase.isOpen()) {
                            throw new IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                        }
                    }
                }
                try {
                    try {
                        e = fdl.e(((fdl) r13).b, databasePath, ((fdl) r13).o, ((fdl) r13).d, ((fdl) r13).e, ((fdl) r13).f);
                    } catch (fdh | fdj | fdk unused2) {
                        e = fdl.e(((fdl) r13).b, databasePath, ((fdl) r13).o, ((fdl) r13).d, ((fdl) r13).e, ((fdl) r13).f);
                    }
                    fdlVar.g.add(new WeakReference(e));
                    fdlVar.b.registerComponentCallbacks(r13);
                    return e;
                } catch (fdj e3) {
                    ((hkf) ((hkf) ((hkf) fdl.a.f()).h(e3)).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).s("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                    try {
                        File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                        File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                        File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                        try {
                            if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                throw new fdh("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e3);
                            }
                            throw new fdi(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                        } catch (Throwable th2) {
                            throw new fdi(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()), th2);
                        }
                    } catch (Throwable th3) {
                        throw new fdh("Recovery by deletion failed.", th3);
                    }
                } catch (fdk e4) {
                    throw new fdh("Probably-recoverable database upgrade failure.", e4);
                }
            case 8:
                return this.a.a(obj);
            case 9:
                return this.a.a(obj);
            case 10:
                return this.a.a(obj);
            case 11:
                return Pair.create(this.a, obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj6 = this.a;
                Intent intent = (Intent) obj;
                gty aC = hoq.aC(91, "AccountUiService useIntent");
                try {
                    fry fryVar = new fry(null, ful.a, null, intent, (frx) obj6);
                    aC.close();
                    return fryVar;
                } finally {
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Bundle bundle = (Bundle) obj;
                hoq.H(((String) this.a).equals(bundle.getString("accountType")));
                return bundle;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((fwm) this.a).b(((fuf) obj).b);
            case 15:
                int x = a.x(fwm.a((fxd) obj, (frv) this.a).e);
                if (x != 0 && x == 2) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 16:
                return iyi.j(fwm.a((fxd) obj, (frv) this.a));
            case 17:
                jkj C = ((fxd) obj).C();
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((fxd) C.b).d);
                int i4 = ((frv) this.a).a;
                Integer valueOf2 = Integer.valueOf(i4);
                if (!unmodifiableMap.containsKey(valueOf2)) {
                    throw new IllegalArgumentException();
                }
                jkj C2 = ((fxf) unmodifiableMap.get(valueOf2)).C();
                if (!C2.b.M()) {
                    C2.t();
                }
                fxf fxfVar = (fxf) C2.b;
                fxfVar.e = 1;
                fxfVar.b |= 4;
                C.B(i4, (fxf) C2.q());
                return (fxd) C.q();
            case 18:
                return ((AtomicReference) this.a).get();
            case 19:
                return Boolean.valueOf(!(((Boolean) ((fxe) obj).b.get(this.a)) != null ? r13.booleanValue() : false));
            default:
                jkj C3 = ((fxe) obj).C();
                if (!C3.b.M()) {
                    C3.t();
                }
                fxe fxeVar = (fxe) C3.b;
                jli jliVar = fxeVar.b;
                if (!jliVar.b) {
                    fxeVar.b = jliVar.a();
                }
                fxeVar.b.put(this.a, true);
                return (fxe) C3.q();
        }
    }

    public /* synthetic */ euy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
