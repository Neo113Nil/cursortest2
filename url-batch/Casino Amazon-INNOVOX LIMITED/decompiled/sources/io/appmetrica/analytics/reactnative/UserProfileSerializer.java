package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;

/* loaded from: classes3.dex */
final class UserProfileSerializer {
    private UserProfileSerializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserProfile fromReadableMap(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("attributes");
        if (array == null) {
            throw new IllegalArgumentException();
        }
        UserProfile.Builder newBuilder = UserProfile.newBuilder();
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            if (map != null) {
                newBuilder.apply(parseUserProfileUpdate(map));
            }
        }
        return newBuilder.build();
    }

    private static UserProfileUpdate<?> parseUserProfileUpdate(ReadableMap readableMap) {
        String string = readableMap.getString(WebViewManager.EVENT_TYPE_KEY);
        if (string == null) {
            throw new IllegalArgumentException("Type should not be null");
        }
        if (string.startsWith("BirthDate")) {
            return parseBirthDate(string, readableMap);
        }
        if (string.startsWith("Boolean")) {
            return parseBoolean(string, readableMap);
        }
        if (string.startsWith("Counter")) {
            return parseCounter(string, readableMap);
        }
        if (string.startsWith("Gender")) {
            return parseGender(string, readableMap);
        }
        if (string.startsWith("Name")) {
            return parseName(string, readableMap);
        }
        if (string.startsWith("NotificationsEnabled")) {
            return parseNotificationsEnabled(string, readableMap);
        }
        if (string.startsWith("Number")) {
            return parseNumber(string, readableMap);
        }
        if (string.startsWith("String")) {
            return parseString(string, readableMap);
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + string);
    }

    private static UserProfileUpdate<?> parseBirthDate(String str, ReadableMap readableMap) {
        BirthDateAttribute birthDate;
        birthDate = Attribute.birthDate();
        str.hashCode();
        switch (str) {
            case "BirthDateWithAge":
                int i = readableMap.getInt("age");
                return readableMap.getBoolean("ifUndefined") ? birthDate.withAgeIfUndefined(i) : birthDate.withAge(i);
            case "BirthDateWithDay":
                int i2 = readableMap.getInt("year");
                int i3 = readableMap.getInt("month");
                int i4 = readableMap.getInt("day");
                return readableMap.getBoolean("ifUndefined") ? birthDate.withBirthDateIfUndefined(i2, i3, i4) : birthDate.withBirthDate(i2, i3, i4);
            case "BirthDateValueReset":
                return birthDate.withValueReset();
            case "BirthDateWithYear":
                int i5 = readableMap.getInt("year");
                return readableMap.getBoolean("ifUndefined") ? birthDate.withBirthDateIfUndefined(i5) : birthDate.withBirthDate(i5);
            case "BirthDateWithMonth":
                int i6 = readableMap.getInt("year");
                int i7 = readableMap.getInt("month");
                return readableMap.getBoolean("ifUndefined") ? birthDate.withBirthDateIfUndefined(i6, i7) : birthDate.withBirthDate(i6, i7);
            default:
                throw new IllegalArgumentException("Unknown UserProfile type " + str);
        }
    }

    private static UserProfileUpdate<?> parseBoolean(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        BooleanAttribute customBoolean = Attribute.customBoolean(string);
        str.hashCode();
        if (str.equals("BooleanValueReset")) {
            return customBoolean.withValueReset();
        }
        if (str.equals("BooleanValue")) {
            boolean z = readableMap.getBoolean("value");
            return readableMap.getBoolean("ifUndefined") ? customBoolean.withValueIfUndefined(z) : customBoolean.withValue(z);
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + str);
    }

    private static UserProfileUpdate<?> parseCounter(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        CounterAttribute customCounter = Attribute.customCounter(string);
        if (str.equals("Counter")) {
            return customCounter.withDelta(readableMap.getDouble("delta"));
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + str);
    }

    private static UserProfileUpdate<?> parseGender(String str, ReadableMap readableMap) {
        GenderAttribute gender = Attribute.gender();
        str.hashCode();
        if (str.equals("GenderValueReset")) {
            return gender.withValueReset();
        }
        if (str.equals("GenderValue")) {
            String string = readableMap.getString("value");
            if (string == null) {
                throw new IllegalArgumentException("Value should not be null");
            }
            GenderAttribute.Gender gender2 = getGender(string);
            return readableMap.getBoolean("ifUndefined") ? gender.withValueIfUndefined(gender2) : gender.withValue(gender2);
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + str);
    }

    private static GenderAttribute.Gender getGender(String str) {
        str.hashCode();
        if (str.equals("female")) {
            return GenderAttribute.Gender.FEMALE;
        }
        if (str.equals("male")) {
            return GenderAttribute.Gender.MALE;
        }
        return GenderAttribute.Gender.OTHER;
    }

    private static UserProfileUpdate<?> parseName(String str, ReadableMap readableMap) {
        NameAttribute name = Attribute.name();
        str.hashCode();
        if (!str.equals("NameValue")) {
            if (str.equals("NameValueReset")) {
                return name.withValueReset();
            }
            throw new IllegalArgumentException("Unknown UserProfile type " + str);
        }
        String string = readableMap.getString("value");
        if (string != null) {
            return readableMap.getBoolean("ifUndefined") ? name.withValueIfUndefined(string) : name.withValue(string);
        }
        throw new IllegalArgumentException("Value should not be null");
    }

    private static UserProfileUpdate<?> parseNotificationsEnabled(String str, ReadableMap readableMap) {
        NotificationsEnabledAttribute notificationsEnabled = Attribute.notificationsEnabled();
        str.hashCode();
        if (str.equals("NotificationsEnabledValue")) {
            boolean z = readableMap.getBoolean("value");
            return readableMap.getBoolean("ifUndefined") ? notificationsEnabled.withValueIfUndefined(z) : notificationsEnabled.withValue(z);
        }
        if (str.equals("NotificationsEnabledValueReset")) {
            return notificationsEnabled.withValueReset();
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + str);
    }

    private static UserProfileUpdate<?> parseNumber(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        NumberAttribute customNumber = Attribute.customNumber(string);
        str.hashCode();
        if (str.equals("NumberValueReset")) {
            return customNumber.withValueReset();
        }
        if (str.equals("NumberValue")) {
            double d = readableMap.getDouble("value");
            return readableMap.getBoolean("ifUndefined") ? customNumber.withValueIfUndefined(d) : customNumber.withValue(d);
        }
        throw new IllegalArgumentException("Unknown UserProfile type " + str);
    }

    private static UserProfileUpdate<?> parseString(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        StringAttribute customString = Attribute.customString(string);
        str.hashCode();
        if (!str.equals("StringValue")) {
            if (str.equals("StringValueReset")) {
                return customString.withValueReset();
            }
            throw new IllegalArgumentException("Unknown UserProfile type " + str);
        }
        String string2 = readableMap.getString("value");
        if (string2 != null) {
            return readableMap.getBoolean("ifUndefined") ? customString.withValueIfUndefined(string2) : customString.withValue(string2);
        }
        throw new IllegalArgumentException("Value should not be null");
    }
}
