package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f6154a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f6154a = field;
    }
}
