package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1305m0;
import androidx.core.view.C1301k0;
import androidx.core.view.InterfaceC1303l0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f10288c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1303l0 f10289d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10290e;

    /* renamed from: b, reason: collision with root package name */
    private long f10287b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1305m0 f10291f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f10286a = new ArrayList();

    class a extends AbstractC1305m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10292a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f10293b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            int i4 = this.f10293b + 1;
            this.f10293b = i4;
            if (i4 == h.this.f10286a.size()) {
                InterfaceC1303l0 interfaceC1303l0 = h.this.f10289d;
                if (interfaceC1303l0 != null) {
                    interfaceC1303l0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC1305m0, androidx.core.view.InterfaceC1303l0
        public void c(View view) {
            if (this.f10292a) {
                return;
            }
            this.f10292a = true;
            InterfaceC1303l0 interfaceC1303l0 = h.this.f10289d;
            if (interfaceC1303l0 != null) {
                interfaceC1303l0.c(null);
            }
        }

        void d() {
            this.f10293b = 0;
            this.f10292a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f10290e) {
            ArrayList arrayList = this.f10286a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((C1301k0) obj).c();
            }
            this.f10290e = false;
        }
    }

    void b() {
        this.f10290e = false;
    }

    public h c(C1301k0 c1301k0) {
        if (!this.f10290e) {
            this.f10286a.add(c1301k0);
        }
        return this;
    }

    public h d(C1301k0 c1301k0, C1301k0 c1301k02) {
        this.f10286a.add(c1301k0);
        c1301k02.i(c1301k0.d());
        this.f10286a.add(c1301k02);
        return this;
    }

    public h e(long j4) {
        if (!this.f10290e) {
            this.f10287b = j4;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f10290e) {
            this.f10288c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC1303l0 interfaceC1303l0) {
        if (!this.f10290e) {
            this.f10289d = interfaceC1303l0;
        }
        return this;
    }

    public void h() {
        if (this.f10290e) {
            return;
        }
        ArrayList arrayList = this.f10286a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1301k0 c1301k0 = (C1301k0) obj;
            long j4 = this.f10287b;
            if (j4 >= 0) {
                c1301k0.e(j4);
            }
            Interpolator interpolator = this.f10288c;
            if (interpolator != null) {
                c1301k0.f(interpolator);
            }
            if (this.f10289d != null) {
                c1301k0.g(this.f10291f);
            }
            c1301k0.k();
        }
        this.f10290e = true;
    }
}
