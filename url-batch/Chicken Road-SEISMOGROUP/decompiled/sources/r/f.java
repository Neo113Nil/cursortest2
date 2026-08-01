package r;

import E.AbstractC0008i;
import V.m;
import android.util.Log;
import d0.l;
import java.util.ArrayList;
import java.util.Collections;
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1244c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1245d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [V.m] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i2) {
        e0.h.e(obj, "value");
        AbstractC0008i.f("verificationMode", i2);
        this.f1242a = obj;
        this.f1243b = str;
        this.f1244c = i2;
        String b2 = g.b(obj, str);
        e0.h.e(b2, "message");
        j jVar = new j(b2);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        e0.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        ?? r0 = m.f441b;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        r0 = new ArrayList(new V.b(stackTrace, false));
                    } else {
                        r0 = Collections.singletonList(stackTrace[0]);
                        e0.h.d(r0, "singletonList(...)");
                    }
                }
            } else if (length == 1) {
                r0 = Collections.singletonList(stackTrace[length2 - 1]);
                e0.h.d(r0, "singletonList(...)");
            } else {
                r0 = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    r0.add(stackTrace[i3]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) r0.toArray(new StackTraceElement[0]));
        this.f1245d = jVar;
    }

    @Override // r.g
    public final Object a() {
        int a2 = AbstractC0068d.a(this.f1244c);
        if (a2 == 0) {
            throw this.f1245d;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                return null;
            }
            throw new A.c();
        }
        String b2 = g.b(this.f1242a, this.f1243b);
        e0.h.e(b2, "message");
        Log.d("f", b2);
        return null;
    }

    @Override // r.g
    public final g d(String str, l lVar) {
        return this;
    }
}
