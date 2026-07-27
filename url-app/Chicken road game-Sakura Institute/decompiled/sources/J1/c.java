package J1;

import A.V;
import E1.i;
import G1.w;
import H1.f;
import H1.h;
import H1.o;
import P1.e;
import U1.k;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import w2.C1294c;
import y.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final t f3383i = new t(new b(), new i(4));

    /* renamed from: a, reason: collision with root package name */
    public final Context f3384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3385b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3386c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.i f3387d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.a f3388e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3389f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3390g;

    /* renamed from: h, reason: collision with root package name */
    public final G1.d f3391h;

    public c(Context context, t tVar, F1.b bVar) {
        H1.i iVar = H1.i.f3271a;
        o.e(context, "Null context is not permitted.");
        o.e(tVar, "Api must not be null.");
        o.e(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f3384a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f3385b = str;
        this.f3386c = tVar;
        this.f3387d = iVar;
        this.f3388e = new G1.a(tVar, str);
        G1.d d4 = G1.d.d(this.f3384a);
        this.f3391h = d4;
        this.f3389f = d4.f3117h.getAndIncrement();
        this.f3390g = bVar.f2635a;
        e eVar = d4.f3122m;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    public final k a(h hVar) {
        C1294c c1294c = new C1294c();
        E1.d[] dVarArr = {P1.c.f3784a};
        c1294c.f11388d = new C1294c(hVar);
        V v4 = new V(c1294c, dVarArr);
        U1.e eVar = new U1.e();
        G1.d dVar = this.f3391h;
        dVar.getClass();
        w wVar = new w(v4, eVar, this.f3390g);
        e eVar2 = dVar.f3122m;
        eVar2.sendMessage(eVar2.obtainMessage(4, new G1.t(wVar, dVar.f3118i.get(), this)));
        return eVar.f4107a;
    }
}
