package n;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: n.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3718a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f3718a = field;
    }
}
