package B1;

import android.content.Context;
import f1.InterfaceC0615i;
import j1.C0710d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Context f963a;

    /* renamed from: b, reason: collision with root package name */
    public final C0710d f964b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710d f965c;

    /* renamed from: d, reason: collision with root package name */
    public final C0710d f966d;

    /* renamed from: e, reason: collision with root package name */
    public final G f967e;

    /* renamed from: f, reason: collision with root package name */
    public final G f968f;

    public I(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f963a = context;
        Intrinsics.checkNotNullParameter("privacy_policy_url", "name");
        this.f964b = new C0710d("privacy_policy_url");
        Intrinsics.checkNotNullParameter("response_time", "name");
        this.f965c = new C0710d("response_time");
        Intrinsics.checkNotNullParameter("consent_accepted", "name");
        this.f966d = new C0710d("consent_accepted");
        this.f967e = new G(((InterfaceC0615i) J.a(context).f6561e).n(), this, 0);
        this.f968f = new G(((InterfaceC0615i) J.a(context).f6561e).n(), this, 1);
    }
}
