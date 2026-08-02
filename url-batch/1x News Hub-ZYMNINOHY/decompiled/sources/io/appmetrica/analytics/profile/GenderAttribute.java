package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0398bn;
import io.appmetrica.analytics.impl.C0422cl;
import io.appmetrica.analytics.impl.C0486f8;
import io.appmetrica.analytics.impl.C0512g8;
import io.appmetrica.analytics.impl.C0998z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0528go;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8952a = new A6("appmetrica_gender", new C0512g8(), new Cl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f8954a;

        Gender(String str) {
            this.f8954a = str;
        }

        public String getStringValue() {
            return this.f8954a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValue(Gender gender) {
        String str = this.f8952a.f5728c;
        String stringValue = gender.getStringValue();
        C0486f8 c0486f8 = new C0486f8();
        A6 a6 = this.f8952a;
        return new UserProfileUpdate<>(new C0398bn(str, stringValue, c0486f8, a6.f5726a, new C0998z4(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueIfUndefined(Gender gender) {
        String str = this.f8952a.f5728c;
        String stringValue = gender.getStringValue();
        C0486f8 c0486f8 = new C0486f8();
        A6 a6 = this.f8952a;
        return new UserProfileUpdate<>(new C0398bn(str, stringValue, c0486f8, a6.f5726a, new C0422cl(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueReset() {
        A6 a6 = this.f8952a;
        return new UserProfileUpdate<>(new Gi(0, a6.f5728c, a6.f5726a, a6.f5727b));
    }
}
