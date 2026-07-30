package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.m0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ a0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String concat;
        StringBuilder sb;
        int i;
        switch (this.m) {
            case 0:
                return obj == ((b0) this.n) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                m0 m0Var = (m0) this.n;
                Map.Entry entry = (Map.Entry) obj;
                m0.a aVar = m0.o;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == m0Var ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != m0Var ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                ((ob0) this.n).w = true;
                return Unit.a;
            case 3:
                pf0 pf0Var = (pf0) obj;
                String str = ((pf0) this.n) == pf0Var ? " > " : "   ";
                if (pf0Var instanceof yw) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    yw ywVar = (yw) pf0Var;
                    sb.append(ywVar.a.n.length());
                    sb.append(", newCursorPosition=");
                    i = ywVar.b;
                } else {
                    if (!(pf0Var instanceof lj2)) {
                        if (pf0Var instanceof kj2) {
                            concat = ((kj2) pf0Var).toString();
                        } else if (pf0Var instanceof w90) {
                            concat = ((w90) pf0Var).toString();
                        } else if (pf0Var instanceof x90) {
                            concat = ((x90) pf0Var).toString();
                        } else if (pf0Var instanceof nj2) {
                            concat = ((nj2) pf0Var).toString();
                        } else if (pf0Var instanceof am0) {
                            concat = "FinishComposingTextCommand()";
                        } else if (pf0Var instanceof v90) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String c = d82.a(pf0Var.getClass()).c();
                            if (c == null) {
                                c = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(c);
                        }
                        return str.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    lj2 lj2Var = (lj2) pf0Var;
                    sb.append(lj2Var.a.n.length());
                    sb.append(", newCursorPosition=");
                    i = lj2Var.b;
                }
                concat = q40.o(sb, i, ')');
                return str.concat(concat);
            case 4:
                g13 g13Var = (g13) obj;
                return ((jp0) this.n).a(new g13(null, g13Var.b, g13Var.c, g13Var.d, g13Var.e)).getValue();
            case 5:
                nh nhVar = (nh) this.n;
                ik ikVar = (ik) obj;
                ikVar.getClass();
                return ikVar.c(nhVar);
            case 6:
                return ((o0) this.n).b(((Integer) obj).intValue());
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((qo1) this.n).b(null);
                return Unit.a;
            case 8:
                ((k00) this.n).y(obj);
                return Unit.a;
            case 9:
                r72 r72Var = (r72) this.n;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (r72Var.b) {
                    try {
                        g61 g61Var = r72Var.c;
                        if (g61Var != null) {
                            vo2 vo2Var = r72Var.t;
                            o72 o72Var = o72.n;
                            vo2Var.getClass();
                            vo2Var.j(null, o72Var);
                            g61Var.f(cancellationException);
                            r72Var.q = null;
                            g61Var.o(new ek(7, r72Var, th));
                        } else {
                            r72Var.d = cancellationException;
                            vo2 vo2Var2 = r72Var.t;
                            o72 o72Var2 = o72.m;
                            vo2Var2.getClass();
                            vo2Var2.j(null, o72Var2);
                            Unit unit = Unit.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.a;
            case 10:
                ib2 ib2Var = (ib2) this.n;
                zs0 zs0Var = (zs0) obj;
                zs0Var.getClass();
                ib2Var.g = zs0Var;
                return Unit.a;
            case 11:
                ld2 ld2Var = ((kd2) this.n).o;
                return Boolean.valueOf(ld2Var != null ? ld2Var.a(obj) : true);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                e4 e4Var = (e4) this.n;
                obj.getClass();
                return e4Var.invoke();
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                nm2 nm2Var = (nm2) ((Function1) this.n).invoke((rm2) obj);
                synchronized (tm2.c) {
                    tm2.d = tm2.d.e(nm2Var.g());
                    Unit unit2 = Unit.a;
                }
                return nm2Var;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                un1 un1Var = (un1) this.n;
                if (obj instanceof zo2) {
                    ((zo2) obj).g(4);
                }
                un1Var.a(obj);
                return Unit.a;
            default:
                hn2 hn2Var = (hn2) this.n;
                synchronized (hn2Var.g) {
                    gn2 gn2Var = hn2Var.i;
                    gn2Var.getClass();
                    Object obj2 = gn2Var.b;
                    obj2.getClass();
                    int i2 = gn2Var.d;
                    hn1 hn1Var = gn2Var.c;
                    if (hn1Var == null) {
                        hn1Var = new hn1();
                        gn2Var.c = hn1Var;
                        gn2Var.f.m(obj2, hn1Var);
                        Unit unit3 = Unit.a;
                    }
                    gn2Var.c(obj, i2, obj2, hn1Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ a0(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
    }
}
