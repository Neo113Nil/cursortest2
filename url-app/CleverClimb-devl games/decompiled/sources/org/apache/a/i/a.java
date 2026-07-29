package org.apache.a.i;

/* compiled from: AbstractHttpParams.java */
/* loaded from: classes2.dex */
public abstract class a implements d {
    protected a() {
    }

    @Override // org.apache.a.i.d
    public int a(String str, int i) {
        Object a2 = a(str);
        return a2 == null ? i : ((Integer) a2).intValue();
    }

    @Override // org.apache.a.i.d
    public d b(String str, int i) {
        a(str, new Integer(i));
        return this;
    }

    @Override // org.apache.a.i.d
    public boolean a(String str, boolean z) {
        Object a2 = a(str);
        return a2 == null ? z : ((Boolean) a2).booleanValue();
    }

    @Override // org.apache.a.i.d
    public d b(String str, boolean z) {
        a(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // org.apache.a.i.d
    public boolean b(String str) {
        return a(str, false);
    }

    @Override // org.apache.a.i.d
    public boolean c(String str) {
        return !a(str, false);
    }
}
