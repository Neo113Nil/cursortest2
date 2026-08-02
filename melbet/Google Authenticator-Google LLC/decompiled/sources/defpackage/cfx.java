package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cfx implements cgv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cfx(cfk cfkVar, ces cesVar, ceo ceoVar, int i) {
        this.d = i;
        this.b = cfkVar;
        this.a = cesVar;
        this.c = ceoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.cgv
    public final Object a() {
        if (this.d != 0) {
            Object obj = this.a;
            Object obj2 = this.c;
            cfk cfkVar = (cfk) this.b;
            final cgp cgpVar = cfkVar.c;
            final ceo ceoVar = (ceo) obj2;
            final ces cesVar = (ces) obj;
            ((Long) cgpVar.e(new cgn() { // from class: cgf
                @Override // defpackage.cgn
                public final Object a(Object obj3) {
                    long insert;
                    byte[] array;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    cgp cgpVar2 = cgp.this;
                    long a = cgpVar2.a() * cgpVar2.b();
                    cgb cgbVar = cgpVar2.a;
                    long j = cgbVar.b;
                    ceo ceoVar2 = ceoVar;
                    if (a >= j) {
                        cgpVar2.j(1L, cff.CACHE_FULL, ceoVar2.a);
                        return -1L;
                    }
                    ces cesVar2 = cesVar;
                    Long m = cgp.m(sQLiteDatabase, cesVar2);
                    if (m != null) {
                        insert = m.longValue();
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("backend_name", cesVar2.a);
                        contentValues.put("priority", Integer.valueOf(cgy.a(cesVar2.c)));
                        contentValues.put("next_request_ms", (Integer) 0);
                        byte[] bArr = cesVar2.b;
                        if (bArr != null) {
                            contentValues.put("extras", Base64.encodeToString(bArr, 0));
                        }
                        insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                    }
                    int i = cgbVar.f;
                    cem cemVar = ceoVar2.c;
                    byte[] bArr2 = cemVar.b;
                    boolean z = bArr2.length <= i;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("context_id", Long.valueOf(insert));
                    contentValues2.put("transport_name", ceoVar2.a);
                    contentValues2.put("timestamp_ms", Long.valueOf(ceoVar2.d));
                    contentValues2.put("uptime_ms", Long.valueOf(ceoVar2.e));
                    contentValues2.put("payload_encoding", cemVar.a.a);
                    contentValues2.put("code", ceoVar2.b);
                    contentValues2.put("num_attempts", (Integer) 0);
                    contentValues2.put("inline", Boolean.valueOf(z));
                    contentValues2.put("payload", z ? bArr2 : new byte[0]);
                    contentValues2.put("product_id", ceoVar2.g);
                    contentValues2.put("pseudonymous_id", ceoVar2.h);
                    contentValues2.put("experiment_ids_clear_blob", ceoVar2.i);
                    contentValues2.put("experiment_ids_encrypted_blob", ceoVar2.j);
                    List list = ceoVar2.k;
                    if (list == null) {
                        array = new byte[0];
                    } else {
                        byte[][] bArr3 = (byte[][]) list.toArray(new byte[0][]);
                        int length = bArr3.length * 4;
                        int i2 = 0;
                        for (byte[] bArr4 : bArr3) {
                            i2 += bArr4.length;
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(i2 + length);
                        for (byte[] bArr5 : bArr3) {
                            allocate.putInt(bArr5.length);
                            allocate.put(bArr5);
                        }
                        array = allocate.array();
                    }
                    contentValues2.put("experiment_ids_encrypted_list_blob", array);
                    contentValues2.put("pseudonymous_id_update_receiver_class_name", ceoVar2.l);
                    long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                    if (!z) {
                        int ceil = (int) Math.ceil(bArr2.length / i);
                        for (int i3 = 1; i3 <= ceil; i3++) {
                            byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i3 - 1) * i, Math.min(i3 * i, bArr2.length));
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("event_id", Long.valueOf(insert2));
                            contentValues3.put("sequence_num", Integer.valueOf(i3));
                            contentValues3.put("bytes", copyOfRange);
                            sQLiteDatabase.insert("event_payloads", null, contentValues3);
                        }
                    }
                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(ceoVar2.f).entrySet()) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("event_id", Long.valueOf(insert2));
                        contentValues4.put("name", (String) entry.getKey());
                        contentValues4.put("value", (String) entry.getValue());
                        sQLiteDatabase.insert("event_metadata", null, contentValues4);
                    }
                    return Long.valueOf(insert2);
                }
            })).longValue();
            cfkVar.e.x(cesVar, 1, false);
            return null;
        }
        ?? r0 = this.b;
        boolean hasNext = r0.iterator().hasNext();
        Object obj3 = ((iee) this.a).d;
        if (hasNext) {
            cgp cgpVar2 = (cgp) obj3;
            cgpVar2.e(new cge(cgpVar2, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(cgp.h(r0)), 2));
        }
        cgp cgpVar3 = (cgp) obj3;
        cgpVar3.k((ces) this.c, System.currentTimeMillis());
        return null;
    }

    public /* synthetic */ cfx(iee ieeVar, List list, ces cesVar, int i) {
        this.d = i;
        this.a = ieeVar;
        this.b = list;
        this.c = cesVar;
    }
}
