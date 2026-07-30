package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class wnqUPcAvl7HT implements le0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ wnqUPcAvl7HT(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        hy1 amuv7NJvPxHu;
        cg0 cg0Var = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                n61 n61Var = Y2PHjkwWz56c.PxuCJdSBwIXG;
                return no2.PxuCJdSBwIXG;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                return Boolean.valueOf(!(((p8) obj) instanceof bj1));
            case 3:
                int i = ed.PxuCJdSBwIXG;
                return no2.PxuCJdSBwIXG;
            case 4:
                ((xw0) obj).PxuCJdSBwIXG();
                return no2.PxuCJdSBwIXG;
            case 5:
                return no2.PxuCJdSBwIXG;
            case 6:
                il1 il1Var = (il1) obj;
                t92 t92Var = h2.lS5Rgt96tfkO;
                il1Var.getClass();
                if (((Context) hq0.BjEWd04qc7Mw(il1Var, t92Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return rf.lS5Rgt96tfkO;
                }
                pf.Companion.getClass();
                return of.TSizfFm2Yiuu;
            case 7:
                ww1.Companion.getClass();
                j32.lS5Rgt96tfkO((l32) obj, 0);
                return no2.PxuCJdSBwIXG;
            case 8:
                return no2.PxuCJdSBwIXG;
            case 9:
                ((ol2) obj).getClass();
                throw new ClassCastException();
            case 10:
                ((ol2) obj).getClass();
                throw new ClassCastException();
            case 11:
                il1 il1Var2 = (il1) obj;
                fq fqVar = hk0.PxuCJdSBwIXG;
                il1Var2.getClass();
                View view = ((sr2) hq0.BjEWd04qc7Mw(il1Var2, fqVar)).PxuCJdSBwIXG;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
                    view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
                }
                return null;
            case 12:
                fu fuVar = (fu) obj;
                if (fuVar instanceof ju) {
                    return (ju) fuVar;
                }
                return null;
            case 13:
                x20 x20Var = y20.Companion;
                return Boolean.TRUE;
            case 14:
                fy1 fy1Var = (fy1) obj;
                fy1Var.getClass();
                amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT * FROM gate_config WHERE id = 0 LIMIT 1");
                try {
                    int S9EYkSpbGuxq = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "id");
                    int S9EYkSpbGuxq2 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "valueSaved");
                    int S9EYkSpbGuxq3 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "customTab");
                    int S9EYkSpbGuxq4 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "customTabLink");
                    if (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                        int i2 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq);
                        boolean z = ((int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq2)) != 0;
                        if (((int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq3)) == 0) {
                            r5 = false;
                        }
                        cg0Var = new cg0(i2, z, r5, amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq4));
                    }
                    return cg0Var;
                } finally {
                }
            case 15:
                synchronized (s72.TSizfFm2Yiuu) {
                    List list = s72.OPXfSBeufaJ8;
                    int size = list.size();
                    while (r6 < size) {
                        ((le0) list.get(r6)).OPXfSBeufaJ8(obj);
                        r6++;
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 16:
                yb1 yb1Var = (yb1) obj;
                yb1Var.getClass();
                yb1Var.lS5Rgt96tfkO = true;
                return no2.PxuCJdSBwIXG;
            case 17:
                yb1 yb1Var2 = (yb1) obj;
                yb1Var2.getClass();
                yb1Var2.lS5Rgt96tfkO = true;
                return no2.PxuCJdSBwIXG;
            case 18:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 19:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 20:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    r5 = false;
                }
                return Boolean.valueOf(r5);
            case 21:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 22:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 23:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 24:
                String str = (String) obj;
                str.getClass();
                if (str.length() != 0) {
                    return String.valueOf(Character.toUpperCase(str.charAt(0)));
                }
                rc1.RAsUl2FVSrh6("Char sequence is empty.");
                return null;
            case 25:
                fy1 fy1Var2 = (fy1) obj;
                fy1Var2.getClass();
                amuv7NJvPxHu = fy1Var2.amuv7NJvPxHu("SELECT * FROM items WHERE rating > 0 ORDER BY name ASC");
                try {
                    int S9EYkSpbGuxq5 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "id");
                    int S9EYkSpbGuxq6 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "name");
                    int S9EYkSpbGuxq7 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "rating");
                    int S9EYkSpbGuxq8 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "description");
                    int S9EYkSpbGuxq9 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "protein");
                    int S9EYkSpbGuxq10 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "origin");
                    int S9EYkSpbGuxq11 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "mood");
                    int S9EYkSpbGuxq12 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "carbs");
                    int S9EYkSpbGuxq13 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "dietary");
                    int S9EYkSpbGuxq14 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "vessel");
                    int S9EYkSpbGuxq15 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "hint");
                    ArrayList arrayList = new ArrayList();
                    while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                        int i3 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq5);
                        String dgRBjINgWbAK = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq6);
                        int i4 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq7);
                        String dgRBjINgWbAK2 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq8);
                        int i5 = S9EYkSpbGuxq6;
                        int i6 = S9EYkSpbGuxq7;
                        int i7 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq9);
                        String dgRBjINgWbAK3 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq10);
                        dgRBjINgWbAK3.getClass();
                        uh1 valueOf = uh1.valueOf(dgRBjINgWbAK3);
                        String dgRBjINgWbAK4 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq11);
                        dgRBjINgWbAK4.getClass();
                        t61 valueOf2 = t61.valueOf(dgRBjINgWbAK4);
                        int i8 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq12);
                        String dgRBjINgWbAK5 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq13);
                        dgRBjINgWbAK5.getClass();
                        a00 valueOf3 = a00.valueOf(dgRBjINgWbAK5);
                        String dgRBjINgWbAK6 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq14);
                        dgRBjINgWbAK6.getClass();
                        arrayList.add(new qs0(i3, dgRBjINgWbAK, i4, dgRBjINgWbAK2, i7, valueOf, valueOf2, i8, valueOf3, kq2.valueOf(dgRBjINgWbAK6), amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq15)));
                        S9EYkSpbGuxq6 = i5;
                        S9EYkSpbGuxq7 = i6;
                    }
                    return arrayList;
                } finally {
                }
            case 26:
                fy1 fy1Var3 = (fy1) obj;
                fy1Var3.getClass();
                amuv7NJvPxHu = fy1Var3.amuv7NJvPxHu("SELECT * FROM items ORDER BY name ASC");
                try {
                    int S9EYkSpbGuxq16 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "id");
                    int S9EYkSpbGuxq17 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "name");
                    int S9EYkSpbGuxq18 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "rating");
                    int S9EYkSpbGuxq19 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "description");
                    int S9EYkSpbGuxq20 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "protein");
                    int S9EYkSpbGuxq21 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "origin");
                    int S9EYkSpbGuxq22 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "mood");
                    int S9EYkSpbGuxq23 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "carbs");
                    int S9EYkSpbGuxq24 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "dietary");
                    int S9EYkSpbGuxq25 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "vessel");
                    int S9EYkSpbGuxq26 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "hint");
                    ArrayList arrayList2 = new ArrayList();
                    while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                        int i9 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq16);
                        String dgRBjINgWbAK7 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq17);
                        int i10 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq18);
                        String dgRBjINgWbAK8 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq19);
                        int i11 = S9EYkSpbGuxq17;
                        int i12 = S9EYkSpbGuxq18;
                        int i13 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq20);
                        String dgRBjINgWbAK9 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq21);
                        dgRBjINgWbAK9.getClass();
                        uh1 valueOf4 = uh1.valueOf(dgRBjINgWbAK9);
                        String dgRBjINgWbAK10 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq22);
                        dgRBjINgWbAK10.getClass();
                        t61 valueOf5 = t61.valueOf(dgRBjINgWbAK10);
                        int i14 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq23);
                        String dgRBjINgWbAK11 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq24);
                        dgRBjINgWbAK11.getClass();
                        a00 valueOf6 = a00.valueOf(dgRBjINgWbAK11);
                        String dgRBjINgWbAK12 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq25);
                        dgRBjINgWbAK12.getClass();
                        arrayList2.add(new qs0(i9, dgRBjINgWbAK7, i10, dgRBjINgWbAK8, i13, valueOf4, valueOf5, i14, valueOf6, kq2.valueOf(dgRBjINgWbAK12), amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq26)));
                        S9EYkSpbGuxq17 = i11;
                        S9EYkSpbGuxq18 = i12;
                    }
                    return arrayList2;
                } finally {
                }
            case 27:
                fy1 fy1Var4 = (fy1) obj;
                fy1Var4.getClass();
                amuv7NJvPxHu = fy1Var4.amuv7NJvPxHu("SELECT COUNT(*) FROM items");
                try {
                    r6 = amuv7NJvPxHu.tmVwIGCQF4zR() ? (int) amuv7NJvPxHu.getLong(0) : 0;
                    amuv7NJvPxHu.close();
                    return Integer.valueOf(r6);
                } finally {
                }
            case 28:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                dk.PxuCJdSBwIXG(dkVar, "JsonPrimitive", new rt0(new kb(19)));
                dk.PxuCJdSBwIXG(dkVar, "JsonNull", new rt0(new kb(20)));
                dk.PxuCJdSBwIXG(dkVar, "JsonLiteral", new rt0(new kb(21)));
                dk.PxuCJdSBwIXG(dkVar, "JsonObject", new rt0(new kb(22)));
                dk.PxuCJdSBwIXG(dkVar, "JsonArray", new rt0(new kb(23)));
                return no2.PxuCJdSBwIXG;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                lS5Rgt96tfkO ls5rgt96tfko = (lS5Rgt96tfkO) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ga2.PxuCJdSBwIXG(sb, str2);
                sb.append(':');
                sb.append(ls5rgt96tfko);
                return sb.toString();
        }
    }

    public /* synthetic */ wnqUPcAvl7HT(int i, us0 us0Var) {
        this.rtx2ld2ELZv4 = i;
    }
}
