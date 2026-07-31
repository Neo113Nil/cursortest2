package com.my.tracker.miniapps;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class MiniAppEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f20876a;

    /* renamed from: b, reason: collision with root package name */
    final String f20877b;

    /* renamed from: c, reason: collision with root package name */
    final String f20878c;

    /* renamed from: d, reason: collision with root package name */
    String f20879d;

    /* renamed from: e, reason: collision with root package name */
    String f20880e;

    /* renamed from: f, reason: collision with root package name */
    String f20881f;

    /* renamed from: g, reason: collision with root package name */
    Map f20882g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f20881f = str3;
        }

        @NonNull
        public CustomEventBuilder withCustomUserId(String str) {
            this.f20880e = str;
            return this;
        }

        @NonNull
        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f20882g = map;
            return this;
        }
    }

    public static final class EventBuilder {

        /* renamed from: a, reason: collision with root package name */
        final String f20883a;

        /* renamed from: b, reason: collision with root package name */
        final String f20884b;

        EventBuilder(String str, String str2) {
            this.f20883a = str;
            this.f20884b = str2;
        }

        @NonNull
        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f20883a, this.f20884b);
        }

        @NonNull
        public CustomEventBuilder customEvent(@NonNull String str) {
            return new CustomEventBuilder(this.f20883a, this.f20884b, str);
        }

        @NonNull
        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f20883a, this.f20884b);
        }

        @NonNull
        public OpenEventBuilder openEvent(@NonNull String str) {
            return new OpenEventBuilder(this.f20883a, this.f20884b, str);
        }

        @NonNull
        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f20883a, this.f20884b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f20879d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i4, String str, String str2) {
            super(i4, str, str2);
        }

        @NonNull
        public UserEventBuilder withCustomUserId(String str) {
            this.f20880e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i4, String str, String str2) {
        this.f20876a = i4;
        this.f20877b = str;
        this.f20878c = str2;
    }

    @NonNull
    public static EventBuilder newEventBuilder(@NonNull String str, @NonNull String str2) {
        return new EventBuilder(str, str2);
    }

    @NonNull
    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f20876a, this.f20877b, this.f20878c, this.f20879d, this.f20880e, this.f20881f, this.f20882g == null ? null : new TreeMap(this.f20882g));
    }
}
