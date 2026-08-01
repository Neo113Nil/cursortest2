package c6;

import a2.g0;
import a2.h;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.inputmethod.EditorInfo;
import b0.w0;
import b0.x;
import b1.y;
import c2.f;
import com.appsflyer.R;
import com.appsflyer.attribution.RequestError;
import d1.d;
import d1.i;
import d1.l;
import i1.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import k7.e;
import kotlin.Unit;
import kotlin.collections.h0;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.s1;
import n4.a0;
import n4.b0;
import n4.z;
import te.a1;
import wd.c0;
import x.g;
import z4.v;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {
    public static void A(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new d7.b(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 26), "Overread allowed size end=", i3), parcel);
        }
    }

    public static String B(androidx.datastore.preferences.protobuf.f fVar) {
        StringBuilder sb2 = new StringBuilder(fVar.size());
        for (int i3 = 0; i3 < fVar.size(); i3++) {
            byte b10 = fVar.b(i3);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final t C(o0.e eVar, j1.c cVar, int i3) {
        j1.c d10;
        if (i3 == 3) {
            d10 = cVar.d((cVar.f4918c - cVar.f4916a) + 1, 0.0f);
        } else if (i3 == 4) {
            d10 = cVar.d(-((cVar.f4918c - cVar.f4916a) + 1), 0.0f);
        } else if (i3 == 5) {
            d10 = cVar.d(0.0f, (cVar.f4919d - cVar.f4917b) + 1);
        } else {
            if (i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return null;
            }
            d10 = cVar.d(0.0f, -((cVar.f4919d - cVar.f4917b) + 1));
        }
        Object[] objArr = eVar.f7317d;
        int i10 = eVar.f7319i;
        t tVar = null;
        for (int i11 = 0; i11 < i10; i11++) {
            t tVar2 = (t) objArr[i11];
            if (w.A(tVar2)) {
                j1.c o6 = w.o(tVar2);
                if (N(o6, d10, cVar, i3)) {
                    tVar = tVar2;
                    d10 = o6;
                }
            }
        }
        return tVar;
    }

    public static final boolean D(t tVar, int i3, Function1 function1) {
        j1.c cVar;
        o0.e eVar = new o0.e(new t[16]);
        o(tVar, eVar);
        int i10 = eVar.f7319i;
        if (i10 <= 1) {
            t tVar2 = (t) (i10 == 0 ? null : eVar.f7317d[0]);
            if (tVar2 != null) {
                return ((Boolean) function1.invoke(tVar2)).booleanValue();
            }
        } else {
            if (i3 == 7) {
                i3 = 4;
            }
            if (i3 == 4 || i3 == 6) {
                j1.c o6 = w.o(tVar);
                float f3 = o6.f4916a;
                float f10 = o6.f4917b;
                cVar = new j1.c(f3, f10, f3, f10);
            } else {
                if (i3 != 3 && i3 != 5) {
                    i0.l("This function should only be used for 2-D focus search");
                    return false;
                }
                j1.c o10 = w.o(tVar);
                float f11 = o10.f4918c;
                float f12 = o10.f4919d;
                cVar = new j1.c(f11, f12, f11, f12);
            }
            t C = C(eVar, cVar, i3);
            if (C != null) {
                return ((Boolean) function1.invoke(C)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean E(int i3, a3.i iVar, t tVar, j1.c cVar) {
        if (a0(i3, iVar, tVar, cVar)) {
            return true;
        }
        ((i1.k) c2.k.v(tVar).getFocusOwner()).f();
        i7.a.b0(tVar);
        return false;
    }

    public static final int F(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i3 = 0;
                    int i10 = 0;
                    while (i10 < length) {
                        String str4 = columnNames[i10];
                        int i11 = i3 + 1;
                        if (str4.length() >= str.length() + 2 && (str4.endsWith(concat) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                            columnIndex = i3;
                            break;
                        }
                        i10++;
                        i3 = i11;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            str2 = kotlin.collections.w.q(63, columnNames2);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Set G() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o3.k H(Display display, int i3) {
        RoundedCorner roundedCorner;
        int position;
        int i10;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i10 = 1;
            if (position != 1) {
                i10 = 2;
                if (position != 2) {
                    i10 = 3;
                    if (position != 3) {
                        a1.e(v4.a.j(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new o3.k(i10, radius, center);
    }

    public static String I(int i3) {
        switch (i3) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case RequestError.STOP_TRACKING /* 11 */:
            case 12:
            default:
                return v4.a.n(new StringBuilder(String.valueOf(i3).length() + 21), "unknown status code: ", i3);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static File J(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int K(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static k5.d L(d9.c cVar, SQLiteDatabase sQLiteDatabase) {
        cVar.getClass();
        sQLiteDatabase.getClass();
        k5.d dVar = (k5.d) cVar.f3701e;
        if (dVar != null && Intrinsics.a(dVar.f5410d, sQLiteDatabase)) {
            return dVar;
        }
        k5.d dVar2 = new k5.d(sQLiteDatabase);
        cVar.f3701e = dVar2;
        return dVar2;
    }

    public static boolean M(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = b8.q.f1439d;
            }
        } else {
            if (!(collection instanceof b8.k)) {
                return false;
            }
            obj = ((b8.k) collection).f1431r;
        }
        return comparator.equals(obj);
    }

    public static final boolean N(j1.c cVar, j1.c cVar2, j1.c cVar3, int i3) {
        if (!O(i3, cVar, cVar3)) {
            return false;
        }
        if (O(i3, cVar2, cVar3) && !f(cVar3, cVar, cVar2, i3)) {
            return !f(cVar3, cVar2, cVar, i3) && P(i3, cVar3, cVar) < P(i3, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean O(int i3, j1.c cVar, j1.c cVar2) {
        float f3 = cVar.f4917b;
        float f10 = cVar.f4919d;
        float f11 = cVar.f4916a;
        float f12 = cVar.f4918c;
        if (i3 == 3) {
            float f13 = cVar2.f4918c;
            float f14 = cVar2.f4916a;
            return (f13 > f12 || f14 >= f12) && f14 > f11;
        }
        if (i3 == 4) {
            float f15 = cVar2.f4916a;
            float f16 = cVar2.f4918c;
            return (f15 < f11 || f16 <= f11) && f16 < f12;
        }
        if (i3 == 5) {
            float f17 = cVar2.f4919d;
            float f18 = cVar2.f4917b;
            return (f17 > f10 || f18 >= f10) && f18 > f3;
        }
        if (i3 != 6) {
            i0.l("This function should only be used for 2-D focus search");
            return false;
        }
        float f19 = cVar2.f4917b;
        float f20 = cVar2.f4919d;
        return (f19 < f3 || f20 <= f3) && f20 < f10;
    }

    public static final long P(int i3, j1.c cVar, j1.c cVar2) {
        float f3;
        float f10;
        float f11 = cVar2.f4917b;
        float f12 = cVar2.f4919d;
        float f13 = cVar2.f4916a;
        float f14 = cVar2.f4918c;
        if (i3 == 3) {
            f3 = cVar.f4916a - f14;
        } else if (i3 == 4) {
            f3 = f13 - cVar.f4918c;
        } else if (i3 == 5) {
            f3 = cVar.f4917b - f12;
        } else {
            if (i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            f3 = f11 - cVar.f4919d;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        long j = (long) f3;
        if (i3 == 3 || i3 == 4) {
            float f15 = cVar.f4917b;
            float f16 = 2;
            f10 = (((cVar.f4919d - f15) / f16) + f15) - (((f12 - f11) / f16) + f11);
        } else {
            if (i3 != 5 && i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f17 = cVar.f4916a;
            float f18 = 2;
            f10 = (((cVar.f4918c - f17) / f18) + f17) - (((f14 - f13) / f18) + f13);
        }
        long j3 = (long) f10;
        return (j3 * j3) + (13 * j * j);
    }

    public static final void Q(String str) {
        str.getClass();
        throw new IllegalArgumentException(n0.l.g("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static MappedByteBuffer R(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final a0 S(Function1 function1) {
        b0 b0Var = new b0();
        function1.invoke(b0Var);
        boolean z10 = b0Var.f7032b;
        z zVar = b0Var.f7031a;
        zVar.f7135a = z10;
        zVar.f7136b = b0Var.f7033c;
        Object obj = b0Var.g;
        if (obj != null) {
            boolean z11 = b0Var.f7035e;
            boolean z12 = b0Var.f7036f;
            zVar.f7138d = obj;
            zVar.f7137c = r4.d.b(cf.c.G(c0.a(obj.getClass())));
            zVar.f7139e = z11;
            zVar.f7140f = z12;
        } else {
            int i3 = b0Var.f7034d;
            boolean z13 = b0Var.f7035e;
            boolean z14 = b0Var.f7036f;
            zVar.f7137c = i3;
            zVar.f7139e = z13;
            zVar.f7140f = z14;
        }
        Object obj2 = zVar.f7138d;
        boolean z15 = zVar.f7135a;
        boolean z16 = zVar.f7136b;
        if (obj2 == null) {
            return new a0(z15, z16, zVar.f7137c, zVar.f7139e, zVar.f7140f, zVar.g, zVar.f7141h);
        }
        a0 a0Var = new a0(z15, z16, r4.d.b(cf.c.G(c0.a(obj2.getClass()))), zVar.f7139e, zVar.f7140f, zVar.g, zVar.f7141h);
        a0Var.f7029h = obj2;
        return a0Var;
    }

    public static boolean V(Parcel parcel, int i3) {
        i0(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder W(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + Z);
        return readStrongBinder;
    }

    public static int X(Parcel parcel, int i3) {
        i0(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long Y(Parcel parcel, int i3) {
        i0(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int Z(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static final void a(d1.l lVar, Function0 function0, n0.i0 i0Var, int i3) {
        i0Var.X(-569480025);
        int i10 = (i0Var.f(lVar) ? 4 : 2) | i3 | (i0Var.h(function0) ? 32 : 16);
        int i11 = 1;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            Object L = i0Var.L();
            n0.e eVar = n0.k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z10 = (i10 & 112) == 32;
            Object L2 = i0Var.L();
            if (z10 || L2 == eVar) {
                L2 = new n9.j(5, function0);
                i0Var.g0(L2);
            }
            d1.l d10 = x.g.d(lVar, fVar, null, false, null, (Function0) L2, 28);
            g0 d11 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = w.C(d10, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(d11, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            x.g.b(k7.e.B(R.drawable.arrow, i0Var, 0), w0.a(1.0f), null, a2.h.f96b, 0.0f, i0Var, 25016);
            i0Var.p(true);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.k(lVar, function0, i3, i11);
        }
    }

    public static final boolean a0(int i3, a3.i iVar, t tVar, j1.c cVar) {
        t C;
        o0.e eVar = new o0.e(new t[16]);
        if (!tVar.f3305d.B) {
            z1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new d1.k[16]);
        d1.k kVar = tVar.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar2, kVar);
        } else {
            eVar2.b(kVar2);
        }
        while (true) {
            int i10 = eVar2.f7319i;
            if (i10 == 0) {
                break;
            }
            d1.k kVar3 = (d1.k) eVar2.l(i10 - 1);
            if ((kVar3.f3308r & 1024) == 0) {
                c2.k.b(eVar2, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3307i & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof t) {
                                t tVar2 = (t) kVar3;
                                if (tVar2.B) {
                                    eVar.b(tVar2);
                                }
                            } else if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                int i11 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                eVar3.b(kVar3);
                                                kVar3 = null;
                                            }
                                            eVar3.b(kVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            kVar3 = c2.k.e(eVar3);
                        }
                    } else {
                        kVar3 = kVar3.f3310t;
                    }
                }
            }
        }
        while (eVar.f7319i != 0 && (C = C(eVar, cVar, i3)) != null) {
            if (C.K().f4612a) {
                return ((Boolean) iVar.invoke(C)).booleanValue();
            }
            if (E(i3, iVar, C, cVar)) {
                return true;
            }
            eVar.k(C);
        }
        return false;
    }

    public static final void b(Function0 function0, n0.i0 i0Var, int i3) {
        n0.i0 i0Var2;
        function0.getClass();
        i0Var.X(595939125);
        int i10 = (i0Var.h(function0) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 3) != 2)) {
            i0Var2 = i0Var;
            b0.i.a(w0.a(1.0f), null, x0.i.d(283054091, new ge.g(4, function0), i0Var), i0Var2, 3078, 6);
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new y(i3, 10, function0);
        }
    }

    public static void b0(EditorInfo editorInfo, CharSequence charSequence, int i3, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }

    public static final void c(final Function0 function0, final Function0 function02, final Function0 function03, n0.i0 i0Var, int i3) {
        n0.i0 i0Var2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        i0Var.X(36312666);
        int i10 = (i0Var.h(function0) ? 4 : 2) | i3 | (i0Var.h(function02) ? 32 : 16) | (i0Var.h(function03) ? 256 : 128);
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            i0Var2 = i0Var;
            b0.i.a(w0.a(1.0f), null, x0.i.d(-857823056, new vd.n() { // from class: p9.a
                @Override // vd.n
                public final Object a(Object obj, Object obj2, Object obj3) {
                    b0.w wVar = (b0.w) obj;
                    n0.i0 i0Var3 = (n0.i0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= i0Var3.f(wVar) ? 4 : 2;
                    }
                    if (i0Var3.O(intValue & 1, (intValue & 19) != 18)) {
                        float b10 = wVar.b();
                        float a9 = wVar.a();
                        g.b(e.B(R.drawable.mbg, i0Var3, 0), w0.a(1.0f), null, h.f95a, 0.0f, i0Var3, 25016);
                        d dVar = d1.a.f3287t;
                        b0.t tVar = b0.t.f900b;
                        i iVar = i.f3304a;
                        l g = b0.i.g(tVar.e(iVar, dVar), -(0.08f * b10), 0.02f * a9);
                        b0.z a10 = x.a(b0.g.g(a9 * 0.03f), d1.a.A, i0Var3, 48);
                        int hashCode = Long.hashCode(i0Var3.T);
                        x0.h l10 = i0Var3.l();
                        l C = w.C(g, i0Var3);
                        c2.g.f1541a.getClass();
                        c2.z zVar = f.f1533b;
                        i0Var3.Z();
                        if (i0Var3.S) {
                            i0Var3.k(zVar);
                        } else {
                            i0Var3.j0();
                        }
                        n0.h.y(a10, f.f1536e, i0Var3);
                        n0.h.y(l10, f.f1535d, i0Var3);
                        n0.h.y(Integer.valueOf(hashCode), f.f1537f, i0Var3);
                        n0.h.t(i0Var3, f.g);
                        n0.h.y(C, f.f1534c, i0Var3);
                        float f3 = b10 * 0.2f;
                        c6.f.d(w.P(R.string.play, i0Var3), R.drawable.button_or, b0.i.c(w0.f(iVar, f3), 2.6666667f), false, Function0.this, i0Var3, 0);
                        c6.f.d(w.P(R.string.records, i0Var3), R.drawable.button_yel, b0.i.c(w0.f(iVar, f3), 2.6666667f), false, function02, i0Var3, 0);
                        c6.f.d(w.P(R.string.privacy_policy, i0Var3), R.drawable.button_yel, b0.i.c(w0.f(iVar, f3), 2.6666667f), false, function03, i0Var3, 0);
                        i0Var3.p(true);
                    } else {
                        i0Var3.R();
                    }
                    return Unit.f5554a;
                }
            }, i0Var), i0Var2, 3078, 6);
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.l(function0, function02, function03, i3, 3);
        }
    }

    public static void c0(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + Z(parcel, i3));
    }

    public static final void d(final String str, final int i3, final d1.l lVar, boolean z10, final Function0 function0, n0.i0 i0Var, final int i10) {
        final boolean z11;
        n0.i0 i0Var2 = i0Var;
        str.getClass();
        function0.getClass();
        i0Var2.X(978738000);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.d(i3) ? 32 : 16) | (i0Var2.f(lVar) ? 256 : 128) | 3072 | (i0Var2.h(function0) ? 16384 : 8192);
        if (i0Var2.O(i11 & 1, (i11 & 9363) != 9362)) {
            Object L = i0Var2.L();
            n0.e eVar = n0.k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var2.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z12 = (57344 & i11) == 16384;
            Object L2 = i0Var2.L();
            if (z12 || L2 == eVar) {
                L2 = new n9.j(4, function0);
                i0Var2.g0(L2);
            }
            d1.l d10 = x.g.d(lVar, fVar, null, true, null, (Function0) L2, 24);
            z11 = true;
            g0 d11 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = w.C(d10, i0Var2);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(d11, c2.f.f1536e, i0Var2);
            n0.h.y(l10, c2.f.f1535d, i0Var2);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var2);
            n0.h.t(i0Var2, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var2);
            x.g.b(k7.e.B(i3, i0Var2, (i11 >> 3) & 14), w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var2, 25016);
            a.a.b(str, v.c(27), null, u9.a.j, u9.a.f9707i, 10.0f, null, null, null, i0Var, (i11 & 14) | 196656, 452);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.R();
            z11 = z10;
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new Function2(str, i3, lVar, z11, function0, i10) { // from class: p9.b

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f7694d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f7695e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ l f7696i;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ boolean f7697r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Function0 f7698s;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z13 = n0.h.z(1);
                    c6.f.d(this.f7694d, this.f7695e, this.f7696i, this.f7697r, this.f7698s, (n0.i0) obj, z13);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void d0(Function2 function2, ge.a aVar, ge.a aVar2) {
        try {
            ld.a b10 = md.f.b(md.f.a(function2, aVar, aVar2));
            hd.l lVar = hd.n.f4511e;
            le.b.g(Unit.f5554a, b10);
        } catch (Throwable th) {
            th = th;
            if (th instanceof ge.g0) {
                th = ((ge.g0) th).f4351d;
            }
            hd.l lVar2 = hd.n.f4511e;
            aVar2.resumeWith(cf.c.n(th));
            throw th;
        }
    }

    public static final boolean e(g1.e eVar, long j) {
        if (!eVar.f3305d.B) {
            return false;
        }
        c2.q qVar = (c2.q) c2.k.u(eVar).S.f1493d;
        if (!qVar.f1639d0.B) {
            return false;
        }
        long K = qVar.K(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (K >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (K & 4294967295L));
        long j3 = eVar.E;
        float f3 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f10 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f3) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f10;
    }

    public static final String e0(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f3 * pow;
        int i3 = (int) f10;
        if (f10 - i3 >= 0.5f) {
            i3++;
        }
        float f11 = i3 / pow;
        return max > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }

    public static final boolean f(j1.c cVar, j1.c cVar2, j1.c cVar3, int i3) {
        float f3;
        float f10;
        boolean g = g(i3, cVar3, cVar);
        float f11 = cVar3.f4917b;
        float f12 = cVar3.f4919d;
        float f13 = cVar3.f4916a;
        float f14 = cVar3.f4918c;
        float f15 = cVar.f4919d;
        float f16 = cVar.f4917b;
        float f17 = cVar.f4918c;
        float f18 = cVar.f4916a;
        if (g || !g(i3, cVar2, cVar)) {
            return false;
        }
        if (i3 == 3) {
            if (f18 < f14) {
                return true;
            }
        } else if (i3 == 4) {
            if (f17 > f13) {
                return true;
            }
        } else if (i3 == 5) {
            if (f16 < f12) {
                return true;
            }
        } else {
            if (i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return false;
            }
            if (f15 > f11) {
                return true;
            }
        }
        if (i3 == 3 || i3 == 4) {
            return true;
        }
        if (i3 == 3) {
            f3 = f18 - cVar2.f4918c;
        } else if (i3 == 4) {
            f3 = cVar2.f4916a - f17;
        } else if (i3 == 5) {
            f3 = f16 - cVar2.f4919d;
        } else {
            if (i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return false;
            }
            f3 = cVar2.f4917b - f15;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (i3 == 3) {
            f10 = f18 - f13;
        } else if (i3 == 4) {
            f10 = f14 - f17;
        } else if (i3 == 5) {
            f10 = f16 - f11;
        } else {
            if (i3 != 6) {
                i0.l("This function should only be used for 2-D focus search");
                return false;
            }
            f10 = f12 - f15;
        }
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        return f3 < f10;
    }

    public static final Boolean f0(int i3, a3.i iVar, t tVar, j1.c cVar) {
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = w.r(tVar);
                if (r9 == null) {
                    i0.l("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = r9.M().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean f02 = f0(i3, iVar, r9, cVar);
                        if (!Intrinsics.a(f02, Boolean.FALSE)) {
                            return f02;
                        }
                        if (cVar == null) {
                            if (r9.M() != i1.r.f4627e) {
                                i0.l("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            t n10 = w.n(r9);
                            if (n10 == null) {
                                i0.l("ActiveParent must have a focusedChild");
                                return null;
                            }
                            cVar = w.o(n10);
                        }
                        return Boolean.valueOf(E(i3, iVar, tVar, cVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            a2.r.p();
                            return null;
                        }
                        i0.l("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (cVar == null) {
                    cVar = w.o(r9);
                }
                return Boolean.valueOf(E(i3, iVar, tVar, cVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.K().f4612a ? (Boolean) iVar.invoke(tVar) : cVar == null ? Boolean.valueOf(D(tVar, i3, iVar)) : Boolean.valueOf(a0(i3, iVar, tVar, cVar));
                }
                a2.r.p();
                return null;
            }
        }
        return Boolean.valueOf(D(tVar, i3, iVar));
    }

    public static final boolean g(int i3, j1.c cVar, j1.c cVar2) {
        if (i3 == 3 || i3 == 4) {
            return cVar.f4919d > cVar2.f4917b && cVar.f4917b < cVar2.f4919d;
        }
        if (i3 == 5 || i3 == 6) {
            return cVar.f4918c > cVar2.f4916a && cVar.f4916a < cVar2.f4918c;
        }
        i0.l("This function should only be used for 2-D focus search");
        return false;
    }

    public static int g0(Parcel parcel) {
        int readInt = parcel.readInt();
        int Z = Z(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new d7.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i3 = Z + dataPosition;
        if (i3 >= dataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i3).length());
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i3);
        throw new d7.b(sb2.toString(), parcel);
    }

    public static String h0(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(j0(objArr[i3]));
            i10 = indexOf + 2;
            i3++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb2.append(str2);
                sb2.append(j0(objArr[i3]));
                i3++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void i0(Parcel parcel, int i3, int i10) {
        int Z = Z(parcel, i3);
        if (Z == i10) {
            return;
        }
        String hexString = Integer.toHexString(Z);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(Z).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(Z);
        throw new d7.b(v4.a.p(sb2, " (0x", hexString, ")"), parcel);
    }

    public static String j0(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String p4 = v4.a.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p4), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb2 = new StringBuilder(p4.length() + 8 + name2.length() + 1);
            n0.l.l(sb2, "<", p4, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final int k(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static void k0(Parcel parcel, int i3, int i10) {
        if (i3 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i3);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i3).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i3);
        throw new d7.b(v4.a.p(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final boolean l(x1.l lVar) {
        return !lVar.f10282h && lVar.f10279d;
    }

    public static final boolean m(x1.l lVar) {
        return lVar.f10282h && !lVar.f10279d;
    }

    public static void n(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i3);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final void o(t tVar, o0.e eVar) {
        if (!tVar.f3305d.B) {
            z1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new d1.k[16]);
        d1.k kVar = tVar.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar2, kVar);
        } else {
            eVar2.b(kVar2);
        }
        while (true) {
            int i3 = eVar2.f7319i;
            if (i3 == 0) {
                return;
            }
            d1.k kVar3 = (d1.k) eVar2.l(i3 - 1);
            if ((kVar3.f3308r & 1024) == 0) {
                c2.k.b(eVar2, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3307i & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof t) {
                                t tVar2 = (t) kVar3;
                                if (tVar2.B && !c2.k.u(tVar2).f1549d0) {
                                    if (tVar2.K().f4612a) {
                                        eVar.b(tVar2);
                                    } else {
                                        o(tVar2, eVar);
                                    }
                                }
                            } else if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                int i10 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                eVar3.b(kVar3);
                                                kVar3 = null;
                                            }
                                            eVar3.b(kVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            kVar3 = c2.k.e(eVar3);
                        }
                    } else {
                        kVar3 = kVar3.f3310t;
                    }
                }
            }
        }
    }

    public static final void p(n4.v vVar, wd.h hVar, k0 k0Var, j0 j0Var, x0.d dVar) {
        n4.i0 i0Var = vVar.g;
        i0Var.getClass();
        o4.j jVar = new o4.j((o4.i) i0Var.b(cf.c.x(o4.i.class)), hVar, k0Var, dVar);
        j0Var.getClass();
        h0.f5567d.getClass();
        vVar.f7127i.add(jVar.a());
    }

    public static boolean q(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean r9 = r(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return r9;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean r(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static Bundle s(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Z);
        return readBundle;
    }

    public static byte[] t(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Z);
        return createByteArray;
    }

    public static byte[][] u(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i10 = 0; i10 < readInt; i10++) {
            bArr[i10] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + Z);
        return bArr;
    }

    public static int[] v(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + Z);
        return createIntArray;
    }

    public static Parcelable w(Parcel parcel, int i3, Parcelable.Creator creator) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Z);
        return parcelable;
    }

    public static String x(Parcel parcel, int i3) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Z);
        return readString;
    }

    public static Object[] y(Parcel parcel, int i3, Parcelable.Creator creator) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Z);
        return createTypedArray;
    }

    public static ArrayList z(Parcel parcel, int i3, Parcelable.Creator creator) {
        int Z = Z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (Z == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + Z);
        return createTypedArrayList;
    }

    public abstract void T(e6.g gVar, e6.g gVar2);

    public abstract void U(e6.g gVar, Thread thread);

    public abstract boolean h(e6.h hVar, e6.c cVar, e6.c cVar2);

    public abstract boolean i(e6.h hVar, Object obj, Object obj2);

    public abstract boolean j(e6.h hVar, e6.g gVar, e6.g gVar2);
}
