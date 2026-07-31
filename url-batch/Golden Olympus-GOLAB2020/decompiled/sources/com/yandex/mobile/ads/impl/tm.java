package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.ironsource.b9;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
final class tm {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, sm> f32478a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f32479b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f32480c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f32481d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    private c f32482e;

    /* renamed from: f, reason: collision with root package name */
    private c f32483f;

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f32489a = false;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f32490b = null;

        /* renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f32491c = null;

        /* renamed from: d, reason: collision with root package name */
        private final SecureRandom f32492d = null;

        /* renamed from: e, reason: collision with root package name */
        private final C2392zg f32493e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32494f;

        /* renamed from: g, reason: collision with root package name */
        private hr1 f32495g;

        public b(File file) {
            this.f32493e = new C2392zg(file);
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(long j4) {
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void b() {
            this.f32493e.a();
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final boolean a() {
            return this.f32493e.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.DataOutputStream, java.io.OutputStream] */
        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void b(HashMap<String, sm> hashMap) {
            Object obj = null;
            try {
                OutputStream d4 = this.f32493e.d();
                hr1 hr1Var = this.f32495g;
                if (hr1Var == null) {
                    this.f32495g = new hr1(d4);
                } else {
                    hr1Var.a(d4);
                }
                hr1 hr1Var2 = this.f32495g;
                ?? r22 = new DataOutputStream(hr1Var2);
                try {
                    r22.writeInt(2);
                    r22.writeInt(this.f32489a ? 1 : 0);
                    DataOutputStream dataOutputStream = r22;
                    if (this.f32489a) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f32492d;
                        int i4 = u82.f32873a;
                        secureRandom.nextBytes(bArr);
                        r22.write(bArr);
                        try {
                            this.f32490b.init(1, this.f32491c, new IvParameterSpec(bArr));
                            r22.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(hr1Var2, this.f32490b));
                        } catch (InvalidAlgorithmParameterException e4) {
                            e = e4;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e5) {
                            e = e5;
                            throw new IllegalStateException(e);
                        }
                    }
                    try {
                        dataOutputStream.writeInt(hashMap.size());
                        int i5 = 0;
                        for (sm smVar : hashMap.values()) {
                            dataOutputStream.writeInt(smVar.f31838a);
                            dataOutputStream.writeUTF(smVar.f31839b);
                            Set<Map.Entry<String, byte[]>> a4 = smVar.a().a();
                            dataOutputStream.writeInt(a4.size());
                            for (Map.Entry<String, byte[]> entry : a4) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            i5 += a(smVar, 2);
                        }
                        dataOutputStream.writeInt(i5);
                        this.f32493e.a(dataOutputStream);
                        int i6 = u82.f32873a;
                        this.f32494f = false;
                    } catch (Throwable th) {
                        th = th;
                        obj = dataOutputStream;
                        r22 = obj;
                        u82.a((Closeable) r22);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    u82.a((Closeable) r22);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private static int a(sm smVar, int i4) {
            int hashCode = smVar.f31839b.hashCode() + (smVar.f31838a * 31);
            if (i4 < 2) {
                long b4 = smVar.a().b();
                return (hashCode * 31) + ((int) (b4 ^ (b4 >>> 32)));
            }
            return smVar.a().hashCode() + (hashCode * 31);
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(HashMap<String, sm> hashMap, SparseArray<String> sparseArray) {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            int readInt;
            if (!this.f32494f) {
                if (this.f32493e.b()) {
                    DataInputStream dataInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(this.f32493e.c());
                        dataInputStream = new DataInputStream(bufferedInputStream);
                        try {
                            readInt = dataInputStream.readInt();
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                u82.a((Closeable) dataInputStream2);
                            }
                            hashMap.clear();
                            sparseArray.clear();
                            this.f32493e.a();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                u82.a((Closeable) dataInputStream2);
                            }
                            throw th;
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream.readInt() & 1) != 0) {
                            if (this.f32490b != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    Cipher cipher = this.f32490b;
                                    SecretKeySpec secretKeySpec = this.f32491c;
                                    int i4 = u82.f32873a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f32490b));
                                } catch (InvalidAlgorithmParameterException e4) {
                                    e = e4;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e5) {
                                    e = e5;
                                    throw new IllegalStateException(e);
                                }
                            }
                        } else if (this.f32489a) {
                            this.f32494f = true;
                        }
                        int readInt2 = dataInputStream.readInt();
                        int i5 = 0;
                        for (int i6 = 0; i6 < readInt2; i6++) {
                            sm a4 = a(readInt, dataInputStream);
                            hashMap.put(a4.f31839b, a4);
                            sparseArray.put(a4.f31838a, a4.f31839b);
                            i5 += a(a4, readInt);
                        }
                        int readInt3 = dataInputStream.readInt();
                        boolean z4 = dataInputStream.read() == -1;
                        if (readInt3 == i5 && z4) {
                            u82.a((Closeable) dataInputStream);
                            return;
                        }
                        u82.a((Closeable) dataInputStream);
                        hashMap.clear();
                        sparseArray.clear();
                        this.f32493e.a();
                        return;
                    }
                    u82.a((Closeable) dataInputStream);
                    hashMap.clear();
                    sparseArray.clear();
                    this.f32493e.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(sm smVar, boolean z4) {
            this.f32494f = true;
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(sm smVar) {
            this.f32494f = true;
        }

        private static sm a(int i4, DataInputStream dataInputStream) {
            cz a4;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i4 >= 2) {
                a4 = tm.a(dataInputStream);
            } else {
                long readLong = dataInputStream.readLong();
                rr rrVar = new rr();
                rr.a(rrVar, readLong);
                a4 = cz.f24357c.a(rrVar);
            }
            return new sm(readInt, readUTF, a4);
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(HashMap<String, sm> hashMap) {
            if (this.f32494f) {
                b(hashMap);
            }
        }
    }

    private interface c {
        void a(long j4);

        void a(sm smVar);

        void a(sm smVar, boolean z4);

        void a(HashMap<String, sm> hashMap);

        void a(HashMap<String, sm> hashMap, SparseArray<String> sparseArray);

        boolean a();

        void b();

        void b(HashMap<String, sm> hashMap);
    }

    public tm(a60 a60Var, File file) {
        a aVar = new a(a60Var);
        b bVar = new b(new File(file, "monetization_cached_content_index.exi"));
        this.f32482e = aVar;
        this.f32483f = bVar;
    }

    public final void a(String str, rr rrVar) {
        sm c4 = c(str);
        if (c4.a(rrVar)) {
            this.f32482e.a(c4);
        }
    }

    public final sm c(String str) {
        sm smVar = this.f32478a.get(str);
        if (smVar != null) {
            return smVar;
        }
        SparseArray<String> sparseArray = this.f32479b;
        int size = sparseArray.size();
        int i4 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i4 < size && i4 == sparseArray.keyAt(i4)) {
                i4++;
            }
            keyAt = i4;
        }
        sm smVar2 = new sm(keyAt, str, cz.f24357c);
        this.f32478a.put(str, smVar2);
        this.f32479b.put(keyAt, str);
        this.f32481d.put(keyAt, true);
        this.f32482e.a(smVar2);
        return smVar2;
    }

