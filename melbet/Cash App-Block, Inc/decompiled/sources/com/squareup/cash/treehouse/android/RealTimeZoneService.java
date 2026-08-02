package com.squareup.cash.treehouse.android;

import com.squareup.cash.treehouse.activity.TimeZoneOffsetDatabase;
import com.squareup.cash.treehouse.activity.TimeZoneService;
import com.squareup.cash.treehouse.trustedkeys.CashAppManifestVerifierKt;
import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class RealTimeZoneService implements TimeZoneService {
    public final TimeZoneOffsetDatabase timeZoneOffsetDatabase;

    public RealTimeZoneService(TimeZoneOffsetDatabase timeZoneOffsetDatabase) {
        this.timeZoneOffsetDatabase = timeZoneOffsetDatabase;
    }

    @Override // com.squareup.cash.treehouse.activity.TimeZoneService
    public final TimeZoneOffsetDatabase getTimeZoneDatabase() {
        return this.timeZoneOffsetDatabase;
    }

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new RealTimeZoneService((TimeZoneOffsetDatabase) INSTANCE.invoke());
                case 1:
                    return new AndroidTimeZoneOffsetDatabase();
                case 2:
                    return Boolean.FALSE;
                case 3:
                    return new ProductionTreehouseModule$provideLocalDevelopmentHost$1();
                case 4:
                    return CashAppManifestVerifierKt.CASH_APP_MANIFEST_VERIFIER;
                default:
                    return EmptySet.INSTANCE;
            }
        }
    }
}
