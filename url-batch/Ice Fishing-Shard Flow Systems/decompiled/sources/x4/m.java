package x4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import s4.u;
import s4.v;

/* loaded from: classes.dex */
public final class m extends v {

    /* renamed from: d, reason: collision with root package name */
    public static final m f8371d = new m();

    @Override // s4.v
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        if (b7 != -127) {
            if (b7 != -126) {
                return super.f(b7, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            f fVar = new f();
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            fVar.f8357a = str;
            C1010e c1010e = (C1010e) arrayList.get(1);
            if (c1010e == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            fVar.f8358b = c1010e;
            fVar.f8359c = (Boolean) arrayList.get(2);
            Map map = (Map) arrayList.get(3);
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            fVar.f8360d = map;
            return fVar;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        C1010e c1010e2 = new C1010e();
        String str2 = (String) arrayList2.get(0);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        c1010e2.f8343a = str2;
        String str3 = (String) arrayList2.get(1);
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        c1010e2.f8344b = str3;
        String str4 = (String) arrayList2.get(2);
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        c1010e2.f8345c = str4;
        String str5 = (String) arrayList2.get(3);
        if (str5 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        c1010e2.f8346d = str5;
        c1010e2.f8347e = (String) arrayList2.get(4);
        c1010e2.f8348f = (String) arrayList2.get(5);
        c1010e2.f8349g = (String) arrayList2.get(6);
        c1010e2.f8350h = (String) arrayList2.get(7);
        c1010e2.f8351i = (String) arrayList2.get(8);
        c1010e2.j = (String) arrayList2.get(9);
        c1010e2.f8352k = (String) arrayList2.get(10);
        c1010e2.f8353l = (String) arrayList2.get(11);
        c1010e2.f8354m = (String) arrayList2.get(12);
        c1010e2.f8355n = (String) arrayList2.get(13);
        c1010e2.f8356o = (String) arrayList2.get(14);
        return c1010e2;
    }

    @Override // s4.v
    public final void k(u uVar, Object obj) {
        if (!(obj instanceof C1010e)) {
            if (!(obj instanceof f)) {
                super.k(uVar, obj);
                return;
            }
            uVar.write(130);
            f fVar = (f) obj;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(fVar.f8357a);
            arrayList.add(fVar.f8358b);
            arrayList.add(fVar.f8359c);
            arrayList.add(fVar.f8360d);
            k(uVar, arrayList);
            return;
        }
        uVar.write(129);
        C1010e c1010e = (C1010e) obj;
        c1010e.getClass();
        ArrayList arrayList2 = new ArrayList(15);
        arrayList2.add(c1010e.f8343a);
        arrayList2.add(c1010e.f8344b);
        arrayList2.add(c1010e.f8345c);
        arrayList2.add(c1010e.f8346d);
        arrayList2.add(c1010e.f8347e);
        arrayList2.add(c1010e.f8348f);
        arrayList2.add(c1010e.f8349g);
        arrayList2.add(c1010e.f8350h);
        arrayList2.add(c1010e.f8351i);
        arrayList2.add(c1010e.j);
        arrayList2.add(c1010e.f8352k);
        arrayList2.add(c1010e.f8353l);
        arrayList2.add(c1010e.f8354m);
        arrayList2.add(c1010e.f8355n);
        arrayList2.add(c1010e.f8356o);
        k(uVar, arrayList2);
    }
}
