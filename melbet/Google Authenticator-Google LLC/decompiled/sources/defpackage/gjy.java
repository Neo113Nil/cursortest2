package defpackage;

import j$.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjy implements krt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ gjy(gka gkaVar, hvi hviVar, String str, int i, Duration duration, int i2) {
        this.f = i2;
        this.b = gkaVar;
        this.c = hviVar;
        this.d = str;
        this.a = i;
        this.e = duration;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, koe] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        Object obj2;
        Object obj3;
        jjq jjqVar;
        byte[] bArr = null;
        if (this.f != 0) {
            byte[] bArr2 = (byte[]) obj;
            Set set = ((gid) this.b).e;
            int i = this.a;
            Object obj4 = this.c;
            Integer valueOf = Integer.valueOf(i);
            iae iaeVar = (iae) obj4;
            String[] d = gid.d(set, iaeVar);
            if (bArr2 != null) {
                bArr = bArr2;
            } else if (obj4 != null && (jjqVar = iaeVar.k) != null) {
                bArr = jjqVar.x();
            }
            return ((etp) ((gij) this.d).c).e((String) this.e, valueOf.intValue(), d, bArr);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Object obj5 = this.e;
        Object obj6 = this.d;
        ?? r0 = this.c;
        if (booleanValue) {
            int i2 = this.a;
            Object obj7 = this.b;
            gka gkaVar = (gka) obj7;
            Object b = gkaVar.b.b();
            b.getClass();
            ldt ldtVar = (ldt) b;
            String bt = hnu.bt(i2);
            try {
                hnu.aR(r0);
                Object obj8 = ((gka) obj7).d;
                obj2 = ((ikj) obj8).b;
                obj3 = ((ikj) obj8).a;
                ldtVar.g((String) obj2, (String) obj3, (String) obj6, bt, "success");
            } catch (Exception e) {
                e = e;
            }
            try {
                ldtVar.h(((Duration) obj5).toMillis(), (String) obj2, (String) obj3, (String) obj6, bt, "success");
            } catch (Exception e2) {
                e = e2;
                bt = bt;
                Exception exc = e;
                if ((exc instanceof TimeoutException) || (exc.getCause() instanceof TimeoutException)) {
                    ikj ikjVar = (ikj) gkaVar.d;
                    Object obj9 = ikjVar.a;
                    String str = (String) ikjVar.b;
                    String str2 = (String) obj9;
                    String str3 = (String) obj6;
                    ldtVar.g(str, str2, str3, bt, "timeout");
                    ldtVar.h(((Duration) obj5).toMillis(), str, str2, str3, bt, "timeout");
                } else {
                    ikj ikjVar2 = (ikj) gkaVar.d;
                    Object obj10 = ikjVar2.a;
                    String str4 = (String) ikjVar2.b;
                    String str5 = (String) obj10;
                    String str6 = (String) obj6;
                    ldtVar.g(str4, str5, str6, bt, "failure");
                    ldtVar.h(((Duration) obj5).toMillis(), str4, str5, str6, bt, "failure");
                }
                return null;
            }
        }
        return null;
    }

    public /* synthetic */ gjy(krz krzVar, String str, int i, gid gidVar, iae iaeVar, int i2) {
        this.f = i2;
        this.d = krzVar;
        this.e = str;
        this.a = i;
        this.b = gidVar;
        this.c = iaeVar;
    }
}
