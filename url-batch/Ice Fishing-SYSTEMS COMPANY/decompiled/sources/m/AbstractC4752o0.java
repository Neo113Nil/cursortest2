package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: m.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4752o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f39466a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f39466a = field;
    }
}
