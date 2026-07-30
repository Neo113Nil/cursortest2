package defpackage;

import android.graphics.Bitmap;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mr {
    public final y91 a;
    public final y91 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final mx0 f;

    public mr(p62 p62Var) {
        kc1 kc1Var = kc1.m;
        final int i = 0;
        this.a = ya1.a(kc1Var, new Function0(this) { // from class: lr
            public final /* synthetic */ mr n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                mr mrVar = this.n;
                switch (i2) {
                    case 0:
                        gr grVar = gr.n;
                        return tk3.W(mrVar.f);
                    default:
                        String a = mrVar.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = zj1.b;
                        try {
                            return ap.z(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final char c = 1 == true ? 1 : 0;
        this.b = ya1.a(kc1Var, new Function0(this) { // from class: lr
            public final /* synthetic */ mr n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = c;
                mr mrVar = this.n;
                switch (i2) {
                    case 0:
                        gr grVar = gr.n;
                        return tk3.W(mrVar.f);
                    default:
                        String a = mrVar.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = zj1.b;
                        try {
                            return ap.z(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = Long.parseLong(p62Var.z(Long.MAX_VALUE));
        this.d = Long.parseLong(p62Var.z(Long.MAX_VALUE));
        this.e = Integer.parseInt(p62Var.z(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(p62Var.z(Long.MAX_VALUE));
        lx0 lx0Var = new lx0(0);
        for (int i2 = 0; i2 < parseInt; i2++) {
            String z = p62Var.z(Long.MAX_VALUE);
            Bitmap.Config[] configArr = l.a;
            int v = up2.v(z, ':', 0, 6);
            if (v == -1) {
                lh.c("Unexpected header: ".concat(z));
                throw null;
            }
            lx0Var.b(up2.K(z.substring(0, v)).toString(), z.substring(v + 1));
        }
        this.f = lx0Var.c();
    }

    public final void a(n62 n62Var) {
        n62Var.f(this.c);
        n62Var.writeByte(10);
        n62Var.f(this.d);
        n62Var.writeByte(10);
        n62Var.f(this.e ? 1L : 0L);
        n62Var.writeByte(10);
        mx0 mx0Var = this.f;
        n62Var.f(mx0Var.size());
        n62Var.writeByte(10);
        int size = mx0Var.size();
        for (int i = 0; i < size; i++) {
            n62Var.G(mx0Var.b(i));
            n62Var.G(": ");
            n62Var.G(mx0Var.d(i));
            n62Var.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mr(w92 w92Var) {
        kc1 kc1Var = kc1.m;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.a = ya1.a(kc1Var, new Function0(this) { // from class: lr
            public final /* synthetic */ mr n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = objArr;
                mr mrVar = this.n;
                switch (i2) {
                    case 0:
                        gr grVar = gr.n;
                        return tk3.W(mrVar.f);
                    default:
                        String a = mrVar.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = zj1.b;
                        try {
                            return ap.z(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final int i = 1;
        this.b = ya1.a(kc1Var, new Function0(this) { // from class: lr
            public final /* synthetic */ mr n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                mr mrVar = this.n;
                switch (i2) {
                    case 0:
                        gr grVar = gr.n;
                        return tk3.W(mrVar.f);
                    default:
                        String a = mrVar.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = zj1.b;
                        try {
                            return ap.z(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = w92Var.w;
        this.d = w92Var.x;
        this.e = w92Var.q != null;
        this.f = w92Var.r;
    }
}
