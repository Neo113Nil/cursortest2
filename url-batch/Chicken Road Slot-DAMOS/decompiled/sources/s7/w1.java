package s7;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w1 extends q5 implements h0 {

    /* renamed from: d, reason: collision with root package name */
    public final j4 f9082d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f9083e;

    /* renamed from: f, reason: collision with root package name */
    public String f9084f;

    public w1(j4 j4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        c7.c0.g(j4Var);
        this.f9082d = j4Var;
        this.f9084f = null;
    }

    @Override // s7.h0
    public final byte[] A(String str, u uVar) {
        c7.c0.d(str);
        c7.c0.g(uVar);
        F(str, true);
        j4 j4Var = this.f9082d;
        t0 t0Var = j4Var.b().A;
        q1 q1Var = j4Var.f8771z;
        p0 p0Var = q1Var.f8941x;
        String str2 = uVar.f9035d;
        t0Var.b(p0Var.a(str2), "Log and bundle. event");
        j4Var.f().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) j4Var.d().A(new j1(this, uVar, str)).get();
            if (bArr == null) {
                j4Var.b().f9050t.b(v0.A(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            j4Var.f().getClass();
            j4Var.b().A.d("Log and bundle processed. event, size, time_ms", q1Var.f8941x.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            j4Var.b().f9050t.d("Failed to log and bundle. appId, event, error", v0.A(str), q1Var.f8941x.a(str2), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            j4Var.b().f9050t.d("Failed to log and bundle. appId, event, error", v0.A(str), q1Var.f8941x.a(str2), e);
            return null;
        }
    }

    @Override // s7.h0
    public final void B(u uVar, r4 r4Var) {
        c7.c0.g(uVar);
        E(r4Var);
        G(new cf((Object) this, (d7.a) uVar, (Object) r4Var, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        boolean z10;
        List list;
        j4 j4Var = this.f9082d;
        ArrayList arrayList = null;
        j0 j0Var = null;
        l0 l0Var = null;
        switch (i3) {
            case 1:
                u uVar = (u) r5.a(parcel, u.CREATOR);
                r4 r4Var = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                B(uVar, r4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                m4 m4Var = (m4) r5.a(parcel, m4.CREATOR);
                r4 r4Var2 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                x(m4Var, r4Var2);
                parcel2.writeNoException();
                return true;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                r4 r4Var3 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                a(r4Var3);
                parcel2.writeNoException();
                return true;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                u uVar2 = (u) r5.a(parcel, u.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                r5.d(parcel);
                c7.c0.g(uVar2);
                c7.c0.d(readString);
                F(readString, true);
                G(new cf((Object) this, (d7.a) uVar2, (Object) readString, 6));
                parcel2.writeNoException();
                return true;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r4 r4Var4 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                p(r4Var4);
                parcel2.writeNoException();
                return true;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                r4 r4Var5 = (r4) r5.a(parcel, r4.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                r5.d(parcel);
                E(r4Var5);
                String str = r4Var5.f8976d;
                c7.c0.g(str);
                try {
                    List<n4> list2 = (List) j4Var.d().z(new r1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (n4 n4Var : list2) {
                        if (objArr == false && p4.W(n4Var.f8883c)) {
                        }
                        arrayList2.add(new m4(n4Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e2) {
                    e = e2;
                    j4Var.b().f9050t.c(v0.A(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e9) {
                    e = e9;
                    j4Var.b().f9050t.c(v0.A(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) r5.a(parcel, u.CREATOR);
                String readString2 = parcel.readString();
                r5.d(parcel);
                byte[] A = A(readString2, uVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(A);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                r5.d(parcel);
                l(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                r4 r4Var6 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                String m10 = m(r4Var6);
                parcel2.writeNoException();
                parcel2.writeString(m10);
                return true;
            case 12:
                e eVar = (e) r5.a(parcel, e.CREATOR);
                r4 r4Var7 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                s(eVar, r4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) r5.a(parcel, e.CREATOR);
                r5.d(parcel);
                c7.c0.g(eVar2);
                c7.c0.g(eVar2.f8596i);
                c7.c0.d(eVar2.f8594d);
                F(eVar2.f8594d, true);
                G(new f8.j0(17, this, new e(eVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = r5.f2731a;
                z10 = parcel.readInt() != 0;
                r4 r4Var8 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                List h10 = h(readString6, readString7, z10, r4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(h10);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = r5.f2731a;
                z10 = parcel.readInt() != 0;
                r5.d(parcel);
                List c10 = c(readString8, readString9, readString10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(c10);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                r4 r4Var9 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                List n10 = n(readString11, readString12, r4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(n10);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                r5.d(parcel);
                List r9 = r(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(r9);
                return true;
            case 18:
                r4 r4Var10 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                d(r4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) r5.a(parcel, Bundle.CREATOR);
                r4 r4Var11 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                g(bundle, r4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                r4 r4Var12 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                q(r4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                r4 r4Var13 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                i v10 = v(r4Var13);
                parcel2.writeNoException();
                if (v10 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                v10.writeToParcel(parcel2, 1);
                return true;
            case 24:
                r4 r4Var14 = (r4) r5.a(parcel, r4.CREATOR);
                Bundle bundle2 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                r5.d(parcel);
                E(r4Var14);
                String str2 = r4Var14.f8976d;
                c7.c0.g(str2);
                if (j4Var.e0().D(null, e0.T0)) {
                    try {
                        list = (List) j4Var.d().A(new v1(this, r4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                        j4Var.b().f9050t.c(v0.A(str2), e10, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) j4Var.d().z(new v1(this, r4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        j4Var.b().f9050t.c(v0.A(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                r4 r4Var15 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                i(r4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                r4 r4Var16 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                o(r4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                r4 r4Var17 = (r4) r5.a(parcel, r4.CREATOR);
                r5.d(parcel);
                f(r4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                r4 r4Var18 = (r4) r5.a(parcel, r4.CREATOR);
                b4 b4Var = (b4) r5.a(parcel, b4.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    l0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new k0(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                r5.d(parcel);
                y(r4Var18, b4Var, l0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                r4 r4Var19 = (r4) r5.a(parcel, r4.CREATOR);
                d dVar = (d) r5.a(parcel, d.CREATOR);
                r5.d(parcel);
                u(r4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                r4 r4Var20 = (r4) r5.a(parcel, r4.CREATOR);
                Bundle bundle3 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j0Var = queryLocalInterface2 instanceof j0 ? (j0) queryLocalInterface2 : new i0(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                r5.d(parcel);
                z(r4Var20, bundle3, j0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void D(Runnable runnable) {
        j4 j4Var = this.f9082d;
        if (j4Var.d().y()) {
            runnable.run();
        } else {
            j4Var.d().D(runnable);
        }
    }

    public final void E(r4 r4Var) {
        c7.c0.g(r4Var);
        String str = r4Var.f8976d;
        c7.c0.d(str);
        F(str, false);
        this.f9082d.k0().y(r4Var.f8977e);
    }

    public final void F(String str, boolean z10) {
        boolean isEmpty = TextUtils.isEmpty(str);
        j4 j4Var = this.f9082d;
        if (isEmpty) {
            j4Var.b().f9050t.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f9083e == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f9084f) && !g7.b.c(j4Var.f8771z.f8932d, Binder.getCallingUid()) && !z6.j.a(j4Var.f8771z.f8932d).b(Binder.getCallingUid())) {
                        z11 = false;
                    }
                    this.f9083e = Boolean.valueOf(z11);
                }
                if (this.f9083e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                j4Var.b().f9050t.b(v0.A(str), "Measurement Service called with invalid calling package. appId");
                throw e2;
            }
        }
        if (this.f9084f == null) {
            Context context = j4Var.f8771z.f8932d;
            int callingUid = Binder.getCallingUid();
            int i3 = z6.i.f10887e;
            if (g7.b.f(callingUid, context, str)) {
                this.f9084f = str;
            }
        }
        if (str.equals(this.f9084f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void G(Runnable runnable) {
        j4 j4Var = this.f9082d;
        if (j4Var.d().y()) {
            runnable.run();
        } else {
            j4Var.d().B(runnable);
        }
    }

    @Override // s7.h0
    public final void a(r4 r4Var) {
        E(r4Var);
        G(new s1(this, r4Var, 0));
    }

    @Override // s7.h0
    public final List c(String str, String str2, String str3, boolean z10) {
        F(str, true);
        j4 j4Var = this.f9082d;
        try {
            List<n4> list = (List) j4Var.d().z(new u1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (n4 n4Var : list) {
                if (!z10 && p4.W(n4Var.f8883c)) {
                }
                arrayList.add(new m4(n4Var));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            j4Var.b().f9050t.c(v0.A(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            j4Var.b().f9050t.c(v0.A(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.h0
    public final void d(r4 r4Var) {
        String str = r4Var.f8976d;
        c7.c0.d(str);
        F(str, false);
        G(new s1(this, r4Var, 3));
    }

    @Override // s7.h0
    public final void f(r4 r4Var) {
        E(r4Var);
        G(new s1(this, r4Var, 1));
    }

    @Override // s7.h0
    public final void g(Bundle bundle, r4 r4Var) {
        E(r4Var);
        String str = r4Var.f8976d;
        c7.c0.g(str);
        G(new d6.t(this, bundle, str, r4Var, 5, false));
    }

    @Override // s7.h0
    public final List h(String str, String str2, boolean z10, r4 r4Var) {
        E(r4Var);
        String str3 = r4Var.f8976d;
        c7.c0.g(str3);
        j4 j4Var = this.f9082d;
        try {
            List<n4> list = (List) j4Var.d().z(new u1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (n4 n4Var : list) {
                if (!z10 && p4.W(n4Var.f8883c)) {
                }
                arrayList.add(new m4(n4Var));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            j4Var.b().f9050t.c(v0.A(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            j4Var.b().f9050t.c(v0.A(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.h0
    public final void i(r4 r4Var) {
        c7.c0.d(r4Var.f8976d);
        c7.c0.g(r4Var.G);
        D(new s1(this, r4Var, 6));
    }

    @Override // s7.h0
    public final void l(long j, String str, String str2, String str3) {
        G(new t1(this, str2, str3, str, j, 0));
    }

    @Override // s7.h0
    public final String m(r4 r4Var) {
        E(r4Var);
        j4 j4Var = this.f9082d;
        try {
            return (String) j4Var.d().z(new r1(j4Var, r4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            j4Var.b().f9050t.c(v0.A(r4Var.f8976d), e2, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // s7.h0
    public final List n(String str, String str2, r4 r4Var) {
        E(r4Var);
        String str3 = r4Var.f8976d;
        c7.c0.g(str3);
        j4 j4Var = this.f9082d;
        try {
            return (List) j4Var.d().z(new u1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            j4Var.b().f9050t.b(e2, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.h0
    public final void o(r4 r4Var) {
        c7.c0.d(r4Var.f8976d);
        c7.c0.g(r4Var.G);
        D(new s1(this, r4Var, 5));
    }

    @Override // s7.h0
    public final void p(r4 r4Var) {
        E(r4Var);
        G(new s1(this, r4Var, 2));
    }

    @Override // s7.h0
    public final void q(r4 r4Var) {
        c7.c0.d(r4Var.f8976d);
        c7.c0.g(r4Var.G);
        D(new s1(this, r4Var, 4));
    }

    @Override // s7.h0
    public final List r(String str, String str2, String str3) {
        F(str, true);
        j4 j4Var = this.f9082d;
        try {
            return (List) j4Var.d().z(new u1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            j4Var.b().f9050t.b(e2, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.h0
    public final void s(e eVar, r4 r4Var) {
        c7.c0.g(eVar);
        c7.c0.g(eVar.f8596i);
        E(r4Var);
        e eVar2 = new e(eVar);
        eVar2.f8594d = r4Var.f8976d;
        G(new cf((Object) this, (d7.a) eVar2, (Object) r4Var, 4));
    }

    @Override // s7.h0
    public final void u(r4 r4Var, d dVar) {
        E(r4Var);
        G(new cf((Object) this, (Object) r4Var, (Object) dVar, 8));
    }

    @Override // s7.h0
    public final i v(r4 r4Var) {
        E(r4Var);
        String str = r4Var.f8976d;
        c7.c0.d(str);
        j4 j4Var = this.f9082d;
        try {
            return (i) j4Var.d().A(new r1(this, r4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            j4Var.b().f9050t.c(v0.A(str), e2, "Failed to get consent. appId");
            return new i(null);
        }
    }

    @Override // s7.h0
    public final void x(m4 m4Var, r4 r4Var) {
        c7.c0.g(m4Var);
        E(r4Var);
        G(new cf((Object) this, (d7.a) m4Var, (Object) r4Var, 7));
    }

    @Override // s7.h0
    public final void y(r4 r4Var, b4 b4Var, l0 l0Var) {
        E(r4Var);
        String str = r4Var.f8976d;
        c7.c0.g(str);
        this.f9082d.d().B(new d6.t(this, str, b4Var, l0Var, 3, false));
    }

    @Override // s7.h0
    public final void z(r4 r4Var, Bundle bundle, j0 j0Var) {
        E(r4Var);
        String str = r4Var.f8976d;
        c7.c0.g(str);
        this.f9082d.d().B(new d6.r(this, r4Var, bundle, j0Var, str));
    }
}
