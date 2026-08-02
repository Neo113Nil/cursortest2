package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hhs {
    public Object a;
    public Object b;

    public hhs() {
        this.a = null;
        this.b = Collections.EMPTY_LIST;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final RuntimeException a(boolean z) {
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(this.a);
        for (Object obj : this.b) {
            sb.append(", ");
            sb.append(obj);
        }
        if (z) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    final void b(Object obj) {
        obj.getClass();
        if (this.a == null) {
            this.a = obj;
            return;
        }
        if (this.b.isEmpty()) {
            ArrayList arrayList = new ArrayList(4);
            this.b = arrayList;
            arrayList.add(obj);
        } else {
            if (this.b.size() >= 4) {
                throw a(true);
            }
            this.b.add(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gzf, java.lang.Object] */
    public final gfy c() {
        this.b.getClass();
        this.a = new ifn();
        return new gfy(this.b, (ifn) this.a);
    }

    public final void d(gfz gfzVar) {
        this.b = new gzg(gfzVar);
    }

    public hhs(byte[] bArr) {
    }
}
