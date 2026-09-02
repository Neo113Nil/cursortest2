package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391a {

    /* renamed from: a, reason: collision with root package name */
    public final long f8336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8337b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8338c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8339d;

    /* renamed from: e, reason: collision with root package name */
    public final List f8340e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8341f;

    public C0391a(long j4, int i4, ArrayList arrayList, List list, List list2, List list3) {
        this.f8336a = j4;
        this.f8337b = i4;
        this.f8338c = Collections.unmodifiableList(arrayList);
        this.f8339d = Collections.unmodifiableList(list);
        this.f8340e = Collections.unmodifiableList(list2);
        this.f8341f = Collections.unmodifiableList(list3);
    }
}
