package l2;

import android.text.TextUtils;
import java.util.ArrayList;
import o2.a0;
import r0.n2;

/* loaded from: classes.dex */
public final class h extends c2.g {

    /* renamed from: o, reason: collision with root package name */
    private final a0 f18586o;

    /* renamed from: p, reason: collision with root package name */
    private final c f18587p;

    public h() {
        super("WebvttDecoder");
        this.f18586o = new a0();
        this.f18587p = new c();
    }

    private static int C(a0 a0Var) {
        int i7 = -1;
        int i8 = 0;
        while (i7 == -1) {
            i8 = a0Var.e();
            String o7 = a0Var.o();
            i7 = o7 == null ? 0 : "STYLE".equals(o7) ? 2 : o7.startsWith("NOTE") ? 1 : 3;
        }
        a0Var.O(i8);
        return i7;
    }

    private static void D(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.o())) {
        }
    }

    @Override // c2.g
    protected c2.h A(byte[] bArr, int i7, boolean z6) {
        e n7;
        this.f18586o.M(bArr, i7);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f18586o);
            while (!TextUtils.isEmpty(this.f18586o.o())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = C(this.f18586o);
                if (C == 0) {
                    return new k(arrayList2);
                }
                if (C == 1) {
                    D(this.f18586o);
                } else if (C == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new c2.j("A style block was found after the first cue.");
                    }
                    this.f18586o.o();
                    arrayList.addAll(this.f18587p.d(this.f18586o));
                } else if (C == 3 && (n7 = f.n(this.f18586o, arrayList)) != null) {
                    arrayList2.add(n7);
                }
            }
        } catch (n2 e7) {
            throw new c2.j(e7);
        }
    }
}
