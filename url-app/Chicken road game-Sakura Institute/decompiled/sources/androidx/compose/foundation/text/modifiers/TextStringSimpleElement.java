package androidx.compose.foundation.text.modifiers;

import A.AbstractC0017m;
import A0.L;
import F0.d;
import S.n;
import Z.InterfaceC0324v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import r0.AbstractC1065f;
import r0.T;
import u3.l;
import z.C1350e;
import z.C1356k;

@Metadata
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final String f5139a;

    /* renamed from: b, reason: collision with root package name */
    public final L f5140b;

    /* renamed from: c, reason: collision with root package name */
    public final d f5141c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5143e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5145g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0324v f5146h;

    public TextStringSimpleElement(String str, L l4, d dVar, int i2, boolean z4, int i4, int i5, InterfaceC0324v interfaceC0324v) {
        this.f5139a = str;
        this.f5140b = l4;
        this.f5141c = dVar;
        this.f5142d = i2;
        this.f5143e = z4;
        this.f5144f = i4;
        this.f5145g = i5;
        this.f5146h = interfaceC0324v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.a(this.f5146h, textStringSimpleElement.f5146h) && Intrinsics.a(this.f5139a, textStringSimpleElement.f5139a) && Intrinsics.a(this.f5140b, textStringSimpleElement.f5140b) && Intrinsics.a(this.f5141c, textStringSimpleElement.f5141c) && l.b0(this.f5142d, textStringSimpleElement.f5142d) && this.f5143e == textStringSimpleElement.f5143e && this.f5144f == textStringSimpleElement.f5144f && this.f5145g == textStringSimpleElement.f5145g;
    }

    public final int hashCode() {
        int d4 = (((AbstractC0017m.d(AbstractC0784j.c(this.f5142d, (this.f5141c.hashCode() + ((this.f5140b.hashCode() + (this.f5139a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f5143e) + this.f5144f) * 31) + this.f5145g) * 31;
        InterfaceC0324v interfaceC0324v = this.f5146h;
        return d4 + (interfaceC0324v != null ? interfaceC0324v.hashCode() : 0);
    }

    @Override // r0.T
    public final n l() {
        C1356k c1356k = new C1356k();
        c1356k.f11771t = this.f5139a;
        c1356k.f11772u = this.f5140b;
        c1356k.f11773v = this.f5141c;
        c1356k.f11774w = this.f5142d;
        c1356k.f11775x = this.f5143e;
        c1356k.f11776y = this.f5144f;
        c1356k.f11777z = this.f5145g;
        c1356k.f11767A = this.f5146h;
        return c1356k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.f303a.b(r0.f303a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
    @Override // r0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(n nVar) {
        boolean z4;
        String str;
        String str2;
        boolean z5;
        int i2;
        int i4;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        d dVar;
        d dVar2;
        int i7;
        int i8;
        C1356k c1356k = (C1356k) nVar;
        InterfaceC0324v interfaceC0324v = c1356k.f11767A;
        InterfaceC0324v interfaceC0324v2 = this.f5146h;
        boolean a4 = Intrinsics.a(interfaceC0324v2, interfaceC0324v);
        c1356k.f11767A = interfaceC0324v2;
        boolean z8 = true;
        L l4 = this.f5140b;
        if (a4) {
            L l5 = c1356k.f11772u;
            if (l4 == l5) {
                l4.getClass();
            }
            z4 = false;
            str = c1356k.f11771t;
            str2 = this.f5139a;
            if (Intrinsics.a(str, str2)) {
                c1356k.f11771t = str2;
                c1356k.f11770E = null;
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = !c1356k.f11772u.c(l4);
            c1356k.f11772u = l4;
            i2 = c1356k.f11777z;
            i4 = this.f5145g;
            if (i2 != i4) {
                c1356k.f11777z = i4;
                z9 = true;
            }
            i5 = c1356k.f11776y;
            i6 = this.f5144f;
            if (i5 != i6) {
                c1356k.f11776y = i6;
                z9 = true;
            }
            z6 = c1356k.f11775x;
            z7 = this.f5143e;
            if (z6 != z7) {
                c1356k.f11775x = z7;
                z9 = true;
            }
            dVar = c1356k.f11773v;
            dVar2 = this.f5141c;
            if (!Intrinsics.a(dVar, dVar2)) {
                c1356k.f11773v = dVar2;
                z9 = true;
            }
            i7 = c1356k.f11774w;
            i8 = this.f5142d;
            if (l.b0(i7, i8)) {
                c1356k.f11774w = i8;
            } else {
                z8 = z9;
            }
            if (!z5 || z8) {
                C1350e B02 = c1356k.B0();
                String str3 = c1356k.f11771t;
                L l6 = c1356k.f11772u;
                d dVar3 = c1356k.f11773v;
                int i9 = c1356k.f11774w;
                boolean z10 = c1356k.f11775x;
                int i10 = c1356k.f11776y;
                int i11 = c1356k.f11777z;
                B02.f11722a = str3;
                B02.f11723b = l6;
                B02.f11724c = dVar3;
                B02.f11725d = i9;
                B02.f11726e = z10;
                B02.f11727f = i10;
                B02.f11728g = i11;
                B02.f11731j = null;
                B02.f11735n = null;
                B02.f11736o = null;
                B02.f11738q = -1;
                B02.f11739r = -1;
                B02.f11737p = u3.d.t(0, 0, 0, 0);
                B02.f11733l = u3.d.c(0, 0);
                B02.f11732k = false;
            }
            if (c1356k.f3990s) {
                return;
            }
            if (z5 || (z4 && c1356k.f11769D != null)) {
                AbstractC1065f.p(c1356k);
            }
            if (z5 || z8) {
                AbstractC1065f.o(c1356k);
                AbstractC1065f.n(c1356k);
            }
            if (z4) {
                AbstractC1065f.n(c1356k);
                return;
            }
            return;
        }
        z4 = true;
        str = c1356k.f11771t;
        str2 = this.f5139a;
        if (Intrinsics.a(str, str2)) {
        }
        boolean z92 = !c1356k.f11772u.c(l4);
        c1356k.f11772u = l4;
        i2 = c1356k.f11777z;
        i4 = this.f5145g;
        if (i2 != i4) {
        }
        i5 = c1356k.f11776y;
        i6 = this.f5144f;
        if (i5 != i6) {
        }
        z6 = c1356k.f11775x;
        z7 = this.f5143e;
        if (z6 != z7) {
        }
        dVar = c1356k.f11773v;
        dVar2 = this.f5141c;
        if (!Intrinsics.a(dVar, dVar2)) {
        }
        i7 = c1356k.f11774w;
        i8 = this.f5142d;
        if (l.b0(i7, i8)) {
        }
        if (!z5) {
        }
        C1350e B022 = c1356k.B0();
        String str32 = c1356k.f11771t;
        L l62 = c1356k.f11772u;
        d dVar32 = c1356k.f11773v;
        int i92 = c1356k.f11774w;
        boolean z102 = c1356k.f11775x;
        int i102 = c1356k.f11776y;
        int i112 = c1356k.f11777z;
        B022.f11722a = str32;
        B022.f11723b = l62;
        B022.f11724c = dVar32;
        B022.f11725d = i92;
        B022.f11726e = z102;
        B022.f11727f = i102;
        B022.f11728g = i112;
        B022.f11731j = null;
        B022.f11735n = null;
        B022.f11736o = null;
        B022.f11738q = -1;
        B022.f11739r = -1;
        B022.f11737p = u3.d.t(0, 0, 0, 0);
        B022.f11733l = u3.d.c(0, 0);
        B022.f11732k = false;
        if (c1356k.f3990s) {
        }
    }
}
