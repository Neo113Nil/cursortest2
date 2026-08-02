package X;

import G0.l;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1130a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1132c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1133d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [G0.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i2) {
        Q0.h.e(obj, "value");
        A0.b.i("verificationMode", i2);
        this.f1130a = obj;
        this.f1131b = str;
        this.f1132c = i2;
        String b2 = g.b(obj, str);
        Q0.h.e(b2, "message");
        j jVar = new j(b2);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        Q0.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        ?? r02 = l.f490e;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    r02 = length3 != 1 ? new ArrayList(new G0.a(stackTrace, false)) : i1.a.u(stackTrace[0]);
                }
            } else if (length == 1) {
                r02 = i1.a.u(stackTrace[length2 - 1]);
            } else {
                r02 = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    r02.add(stackTrace[i3]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) r02.toArray(new StackTraceElement[0]));
        this.f1133d = jVar;
    }

    @Override // X.g
    public final Object a() {
        int b2 = K.j.b(this.f1132c);
        if (b2 == 0) {
            throw this.f1133d;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return null;
            }
            throw new F0.b();
        }
        String b3 = g.b(this.f1130a, this.f1131b);
        Q0.h.e(b3, "message");
        Log.d("f", b3);
        return null;
    }

    @Override // X.g
    public final g d(String str, P0.l lVar) {
        return this;
    }
}
