package c0;

import H1.z;
import H5.r;
import N.p;
import W4.o;
import a1.AbstractC0223a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.i;
import l5.AbstractC0505i;
import l5.C0512p;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273f extends AbstractC0223a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3760c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3761d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3762e;

    /* renamed from: f, reason: collision with root package name */
    public final z f3763f;

    public C0273f(Object value, String str, C0268a c0268a, int i7) {
        Collection collection;
        i.e(value, "value");
        o.f("verificationMode", i7);
        this.f3760c = value;
        this.f3761d = str;
        this.f3762e = i7;
        String message = AbstractC0223a.s(value, str);
        i.e(message, "message");
        z zVar = new z(message);
        StackTraceElement[] stackTrace = zVar.getStackTrace();
        i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C1.c.g("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            collection = C0512p.f5303f;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = AbstractC0505i.M(stackTrace);
            } else if (length == 1) {
                collection = AbstractC0676f.n(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i8 = length2 - length; i8 < length2; i8++) {
                    arrayList.add(stackTrace[i8]);
                }
                collection = arrayList;
            }
        }
        zVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f3763f = zVar;
    }

    @Override // a1.AbstractC0223a
    public final Object d() {
        int c7 = p.c(this.f3762e);
        if (c7 == 0) {
            throw this.f3763f;
        }
        if (c7 != 1) {
            if (c7 == 2) {
                return null;
            }
            throw new r();
        }
        String message = AbstractC0223a.s(this.f3760c, this.f3761d);
        i.e(message, "message");
        Log.d("g", message);
        return null;
    }

    @Override // a1.AbstractC0223a
    public final AbstractC0223a E(String str, InterfaceC0743l interfaceC0743l) {
        return this;
    }
}
