package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;
import defpackage.a3;
import defpackage.aq;
import defpackage.bl;
import defpackage.c51;
import defpackage.d31;
import defpackage.d4;
import defpackage.dd0;
import defpackage.e61;
import defpackage.gi0;
import defpackage.h70;
import defpackage.hl;
import defpackage.i11;
import defpackage.ji0;
import defpackage.ke1;
import defpackage.m01;
import defpackage.m90;
import defpackage.n01;
import defpackage.oj;
import defpackage.op;
import defpackage.p2;
import defpackage.p4;
import defpackage.q4;
import defpackage.r4;
import defpackage.s3;
import defpackage.s6;
import defpackage.ss;
import defpackage.t4;
import defpackage.t51;
import defpackage.ts;
import defpackage.u4;
import defpackage.u51;
import defpackage.v4;
import defpackage.v51;
import defpackage.x50;
import defpackage.y3;
import defpackage.yl;
import defpackage.zl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lm01;", "Lvg0;", "getLocalLifecycleOwner", "()Lm01;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui"}, k = 2, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final zl a = new zl(p2.g);
    public static final ke1 b = new ke1(p2.h);
    public static final zl c = new zl(y3.h);
    public static final ke1 d = new ke1(p2.i);
    public static final ke1 e = new ke1(p2.j);
    public static final ke1 f = new ke1(p2.k);

    public static final void a(d4 d4Var, Function2 function2, hl hlVar, int i) {
        boolean z;
        hlVar.Y(-520299287);
        int i2 = (hlVar.h(d4Var) ? 4 : 2) | i | (hlVar.h(function2) ? 32 : 16);
        int i3 = 1;
        if (hlVar.O(i2 & 1, (i2 & 19) != 18)) {
            Context context = d4Var.getContext();
            Object L = hlVar.L();
            Object obj = bl.a;
            if (L == obj) {
                L = new s6(context);
                hlVar.h0(L);
            }
            s6 s6Var = (s6) L;
            s3 viewTreeOwners = d4Var.getViewTreeOwners();
            if (viewTreeOwners == null) {
                dd0.j("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            e61 e61Var = viewTreeOwners.b;
            Object L2 = hlVar.L();
            if (L2 == obj) {
                Object parent = d4Var.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = t51.class.getSimpleName() + ':' + str;
                c51 a2 = e61Var.a();
                Bundle d2 = a2.d(str2);
                if (d2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : d2.keySet()) {
                        ArrayList parcelableArrayList = d2.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                y3 y3Var = y3.q;
                ke1 ke1Var = v51.a;
                u51 u51Var = new u51(linkedHashMap, y3Var);
                try {
                    a2.k(str2, new oj(i3, u51Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object ssVar = new ss(u51Var, new ts(z, a2, str2));
                hlVar.h0(ssVar);
                L2 = ssVar;
            }
            Object obj2 = (ss) L2;
            Unit unit = Unit.a;
            boolean h = hlVar.h(obj2);
            Object L3 = hlVar.L();
            if (h || L3 == obj) {
                L3 = new a3(5, obj2);
                hlVar.h0(L3);
            }
            p4.b(unit, (Function1) L3, hlVar);
            Object L4 = hlVar.L();
            if (L4 == obj) {
                if (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) {
                    L4 = new aq();
                } else {
                    d4Var.getView();
                    L4 = new aq();
                }
                hlVar.h0(L4);
            }
            x50 x50Var = (x50) L4;
            Configuration configuration = d4Var.getConfiguration();
            Object L5 = hlVar.L();
            if (L5 == obj) {
                L5 = new h70();
                hlVar.h0(L5);
            }
            h70 h70Var = (h70) L5;
            Object L6 = hlVar.L();
            Object obj3 = L6;
            if (L6 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                hlVar.h0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object L7 = hlVar.L();
            if (L7 == obj) {
                L7 = new u4(configuration3, h70Var);
                hlVar.h0(L7);
            }
            u4 u4Var = (u4) L7;
            boolean h2 = hlVar.h(context);
            Object L8 = hlVar.L();
            if (h2 || L8 == obj) {
                L8 = new t4(context, 0, u4Var);
                hlVar.h0(L8);
            }
            p4.b(h70Var, (Function1) L8, hlVar);
            Object L9 = hlVar.L();
            if (L9 == obj) {
                L9 = new d31();
                hlVar.h0(L9);
            }
            d31 d31Var = (d31) L9;
            Object L10 = hlVar.L();
            if (L10 == obj) {
                L10 = new v4(d31Var);
                hlVar.h0(L10);
            }
            v4 v4Var = (v4) L10;
            boolean h3 = hlVar.h(context);
            Object L11 = hlVar.L();
            if (h3 || L11 == obj) {
                L11 = new t4(context, 1, v4Var);
                hlVar.h0(L11);
            }
            p4.b(d31Var, (Function1) L11, hlVar);
            m01 m01Var = yl.v;
            op.b(new n01[]{a.a(d4Var.getConfiguration()), b.a(context), gi0.a.a(viewTreeOwners.a), ji0.a.a(e61Var), v51.a.a(obj2), f.a(d4Var.getView()), d.a(h70Var), e.a(d31Var), m01Var.a(Boolean.valueOf(((Boolean) hlVar.j(m01Var)).booleanValue() | d4Var.getScrollCaptureInProgress$ui())), yl.l.a(x50Var)}, m90.J(1059770793, new q4(d4Var, s6Var, function2), hlVar), hlVar, 56);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new r4(d4Var, function2, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final m01 getLocalLifecycleOwner() {
        return gi0.a;
    }
}
