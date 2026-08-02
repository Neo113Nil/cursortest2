package m0;

import E1.AbstractActivityC0029e;
import O1.j;
import P1.l;
import P1.r;
import a.AbstractC0129a;
import android.os.Build;
import t2.AbstractC1212w;
import t2.D;
import t2.X;
import y2.o;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0029e f9950a;

    /* renamed from: b, reason: collision with root package name */
    public j f9951b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC1112e f9952c;

    /* renamed from: d, reason: collision with root package name */
    public String f9953d;

    /* renamed from: e, reason: collision with root package name */
    public String f9954e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.e f9955g;

    public C1110c(AbstractActivityC0029e activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f9950a = activity;
        this.f9953d = "";
        this.f9954e = "";
        X x3 = new X();
        A2.e eVar = D.f10377a;
        u2.c cVar = o.f10862a;
        cVar.getClass();
        this.f9955g = AbstractC1212w.a(android.support.v4.media.session.a.E(cVar, x3));
    }

    public final void a(l methodCall, j jVar, EnumC1112e enumC1112e) {
        String str;
        String obj;
        kotlin.jvm.internal.j.e(methodCall, "methodCall");
        Object a3 = methodCall.a("path");
        String str2 = "";
        if (a3 == null || (str = a3.toString()) == null) {
            str = "";
        }
        this.f9953d = str;
        Object a4 = methodCall.a("albumName");
        if (a4 != null && (obj = a4.toString()) != null) {
            str2 = obj;
        }
        this.f9954e = str2;
        Object a5 = methodCall.a("toDcim");
        kotlin.jvm.internal.j.c(a5, "null cannot be cast to non-null type kotlin.Boolean");
        this.f = ((Boolean) a5).booleanValue();
        this.f9952c = enumC1112e;
        this.f9951b = jVar;
        AbstractActivityC0029e abstractActivityC0029e = this.f9950a;
        if (AbstractC0129a.g(abstractActivityC0029e, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && Build.VERSION.SDK_INT < 29) {
            AbstractC0129a.w(abstractActivityC0029e, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2408);
        } else {
            AbstractC1212w.g(this.f9955g, null, new C1109b(this, null), 3);
        }
    }

    @Override // P1.r
    public final boolean b(int i3, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.j.e(permissions, "permissions");
        kotlin.jvm.internal.j.e(grantResults, "grantResults");
        if (i3 != 2408) {
            return false;
        }
        if (grantResults.length != 0 && grantResults[0] == 0) {
            AbstractC1212w.g(this.f9955g, null, new C1109b(this, null), 3);
            return true;
        }
        j jVar = this.f9951b;
        kotlin.jvm.internal.j.b(jVar);
        jVar.success(Boolean.FALSE);
        this.f9951b = null;
        return true;
    }
}
