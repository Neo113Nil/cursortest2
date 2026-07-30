package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mk3 extends md3 implements yg3 {
    public final oq3 g;
    public Boolean h;
    public String i;

    public mk3(oq3 oq3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        ll3.v(oq3Var);
        this.g = oq3Var;
        this.i = null;
    }

    @Override // defpackage.yg3
    public final void A(cs3 cs3Var) {
        ll3.s(cs3Var.m);
        ll3.v(cs3Var.E);
        c(new tj3(this, cs3Var, 4));
    }

    @Override // defpackage.yg3
    public final void B(cs3 cs3Var) {
        d(cs3Var);
        I(new tj3(this, cs3Var, 2));
    }

    @Override // defpackage.yg3
    public final void C(cs3 cs3Var, Bundle bundle, bh3 bh3Var) {
        d(cs3Var);
        String str = cs3Var.m;
        ll3.v(str);
        this.g.c().F(new hk3(this, cs3Var, bundle, bh3Var, str));
    }

    @Override // defpackage.yg3
    public final void D(cs3 cs3Var) {
        ll3.s(cs3Var.m);
        ll3.v(cs3Var.E);
        c(new tj3(this, cs3Var, 5));
    }

    @Override // defpackage.yg3
    public final void E(tq3 tq3Var, cs3 cs3Var) {
        ll3.v(tq3Var);
        d(cs3Var);
        I(new f92((Object) this, (i1) tq3Var, (Object) cs3Var, 5));
    }

    @Override // defpackage.yg3
    public final String F(cs3 cs3Var) {
        d(cs3Var);
        oq3 oq3Var = this.g;
        try {
            return (String) oq3Var.c().D(new rj3(oq3Var, cs3Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            oq3Var.a().r.d(vh3.E(cs3Var.m), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.yg3
    public final List G(String str, String str2, boolean z, cs3 cs3Var) {
        d(cs3Var);
        String str3 = cs3Var.m;
        ll3.v(str3);
        oq3 oq3Var = this.g;
        try {
            List<vq3> list = (List) oq3Var.c().D(new yj3(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (vq3 vq3Var : list) {
                if (!z && zq3.V(vq3Var.c)) {
                }
                arrayList.add(new tq3(vq3Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            oq3Var.a().r.d(vh3.E(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            oq3Var.a().r.d(vh3.E(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void H(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        oq3 oq3Var = this.g;
        if (isEmpty) {
            oq3Var.a().r.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.h == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.i) && !ci2.e(oq3Var.x.m, Binder.getCallingUid()) && !yv0.a(oq3Var.x.m).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.h = Boolean.valueOf(z2);
                }
                if (this.h.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                oq3Var.a().r.c(vh3.E(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.i == null) {
            Context context = oq3Var.x.m;
            int callingUid = Binder.getCallingUid();
            int i = xv0.e;
            if (ci2.k(context, str, callingUid)) {
                this.i = str;
            }
        }
        if (str.equals(this.i)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void I(Runnable runnable) {
        oq3 oq3Var = this.g;
        if (oq3Var.c().C()) {
            runnable.run();
        } else {
            oq3Var.c().F(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        List list;
        oq3 oq3Var = this.g;
        ArrayList arrayList = null;
        bh3 bh3Var = null;
        eh3 eh3Var = null;
        switch (i) {
            case 1:
                kd3 kd3Var = (kd3) od3.a(parcel, kd3.CREATOR);
                cs3 cs3Var = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                k(kd3Var, cs3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                tq3 tq3Var = (tq3) od3.a(parcel, tq3.CREATOR);
                cs3 cs3Var2 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                E(tq3Var, cs3Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                cs3 cs3Var3 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                l(cs3Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                kd3 kd3Var2 = (kd3) od3.a(parcel, kd3.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                od3.d(parcel);
                ll3.v(kd3Var2);
                ll3.s(readString);
                H(readString, true);
                I(new f92((Object) this, (i1) kd3Var2, (Object) readString, 4));
                parcel2.writeNoException();
                return true;
            case 6:
                cs3 cs3Var4 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                B(cs3Var4);
                parcel2.writeNoException();
                return true;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                cs3 cs3Var5 = (cs3) od3.a(parcel, cs3.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                od3.d(parcel);
                d(cs3Var5);
                String str = cs3Var5.m;
                ll3.v(str);
                try {
                    List<vq3> list2 = (List) oq3Var.c().D(new rj3(this, str, r3 ? 1 : 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (vq3 vq3Var : list2) {
                        if (objArr == false && zq3.V(vq3Var.c)) {
                        }
                        arrayList2.add(new tq3(vq3Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    oq3Var.a().r.d(vh3.E(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    oq3Var.a().r.d(vh3.E(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                kd3 kd3Var3 = (kd3) od3.a(parcel, kd3.CREATOR);
                String readString2 = parcel.readString();
                od3.d(parcel);
                byte[] r = r(readString2, kd3Var3);
                parcel2.writeNoException();
                parcel2.writeByteArray(r);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                od3.d(parcel);
                p(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                cs3 cs3Var6 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                String F = F(cs3Var6);
                parcel2.writeNoException();
                parcel2.writeString(F);
                return true;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                yb3 yb3Var = (yb3) od3.a(parcel, yb3.CREATOR);
                cs3 cs3Var7 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                q(yb3Var, cs3Var7);
                parcel2.writeNoException();
                return true;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                yb3 yb3Var2 = (yb3) od3.a(parcel, yb3.CREATOR);
                od3.d(parcel);
                ll3.v(yb3Var2);
                ll3.v(yb3Var2.o);
                ll3.s(yb3Var2.m);
                H(yb3Var2.m, true);
                I(new iu0(22, (Object) this, (Object) new yb3(yb3Var2), false));
                parcel2.writeNoException();
                return true;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = od3.a;
                r3 = parcel.readInt() != 0;
                cs3 cs3Var8 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                List G = G(readString6, readString7, r3, cs3Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(G);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = od3.a;
                boolean z = parcel.readInt() != 0;
                od3.d(parcel);
                List h = h(readString8, readString9, readString10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                return true;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                cs3 cs3Var9 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                List w = w(readString11, readString12, cs3Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(w);
                return true;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                od3.d(parcel);
                List t = t(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(t);
                return true;
            case 18:
                cs3 cs3Var10 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                z(cs3Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) od3.a(parcel, Bundle.CREATOR);
                cs3 cs3Var11 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                g(bundle, cs3Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                cs3 cs3Var12 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                A(cs3Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                cs3 cs3Var13 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                jc3 f = f(cs3Var13);
                parcel2.writeNoException();
                if (f == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                f.writeToParcel(parcel2, 1);
                return true;
            case 24:
                cs3 cs3Var14 = (cs3) od3.a(parcel, cs3.CREATOR);
                Bundle bundle2 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                od3.d(parcel);
                d(cs3Var14);
                String str2 = cs3Var14.m;
                ll3.v(str2);
                if (oq3Var.e0().G(null, ug3.Y0)) {
                    try {
                        list = (List) oq3Var.c().E(new fk3(this, cs3Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        oq3Var.a().r.d(vh3.E(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) oq3Var.c().D(new fk3(this, cs3Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        oq3Var.a().r.d(vh3.E(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                cs3 cs3Var15 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                u(cs3Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                cs3 cs3Var16 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                D(cs3Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                cs3 cs3Var17 = (cs3) od3.a(parcel, cs3.CREATOR);
                od3.d(parcel);
                y(cs3Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                cs3 cs3Var18 = (cs3) od3.a(parcel, cs3.CREATOR);
                qp3 qp3Var = (qp3) od3.a(parcel, qp3.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    eh3Var = queryLocalInterface instanceof eh3 ? (eh3) queryLocalInterface : new ch3(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                od3.d(parcel);
                n(cs3Var18, qp3Var, eh3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                cs3 cs3Var19 = (cs3) od3.a(parcel, cs3.CREATOR);
                tb3 tb3Var = (tb3) od3.a(parcel, tb3.CREATOR);
                od3.d(parcel);
                j(cs3Var19, tb3Var);
                parcel2.writeNoException();
                return true;
            case 31:
                cs3 cs3Var20 = (cs3) od3.a(parcel, cs3.CREATOR);
                Bundle bundle3 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    bh3Var = queryLocalInterface2 instanceof bh3 ? (bh3) queryLocalInterface2 : new zg3(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                od3.d(parcel);
                C(cs3Var20, bundle3, bh3Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void c(Runnable runnable) {
        oq3 oq3Var = this.g;
        if (oq3Var.c().C()) {
            runnable.run();
        } else {
            oq3Var.c().H(runnable);
        }
    }

    public final void d(cs3 cs3Var) {
        ll3.v(cs3Var);
        String str = cs3Var.m;
        ll3.s(str);
        H(str, false);
        this.g.k0().A(cs3Var.n);
    }

    @Override // defpackage.yg3
    public final jc3 f(cs3 cs3Var) {
        d(cs3Var);
        String str = cs3Var.m;
        ll3.s(str);
        oq3 oq3Var = this.g;
        try {
            return (jc3) oq3Var.c().E(new rj3(this, cs3Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            oq3Var.a().r.d(vh3.E(str), e, "Failed to get consent. appId");
            return new jc3(null);
        }
    }

    @Override // defpackage.yg3
    public final void g(Bundle bundle, cs3 cs3Var) {
        d(cs3Var);
        String str = cs3Var.m;
        ll3.v(str);
        I(new ys(this, bundle, str, cs3Var, 5, false));
    }

    @Override // defpackage.yg3
    public final List h(String str, String str2, String str3, boolean z) {
        H(str, true);
        oq3 oq3Var = this.g;
        try {
            List<vq3> list = (List) oq3Var.c().D(new yj3(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (vq3 vq3Var : list) {
                if (!z && zq3.V(vq3Var.c)) {
                }
                arrayList.add(new tq3(vq3Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            oq3Var.a().r.d(vh3.E(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            oq3Var.a().r.d(vh3.E(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.yg3
    public final void j(cs3 cs3Var, tb3 tb3Var) {
        d(cs3Var);
        I(new f92((Object) this, (Object) cs3Var, (Object) tb3Var, 6));
    }

    @Override // defpackage.yg3
    public final void k(kd3 kd3Var, cs3 cs3Var) {
        ll3.v(kd3Var);
        d(cs3Var);
        I(new f92((Object) this, (i1) kd3Var, (Object) cs3Var, 3));
    }

    @Override // defpackage.yg3
    public final void l(cs3 cs3Var) {
        d(cs3Var);
        I(new tj3(this, cs3Var, 0));
    }

    @Override // defpackage.yg3
    public final void n(cs3 cs3Var, qp3 qp3Var, eh3 eh3Var) {
        d(cs3Var);
        String str = cs3Var.m;
        ll3.v(str);
        this.g.c().F(new ys(this, str, qp3Var, eh3Var, 3, false));
    }

    @Override // defpackage.yg3
    public final void p(long j, String str, String str2, String str3) {
        I(new uj3(this, str2, str3, str, j, 0));
    }

    @Override // defpackage.yg3
    public final void q(yb3 yb3Var, cs3 cs3Var) {
        ll3.v(yb3Var);
        ll3.v(yb3Var.o);
        d(cs3Var);
        yb3 yb3Var2 = new yb3(yb3Var);
        yb3Var2.m = cs3Var.m;
        I(new f92((Object) this, (i1) yb3Var2, (Object) cs3Var, 2));
    }

    @Override // defpackage.yg3
    public final byte[] r(String str, kd3 kd3Var) {
        ll3.s(str);
        ll3.v(kd3Var);
        H(str, true);
        oq3 oq3Var = this.g;
        g10 g10Var = oq3Var.a().y;
        pj3 pj3Var = oq3Var.x;
        nh3 nh3Var = pj3Var.v;
        String str2 = kd3Var.m;
        g10Var.c(nh3Var.a(str2), "Log and bundle. event");
        oq3Var.e().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) oq3Var.c().E(new zi3(this, kd3Var, str)).get();
            if (bArr == null) {
                oq3Var.a().r.c(vh3.E(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            oq3Var.e().getClass();
            oq3Var.a().y.e("Log and bundle processed. event, size, time_ms", pj3Var.v.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            oq3Var.a().r.e("Failed to log and bundle. appId, event, error", vh3.E(str), pj3Var.v.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            oq3Var.a().r.e("Failed to log and bundle. appId, event, error", vh3.E(str), pj3Var.v.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.yg3
    public final List t(String str, String str2, String str3) {
        H(str, true);
        oq3 oq3Var = this.g;
        try {
            return (List) oq3Var.c().D(new yj3(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            oq3Var.a().r.c(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.yg3
    public final void u(cs3 cs3Var) {
        ll3.s(cs3Var.m);
        ll3.v(cs3Var.E);
        c(new tj3(this, cs3Var, 6));
    }

    @Override // defpackage.yg3
    public final List w(String str, String str2, cs3 cs3Var) {
        d(cs3Var);
        String str3 = cs3Var.m;
        ll3.v(str3);
        oq3 oq3Var = this.g;
        try {
            return (List) oq3Var.c().D(new yj3(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            oq3Var.a().r.c(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.yg3
    public final void y(cs3 cs3Var) {
        d(cs3Var);
        I(new tj3(this, cs3Var, 1));
    }

    @Override // defpackage.yg3
    public final void z(cs3 cs3Var) {
        String str = cs3Var.m;
        ll3.s(str);
        H(str, false);
        I(new tj3(this, cs3Var, 3));
    }
}
