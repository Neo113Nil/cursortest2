package h0;

import java.util.Collections;
import java.util.List;
import l0.InterfaceC1243a;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC1243a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9165a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9166b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9167c;

    public p(String str, List list, boolean z) {
        this.f9165a = str;
        this.f9166b = Collections.unmodifiableList(list);
        this.f9167c = z;
    }
}
