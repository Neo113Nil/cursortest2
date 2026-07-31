package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0040a8;
import io.appmetrica.analytics.impl.C0066b8;
import io.appmetrica.analytics.impl.C0519t4;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.C0686zl;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Zm;

/* loaded from: classes3.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0546u6 f1687a = new C0546u6("appmetrica_gender", new C0066b8(), new C0686zl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f1688a;

        Gender(String str) {
            this.f1688a = str;
        }

        public String getStringValue() {
            return this.f1688a;
        }
    }

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValue(Gender gender) {
        String str = this.f1687a.c;
        String stringValue = gender.getStringValue();
        C0040a8 c0040a8 = new C0040a8();
        C0546u6 c0546u6 = this.f1687a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c0040a8, c0546u6.f1510a, new C0519t4(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueIfUndefined(Gender gender) {
        String str = this.f1687a.c;
        String stringValue = gender.getStringValue();
        C0040a8 c0040a8 = new C0040a8();
        C0546u6 c0546u6 = this.f1687a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c0040a8, c0546u6.f1510a, new Yk(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueReset() {
        C0546u6 c0546u6 = this.f1687a;
        return new UserProfileUpdate<>(new Ci(0, c0546u6.c, c0546u6.f1510a, c0546u6.b));
    }
}
