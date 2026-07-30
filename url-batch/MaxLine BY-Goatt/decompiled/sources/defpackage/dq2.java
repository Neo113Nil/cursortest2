package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.appevents.codeless.internal.Constants;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class dq2 implements g, d43, dc3, nd3 {
    public static dq2 n;
    public static final /* synthetic */ dq2 o = new dq2(19);
    public static final /* synthetic */ dq2 p = new dq2(20);
    public static final /* synthetic */ dq2 q = new dq2(21);
    public static final /* synthetic */ dq2 r = new dq2(22);
    public static final /* synthetic */ dq2 s = new dq2(23);
    public static final /* synthetic */ dq2 t = new dq2(24);
    public static final /* synthetic */ dq2 u = new dq2(25);
    public static final /* synthetic */ dq2 v = new dq2(26);
    public static final /* synthetic */ dq2 w = new dq2(27);
    public static final /* synthetic */ dq2 x = new dq2(28);
    public static final /* synthetic */ dq2 y = new dq2(29);
    public final /* synthetic */ int m;

    public /* synthetic */ dq2(int i) {
        this.m = i;
    }

    public static final fc c(int i, String str) {
        WeakHashMap weakHashMap = i83.u;
        return new fc(i, str);
    }

    public static final int d(long j, int i) {
        int i2 = l41.k;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final s33 f(int i, String str) {
        WeakHashMap weakHashMap = i83.u;
        return new s33(new f31(0, 0, 0, 0), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [q53] */
    public static ar0 g(u53 u53Var, h90 h90Var, int i) {
        h90 h90Var2 = h90Var;
        if ((i & 2) != 0) {
            h90Var2 = u53Var instanceof jx0 ? ((jx0) u53Var).getDefaultViewModelProviderFactory() : h90.b;
        }
        i50 defaultViewModelCreationExtras = u53Var instanceof jx0 ? ((jx0) u53Var).getDefaultViewModelCreationExtras() : h50.b;
        h90Var2.getClass();
        defaultViewModelCreationExtras.getClass();
        return new ar0(u53Var.getViewModelStore(), h90Var2, defaultViewModelCreationExtras);
    }

    public static final boolean j() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.dc3
    public /* synthetic */ String b(String str, String str2) {
        return null;
    }

    public long h() {
        switch (this.m) {
            case 9:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public boolean i(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.d43
    public int k() {
        return 0;
    }

    @Override // defpackage.d43
    public int m() {
        return 0;
    }

    @Override // defpackage.c43
    public sd n(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return j < 0 ? sdVar : sdVar2;
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nd3
    public Object zza() {
        switch (this.m) {
            case 20:
                return new Boolean(((Boolean) sq3.a.b()).booleanValue());
            case 21:
                return new Boolean(((Boolean) sq3.b.b()).booleanValue());
            case 22:
                return new Boolean(((Boolean) ar3.a.b()).booleanValue());
            case 23:
                return new Boolean(((Boolean) gr3.a.b()).booleanValue());
            case 24:
                return new Boolean(((Boolean) mr3.a.b()).booleanValue());
            case Constants.MAX_TREE_DEPTH /* 25 */:
                List list = ug3.a;
                jq3.n.get();
                Long l = (Long) mq3.b.b();
                l.getClass();
                return l;
            case 26:
                List list2 = ug3.a;
                vr3.n.get();
                Boolean bool = (Boolean) wr3.c.b();
                bool.getClass();
                return bool;
            case 27:
                List list3 = ug3.a;
                Boolean bool2 = (Boolean) ms3.a.b();
                bool2.getClass();
                return bool2;
            case 28:
                List list4 = ug3.a;
                Boolean bool3 = (Boolean) es3.a.b();
                bool3.getClass();
                return bool3;
            default:
                List list5 = ug3.a;
                jq3.n.get();
                return (String) mq3.e.b();
        }
    }

    @Override // defpackage.c43
    public sd l(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return sdVar3;
    }
}
