package A4;

import D4.j;
import D4.k;
import F4.d;
import F4.e;
import F4.i;
import F4.l;
import F4.m;
import V3.g;
import X5.w;
import a4.C0228a;
import a4.f;
import c5.C0290a;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.debug.internal.crash.r;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d4.InterfaceC0326h;
import d4.InterfaceC0328j;
import d5.C0334d;
import d5.C0335e;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53a;

    public /* synthetic */ b(int i7) {
        this.f53a = i7;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        m[] d7;
        switch (this.f53a) {
            case 0:
                return ((Integer) obj).toString();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                obj.getClass();
                throw new ClassCastException();
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new IdentityHashMap(8);
            case 3:
                return new ArrayList();
            case 4:
                byte[] bArr = new byte[16];
                f.a((String) obj, 32, bArr);
                return bArr;
            case 5:
                byte[] bArr2 = new byte[8];
                f.a((String) obj, 16, bArr2);
                return bArr2;
            case 6:
                return new e(1, j.f((String) obj));
            case 7:
                return new d(((Boolean) obj).booleanValue());
            case 8:
                return new l(((Long) obj).longValue());
            case 9:
                return new F4.f(((Double) obj).doubleValue());
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return i.b((g) obj);
            case 11:
                return ((S4.a) obj).i();
            case 12:
                return ((S4.a) obj).k();
            case 13:
                S4.a aVar = (S4.a) obj;
                boolean z5 = aVar instanceof T4.a;
                if (z5) {
                    W3.b c7 = i.c(aVar);
                    if (c7.isEmpty()) {
                        d7 = i.f769b;
                    } else {
                        m[] mVarArr = new m[c7.size()];
                        c7.forEach(new F4.h(mVarArr, 0));
                        d7 = mVarArr;
                    }
                } else {
                    d7 = m.d(aVar.getAttributes());
                }
                m[] mVarArr2 = d7;
                int size = z5 ? i.c(aVar).size() : aVar.getAttributes().size();
                k b7 = aVar.h() == null ? null : i.b(aVar.h());
                InterfaceC0326h d8 = aVar.d();
                long g7 = aVar.g();
                long j4 = aVar.j();
                D4.a d9 = G4.b.d(aVar.e());
                byte[] f7 = j.f(aVar.f());
                int a7 = aVar.a() - size;
                C0228a c0228a = (C0228a) d8;
                InterfaceC0328j interfaceC0328j = c0228a.f3131c;
                String str = c0228a.f3130b;
                String str2 = c0228a.f3129a;
                if (str2.equals("00000000000000000000000000000000")) {
                    str2 = null;
                }
                return new G4.b(g7, j4, d9, f7, b7, mVarArr2, a7, interfaceC0328j, str2, str.equals("0000000000000000") ? null : str, j.f(aVar.b()));
            case 14:
                return Boolean.valueOf(c.f54a.contains(Integer.valueOf(((w) obj).f3064i)));
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=");
                Iterable iterable = (Iterable) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                sb.append(sb2.toString());
                return sb.toString();
            case 16:
                return new AtomicInteger(0);
            case 17:
                if (obj == null) {
                    return "null";
                }
                throw new ClassCastException();
            case 18:
                return ((a4.e) obj).f3140b;
            case 19:
                Map.Entry entry2 = (Map.Entry) obj;
                return new V3.d((String) entry2.getKey(), (g) entry2.getValue());
            case 20:
                V3.d dVar = (V3.d) obj;
                return dVar.f2716a + "=" + dVar.f2717b.b();
            case 21:
                return ((g) obj).b();
            case 22:
                return ((X3.a) obj).f2864b;
            case 23:
                return new C0334d();
            case 24:
                ((C0290a) obj).getClass();
                return null;
            case 25:
                return ((Map.Entry) obj).getValue().toString();
            case r.MIN_SDK_VERSION /* 26 */:
                return (String) ((Map.Entry) obj).getValue();
            case 27:
                return ((C0335e) obj).f3968b;
            case 28:
                return ((C0335e) obj).f3969c.stream();
            default:
                return ((x4.j) obj).f6219h;
        }
    }
}
