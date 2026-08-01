package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3186d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3188b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3189c;

    public y(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f3186d.matcher(str3).matches()) {
            a1.e(n0.l.g("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f3187a = str3;
        this.f3188b = str;
        this.f3189c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3187a.equals(yVar.f3187a) && this.f3188b.equals(yVar.f3188b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3188b, this.f3187a});
    }
}
