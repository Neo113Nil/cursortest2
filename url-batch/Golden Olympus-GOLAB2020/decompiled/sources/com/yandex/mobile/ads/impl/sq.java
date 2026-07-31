package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.w30;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class sq<T> extends AbstractC2349xj {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f31906h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private Handler f31907i;

    /* renamed from: j, reason: collision with root package name */
    private s62 f31908j;

    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final dw0 f31913a;

        /* renamed from: b, reason: collision with root package name */
        public final dw0.c f31914b;

        /* renamed from: c, reason: collision with root package name */
        public final sq<T>.a f31915c;

        public b(dw0 dw0Var, dw0.c cVar, sq<T>.a aVar) {
            this.f31913a = dw0Var;
            this.f31914b = cVar;
            this.f31915c = aVar;
        }
    }

    protected sq() {
    }

    protected abstract dw0.b a(T t4, dw0.b bVar);

    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected final void a() {
        for (b<T> bVar : this.f31906h.values()) {
            bVar.f31913a.b(bVar.f31914b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected final void b() {
        for (b<T> bVar : this.f31906h.values()) {
            bVar.f31913a.c(bVar.f31914b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(T t4, dw0 dw0Var, x42 x42Var);

    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected void e() {
        for (b<T> bVar : this.f31906h.values()) {
            bVar.f31913a.a(bVar.f31914b);
            bVar.f31913a.a((ew0) bVar.f31915c);
            bVar.f31913a.a((w30) bVar.f31915c);
        }
        this.f31906h.clear();
    }

    private final class a implements ew0, w30 {

        /* renamed from: a, reason: collision with root package name */
        private final T f31909a;

        /* renamed from: b, reason: collision with root package name */
        private ew0.a f31910b;

        /* renamed from: c, reason: collision with root package name */
        private w30.a f31911c;

        public a(T t4) {
            this.f31910b = sq.this.b((dw0.b) null);
            this.f31911c = sq.this.a((dw0.b) null);
            this.f31909a = t4;
        }

        private tv0 a(tv0 tv0Var) {
            sq sqVar = sq.this;
            long j4 = tv0Var.f32709f;
            sqVar.getClass();
            sq sqVar2 = sq.this;
            long j5 = tv0Var.f32710g;
            sqVar2.getClass();
            return (j4 == tv0Var.f32709f && j5 == tv0Var.f32710g) ? tv0Var : new tv0(tv0Var.f32704a, tv0Var.f32705b, tv0Var.f32706c, tv0Var.f32707d, tv0Var.f32708e, j4, j5);
        }

        private boolean e(int i4, dw0.b bVar) {
            dw0.b bVar2;
            if (bVar != null) {
                bVar2 = sq.this.a((sq) this.f31909a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            sq.this.getClass();
            ew0.a aVar = this.f31910b;
            if (aVar.f25468a != i4 || !u82.a(aVar.f25469b, bVar2)) {
                this.f31910b = sq.this.b(i4, bVar2);
            }
            w30.a aVar2 = this.f31911c;
            if (aVar2.f33904a == i4 && u82.a(aVar2.f33905b, bVar2)) {
                return true;
            }
            this.f31911c = sq.this.a(i4, bVar2);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void b(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f31911c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void c(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f31911c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void d(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f31911c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void b(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f31910b.b(mr0Var, a(tv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void c(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f31910b.c(mr0Var, a(tv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f31910b.a(a(tv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f31911c.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar, int i5) {
            if (e(i4, bVar)) {
                this.f31911c.a(i5);
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar, Exception exc) {
            if (e(i4, bVar)) {
                this.f31911c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f31910b.a(mr0Var, a(tv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var, IOException iOException, boolean z4) {
            if (e(i4, bVar)) {
                this.f31910b.a(mr0Var, a(tv0Var), iOException, z4);
            }
        }
    }

    protected final void a(final T t4, dw0 dw0Var) {
        if (!this.f31906h.containsKey(t4)) {
            dw0.c cVar = new dw0.c() { // from class: com.yandex.mobile.ads.impl.Ae
                @Override // com.yandex.mobile.ads.impl.dw0.c
                public final void a(dw0 dw0Var2, x42 x42Var) {
                    sq.this.a(t4, dw0Var2, x42Var);
                }
            };
            a aVar = new a(t4);
            this.f31906h.put(t4, new b<>(dw0Var, cVar, aVar));
            Handler handler = this.f31907i;
            handler.getClass();
            dw0Var.a(handler, (ew0) aVar);
            Handler handler2 = this.f31907i;
            handler2.getClass();
            dw0Var.a(handler2, (w30) aVar);
            dw0Var.a(cVar, this.f31908j, c());
            if (d()) {
                return;
            }
            dw0Var.b(cVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected void a(s62 s62Var) {
        this.f31908j = s62Var;
        this.f31907i = u82.a((Handler.Callback) null);
    }
}
