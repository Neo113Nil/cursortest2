package T;

import X.V;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import com.clutchquizarena.app.R;
import f0.H;
import f0.T;
import g0.C0140c;
import i0.InterfaceC0142a;
import i0.InterfaceC0145d;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import l.L0;
import o1.AbstractC0296o;

/* loaded from: classes.dex */
public abstract class d implements Q.k {
    public static X0.i A(X0.g gVar, X0.h hVar) {
        g1.f.e(hVar, "key");
        return g1.f.a(gVar.getKey(), hVar) ? X0.j.f1156a : gVar;
    }

    public static X0.i G(X0.g gVar, X0.i iVar) {
        g1.f.e(iVar, "context");
        return H(gVar, iVar);
    }

    public static X0.i H(X0.i iVar, X0.i iVar2) {
        g1.f.e(iVar2, "context");
        return iVar2 == X0.j.f1156a ? iVar : (X0.i) iVar2.u(iVar, X0.b.d);
    }

    public static final Cursor I(androidx.room.t tVar, InterfaceC0145d interfaceC0145d) {
        g1.f.e(tVar, "db");
        g1.f.e(interfaceC0145d, "sqLiteQuery");
        return tVar.query(interfaceC0145d, (CancellationSignal) null);
    }

    public static U.b J(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    U.b bVar = new U.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f355a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f356b = i6;
                    bVar.f357c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List K(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        W0.c cVar = new W0.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            g1.f.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            g1.f.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new C0140c(i, i2, string, string2));
        }
        W0.c h = h(cVar);
        g1.f.e(h, "<this>");
        if (h.a() <= 1) {
            return V0.e.T(h);
        }
        Object[] array = h.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        List asList = Arrays.asList(array);
        g1.f.d(asList, "asList(...)");
        return asList;
    }

    public static final g0.d L(InterfaceC0142a interfaceC0142a, String str, boolean z2) {
        Cursor s2 = interfaceC0142a.s("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = s2.getColumnIndex("seqno");
            int columnIndex2 = s2.getColumnIndex("cid");
            int columnIndex3 = s2.getColumnIndex("name");
            int columnIndex4 = s2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (s2.moveToNext()) {
                    if (s2.getInt(columnIndex2) >= 0) {
                        int i = s2.getInt(columnIndex);
                        String string = s2.getString(columnIndex3);
                        String str2 = s2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        g1.f.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                g1.f.d(values, "columnsMap.values");
                List T2 = V0.e.T(values);
                Collection values2 = treeMap2.values();
                g1.f.d(values2, "ordersMap.values");
                g0.d dVar = new g0.d(str, z2, T2, V0.e.T(values2));
                k(s2, null);
                return dVar;
            }
            k(s2, null);
            return null;
        } finally {
        }
    }

    public static final void M(Object[] objArr, int i, int i2) {
        g1.f.e(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void N(View view, a.y yVar) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static final void Q(Object obj) {
        if (obj instanceof U0.e) {
            throw ((U0.e) obj).f859a;
        }
    }

    public static int R(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final boolean e(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!g1.f.a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final String f(Object[] objArr, int i, int i2, V0.a aVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        g1.f.d(sb2, "toString(...)");
        return sb2;
    }

    public static void g(Throwable th, Throwable th2) {
        g1.f.e(th, "<this>");
        g1.f.e(th2, "exception");
        if (th != th2) {
            Integer num = b1.a.f1702a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a1.a.f1244a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static W0.c h(W0.c cVar) {
        cVar.f();
        cVar.f904c = true;
        return cVar.f903b > 0 ? cVar : W0.c.d;
    }

    public static W0.i i(W0.i iVar) {
        W0.f fVar = iVar.f923a;
        fVar.b();
        return fVar.i > 0 ? iVar : W0.i.f922b;
    }

    public static void j(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(V.d(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final void k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g(th, th2);
            }
        }
    }

    public static int l(T t2, h hVar, View view, View view2, H h, boolean z2) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(H.H(view) - H.H(view2)) + 1;
        }
        return Math.min(hVar.l(), hVar.b(view2) - hVar.e(view));
    }

    public static int m(T t2, h hVar, View view, View view2, H h, boolean z2, boolean z3) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (t2.b() - Math.max(H.H(view), H.H(view2))) - 1) : Math.max(0, Math.min(H.H(view), H.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(hVar.b(view2) - hVar.e(view)) / (Math.abs(H.H(view) - H.H(view2)) + 1))) + (hVar.k() - hVar.e(view)));
        }
        return max;
    }

    public static int n(T t2, h hVar, View view, View view2, H h, boolean z2) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return t2.b();
        }
        return (int) (((hVar.b(view2) - hVar.e(view)) / (Math.abs(H.H(view) - H.H(view2)) + 1)) * t2.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u o(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        O0.e c0031c = Build.VERSION.SDK_INT >= 28 ? new C0031c(7) : new O0.e(7);
        PackageManager packageManager = context.getPackageManager();
        A.c.k(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] c2 = c0031c.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : c2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new u(new t(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static final U0.e p(Throwable th) {
        g1.f.e(th, "exception");
        return new U0.e(th);
    }

    public static boolean q(String str, String str2) {
        g1.f.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    g1.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring.length() - 1;
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 <= length) {
                        char charAt2 = substring.charAt(!z2 ? i5 : length);
                        boolean z3 = Character.isWhitespace(charAt2) || Character.isSpaceChar(charAt2);
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length--;
                        } else if (z3) {
                            i5++;
                        } else {
                            z2 = true;
                        }
                    }
                    return g1.f.a(substring.subSequence(i5, length + 1).toString(), str2);
                }
            }
        }
        return false;
    }

    public static X0.g r(X0.g gVar, X0.h hVar) {
        g1.f.e(hVar, "key");
        if (g1.f.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final int s(Cursor cursor, String str) {
        String str2;
        g1.f.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            g1.f.d(columnNames, "c.columnNames");
            str2 = V0.d.U(columnNames);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Drawable t(Context context, int i) {
        return L0.b().c(context, i);
    }

    public static Set u() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Class w(g1.c cVar) {
        Class a2 = cVar.a();
        g1.f.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class x(l1.b bVar) {
        g1.f.e(bVar, "<this>");
        Class a2 = ((g1.b) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static X0.d y(X0.d dVar) {
        g1.f.e(dVar, "<this>");
        Z0.e eVar = dVar instanceof Z0.e ? (Z0.e) dVar : null;
        if (eVar == null) {
            return dVar;
        }
        X0.d dVar2 = eVar.f1174c;
        if (dVar2 != null) {
            return dVar2;
        }
        X0.i iVar = eVar.f1173b;
        g1.f.b(iVar);
        X0.f fVar = (X0.f) iVar.j(X0.e.f1155a);
        X0.d fVar2 = fVar != null ? new s1.f((AbstractC0296o) fVar, eVar) : eVar;
        eVar.f1174c = fVar2;
        return fVar2;
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        g1.f.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public abstract void B(Throwable th);

    public abstract View C(int i);

    public abstract boolean D();

    public abstract void E(w wVar);

    public abstract Object F(Intent intent, int i);

    public abstract void O(boolean z2);

    public abstract void P(boolean z2);

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);
}
