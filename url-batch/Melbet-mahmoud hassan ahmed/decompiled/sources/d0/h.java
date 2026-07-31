package d0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15478a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e7) {
            j.c().b(f15478a, "Trouble instantiating + " + str, e7);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> list);
}
