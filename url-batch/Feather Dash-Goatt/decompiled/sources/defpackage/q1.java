package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ q1(int i, rf0 rf0Var) {
        this.d = 16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object j31Var;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                return Unit.a;
            case 4:
                kw0 kw0Var = (kw0) obj;
                ke1 ke1Var = AndroidCompositionLocals_androidKt.b;
                kw0Var.getClass();
                if (((Context) m90.I(kw0Var, ke1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return me.b;
                }
                ke.a.getClass();
                return je.c;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof ln) {
                    return (ln) element;
                }
                return null;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                synchronized (pb1.c) {
                    List list = pb1.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) list.get(i)).invoke(obj);
                    }
                }
                return Unit.a;
            case 9:
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                List a = matchResult.a();
                try {
                    i31 i31Var = k31.d;
                    j31Var = new ia(Long.parseLong((String) a.get(1)), ds.valueOf((String) a.get(2)), Integer.parseInt((String) a.get(3)), Integer.parseInt((String) a.get(4)), ja.valueOf((String) a.get(5)));
                } catch (Throwable th) {
                    i31 i31Var2 = k31.d;
                    j31Var = new j31(th);
                }
                return (ia) (j31Var instanceof j31 ? null : j31Var);
            case RequestError.STOP_TRACKING /* 11 */:
                String str = (String) obj;
                str.getClass();
                return "\"" + str + "\"";
            case 12:
                ia iaVar = (ia) obj;
                iaVar.getClass();
                return "{\"t\":" + iaVar.a + ",\"d\":\"" + iaVar.b.name() + "\",\"s\":" + iaVar.c + ",\"f\":" + iaVar.d + ",\"r\":\"" + iaVar.e.name() + "\"}";
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return "\"" + ((String) entry.getKey()) + "\":" + ((Number) entry.getValue()).intValue();
            case 14:
                return Unit.a;
            case 15:
                List list2 = (List) obj;
                return new wf0(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 16:
                return Unit.a;
            case 17:
                ((Long) obj).longValue();
                return Unit.a;
            case 18:
                qu0 qu0Var = (qu0) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(qu0Var.b);
                sb.append(", ");
                return qy0.m(sb, qu0Var.c, ')');
            case 19:
                ce ceVar = ((gp0) obj).a;
                if (ceVar != null) {
                    ceVar.invoke();
                }
                return Unit.a;
            case 20:
                throw qy0.h(obj);
            case 21:
                kw0 kw0Var2 = (kw0) obj;
                int i2 = v5.a;
                ke1 ke1Var2 = AndroidCompositionLocals_androidKt.b;
                kw0Var2.getClass();
                Context context = (Context) m90.I(kw0Var2, ke1Var2);
                nr nrVar = (nr) m90.I(kw0Var2, yl.h);
                au0 au0Var = (au0) m90.I(kw0Var2, bu0.a);
                if (au0Var == null) {
                    return null;
                }
                return new j5(context, nrVar, au0Var.a, au0Var.b);
            case 22:
                throw qy0.h(obj);
            case 23:
                throw qy0.h(obj);
            case 24:
                throw qy0.h(obj);
            case 25:
                throw qy0.h(obj);
            case 26:
                jc0 jc0Var = (jc0) obj;
                jc0Var.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                jc0Var.a(valueOf, 300).b = pm0.a;
                jc0Var.a(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                jc0Var.a(valueOf2, 1800);
                jc0Var.a(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                jc0Var.a(valueOf3, 3300);
                jc0Var.a(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                jc0Var.a(valueOf4, 4800);
                jc0Var.a(valueOf4, 6000);
                return Unit.a;
            case 27:
                qz0 qz0Var = qz0.c;
                dc0[] dc0VarArr = s81.a;
                t81 t81Var = p81.c;
                dc0 dc0Var = s81.a[1];
                ((u81) obj).a(t81Var, qz0Var);
                return Unit.a;
            case 28:
                return new r51((Map) obj);
            default:
                return obj;
        }
    }

    public /* synthetic */ q1(int i) {
        this.d = i;
    }

    public /* synthetic */ q1(pr prVar) {
        this.d = 25;
    }
}
