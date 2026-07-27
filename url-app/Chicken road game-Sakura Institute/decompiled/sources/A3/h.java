package A3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import z3.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v f858a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f859b;

    /* renamed from: c, reason: collision with root package name */
    public final long f860c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f862e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f863f;

    public /* synthetic */ h(v vVar) {
        this(vVar, true, "", -1L, -1L, -1, null, -1L);
    }

    public h(v canonicalPath, boolean z4, String comment, long j4, long j5, int i2, Long l4, long j6) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f858a = canonicalPath;
        this.f859b = z4;
        this.f860c = j5;
        this.f861d = l4;
        this.f862e = j6;
        this.f863f = new ArrayList();
    }
}
