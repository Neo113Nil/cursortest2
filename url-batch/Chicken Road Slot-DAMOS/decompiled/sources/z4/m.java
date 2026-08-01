package z4;

import android.content.Context;
import kotlin.text.StringsKt;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m {
    public static final r a(Context context, Class cls, String str) {
        context.getClass();
        if (StringsKt.r(str)) {
            a1.e("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new r(context, cls, str);
        }
        a1.e("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final long b(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }
}
