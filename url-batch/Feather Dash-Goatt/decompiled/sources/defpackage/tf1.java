package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltf1;", "Lem0;", "Lwf1;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class tf1 extends em0 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public tf1(Object obj, y90 y90Var, PointerInputEventHandler pointerInputEventHandler, int i) {
        y90Var = (i & 2) != 0 ? null : y90Var;
        this.a = obj;
        this.b = y90Var;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        return new wf1(this.a, this.b, this.c);
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        wf1 wf1Var = (wf1) zl0Var;
        Object obj = wf1Var.s;
        Object obj2 = this.a;
        boolean z = !Intrinsics.a(obj, obj2);
        wf1Var.s = obj2;
        Object obj3 = wf1Var.t;
        Object obj4 = this.b;
        if (!Intrinsics.a(obj3, obj4)) {
            z = true;
        }
        wf1Var.t = obj4;
        Class<?> cls = wf1Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            wf1Var.A0();
        }
        wf1Var.u = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf1)) {
            return false;
        }
        tf1 tf1Var = (tf1) obj;
        return Intrinsics.a(this.a, tf1Var.a) && Intrinsics.a(this.b, tf1Var.b) && this.c == tf1Var.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
