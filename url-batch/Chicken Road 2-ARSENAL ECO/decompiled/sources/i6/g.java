package i6;

import D3.M;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import c0.C0275h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f5.C0387a;
import i5.AbstractC0430a;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.C0477g;
import l0.q;
import l5.AbstractC0506j;
import l5.t;
import m0.C0519a;
import m1.AbstractC0521b;
import m5.C0526c;
import p1.C0576a;
import s5.AbstractC0633a;
import t5.AbstractC0665a;
import u0.AbstractC0676f;
import u0.C0680j;
import u0.C0686p;
import w0.C0711c;
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class g {
    public static C5.a A(C5.c cVar, int i7) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        boolean z5 = i7 > 0;
        Integer valueOf = Integer.valueOf(i7);
        if (!z5) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i8 = cVar.f228f;
        int i9 = cVar.f229g;
        if (cVar.f230h <= 0) {
            i7 = -i7;
        }
        return new C5.a(i8, i9, i7);
    }

    public static C5.c B(int i7, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new C5.c(i7, i8 - 1, 1);
        }
        C5.c cVar = C5.c.f235i;
        return C5.c.f235i;
    }

    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC0665a.f5963a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC0633a.f5881a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static Object b(int i7, Object obj) {
        if (i7 != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(i7, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i7 ? obj : str.substring(0, i7);
            }
        }
        return obj;
    }

    public static Bitmap c(Bitmap bitmap, int i7) {
        if (bitmap != null) {
            switch (i7) {
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                case 3:
                case 6:
                case 8:
                    break;
                case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i7 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i7 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i7 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i7 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i7);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static void g(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(C1.c.f(i7, i8, "startIndex: ", " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i8 + ", size: " + i9);
    }

    public static void h(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(C1.c.f(i7, i8, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static long i(long j4) {
        if (j4 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j4 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j4;
    }

    public static final void j(Q4.j jVar, String name, String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ArrayList arrayList = jVar.f2027a;
        arrayList.add(name);
        arrayList.add(F5.j.h0(value).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static C0387a l(Map attributes) {
        kotlin.jvm.internal.i.e(attributes, "attributes");
        C0387a c0387a = C0387a.f4248c;
        c0387a.getClass();
        M m4 = new M(27);
        m4.w(c0387a.f4250b);
        String str = c0387a.f4249a;
        if (str == null) {
            str = null;
        }
        a4.e eVar = AbstractC0430a.f4431a;
        if (eVar != null && !eVar.f3140b.isEmpty()) {
            m4.u(eVar, "OneSignalDeviceSDK");
        }
        for (Map.Entry entry : attributes.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null && str3 != null) {
                m4.v(str2, str3);
            }
        }
        return C0387a.a(m4.t(), str);
    }

    public static void m(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C0576a c0576a = (C0576a) obj;
            p1.e eVar = new p1.e(c0576a);
            for (p1.o oVar : c0576a.f5661b) {
                boolean z5 = c0576a.f5664e == 0;
                p1.f fVar = new p1.f(oVar, !z5);
                if (!hashMap.containsKey(fVar)) {
                    hashMap.put(fVar, new HashSet());
                }
                Set set = (Set) hashMap.get(fVar);
                if (!set.isEmpty() && z5) {
                    throw new IllegalArgumentException("Multiple components provide " + oVar + ".");
                }
                set.add(eVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (p1.e eVar2 : (Set) it.next()) {
                for (p1.g gVar : eVar2.f5675a.f5662c) {
                    if (gVar.f5682c == 0) {
                        Set<p1.e> set2 = (Set) hashMap.get(new p1.f(gVar.f5680a, gVar.f5681b == 2));
                        if (set2 != null) {
                            for (p1.e eVar3 : set2) {
                                eVar2.f5676b.add(eVar3);
                                eVar3.f5677c.add(eVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            p1.e eVar4 = (p1.e) it3.next();
            if (eVar4.f5677c.isEmpty()) {
                hashSet2.add(eVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            p1.e eVar5 = (p1.e) hashSet2.iterator().next();
            hashSet2.remove(eVar5);
            i7++;
            Iterator it4 = eVar5.f5676b.iterator();
            while (it4.hasNext()) {
                p1.e eVar6 = (p1.e) it4.next();
                eVar6.f5677c.remove(eVar5);
                if (eVar6.f5677c.isEmpty()) {
                    hashSet2.add(eVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            p1.e eVar7 = (p1.e) it5.next();
            if (!eVar7.f5677c.isEmpty() && !eVar7.f5676b.isEmpty()) {
                arrayList2.add(eVar7.f5675a);
            }
        }
        throw new p1.h("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final C0680j n(C0686p c0686p) {
        kotlin.jvm.internal.i.e(c0686p, "<this>");
        return new C0680j(c0686p.f6000a, c0686p.f6019t);
    }

    public static final void o(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = name.charAt(i7);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0521b.g(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.i.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i7);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void p(String value, String name) {
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(name, "name");
        int length = value.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = value.charAt(i7);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0521b.g(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.i.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i7);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(Y5.c.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void q(Context context) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.i.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.i.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            q.d().a(m0.m.f5368a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.i.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C0519a.f5326a.a(context), "androidx.work.workdb");
            String[] strArr = m0.m.f5369b;
            int p02 = t.p0(strArr.length);
            if (p02 < 16) {
                p02 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p02);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            C0477g c0477g = new C0477g(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = t.q0(c0477g);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        q.d().g(m0.m.f5368a, "Over-writing contents of " + file3);
                    }
                    q.d().a(m0.m.f5368a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static C0275h r(String str) {
        String group;
        if (str == null || F5.j.T(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        kotlin.jvm.internal.i.d(description, "description");
        return new C0275h(parseInt, parseInt2, parseInt3, description);
    }

    public static String s(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        n6.i iVar = n6.i.f5525i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.i.d(encoded, "getEncoded(...)");
        int i7 = 0;
        n6.i h7 = C0760d.h(encoded, 0, -1234567890);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(h7.f5526f, 0, h7.a());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.i.b(digest);
        new n6.i(digest);
        byte[] map = n6.a.f5508a;
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i8 = 0;
        while (i7 < length) {
            byte b7 = digest[i7];
            int i9 = i7 + 2;
            byte b8 = digest[i7 + 1];
            i7 += 3;
            byte b9 = digest[i9];
            bArr[i8] = map[(b7 & 255) >> 2];
            bArr[i8 + 1] = map[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr[i8 + 2] = map[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i8 += 4;
            bArr[i10] = map[b9 & 63];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b10 = digest[i7];
            bArr[i8] = map[(b10 & 255) >> 2];
            bArr[i8 + 1] = map[(b10 & 3) << 4];
            bArr[i8 + 2] = 61;
            bArr[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i7 + 1;
            byte b11 = digest[i7];
            byte b12 = digest[i11];
            bArr[i8] = map[(b11 & 255) >> 2];
            bArr[i8 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr[i8 + 2] = map[(b12 & 15) << 2];
            bArr[i8 + 3] = 61;
        }
        sb.append(new String(bArr, F5.a.f785a));
        return sb.toString();
    }

    public static final List v(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C0526c c0526c = new C0526c(10);
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i8 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.i.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.i.d(string2, "cursor.getString(toColumnIndex)");
            c0526c.add(new S.c(i7, i8, string, string2));
        }
        return AbstractC0506j.N(AbstractC0676f.c(c0526c));
    }

    public static final S.d w(V.c cVar, String str, boolean z5) {
        Cursor F6 = cVar.F("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = F6.getColumnIndex("seqno");
            int columnIndex2 = F6.getColumnIndex("cid");
            int columnIndex3 = F6.getColumnIndex("name");
            int columnIndex4 = F6.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (F6.moveToNext()) {
                    if (F6.getInt(columnIndex2) >= 0) {
                        int i7 = F6.getInt(columnIndex);
                        String columnName = F6.getString(columnIndex3);
                        String str2 = F6.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i7);
                        kotlin.jvm.internal.i.d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection values = treeMap.values();
                kotlin.jvm.internal.i.d(values, "columnsMap.values");
                List P6 = AbstractC0506j.P(values);
                Collection values2 = treeMap2.values();
                kotlin.jvm.internal.i.d(values2, "ordersMap.values");
                S.d dVar = new S.d(str, z5, P6, AbstractC0506j.P(values2));
                F6.close();
                return dVar;
            }
            F6.close();
            return null;
        } finally {
        }
    }

    public static void x(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }

    public static String y(Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.i.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static boolean z(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i7 = 0; i7 < bArr2.length; i7++) {
                if (bArr[i7] == bArr2[i7]) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract boolean d(w0.h hVar, C0711c c0711c, C0711c c0711c2);

    public abstract boolean e(w0.h hVar, Object obj, Object obj2);

    public abstract boolean f(w0.h hVar, w0.g gVar, w0.g gVar2);

    public abstract void t(w0.g gVar, w0.g gVar2);

    public abstract void u(w0.g gVar, Thread thread);
}
