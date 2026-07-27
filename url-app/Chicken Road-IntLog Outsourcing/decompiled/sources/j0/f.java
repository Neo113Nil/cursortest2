package j0;

import B0.o;
import O.j;
import android.util.Log;
import b2.AbstractC0279e;
import f2.s;
import g4.AbstractC0464i;
import g4.C0471p;
import java.util.ArrayList;
import java.util.Collection;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10452c;

    /* renamed from: d, reason: collision with root package name */
    public final s f10453d;

    public f(Object value, String str, C1198a c1198a, int i2) {
        Collection collection;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0279e.k(i2, "verificationMode");
        this.f10450a = value;
        this.f10451b = str;
        this.f10452c = i2;
        String message = g.b(value, str);
        kotlin.jvm.internal.i.e(message, "message");
        s sVar = new s(message);
        StackTraceElement[] stackTrace = sVar.getStackTrace();
        kotlin.jvm.internal.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(o.g(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = C0471p.f5750a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = AbstractC0464i.a0(stackTrace);
            } else if (length == 1) {
                collection = K1.b.W(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
        }
        sVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f10453d = sVar;
    }

    @Override // j0.g
    public final Object a() {
        int b6 = j.b(this.f10452c);
        if (b6 == 0) {
            throw this.f10453d;
        }
        if (b6 != 1) {
            if (b6 == 2) {
                return null;
            }
            throw new C1.b();
        }
        String message = g.b(this.f10450a, this.f10451b);
        kotlin.jvm.internal.i.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // j0.g
    public final g d(String str, InterfaceC1441l interfaceC1441l) {
        return this;
    }
}
