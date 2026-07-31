package M1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f3465a;

    static {
        new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
        f3465a = new SimpleDateFormat("d MMM, HH:mm", Locale.getDefault());
    }

    public static final String a(double d3) {
        return String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
    }
}
