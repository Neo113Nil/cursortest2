package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_DeveloperProvidedBillingDetailsAndroid.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0097\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/Func_void_DeveloperProvidedBillingDetailsAndroid_java;", "Lcom/margelo/nitro/iap/Func_void_DeveloperProvidedBillingDetailsAndroid;", "function", "Lkotlin/Function1;", "Lcom/margelo/nitro/iap/DeveloperProvidedBillingDetailsAndroid;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "details", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Func_void_DeveloperProvidedBillingDetailsAndroid_java implements Func_void_DeveloperProvidedBillingDetailsAndroid {
    private final Function1<DeveloperProvidedBillingDetailsAndroid, Unit> function;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeveloperProvidedBillingDetailsAndroid developerProvidedBillingDetailsAndroid) {
        invoke2(developerProvidedBillingDetailsAndroid);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Func_void_DeveloperProvidedBillingDetailsAndroid_java(Function1<? super DeveloperProvidedBillingDetailsAndroid, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.margelo.nitro.iap.Func_void_DeveloperProvidedBillingDetailsAndroid
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(DeveloperProvidedBillingDetailsAndroid details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.function.invoke(details);
    }
}
