package v1;

import E.AbstractC0005f;
import M.j;
import a.AbstractC0124a;
import android.util.Log;
import c0.t;
import d3.q;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class f extends AbstractC0457a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f15545k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15546l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15547m;
    public final t n;

    public f(Object value, String str, C1451a c1451a, int i4) {
        Collection collection;
        i.e(value, "value");
        AbstractC0005f.t(i4, "verificationMode");
        this.f15545k = value;
        this.f15546l = str;
        this.f15547m = i4;
        String message = AbstractC0457a.j(value, str);
        i.e(message, "message");
        t tVar = new t(message);
        StackTraceElement[] stackTrace = tVar.getStackTrace();
        i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = q.f8333a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = d3.g.Y(stackTrace);
            } else if (length == 1) {
                collection = AbstractC0124a.H(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i5 = length2 - length; i5 < length2; i5++) {
                    arrayList.add(stackTrace[i5]);
                }
                collection = arrayList;
            }
        }
        tVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.n = tVar;
    }

    @Override // i2.AbstractC0457a
    public final Object g() {
        int b4 = j.b(this.f15547m);
        if (b4 == 0) {
            throw this.n;
        }
        if (b4 != 1) {
            if (b4 == 2) {
                return null;
            }
            throw new G1.a();
        }
        String message = AbstractC0457a.j(this.f15545k, this.f15546l);
        i.e(message, "message");
        Log.d("g", message);
        return null;
    }

    @Override // i2.AbstractC0457a
    public final AbstractC0457a z(String str, InterfaceC1339l interfaceC1339l) {
        return this;
    }
}
