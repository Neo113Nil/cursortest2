package i1;

import W2.InterfaceC0302y;
import f1.C0607a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679b {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0302y f7004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7005c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0607a f7006d;

    public C0679b(Function1 produceMigrations, InterfaceC0302y scope) {
        Intrinsics.checkNotNullParameter("app_state", "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7003a = produceMigrations;
        this.f7004b = scope;
        this.f7005c = new Object();
    }
}
