package l2;

import c2.b;
import java.util.ArrayList;
import java.util.Collections;
import o2.a0;
import o2.m0;

/* loaded from: classes.dex */
public final class a extends c2.g {

    /* renamed from: o, reason: collision with root package name */
    private final a0 f18535o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f18535o = new a0();
    }

    private static c2.b C(a0 a0Var, int i7) {
        CharSequence charSequence = null;
        b.C0043b c0043b = null;
        while (i7 > 0) {
            if (i7 < 8) {
                throw new c2.j("Incomplete vtt cue box header found.");
            }
            int m7 = a0Var.m();
            int m8 = a0Var.m();
            int i8 = m7 - 8;
            String E = m0.E(a0Var.d(), a0Var.e(), i8);
            a0Var.P(i8);
            i7 = (i7 - 8) - i8;
            if (m8 == 1937011815) {
                c0043b = f.o(E);
            } else if (m8 == 1885436268) {
                charSequence = f.q(null, E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return c0043b != null ? c0043b.o(charSequence).a() : f.l(charSequence);
    }

    @Override // c2.g
    protected c2.h A(byte[] bArr, int i7, boolean z6) {
        this.f18535o.M(bArr, i7);
        ArrayList arrayList = new ArrayList();
        while (this.f18535o.a() > 0) {
            if (this.f18535o.a() < 8) {
                throw new c2.j("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m7 = this.f18535o.m();
            if (this.f18535o.m() == 1987343459) {
                arrayList.add(C(this.f18535o, m7 - 8));
            } else {
                this.f18535o.P(m7 - 8);
            }
        }
        return new b(arrayList);
    }
}
