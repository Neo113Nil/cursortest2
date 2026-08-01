package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class vg {

    /* renamed from: a, reason: collision with root package name */
    public final String f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2899b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2900c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2902e;

    public vg(String str, Class cls, boolean z10, boolean z11) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            te.a1.e("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i3 = 1; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                te.a1.e("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f2898a = str;
        this.f2899b = cls;
        this.f2900c = z10;
        this.f2901d = z11;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.f2902e = j;
    }

    public void a(Iterator it, hh hhVar) {
        while (it.hasNext()) {
            b(it.next(), hhVar);
        }
    }

    public void b(Object obj, hh hhVar) {
        hhVar.a(obj, this.f2898a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f2899b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f2898a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        n0.l.l(sb2, name, "/", str, "[");
        return v4.a.o(sb2, name2, "]");
    }
}
