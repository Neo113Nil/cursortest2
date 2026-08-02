package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdn extends hbl {
    final Object a;
    int b;
    final /* synthetic */ hdt c;

    public hdn(hdt hdtVar, int i) {
        this.c = hdtVar;
        this.a = hdtVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            hdt hdtVar = this.c;
            if (i <= hdtVar.c && Objects.equals(hdtVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.a(this.a);
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        hdt hdtVar = this.c;
        if (i == -1) {
            hdtVar.g(this.a, obj);
            return null;
        }
        Object obj2 = hdtVar.b[i];
        if (Objects.equals(obj2, obj)) {
            return obj;
        }
        hdtVar.h(this.b, obj);
        return obj2;
    }
}
