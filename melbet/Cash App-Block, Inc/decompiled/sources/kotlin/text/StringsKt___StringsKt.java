package kotlin.text;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.SlidingWindowKt;
import kotlin.random.Random;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static boolean any(CharSequence charSequence) {
        return !(charSequence.length() == 0);
    }

    public static ArrayList chunked(int i, CharSequence charSequence) {
        charSequence.getClass();
        InstantKt$$ExternalSyntheticLambda0 instantKt$$ExternalSyntheticLambda0 = new InstantKt$$ExternalSyntheticLambda0(20);
        SlidingWindowKt.checkWindowSizeStep(i, i);
        int length = charSequence.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            arrayList.add(instantKt$$ExternalSyntheticLambda0.invoke(charSequence.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3)));
            i2 = i3;
        }
        return arrayList;
    }

    public static String drop(int i, String str) {
        str.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String dropLast(int i, String str) {
        str.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return take(length, str);
    }

    public static char first(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Char sequence is empty.");
        return (char) 0;
    }

    public static Character firstOrNull(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character getOrNull(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char last(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Char sequence is empty.");
        return (char) 0;
    }

    public static char random(String str, Random.Default r2) {
        r2.getClass();
        if (str.length() != 0) {
            return str.charAt(Random.defaultRandom.nextInt(str.length()));
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Char sequence is empty.");
        return (char) 0;
    }

    public static StringBuilder reversed(CharSequence charSequence) {
        charSequence.getClass();
        return new StringBuilder(charSequence).reverse();
    }

    public static char single(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Char sequence is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return str.charAt(0);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Char sequence has more than one element.");
        return (char) 0;
    }

    public static CharSequence take(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String takeLast(int i, String str) {
        str.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static String take(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
        return null;
    }
}
