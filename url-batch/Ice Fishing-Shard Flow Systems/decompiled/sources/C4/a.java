package C4;

import D6.C;
import com.appsflyer.attribution.RequestError;
import h5.AbstractC0494b;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import k5.C0601a;
import n5.C0760b;
import z1.AbstractC1053a;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295a;

    public /* synthetic */ a(int i2) {
        this.f295a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        m5.m[] d7;
        switch (this.f295a) {
            case 0:
                return ((H4.e) obj).f991b;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                return new g((String) entry.getKey(), (j) entry.getValue());
            case 2:
                g gVar = (g) obj;
                return gVar.f310a + "=" + gVar.f311b.a();
            case 3:
                return ((j) obj).a();
            case 4:
                return ((E4.a) obj).f701b;
            case 5:
                return new K5.d();
            case 6:
                ((J5.a) obj).getClass();
                return null;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((Map.Entry) obj).getValue().toString();
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return (String) ((Map.Entry) obj).getValue();
            case 9:
                return ((K5.e) obj).f1472b;
            case 10:
                return ((K5.e) obj).f1473c.stream();
            case RequestError.STOP_TRACKING /* 11 */:
                return ((e5.j) obj).f4733i;
            case 12:
                return AbstractC1053a.c(((e5.j) obj).f4734l);
            case 13:
                return AbstractC1053a.c((e5.b) obj);
            case 14:
                return ((Integer) obj).toString();
            case 15:
                obj.getClass();
                throw new ClassCastException();
            case 16:
                return new IdentityHashMap(8);
            case 17:
                return new ArrayList();
            case 18:
                byte[] bArr = new byte[16];
                H4.f.a((String) obj, 32, bArr);
                return bArr;
            case 19:
                byte[] bArr2 = new byte[8];
                H4.f.a((String) obj, 16, bArr2);
                return bArr2;
            case 20:
                return new m5.e(k5.h.f((String) obj), 1);
            case 21:
                return new m5.d(((Boolean) obj).booleanValue());
            case 22:
                return new m5.l(((Long) obj).longValue());
            case 23:
                return new m5.f(((Double) obj).doubleValue());
            case 24:
                return m5.i.a((j) obj);
            case 25:
                return ((InterfaceC1060a) obj).i();
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                return ((InterfaceC1060a) obj).k();
            case 27:
                InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
                boolean z7 = interfaceC1060a instanceof A5.a;
                if (z7) {
                    D4.b c7 = m5.i.c(interfaceC1060a);
                    if (c7.isEmpty()) {
                        d7 = m5.i.f6568b;
                    } else {
                        m5.m[] mVarArr = new m5.m[c7.size()];
                        c7.forEach(new m5.h(mVarArr, 0));
                        d7 = mVarArr;
                    }
                } else {
                    d7 = m5.m.d(interfaceC1060a.getAttributes());
                }
                m5.m[] mVarArr2 = d7;
                int size = z7 ? m5.i.c(interfaceC1060a).size() : interfaceC1060a.getAttributes().size();
                k5.i a7 = interfaceC1060a.h() == null ? null : m5.i.a(interfaceC1060a.h());
                K4.h d8 = interfaceC1060a.d();
                long g7 = interfaceC1060a.g();
                long j = interfaceC1060a.j();
                C0601a d9 = C0760b.d(interfaceC1060a.e());
                byte[] f7 = k5.h.f(interfaceC1060a.f());
                int a8 = interfaceC1060a.a() - size;
                H4.a aVar = (H4.a) d8;
                K4.j jVar = aVar.f982c;
                String str = aVar.f981b;
                String str2 = aVar.f980a;
                if (str2.equals("00000000000000000000000000000000")) {
                    str2 = null;
                }
                return new C0760b(g7, j, d9, f7, a7, mVarArr2, a8, jVar, str2, str.equals("0000000000000000") ? null : str, k5.h.f(interfaceC1060a.b()));
            case 28:
                return Boolean.valueOf(AbstractC0494b.f5283a.contains(Integer.valueOf(((C) obj).f429l)));
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry2.getKey());
                sb.append("=");
                Iterable iterable = (Iterable) entry2.getValue();
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
        }
    }
}
