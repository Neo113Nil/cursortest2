package x1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f23126a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23127b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f23128c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f> f23129d;

    /* renamed from: e, reason: collision with root package name */
    public final e f23130e;

    public g(String str, long j7, List<a> list, List<f> list2) {
        this(str, j7, list, list2, null);
    }

    public g(String str, long j7, List<a> list, List<f> list2, e eVar) {
        this.f23126a = str;
        this.f23127b = j7;
        this.f23128c = Collections.unmodifiableList(list);
        this.f23129d = Collections.unmodifiableList(list2);
        this.f23130e = eVar;
    }

    public int a(int i7) {
        int size = this.f23128c.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f23128c.get(i8).f23082b == i7) {
                return i8;
            }
        }
        return -1;
    }
}
