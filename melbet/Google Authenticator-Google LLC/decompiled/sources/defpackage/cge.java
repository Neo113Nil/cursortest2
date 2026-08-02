package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cge implements cgn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cge(cgp cgpVar, String str, int i) {
        this.d = i;
        this.c = cgpVar;
        this.a = str;
        this.b = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
    
        if (r7 == r9.h) goto L59;
     */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        ?? r5;
        ArrayList arrayList;
        int i;
        int i2 = this.d;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.compileStatement((String) this.a).execute();
                cgp.g(sQLiteDatabase.rawQuery((String) this.b, null), new cgh(this.c, 2));
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            }
            Cursor cursor = (Cursor) obj;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                int i4 = cursor.getInt(7);
                cen b = ceo.b();
                b.g(cursor.getString(1));
                b.f(cursor.getLong(2));
                b.h(cursor.getLong(3));
                int i5 = 4;
                if (i4 != 0) {
                    b.e(new cem(cgp.d(cursor.getString(4)), cursor.getBlob(5)));
                } else {
                    b.e(new cem(cgp.d(cursor.getString(4)), (byte[]) cgp.g(((cgp) this.a).c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new cgg(i5))));
                }
                if (!cursor.isNull(6)) {
                    b.a = Integer.valueOf(cursor.getInt(6));
                }
                if (!cursor.isNull(8)) {
                    b.c = Integer.valueOf(cursor.getInt(8));
                }
                if (!cursor.isNull(9)) {
                    b.d = cursor.getString(9);
                }
                if (!cursor.isNull(10)) {
                    b.e = cursor.getBlob(10);
                }
                if (!cursor.isNull(11)) {
                    b.f = cursor.getBlob(11);
                }
                if (!cursor.isNull(12)) {
                    byte[] blob = cursor.getBlob(12);
                    if (blob == null || blob.length == 0) {
                        arrayList = null;
                    } else {
                        ByteBuffer wrap = ByteBuffer.wrap(blob);
                        arrayList = new ArrayList();
                        while (wrap.hasRemaining() && (i = wrap.getInt()) <= wrap.remaining()) {
                            byte[] bArr = new byte[i];
                            wrap.get(bArr);
                            arrayList.add(bArr);
                        }
                    }
                    b.g = arrayList;
                }
                if (!cursor.isNull(13)) {
                    b.h = cursor.getString(13);
                }
                this.b.add(new cgc(j, (ces) this.c, b.a()));
            }
            return null;
        }
        Cursor cursor2 = (Cursor) obj;
        while (true) {
            r5 = this.b;
            if (!cursor2.moveToNext()) {
                break;
            }
            String string = cursor2.getString(0);
            int i6 = cursor2.getInt(1);
            cff cffVar = cff.REASON_UNKNOWN;
            if (i6 != cffVar.h) {
                cff cffVar2 = cff.MESSAGE_TOO_OLD;
                if (i6 != cffVar2.h) {
                    cffVar2 = cff.CACHE_FULL;
                    if (i6 != cffVar2.h) {
                        cffVar2 = cff.PAYLOAD_TOO_BIG;
                        if (i6 != cffVar2.h) {
                            cffVar2 = cff.MAX_RETRIES_REACHED;
                            if (i6 != cffVar2.h) {
                                cffVar2 = cff.INVALID_PAYLOD;
                                if (i6 != cffVar2.h) {
                                    cffVar2 = cff.SERVER_ERROR;
                                }
                            }
                        }
                    }
                }
                cffVar = cffVar2;
            }
            long j2 = cursor2.getLong(2);
            if (!r5.containsKey(string)) {
                r5.put(string, new ArrayList());
            }
            ((List) r5.get(string)).add(new cfg(j2, cffVar));
        }
        Iterator it = r5.entrySet().iterator();
        while (true) {
            Object obj2 = this.c;
            if (!it.hasNext()) {
                cgp cgpVar = (cgp) this.a;
                cfc cfcVar = (cfc) obj2;
                cfcVar.a = (cfj) cgpVar.e(new cgk(System.currentTimeMillis(), i3));
                cfcVar.c = new cfe(new cfi(cgpVar.a() * cgpVar.b(), cgb.a.b));
                cfcVar.d = (String) cgpVar.b.b();
                return cfcVar.a();
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i7 = cfh.c;
            new ArrayList();
            ((cfc) obj2).b.add(ow.t((String) entry.getKey(), (List) entry.getValue()));
        }
    }

    public /* synthetic */ cge(cgp cgpVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = cgpVar;
        this.b = obj;
        this.c = obj2;
    }
}
