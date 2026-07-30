package com.crrepa.band.my.model.user.provider;

/* loaded from: classes2.dex */
public class UserRecommendSleepTimeProvider {
    public static int getRecommendSleepTime() {
        int userAge = UserAgeProvider.getUserAge();
        if (userAge <= 2) {
            return 12;
        }
        if (userAge <= 5) {
            return 11;
        }
        if (userAge <= 13) {
            return 10;
        }
        if (userAge <= 17) {
            return 9;
        }
        return userAge <= 64 ? 8 : 7;
    }
}