    public final void d(String str) {
        sm smVar = this.f32478a.get(str);
        if (smVar != null && smVar.c() && smVar.d()) {
            this.f32478a.remove(str);
            int i4 = smVar.f31838a;
            boolean z4 = this.f32481d.get(i4);
            this.f32482e.a(smVar, z4);
            if (z4) {
                this.f32479b.remove(i4);
                this.f32481d.delete(i4);
            } else {
                this.f32479b.put(i4, null);
                this.f32480c.put(i4, true);
            }
        }
    }

    public final cz b(String str) {
        sm smVar = this.f32478a.get(str);
        return smVar != null ? smVar.a() : cz.f24357c;
    }

    private static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f32484e = {"id", b9.h.f15463W, "metadata"};

        /* renamed from: a, reason: collision with root package name */
        private final ov f32485a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<sm> f32486b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private String f32487c;

        /* renamed from: d, reason: collision with root package name */
        private String f32488d;

        public a(a60 a60Var) {
            this.f32485a = a60Var;
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final boolean a() {
            SQLiteDatabase readableDatabase = this.f32485a.getReadableDatabase();
            String str = this.f32487c;
            str.getClass();
            return ya2.a(readableDatabase, 1, str) != -1;
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void b() {
            ov ovVar = this.f32485a;
            String str = this.f32487c;
            str.getClass();
            try {
                String concat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = ovVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i4 = ya2.f34968a;
                    try {
                        if (u82.a(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e4) {
                        throw new nv(e4);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e5) {
                throw new nv(e5);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(long j4) {
            String hexString = Long.toHexString(j4);
            this.f32487c = hexString;
            this.f32488d = "ExoPlayerCacheIndex" + hexString;
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(HashMap<String, sm> hashMap, SparseArray<String> sparseArray) {
            if (this.f32486b.size() == 0) {
                try {
                    SQLiteDatabase readableDatabase = this.f32485a.getReadableDatabase();
                    String str = this.f32487c;
                    str.getClass();
                    if (ya2.a(readableDatabase, 1, str) != 1) {
                        SQLiteDatabase writableDatabase = this.f32485a.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            String str2 = this.f32487c;
                            str2.getClass();
                            ya2.a(writableDatabase, 1, str2, 1);
                            String str3 = this.f32488d;
                            str3.getClass();
                            writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                            writableDatabase.execSQL("CREATE TABLE " + this.f32488d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    SQLiteDatabase readableDatabase2 = this.f32485a.getReadableDatabase();
                    String str4 = this.f32488d;
                    str4.getClass();
                    Cursor query = readableDatabase2.query(str4, f32484e, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            int i4 = query.getInt(0);
                            String string = query.getString(1);
                            string.getClass();
                            hashMap.put(string, new sm(i4, string, tm.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                            sparseArray.put(i4, string);
                        } finally {
                        }
                    }
                    query.close();
                    return;
                } catch (SQLiteException e4) {
                    hashMap.clear();
                    sparseArray.clear();
                    throw new nv(e4);
                }
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void b(HashMap<String, sm> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f32485a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str = this.f32487c;
                    str.getClass();
                    ya2.a(writableDatabase, 1, str, 1);
                    String str2 = this.f32488d;
                    str2.getClass();
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                    writableDatabase.execSQL("CREATE TABLE " + this.f32488d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (sm smVar : hashMap.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        cz a4 = smVar.a();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry<String, byte[]>> a5 = a4.a();
                        dataOutputStream.writeInt(a5.size());
                        for (Map.Entry<String, byte[]> entry : a5) {
                            dataOutputStream.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream.writeInt(value.length);
                            dataOutputStream.write(value);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(smVar.f31838a));
                        contentValues.put(b9.h.f15463W, smVar.f31839b);
                        contentValues.put("metadata", byteArray);
                        String str3 = this.f32488d;
                        str3.getClass();
                        writableDatabase.replaceOrThrow(str3, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f32486b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e4) {
                throw new nv(e4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(sm smVar, boolean z4) {
            if (z4) {
                this.f32486b.delete(smVar.f31838a);
            } else {
                this.f32486b.put(smVar.f31838a, null);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(sm smVar) {
            this.f32486b.put(smVar.f31838a, smVar);
        }

        @Override // com.yandex.mobile.ads.impl.tm.c
        public final void a(HashMap<String, sm> hashMap) {
            if (this.f32486b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f32485a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i4 = 0; i4 < this.f32486b.size(); i4++) {
                    try {
                        sm valueAt = this.f32486b.valueAt(i4);
                        if (valueAt == null) {
                            int keyAt = this.f32486b.keyAt(i4);
                            String str = this.f32488d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            cz a4 = valueAt.a();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry<String, byte[]>> a5 = a4.a();
                            dataOutputStream.writeInt(a5.size());
                            for (Map.Entry<String, byte[]> entry : a5) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("id", Integer.valueOf(valueAt.f31838a));
                            contentValues.put(b9.h.f15463W, valueAt.f31839b);
                            contentValues.put("metadata", byteArray);
                            String str2 = this.f32488d;
                            str2.getClass();
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f32486b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e4) {
                throw new nv(e4);
            }
        }
    }

    public final sm a(String str) {
        return this.f32478a.get(str);
    }

    public final void b() {
        Iterator it = uj0.a(this.f32478a.keySet()).iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
    }

    public final Collection<sm> a() {
        return Collections.unmodifiableCollection(this.f32478a.values());
    }

    public final String a(int i4) {
        return this.f32479b.get(i4);
    }

    public final void a(long j4) {
        c cVar;
        this.f32482e.a(j4);
        c cVar2 = this.f32483f;
        if (cVar2 != null) {
            cVar2.a(j4);
        }
        if (!this.f32482e.a() && (cVar = this.f32483f) != null && cVar.a()) {
            this.f32483f.a(this.f32478a, this.f32479b);
            this.f32482e.b(this.f32478a);
        } else {
            this.f32482e.a(this.f32478a, this.f32479b);
        }
        c cVar3 = this.f32483f;
        if (cVar3 != null) {
            cVar3.b();
            this.f32483f = null;
        }
    }

    public final void c() {
        this.f32482e.a(this.f32478a);
        int size = this.f32480c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f32479b.remove(this.f32480c.keyAt(i4));
        }
        this.f32480c.clear();
        this.f32481d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cz a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < readInt; i4++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = u82.f32878f;
                int i5 = 0;
                while (i5 != readInt2) {
                    int i6 = i5 + min;
                    bArr = Arrays.copyOf(bArr, i6);
                    dataInputStream.readFully(bArr, i5, min);
                    min = Math.min(readInt2 - i6, 10485760);
                    i5 = i6;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(C1877de.a("Invalid value size: ", readInt2));
            }
        }
        return new cz(hashMap);
    }
}
