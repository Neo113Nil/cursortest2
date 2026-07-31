package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2982t8;
import io.appmetrica.analytics.impl.C3008u8;
import io.appmetrica.analytics.impl.C3125yl;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;

/* loaded from: classes3.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final O6 f40663a = new O6("appmetrica_gender", new C3008u8(), new C3125yl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f40665a;

        Gender(String str) {
            this.f40665a = str;
        }

        public String getStringValue() {
            return this.f40665a;
        }
    }

    GenderAttribute() {
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValue(@NonNull Gender gender) {
        String str = this.f40663a.f38052c;
        String stringValue = gender.getStringValue();
        C2982t8 c2982t8 = new C2982t8();
        O6 o6 = this.f40663a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c2982t8, o6.f38050a, new N4(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f40663a.f38052c;
        String stringValue = gender.getStringValue();
        C2982t8 c2982t8 = new C2982t8();
        O6 o6 = this.f40663a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c2982t8, o6.f38050a, new Yk(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueReset() {
        O6 o6 = this.f40663a;
        return new UserProfileUpdate<>(new Oi(0, o6.f38052c, o6.f38050a, o6.f38051b));
    }
}
