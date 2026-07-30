package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4422d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4424b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4425c;

    public D(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f4422d.matcher(str3).matches()) {
            throw new IllegalArgumentException(r4.f.d("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f4423a = str3;
        this.f4424b = str;
        this.f4425c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        return this.f4423a.equals(d7.f4423a) && this.f4424b.equals(d7.f4424b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4424b, this.f4423a});
    }
}
