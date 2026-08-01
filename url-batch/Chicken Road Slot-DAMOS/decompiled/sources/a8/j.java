package a8;

import java.util.Iterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public String f347e;

    /* renamed from: i, reason: collision with root package name */
    public final String f348i;

    /* renamed from: r, reason: collision with root package name */
    public final c f349r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f350s;

    /* renamed from: u, reason: collision with root package name */
    public int f352u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d9.c f353v;

    /* renamed from: d, reason: collision with root package name */
    public int f346d = 2;

    /* renamed from: t, reason: collision with root package name */
    public int f351t = 0;

    public j(d9.c cVar, l lVar, String str) {
        this.f353v = cVar;
        this.f349r = (c) lVar.f358c;
        this.f350s = lVar.f356a;
        this.f352u = lVar.f357b;
        this.f348i = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        String str;
        String str2;
        c cVar;
        int i10 = this.f346d;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int b10 = a4.i.b(i10);
        if (b10 == 0) {
            return true;
        }
        if (b10 == 2) {
            return false;
        }
        this.f346d = 4;
        int i11 = this.f351t;
        while (true) {
            i3 = this.f351t;
            if (i3 == -1) {
                this.f346d = 3;
                str = null;
                break;
            }
            b bVar = (b) this.f353v.f3701e;
            String str3 = this.f348i;
            int length = str3.length();
            i7.a.B(i3, length);
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (str3.charAt(i3) == bVar.f340r) {
                    break;
                }
                i3++;
            }
            str2 = this.f348i;
            if (i3 == -1) {
                i3 = str2.length();
                this.f351t = -1;
            } else {
                this.f351t = i3 + 1;
            }
            int i12 = this.f351t;
            if (i12 == i11) {
                int i13 = i12 + 1;
                this.f351t = i13;
                if (i13 > str2.length()) {
                    this.f351t = -1;
                }
            } else {
                cVar = this.f349r;
                if (i11 < i3) {
                    str2.charAt(i11);
                    cVar.getClass();
                }
                if (i3 > i11) {
                    str2.charAt(i3 - 1);
                    cVar.getClass();
                }
                if (!this.f350s || i11 != i3) {
                    break;
                }
                i11 = this.f351t;
            }
        }
        int i14 = this.f352u;
        if (i14 == 1) {
            i3 = str2.length();
            this.f351t = -1;
            if (i3 > i11) {
                str2.charAt(i3 - 1);
                cVar.getClass();
            }
        } else {
            this.f352u = i14 - 1;
        }
        str = str2.subSequence(i11, i3).toString();
        this.f347e = str;
        if (this.f346d == 3) {
            return false;
        }
        this.f346d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        this.f346d = 2;
        String str = this.f347e;
        this.f347e = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
