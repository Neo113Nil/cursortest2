package e1;

import X0.v;
import X0.w;
import f1.AbstractC4490a;
import j1.AbstractC4591d;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37266a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37267b;

    public g(int i, String str, boolean z8) {
        this.f37266a = i;
        this.f37267b = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        if (((HashSet) vVar.f3726E.f37858u).contains(w.f3764n)) {
            return new Z0.l(this);
        }
        AbstractC4591d.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f37266a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
