package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.majelw.libystne.MainActivity2;
import com.majelw.libystne.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ h00(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
    
        r1 = new defpackage.pt1(r4.m, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        r3.c();
        r7 = r1;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        pt1 pt1Var;
        Collection collection;
        int i;
        int i2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i3 = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i3) {
            case 0:
                a00 a00Var = ((i00) obj2).m;
                wl2 wl2Var = a00Var.c;
                if (!a00Var.C) {
                    return ah0.m;
                }
                vl2 c = wl2Var.c();
                try {
                    a82 a82Var = new a82();
                    while (true) {
                        int i4 = a82Var.m;
                        pt1Var = null;
                        if (i4 < wl2Var.n) {
                            if (c.l(i4)) {
                                Object n = c.n(a82Var.m);
                                if (n == obj) {
                                    break;
                                } else {
                                    s82 s82Var = n instanceof s82 ? (s82) n : null;
                                    if ((s82Var != null ? s82Var.a : null) == obj) {
                                        break;
                                    }
                                }
                            }
                            int i5 = a82Var.m;
                            int[] iArr = c.b;
                            int b = yl2.b(iArr, i5);
                            int i6 = i5 + 1;
                            int i7 = (i6 < c.c ? iArr[(i6 * 5) + 4] : c.e) - b;
                            i = 0;
                            while (true) {
                                i2 = a82Var.m;
                                if (i < i7) {
                                    Object h = c.h(i2, i);
                                    if (h != obj) {
                                        s82 s82Var2 = h instanceof s82 ? (s82) h : null;
                                        if ((s82Var2 != null ? s82Var2.a : null) != obj) {
                                            i++;
                                        }
                                    }
                                }
                            }
                        } else {
                            Unit unit = Unit.a;
                        }
                        a82Var.m = i2 + 1;
                    }
                    pt1Var = new pt1(a82Var.m, Integer.valueOf(i));
                    if (pt1Var == null) {
                        return ah0.m;
                    }
                    int i8 = pt1Var.a;
                    Integer num = pt1Var.b;
                    if (a00Var.C) {
                        c = wl2Var.c();
                        try {
                            ArrayList Q = s03.Q(c, i8, num);
                            c.c();
                            collection = Q;
                        } finally {
                        }
                    } else {
                        collection = ah0.m;
                    }
                    return zv.E(collection, a00Var.F());
                } finally {
                }
            case 1:
                Context context = (Context) obj2;
                ik ikVar = (ik) obj;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
                    Toast.makeText(context, context.getString(R.string.no_internet_message), 0).show();
                } else {
                    String l = q40.l("https://www.mindat.org/search.php?search=", URLEncoder.encode(ikVar.d, "UTF-8"));
                    t21 a = new w50(0, false).a();
                    Uri parse = Uri.parse(l);
                    Intent intent = (Intent) a.n;
                    intent.setData(parse);
                    context.startActivity(intent, (Bundle) a.o);
                }
                return Unit.a;
            case 2:
                MainActivity2 mainActivity2 = (MainActivity2) obj2;
                int i9 = MainActivity2.n;
                SharedPreferences sharedPreferences = mainActivity2.getSharedPreferences("template_session", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("main_unlocked", true);
                edit.putBoolean("main_entered", true);
                edit.commit();
                ij2.m(mainActivity2, true);
                ((zn1) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 3:
                ph1.b((up1) obj, ((is2) obj2).a);
                return Unit.a;
            case 4:
                ((iz) obj2).d = (Function2) obj;
                return Unit.a;
            case 5:
                un1 un1Var = (un1) obj2;
                k00 k00Var = (k00) obj;
                Object[] objArr = un1Var.b;
                long[] jArr = un1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128) {
                                    k00Var.z(objArr[(i10 << 3) + i12]);
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        }
                    }
                }
                return Unit.a;
            default:
                ((Function1) obj2).invoke(Long.valueOf(((a61) obj).a));
                return Unit.a;
        }
    }
}
