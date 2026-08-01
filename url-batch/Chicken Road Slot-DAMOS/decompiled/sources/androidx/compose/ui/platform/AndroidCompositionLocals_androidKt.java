package androidx.compose.ui.platform;

import d2.i0;
import i4.e;
import kotlin.Metadata;
import n0.n2;
import n0.p1;
import n0.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ln0/p1;", "Landroidx/lifecycle/u;", "getLocalLifecycleOwner", "()Ln0/p1;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final v f464a = new v(i0.f3419e);

    /* renamed from: b, reason: collision with root package name */
    public static final n2 f465b = new n2(i0.f3420i);

    /* renamed from: c, reason: collision with root package name */
    public static final v f466c = new v();

    /* renamed from: d, reason: collision with root package name */
    public static final n2 f467d = new n2(i0.f3421r);

    /* renamed from: e, reason: collision with root package name */
    public static final n2 f468e = new n2(i0.f3422s);

    /* renamed from: f, reason: collision with root package name */
    public static final n2 f469f = new n2(i0.f3423t);

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final p1 getLocalLifecycleOwner() {
        return e.f4646a;
    }
}
