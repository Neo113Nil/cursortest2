package i3;

import M2.C0250b;
import M2.C0251c;
import M2.C0254f;
import M2.C0256h;
import M2.C0257i;
import M2.C0258j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.C1322B;
import y2.C1323C;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final A2.e f7046a;

    static {
        A2.e builder = new A2.e();
        C0256h a4 = M2.F.a(String.class);
        Intrinsics.checkNotNullParameter(M2.I.f3583a, "<this>");
        builder.put(a4, a0.f7055a);
        C0256h a5 = M2.F.a(Character.TYPE);
        Intrinsics.checkNotNullParameter(C0254f.f3596a, "<this>");
        builder.put(a5, C0692m.f7089a);
        builder.put(M2.F.a(char[].class), C0691l.f7087c);
        C0256h a6 = M2.F.a(Double.TYPE);
        Intrinsics.checkNotNullParameter(C0257i.f3602a, "<this>");
        builder.put(a6, C0696q.f7101a);
        builder.put(M2.F.a(double[].class), C0695p.f7100c);
        C0256h a7 = M2.F.a(Float.TYPE);
        Intrinsics.checkNotNullParameter(C0258j.f3603a, "<this>");
        builder.put(a7, C0700v.f7113a);
        builder.put(M2.F.a(float[].class), C0699u.f7112c);
        C0256h a8 = M2.F.a(Long.TYPE);
        Intrinsics.checkNotNullParameter(M2.q.f3608a, "<this>");
        builder.put(a8, H.f7018a);
        builder.put(M2.F.a(long[].class), G.f7017c);
        C0256h a9 = M2.F.a(y2.y.class);
        Intrinsics.checkNotNullParameter(y2.y.f11688e, "<this>");
        builder.put(a9, j0.f7081a);
        C0256h a10 = M2.F.a(Integer.TYPE);
        Intrinsics.checkNotNullParameter(M2.n.f3606a, "<this>");
        builder.put(a10, B.f7009a);
        builder.put(M2.F.a(int[].class), A.f7008c);
        C0256h a11 = M2.F.a(y2.w.class);
        Intrinsics.checkNotNullParameter(y2.w.f11685e, "<this>");
        builder.put(a11, g0.f7073a);
        C0256h a12 = M2.F.a(Short.TYPE);
        Intrinsics.checkNotNullParameter(M2.H.f3582a, "<this>");
        builder.put(a12, Z.f7053a);
        builder.put(M2.F.a(short[].class), Y.f7052c);
        C0256h a13 = M2.F.a(C1322B.class);
        Intrinsics.checkNotNullParameter(C1322B.f11655e, "<this>");
        builder.put(a13, m0.f7091a);
        C0256h a14 = M2.F.a(Byte.TYPE);
        Intrinsics.checkNotNullParameter(C0251c.f3588a, "<this>");
        builder.put(a14, C0688i.f7078a);
        builder.put(M2.F.a(byte[].class), C0687h.f7075c);
        C0256h a15 = M2.F.a(y2.u.class);
        Intrinsics.checkNotNullParameter(y2.u.f11682e, "<this>");
        builder.put(a15, d0.f7063a);
        C0256h a16 = M2.F.a(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(C0250b.f3587a, "<this>");
        builder.put(a16, C0685f.f7068a);
        builder.put(M2.F.a(boolean[].class), C0684e.f7065c);
        C0256h a17 = M2.F.a(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f7487a, "<this>");
        builder.put(a17, n0.f7094b);
        builder.put(M2.F.a(Void.class), J.f7021a);
        try {
            C0256h a18 = M2.F.a(kotlin.time.a.class);
            Intrinsics.checkNotNullParameter(kotlin.time.a.f7548e, "<this>");
            builder.put(a18, r.f7103a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            builder.put(M2.F.a(y2.z.class), i0.f7080c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            builder.put(M2.F.a(y2.x.class), f0.f7070c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            builder.put(M2.F.a(C1323C.class), l0.f7088c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            builder.put(M2.F.a(y2.v.class), c0.f7060c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            C0256h a19 = M2.F.a(V2.a.class);
            Intrinsics.checkNotNullParameter(V2.a.f4185i, "<this>");
            builder.put(a19, o0.f7098a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.c();
        builder.f831s = true;
        if (builder.f827o <= 0) {
            builder = A2.e.f818u;
            Intrinsics.d(builder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        f7046a = builder;
    }
}
