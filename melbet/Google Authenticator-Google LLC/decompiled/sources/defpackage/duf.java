package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class duf {
    private static final Duration b;
    public final egt a;
    private final Context c;

    static {
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        b = ofSeconds;
    }

    public duf(Context context, egt egtVar) {
        this.c = context;
        this.a = egtVar;
    }

    public final void a(String str) {
        Uri parse = Uri.parse(str);
        parse.getClass();
        try {
            brr v = new byo().v();
            ((Intent) v.b).setFlags(268435456);
            v.m(this.c, parse);
        } catch (ActivityNotFoundException e) {
            Log.e("DeactivatedAccountEvent", "No activity found to handle URL: ".concat(str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jit jitVar, kqj kqjVar) {
        due dueVar;
        int i;
        chu chuVar;
        String str;
        String str2;
        try {
            if (kqjVar instanceof due) {
                dueVar = (due) kqjVar;
                int i2 = dueVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dueVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = dueVar.a;
                    kqp kqpVar = kqp.a;
                    i = dueVar.c;
                    Object[] objArr = 0;
                    if (i != 0) {
                        ixc.Y(obj);
                        long millis = b.toMillis();
                        alg algVar = new alg(this, jitVar, (kqj) null, 9);
                        dueVar.c = 1;
                        obj = ixi.c(millis, algVar, dueVar);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj);
                    }
                    chuVar = (chu) obj;
                    if (chuVar == null) {
                        chuVar = this.a.d();
                    }
                    String str3 = chuVar.a;
                    str3.getClass();
                    String str4 = new hpn(((hpo) jkp.v(hpo.a, chuVar.b, jkd.a())).c).a;
                    str = chuVar.d;
                    if (str != null) {
                        String string = this.c.getString(R.string.og_got_it);
                        string.getClass();
                        str2 = string;
                    } else {
                        str2 = str;
                    }
                    return new jis(str3, str4, str2, new aya(chuVar, this, 8, objArr == true ? 1 : 0), str != null ? chuVar.c : null, Integer.valueOf(R.drawable.gs_info_vd_theme_24));
                }
            }
            String str42 = new hpn(((hpo) jkp.v(hpo.a, chuVar.b, jkd.a())).c).a;
            str = chuVar.d;
            if (str != null) {
            }
            return new jis(str3, str42, str2, new aya(chuVar, this, 8, objArr == true ? 1 : 0), str != null ? chuVar.c : null, Integer.valueOf(R.drawable.gs_info_vd_theme_24));
        } catch (jld e) {
            throw new IllegalStateException("Failed to parse rich body text", e);
        }
        dueVar = new due(this, kqjVar);
        Object obj2 = dueVar.a;
        kqp kqpVar2 = kqp.a;
        i = dueVar.c;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        chuVar = (chu) obj2;
        if (chuVar == null) {
        }
        String str32 = chuVar.a;
        str32.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, krt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(gjl gjlVar, int i, jit jitVar, wo woVar, lao laoVar, kqj kqjVar) {
        dud dudVar;
        int i2;
        jis jisVar;
        wo woVar2;
        lao laoVar2;
        if (kqjVar instanceof dud) {
            dudVar = (dud) kqjVar;
            int i3 = dudVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dudVar.c = i3 - Integer.MIN_VALUE;
                Object obj = dudVar.a;
                Object obj2 = kqp.a;
                i2 = dudVar.c;
                if (i2 != 0) {
                    ixc.Y(obj);
                    laoVar.d(jhu.a((jhu) laoVar.b(), false, null, false, jitVar.c, 3));
                    if (i != 3) {
                        ((fwm) gjlVar.k).a.a(jitVar);
                        jisVar = null;
                        woVar2 = woVar;
                        laoVar2 = laoVar;
                        if (jisVar != null) {
                            woVar2.a(jisVar);
                        }
                        laoVar2.d(jhu.a((jhu) laoVar2.b(), false, null, true, null, 3));
                        return kow.a;
                    }
                    dudVar.e = (be) woVar;
                    dudVar.d = laoVar;
                    dudVar.c = 1;
                    obj = b(jitVar, dudVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    woVar2 = woVar;
                    laoVar2 = laoVar;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    laoVar2 = dudVar.d;
                    woVar2 = dudVar.e;
                    ixc.Y(obj);
                }
                jisVar = (jis) obj;
                if (jisVar != null) {
                }
                laoVar2.d(jhu.a((jhu) laoVar2.b(), false, null, true, null, 3));
                return kow.a;
            }
        }
        dudVar = new dud(this, kqjVar);
        Object obj3 = dudVar.a;
        Object obj22 = kqp.a;
        i2 = dudVar.c;
        if (i2 != 0) {
        }
        jisVar = (jis) obj3;
        if (jisVar != null) {
        }
        laoVar2.d(jhu.a((jhu) laoVar2.b(), false, null, true, null, 3));
        return kow.a;
    }
}
