package u2;

import a.AbstractC0124a;
import e0.t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f15514b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f15515c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1446a f15516d;

    /* renamed from: f, reason: collision with root package name */
    public int f15518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f15519g;

    /* renamed from: a, reason: collision with root package name */
    public int f15513a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f15517e = 0;

    public l(t tVar, L3.h hVar, CharSequence charSequence) {
        this.f15519g = tVar;
        this.f15516d = (AbstractC1446a) hVar.f1682d;
        this.f15518f = hVar.f1680b;
        this.f15515c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        AbstractC1446a abstractC1446a;
        AbstractC0124a.t(this.f15513a != 4);
        int b4 = M.j.b(this.f15513a);
        if (b4 == 0) {
            return true;
        }
        if (b4 != 2) {
            this.f15513a = 4;
            int i4 = this.f15517e;
            while (true) {
                int i5 = this.f15517e;
                if (i5 == -1) {
                    this.f15513a = 3;
                    str = null;
                    break;
                }
                b bVar = (b) this.f15519g.f8416a;
                CharSequence charSequence = this.f15515c;
                int length = charSequence.length();
                AbstractC0124a.q(i5, length);
                while (true) {
                    if (i5 >= length) {
                        i5 = -1;
                        break;
                    }
                    if (bVar.a(charSequence.charAt(i5))) {
                        break;
                    }
                    i5++;
                }
                if (i5 == -1) {
                    i5 = charSequence.length();
                    this.f15517e = -1;
                } else {
                    this.f15517e = i5 + 1;
                }
                int i6 = this.f15517e;
                if (i6 == i4) {
                    int i7 = i6 + 1;
                    this.f15517e = i7;
                    if (i7 > charSequence.length()) {
                        this.f15517e = -1;
                    }
                } else {
                    while (true) {
                        abstractC1446a = this.f15516d;
                        if (i4 >= i5 || !abstractC1446a.a(charSequence.charAt(i4))) {
                            break;
                        }
                        i4++;
                    }
                    while (i5 > i4 && abstractC1446a.a(charSequence.charAt(i5 - 1))) {
                        i5--;
                    }
                    int i8 = this.f15518f;
                    if (i8 == 1) {
                        i5 = charSequence.length();
                        this.f15517e = -1;
                        while (i5 > i4 && abstractC1446a.a(charSequence.charAt(i5 - 1))) {
                            i5--;
                        }
                    } else {
                        this.f15518f = i8 - 1;
                    }
                    str = charSequence.subSequence(i4, i5).toString();
                }
            }
            this.f15514b = str;
            if (this.f15513a != 3) {
                this.f15513a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15513a = 2;
        String str = this.f15514b;
        this.f15514b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
