package v0;

import a2.j0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.inputmethod.ExtractedText;
import e6.l;
import g2.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import r1.f;
import r1.t;
import r6.k;
import s0.o;
import u3.r;
import z0.p0;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d {
    public static final long a(float f9, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public static final boolean b(c cVar, long j8) {
        if (!cVar.f8104f.f8116r) {
            return false;
        }
        t tVar = (t) f.t(cVar).A.f3892c;
        if (!tVar.O.f8116r) {
            return false;
        }
        long j9 = tVar.f7065h;
        long W = tVar.W(0L);
        float d8 = y0.c.d(W);
        float e9 = y0.c.e(W);
        float f9 = ((int) (j9 >> 32)) + d8;
        float f10 = ((int) (j9 & 4294967295L)) + e9;
        float d9 = y0.c.d(j8);
        if (d8 > d9 || d9 > f9) {
            return false;
        }
        float e10 = y0.c.e(j8);
        return e9 <= e10 && e10 <= f10;
    }

    public static final ExtractedText c(w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f4065a.f373f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j8 = wVar.f4066b;
        extractedText.selectionStart = j0.e(j8);
        extractedText.selectionEnd = j0.d(j8);
        extractedText.flags = !h.x(wVar.f4065a.f373f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final o d(o oVar, p0 p0Var) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, p0Var, true, 124927);
    }

    public static final o e(o oVar) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, null, true, 126975);
    }

    public static final long f(long j8) {
        if (j8 != 9205357640488583168L) {
            return r.a(Float.intBitsToFloat((int) (j8 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j8 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static z3.b g(z3.c cVar, SQLiteDatabase sQLiteDatabase) {
        k.f(cVar, "refHolder");
        z3.b bVar = cVar.f10073a;
        if (bVar != null && bVar.f10072f.equals(sQLiteDatabase)) {
            return bVar;
        }
        z3.b bVar2 = new z3.b(sQLiteDatabase);
        cVar.f10073a = bVar2;
        return bVar2;
    }

    public static final List h(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        f6.c cVar = new f6.c(10);
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i8 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            k.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            k.e(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new w3.c(i7, i8, string, string2));
        }
        f6.c s5 = t6.a.s(cVar);
        k.f(s5, "<this>");
        if (s5.a() <= 1) {
            return l.w0(s5);
        }
        Object[] array = s5.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return e6.k.T(array);
    }

    public static final w3.d i(y3.a aVar, String str, boolean z8) {
        Cursor O = aVar.O("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = O.getColumnIndex("seqno");
            int columnIndex2 = O.getColumnIndex("cid");
            int columnIndex3 = O.getColumnIndex("name");
            int columnIndex4 = O.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (O.moveToNext()) {
                    if (O.getInt(columnIndex2) >= 0) {
                        int i7 = O.getInt(columnIndex);
                        String string = O.getString(columnIndex3);
                        String str2 = O.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i7);
                        k.e(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection values = treeMap.values();
                k.e(values, "columnsMap.values");
                List w02 = l.w0(values);
                Collection values2 = treeMap2.values();
                k.e(values2, "ordersMap.values");
                w3.d dVar = new w3.d(str, z8, w02, l.w0(values2));
                O.close();
                return dVar;
            }
            O.close();
            return null;
        } finally {
        }
    }
}
