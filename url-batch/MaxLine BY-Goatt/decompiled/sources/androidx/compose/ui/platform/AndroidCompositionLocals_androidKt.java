package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.majelw.libystne.R;
import defpackage.a00;
import defpackage.a11;
import defpackage.ac;
import defpackage.bp2;
import defpackage.c2;
import defpackage.e80;
import defpackage.fc0;
import defpackage.gc0;
import defpackage.h7;
import defpackage.hc0;
import defpackage.hx0;
import defpackage.ij2;
import defpackage.j6;
import defpackage.k8;
import defpackage.l41;
import defpackage.l8;
import defpackage.ld2;
import defpackage.lh;
import defpackage.m8;
import defpackage.md2;
import defpackage.mf1;
import defpackage.n72;
import defpackage.n8;
import defpackage.n92;
import defpackage.nd2;
import defpackage.o3;
import defpackage.p00;
import defpackage.p8;
import defpackage.pf1;
import defpackage.q8;
import defpackage.r00;
import defpackage.r8;
import defpackage.sz;
import defpackage.t52;
import defpackage.t7;
import defpackage.wd2;
import defpackage.ye;
import defpackage.yj1;
import defpackage.yk3;
import defpackage.zd2;
import defpackage.zn1;
import defpackage.zr1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final r00 a = new r00(k8.n);
    public static final bp2 b = new bp2(k8.o);
    public static final r00 c = new r00(o3.r);
    public static final bp2 d = new bp2(k8.p);
    public static final bp2 e = new bp2(k8.q);
    public static final bp2 f = new bp2(k8.r);

    public static final void a(t7 t7Var, Function2 function2, a00 a00Var, int i) {
        boolean z;
        a00Var.Z(-520299287);
        int i2 = (a00Var.h(t7Var) ? 4 : 2) | i | (a00Var.h(function2) ? 32 : 16);
        int i3 = 0;
        if (a00Var.P(i2 & 1, (i2 & 19) != 18)) {
            Context context = t7Var.getContext();
            Object M = a00Var.M();
            Object obj = sz.a;
            if (M == obj) {
                M = ij2.j(new Configuration(context.getResources().getConfiguration()));
                a00Var.i0(M);
            }
            zn1 zn1Var = (zn1) M;
            Object M2 = a00Var.M();
            if (M2 == obj) {
                M2 = new l8(zn1Var, i3);
                a00Var.i0(M2);
            }
            t7Var.setConfigurationChangeObserver((Function1) M2);
            Object M3 = a00Var.M();
            if (M3 == obj) {
                M3 = new ac();
                a00Var.i0(M3);
            }
            ac acVar = (ac) M3;
            h7 viewTreeOwners = t7Var.getViewTreeOwners();
            if (viewTreeOwners == null) {
                lh.g("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            zd2 zd2Var = viewTreeOwners.b;
            Object M4 = a00Var.M();
            if (M4 == obj) {
                Object parent = t7Var.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = ld2.class.getSimpleName() + ':' + str;
                wd2 savedStateRegistry = zd2Var.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a2.keySet()) {
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                o3 o3Var = o3.M;
                bp2 bp2Var = nd2.a;
                md2 md2Var = new md2(linkedHashMap, o3Var);
                try {
                    savedStateRegistry.c(str2, new gc0(0, md2Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object fc0Var = new fc0(md2Var, new hc0(z, savedStateRegistry, str2));
                a00Var.i0(fc0Var);
                M4 = fc0Var;
            }
            Object obj2 = (fc0) M4;
            Unit unit = Unit.a;
            boolean h = a00Var.h(obj2);
            Object M5 = a00Var.M();
            if (h || M5 == obj) {
                M5 = new j6(3, obj2);
                a00Var.i0(M5);
            }
            l41.f(unit, (Function1) M5, a00Var);
            Object M6 = a00Var.M();
            if (M6 == obj) {
                M6 = c2.f(context) ? new e80(t7Var.getView(), 0) : new zr1();
                a00Var.i0(M6);
            }
            hx0 hx0Var = (hx0) M6;
            Configuration configuration = (Configuration) zn1Var.getValue();
            Object M7 = a00Var.M();
            if (M7 == obj) {
                M7 = new a11();
                a00Var.i0(M7);
            }
            a11 a11Var = (a11) M7;
            Object M8 = a00Var.M();
            Object obj3 = M8;
            if (M8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                a00Var.i0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object M9 = a00Var.M();
            if (M9 == obj) {
                M9 = new q8(configuration3, a11Var);
                a00Var.i0(M9);
            }
            q8 q8Var = (q8) M9;
            boolean h2 = a00Var.h(context);
            Object M10 = a00Var.M();
            if (h2 || M10 == obj) {
                M10 = new p8(0, context, q8Var);
                a00Var.i0(M10);
            }
            l41.f(a11Var, (Function1) M10, a00Var);
            Object M11 = a00Var.M();
            if (M11 == obj) {
                M11 = new n92();
                a00Var.i0(M11);
            }
            n92 n92Var = (n92) M11;
            Object M12 = a00Var.M();
            if (M12 == obj) {
                M12 = new r8(n92Var);
                a00Var.i0(M12);
            }
            r8 r8Var = (r8) M12;
            boolean h3 = a00Var.h(context);
            Object M13 = a00Var.M();
            if (h3 || M13 == obj) {
                M13 = new p8(1, context, r8Var);
                a00Var.i0(M13);
            }
            l41.f(n92Var, (Function1) M13, a00Var);
            t52 t52Var = p00.v;
            yk3.c(new ye[]{a.a((Configuration) zn1Var.getValue()), b.a(context), mf1.a.a(viewTreeOwners.a), pf1.a.a(zd2Var), nd2.a.a(obj2), f.a(t7Var.getView()), d.a(a11Var), e.a(n92Var), t52Var.a(Boolean.valueOf(((Boolean) a00Var.j(t52Var)).booleanValue() | t7Var.getScrollCaptureInProgress$ui_release())), p00.l.a(hx0Var)}, yj1.H(1059770793, new m8(t7Var, acVar, function2, 0), a00Var), a00Var, 56);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new n8(i, 0, t7Var, function2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final t52 getLocalSavedStateRegistryOwner() {
        return pf1.a;
    }
}
