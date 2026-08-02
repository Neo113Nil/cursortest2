package d0;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.util.Log;
import c2.m;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.j;
import l2.l;

/* loaded from: classes.dex */
public final class f extends S0.a {

    /* renamed from: i, reason: collision with root package name */
    public final Object f4918i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4919j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4920k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object value, String str, C0294a c0294a, int i3) {
        super(15);
        Collection collection;
        j.e(value, "value");
        AbstractC0033i.n(i3, "verificationMode");
        this.f4918i = value;
        this.f4919j = str;
        this.f4920k = i3;
        String message = S0.a.d(value, str);
        j.e(message, "message");
        i iVar = new i(message);
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        j.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0033i.i(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = m.f2637a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = c2.c.X(stackTrace);
            } else if (length == 1) {
                collection = AbstractC0129a.r(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i4 = length2 - length; i4 < length2; i4++) {
                    arrayList.add(stackTrace[i4]);
                }
                collection = arrayList;
            }
        }
        iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f4921l = iVar;
    }

    @Override // S0.a
    public final Object b() {
        int b3 = M.j.b(this.f4920k);
        if (b3 == 0) {
            throw this.f4921l;
        }
        if (b3 != 1) {
            if (b3 == 2) {
                return null;
            }
            throw new O0.b();
        }
        String message = S0.a.d(this.f4918i, this.f4919j);
        j.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // S0.a
    public final S0.a B(String str, l lVar) {
        return this;
    }
}
