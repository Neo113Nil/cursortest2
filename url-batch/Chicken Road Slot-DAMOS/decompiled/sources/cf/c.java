package cf;

import a2.h;
import a4.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.window.BackEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.a1;
import b0.i;
import b0.p;
import b0.t;
import b0.t0;
import b0.w;
import b0.w0;
import b0.x;
import b1.y;
import c1.l;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.se;
import d1.d;
import d2.o;
import e5.e;
import f8.s0;
import ge.a0;
import ge.q;
import ge.v1;
import hd.m;
import hd.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k1.v;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.u0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md.f;
import n0.k;
import n0.l0;
import n0.s1;
import o3.b0;
import p2.s;
import te.b1;
import te.d0;
import te.i1;
import te.j1;
import te.k0;
import te.k1;
import te.q1;
import te.r0;
import vd.n;
import wd.c0;
import wd.g0;
import z4.u;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2038e = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f2039i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2040d;

    public /* synthetic */ c(int i3) {
        this.f2040d = i3;
    }

    public static int A(int i3) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i3 <= 0) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("x (");
            sb2.append(i3);
            sb2.append(") must be > 0");
            throw new IllegalArgumentException(sb2.toString());
        }
        switch (e8.a.f3955a[roundingMode.ordinal()]) {
            case 1:
                if (!((i3 > 0) & (((i3 + (-1)) & i3) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i3 - 1);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i3))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i3);
    }

    public static final pe.a B(ce.b bVar, ArrayList arrayList, Function0 function0) {
        pe.a cVar;
        pe.a j1Var;
        bVar.getClass();
        if (bVar.equals(c0.a(Collection.class)) || bVar.equals(c0.a(List.class)) || bVar.equals(c0.a(List.class)) || bVar.equals(c0.a(ArrayList.class))) {
            cVar = new te.c((pe.a) arrayList.get(0), 0);
        } else if (bVar.equals(c0.a(HashSet.class))) {
            cVar = new te.c((pe.a) arrayList.get(0), 1);
        } else if (bVar.equals(c0.a(Set.class)) || bVar.equals(c0.a(Set.class)) || bVar.equals(c0.a(LinkedHashSet.class))) {
            cVar = new te.c((pe.a) arrayList.get(0), 2);
        } else if (bVar.equals(c0.a(HashMap.class))) {
            cVar = new d0((pe.a) arrayList.get(0), (pe.a) arrayList.get(1), 0);
        } else if (bVar.equals(c0.a(Map.class)) || bVar.equals(c0.a(Map.class)) || bVar.equals(c0.a(LinkedHashMap.class))) {
            cVar = new d0((pe.a) arrayList.get(0), (pe.a) arrayList.get(1), 1);
        } else {
            if (bVar.equals(c0.a(Map.Entry.class))) {
                pe.a aVar = (pe.a) arrayList.get(0);
                pe.a aVar2 = (pe.a) arrayList.get(1);
                aVar.getClass();
                aVar2.getClass();
                j1Var = new r0(aVar, aVar2, 0);
            } else if (bVar.equals(c0.a(Pair.class))) {
                pe.a aVar3 = (pe.a) arrayList.get(0);
                pe.a aVar4 = (pe.a) arrayList.get(1);
                aVar3.getClass();
                aVar4.getClass();
                j1Var = new r0(aVar3, aVar4, 1);
            } else if (bVar.equals(c0.a(r.class))) {
                pe.a aVar5 = (pe.a) arrayList.get(0);
                pe.a aVar6 = (pe.a) arrayList.get(1);
                pe.a aVar7 = (pe.a) arrayList.get(2);
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                cVar = new q1(aVar5, aVar6, aVar7);
            } else if (a.a.D(bVar).isArray()) {
                Object invoke = function0.invoke();
                invoke.getClass();
                pe.a aVar8 = (pe.a) arrayList.get(0);
                aVar8.getClass();
                j1Var = new j1((ce.b) invoke, aVar8);
            } else {
                cVar = null;
            }
            cVar = j1Var;
        }
        if (cVar != null) {
            return cVar;
        }
        pe.a[] aVarArr = (pe.a[]) arrayList.toArray(new pe.a[0]);
        return b1.d(bVar, (pe.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(u uVar, boolean z10, boolean z11, Function1 function1, nd.c cVar) {
        e5.c cVar2;
        int i3;
        CoroutineContext p4;
        u uVar2;
        boolean z12;
        Function1 function12;
        if (cVar instanceof e5.c) {
            cVar2 = (e5.c) cVar;
            int i10 = cVar2.f3888t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f3888t = i10 - Integer.MIN_VALUE;
                e5.c cVar3 = cVar2;
                Object obj = cVar3.f3887s;
                md.a aVar = md.a.f6622d;
                i3 = cVar3.f3888t;
                if (i3 != 0) {
                    M(obj);
                    if (uVar.p() && uVar.s() && uVar.q()) {
                        e eVar = new e(function1, null, uVar, z11, z10);
                        cVar3.f3888t = 1;
                        Object v10 = uVar.v(z10, eVar, cVar3);
                        if (v10 != aVar) {
                            return v10;
                        }
                    } else {
                        cVar3.f3883d = uVar;
                        cVar3.f3884e = function1;
                        cVar3.f3885i = z10;
                        cVar3.f3886r = z11;
                        cVar3.f3888t = 2;
                        z4.c0 c0Var = (z4.c0) cVar3.getContext().m(z4.c0.f10729e);
                        CoroutineContext coroutineContext = c0Var != null ? c0Var.f10730d : null;
                        if (!uVar.p()) {
                            le.d dVar = uVar.f10834a;
                            if (dVar == null) {
                                Intrinsics.f("coroutineScope");
                                throw null;
                            }
                            CoroutineContext coroutineContext2 = dVar.f5969d;
                            if (coroutineContext == null) {
                                coroutineContext = g.f5592d;
                            }
                            p4 = coroutineContext2.p(coroutineContext);
                        } else if (coroutineContext != null) {
                            le.d dVar2 = uVar.f10834a;
                            if (dVar2 == null) {
                                Intrinsics.f("coroutineScope");
                                throw null;
                            }
                            p4 = dVar2.f5969d.p(coroutineContext);
                        } else if (z11) {
                            p4 = uVar.f10835b;
                            if (p4 == null) {
                                Intrinsics.f("transactionContext");
                                throw null;
                            }
                        } else {
                            le.d dVar3 = uVar.f10834a;
                            if (dVar3 == null) {
                                Intrinsics.f("coroutineScope");
                                throw null;
                            }
                            p4 = dVar3.f5969d;
                        }
                        if (p4 != aVar) {
                            uVar2 = uVar;
                            z12 = z11;
                            obj = p4;
                            function12 = function1;
                        }
                    }
                }
                if (i3 == 1) {
                    M(obj);
                    return obj;
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z13 = cVar3.f3886r;
                z10 = cVar3.f3885i;
                Function1 function13 = cVar3.f3884e;
                u uVar3 = cVar3.f3883d;
                M(obj);
                z12 = z13;
                function12 = function13;
                uVar2 = uVar3;
                e5.b bVar = new e5.b(function12, null, uVar2, z10, z12);
                cVar3.f3883d = null;
                cVar3.f3884e = null;
                cVar3.f3888t = 3;
                Object B = a0.B((CoroutineContext) obj, bVar, cVar3);
                return B != aVar ? aVar : B;
            }
        }
        cVar2 = new e5.c(cVar);
        e5.c cVar32 = cVar2;
        Object obj2 = cVar32.f3887s;
        md.a aVar2 = md.a.f6622d;
        i3 = cVar32.f3888t;
        if (i3 != 0) {
        }
        e5.b bVar2 = new e5.b(function12, null, uVar2, z10, z12);
        cVar32.f3883d = null;
        cVar32.f3884e = null;
        cVar32.f3888t = 3;
        Object B2 = a0.B((CoroutineContext) obj2, bVar2, cVar32);
        if (B2 != aVar2) {
        }
    }

    public static final void D(Bundle bundle, String str, List list) {
        list.getClass();
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final Cursor E(u uVar, z zVar) {
        uVar.getClass();
        uVar.a();
        uVar.b();
        return uVar.k().G().o(zVar);
    }

    public static d4.b F(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                j = -1;
                break;
            }
            int i11 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j3; i12++) {
                int i13 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    duplicate.position((int) (j10 + j));
                    d4.b bVar = new d4.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f3619r = duplicate;
                    bVar.f3616d = position;
                    int i14 = position - duplicate.getInt(position);
                    bVar.f3617e = i14;
                    bVar.f3618i = ((ByteBuffer) bVar.f3619r).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final pe.a G(ce.b bVar) {
        bVar.getClass();
        pe.a H = H(bVar);
        if (H != null) {
            return H;
        }
        b1.h(bVar);
        throw null;
    }

    public static final pe.a H(ce.b bVar) {
        bVar.getClass();
        pe.a d10 = b1.d(bVar, new pe.a[0]);
        return d10 == null ? (pe.a) i1.f9389a.get(bVar) : d10;
    }

    public static final pe.a I(se seVar, k0 k0Var) {
        seVar.getClass();
        k0Var.getClass();
        return g8.b.I(seVar, k0Var, false);
    }

    public static final ArrayList J(se seVar, List list, boolean z10) {
        seVar.getClass();
        list.getClass();
        if (!z10) {
            ArrayList arrayList = new ArrayList(kotlin.collections.z.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pe.a I = I(seVar, (k0) it.next());
                if (I == null) {
                    return null;
                }
                arrayList.add(I);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.z.j(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            k0 k0Var = (k0) it2.next();
            k0Var.getClass();
            pe.a I2 = g8.b.I(seVar, k0Var, true);
            if (I2 == null) {
                b1.h(b1.g(k0Var));
                throw null;
            }
            arrayList2.add(I2);
        }
        return arrayList2;
    }

    public static final Object K(le.r rVar, boolean z10, le.r rVar2, Function2 function2) {
        Object qVar;
        Object T;
        try {
            if (function2 instanceof nd.a) {
                g0.c(2, function2);
                qVar = function2.invoke(rVar2, rVar);
            } else {
                qVar = f.c(function2, rVar2, rVar);
            }
        } catch (ge.g0 e2) {
            Throwable th = e2.f4351d;
            rVar.S(new q(th, false));
            throw th;
        } catch (Throwable th2) {
            qVar = new q(th2, false);
        }
        md.a aVar = md.a.f6622d;
        if (qVar == aVar || (T = rVar.T(qVar)) == a0.f4327e) {
            return aVar;
        }
        rVar.i0();
        if (!(T instanceof q)) {
            return a0.A(T);
        }
        if (!z10) {
            Throwable th3 = ((q) T).f4394a;
            if ((th3 instanceof v1) && ((v1) th3).f4408d == rVar) {
                if (qVar instanceof q) {
                    throw ((q) qVar).f4394a;
                }
                return qVar;
            }
        }
        throw ((q) T).f4394a;
    }

    public static void L(String str, int i3, Function0 function0, int i10) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            i3 = -1;
        }
        kd.a aVar = new kd.a(function0);
        if (i3 > 0) {
            aVar.setPriority(i3);
        }
        if (str != null) {
            aVar.setName(str);
        }
        aVar.start();
    }

    public static final void M(Object obj) {
        if (obj instanceof m) {
            throw ((m) obj).f4510d;
        }
    }

    public static String N(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c1.b, c1.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList O(q0.g gVar, int i3, Integer num) {
        ?? lVar = new l(gVar);
        int q3 = gVar.q(i3);
        q0.b a9 = gVar.a(i3);
        while (i3 >= 0) {
            lVar.m(gVar.i(i3), gVar.k(i3) ? gVar.p(gVar.f7735b, i3) : k.f6729a, gVar.f7734a.h(i3), num);
            if (q3 >= 0) {
                q0.b bVar = a9;
                a9 = gVar.a(q3);
                i3 = q3;
                q3 = gVar.q(q3);
                num = bVar;
            } else {
                i3 = q3;
                num = a9;
            }
        }
        return (ArrayList) lVar.f1478d;
    }

    public static void P(Parcel parcel, int i3, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeBundle(bundle);
        a0(parcel, Z);
    }

    public static void Q(Parcel parcel, int i3, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeByteArray(bArr);
        a0(parcel, Z);
    }

    public static void R(Parcel parcel, int i3, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        a0(parcel, Z);
    }

    public static void S(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        a0(parcel, Z);
    }

    public static void T(Parcel parcel, int i3, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeIntArray(iArr);
        a0(parcel, Z);
    }

    public static void U(Parcel parcel, int i3, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcelable.writeToParcel(parcel, i10);
        a0(parcel, Z);
    }

    public static void V(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeString(str);
        a0(parcel, Z);
    }

    public static void W(Parcel parcel, int i3, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int Z = Z(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        a0(parcel, Z);
    }

    public static void X(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int Z = Z(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        a0(parcel, Z);
    }

    public static void Y(Parcel parcel, int i3, int i10) {
        parcel.writeInt(i3 | (i10 << 16));
    }

    public static int Z(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void a0(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    public static final e1.d b(String str) {
        return new e1.d(u0.b(str));
    }

    public static final void c(final int i3, final Function0 function0, final Function0 function02, n0.i0 i0Var, int i10) {
        function0.getClass();
        function02.getClass();
        i0Var.X(-589163513);
        int i11 = (i0Var.d(i3) ? 4 : 2) | i10 | (i0Var.h(function0) ? 32 : 16) | (i0Var.h(function02) ? 256 : 128);
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            x.g.b(k7.e.B(R.drawable.gbg2, i0Var, 0), w0.a(1.0f), null, h.f98d, 0.0f, i0Var, 25016);
            i.a(x.g.c(w0.a(1.0f), u9.a.g, v.f5351b), d1.a.f3286s, x0.i.d(-885536015, new n() { // from class: o9.a
                @Override // vd.n
                public final Object a(Object obj, Object obj2, Object obj3) {
                    w wVar = (w) obj;
                    n0.i0 i0Var2 = (n0.i0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= i0Var2.f(wVar) ? 4 : 2;
                    }
                    if (i0Var2.O(intValue & 1, (intValue & 19) != 18)) {
                        float b10 = wVar.b();
                        float a9 = wVar.a();
                        d1.i iVar = d1.i.f3304a;
                        d1.l c10 = i.c(w0.f(iVar, 0.42f * b10), 2.1176472f);
                        d dVar = d1.a.f3286s;
                        a2.g0 d10 = p.d(dVar);
                        int hashCode = Long.hashCode(i0Var2.T);
                        x0.h l10 = i0Var2.l();
                        d1.l C = z4.w.C(c10, i0Var2);
                        c2.g.f1541a.getClass();
                        c2.z zVar = c2.f.f1533b;
                        i0Var2.Z();
                        if (i0Var2.S) {
                            i0Var2.k(zVar);
                        } else {
                            i0Var2.j0();
                        }
                        c2.e eVar = c2.f.f1536e;
                        n0.h.y(d10, eVar, i0Var2);
                        c2.e eVar2 = c2.f.f1535d;
                        n0.h.y(l10, eVar2, i0Var2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        c2.e eVar3 = c2.f.f1537f;
                        n0.h.y(valueOf, eVar3, i0Var2);
                        c2.d dVar2 = c2.f.g;
                        n0.h.t(i0Var2, dVar2);
                        c2.e eVar4 = c2.f.f1534c;
                        n0.h.y(C, eVar4, i0Var2);
                        x.g.b(k7.e.B(R.drawable.score, i0Var2, 0), w0.a(1.0f), null, h.f98d, 0.0f, i0Var2, 25016);
                        p1.b B = k7.e.B(R.drawable.game_over, i0Var2, 0);
                        d1.l c11 = i.c(w0.f(iVar, 0.26f * b10), 1.55f);
                        d dVar3 = d1.a.f3283e;
                        t tVar = t.f900b;
                        x.g.b(B, i.h(0.0f, -(0.16f * a9), 1, tVar.e(c11, dVar3)), null, h.f96b, 0.0f, i0Var2, 24632);
                        cf.c.j(i3, tVar.e(i.c(w0.f(iVar, 0.13f * b10), 2.0338984f), dVar), i0Var2, 0);
                        d1.l h10 = i.h(0.0f, a9 * 0.03f, 1, tVar.e(iVar, d1.a.f3289v));
                        t0 a10 = b0.r0.a(b0.g.g(0.025f * b10), i0Var2, 48);
                        int hashCode2 = Long.hashCode(i0Var2.T);
                        x0.h l11 = i0Var2.l();
                        d1.l C2 = z4.w.C(h10, i0Var2);
                        i0Var2.Z();
                        if (i0Var2.S) {
                            i0Var2.k(zVar);
                        } else {
                            i0Var2.j0();
                        }
                        n0.h.y(a10, eVar, i0Var2);
                        n0.h.y(l11, eVar2, i0Var2);
                        n0.h.y(Integer.valueOf(hashCode2), eVar3, i0Var2);
                        n0.h.t(i0Var2, dVar2);
                        n0.h.y(C2, eVar4, i0Var2);
                        float f3 = b10 * 0.17f;
                        cf.c.i(z4.w.P(R.string.back_to_menu, i0Var2), R.drawable.button_red, i.c(w0.f(iVar, f3), 2.5f), function0, i0Var2, 0);
                        cf.c.i(z4.w.P(R.string.play_again, i0Var2), R.drawable.button_or, i.c(w0.f(iVar, f3), 2.5f), function02, i0Var2, 0);
                        i0Var2.p(true);
                        i0Var2.p(true);
                    } else {
                        i0Var2.R();
                    }
                    return Unit.f5554a;
                }
            }, i0Var), i0Var, 3120, 4);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n0.r(i3, function0, function02, i10);
        }
    }

    public static final void d(q9.a aVar, n0.i0 i0Var, int i3) {
        q9.a aVar2;
        i0Var.X(2035905740);
        int i10 = i3 | 2;
        int i11 = 2;
        int i12 = 1;
        if (i0Var.O(i10 & 1, (i10 & 3) != 2)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                a1 a9 = l4.a.a(i0Var);
                if (a9 == null) {
                    i0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                aVar2 = (q9.a) z4.w.L(c0.a(q9.a.class), a9.f(), k7.e.n(a9), xe.b.a(i0Var));
            } else {
                i0Var.R();
                aVar2 = aVar;
            }
            i0Var.q();
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f465b);
            Unit unit = Unit.f5554a;
            boolean h10 = i0Var.h(aVar2) | i0Var.h(context);
            Object L = i0Var.L();
            n0.e eVar = k.f6729a;
            ld.a aVar3 = null;
            if (h10 || L == eVar) {
                L = new a3.t(aVar2, context, aVar3, 17);
                i0Var.g0(L);
            }
            n0.h.f(unit, (Function2) L, i0Var);
            Object L2 = i0Var.L();
            if (L2 == eVar) {
                L2 = new je.v(i11, i12, aVar3);
                i0Var.g0(L2);
            }
            n0.h.f(unit, (Function2) L2, i0Var);
            d1.l c10 = h1.d.c(w0.a(1.0f), k7.e.B(R.drawable.notarobot_bg, i0Var, 0), h.f95a, 0.0f, null, 54);
            b0.z a10 = x.a(b0.g.f843b, d1.a.A, i0Var, 48);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = z4.w.C(c10, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(a10, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            i.b(b0.a0.a(0.65f), i0Var);
            p1.b B = k7.e.B(R.drawable.notarobot_btn, i0Var, 0);
            d1.l b10 = w0.b(0.2f);
            Object L3 = i0Var.L();
            if (L3 == eVar) {
                L3 = new z.f();
                i0Var.g0(L3);
            }
            z.f fVar = (z.f) L3;
            boolean h11 = i0Var.h(aVar2);
            Object L4 = i0Var.L();
            if (h11 || L4 == eVar) {
                o oVar = new o(0, aVar2, q9.a.class, "onNotARobotClick", "onNotARobotClick()V", 0, 5);
                i0Var.g0(oVar);
                L4 = oVar;
            }
            x.g.b(B, x.g.d(b10, fVar, null, false, null, (Function0) ((wd.m) L4), 28), null, h.f97c, 0.0f, i0Var, 24632);
            i.b(b0.a0.a(0.35f), i0Var);
            i0Var.p(true);
        } else {
            i0Var.R();
            aVar2 = aVar;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new y(i3, 9, aVar2);
        }
    }

    public static final long e(int i3) {
        long j = (i3 << 32) | (0 & 4294967295L);
        int i10 = v1.a.f9946p;
        return j;
    }

    public static final void f(Boolean bool, Object obj, androidx.lifecycle.u uVar, Function1 function1, n0.i0 i0Var, int i3) {
        int i10;
        i0Var.X(696924721);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(bool) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.h(function1) ? 2048 : 1024;
        }
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                uVar = (androidx.lifecycle.u) i0Var.j(i4.e.f4646a);
            } else {
                i0Var.R();
            }
            int i11 = i10 & (-897);
            i0Var.q();
            boolean f3 = i0Var.f(bool) | i0Var.f(obj) | i0Var.f(uVar);
            Object L = i0Var.L();
            if (f3 || L == k.f6729a) {
                L = new i4.d(uVar.g());
                i0Var.g0(L);
            }
            g(uVar, (i4.d) L, function1, i0Var, (i11 >> 3) & 896);
        } else {
            i0Var.R();
        }
        androidx.lifecycle.u uVar2 = uVar;
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new i4.b(bool, obj, uVar2, function1, i3, 0);
        }
    }

    public static final void g(androidx.lifecycle.u uVar, i4.d dVar, Function1 function1, n0.i0 i0Var, int i3) {
        int i10;
        i0Var.X(228371534);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(uVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(dVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.h(function1) ? 256 : 128;
        }
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            boolean h10 = i0Var.h(dVar) | ((i10 & 896) == 256) | i0Var.h(uVar);
            Object L = i0Var.L();
            if (h10 || L == k.f6729a) {
                L = new a1.g(uVar, dVar, function1, 1);
                i0Var.g0(L);
            }
            n0.h.c(uVar, dVar, (Function1) L, i0Var);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new a1.h(uVar, dVar, function1, i3, 1);
        }
    }

    public static final s4.b h(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new s4.b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void i(String str, int i3, d1.l lVar, Function0 function0, n0.i0 i0Var, int i10) {
        n0.i0 i0Var2 = i0Var;
        i0Var2.X(-1099742844);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.d(i3) ? 32 : 16) | (i0Var2.f(lVar) ? 256 : 128) | (i0Var2.h(function0) ? 2048 : 1024);
        if (i0Var2.O(i11 & 1, (i11 & 1171) != 1170)) {
            Object L = i0Var2.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var2.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z10 = (i11 & 7168) == 2048;
            Object L2 = i0Var2.L();
            if (z10 || L2 == eVar) {
                L2 = new n9.j(2, function0);
                i0Var2.g0(L2);
            }
            d1.l d10 = x.g.d(lVar, fVar, null, false, null, (Function0) L2, 28);
            a2.g0 d11 = p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = z4.w.C(d10, i0Var2);
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
            x.g.b(k7.e.B(i3, i0Var2, (i11 >> 3) & 14), w0.a(1.0f), null, h.f98d, 0.0f, i0Var2, 25016);
            a.a.b(str, z4.v.c(25), null, u9.a.j, u9.a.f9707i, 5.0f, null, null, null, i0Var, (i11 & 14) | 196656, 452);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new o9.b(str, i3, lVar, function0, i10, 0);
        }
    }

    public static final void j(int i3, d1.l lVar, n0.i0 i0Var, int i10) {
        int i11;
        n0.i0 i0Var2 = i0Var;
        i0Var2.X(139865142);
        int i12 = i10 | (i0Var2.d(i3) ? 4 : 2) | (i0Var2.f(lVar) ? 32 : 16);
        if (i0Var2.O(i12 & 1, (i12 & 19) != 18)) {
            a2.g0 d10 = p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = z4.w.C(lVar, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(d10, c2.f.f1536e, i0Var2);
            n0.h.y(l10, c2.f.f1535d, i0Var2);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var2);
            n0.h.t(i0Var2, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var2);
            p1.b B = k7.e.B(R.drawable.score, i0Var2, 0);
            d1.l a9 = w0.a(1.0f);
            a2.g gVar = h.f98d;
            x.g.b(B, a9, null, gVar, 0.0f, i0Var2, 25016);
            float f3 = 30;
            x.g.b(k7.e.B(R.drawable.record_icon, i0Var2, 0), i.c(i.h(-f3, 0.0f, 2, w0.a(0.2f)), 1.0f), null, gVar, 0.0f, i0Var2, 25016);
            i11 = 1;
            a.a.b(String.valueOf(i3), z4.v.c(30), i.j(f3), 0L, 0L, 6.0f, null, null, null, i0Var, 197040, 472);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i11 = 1;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.i(i3, lVar, i10, i11);
        }
    }

    public static final j1.c k(long j, long j3) {
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new j1.c(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [c1.b, c1.l] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [q0.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(q0.k kVar, Integer num, int i3, Integer num2) {
        int i10;
        int s3;
        s.d0 d0Var;
        if (kVar.f7780w || kVar.p() == 0) {
            return j0.f5574d;
        }
        ?? lVar = new l(kVar);
        if (num2 != null) {
            i10 = num2.intValue();
        } else {
            i10 = kVar.f7779v;
            if (i10 < 0) {
                i10 = kVar.E(kVar.f7761b, i3);
            }
        }
        if (num == 0) {
            int N = kVar.f7767i - kVar.N(kVar.f7761b, kVar.r(i3));
            s.w wVar = kVar.f7776s;
            num = Integer.valueOf(N + ((wVar == null || (d0Var = (s.d0) wVar.b(i3)) == null) ? 0 : d0Var.f8285b));
        }
        int r9 = kVar.r(i3) * 5;
        int[] iArr = kVar.f7761b;
        if (r9 < iArr.length) {
            s3 = kVar.s(i3);
        } else {
            int E = i10 >= 0 ? kVar.E(iArr, i10) : i10;
            s3 = kVar.s(i10);
            int i11 = i10;
            i10 = E;
            i3 = i11;
        }
        while (i3 >= 0) {
            lVar.m(s3, (kVar.f7761b[(kVar.r(i3) * 5) + 1] & 536870912) != 0 ? kVar.t(i3) : k.f6729a, kVar.O(i3), num);
            num = kVar.b(i3);
            if (i10 >= 0) {
                int E2 = kVar.E(kVar.f7761b, i10);
                s3 = kVar.s(i10);
                int i12 = i10;
                i10 = E2;
                i3 = i12;
            } else {
                i3 = i10;
            }
        }
        return (ArrayList) lVar.f1478d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(i5.c cVar, Throwable th) {
        boolean isTerminated;
        if (cVar != 0) {
            if (th != null) {
                try {
                    n0.l.k(cVar);
                    return;
                } catch (Throwable th2) {
                    hd.b.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (!(cVar instanceof ExecutorService)) {
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                } else if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else {
                    if (!(cVar instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) cVar).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) cVar;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final m n(Throwable th) {
        th.getClass();
        return new m(th);
    }

    public static final n4.x o(Context context) {
        context.getClass();
        n4.x xVar = new n4.x(context);
        q4.h hVar = xVar.f7130b;
        n4.i0 i0Var = hVar.f8010s;
        i0Var.a(new o4.g(i0Var));
        n4.i0 i0Var2 = hVar.f8010s;
        i0Var2.a(new o4.i());
        i0Var2.a(new o4.o());
        return xVar;
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = o3.c0.f7378a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = b0.f7367d;
            b0 b0Var = (b0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (b0Var == null) {
                b0Var = new b0();
                b0Var.f7368a = null;
                b0Var.f7369b = null;
                b0Var.f7370c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, b0Var);
            }
            WeakReference weakReference2 = b0Var.f7370c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                b0Var.f7370c = new WeakReference(keyEvent);
                if (b0Var.f7369b == null) {
                    b0Var.f7369b = new SparseArray();
                }
                SparseArray sparseArray = b0Var.f7369b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    i0.j();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(int i3, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i3 / i10;
        int i12 = i3 - (i10 * i11);
        if (i12 != 0) {
            int i13 = ((i3 ^ i10) >> 31) | 1;
            switch (e8.a.f3955a[roundingMode.ordinal()]) {
                case 1:
                    if (i12 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                    return i11;
                case j.INTEGER_FIELD_NUMBER /* 3 */:
                    break;
                case j.LONG_FIELD_NUMBER /* 4 */:
                    return i11 + i13;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    int abs = Math.abs(i12);
                    int abs2 = abs - (Math.abs(i10) - abs);
                    if (abs2 == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    }
                    return i11;
                default:
                    throw new AssertionError();
            }
        }
        return i11;
    }

    public static final void r(i5.a aVar) {
        aVar.getClass();
        id.d b10 = kotlin.collections.x.b();
        i5.c K = aVar.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (K.E()) {
            try {
                b10.add(K.k(0));
            } finally {
            }
        }
        m(K, null);
        ListIterator listIterator = kotlin.collections.x.a(b10).listIterator(0);
        while (true) {
            b1.d0 d0Var = (b1.d0) listIterator;
            if (!d0Var.hasNext()) {
                return;
            }
            String str = (String) d0Var.next();
            if (kotlin.text.o.h(str, "room_fts_content_sync_")) {
                g8.b.y(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final boolean s(long j, long j3) {
        return j == j3;
    }

    public static final Integer t(q0.g gVar, n0.o oVar, int i3, int i10) {
        Integer t6;
        int[] iArr = gVar.f7735b;
        while (true) {
            if (i3 >= i10) {
                return null;
            }
            int i11 = iArr[(i3 * 5) + 3] + i3;
            if (gVar.j(i3) && gVar.i(i3) == 206 && Intrinsics.a(gVar.p(iArr, i3), n0.m.f6755e)) {
                Object h10 = gVar.h(i3, 0);
                l0 l0Var = h10 instanceof l0 ? (l0) h10 : null;
                Object obj = l0Var != null ? l0Var.f6745a : null;
                n0.g0 g0Var = obj instanceof n0.g0 ? (n0.g0) obj : null;
                if (g0Var != null && g0Var.f6682d.equals(oVar)) {
                    return Integer.valueOf(i3);
                }
            }
            if (gVar.d(i3) && (t6 = t(gVar, oVar, i3 + 1, i11)) != null) {
                return Integer.valueOf(t6.intValue());
            }
            i3 = i11;
        }
    }

    public static final int u(s sVar, int i3) {
        boolean z10 = sVar.compareTo(s.f7644r) >= 0;
        boolean z11 = i3 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final ce.b v(re.e eVar) {
        eVar.getClass();
        if (eVar instanceof re.b) {
            return ((re.b) eVar).f8236b;
        }
        if (eVar instanceof k1) {
            return v(((k1) eVar).f9396a);
        }
        return null;
    }

    public static final String[] w(e1.m mVar) {
        mVar.getClass();
        return (String[]) ((e1.d) mVar).f3780b.toArray(new String[0]);
    }

    public static String x(Class cls) {
        LinkedHashMap linkedHashMap = n4.i0.f7073b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            n4.g0 g0Var = (n4.g0) cls.getAnnotation(n4.g0.class);
            str = g0Var != null ? g0Var.value() : null;
            if (str == null || str.length() <= 0) {
                a2.r.h("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final long y(d9.c cVar) {
        DragEvent dragEvent = (DragEvent) cVar.f3701e;
        float x10 = dragEvent.getX();
        float y3 = dragEvent.getY();
        return (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y3) & 4294967295L);
    }

    public static boolean z(byte b10) {
        return b10 > -65;
    }

    public String toString() {
        switch (this.f2040d) {
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return ((s0) this).f4179r.toString();
            default:
                return super.toString();
        }
    }
}
