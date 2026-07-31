package n2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import n2.n0;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f19480h = new Comparator() { // from class: n2.m0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g7;
            g7 = n0.g((n0.b) obj, (n0.b) obj2);
            return g7;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f19481i = new Comparator() { // from class: n2.l0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h7;
            h7 = n0.h((n0.b) obj, (n0.b) obj2);
            return h7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f19482a;

    /* renamed from: e, reason: collision with root package name */
    private int f19486e;

    /* renamed from: f, reason: collision with root package name */
    private int f19487f;

    /* renamed from: g, reason: collision with root package name */
    private int f19488g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f19484c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f19483b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f19485d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f19489a;

        /* renamed from: b, reason: collision with root package name */
        public int f19490b;

        /* renamed from: c, reason: collision with root package name */
        public float f19491c;

        private b() {
        }
    }

    public n0(int i7) {
        this.f19482a = i7;
    }

    private void d() {
        if (this.f19485d != 1) {
            Collections.sort(this.f19483b, f19480h);
            this.f19485d = 1;
        }
    }

    private void e() {
        if (this.f19485d != 0) {
            Collections.sort(this.f19483b, f19481i);
            this.f19485d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f19489a - bVar2.f19489a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f19491c, bVar2.f19491c);
    }

    public void c(int i7, float f7) {
        b bVar;
        int i8;
        b bVar2;
        int i9;
        d();
        int i10 = this.f19488g;
        if (i10 > 0) {
            b[] bVarArr = this.f19484c;
            int i11 = i10 - 1;
            this.f19488g = i11;
            bVar = bVarArr[i11];
        } else {
            bVar = new b();
        }
        int i12 = this.f19486e;
        this.f19486e = i12 + 1;
        bVar.f19489a = i12;
        bVar.f19490b = i7;
        bVar.f19491c = f7;
        this.f19483b.add(bVar);
        int i13 = this.f19487f + i7;
        while (true) {
            this.f19487f = i13;
            while (true) {
                int i14 = this.f19487f;
                int i15 = this.f19482a;
                if (i14 <= i15) {
                    return;
                }
                i8 = i14 - i15;
                bVar2 = this.f19483b.get(0);
                i9 = bVar2.f19490b;
                if (i9 <= i8) {
                    this.f19487f -= i9;
                    this.f19483b.remove(0);
                    int i16 = this.f19488g;
                    if (i16 < 5) {
                        b[] bVarArr2 = this.f19484c;
                        this.f19488g = i16 + 1;
                        bVarArr2[i16] = bVar2;
                    }
                }
            }
            bVar2.f19490b = i9 - i8;
            i13 = this.f19487f - i8;
        }
    }

    public float f(float f7) {
        e();
        float f8 = f7 * this.f19487f;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f19483b.size(); i8++) {
            b bVar = this.f19483b.get(i8);
            i7 += bVar.f19490b;
            if (i7 >= f8) {
                return bVar.f19491c;
            }
        }
        if (this.f19483b.isEmpty()) {
            return Float.NaN;
        }
        return this.f19483b.get(r5.size() - 1).f19491c;
    }

    public void i() {
        this.f19483b.clear();
        this.f19485d = -1;
        this.f19486e = 0;
        this.f19487f = 0;
    }
}
