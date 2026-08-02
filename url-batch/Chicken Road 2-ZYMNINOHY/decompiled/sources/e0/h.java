package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8378a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8379b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8380c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8381d;

    public h(String str, long j4, ArrayList arrayList, List list) {
        this.f8378a = str;
        this.f8379b = j4;
        this.f8380c = Collections.unmodifiableList(arrayList);
        this.f8381d = Collections.unmodifiableList(list);
    }
}
