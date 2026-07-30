package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wd implements Appendable {
    public final StringBuilder m = new StringBuilder(16);
    public final ArrayList n;

    public wd(yd ydVar) {
        new ArrayList();
        this.n = new ArrayList();
        new ArrayList();
        a(ydVar);
    }

    public final void a(yd ydVar) {
        StringBuilder sb = this.m;
        int length = sb.length();
        sb.append(ydVar.n);
        List list = ydVar.m;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                xd xdVar = (xd) list.get(i);
                this.n.add(new vd(xdVar.b + length, xdVar.c + length, xdVar.a, xdVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof yd;
        StringBuilder sb = this.m;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        yd ydVar = (yd) charSequence;
        int length = sb.length();
        sb.append((CharSequence) ydVar.n, i, i2);
        List a = ae.a(ydVar, i, i2, null);
        if (a != null) {
            int size = a.size();
            for (int i3 = 0; i3 < size; i3++) {
                xd xdVar = (xd) a.get(i3);
                this.n.add(new vd(xdVar.b + length, xdVar.c + length, xdVar.a, xdVar.d));
            }
        }
        return this;
    }

    public final yd b() {
        StringBuilder sb = this.m;
        String sb2 = sb.toString();
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vd vdVar = (vd) arrayList.get(i);
            int length = sb.length();
            int i2 = vdVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                i21.b("Item.end should be set first");
            }
            arrayList2.add(new xd(vdVar.b, length, vdVar.a, vdVar.d));
        }
        return new yd(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof yd) {
            a((yd) charSequence);
            return this;
        }
        this.m.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.m.append(c);
        return this;
    }
}
