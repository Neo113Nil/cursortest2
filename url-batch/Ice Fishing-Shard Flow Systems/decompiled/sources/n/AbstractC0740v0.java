package n;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: n.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0740v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f6913a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f6913a = field;
    }
}
