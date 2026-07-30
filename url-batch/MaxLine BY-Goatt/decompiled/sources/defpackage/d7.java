package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d7 implements vu {
    public final ClipboardManager a;

    public d7(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if (r6 == 2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yd ydVar) {
        int i;
        List list = ydVar.o;
        List list2 = list == null ? ah0.m : list;
        CharSequence charSequence = ydVar.n;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            r70 r70Var = new r70();
            r70Var.a = Parcel.obtain();
            if (list == null) {
                list = ah0.m;
            }
            int size = list.size();
            int i2 = 0;
            SpannableString spannableString2 = spannableString;
            while (i2 < size) {
                xd xdVar = (xd) list.get(i2);
                un2 un2Var = (un2) xdVar.a;
                int i3 = xdVar.b;
                int i4 = xdVar.c;
                r70Var.a.recycle();
                r70Var.a = Parcel.obtain();
                pv2 pv2Var = un2Var.a;
                long j = un2Var.l;
                long j2 = un2Var.h;
                long j3 = un2Var.b;
                int i5 = i2;
                long b = pv2Var.b();
                List list3 = list;
                SpannableString spannableString3 = spannableString2;
                long j4 = aw.g;
                if (aw.c(b, j4)) {
                    i = i4;
                } else {
                    r70Var.c((byte) 1);
                    i = i4;
                    r70Var.f(un2Var.a.b());
                }
                long j5 = sw2.c;
                int i6 = size;
                if (!sw2.a(j3, j5)) {
                    r70Var.c((byte) 2);
                    r70Var.e(j3);
                }
                jq0 jq0Var = un2Var.c;
                byte b2 = 3;
                if (jq0Var != null) {
                    r70Var.c((byte) 3);
                    r70Var.a.writeInt(jq0Var.m);
                }
                fq0 fq0Var = un2Var.d;
                if (fq0Var != null) {
                    int i7 = fq0Var.a;
                    r70Var.c((byte) 4);
                    r70Var.c((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
                }
                gq0 gq0Var = un2Var.e;
                if (gq0Var != null) {
                    int i8 = gq0Var.a;
                    r70Var.c((byte) 5);
                    if (i8 != 0) {
                        if (i8 == 65535) {
                            b2 = 1;
                        } else if (i8 == 1) {
                            b2 = 2;
                        }
                        r70Var.c(b2);
                    }
                    b2 = 0;
                    r70Var.c(b2);
                }
                String str = un2Var.g;
                if (str != null) {
                    r70Var.c((byte) 6);
                    r70Var.a.writeString(str);
                }
                if (!sw2.a(j2, j5)) {
                    r70Var.c((byte) 7);
                    r70Var.e(j2);
                }
                nn nnVar = un2Var.i;
                if (nnVar != null) {
                    float f = nnVar.a;
                    r70Var.c((byte) 8);
                    r70Var.d(f);
                }
                qv2 qv2Var = un2Var.j;
                if (qv2Var != null) {
                    r70Var.c((byte) 9);
                    r70Var.d(qv2Var.a);
                    r70Var.d(qv2Var.b);
                }
                if (!aw.c(j, j4)) {
                    r70Var.c((byte) 10);
                    r70Var.f(j);
                }
                xt2 xt2Var = un2Var.m;
                if (xt2Var != null) {
                    r70Var.c((byte) 11);
                    r70Var.a.writeInt(xt2Var.a);
                }
                dk2 dk2Var = un2Var.n;
                if (dk2Var != null) {
                    r70Var.c((byte) 12);
                    r70Var.f(dk2Var.a);
                    long j6 = dk2Var.b;
                    r70Var.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    r70Var.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    r70Var.d(dk2Var.c);
                }
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(r70Var.a.marshall(), 0)), i3, i, 33);
                i2 = i5 + 1;
                spannableString2 = spannableString3;
                list = list3;
                size = i6;
            }
            charSequence = spannableString2;
        }
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
