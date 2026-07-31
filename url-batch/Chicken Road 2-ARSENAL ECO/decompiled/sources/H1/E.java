package H1;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f889d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f891b;

    /* renamed from: c, reason: collision with root package name */
    public final String f892c;

    public E(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f889d.matcher(str3).matches()) {
            throw new IllegalArgumentException(W4.o.e("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f890a = str3;
        this.f891b = str;
        this.f892c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        return this.f890a.equals(e4.f890a) && this.f891b.equals(e4.f891b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f891b, this.f890a});
    }
}
