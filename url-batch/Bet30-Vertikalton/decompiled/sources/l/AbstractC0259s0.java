package l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: l.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0259s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3054a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f3054a = field;
    }
}
