package com.squareup.cash.treehouse.android.configuration;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class TreehouseAppConfigurationsQueries$forId$2 extends FunctionReferenceImpl implements Function4 {
    public static final TreehouseAppConfigurationsQueries$forId$2 INSTANCE = new TreehouseAppConfigurationsQueries$forId$2(4, TreehouseAppConfigurations.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/cash/treehouse/android/configuration/EndpointType;Ljava/lang/String;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        str.getClass();
        return new TreehouseAppConfigurations(str, (EndpointType) obj2, (String) obj3, (Long) obj4);
    }
}
