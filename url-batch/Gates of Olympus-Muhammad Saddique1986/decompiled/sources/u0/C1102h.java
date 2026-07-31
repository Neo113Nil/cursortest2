package u0;

import C0.C0029e;
import C0.C0031g;
import a0.C0238c;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import b0.C0352v;
import java.util.List;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102h implements InterfaceC1095d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f9370a;

    public C1102h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        f2.j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f9370a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C0031g c0031g) {
        boolean isEmpty = c0031g.a().isEmpty();
        String str = c0031g.f596a;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            m.y0 y0Var = new m.y0();
            y0Var.f6913d = Parcel.obtain();
            List a3 = c0031g.a();
            int size = a3.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0029e c0029e = (C0029e) a3.get(i3);
                C0.D d3 = (C0.D) c0029e.f592a;
                ((Parcel) y0Var.f6913d).recycle();
                y0Var.f6913d = Parcel.obtain();
                long b3 = d3.f525a.b();
                long j3 = C0352v.f5439g;
                if (!C0352v.c(b3, j3)) {
                    y0Var.j((byte) 1);
                    ((Parcel) y0Var.f6913d).writeLong(d3.f525a.b());
                }
                long j4 = O0.m.f3746c;
                long j5 = d3.f526b;
                byte b4 = 2;
                if (!O0.m.a(j5, j4)) {
                    y0Var.j((byte) 2);
                    y0Var.l(j5);
                }
                H0.k kVar = d3.f527c;
                if (kVar != null) {
                    y0Var.j((byte) 3);
                    ((Parcel) y0Var.f6913d).writeInt(kVar.f2601d);
                }
                H0.i iVar = d3.f528d;
                if (iVar != null) {
                    y0Var.j((byte) 4);
                    int i4 = iVar.f2594a;
                    y0Var.j((!H0.i.a(i4, 0) && H0.i.a(i4, 1)) ? (byte) 1 : (byte) 0);
                }
                H0.j jVar = d3.f529e;
                if (jVar != null) {
                    y0Var.j((byte) 5);
                    int i5 = jVar.f2595a;
                    if (!H0.j.a(i5, 0)) {
                        if (H0.j.a(i5, 1)) {
                            b4 = 1;
                        } else if (!H0.j.a(i5, 2)) {
                            if (H0.j.a(i5, 3)) {
                                b4 = 3;
                            }
                        }
                        y0Var.j(b4);
                    }
                    b4 = 0;
                    y0Var.j(b4);
                }
                String str2 = d3.f531g;
                if (str2 != null) {
                    y0Var.j((byte) 6);
                    ((Parcel) y0Var.f6913d).writeString(str2);
                }
                long j6 = d3.f532h;
                if (!O0.m.a(j6, j4)) {
                    y0Var.j((byte) 7);
                    y0Var.l(j6);
                }
                N0.a aVar = d3.f533i;
                if (aVar != null) {
                    y0Var.j((byte) 8);
                    y0Var.k(aVar.f3531a);
                }
                N0.n nVar = d3.f534j;
                if (nVar != null) {
                    y0Var.j((byte) 9);
                    y0Var.k(nVar.f3555a);
                    y0Var.k(nVar.f3556b);
                }
                long j7 = d3.f536l;
                if (!C0352v.c(j7, j3)) {
                    y0Var.j((byte) 10);
                    ((Parcel) y0Var.f6913d).writeLong(j7);
                }
                N0.j jVar2 = d3.f537m;
                if (jVar2 != null) {
                    y0Var.j((byte) 11);
                    ((Parcel) y0Var.f6913d).writeInt(jVar2.f3551a);
                }
                b0.P p3 = d3.f538n;
                if (p3 != null) {
                    y0Var.j((byte) 12);
                    ((Parcel) y0Var.f6913d).writeLong(p3.f5381a);
                    long j8 = p3.f5382b;
                    y0Var.k(C0238c.d(j8));
                    y0Var.k(C0238c.e(j8));
                    y0Var.k(p3.f5383c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) y0Var.f6913d).marshall(), 0)), c0029e.f593b, c0029e.f594c, 33);
            }
            str = spannableString;
        }
        this.f9370a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
