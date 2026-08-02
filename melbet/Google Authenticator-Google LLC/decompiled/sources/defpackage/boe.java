package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boe {
    public static int c;
    public Object a;
    public final Object b;

    public boe(sy syVar) {
        this.a = null;
        this.b = new ArrayList();
        c++;
        this.a = syVar;
    }

    public final Bundle a(String str) {
        amg amgVar = (amg) this.b;
        if (!amgVar.d) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = amgVar.c;
        if (bundle == null) {
            return null;
        }
        Bundle a = bundle.containsKey(str) ? amb.a(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            amgVar.c = null;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        r1.c(r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, amd amdVar) {
        amdVar.getClass();
        Object obj = this.b;
        synchronized (((amg) obj).g) {
            qv qvVar = ((amg) obj).f;
            int hashCode = str.hashCode() * (-862048943);
            int i = qvVar.d;
            int i2 = ((hashCode ^ (hashCode << 16)) >>> 7) & i;
            int i3 = 0;
            while (true) {
                long[] jArr = qvVar.a;
                int i4 = i2 >> 3;
                int i5 = (i2 & 7) << 3;
                long j = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
                long j2 = ((r3 & 127) * 72340172838076673L) ^ j;
                long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i2) & i;
                    if (!ksp.b(qvVar.b[numberOfTrailingZeros], str)) {
                        j3 &= (-1) + j3;
                    } else if (numberOfTrailingZeros >= 0) {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                }
                i3 += 8;
                i2 = (i2 + i3) & i;
            }
        }
    }

    public final void c(Class cls) {
        if (!((amg) this.b).e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Object obj = this.a;
        if (obj == null) {
            obj = new alz(this);
        }
        this.a = obj;
        try {
            cls.getDeclaredConstructor(null);
            Object obj2 = this.a;
            if (obj2 != null) {
                String name = cls.getName();
                name.getClass();
                ((alz) obj2).a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final boolean d() {
        return ((amg) this.b).d;
    }

    public final amd e() {
        amd amdVar;
        Object obj = this.b;
        synchronized (((amg) obj).g) {
            amdVar = (amd) ((amg) obj).f.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        }
        return amdVar;
    }

    public final long f(sq sqVar, long j) {
        sy syVar = sqVar.d;
        if (syVar instanceof su) {
            return j;
        }
        List list = sqVar.j;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            so soVar = (so) list.get(i);
            if (soVar instanceof sq) {
                sq sqVar2 = (sq) soVar;
                if (sqVar2.d != syVar) {
                    j2 = Math.min(j2, f(sqVar2, sqVar2.e + j));
                }
            }
        }
        if (sqVar != syVar.i) {
            return j2;
        }
        long a = syVar.a();
        long j3 = j - a;
        return Math.min(Math.min(j2, f(syVar.h, j3)), j3 - r10.e);
    }

    public final long g(sq sqVar, long j) {
        sy syVar = sqVar.d;
        if (syVar instanceof su) {
            return j;
        }
        List list = sqVar.j;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            so soVar = (so) list.get(i);
            if (soVar instanceof sq) {
                sq sqVar2 = (sq) soVar;
                if (sqVar2.d != syVar) {
                    j2 = Math.max(j2, g(sqVar2, sqVar2.e + j));
                }
            }
        }
        if (sqVar != syVar.h) {
            return j2;
        }
        long a = syVar.a();
        long j3 = j + a;
        return Math.max(Math.max(j2, g(syVar.i, j3)), j3 - r10.e);
    }

    public boe(Object obj) {
        this.b = obj;
    }

    public boe(amg amgVar) {
        this.b = amgVar;
    }
}
