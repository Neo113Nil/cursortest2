package com.squareup.cash.userjourneys.tracker;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class UserJourneysAppModule$Companion$provideJourneyReporterContext$5 extends FunctionReferenceImpl implements Function0 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public UserJourneysAppModule$Companion$provideJourneyReporterContext$5() {
        super(0, Locale.class, "getDefault", "getDefault()Ljava/util/Locale;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Locale.getDefault();
    }
}
