package c4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.TypedValue;
import c7.c0;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.se;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i0;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements j, z7.h {

    /* renamed from: d, reason: collision with root package name */
    public Context f1772d;

    public o(Context context, int i3) {
        switch (i3) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f1772d = context.getApplicationContext();
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
            default:
                this.f1772d = context.getApplicationContext();
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                c0.g(context);
                Context applicationContext = context.getApplicationContext();
                c0.g(applicationContext);
                this.f1772d = applicationContext;
                break;
        }
    }

    @Override // z7.i
    public Object a() {
        return this.f1772d;
    }

    @Override // c4.j
    public void b(a.a aVar) {
        a aVar2 = new a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar2);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new m(this, aVar, threadPoolExecutor, 0));
    }

    public k6.j c() {
        Context context = this.f1772d;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k6.j jVar = new k6.j();
        jVar.f5467d = m6.a.a(k6.l.f5475a);
        f2.a aVar = new f2.a(context);
        jVar.f5468e = aVar;
        jVar.f5469i = m6.a.a(new c6.c(8, aVar, new l.d(3, aVar)));
        f2.a aVar2 = jVar.f5468e;
        jVar.f5470r = new r6.c(aVar2, 1);
        gd.a a9 = m6.a.a(new c6.s(jVar.f5470r, m6.a.a(new r6.c(aVar2, 0))));
        jVar.f5471s = a9;
        k5.c cVar = new k5.c(13);
        f2.a aVar3 = jVar.f5468e;
        p.e eVar = new p.e(aVar3, a9, cVar, 2);
        gd.a aVar4 = jVar.f5467d;
        gd.a aVar5 = jVar.f5469i;
        se seVar = new se(aVar4, aVar5, eVar, a9, a9);
        g2 g2Var = new g2();
        g2Var.f6077d = aVar3;
        g2Var.f6078e = aVar5;
        g2Var.f6079i = a9;
        g2Var.f6080r = eVar;
        g2Var.f6081s = aVar4;
        g2Var.f6082t = a9;
        g2Var.f6083u = a9;
        jVar.f5472t = m6.a.a(new a1.n(seVar, g2Var, new c6.n(aVar4, a9, eVar, a9), 22));
        return jVar;
    }

    public ApplicationInfo d(int i3, String str) {
        return this.f1772d.getPackageManager().getApplicationInfo(str, i3);
    }

    public PackageInfo e(int i3, String str) {
        return this.f1772d.getPackageManager().getPackageInfo(str, i3);
    }

    public boolean f() {
        String nameForUid;
        boolean isInstantApp;
        Context context = this.f1772d;
        if (Binder.getCallingUid() == Process.myUid()) {
            return i7.a.W(context);
        }
        if (!g7.b.b() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface g(p2.x xVar) {
        int i3;
        String str;
        int i10;
        Context context = this.f1772d;
        if (!(xVar instanceof p2.x)) {
            return null;
        }
        xVar.getClass();
        ThreadLocal threadLocal = g3.k.f4259a;
        Typeface a9 = context.isRestricted() ? null : g3.k.a(context, R.font.chewy, new TypedValue(), 0, null, false);
        a9.getClass();
        List list = xVar.f7652b.f7641a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            ThreadLocal threadLocal2 = p2.z.f7653a;
            if (a9 == null) {
                return null;
            }
            if (!list.isEmpty()) {
                ThreadLocal threadLocal3 = p2.z.f7653a;
                Paint paint = (Paint) threadLocal3.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal3.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(a9);
                x2.e d10 = i7.a.d(context);
                if (i11 >= 31) {
                    i10 = context.getResources().getConfiguration().fontWeightAdjustment;
                    if (i10 != Integer.MAX_VALUE) {
                        i3 = context.getResources().getConfiguration().fontWeightAdjustment;
                        if (i3 != 0) {
                            str = z2.a.a(list, null, new m2.u(d10), 31);
                        } else {
                            if (list.size() > 0) {
                                list.get(0).getClass();
                                i0.j();
                                return null;
                            }
                            float b10 = be.f.b(i3 + 400.0f, 1.0f, 1000.0f);
                            str = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + b10;
                        }
                        paint.setFontVariationSettings(str);
                        return paint.getTypeface();
                    }
                }
                i3 = 0;
                if (i3 != 0) {
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        return a9;
    }

    public /* synthetic */ o(Context context, char c10) {
        this.f1772d = context;
    }
}
