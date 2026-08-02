package com.startapp.sdk.adsbase;

import java.io.Serializable;

/* loaded from: classes.dex */
public class SDKAdPreferences implements Serializable {
    private static final long serialVersionUID = 2055046185195723724L;
    private Gender gender = null;
    private String age = null;

    public enum Gender {
        MALE("m"),
        FEMALE("f");

        private final String gender;

        Gender(String str) {
            this.gender = str;
        }

        public static Gender parseString(String str) {
            for (Gender gender : values()) {
                if (gender.getGender().equals(str)) {
                    return gender;
                }
            }
            return null;
        }

        public String getGender() {
            return this.gender;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.gender;
        }
    }

    public String getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public SDKAdPreferences setAge(int i4) {
        this.age = Integer.toString(i4);
        return this;
    }

    public SDKAdPreferences setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String toString() {
        return super.toString();
    }

    public SDKAdPreferences setAge(String str) {
        this.age = str;
        return this;
    }
}
