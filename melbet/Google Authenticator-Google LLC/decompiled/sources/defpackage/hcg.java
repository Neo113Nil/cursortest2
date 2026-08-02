package defpackage;

import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcg extends hbl {
    final /* synthetic */ hci a;
    private final Object b;
    private int c;

    public hcg(hci hciVar, int i) {
        this.a = hciVar;
        this.b = hciVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            hci hciVar = this.a;
            if (i < hciVar.size() && Objects.equals(this.b, hciVar.g(this.c))) {
                return;
            }
        }
        this.c = this.a.f(this.b);
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object getValue() {
        hci hciVar = this.a;
        Map n = hciVar.n();
        if (n != null) {
            return n.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return hciVar.j(i);
    }

    @Override // defpackage.hbl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        hci hciVar = this.a;
        Map n = hciVar.n();
        if (n != null) {
            return n.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            hciVar.put(this.b, obj);
            return null;
        }
        Object j = hciVar.j(i);
        hciVar.t(this.c, obj);
        return j;
    }
}
