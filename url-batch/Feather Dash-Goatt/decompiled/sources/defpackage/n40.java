package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n40 implements Iterator, yb0 {
    public final /* synthetic */ int d;
    public int e;
    public Object g;
    public final Object h;

    public n40(yn0 yn0Var) {
        this.d = 2;
        this.h = yn0Var;
        this.e = -1;
        this.g = h91.a(new xn0(yn0Var, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.e;
        yy yyVar = (yy) this.h;
        if (i == -2) {
            invoke = ((Function0) yyVar.b).invoke();
        } else {
            Function1 function1 = yyVar.c;
            Object obj = this.g;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.g = invoke;
        this.e = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < 0) {
                    a();
                }
                return this.e == 1;
            case 1:
                return ((f91) this.g).hasNext();
            case 2:
                return ((f91) this.g).hasNext();
            default:
                return this.e < ((Map) this.h).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    dd0.c();
                    return null;
                }
                Object obj2 = this.g;
                obj2.getClass();
                this.e = -1;
                return obj2;
            case 1:
                return ((f91) this.g).next();
            case 2:
                return ((f91) this.g).next();
            default:
                if (hasNext()) {
                    obj = this.g;
                    this.e++;
                    Object obj3 = ((Map) this.h).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.g = ((sh0) obj3).b;
                } else {
                    dd0.c();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        Object obj = this.h;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.e;
                if (i2 != -1) {
                    ((pn0) obj).e.h(i2);
                    this.e = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.e;
                if (i3 != -1) {
                    ((yn0) obj).e.m(i3);
                    this.e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n40(yy yyVar) {
        this.d = 0;
        this.h = yyVar;
        this.e = -2;
    }

    public n40(Object obj, Map map) {
        this.d = 3;
        this.g = obj;
        this.h = map;
    }

    public n40(pn0 pn0Var) {
        this.d = 1;
        this.h = pn0Var;
        this.e = -1;
        this.g = h91.a(new on0(pn0Var, this, null));
    }
}
