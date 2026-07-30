package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.text.MatchGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o0 extends b0 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ o0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.b0
    public final int a() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return ((m0) obj).c();
            case 1:
                return ((oi1) obj).a.groupCount() + 1;
            default:
                return ((w02) obj).q;
        }
    }

    public MatchGroup b(int i) {
        Matcher matcher = ((oi1) this.n).a;
        IntRange f = d.f(matcher.start(i), matcher.end(i));
        if (f.m < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new MatchGroup(group, f);
    }

    @Override // defpackage.b0, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return ((m0) obj2).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((w02) obj2).containsValue(obj);
        }
    }

    @Override // defpackage.b0, java.util.Collection
    public boolean isEmpty() {
        switch (this.m) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.m;
        Object obj = this.n;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                return new n0(((b12) ((m0) obj).a()).iterator(), i3);
            case 1:
                return new zy2(new ps2(new yv(i2, new IntRange(0, size() - 1, 1)), new a0(6, this), 1));
            default:
                uz2 uz2Var = ((w02) obj).p;
                vz2[] vz2VarArr = new vz2[8];
                while (i2 < 8) {
                    vz2VarArr[i2] = new wz2(2);
                    i2++;
                }
                return new c12(uz2Var, vz2VarArr);
        }
    }
}
