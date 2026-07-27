package s0;

import A0.C0034e;
import A0.C0036g;
import Z.C0323u;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import f1.C0607a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145h implements InterfaceC1138d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f10234a;

    public C1145h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f10234a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C0036g c0036g) {
        boolean isEmpty = c0036g.a().isEmpty();
        String str = c0036g.f328a;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            C0607a c0607a = new C0607a(17, false);
            c0607a.f6561e = Parcel.obtain();
            List a4 = c0036g.a();
            int size = a4.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0034e c0034e = (C0034e) a4.get(i2);
                A0.D d4 = (A0.D) c0034e.f324a;
                ((Parcel) c0607a.f6561e).recycle();
                c0607a.f6561e = Parcel.obtain();
                long b4 = d4.f256a.b();
                long j4 = C0323u.f4547g;
                if (!C0323u.c(b4, j4)) {
                    c0607a.s((byte) 1);
                    ((Parcel) c0607a.f6561e).writeLong(d4.f256a.b());
                }
                long j5 = M0.m.f3560c;
                long j6 = d4.f257b;
                byte b5 = 2;
                if (!M0.m.a(j6, j5)) {
                    c0607a.s((byte) 2);
                    c0607a.u(j6);
                }
                F0.k kVar = d4.f258c;
                if (kVar != null) {
                    c0607a.s((byte) 3);
                    ((Parcel) c0607a.f6561e).writeInt(kVar.f2618d);
                }
                F0.i iVar = d4.f259d;
                if (iVar != null) {
                    c0607a.s((byte) 4);
                    int i4 = iVar.f2611a;
                    c0607a.s((!F0.i.a(i4, 0) && F0.i.a(i4, 1)) ? (byte) 1 : (byte) 0);
                }
                F0.j jVar = d4.f260e;
                if (jVar != null) {
                    c0607a.s((byte) 5);
                    int i5 = jVar.f2612a;
                    if (!F0.j.a(i5, 0)) {
                        if (F0.j.a(i5, 1)) {
                            b5 = 1;
                        } else if (!F0.j.a(i5, 2)) {
                            if (F0.j.a(i5, 3)) {
                                b5 = 3;
                            }
                        }
                        c0607a.s(b5);
                    }
                    b5 = 0;
                    c0607a.s(b5);
                }
                String str2 = d4.f262g;
                if (str2 != null) {
                    c0607a.s((byte) 6);
                    ((Parcel) c0607a.f6561e).writeString(str2);
                }
                long j7 = d4.f263h;
                if (!M0.m.a(j7, j5)) {
                    c0607a.s((byte) 7);
                    c0607a.u(j7);
                }
                L0.a aVar = d4.f264i;
                if (aVar != null) {
                    c0607a.s((byte) 8);
                    c0607a.t(aVar.f3493a);
                }
                L0.o oVar = d4.f265j;
                if (oVar != null) {
                    c0607a.s((byte) 9);
                    c0607a.t(oVar.f3519a);
                    c0607a.t(oVar.f3520b);
                }
                long j8 = d4.f267l;
                if (!C0323u.c(j8, j4)) {
                    c0607a.s((byte) 10);
                    ((Parcel) c0607a.f6561e).writeLong(j8);
                }
                L0.j jVar2 = d4.f268m;
                if (jVar2 != null) {
                    c0607a.s((byte) 11);
                    ((Parcel) c0607a.f6561e).writeInt(jVar2.f3513a);
                }
                Z.O o4 = d4.f269n;
                if (o4 != null) {
                    c0607a.s((byte) 12);
                    ((Parcel) c0607a.f6561e).writeLong(o4.f4489a);
                    long j9 = o4.f4490b;
                    c0607a.t(Y.c.d(j9));
                    c0607a.t(Y.c.e(j9));
                    c0607a.t(o4.f4491c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c0607a.f6561e).marshall(), 0)), c0034e.f325b, c0034e.f326c, 33);
            }
            str = spannableString;
        }
        this.f10234a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
