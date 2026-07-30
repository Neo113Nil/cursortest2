package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.appsflyer.internal.l;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a60 implements ak, f, en, u10, g9, j9, ef, ym, yn, lz0, tw {
    public static final af e = new af(1);
    public static final a60 g = new a60(2);
    public static final a60 h = new a60(3);
    public static final a60 i = new a60(4);
    public static final a60 j = new a60(5);
    public static final /* synthetic */ a60 k = new a60(6);
    public static final /* synthetic */ a60 l = new a60(7);
    public static final /* synthetic */ a60 m = new a60(8);
    public static final a60 n = new a60(9);
    public static final a60 o = new a60(10);
    public static final /* synthetic */ a60 p = new a60(11);
    public final /* synthetic */ int d;

    public /* synthetic */ a60(int i2) {
        this.d = i2;
    }

    @Override // defpackage.g9, defpackage.j9
    public float a() {
        return 0.0f;
    }

    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (mj mjVar : componentRegistrar.getComponents()) {
            String str = mjVar.a;
            if (str != null) {
                mjVar = new mj(str, mjVar.b, mjVar.c, mjVar.d, mjVar.e, new bk(str, 0, mjVar), mjVar.g);
            }
            arrayList.add(mjVar);
        }
        return arrayList;
    }

    @Override // defpackage.ef
    public byte[] c(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.ym
    public long d(long j2, long j3) {
        switch (this.d) {
            case 18:
                float max = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i2 = p61.a;
                return floatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i3 = p61.a;
                    return floatToRawIntBits2;
                }
                float v = uq1.v(j2, j3);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(v) << 32) | (Float.floatToRawIntBits(v) & 4294967295L);
                int i4 = p61.a;
                return floatToRawIntBits3;
        }
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        switch (this.d) {
            case 4:
                Object f = mcVar.f(new v01(rc.class, Executor.class));
                f.getClass();
                return new ow((Executor) f);
            default:
                Object f2 = mcVar.f(new v01(vk1.class, Executor.class));
                f2.getClass();
                return new ow((Executor) f2);
        }
    }

    @Override // defpackage.o01
    public Object get() {
        me1 me1Var = new me1(5);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            l.b("Null flags");
            return null;
        }
        hashMap.put(dz0.d, new zb(30000L, 86400000L, set));
        if (set == null) {
            l.b("Null flags");
            return null;
        }
        hashMap.put(dz0.g, new zb(1000L, 86400000L, set));
        if (set == null) {
            l.b("Null flags");
            return null;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(t61.e)));
        if (unmodifiableSet == null) {
            l.b("Null flags");
            return null;
        }
        hashMap.put(dz0.e, new zb(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= dz0.values().length) {
            new HashMap();
            return new yb(me1Var, hashMap);
        }
        dd0.j("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.j9
    public void l(xk0 xk0Var, int i2, int[] iArr, int[] iArr2) {
        yr1.X(i2, iArr, iArr2, false);
    }

    @Override // defpackage.g9
    public void m(xk0 xk0Var, int i2, int[] iArr, vc0 vc0Var, int[] iArr2) {
        if (vc0Var == vc0.d) {
            yr1.X(i2, iArr, iArr2, false);
        } else {
            yr1.X(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.en
    public Object n(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    public String toString() {
        switch (this.d) {
            case 15:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lz0
    public void j() {
    }

    @Override // defpackage.yn
    public Object e(xn xnVar) {
        throw xnVar;
    }

    @Override // defpackage.lz0
    public void k(int i2, Object obj) {
    }
}
