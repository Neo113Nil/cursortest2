package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0549bn;
import io.appmetrica.analytics.impl.C0573cl;
import io.appmetrica.analytics.impl.C0637f8;
import io.appmetrica.analytics.impl.C0663g8;
import io.appmetrica.analytics.impl.C1149z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0679go;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f9931a = new A6("appmetrica_gender", new C0663g8(), new Cl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f9933a;

        Gender(String str) {
            this.f9933a = str;
        }

        public String getStringValue() {
            return this.f9933a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValue(Gender gender) {
        String str = this.f9931a.f6503c;
        String stringValue = gender.getStringValue();
        C0637f8 c0637f8 = new C0637f8();
        A6 a6 = this.f9931a;
        return new UserProfileUpdate<>(new C0549bn(str, stringValue, c0637f8, a6.f6501a, new C1149z4(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueIfUndefined(Gender gender) {
        String str = this.f9931a.f6503c;
        String stringValue = gender.getStringValue();
        C0637f8 c0637f8 = new C0637f8();
        A6 a6 = this.f9931a;
        return new UserProfileUpdate<>(new C0549bn(str, stringValue, c0637f8, a6.f6501a, new C0573cl(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueReset() {
        A6 a6 = this.f9931a;
        return new UserProfileUpdate<>(new Gi(0, a6.f6503c, a6.f6501a, a6.f6502b));
    }
}
