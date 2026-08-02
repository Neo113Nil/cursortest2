package x3;

import f3.AbstractC0423a;
import f3.C0426d;
import f3.InterfaceC0427e;
import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;

/* renamed from: x3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1558s extends AbstractC0423a implements InterfaceC0427e {

    /* renamed from: b, reason: collision with root package name */
    public static final r f16057b = new r(C0426d.f8816a, C1557q.f16054e);

    public AbstractC1558s() {
        super(C0426d.f8816a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((f3.InterfaceC0428f) r3.f16055a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return f3.C0431i.f8817a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (f3.C0426d.f8816a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, o3.l] */
    @Override // f3.AbstractC0423a, f3.InterfaceC0430h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0430h k(InterfaceC0429g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof r) {
            r rVar = (r) key;
            InterfaceC0429g interfaceC0429g = this.f8813a;
            if (interfaceC0429g != rVar && rVar.f16056b != interfaceC0429g) {
                return this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, o3.l] */
    @Override // f3.AbstractC0423a, f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g key) {
        InterfaceC0428f interfaceC0428f;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof r) {
            r rVar = (r) key;
            InterfaceC0429g interfaceC0429g = this.f8813a;
            if ((interfaceC0429g == rVar || rVar.f16056b == interfaceC0429g) && (interfaceC0428f = (InterfaceC0428f) rVar.f16055a.invoke(this)) != null) {
                return interfaceC0428f;
            }
        } else if (C0426d.f8816a == key) {
            return this;
        }
        return null;
    }

    public abstract void s(InterfaceC0430h interfaceC0430h, Runnable runnable);

    public boolean t() {
        return !(this instanceof m0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1562w.c(this);
    }
}
