package t2;

import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f40922a;

    /* renamed from: b, reason: collision with root package name */
    public final double f40923b;

    /* renamed from: c, reason: collision with root package name */
    public final double f40924c;

    /* renamed from: d, reason: collision with root package name */
    public final double f40925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40926e;

    public o(String str, double d2, double d3, double d9, int i) {
        this.f40922a = str;
        this.f40924c = d2;
        this.f40923b = d3;
        this.f40925d = d9;
        this.f40926e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return O2.w.l(this.f40922a, oVar.f40922a) && this.f40923b == oVar.f40923b && this.f40924c == oVar.f40924c && this.f40926e == oVar.f40926e && Double.compare(this.f40925d, oVar.f40925d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40922a, Double.valueOf(this.f40923b), Double.valueOf(this.f40924c), Double.valueOf(this.f40925d), Integer.valueOf(this.f40926e)});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.j(this.f40922a, "name");
        lVar.j(Double.valueOf(this.f40924c), "minBound");
        lVar.j(Double.valueOf(this.f40923b), "maxBound");
        lVar.j(Double.valueOf(this.f40925d), "percent");
        lVar.j(Integer.valueOf(this.f40926e), NewHtcHomeBadger.COUNT);
        return lVar.toString();
    }
}
