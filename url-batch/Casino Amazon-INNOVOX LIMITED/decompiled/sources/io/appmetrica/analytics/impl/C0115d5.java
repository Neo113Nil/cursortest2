package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0115d5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0063b5 f1209a;
    public final C0089c5 b;
    protected final Context c;
    public final R4 d;
    public final C0420p4 e;
    public final W4 f;
    protected final C0209gm g;
    public final InterfaceC0255ih h;
    public final I8 i;
    public final ICommonExecutor j;
    public final Gb k;
    public final InterfaceC0524t9 l;
    public final int m;

    public C0115d5(Context context, R4 r4, C0420p4 c0420p4, W4 w4, C0209gm c0209gm, InterfaceC0255ih interfaceC0255ih, ICommonExecutor iCommonExecutor, int i, Gb gb, InterfaceC0524t9 interfaceC0524t9) {
        this(context, r4, c0420p4, w4, c0209gm, interfaceC0255ih, iCommonExecutor, new I8(), i, new C0063b5(c0420p4.f1425a), new C0089c5(context, r4), gb, interfaceC0524t9);
    }

    public static Y8 c(Y4 y4) {
        return new Y8(y4);
    }

    public final N8 a() {
        Context context = this.c;
        R4 r4 = this.d;
        return new N8(new S8(context, r4), this.m);
    }

    public final M6 b(Y4 y4) {
        return new M6(y4, C0401oa.I.B().c(this.c, this.d), new I6(y4.c()), new C0194g7());
    }

    public final C0063b5 d() {
        return this.f1209a;
    }

    public final C0089c5 e() {
        return this.b;
    }

    public final yo f() {
        yo yoVar;
        Co c0094ca;
        Bo D = C0401oa.I.D();
        R4 r4 = this.d;
        synchronized (D) {
            String valueOf = String.valueOf(r4);
            LinkedHashMap linkedHashMap = D.b;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                Xe xe = new Xe(C0401oa.I.B().b(D.f782a, r4));
                if (r4.d()) {
                    String str = "appmetrica_vital_" + r4.b + ".dat";
                    c0094ca = new C0218h5(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(str, new C0094ca(D.f782a, str)), TuplesKt.to("appmetrica_vital_main.dat", new C0094ca(D.f782a, "appmetrica_vital_main.dat"))}));
                } else {
                    c0094ca = new C0094ca(D.f782a, "appmetrica_vital_" + r4.b + ".dat");
                }
                obj = new yo(xe, c0094ca, valueOf);
                linkedHashMap.put(valueOf, obj);
            }
            yoVar = (yo) obj;
        }
        return yoVar;
    }

    public C0115d5(Context context, R4 r4, C0420p4 c0420p4, W4 w4, C0209gm c0209gm, InterfaceC0255ih interfaceC0255ih, ICommonExecutor iCommonExecutor, I8 i8, int i, C0063b5 c0063b5, C0089c5 c0089c5, Gb gb, InterfaceC0524t9 interfaceC0524t9) {
        this.c = context;
        this.d = r4;
        this.e = c0420p4;
        this.f = w4;
        this.g = c0209gm;
        this.h = interfaceC0255ih;
        this.j = iCommonExecutor;
        this.i = i8;
        this.m = i;
        this.f1209a = c0063b5;
        this.b = c0089c5;
        this.k = gb;
        this.l = interfaceC0524t9;
    }

    public final Kk c() {
        return new Kk(this.c, this.d);
    }

    public final C0608wi d(Y4 y4) {
        C0608wi c0608wi = new C0608wi(y4, this.f.a(), this.j);
        Gb gb = this.k;
        synchronized (gb) {
            gb.c.add(c0608wi);
        }
        return c0608wi;
    }

    public final Rg a(Y4 y4) {
        return new Rg(new C0281jh(y4, this.h, new D3()), this.g, new C0204gh(this.e));
    }

    public static Sk a(Y4 y4, yo yoVar, X4 x4) {
        Rk rk = new Rk(yoVar);
        return new Sk(y4, rk, x4, new C0249ia(y4, rk, new Vk(y4.h(), C0249ia.g), AbstractC0641y1.a(), new SystemTimeProvider()), new A2(y4, rk, new Vk(y4.h(), "background"), AbstractC0641y1.a(), new SystemTimeProvider()));
    }

    public static T4 b() {
        return new T4();
    }

    public final C0369n3 b(Xe xe) {
        Context context = this.c;
        return new C0369n3(context, xe, context.getPackageName(), new SafePackageManager());
    }

    public final C0325l9 a(Xe xe, yo yoVar, Sk sk, M6 m6, C0264j0 c0264j0, Kk kk, C0608wi c0608wi) {
        return new C0325l9(xe, yoVar, sk, m6, c0264j0, this.i, kk, this.m, new C0037a5(c0608wi), new SystemTimeProvider());
    }

    public static C0558ui a(Y4 y4, Y8 y8) {
        return new C0558ui(y8, y4);
    }

    public InterfaceC0474r9 a(InterfaceC0599w9 interfaceC0599w9, M6 m6, Rg rg, C0420p4 c0420p4, R4 r4, Xe xe) {
        return this.l.a(interfaceC0599w9, m6, rg, c0420p4, r4, xe).a();
    }

    public final C0443q2 a(Xe xe) {
        return new C0443q2(this.d, xe);
    }
}
