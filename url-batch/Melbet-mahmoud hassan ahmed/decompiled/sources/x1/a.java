package x1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23082b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f23083c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f23084d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f23085e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f23086f;

    public a(int i7, int i8, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f23081a = i7;
        this.f23082b = i8;
        this.f23083c = Collections.unmodifiableList(list);
        this.f23084d = Collections.unmodifiableList(list2);
        this.f23085e = Collections.unmodifiableList(list3);
        this.f23086f = Collections.unmodifiableList(list4);
    }
}
