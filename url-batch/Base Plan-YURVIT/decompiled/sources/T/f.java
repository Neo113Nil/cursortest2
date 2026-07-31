package T;

import E0.o;
import H.j;
import O0.l;
import a.AbstractC0086a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class f extends AbstractC0086a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f840e;

    /* renamed from: f, reason: collision with root package name */
    public final String f841f;

    /* renamed from: g, reason: collision with root package name */
    public final int f842g;

    /* renamed from: h, reason: collision with root package name */
    public final i f843h;

    public f(Object obj, String str, a aVar, int i2) {
        Collection collection;
        P0.h.e(obj, "value");
        L.d.i("verificationMode", i2);
        this.f840e = obj;
        this.f841f = str;
        this.f842g = i2;
        String m2 = AbstractC0086a.m(obj, str);
        P0.h.e(m2, "message");
        i iVar = new i(m2);
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        P0.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    collection = length3 != 1 ? new ArrayList(new E0.c(stackTrace, false)) : AbstractC0086a.x(stackTrace[0]);
                }
            } else if (length == 1) {
                collection = AbstractC0086a.x(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
            iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.f843h = iVar;
        }
        collection = o.f219e;
        iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f843h = iVar;
    }

    @Override // a.AbstractC0086a
    public final Object h() {
        int a2 = j.a(this.f842g);
        if (a2 == 0) {
            throw this.f843h;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                return null;
            }
            throw new D0.b();
        }
        String m2 = AbstractC0086a.m(this.f840e, this.f841f);
        P0.h.e(m2, "message");
        Log.d("g", m2);
        return null;
    }

    @Override // a.AbstractC0086a
    public final AbstractC0086a C(String str, l lVar) {
        return this;
    }
}
