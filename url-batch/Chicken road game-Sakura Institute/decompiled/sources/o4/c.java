package o4;

import a0.s0;
import android.content.Context;
import android.os.Build;
import j4.i;
import java.lang.reflect.InvocationTargetException;
import l1.x;
import l4.q;
import l4.s;
import m4.h;
import m4.o;
import u4.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.room.c f6832i = new androidx.room.c(new b(), new i(13));

    /* renamed from: a, reason: collision with root package name */
    public final Context f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6834b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.c f6835c;

    /* renamed from: d, reason: collision with root package name */
    public final m4.i f6836d;

    /* renamed from: e, reason: collision with root package name */
    public final l4.a f6837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6838f;

    /* renamed from: g, reason: collision with root package name */
    public final i f6839g;

    /* renamed from: h, reason: collision with root package name */
    public final l4.d f6840h;

    public c(Context context, androidx.room.c cVar, k4.b bVar) {
        o.e(context, "Null context is not permitted.");
        o.e(cVar, "Api must not be null.");
        o.e(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f6833a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f6834b = str;
        this.f6835c = cVar;
        this.f6836d = m4.i.f6373a;
        this.f6837e = new l4.a(cVar, str);
        l4.d d8 = l4.d.d(this.f6833a);
        this.f6840h = d8;
        this.f6838f = d8.f5966h.getAndIncrement();
        this.f6839g = bVar.f5357a;
        e eVar = d8.f5971m;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    public final z4.i a(h hVar) {
        x xVar = new x(1, false);
        j4.d[] dVarArr = {u4.c.f9053a};
        xVar.f5847g = new x(8, hVar);
        s0 s0Var = new s0(xVar, dVarArr);
        z4.c cVar = new z4.c();
        l4.d dVar = this.f6840h;
        dVar.getClass();
        s sVar = new s(s0Var, cVar, this.f6839g);
        e eVar = dVar.f5971m;
        eVar.sendMessage(eVar.obtainMessage(4, new q(sVar, dVar.f5967i.get(), this)));
        return cVar.f10092a;
    }
}
