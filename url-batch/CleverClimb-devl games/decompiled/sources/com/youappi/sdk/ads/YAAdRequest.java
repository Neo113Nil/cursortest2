package com.youappi.sdk.ads;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class YAAdRequest {
    private static final String TAG = "YAAdRequest";
    private Integer age;
    private final Map<String, String> customParams = new HashMap();
    private Gender gender;

    public enum Gender {
        Male,
        Female
    }

    public YAAdRequest addCustomParam(String str, String str2) {
        if (this.customParams.size() <= 20) {
            this.customParams.put(str, str2);
        } else {
            Log.w(TAG, "Too many custom parameters. Custom parameter was not added.");
        }
        return this;
    }

    public Integer getAge() {
        return this.age;
    }

    public Map<String, String> getCustomParams() {
        if (this.customParams.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableMap(this.customParams);
    }

    public Gender getGender() {
        return this.gender;
    }

    public YAAdRequest setAge(int i) {
        this.age = Integer.valueOf(i);
        return this;
    }

    public YAAdRequest setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}
