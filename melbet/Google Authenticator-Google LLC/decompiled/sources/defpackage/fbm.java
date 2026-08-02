package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbm {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new gzl("+").c(list));
    }
}
