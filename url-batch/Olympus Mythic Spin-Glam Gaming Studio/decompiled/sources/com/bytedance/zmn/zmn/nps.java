package com.bytedance.zmn.zmn;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.bytedance.zmn.zmn;
import com.bytedance.zmn.zn;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public class nps<T extends com.bytedance.zmn.zmn<?>> {
    private final com.bytedance.zmn.fs<T> fb;
    private com.bytedance.zmn.zmn.zmn.zmn iv;
    private volatile long klz;
    private volatile long mw;
    private SQLiteStatement rc;
    private volatile boolean rt;
    private final fs zn;
    private final ArrayList<T> fs = new ArrayList<>();
    private final HashSet<String> btk = new HashSet<>();
    private final HashSet<String> hhw = new HashSet<>();
    private final HashSet<String> nps = new HashSet<>();
    private final HashSet<String> zg = new HashSet<>();
    private final AtomicInteger bvs = new AtomicInteger(0);
    volatile AtomicInteger zmn = new AtomicInteger(0);

    public nps(fs fsVar, com.bytedance.zmn.fs<T> fsVar2) {
        zn.InterfaceC0213zn nps;
        this.zn = fsVar;
        this.fb = fsVar2;
        if (fsVar2.hhw() && (nps = fsVar2.nps()) != null) {
            this.iv = new com.bytedance.zmn.zmn.zmn.zmn(fsVar, zg(), nps);
        }
        if (fsVar.zn().nps() >= fsVar2.zmn()) {
            fsVar2.toString();
        }
    }

    public com.bytedance.zmn.fs<T> zmn() {
        return this.fb;
    }

    public void zmn(zn znVar) {
        com.bytedance.zmn.zmn.zmn.zmn zmnVar;
        long btk = this.fb.btk();
        if (btk <= 0) {
            return;
        }
        try {
            int delete = znVar.getWritableDatabase().delete(this.fb.fb(), "create_time < ?", new String[]{String.valueOf(System.currentTimeMillis() - btk)});
            if (delete <= 0 || (zmnVar = this.iv) == null) {
                return;
            }
            zmnVar.zmn(4, delete);
        } catch (Throwable unused) {
            com.bytedance.zmn.zmn.zmn.zmn zmnVar2 = this.iv;
            if (zmnVar2 != null) {
                zmnVar2.zmn(10003);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0102, code lost:
    
        if (r0.inTransaction() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ec, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ea, code lost:
    
        if (r0.inTransaction() != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zmn(zn.btk btkVar, zn znVar) {
        ArrayList arrayList;
        com.bytedance.zmn.zmn zmnVar;
        byte[] fb;
        synchronized (this.fs) {
            arrayList = new ArrayList(this.fs);
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                try {
                    try {
                        sQLiteDatabase = znVar.getWritableDatabase();
                        sQLiteDatabase.beginTransaction();
                        if (this.rc == null) {
                            this.rc = sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO " + this.fb.fb() + "(data_id,data,priority,upload_retry_count,create_time) VALUES (?,?,?,?,?)");
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                zmnVar = (com.bytedance.zmn.zmn) arrayList.get(i);
                                fb = zmnVar.fb();
                            } catch (Exception unused) {
                                com.bytedance.zmn.zmn.zmn.zmn zmnVar2 = this.iv;
                                if (zmnVar2 != null) {
                                    zmnVar2.zmn(12);
                                }
                            }
                            if (fb != null && fb.length != 0) {
                                zn.zmn fb2 = btkVar.fb();
                                if (fb2 != null) {
                                    byte[] zmn = fb2.zmn(fb);
                                    if (zmn != null) {
                                        com.bytedance.zmn.zmn.zmn.zmn zmnVar3 = this.iv;
                                        if (zmnVar3 != null) {
                                            zmnVar3.zmn(5);
                                        }
                                        fb = zmn;
                                    } else {
                                        com.bytedance.zmn.zmn.zmn.zmn zmnVar4 = this.iv;
                                        if (zmnVar4 != null) {
                                            zmnVar4.zmn(6);
                                        }
                                    }
                                }
                                this.rc.clearBindings();
                                this.rc.bindString(1, zmnVar.hhw());
                                this.rc.bindBlob(2, fb);
                                this.rc.bindLong(3, zmnVar.fs());
                                this.rc.bindLong(4, zmnVar.btk());
                                this.rc.bindLong(5, zmnVar.zmn());
                                this.rc.executeInsert();
                            }
                            zmnVar.toString();
                            com.bytedance.zmn.zmn.zmn.zmn zmnVar5 = this.iv;
                            if (zmnVar5 != null) {
                                zmnVar5.zmn(9);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        arrayList.size();
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Exception unused2) {
                        }
                        z = true;
                    } catch (SQLiteFullException unused3) {
                        arrayList.size();
                        com.bytedance.zmn.zmn.zmn.zmn zmnVar6 = this.iv;
                        if (zmnVar6 != null) {
                            zmnVar6.zmn(10006);
                        }
                        if (sQLiteDatabase != null) {
                        }
                    }
                } catch (Throwable unused4) {
                    com.bytedance.zmn.zmn.zmn.zmn zmnVar7 = this.iv;
                    if (zmnVar7 != null) {
                        zmnVar7.zmn(10004);
                    }
                    if (sQLiteDatabase != null) {
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        }
        if (z) {
            this.mw = SystemClock.elapsedRealtime();
            this.bvs.addAndGet(arrayList.size());
            synchronized (this.fs) {
                this.fs.removeAll(arrayList);
                arrayList.size();
            }
            nps(znVar);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fs(zn znVar) {
        ArrayList arrayList = new ArrayList(this.fs.size());
        synchronized (this.fs) {
            try {
                int size = this.fs.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(this.fs.get(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.btk) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bytedance.zmn.zmn zmnVar = (com.bytedance.zmn.zmn) it.next();
                    if (this.btk.contains(zmnVar.hhw())) {
                        zmnVar.toString();
                        it.remove();
                    } else {
                        this.btk.add(zmnVar.hhw());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        arrayList.size();
        if (arrayList.isEmpty()) {
            return;
        }
        zmn(arrayList, znVar, false, new zn.fs<T>() { // from class: com.bytedance.zmn.zmn.nps.1
            @Override // com.bytedance.zmn.zn.fs
            public void zmn(ArrayList<T> arrayList2, boolean z) {
                com.bytedance.zmn.fs unused = nps.this.fb;
                arrayList2.size();
                if (z) {
                    synchronized (nps.this.fs) {
                        nps.this.fs.removeAll(arrayList2);
                    }
                }
            }
        });
    }

    public final void zmn(zn znVar, int i) {
        Cursor cursor;
        String str;
        String[] strArr;
        ArrayList<T> arrayList;
        this.bvs.set(0);
        try {
            SQLiteDatabase readableDatabase = znVar.getReadableDatabase();
            int hhw = hhw();
            if (this.btk.isEmpty()) {
                str = null;
                strArr = null;
            } else {
                StringBuilder sb = new StringBuilder("data_id NOT IN (");
                ArrayList arrayList2 = new ArrayList();
                synchronized (this.btk) {
                    try {
                        Iterator<String> it = this.btk.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!arrayList2.isEmpty()) {
                                sb.append(StringUtils.COMMA);
                            }
                            sb.append("?");
                            arrayList2.add(next);
                            if (arrayList2.size() >= hhw) {
                                break;
                            }
                        }
                    } finally {
                    }
                }
                sb.append(")");
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                Arrays.toString(strArr2);
                str = sb2;
                strArr = strArr2;
            }
            Cursor query = readableDatabase.query(this.fb.fb(), null, str, strArr, null, null, "priority DESC, create_time DESC", String.valueOf(hhw * i * 2));
            if (query != null) {
                try {
                    if (!query.moveToFirst()) {
                        toString();
                        try {
                            query.close();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("data");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("data_id");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    int columnIndexOrThrow4 = query.getColumnIndexOrThrow("upload_retry_count");
                    ArrayList<T> arrayList3 = new ArrayList<>();
                    int i2 = 0;
                    while (true) {
                        try {
                            String string = query.getString(columnIndexOrThrow2);
                            synchronized (this.btk) {
                                try {
                                    if (!this.btk.contains(string)) {
                                        this.btk.add(string);
                                        byte[] blob = query.getBlob(columnIndexOrThrow);
                                        zn.zmn fb = this.zn.zn().fb();
                                        if (fb != null) {
                                            blob = fb.fs(blob);
                                            com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
                                            if (zmnVar != null) {
                                                zmnVar.zmn(blob != null ? 7 : 8);
                                            }
                                        }
                                        T zmn = this.fb.zmn(string, blob, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
                                        if (zmn == null) {
                                            synchronized (this.btk) {
                                                this.btk.remove(string);
                                            }
                                        } else {
                                            arrayList3.add(zmn);
                                            if (arrayList3.size() >= hhw) {
                                                zmn(arrayList3, znVar, true, null);
                                                i2++;
                                                arrayList = new ArrayList<>();
                                                if (i2 < i) {
                                                    arrayList3 = arrayList;
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        } catch (Exception unused2) {
                            com.bytedance.zmn.zmn.zmn.zmn zmnVar2 = this.iv;
                            if (zmnVar2 != null) {
                                zmnVar2.zmn(11);
                            }
                        }
                        if (!query.moveToNext()) {
                            arrayList = arrayList3;
                            break;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        zmn(arrayList, znVar, false, null);
                    }
                } catch (Throwable unused3) {
                    cursor = query;
                    try {
                        com.bytedance.zmn.zmn.zmn.zmn zmnVar3 = this.iv;
                        if (zmnVar3 != null) {
                            zmnVar3.zmn(10005);
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                                return;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused5) {
                            }
                        }
                        throw th;
                    }
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception unused6) {
                }
            }
        } catch (Throwable unused7) {
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zmn(ArrayList<T> arrayList, zn znVar, final boolean z, final zn.fs<T> fsVar) {
        arrayList.size();
        toString();
        this.klz = SystemClock.elapsedRealtime();
        this.fb.zmn(arrayList, new zn.fs<T>() { // from class: com.bytedance.zmn.zmn.nps.2
            @Override // com.bytedance.zmn.zn.fs
            public void zmn(ArrayList<T> arrayList2, boolean z2) {
                nps.this.rt = z2;
                int size = arrayList2.size();
                com.bytedance.zmn.fs unused = nps.this.fb;
                boolean z3 = z || nps.this.mw > nps.this.klz;
                if (z2) {
                    boolean z4 = nps.this.zmn.get() > 0;
                    nps.this.zmn.set(0);
                    nps.this.zmn(arrayList2);
                    nps.this.zn.zmn(nps.this, z3, true, z4);
                } else {
                    nps.this.zmn.getAndAdd(1);
                    nps.this.fs(arrayList2);
                    nps.this.zn.zmn(nps.this, z3, false, false);
                }
                zn.fs fsVar2 = fsVar;
                if (fsVar2 != null) {
                    fsVar2.zmn(arrayList2, z2);
                }
                if (!z2 || nps.this.iv == null) {
                    return;
                }
                nps.this.iv.zmn(2, size);
            }
        });
    }

    private void nps(zn znVar) {
        HashSet hashSet;
        SQLiteDatabase sQLiteDatabase;
        if (this.hhw.isEmpty()) {
            return;
        }
        synchronized (this.hhw) {
            hashSet = new HashSet(this.hhw);
            this.hhw.clear();
        }
        try {
            sQLiteDatabase = znVar.getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sQLiteDatabase.delete(this.fb.fb(), "data_id = ?", new String[]{str}) == 0) {
                    hashSet2.add(str);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            hashSet.size();
            hashSet2.size();
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable unused3) {
            try {
                com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
                if (zmnVar != null) {
                    zmnVar.zmn(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE);
                }
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused4) {
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
    }

    private void zmn(zn znVar, ArrayList<String> arrayList, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        boolean z2 = false;
        try {
            sQLiteDatabase = znVar.getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = arrayList.get(i);
                if (i > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append("?");
            }
            sb.append(")");
            if (sQLiteDatabase.delete(this.fb.fb(), "data_id in ".concat(String.valueOf(sb)), strArr) == 0) {
                hashSet.addAll(arrayList);
            } else {
                z2 = true;
            }
            sQLiteDatabase.setTransactionSuccessful();
            arrayList.size();
            hashSet.size();
            hashSet.size();
            if (z && !hashSet.isEmpty()) {
                synchronized (this.hhw) {
                    this.hhw.addAll(hashSet);
                }
            }
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable unused3) {
            if (z && !z2) {
                try {
                    synchronized (this.hhw) {
                        this.hhw.addAll(arrayList);
                    }
                } finally {
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
            if (zmnVar != null) {
                zmnVar.zmn(Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            }
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception unused5) {
                }
            }
        }
    }

    private void zmn(zn znVar, ArrayList<String> arrayList) {
        try {
            SQLiteDatabase writableDatabase = znVar.getWritableDatabase();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = arrayList.get(i);
                if (i > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append("?");
            }
            sb.append(")");
            writableDatabase.execSQL("UPDATE " + this.fb.fb() + " SET upload_retry_count = upload_retry_count+1 WHERE data_id IN " + ((Object) sb), strArr);
            arrayList.size();
        } catch (Throwable unused) {
            com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
            if (zmnVar != null) {
                zmnVar.zmn(10000);
            }
        }
    }

    public int zmn(T t) {
        int size;
        synchronized (this.fs) {
            this.fs.add(t);
            size = this.fs.size();
        }
        if (t.fs() == 1) {
            return 6;
        }
        return size > fs() ? 2 : 1;
    }

    public int fs() {
        int bvs = (int) (this.fb.bvs() * btk.zmn(true));
        if (bvs <= 0) {
            return 1;
        }
        return bvs;
    }

    public int zn() {
        return this.fs.size();
    }

    public com.bytedance.zmn.zmn.zmn.zmn fb() {
        return this.iv;
    }

    public final long btk() {
        long zmn = (long) (this.fb.zmn() * btk.zmn(false));
        if (zmn <= 0 || zmn > 600000) {
            zmn = 15000;
        }
        if (this.zmn.get() < 2) {
            return zmn;
        }
        long min = (long) Math.min(600000.0d, Math.pow(2.0d, this.zmn.get()) * zmn);
        this.zmn.get();
        return min;
    }

    public final int hhw() {
        int fs = (int) (this.fb.fs() * btk.zmn(true));
        if (fs <= 0) {
            return 100;
        }
        return fs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        if (r10 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r10 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r10.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zn(zn znVar) {
        Cursor cursor;
        try {
            cursor = znVar.getReadableDatabase().query(this.fb.fb(), new String[]{"count(*)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i = cursor.getInt(0);
                        try {
                            cursor.close();
                        } catch (Exception unused) {
                        }
                        return i;
                    }
                } catch (Throwable unused2) {
                    try {
                        com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
                        if (zmnVar != null) {
                            zmnVar.zmn(10007);
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable unused4) {
            cursor = null;
        }
        return 0;
    }

    public String nps() {
        return this.fb.zn();
    }

    public String zg() {
        return this.fb.fb();
    }

    public boolean bvs() {
        return !this.btk.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.nps) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    this.nps.add(arrayList.get(i).hhw());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.zn.zmn(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.zg) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    this.zg.add(arrayList.get(i).hhw());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.zn.fs(this);
    }

    public void fb(zn znVar) {
        ArrayList<String> arrayList;
        synchronized (this.nps) {
            arrayList = new ArrayList<>(this.nps);
            this.nps.clear();
        }
        zmn(znVar, arrayList, false);
        synchronized (this.btk) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    this.btk.remove(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void btk(zn znVar) {
        ArrayList<String> arrayList;
        synchronized (this.zg) {
            arrayList = new ArrayList<>(this.zg);
            this.zg.clear();
        }
        zmn(znVar, arrayList);
        synchronized (this.btk) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    this.btk.remove(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean iv() {
        return this.rt && this.bvs.get() >= this.fb.zg();
    }

    public long rc() {
        long iv = (long) (this.fb.iv() * btk.zmn(true));
        if (iv <= 0) {
            return 100L;
        }
        return iv;
    }

    public void hhw(final zn znVar) {
        this.bvs.set(0);
        int hhw = hhw();
        int ceil = (int) Math.ceil((zn(znVar) * 1.0f) / hhw);
        Objects.toString(this.fb);
        for (int i = 0; i < ceil; i++) {
            final int i2 = i * hhw;
            try {
                zn.fb fs = this.zn.zn().fs();
                ExecutorService fs2 = fs != null ? fs.fs() : null;
                if (fs2 == null) {
                    fs2 = com.bytedance.zmn.zmn.fs.zmn.zmn();
                }
                fs2.submit(new com.bytedance.zmn.zmn.fs.fs() { // from class: com.bytedance.zmn.zmn.nps.3
                    @Override // com.bytedance.zmn.zmn.fs.fs
                    public void zmn(long j) {
                        com.bytedance.zmn.fs unused = nps.this.fb;
                        nps.this.fs(znVar, i2);
                    }
                });
            } catch (Exception unused) {
                com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
                if (zmnVar != null) {
                    zmnVar.zmn(10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c8, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00c6, code lost:
    
        if (r15 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d9, code lost:
    
        if (r15 != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fs(zn znVar, int i) {
        Cursor cursor;
        ArrayList<T> arrayList = new ArrayList<>();
        boolean z = true;
        try {
            SQLiteDatabase readableDatabase = znVar.getReadableDatabase();
            int hhw = hhw();
            cursor = readableDatabase.query(this.fb.fb(), null, null, null, null, null, "priority DESC, create_time DESC", i + StringUtils.COMMA + hhw);
            if (cursor != null) {
                try {
                    if (!cursor.moveToFirst()) {
                        toString();
                        try {
                            cursor.close();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    if (cursor.getCount() < hhw) {
                        z = false;
                    }
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("data");
                    int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data_id");
                    int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("upload_retry_count");
                    do {
                        String string = cursor.getString(columnIndexOrThrow2);
                        synchronized (this.btk) {
                            try {
                                if (!this.btk.contains(string)) {
                                    this.btk.add(string);
                                    byte[] blob = cursor.getBlob(columnIndexOrThrow);
                                    zn.zmn fb = this.zn.zn().fb();
                                    if (fb != null) {
                                        blob = fb.fs(blob);
                                        com.bytedance.zmn.zmn.zmn.zmn zmnVar = this.iv;
                                        if (zmnVar != null) {
                                            zmnVar.zmn(blob != null ? 7 : 8);
                                        }
                                    }
                                    T zmn = this.fb.zmn(string, blob, cursor.getInt(columnIndexOrThrow3), cursor.getInt(columnIndexOrThrow4));
                                    if (zmn == null) {
                                        synchronized (this.btk) {
                                            this.btk.remove(string);
                                        }
                                    } else {
                                        arrayList.add(zmn);
                                    }
                                }
                            } finally {
                            }
                        }
                    } while (cursor.moveToNext());
                } catch (Throwable unused2) {
                    try {
                        com.bytedance.zmn.zmn.zmn.zmn zmnVar2 = this.iv;
                        if (zmnVar2 != null) {
                            zmnVar2.zmn(10005);
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable unused4) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            zmn(arrayList, znVar, z, null);
        } else {
            toString();
        }
    }
}
