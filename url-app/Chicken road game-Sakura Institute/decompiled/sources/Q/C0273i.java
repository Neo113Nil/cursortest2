package Q;

import android.content.Context;
import android.util.Base64;
import c2.C0538b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t2.C1205b;
import t2.InterfaceC1206c;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;
import w2.C1292a;
import w2.C1293b;
import z2.C1442z;

/* renamed from: Q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0273i implements Z1.e, InterfaceC1228a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3852b;

    public /* synthetic */ C0273i(int i2, Object obj) {
        this.f3851a = i2;
        this.f3852b = obj;
    }

    public void a() {
        M2.p pVar = (M2.p) this.f3852b;
        synchronized (q.f3878b) {
            List list = (List) q.f3883g;
            Intrinsics.checkNotNullParameter(list, "<this>");
            ArrayList arrayList = new ArrayList(C1442z.h(list, 10));
            boolean z4 = false;
            for (Object obj : list) {
                boolean z5 = true;
                if (!z4 && Intrinsics.a(obj, pVar)) {
                    z4 = true;
                    z5 = false;
                }
                if (z5) {
                    arrayList.add(obj);
                }
            }
            q.f3883g = arrayList;
            Unit unit = Unit.f7487a;
        }
    }

    @Override // u2.InterfaceC1228a
    public void b(InterfaceC1229b interfaceC1229b) {
        switch (this.f3851a) {
            case 3:
                C0538b c0538b = (C0538b) this.f3852b;
                c0538b.getClass();
                if (interfaceC1229b.get() != null) {
                    throw new ClassCastException();
                }
                c0538b.f5842c.set(null);
                return;
            default:
                C0538b c0538b2 = (C0538b) this.f3852b;
                c0538b2.getClass();
                if (interfaceC1229b.get() != null) {
                    throw new ClassCastException();
                }
                c0538b2.f5842c.set(null);
                return;
        }
    }

    @Override // Z1.e
    public Object d(Z1.v vVar) {
        switch (this.f3851a) {
            case 1:
                return (C1292a) this.f3852b;
            case 2:
                return this.f3852b;
            default:
                Context context = (Context) vVar.a(Context.class);
                V1.f fVar = (V1.f) vVar.a(V1.f.class);
                StringBuilder sb = new StringBuilder();
                fVar.b();
                byte[] bytes = fVar.f4166b.getBytes(Charset.defaultCharset());
                sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
                sb.append("+");
                fVar.b();
                byte[] bytes2 = fVar.f4167c.f4179b.getBytes(Charset.defaultCharset());
                sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
                return new C1205b(context, sb.toString(), vVar.d(Z1.t.a(InterfaceC1206c.class)), vVar.b(C1293b.class), (Executor) vVar.f((Z1.t) this.f3852b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0273i(Function2 function2) {
        this.f3851a = 0;
        this.f3852b = (M2.p) function2;
    }
}
