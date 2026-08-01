package a1;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.o0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import b1.a0;
import b1.b0;
import com.appsflyer.attribution.RequestError;
import com.manholeroboramprush.cardestroy.data.database.RecipeVault_Impl;
import d.c0;
import hd.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.v;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.j1;
import n0.m2;
import s.i0;
import te.a1;
import te.b1;
import v.h0;
import v.z0;
import x3.e0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7e;

    public /* synthetic */ b(v vVar, long j) {
        this.f6d = 23;
        this.f7e = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] objArr;
        int i3;
        k5.h hVar;
        u0 u0Var;
        switch (this.f6d) {
            case 0:
                c cVar = (c) this.f7e;
                r rVar = cVar.f8d;
                Object obj = cVar.f11r;
                if (obj != null) {
                    return rVar.b(cVar, obj);
                }
                a1.e("Value should be initialized");
                return null;
            case 1:
                c6.s sVar = ((q) this.f7e).f49i;
                if (sVar != null) {
                    k0.f5575d.getClass();
                    Bundle h10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    sVar.h(h10);
                    if (!h10.isEmpty()) {
                        return h10;
                    }
                }
                return null;
            case 2:
                return o0.f((androidx.lifecycle.a1) this.f7e);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b0 b0Var = (b0) this.f7e;
                do {
                    synchronized (b0Var.g) {
                        try {
                            if (!b0Var.f947c) {
                                b0Var.f947c = true;
                                try {
                                    o0.e eVar = b0Var.f950f;
                                    Object[] objArr2 = eVar.f7317d;
                                    int i10 = eVar.f7319i;
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        a0 a0Var = (a0) objArr2[i11];
                                        i0 i0Var = a0Var.g;
                                        Function1 function1 = a0Var.f932a;
                                        Object[] objArr3 = i0Var.f8320b;
                                        long[] jArr = i0Var.f8319a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j = jArr[i12];
                                                objArr = objArr2;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8;
                                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j & 255) < 128) {
                                                            i3 = i13;
                                                            function1.invoke(objArr3[(i12 << 3) + i15]);
                                                        } else {
                                                            i3 = i13;
                                                        }
                                                        j >>= i3;
                                                        i15++;
                                                        i13 = i3;
                                                    }
                                                    if (i14 != i13) {
                                                    }
                                                }
                                                if (i12 != length) {
                                                    i12++;
                                                    objArr2 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        i0Var.b();
                                        i11++;
                                        objArr2 = objArr;
                                    }
                                    b0Var.f947c = false;
                                } catch (Throwable th) {
                                    b0Var.f947c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (b0Var.b());
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                File file = (File) ((a4.a) this.f7e).invoke();
                String name = file.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if (!(lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    kotlin.collections.i0.k(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((c6.l) this.f7e).c(":memory:");
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                b5.q qVar = (b5.q) this.f7e;
                return qVar.f1170d.c(qVar.f1171e);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d.a0((c0) this.f7e);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return this.f7e;
            case 9:
                f0.h hVar2 = (f0.h) this.f7e;
                hVar2.N = null;
                c2.k.n(hVar2);
                c2.k.m(hVar2);
                c2.k.l(hVar2);
                return Boolean.TRUE;
            case 10:
                f5.e eVar2 = (f5.e) this.f7e;
                eVar2.g().a(new f5.b(eVar2, 0));
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                return new h9.c((RecipeVault_Impl) this.f7e);
            case 12:
                c2.k.l((i0.a) this.f7e);
                return Unit.f5554a;
            case 13:
                return ((i9.c) this.f7e).f4675a.getSharedPreferences("dvnskj", 0);
            case 14:
                k5.i iVar = (k5.i) this.f7e;
                String str = iVar.f5430e;
                if (str == null || !iVar.f5432r) {
                    hVar = new k5.h(iVar.f5429d, iVar.f5430e, new d9.c(29), iVar.f5431i, iVar.f5433s);
                } else {
                    Context context = iVar.f5429d;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    hVar = new k5.h(iVar.f5429d, new File(noBackupFilesDir, str).getAbsolutePath(), new d9.c(29), iVar.f5431i, iVar.f5433s);
                }
                hVar.setWriteAheadLoggingEnabled(iVar.f5435u);
                return hVar;
            case 15:
                return new u((Object[]) this.f7e);
            case 16:
                q4.c cVar2 = ((n4.h) this.f7e).f7069v;
                if (!cVar2.f7977i) {
                    kotlin.collections.i0.l("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                } else {
                    if (cVar2.j.f737c != androidx.lifecycle.p.f707d) {
                        y0 a9 = u8.d.a(cVar2.f7970a, (w0) cVar2.f7980m.getValue(), 4);
                        wd.h a10 = wd.c0.a(q4.b.class);
                        c6.n nVar = (c6.n) a9.f748a;
                        String b10 = a10.b();
                        if (b10 != null) {
                            u0Var = nVar.b(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
                        } else {
                            a1.e("Local and anonymous classes can not be ViewModels");
                            u0Var = null;
                        }
                        return ((q4.b) u0Var).f7969b;
                    }
                    kotlin.collections.i0.l("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return null;
            case 17:
                return cf.c.o((Context) this.f7e);
            case 18:
                List list = (List) ((m2) this.f7e).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.a(((n4.h) obj2).f7063e.f7114d, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 19:
                pe.d dVar = (pe.d) this.f7e;
                re.f r9 = g8.b.r("kotlinx.serialization.Polymorphic", re.c.g, new re.e[0], new d(15, dVar));
                ce.b bVar = dVar.f7706a;
                bVar.getClass();
                return new re.b(r9, bVar);
            case 20:
                return ((te.k0) ((ArrayList) this.f7e).get(0)).f9395a.f9395a.b();
            case 21:
                return new n4.q((String) this.f7e);
            case 22:
                re.f fVar = (re.f) this.f7e;
                return Integer.valueOf(b1.e(fVar, fVar.f8252h));
            case 23:
                return ((k1.m) ((v) this.f7e)).f5334h;
            case 24:
                h0 h0Var = (h0) this.f7e;
                z0 z0Var = h0Var.f9811s;
                h0Var.f9812t = z0Var != null ? ((Number) z0Var.f9926l.getValue()).longValue() : 0L;
                return Unit.f5554a;
            case 25:
                v2.b bVar2 = (v2.b) this.f7e;
                j1 j1Var = bVar2.f9950i;
                if (((j1.e) j1Var.getValue()).f4927a == 9205357640488583168L || j1.e.c(((j1.e) j1Var.getValue()).f4927a)) {
                    return null;
                }
                k1.m mVar = bVar2.f9948d;
                long j3 = ((j1.e) j1Var.getValue()).f4927a;
                return mVar.f5334h;
            case 26:
                ((x.l) this.f7e).I.invoke();
                return Boolean.TRUE;
            case 27:
                File file2 = (File) this.f7e;
                synchronized (e0.f10353d) {
                    e0.f10352c.remove(file2.getAbsolutePath());
                }
                return Unit.f5554a;
            default:
                z4.u uVar = ((z4.f) this.f7e).f10736a;
                return Boolean.valueOf(!uVar.p() || uVar.s());
        }
    }

    public /* synthetic */ b(int i3, Object obj) {
        this.f6d = i3;
        this.f7e = obj;
    }
}
