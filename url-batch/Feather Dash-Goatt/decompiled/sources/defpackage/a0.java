package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a0 extends m {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ a0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.m
    public final int a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) obj).c();
            case 1:
                return ((kk0) obj).a.groupCount() + 1;
            default:
                return ((lw0) obj).i;
        }
    }

    public MatchGroup b(int i) {
        Matcher matcher = ((kk0) this.e).a;
        IntRange g = b11.g(matcher.start(i), matcher.end(i));
        if (g.d < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new MatchGroup(group, g);
    }

    @Override // defpackage.m, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) obj2).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((lw0) obj2).containsValue(obj);
        }
    }

    @Override // defpackage.m, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.d;
        Object obj = this.e;
        int i2 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new z(((qw0) ((b0) obj).a()).iterator(), i2);
            case 1:
                return new bj1(new yy(new x9(i2, new IntRange(0, a() - 1, 1)), new l(11, this)));
            default:
                oj1 oj1Var = ((lw0) obj).h;
                pj1[] pj1VarArr = new pj1[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    pj1VarArr[i3] = new qj1(2);
                }
                return new rw0(oj1Var, pj1VarArr);
        }
    }
}
