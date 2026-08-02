package defpackage;

import android.content.Context;
import android.view.View;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvq {
    public static final Map a = new ConcurrentHashMap();
    public final jiw b;
    public final Optional c;
    public final Optional d;
    public final Context e;
    public final Optional f;
    public final String g;
    public final jiu i;
    public final jiu j;
    public final cwy n;
    public final bst o;
    public final iyh p;
    private final jiu q;
    private final jiu r;
    public final dvx h = new dvx();
    public final int k = View.generateViewId();
    public final int l = View.generateViewId();
    public final kzq m = kzt.a(new kzl(new akn(this, (kqj) null, 6)));

    public dvq(jiw jiwVar, iyh iyhVar, cwy cwyVar, Optional optional, Optional optional2, Context context, Optional optional3, bst bstVar, String str) {
        this.b = jiwVar;
        this.p = iyhVar;
        this.n = cwyVar;
        this.c = optional;
        this.d = optional2;
        this.e = context;
        this.f = optional3;
        this.o = bstVar;
        this.g = str;
        this.i = jiwVar.a(new ajt(19));
        this.q = jiwVar.a(new ajt(20));
        this.r = jiwVar.a(new dvm(1));
        this.j = jiwVar.a(new dvm(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jgn a(ijp ijpVar, boolean z) {
        jjd jjdVar;
        byte[] bArr = null;
        if (!(ijpVar.g == 5 ? (ijo) ijpVar.h : ijo.a).e) {
            if (z) {
                int i = ijpVar.g;
                if (((i == 5 ? (ijo) ijpVar.h : ijo.a).b & 1) != 0) {
                    jjdVar = (i == 5 ? (ijo) ijpVar.h : ijo.a).c;
                    if (jjdVar == null) {
                        jjdVar = jjd.a;
                    }
                    jjdVar.getClass();
                    this.b.c(!z ? this.q : this.r, new aya(this, ijpVar, 16, bArr));
                    dva dvaVar = (dva) this.c.get();
                    int i2 = (ijpVar.g != 5 ? (ijo) ijpVar.h : ijo.a).f;
                    return dvaVar.a();
                }
            }
            if (!z) {
                int i3 = ijpVar.g;
                if (((i3 == 5 ? (ijo) ijpVar.h : ijo.a).b & 2) != 0) {
                    jjdVar = (i3 == 5 ? (ijo) ijpVar.h : ijo.a).d;
                    if (jjdVar == null) {
                        jjdVar = jjd.a;
                    }
                    jjdVar.getClass();
                    this.b.c(!z ? this.q : this.r, new aya(this, ijpVar, 16, bArr));
                    dva dvaVar2 = (dva) this.c.get();
                    int i22 = (ijpVar.g != 5 ? (ijo) ijpVar.h : ijo.a).f;
                    return dvaVar2.a();
                }
            }
        }
        return null;
    }
}
