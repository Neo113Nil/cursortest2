package a3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f93a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<Double> f94b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<Double> f95c = new ArrayList();

    public final j0 a(String str, double d7, double d8) {
        int i7 = 0;
        while (i7 < this.f93a.size()) {
            double doubleValue = this.f95c.get(i7).doubleValue();
            double doubleValue2 = this.f94b.get(i7).doubleValue();
            if (d7 < doubleValue || (doubleValue == d7 && d8 < doubleValue2)) {
                break;
            }
            i7++;
        }
        this.f93a.add(i7, str);
        this.f95c.add(i7, Double.valueOf(d7));
        this.f94b.add(i7, Double.valueOf(d8));
        return this;
    }

    public final l0 b() {
        return new l0(this, null);
    }
}
