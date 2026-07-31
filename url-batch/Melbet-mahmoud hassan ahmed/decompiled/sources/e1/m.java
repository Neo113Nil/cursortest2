package e1;

import j1.a;
import java.util.ArrayList;
import java.util.List;
import p1.c;
import r0.n2;
import w0.a0;

/* loaded from: classes.dex */
final class m {

    /* renamed from: d, reason: collision with root package name */
    private static final l4.m f15961d = l4.m.d(':');

    /* renamed from: e, reason: collision with root package name */
    private static final l4.m f15962e = l4.m.d('*');

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f15963a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f15964b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f15965c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15966a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15967b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15968c;

        public a(int i7, long j7, int i8) {
            this.f15966a = i7;
            this.f15967b = j7;
            this.f15968c = i8;
        }
    }

    private void a(w0.m mVar, a0 a0Var) {
        o2.a0 a0Var2 = new o2.a0(8);
        mVar.readFully(a0Var2.d(), 0, 8);
        this.f15965c = a0Var2.p() + 8;
        if (a0Var2.m() != 1397048916) {
            a0Var.f22873a = 0L;
        } else {
            a0Var.f22873a = mVar.p() - (this.f15965c - 12);
            this.f15964b = 2;
        }
    }

    private static int b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw n2.a("Invalid SEF name", null);
        }
    }

    private void d(w0.m mVar, a0 a0Var) {
        long j7;
        long a7 = mVar.a();
        int i7 = (this.f15965c - 12) - 8;
        o2.a0 a0Var2 = new o2.a0(i7);
        mVar.readFully(a0Var2.d(), 0, i7);
        for (int i8 = 0; i8 < i7 / 12; i8++) {
            a0Var2.P(2);
            short r7 = a0Var2.r();
            if (r7 == 2192 || r7 == 2816 || r7 == 2817 || r7 == 2819 || r7 == 2820) {
                this.f15963a.add(new a(r7, (a7 - this.f15965c) - a0Var2.p(), a0Var2.p()));
            } else {
                a0Var2.P(8);
            }
        }
        if (this.f15963a.isEmpty()) {
            j7 = 0;
        } else {
            this.f15964b = 3;
            j7 = this.f15963a.get(0).f15967b;
        }
        a0Var.f22873a = j7;
    }

    private void e(w0.m mVar, List<a.b> list) {
        long p7 = mVar.p();
        int a7 = (int) ((mVar.a() - mVar.p()) - this.f15965c);
        o2.a0 a0Var = new o2.a0(a7);
        mVar.readFully(a0Var.d(), 0, a7);
        for (int i7 = 0; i7 < this.f15963a.size(); i7++) {
            a aVar = this.f15963a.get(i7);
            a0Var.O((int) (aVar.f15967b - p7));
            a0Var.P(4);
            int p8 = a0Var.p();
            int b7 = b(a0Var.z(p8));
            int i8 = aVar.f15968c - (p8 + 8);
            if (b7 == 2192) {
                list.add(f(a0Var, i8));
            } else if (b7 != 2816 && b7 != 2817 && b7 != 2819 && b7 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static p1.c f(o2.a0 a0Var, int i7) {
        ArrayList arrayList = new ArrayList();
        List<String> f7 = f15962e.f(a0Var.z(i7));
        for (int i8 = 0; i8 < f7.size(); i8++) {
            List<String> f8 = f15961d.f(f7.get(i8));
            if (f8.size() != 3) {
                throw n2.a(null, null);
            }
            try {
                arrayList.add(new c.b(Long.parseLong(f8.get(0)), Long.parseLong(f8.get(1)), 1 << (Integer.parseInt(f8.get(2)) - 1)));
            } catch (NumberFormatException e7) {
                throw n2.a(null, e7);
            }
        }
        return new p1.c(arrayList);
    }

    public int c(w0.m mVar, a0 a0Var, List<a.b> list) {
        int i7 = this.f15964b;
        long j7 = 0;
        if (i7 == 0) {
            long a7 = mVar.a();
            if (a7 != -1 && a7 >= 8) {
                j7 = a7 - 8;
            }
            a0Var.f22873a = j7;
            this.f15964b = 1;
        } else if (i7 == 1) {
            a(mVar, a0Var);
        } else if (i7 == 2) {
            d(mVar, a0Var);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            e(mVar, list);
            a0Var.f22873a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f15963a.clear();
        this.f15964b = 0;
    }
}
