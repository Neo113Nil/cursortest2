package ru.rustore.sdk.install.identifier.internal.di;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$sharedPreferences$2 extends s implements Function0<SharedPreferences> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$sharedPreferences$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        Context context;
        context = this.this$0.applicationContext;
        return context.getSharedPreferences("InstallIdentifierPrefs", 0);
    }
}
