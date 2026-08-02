package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.userjourneys.data.UserJourney;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class JourneySelector$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UserJourney$Name f$0;

    public /* synthetic */ JourneySelector$$ExternalSyntheticLambda0(UserJourney$Name userJourney$Name, int i) {
        this.$r8$classId = i;
        this.f$0 = userJourney$Name;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UserJourney$Name userJourney$Name = this.f$0;
        UserJourney userJourney = (UserJourney) obj;
        switch (i) {
            case 0:
                userJourney.getClass();
                return Boolean.valueOf(userJourney.getName() == userJourney$Name);
            default:
                userJourney.getClass();
                if (userJourney$Name != null && userJourney.getName() != userJourney$Name) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
        }
    }
}
