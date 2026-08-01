package l9;

import androidx.lifecycle.w;
import kotlin.jvm.functions.Function1;
import n4.x;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x f5941a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5942b;

    public e(x xVar) {
        xVar.getClass();
        this.f5941a = xVar;
    }

    public final void a(Object obj, Function1 function1) {
        w wVar;
        obj.getClass();
        if (this.f5942b) {
            return;
        }
        this.f5942b = true;
        x xVar = this.f5941a;
        xVar.a(obj, function1);
        n4.h h10 = xVar.f7130b.h();
        if (h10 == null || (wVar = h10.f7069v.j) == null) {
            return;
        }
        wVar.a(new c(this, 1));
    }

    public final void b() {
        w wVar;
        if (this.f5942b) {
            return;
        }
        this.f5942b = true;
        x xVar = this.f5941a;
        xVar.b();
        n4.h h10 = xVar.f7130b.h();
        if (h10 == null || (wVar = h10.f7069v.j) == null) {
            return;
        }
        wVar.a(new c(this, 0));
    }
}
