package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksh implements Serializable, kti {
    public static final Object b = ksg.a;
    private transient kti a;
    public final Object c;
    public final String d;
    public final String e;
    private final Class f;
    private final boolean g;

    protected ksh(Object obj, Class cls, String str, String str2, boolean z) {
        this.c = obj;
        this.f = cls;
        this.d = str;
        this.e = str2;
        this.g = z;
    }

    public final kti b() {
        kti ktiVar = this.a;
        if (ktiVar != null) {
            return ktiVar;
        }
        e();
        this.a = this;
        return this;
    }

    public final ktk c() {
        Class cls = this.f;
        if (cls == null) {
            return null;
        }
        if (this.g) {
            int i = ksx.a;
            return new ksq(cls);
        }
        int i2 = ksx.a;
        return new ksj(cls);
    }

    @Override // defpackage.kti
    public final Object d() {
        throw null;
    }

    protected abstract void e();
}
