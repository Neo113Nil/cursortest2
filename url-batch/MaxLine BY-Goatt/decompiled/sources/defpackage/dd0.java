package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dd0 extends z92 implements Function2 {
    public m22 n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ c82 r;
    public final /* synthetic */ c82 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(c82 c82Var, c82 c82Var2, o30 o30Var) {
        super(o30Var);
        this.r = c82Var;
        this.s = c82Var2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        dd0 dd0Var = new dd0(this.r, this.s, o30Var);
        dd0Var.q = obj;
        return dd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dd0) create((ur2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1 A[EDGE_INSN: B:67:0x00c1->B:13:0x00c1 BREAK  A[LOOP:0: B:7:0x00ae->B:10:0x00be], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a2 -> B:6:0x00a5). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        int i;
        Object obj2;
        Object a;
        ur2 ur2Var2;
        m22 m22Var;
        int size;
        int i2;
        boolean d;
        Object obj3;
        Object obj4;
        b50 b50Var = b50.m;
        int i3 = this.p;
        int i4 = 2;
        m22 m22Var2 = null;
        if (i3 == 0) {
            ca2.b(obj);
            ur2Var = (ur2) this.q;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i3 == 1) {
                i = this.o;
                ur2Var = (ur2) this.q;
                ca2.b(obj);
                obj2 = obj;
                m22 m22Var3 = (m22) obj2;
                List list = m22Var3.a;
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        i = 1;
                        break;
                    }
                    if (!s93.B((t22) list.get(i5))) {
                        break;
                    }
                    i5++;
                }
                List list2 = m22Var3.a;
                int size3 = list2.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    t22 t22Var = (t22) list2.get(i6);
                    if (t22Var.b() || s93.I(t22Var, ur2Var.r.K, ur2Var.b())) {
                        break;
                    }
                }
                n22 n22Var = n22.o;
                this.q = ur2Var;
                this.n = m22Var3;
                this.o = i;
                this.p = i4;
                a = ur2Var.a(n22Var, this);
                if (a != b50Var) {
                    ur2Var2 = ur2Var;
                    m22Var = m22Var3;
                    List list3 = ((m22) a).a;
                    size = list3.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    c82 c82Var = this.r;
                    d = gd0.d(m22Var, ((t22) c82Var.m).a);
                    List list4 = m22Var.a;
                    c82 c82Var2 = this.s;
                    if (d) {
                    }
                    ur2Var = ur2Var2;
                    i4 = 2;
                    m22Var2 = null;
                    if (i == 0) {
                    }
                }
                return b50Var;
            }
            if (i3 != 2) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.o;
            m22Var = this.n;
            ur2Var2 = (ur2) this.q;
            ca2.b(obj);
            a = obj;
            List list32 = ((m22) a).a;
            size = list32.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((t22) list32.get(i2)).b()) {
                    i = 1;
                    break;
                }
                i2++;
            }
            c82 c82Var3 = this.r;
            d = gd0.d(m22Var, ((t22) c82Var3.m).a);
            List list42 = m22Var.a;
            c82 c82Var22 = this.s;
            if (d) {
                int size4 = list42.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list42.get(i7);
                    c82 c82Var4 = c82Var3;
                    if (s22.a(((t22) obj3).a, ((t22) c82Var3.m).a)) {
                        break;
                    }
                    i7++;
                    c82Var3 = c82Var4;
                }
                c82Var22.m = obj3;
            } else {
                int size5 = list42.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list42.get(i8);
                    if (((t22) obj4).d) {
                        break;
                    }
                    i8++;
                }
                t22 t22Var2 = (t22) obj4;
                if (t22Var2 != null) {
                    c82Var3.m = t22Var2;
                    c82Var22.m = t22Var2;
                } else {
                    i = 1;
                    ur2Var = ur2Var2;
                    m22Var2 = null;
                    if (i == 0) {
                        return Unit.a;
                    }
                    n22 n22Var2 = n22.n;
                    this.q = ur2Var;
                    this.n = m22Var2;
                    this.o = i;
                    this.p = 1;
                    obj2 = ur2Var.a(n22Var2, this);
                }
            }
            ur2Var = ur2Var2;
            i4 = 2;
            m22Var2 = null;
            if (i == 0) {
            }
        }
    }
}
