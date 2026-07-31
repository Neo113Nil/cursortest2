package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zd1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final na2 f35566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ce1 f35567b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final le1 f35568c;

    public /* synthetic */ zd1(Context context, na2 na2Var) {
        this(context, na2Var, new ce1(context), new le1());
    }

    @Nullable
    public final ln2 a(@NotNull List verifications) {
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator it = verifications.iterator();
        while (it.hasNext()) {
            la2 la2Var = (la2) it.next();
            try {
                this.f35568c.getClass();
                createListBuilder.add(le1.a(la2Var));
            } catch (ma2 e4) {
                this.f35566a.a(e4);
            } catch (Exception unused) {
                ap0.c(new Object[0]);
            }
        }
        List build = CollectionsKt.build(createListBuilder);
        if (build.isEmpty()) {
            return null;
        }
        return AbstractC2062l8.a(C2086m8.a(), C2109n8.a(xf1.a(), this.f35567b.a(), build));
    }

    public zd1(@NotNull Context context, @NotNull na2 verificationNotExecutedListener, @NotNull ce1 omSdkJsLoader, @NotNull le1 omSdkVerificationScriptResourceCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationNotExecutedListener, "verificationNotExecutedListener");
        Intrinsics.checkNotNullParameter(omSdkJsLoader, "omSdkJsLoader");
        Intrinsics.checkNotNullParameter(omSdkVerificationScriptResourceCreator, "omSdkVerificationScriptResourceCreator");
        this.f35566a = verificationNotExecutedListener;
        this.f35567b = omSdkJsLoader;
        this.f35568c = omSdkVerificationScriptResourceCreator;
    }
}
