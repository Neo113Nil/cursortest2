package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0479a8;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.C1113yl;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13380a = new C0968t6("appmetrica_gender", new C0479a8(), new C1113yl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f13382a;

        Gender(String str) {
            this.f13382a = str;
        }

        public String getStringValue() {
            return this.f13382a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValue(Gender gender) {
        String str = this.f13380a.f12770c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0968t6 c0968t6 = this.f13380a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0968t6.f12768a, new C0940s4(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueIfUndefined(Gender gender) {
        String str = this.f13380a.f12770c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0968t6 c0968t6 = this.f13380a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0968t6.f12768a, new Xk(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueReset() {
        C0968t6 c0968t6 = this.f13380a;
        return new UserProfileUpdate<>(new Bi(0, c0968t6.f12770c, c0968t6.f12768a, c0968t6.f12769b));
    }
}
