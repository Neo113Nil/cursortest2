package y1;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import g1.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o2.i0;
import o2.v;
import r0.s1;
import s0.u1;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f23251d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    private final int f23252b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23253c;

    public d() {
        this(0, true);
    }

    public d(int i7, boolean z6) {
        this.f23252b = i7;
        this.f23253c = z6;
    }

    private static void b(int i7, List<Integer> list) {
        if (o4.d.g(f23251d, i7) == -1 || list.contains(Integer.valueOf(i7))) {
            return;
        }
        list.add(Integer.valueOf(i7));
    }

    @SuppressLint({"SwitchIntDef"})
    private w0.l d(int i7, s1 s1Var, List<s1> list, i0 i0Var) {
        if (i7 == 0) {
            return new g1.b();
        }
        if (i7 == 1) {
            return new g1.e();
        }
        if (i7 == 2) {
            return new g1.h();
        }
        if (i7 == 7) {
            return new d1.f(0, 0L);
        }
        if (i7 == 8) {
            return e(i0Var, s1Var, list);
        }
        if (i7 == 11) {
            return f(this.f23252b, this.f23253c, s1Var, list, i0Var);
        }
        if (i7 != 13) {
            return null;
        }
        return new t(s1Var.f20947h, i0Var);
    }

    private static e1.g e(i0 i0Var, s1 s1Var, List<s1> list) {
        int i7 = g(s1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new e1.g(i7, i0Var, null, list);
    }

    private static h0 f(int i7, boolean z6, s1 s1Var, List<s1> list, i0 i0Var) {
        int i8 = i7 | 16;
        if (list != null) {
            i8 |= 32;
        } else {
            list = z6 ? Collections.singletonList(new s1.b().e0("application/cea-608").E()) : Collections.emptyList();
        }
        String str = s1Var.f20953n;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b(str, "audio/mp4a-latm")) {
                i8 |= 2;
            }
            if (!v.b(str, "video/avc")) {
                i8 |= 4;
            }
        }
        return new h0(2, i0Var, new g1.j(i8, list));
    }

    private static boolean g(s1 s1Var) {
        j1.a aVar = s1Var.f20954o;
        if (aVar == null) {
            return false;
        }
        for (int i7 = 0; i7 < aVar.h(); i7++) {
            if (aVar.g(i7) instanceof q) {
                return !((q) r2).f23366h.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(w0.l lVar, w0.m mVar) {
        try {
            boolean h7 = lVar.h(mVar);
            mVar.h();
            return h7;
        } catch (EOFException unused) {
            mVar.h();
            return false;
        } catch (Throwable th) {
            mVar.h();
            throw th;
        }
    }

    @Override // y1.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b a(Uri uri, s1 s1Var, List<s1> list, i0 i0Var, Map<String, List<String>> map, w0.m mVar, u1 u1Var) {
        int a7 = o2.k.a(s1Var.f20956q);
        int b7 = o2.k.b(map);
        int c7 = o2.k.c(uri);
        int[] iArr = f23251d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a7, arrayList);
        b(b7, arrayList);
        b(c7, arrayList);
        for (int i7 : iArr) {
            b(i7, arrayList);
        }
        w0.l lVar = null;
        mVar.h();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int intValue = ((Integer) arrayList.get(i8)).intValue();
            w0.l lVar2 = (w0.l) o2.a.e(d(intValue, s1Var, list, i0Var));
            if (h(lVar2, mVar)) {
                return new b(lVar2, s1Var, i0Var);
            }
            if (lVar == null && (intValue == a7 || intValue == b7 || intValue == c7 || intValue == 11)) {
                lVar = lVar2;
            }
        }
        return new b((w0.l) o2.a.e(lVar), s1Var, i0Var);
    }
}
