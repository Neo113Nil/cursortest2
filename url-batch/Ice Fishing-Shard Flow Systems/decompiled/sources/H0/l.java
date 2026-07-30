package H0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0655b;
import l0.InterfaceC0656c;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC0655b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f911d;

    public /* synthetic */ l(Context context) {
        this.f911d = context;
    }

    @Override // l0.InterfaceC0655b
    public InterfaceC0656c c(H6.h configuration) {
        Context context = this.f911d;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = (String) configuration.f1053d;
        B6.o callback = (B6.o) configuration.f1054e;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        Intrinsics.checkNotNullParameter(new H6.h(context, str, callback, true, true), "configuration");
        return new m0.h(context, str, callback, true, true);
    }
}
