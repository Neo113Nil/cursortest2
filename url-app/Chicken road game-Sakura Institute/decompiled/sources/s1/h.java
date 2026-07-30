package s1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f8238a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        r6.k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8238a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r6 == 3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a2.g gVar) {
        int i7;
        List a3 = gVar.a();
        CharSequence charSequence = gVar.f373f;
        if (!a3.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            l1.x xVar = new l1.x(12, false);
            xVar.f5847g = Parcel.obtain();
            List a9 = gVar.a();
            int size = a9.size();
            int i8 = 0;
            SpannableString spannableString2 = spannableString;
            while (i8 < size) {
                a2.e eVar = (a2.e) a9.get(i8);
                a2.d0 d0Var = (a2.d0) eVar.f363a;
                int i9 = eVar.f364b;
                int i10 = eVar.f365c;
                ((Parcel) xVar.f5847g).recycle();
                xVar.f5847g = Parcel.obtain();
                l2.m mVar = d0Var.f347a;
                long j8 = d0Var.f358l;
                long j9 = d0Var.f354h;
                long j10 = d0Var.f348b;
                int i11 = i8;
                long b9 = mVar.b();
                SpannableString spannableString3 = spannableString2;
                List list = a9;
                long j11 = z0.u.f10057g;
                if (z0.u.c(b9, j11)) {
                    i7 = i10;
                } else {
                    xVar.c((byte) 1);
                    i7 = i10;
                    ((Parcel) xVar.f5847g).writeLong(d0Var.f347a.b());
                }
                long j12 = m2.m.f6327c;
                int i12 = size;
                if (!m2.m.a(j10, j12)) {
                    xVar.c((byte) 2);
                    xVar.k(j10);
                }
                f2.k kVar = d0Var.f349c;
                byte b10 = 3;
                if (kVar != null) {
                    xVar.c((byte) 3);
                    ((Parcel) xVar.f5847g).writeInt(kVar.f3280f);
                }
                f2.i iVar = d0Var.f350d;
                if (iVar != null) {
                    int i13 = iVar.f3275a;
                    xVar.c((byte) 4);
                    xVar.c((i13 != 0 && i13 == 1) ? (byte) 1 : (byte) 0);
                }
                f2.j jVar = d0Var.f351e;
                if (jVar != null) {
                    int i14 = jVar.f3276a;
                    xVar.c((byte) 5);
                    if (i14 != 0) {
                        if (i14 == 1) {
                            b10 = 1;
                        } else if (i14 == 2) {
                            b10 = 2;
                        }
                        xVar.c(b10);
                    }
                    b10 = 0;
                    xVar.c(b10);
                }
                String str = d0Var.f353g;
                if (str != null) {
                    xVar.c((byte) 6);
                    ((Parcel) xVar.f5847g).writeString(str);
                }
                if (!m2.m.a(j9, j12)) {
                    xVar.c((byte) 7);
                    xVar.k(j9);
                }
                l2.a aVar = d0Var.f355i;
                if (aVar != null) {
                    float f9 = aVar.f5860a;
                    xVar.c((byte) 8);
                    xVar.j(f9);
                }
                l2.n nVar = d0Var.f356j;
                if (nVar != null) {
                    xVar.c((byte) 9);
                    xVar.j(nVar.f5884a);
                    xVar.j(nVar.f5885b);
                }
                if (!z0.u.c(j8, j11)) {
                    xVar.c((byte) 10);
                    ((Parcel) xVar.f5847g).writeLong(j8);
                }
                l2.j jVar2 = d0Var.f359m;
                if (jVar2 != null) {
                    xVar.c((byte) 11);
                    ((Parcel) xVar.f5847g).writeInt(jVar2.f5880a);
                }
                z0.o0 o0Var = d0Var.f360n;
                if (o0Var != null) {
                    xVar.c((byte) 12);
                    ((Parcel) xVar.f5847g).writeLong(o0Var.f10031a);
                    long j13 = o0Var.f10032b;
                    xVar.j(y0.c.d(j13));
                    xVar.j(y0.c.e(j13));
                    xVar.j(o0Var.f10033c);
                }
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) xVar.f5847g).marshall(), 0)), i9, i7, 33);
                i8 = i11 + 1;
                spannableString2 = spannableString3;
                a9 = list;
                size = i12;
            }
            charSequence = spannableString2;
        }
        this.f8238a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
